package OOP;

public class Product {
private String code;				// !كود المنتج للبحث
private String name;       			// !اسم المنتج
private double price;     			//السعر ! 
private Category category;    		// !الصنف
//Constructor!       Parameters!
public Product(String code, String name, double price, Category category) {
this.code = code;
this.name = name;
this.price = price;
this.category = category;
//استخدام this! 
}

//overloading!
public Product() {
	this("000","unknown", 0.0, Category.SNACKS);
}
//method with parameters!
public void updatePrice(double newPrice) {
	this.price = newPrice;
}
//get للوصول الى البيانات!
public String getCode() {
	return code;
}

public String getName() {
				return name;
}

public double getPrice() {
				return price;
}
			// تحويل البيانات الى نص مفهوم للمستخدم!
public String toString() {
				return "Product [code=" + code + ", name=" + name + ", price=" + price + ", category=" + category + "]";
}



}
