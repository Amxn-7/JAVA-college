package Class10;

public class CopyConstructor {
    public static void main(String[] args) {
        Address ad = new Address("India");
        Student s1 = new Student(1, "Abhishek", "CSE",ad);
        Student s2 = new Student(s1);
        System.out.println("Before");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("After");
        s2.address.country = "Aust";
        System.out.println(s1);
        System.out.println(s2);

    }
}
class Address{
    String country;

    public Address(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [country=" + country + "]";
    }
    
    
}

class Student {
    int id;
    String name;
    String dept;
    Address address;
    
    public Student(int id, String name, String dept, Address address) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.address=address;
    }

    public Student(Student s1) {
        this.id = s1.id;
        this.name = s1.name;
        this.dept = s1.dept;
        this.address= s1.address;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", dept=" + dept + address + "]";
    }
}