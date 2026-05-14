import java.util.Scanner;
public class BTLabOOPTinhTienDien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        double kwDien;
        System.out.print("So Kw dien da dung la: ");
        kwDien = input.nextDouble();

        customer.setkWdien(kwDien);
        customer.display();
        input.close();
    }    
}

class Customer {
    //Khoi tao thuoc tinh
    private double kWdien;

    public void setkWdien(double kWdien) {
        this.kWdien = kWdien;
    }

    public double getkWdien() {
        return kWdien;
    }

    public double tinhTiendien() {
        int giakWdien = 0;
        if (getkWdien() <= 100) {giakWdien = 450;}
        else if (getkWdien() <= 200) {giakWdien = 600;}
        else if (getkWdien() <= 300) {giakWdien = 750;}
        else if (getkWdien() <= 500) {giakWdien = 900;}
        else if (getkWdien() <= 1000) {giakWdien = 1000;}
        else giakWdien = 1200;
        
        double soTiendien = getkWdien() * giakWdien;
        return soTiendien;
    }

    public void display() {
        System.out.println("So tien dien phai dong truoc VAT la: " + tinhTiendien());
        double VAT = tinhTiendien() / 100 * 10;
        System.out.println("Phi VAT la: " + VAT);
        System.out.println("So tien thuc te phai dong la: " + (tinhTiendien() + VAT));
    }
}