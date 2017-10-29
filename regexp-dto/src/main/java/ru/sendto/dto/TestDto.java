package ru.sendto.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sendto.dto.Dto;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonTypeName("test")
public class TestDto extends Dto{
	String test;
}
