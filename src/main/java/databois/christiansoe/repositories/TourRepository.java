package databois.christiansoe.repositories;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import databois.christiansoe.entity.Tour;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
@EnableEncryptableProperties

public interface TourRepository extends CrudRepository<Tour, Integer> {
}
