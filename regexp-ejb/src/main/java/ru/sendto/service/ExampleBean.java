/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sendto.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

import ru.sendto.dto.DtoExample;
import ru.sendto.dto.ErrorDto;
import ru.sendto.ejb.interceptor.BundleResult;

/**
 * 
 * @author Lev Nadeinsky
 * @date	2017-06-05
 */
@Stateless
@LocalBean
public class ExampleBean {
	
	@BundleResult
	public DtoExample test(@Observes DtoExample dto){
		return new DtoExample().setTest("response");
	}
	

	@BundleResult
	public ErrorDto fail(@Observes DtoExample dto){
		return new ErrorDto().setError("not implemented");
	}
}
