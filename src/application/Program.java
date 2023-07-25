package application;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
//import model.dao.SellerDao;
import model.entities.Department;
//import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      //SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        /* System.out.println("===TEST 1===");
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

        System.out.println("===TEST 5===");
        seller = sellerDao.findById(1);
        seller.setName("Samuell Carlos");
        sellerDao.update(seller);
        System.out.println("Update completed !");

        System.out.println("===TEST 6===");
        System.out.println("Enter id for delete: ");
        int id = sc.nextInt();
        sellerDao.delete(id);
        System.out.println("Delete completed"); */

        System.out.println("===TEST 7===");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);
        System.out.println();

        System.out.println("===TEST 8===");
        Department newDep = new Department(null, "Music");
        departmentDao.insert(newDep);
        System.out.println("Inserido! New id: " + newDep.getId());

        System.out.println("===TEST 9===");
        newDep.setName("Materials");
        departmentDao.update(newDep);
        System.out.println("Update completed!"); 

        System.out.println("===TEST 10===");
        System.out.println("Enter id for delete: ");
        int id = sc.nextInt();
        departmentDao.delete(id);
        System.out.println("Delete completed"); 

        List<Department> list = new ArrayList<>();
        System.out.println();
        System.out.println("===TEST 3===");
        list = departmentDao.findAll();
        for (Department obj : list) {
        System.out.println(obj);
        System.out.println("-----------");
        }
        sc.close();
    }
}