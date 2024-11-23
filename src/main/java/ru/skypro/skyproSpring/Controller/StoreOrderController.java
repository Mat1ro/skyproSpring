package ru.skypro.skyproSpring.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;
import ru.skypro.skyproSpring.Service.StoreOrderService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/store/order")
@SessionScope
public class StoreOrderController {

    private final StoreOrderService storeOrderService;

    public StoreOrderController(StoreOrderService storeOrderService) {
        this.storeOrderService = storeOrderService;
    }

    @GetMapping("/get")
    public Set<Integer> getStoreOrder() {
        return storeOrderService.getProductIds();
    }

    @GetMapping("/add")
    public String addProducts(@RequestParam("productIds") List<Integer> productIds) {
        storeOrderService.addProductIds(productIds);
        return "success";
    }
}
