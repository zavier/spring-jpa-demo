package study.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import study.config.JpaConfig;
import study.domain.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {JpaConfig.class})
public class CustomerRepositoryTest {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void test() {
		Customer customer1 = customerRepository.findOne(1L);
		Customer customer2 = customerRepository.findOne(2L);
		System.out.println(customer1);
		System.out.println(customer2);
	}
}
