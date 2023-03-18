import com.internJava.MethodVisibility1;

public class MethodInJava extends MethodVisibility1 {
    /*
    * Một method là một khối mã chỉ chạy khi nó được gọi.
    Bạn có thể truyền dữ liệu, được gọi là tham số, vào một method.
    Các method được sử dụng để thực hiện một số hành động nhất định và chúng còn được gọi là các hàm.
    Sử dụng method giúp chúng ta không phải viết 1 đoạn code lặp lại nhiều lần khi sử dụng chúng.*/
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args) {
        myMethod(); // Outputs "I just got executed!"
        myMethod("Liam", 5);// Liam is 5
        myMethod("Jenny", 8);// Jenny is 8
        myMethod("Anja", 31);// Anja is 31

        MethodInJava methodInJava = new MethodInJava();
        methodInJava.getAddress("hanoi"); // address Hanoi
    }
}
