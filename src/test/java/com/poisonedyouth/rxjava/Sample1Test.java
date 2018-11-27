package com.poisonedyouth.rxjava;

import com.poisonedyouth.rxjava.model.Person;
import io.reactivex.Observable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsNull.notNullValue;

class Sample1Test {


	@Test
	public void getPersons() {
		// given:
		List<Person> results = new ArrayList<>();
		Observable<Person> observable = Sample1.getPersons();

		// when:
		observable.subscribe(results::add);

		// then:
		assertThat(results, notNullValue());
		assertThat(results, hasSize(3));
	}
}