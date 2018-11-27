package com.poisonedyouth.rxjava.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Person {

	private UUID uuid;
	private String firstname;
	private String lastname;
	private int age;
}
