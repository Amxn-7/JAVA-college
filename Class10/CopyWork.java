package Class10;

class Product {
	double price;
	public Product(double price) {
		this.price=price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "price"+price;
	}
}
class Customer{
	int id;
	String name;
	Product p1;
	public Customer(int id, String name, Product p1) {
		this.id=id;
		this.name=name;
		this.p1=p1;
	}
	public Customer(Customer c1) {
		this.id=c1.id;
		this.name=c1.name;
		this.p1=new Product(c1.p1.price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer[id=" +id+ ", name=" 
				+name +", price=" +p1+ "]";
		}
	
}
public class CopyWork {
	public static void main(String[] args) {
		Product p=new Product(58.25);
		Customer cust1=new Customer(1,"jay",p);
		Customer cust2=new Customer(cust1);
		System.out.println(cust1);
		System.out.println(cust2);
		cust2.p1.price=65.50;
		System.out.println(cust1);
		System.out.println(cust2);
	}
	
}