package aula05.classesmetodosatributos.exemplo02.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public void atualizarProduct(){
        System.out.println("Product data: " + toString());
    }

    public void atulizarUpdaded(){
        System.out.println("Updaded data: " + toString());
    }
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public  void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
