package labs.lab4.Task1;

class Student {
    private String name;
    private String facultyNumber;

    public Student(String name, String facultyNumber) {
        this.setName(name);
        this.setFacultyNumber(facultyNumber);
    }


    @Override
    public String toString() {
        return "Student: " + name + ", Faculty Number: " + facultyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }
}

// class student with name, and faculty number, constructor, get and set to string method.
// Create class Student Factory with static method create student which has name nad faculty
// number and returns Student object. Не позволявайте Student Да създава, с име или факултетен номер със стойност null.
// Забранете първата буква на името да е малка и факултетния номер да е 10 char.
// За всеки exception създайте customer exception class. В мейн създайте стюдент.