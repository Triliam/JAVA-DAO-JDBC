package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Livros");
        Seller seller = new Seller(21,"Tais", "t@gmail.com", new Date(), 4.000, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao(); //apenas a interface, podendo chamar qualquer implementação que esteja nela

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Test 1: seller findByid ---");
        Seller seller1 = sellerDao.findById(3);
        System.out.println(seller1);

        System.out.println("--- Test 2: seller findByDepartment ---");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj1 : list) {
            System.out.println(obj1);
        }

        System.out.println("--- Test 3: seller findByDepartment ---");

        List<Seller> list1 = sellerDao.findAll();
        for(Seller obj2 : list1) {
            System.out.println(obj2);
        }

        System.out.println("--- Test 4: seller insert ---");
        Seller seller2 = new Seller(null, "Joice", "j@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(seller2);
        System.out.println(seller2 + " New Id: " + seller2.getId());

        System.out.println("--- Test 5: seller update ---");
        seller2 = sellerDao.findById(15);
        seller2.setName("Joice JJ");
        sellerDao.update(seller2);
        System.out.println("Update");

        System.out.println("--- Test 6: seller delete ---");
        System.out.println("Enter id for delete: ");
        int id = scan.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deleted");

        scan.close();
    }
}
