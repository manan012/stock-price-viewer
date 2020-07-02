package com.stock.dbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import com.stock.dbservice.model.Quote;
import com.stock.dbservice.repository.QuotesRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {
    
    private QuotesRepository quotesRepository;

    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable("username") final String username) {
        
        return quotesRepository.findByUserName(username)
        .stream()
        .map(Quote::getQuote)
        .collect(Collectors.toList());
    }

}