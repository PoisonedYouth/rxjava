package com.poisonedyouth.rxjava;

import com.poisonedyouth.rxjava.model.Person;
import io.reactivex.Observable;

import java.util.UUID;

public class Sample1 {

	public static Observable<Person> getPersons() {
		return Observable.just(
				createPerson("Max", "Mustermann", 34),
				createPerson("John", "Doe", 31),
				createPerson("Maria", "O'Kelly", 12));
	}

	private static Person createPerson(String firstname, String lastname, int age) {
		Person person = new Person();
		person.setUuid(UUID.randomUUID());
		person.setFirstname(firstname);
		person.setLastname(lastname);
		person.setAge(age);
		return person;
	}
}
