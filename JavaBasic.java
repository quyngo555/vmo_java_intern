import java.util.Arrays;

public class JavaBasic {
    /*
    - Quy tắc đặt tên biến
        +Chỉ được bắt đầu bằng một ký tự(chữ), hoặc một dấu gạch dưới(_), hoặc một ký tự dollar($)
        +Tên biến không được chứa khoảng trắng
        +Bắt đầu từ ký tự thứ hai, có thể dùng ký tự(chữ), dấu gạch dưới(_), hoặc ký tự dollar($)
        +Không được trùng với các từ khóa
        +Có phân biệt chữ hoa và chữ thường
    * */
    // có 3 loại biến trong java: static, instance, local
    public static float PI = 3.14f;   // Đây là biến static
    /*
    *- Biến static được khai báo trong một class với từ khóa "static", phía bên ngoài các phương thức, constructor và block.
    - Sẽ chỉ có duy nhất một bản sao của các biến static được tạo ra, dù bạn tạo bao nhiêu đối tượng từ lớp tương ứng.
    - Biến static được lưu trữ trong bộ nhớ static riêng.
    - Biến static được tạo khi chương trình bắt đầu chạy và chỉ bị phá hủy khi chương trình dừng.
    - Giá trị mặc định của biến static phụ thuộc vào kiểu dữ liệu bạn khai báo tương tự biến instance.
    - Biến static được truy cập thông qua tên của class chứa nó, với cú pháp: TenClass.tenBien.
    - Trong class, các phương thức sử dụng biến static bằng cách gọi tên của nó khi phương thức đó cũng được khai báo với từ khóa "static".*/
    int n;                            // Đây là biến instance
    /*
    * -Biến instance được khai báo trong một lớp(class), bên ngoài các phương thức, constructor và các block.
    - Biến instance được lưu trong bộ nhớ heap.
    - Biến instance được tạo khi một đối tượng được tạo bằng việc sử dụng từ khóa “new” và sẽ bị phá hủy khi đối tượng bị phá hủy.
    - Biến instance có thể được sử dụng bởi các phương thức, constructor, block, ... Nhưng nó phải được sử dụng thông qua một đối tượng cụ thể.
    - Bạn được phép sử dụng "access modifier" khi khai báo biến instance, mặc định là "default".
    - Biến instance có giá trị mặc định phụ thuộc vào kiểu dữ liệu của nó. Ví dụ nếu là kiểu int, short, byte thì giá trị mặc định là 0, kiểu double thì là 0.0d, ... Vì vậy, bạn sẽ không cần khởi tạo giá trị cho biến instance trước khi sử dụng.
    - Bên trong class mà bạn khai báo biến instance, bạn có thể gọi nó trực tiếp bằng tên khi sử dụng ở khắp nới bên trong class đó.*/
    public void Bien () {
        char c = 'c';                 // Đây là biến local
    }
    /*
    * -Biến local được khai báo trong các phương thức, hàm contructor hoặc trong các block.
      -Biến local được tạo bên trong các phương thức, contructor, block và sẽ bị phá hủy khi kết thúc các phương thức, contructor và block.
      -Không được sử dụng "access modifier" khi khai báo biến local.
      -Các biến local được lưu trên vùng nhớ stack của bộ nhớ.
      -Bạn cần khởi tạo giá trị mặc định cho biến local trước khi có thể sử dụng.*/

