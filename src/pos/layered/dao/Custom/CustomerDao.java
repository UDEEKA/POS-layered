/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.dao.Custom;

import pos.layered.entity.CustomerEntity;

/**
 *
 * @author user
 */
public interface CustomerDao {
    String addCustomer (CustomerEntity customerEntity) throws Exception;
}
