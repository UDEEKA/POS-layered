/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao;

import pos.layered.dao.Custom.impl.CustomerDaoimpl;

/**
 *
 * @author user
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    

    public static  DaoFactory  getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();


        }
        
        return daoFactory;
    }
    public SuperDao getDao(DaoTypes type){
        switch (type){
            case CUSTOMER:
            return new CustomerDaoimpl();
            default:
            return null;
        }
    }
    public enum DaoTypes{
        CUSTOMER
    }
}
