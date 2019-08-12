package sia.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
