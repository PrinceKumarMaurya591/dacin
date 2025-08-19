package com.dacinc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dacinc.entity.Vehicle;
import com.dacinc.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    
    @Autowired
    private VehicleService vehicleService;
    
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return ResponseEntity.ok(vehicleService.findAll());
    }
    
    @GetMapping("/premium")
    public ResponseEntity<List<Vehicle>> getPremiumDealerVehicles() {
        return ResponseEntity.ok(vehicleService.findByPremiumDealers());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long id) {
        return ResponseEntity.ok(vehicleService.findById(id));
    }
    
    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@Validated @RequestBody Vehicle vehicle) {
        return new ResponseEntity<>(vehicleService.save(vehicle), HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> updateVehicle(@PathVariable Long id, @Validated @RequestBody Vehicle vehicle) {
        return ResponseEntity.ok(vehicleService.update(id, vehicle));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
        vehicleService.delete(id);
        return ResponseEntity.noContent().build();
    }
}