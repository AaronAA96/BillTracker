package aaron.bill.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aaron.bill.tracker.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

}
