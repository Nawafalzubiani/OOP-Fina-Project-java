package OOP;

public class Supermarket {
// مصفوفة لتخزين المنتجات
    private Product[] inventory;

    // عداد لمعرفة عدد المنتجات الحالية
    private int productCount;

    // Constructor لتحديد سعة المخزون
    public Supermarket(int capacity) {

        / إنشاء المصفوفة بالحجم المطلوب
        this.inventory = new Product[capacity];

        // يبدأ المخزون فارغ
        this.productCount = 0;
    }

        
    }

    // إضافة منتج جديد للمخزون
    public void addProduct(Product p) {

        // التأكد أن المصفوفة ليست ممتلئة
        if(productCount < inventory.length) {

            // تخزين المنتج في المكان الحالي
            inventory[productCount] = p;

            // زيادة عدد المنتجات
            productCount++;
      } else {

            System.out.println("Inventory is full. Cannot add more products.");
        }
    
        }
    }

    // البحث عن منتج باستخدام الكود
    public Product searchProduct(String code) {

        // المرور على جميع المنتجات الموجودة
        for(int i = 0; i < productCount; i++) {

            // إذا كان الكود مطابق يرجع المنتج
            if(inventory[i].getCode().equals(code)) {
                return inventory[i];
            }
        }

        // إذا لم يتم العثور على المنتج
        return null;
    }

    // عرض جميع المنتجات الموجودة بالمخزون
    public void displayInventory() {

      // إذا كان المخزون فارغ
        if (productCount == 0) {

            System.out.println("Inventory is currently empty.");
            return;
        }

           // طباعة المنتجات
        for(int i = 0; i < productCount; i++) {

            System.out.println(inventory[i].toString());
        }
    }
       
    // حفظ بيانات المنتجات في ملف
    public void saveToFile(String filename) {

        try (FileWriter writer = new FileWriter(filename)) {

            for (int i = 0; i < productCount; i++) {

                writer.write(inventory[i].toString() + "\n");
            }

            System.out.println("Inventory data saved successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred while saving: " + e.getMessage());

}
