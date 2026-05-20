package re.bai1_session04.controller;

import org.springframework.web.bind.annotation.*;
import re.bai1_session04.model.dto.request.OrderRequest;
import re.bai1_session04.model.entity.Order;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @PostMapping
    public Order createOrder(@RequestBody OrderRequest request) {
        Order order = new Order();

        order.setOrderId(UUID.randomUUID().toString());
        order.setCustomerName(request.getCustomerName());
        order.setAddress(request.getAddress());
        order.setProductId(request.getProductId());
        order.setQuantity(request.getQuantity());

        return order;
    }
}