    // các kiểu dữ liệu trong java
    /*
    * - Kiểu dữ liệu Primitive (kiểu dữ liệu gốc)
    * + byte: Dùng để lưu dữ liệu kiểu số nguyên có kích thước một byte (8 bít). Phạm vi biểu diễn giá trị từ -128 đến 127. Giá trị mặc định là 0.
    * + boolean: Dùng để lưu dữ liệu kiểu kí tự hoặc số nguyên không âm có kích thước 2 byte (16 bít). Phạm vi biểu diễn giá trị từ 0 đến u\ffff. Giá trị mặc định là 0.
    * + short: Dùng để lưu dữ liệu chỉ có hai trạng thái đúng hoặc sai (độ lớn chỉ có 1 bít). Phạm vi biểu diễn giá trị là {“True”, “False”}. Giá trị mặc định là False.
    * + int: 	Dùng để lưu dữ liệu có kiểu số nguyên, kích cỡ 4 byte (32 bít). Phạm vi biểu diễn giá trị từ -2,147,483,648 đến 2,147,483,647. Giá trị mặc định là 0.
    * + long: Dùng để lưu dữ liệu có kiểu số nguyên có kích thước lên đến 8 byte. Giá trị mặc định là 0L.
    * + float: Dùng để lưu dữ liệu có kiểu số thực, kích cỡ 4 byte (32 bít). Giá trị mặc định là 0.0F.
    * + double: Dùng để lưu dữ liệu có kiểu số thực có kích thước lên đến 8 byte. Giá trị mặc định là 0.00D
    * - Kiểu dữ liệu Non-primitive (kiểu dữ liệu đối tượng)
    * + String
    * + Array: 	Một mảng của các dữ liệu cùng kiểu.
    * + class: Dữ liệu kiểu lớp đối tượng do người dùng định nghĩa. Chứa tập các thuộc tính và phương thức..
    * + interface: Dữ liệu kiểu lớp giao tiếp do người dùng định nghĩa. Chứa các phương thức của giao tiếp. */
    public static void main(String[] args) {
        // Có hai kiểu mảng trong java: mảng 1 chiều, mảng đa chiều
        //Mảng trong java lưu các phần tử theo chỉ số, chỉ số của phần tử đầu tiên là 0.
        // khai báo mảng và gán giá trị cho mảng
        String[] cars = { "Honda", "BMW", "Ford", "Mazda" };
        int[] myNum = { 40, 30, 20, 10 };
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };// mảng 2 chiều 3 hàng 3 cột và được gắn giá trị
        int arr2[][] = new int[3][3]; // mảng 2 chiều 3 hàng 3 cột
        int []nums = new int [5]; // khai báo mảng số nguyên có 5 phần tử và có giá trị mặc định là 0
        System.out.println(nums[0]); // 0
        System.out.println(cars[0]); // Honda
        // thay thay đổi phần tử trong mảng
        myNum[0] = 50;
        System.out.println("Phần tử của mảng sau khi thay đổi là: " + myNum[0]); // 50
        // để lấy độ dài của mảng ta sử dụng thuộc tính length
        System.out.println("Độ dài của mảng cars là: " + cars.length); // 4
        // Có 2 các để duyệt các phần tử của mảng:Sử dụng vòng lặp for, Sử dụng foreach
        // sử dụng vòng lặp for
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // sử dụng forEach
        for (String car : cars) {
            System.out.println(car);
        }
        // so sánh for với forEach: phương thức foreach dễ viết hơn, nó không yêu cầu bộ đếm (sử dụng thuộc tính length) và nó dễ đọc hơn.
        // có nhiều phương thức sắp xếp mảng có sẵn
        Arrays.sort(myNum); // sử dụng phương thức sort
        for(int i: myNum){
            System.out.print(i + " "); // 10 20 30 50
        }
        // sao chép mảng sử dụng hàm arraycopy có sẵn, ngoài ra còn nhều phương thức khác
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f',
                'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));// caffein
        // Mệnh đề if được sử dụng để kiểm tra giá trị dạng boolean của điều kiện. Khối lệnh sau if được thực thi nếu giá trị của điều kiện là True, nếu sai thì thực thi ở phần else
        boolean condition = true;
        if (condition) {
            // khối lệnh này được thực thi
            // nếu condition = true
        } else {
            // khối lệnh này được thực thi
            // nếu condition = false
        }
        boolean condition1, condition2, condition3;
        condition1 = condition2 = condition3 = true;
        // Mệnh đề if-else-if
        if (condition1) {
            // khối lệnh này được thực thi
            // nếu condition1 là true
        } else if (condition2) {
            // khối lệnh này được thực thi
            // nếu condition2 là true
        }  else if (condition3) {
            // khối lệnh này được thực thi
            // nếu condition3 là true
        }else {
            // khối lệnh này được thực thi
            // nếu tất cả những điều kiện trên là false
        }

        // Mệnh đề Switch-case trong java
        /*
        * switch (bieu_thuc) {
            case gia_tri_1:
                // Khối lệnh 1
                break;  //tùy chọn
            case gia_tri_2:
                // Khối lệnh 2
                break;  //tùy chọn
            ......
            case gia_tri_n:
                // Khối lệnh n
                break;  //tùy chọn
            default:
                // Khối lệnh này được thực thi
                // nếu tất cả các điều kiện trên không thỏa mãn
            }  */
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        } // 20 30 Not in 10, 20 or 30
        // Khi không sử dụng từ khóa 'break' trong mệnh đề switch-case. Điều này có nghĩa là các khối lệnh sau case có giá trị phù hợp sẽ được thực thi.

    }



}
