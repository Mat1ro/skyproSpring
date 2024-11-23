package ru.skypro.skyproSpring.Interface;

import java.util.List;
import java.util.Set;

public interface StoreOrderServiceInterface {
    Set<Integer> getProductIds();

    void addProductIds(List<Integer> productIds);
}
