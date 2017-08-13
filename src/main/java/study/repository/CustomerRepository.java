package study.repository;

import study.domain.Customer;

public interface CustomerRepository {
	Customer getCustomerById(long id);
}
