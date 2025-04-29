package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Livros");
        Seller seller = new Seller(21,"Tais", "t@gmail.com", new Date(), 4.000, obj);
        System.out.println(seller);
    }
}
