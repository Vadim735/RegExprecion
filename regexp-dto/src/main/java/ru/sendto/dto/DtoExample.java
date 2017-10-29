package ru.sendto.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sendto.dto.Dto;

@Data
@EqualsAndHashCode(callSuper=false)
@JsonTypeName("example")
public class DtoExample extends Dto{
	String test;
}
