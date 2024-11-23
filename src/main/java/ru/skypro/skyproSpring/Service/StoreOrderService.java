package ru.skypro.skyproSpring.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import ru.skypro.skyproSpring.Interface.StoreOrderServiceInterface;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@SessionScope
public class StoreOrderService implements StoreOrderServiceInterface {

    private final Set<Integer> productIds;

    public StoreOrderService() {
        this.productIds = new HashSet<>();
    }

    public Set<Integer> getProductIds() {
        return productIds;
    }

    public void addProductIds(List<Integer> productIds) {
        this.productIds.addAll(productIds);
    }
}
