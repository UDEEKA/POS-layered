/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import pos.layered.dto.CustomerDto;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.custom.CustomerService;

/**
 *
 * @author user
 */
public class CutomerServiceImpl implements CustomerService {
    
    CustomerDao customerDao = 

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        
        CustomerEntity ce =  new CustomerEntity(dto.getId(), 
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(), 
                dto.getCity(), 
                dto.getProvince(), 
                dto.getZip());
        
        return null; }
    
}
