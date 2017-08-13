package study.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import study.domain.Customer;

@Repository
@Transactional
public class JpaCustomerRepository implements CustomerRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Customer getCustomerById(long id) {
		return em.find(Customer.class, id);
	}

}
