package com.stock.dbservice.repository;

import java.util.List;

import com.stock.dbservice.model.Quote;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {

	List<Quote> findByUserName(String username);

}
