package learning.shareprogramming;

import java.time.LocalDate;
public class Income {
    private String sender;
    private String receiver;
    private double money;
    private LocalDate date;
    public Income(String sender, String receiver, double money, LocalDate date) {
        this.sender = sender;
        this.receiver = receiver;
        this.money = money;
        this.date = date;
    }
    public String getSender() {
        return sender;
    }
    public String getReceiver() {
        return receiver;
    }
    public double getMoney() {
        return money;
    }
    public LocalDate getDate() {
        return date;
    }
    @Override
    public String toString() {
        return "Income{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", money=" + money +
                ", date=" + date +
                '}';
    }
}