package learning.shareprogramming;

public class Address {
    private String city;
    private String district;
    private int number;

    public Address(String city, String district, int number) {
        this.city = city;
        this.district = district;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", number=" + number +
                '}';
    }
}