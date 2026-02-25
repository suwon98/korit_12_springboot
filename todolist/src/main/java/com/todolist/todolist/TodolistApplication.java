package com.todolist.todolist;

import com.todolist.todolist.domain.Todo;
import com.todolist.todolist.domain.TodoRepository;
import com.todolist.todolist.domain.User;
import com.todolist.todolist.domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	private final UserRepository userRepository;
	private final TodoRepository todoRepository;

	public TodolistApplication(UserRepository userRepository, TodoRepository todoRepository) {
		this.userRepository = userRepository;
		this.todoRepository = todoRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("user", "1234", "User");

		userRepository.saveAll(Arrays.asList(user1));

		todoRepository.save(new Todo("123", false, user1));
	}
}
