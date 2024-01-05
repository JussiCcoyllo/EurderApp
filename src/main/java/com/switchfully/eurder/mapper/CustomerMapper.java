package com.switchfully.eurder.mapper;

import com.switchfully.eurder.entity.Customer;
import com.switchfully.eurder.dto.CreateCustomerDto;
import com.switchfully.eurder.dto.CustomerDto;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto mapCustomerToCustomerDto(Customer customer) {
        return new CustomerDto(customer.getId(),
                                customer.getEmail(),
                                customer.getFirstName(),
                                customer.getLastName(),
                                customer.getPhoneNumber(),
                                customer.getAddress() );
    }

    public Customer mapCreateCustomerDtoToCustomer(CreateCustomerDto createCustomerDto) {
        return new Customer(createCustomerDto.getId(),
                                createCustomerDto.getFirstName(),
                                createCustomerDto.getLastName(),
                                createCustomerDto.getEmail(),
                                createCustomerDto.getPassword(),
                                createCustomerDto.getPhoneNumber(),
                                createCustomerDto.getAddress());
    }
}
