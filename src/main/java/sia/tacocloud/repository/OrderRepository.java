package sia.tacocloud.repository;

import sia.tacocloud.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
