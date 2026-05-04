package OOP;



//للوراثة extends
public class FreshProduct extends Product {
    
    // تاريخ الانتهاء 
    private String expiryDate;

    //  (Constructor)
    public FreshProduct(String code, String name, double price, Category category, String expiryDate) {
        // استدعاء (constructor) الكلاس الأساسي (Product) باستخدام super
        super(code, name, price, category);
        this.expiryDate = expiryDate;
    }

    // دالة toString لاظهار تاريخ الانتهاء 
    @Override
    public String toString() {
        //  super.toString() للحصول على بيانات المنتج الأساسية بعدها نضيف التاريخ
        return super.toString() + ", Expiry Date: " + expiryDate;
    }
}
