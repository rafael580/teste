package hotelReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import hotelReserva.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	@Query(value = "SELECT * FROM table_custumer c where (c.email = :email AND c.password= :password)", nativeQuery = true)
	public Customer findUserByUsernameAndPassword(@Param(value = "email") String email,
			@Param(value = "password") String password);
}
