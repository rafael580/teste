package hotelReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotelReserva.entity.Customer;
import hotelReserva.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
