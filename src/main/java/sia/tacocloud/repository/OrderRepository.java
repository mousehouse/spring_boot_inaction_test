package sia.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.domain.Order;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByZip(String deliveryZip);

    List<Order> readOrdersByZipAndPlacedAtBetween(
            String zip, Date startDate, Date endDate
    );
}
