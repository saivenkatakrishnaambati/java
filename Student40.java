class Student40 {
    String name;
    int age;

    Student40() {
        name = "Unknown";
        age = 0;
    }

    Student40(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student40 s1 = new Student40();
        Student40 s2 = new Student40("Aravind", 19);

        s1.display();
        s2.display();
    }
}