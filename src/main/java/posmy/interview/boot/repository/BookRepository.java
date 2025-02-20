package posmy.interview.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import posmy.interview.boot.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>,
    JpaSpecificationExecutor<Book> {

}
