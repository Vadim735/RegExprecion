package ru.sendto.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

@Data
@JsonTypeName("RREx")
public class DtoRequestRegExp extends Dto{

	String regexp;
	String text;
	
}
