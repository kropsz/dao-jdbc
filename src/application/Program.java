package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(24, "Pedro", "pedroesteve@gmail.com", new Date(), 3000.0, obj);
    }
}