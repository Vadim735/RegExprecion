package ru.sendto.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

@Data
@JsonTypeName ("RsREx")
public class DtoResponceREx extends Dto {
   Integer  groupId;
	String name;
	String text;
}
