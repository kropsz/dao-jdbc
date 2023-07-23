package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    private static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }

}