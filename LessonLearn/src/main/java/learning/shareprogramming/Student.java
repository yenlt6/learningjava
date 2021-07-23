package learning.shareprogramming;


    public class Student {
        private String name;
        private Address address;

        public Student(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public Address getAddress() {
            return address;
        }

        public String getName() {
            return name;
        }
    }
