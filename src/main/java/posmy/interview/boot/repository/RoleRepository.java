package posmy.interview.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import posmy.interview.boot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
