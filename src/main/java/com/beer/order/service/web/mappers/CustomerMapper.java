package com.beer.order.service.web.mappers;

import org.mapstruct.Mapper;

import com.beer.order.service.domain.Customer;
import com.brewery.model.CustomerDto;

/**
 * Created by jt on 3/7/20.
 */
@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}
