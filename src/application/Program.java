package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Livros");
        Seller seller = new Seller(21,"Tais", "t@gmail.com", new Date(), 4.000, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao(); //apenas a interface, podendo chamar qualquer implementação que esteja nela
        Seller seller1 = sellerDao.findById(3);
        System.out.println(seller1);
    }
}
