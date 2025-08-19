package com.dacinc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dacinc.constants.SubscriptionType;
import com.dacinc.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByDealerSubscriptionType(SubscriptionType subscriptionType);
}