package com.patterproject.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patterproject.DMS.Models.Dog;
/**
 * 
 * @author s549879 vamsi krishna kolusu
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}