package guru.springframework.repositories;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by jt on 6/13/17.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {



    Optional<UnitOfMeasure> findByDescription(String description);

}