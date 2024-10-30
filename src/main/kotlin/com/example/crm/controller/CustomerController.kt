package com.example.crm.controller


import com.example.crm.dto.CustomerDto
import com.example.crm.entity.Customer
import com.example.crm.service.CustomerService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customers")
class CustomerController {
    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun getCustomers()=customerService.getCustomer()

    @PostMapping
    fun save (@RequestBody @Valid customerDto: CustomerDto): Customer {
        return customerService.save(customerDto)
    }
}