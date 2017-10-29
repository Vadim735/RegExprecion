package ru.sendto.dto;

import java.util.List;

import org.fusesource.restygwt.client.Json;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

@Data
@JsonTypeName("RREx")
public class DtoRequestRegExp extends Dto{

	String regexp;
	String text;
	
}
