package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    //dessa forma o programa não conhece a implementação, apenas a interface (SellerDao)
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.criaConnection());
    }
}
