package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===TEST 1===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();

        System.out.println("===TEST 2===");
        Department departement = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(departement);
        for (Seller obj : list) {
            System.out.println(obj);
            System.out.println();
        }

        System.out.println();
        System.out.println("===TEST 3===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
            System.out.println("-----------");
        }

        System.out.println("===TEST 4===");
        Seller newSeller = new Seller(null, "Pamela", "pamiranda18@gmail.com", new Date(), 1000.00, departement);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id: " + newSeller.getId());

    }
}