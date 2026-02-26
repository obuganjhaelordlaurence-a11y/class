public class Student {
  
    private int studentID;
    private String firstName, lastName, email, course, enrollDate;
    private int age, phone, yearLvl;
    private double gpa;


    public Student(int studentID, String firstName, String lastName, int age, String email, 
                   int phone, String course, int year, double gpa, String enrollDate) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.course = course;
        this.yearLvl = year;
        this.gpa = gpa;
        this.enrollDate = enrollDate;
    }

    // Getters
    public int getstudentID() { return studentID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public int getPhone() { return phone; }
    public String getCourse() { return course; }
    public int getYearLvl() { return yearLvl; }
    public double getGpa() { return gpa; }
    public String getEnrollDate() { return enrollDate; }


    public void printInfo() {
        System.out.println("ID: " + studentID + " | Name: " + firstName + " " + lastName + " | GPA: " + gpa);
    }
}
