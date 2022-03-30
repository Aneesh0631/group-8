package fir.spr.post.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fir.spr.post.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	

}