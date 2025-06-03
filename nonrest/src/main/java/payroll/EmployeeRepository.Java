package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
/*
 * The Employee Repo should allows us to create, update, remove, and find employees.
 * We can extend the JPA Repo class and specify that the domains is our Employee class
 * and our id is our attached long integer
 */
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}