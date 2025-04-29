package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Livros");
        Seller seller = new Seller(21,"Tais", "t@gmail.com", new Date(), 4.000, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao(); //apenas a interface, podendo chamar qualquer implementação que esteja nela

        System.out.println("--- Test 1: seller findByid ---");
        Seller seller1 = sellerDao.findById(3);
        System.out.println(seller1);

        System.out.println("--- Test 2: seller findByDepartment ---");
        Department department = new Department(200, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj1 : list) {
            System.out.println(obj1);
        }

        System.out.println("--- Test 3: seller findByDepartment ---");

        List<Seller> list1 = sellerDao.findAll();
        for(Seller obj2 : list1) {
            System.out.println(obj2);
        }
    }
}
