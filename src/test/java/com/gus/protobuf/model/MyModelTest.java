/**
 * 
 */
package com.gus.protobuf.model;

import org.junit.Assert;
import org.junit.Test;

import com.gus.protobuf.model.MyModelProtos.Person;

/**
 * @author gus
 *
 */
public class MyModelTest {

	private static final String NAME = "Gus";
	private static final String LASTNAME = "Vargas";
	private static final String EMAIL = "xxx@gmail.com";
	private static final int ID = 1;
	
	@Test
	public final void buildPerson() {
		Person gus = Person.newBuilder()
				.setId(ID)
				.setName(NAME)
				.setEmail(EMAIL)
				.setLastName(LASTNAME)
				.build();
		
		Assert.assertEquals(NAME, gus.getName());
		Assert.assertEquals(EMAIL, gus.getEmail());
		Assert.assertEquals(LASTNAME, gus.getLastName());
	}
}
