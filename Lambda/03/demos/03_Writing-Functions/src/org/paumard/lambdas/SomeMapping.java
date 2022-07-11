package org.paumard.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.paumard.lambdas.model.User;

public class SomeMapping {

	public static void main(String[] args) {

		User sarah = new User("Sarah");
		User james = new User("James");
		User mary = new User("Mary");
		User john = new User("John");
		
		List<User> users = List.of(sarah, james, mary, john);
		List<String> names = new ArrayList<>();
		Function<User, String> toName = (User user) -> user.getName();
		for (User user : users) {
			String name = toName.apply(user);
			names.add(name);
		}
		users.forEach(u -> System.out.println(u));
		Consumer<String> action = s -> System.out.println(s);
		names.forEach(action);
	}

}
