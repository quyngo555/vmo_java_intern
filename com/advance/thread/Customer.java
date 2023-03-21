package com.advance.thread;

public class Customer {
    int amount = 10000;
    synchronized void withdraw(int amount) {
        System.out.println("Rút tiền...");

        if (this.amount < amount) {
            System.out.println("Tài khoản không đủ; đợi gửi tiền...");
            try {
                wait();
                //Gọi hàm wait() để đồng bộ hoá đoạn code sau, Thread hiện tại sẽ tạm dừng, rơi vào trạng thái nằm chờ đến khi method notify được gọi.
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("Hoàn thành rút tiền!");
    }
    synchronized void deposit(int amount) {
        System.out.println("Gửi tiền...");
        this.amount += amount;
        System.out.println("Hoàn thành gửi tiền!");
        notify();// sau khi hàm deposit chạy xong notify se đánh  thức hàm withdraw

    }
}
