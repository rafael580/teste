package hotelReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import hotelReserva.entity.Admin;
import hotelReserva.entity.Customer;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	@Query(value = "SELECT * FROM table_admin u where (u.email = :email AND u.password= :password)", nativeQuery = true)
	public Admin findUserByUsernameAndPassword(@Param(value = "email") String email,
			@Param(value = "password") String password);
}