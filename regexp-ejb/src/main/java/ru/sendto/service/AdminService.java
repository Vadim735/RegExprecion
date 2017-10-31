package ru.sendto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import lombok.extern.java.Log;
import ru.sendto.dto.DtoRequestRegExp;
import ru.sendto.dto.DtoResponceREx;
import ru.sendto.ejb.interceptor.BundleResult;

@Log
@Stateless
@LocalBean
public class AdminService {

	@BundleResult
	public List<DtoResponceREx> DoRegExpRequest(@Observes DtoRequestRegExp request) throws PatternSyntaxException {
		log.info("running");
		Pattern patern;
		Matcher matcher;
		List<DtoResponceREx> result = new ArrayList<>();
		int grpCount = 0;

		try {
			log.info(request.getRegexp());
			log.info(request.getText());
			patern = Pattern.compile(request.getRegexp());
			matcher = patern.matcher(request.getText());
			if (matcher.find()) {
				grpCount = matcher.groupCount();
				
				if (grpCount != 0) {
					for (int i = 1; i <= grpCount; i++) {
						int tmp = i;
						result = result.stream().map(
								r -> new DtoResponceREx().setGroupId(tmp).setName(null).setText(matcher.group(tmp)))
								.collect(Collectors.toList());
					}
					log.info(result.size()+"<---");
					return result;
				}
			}
			return null;

		} catch (PatternSyntaxException e) {
			return null;
		}

	}
}
