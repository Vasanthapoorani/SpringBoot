package com.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Vehicle")
public class CarResource {

	@Autowired
	CarRepository repo;
	
	@GetMapping(path="/Car")
	public List<Car> getCars()
	{
		
		return repo.findAll();	
	} 
	
	@GetMapping("/Car/{id}")
	public Optional<Car> getCarsByID(@PathVariable("id") int id)
	{
		
		return repo.findById(id);	
	} 
	
	@PostMapping(path="/Car", consumes= {"application/json"})
	public Car addCars(@RequestBody Car car)
	{
		repo.save(car);
		return car;	
	} 
	
	@PutMapping(path="/Car/{id}", consumes= {"application/json"})
	public Car SaveOrUpdateEmployee(@PathVariable int id, @RequestBody Car car)
	{
		car.setId(id);	
		repo.save(car);
		return car;	
	} 
	
	@DeleteMapping("/Car/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		Car car=repo.getOne(id);
		repo.delete(car);
		return "Deleted";	
	} 
	
}
