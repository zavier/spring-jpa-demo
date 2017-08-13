package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
