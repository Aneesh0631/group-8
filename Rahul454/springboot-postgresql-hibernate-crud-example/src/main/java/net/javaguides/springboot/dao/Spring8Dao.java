package net.javaguides.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.PracticeRepository;

@Repository
public class Spring8Dao {
	@Autowired
	PracticeRepository repository;

	public Employee postMessage(Employee user) {

		return repository.save(user);
	}

}
