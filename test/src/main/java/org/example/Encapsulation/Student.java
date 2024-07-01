package org.example.Encapsulation;

public class Student {
    private String name;
    private String rollNumber;
    private Gender gender;
    private Course stream;
    private Identification identification;
    private boolean hostelFacility;
    private int libraryCard;
    private Address address;
    private boolean busFacility;


    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Gender getGender() {
        return gender;}

    public void setGender(Gender gender) {
        this.gender = gender;}

    public Course getStream() {
        return stream;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public void setStream(Course stream) {
        this.stream = stream;
    }

    public boolean isHostelFacility() {
        return hostelFacility;}

    public void setHostelFacility(boolean hostelFacility) {
        this.hostelFacility = hostelFacility;}

    public int getLibraryCard() {
        return libraryCard;}

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isBusFacility() {
        return busFacility;}

    public void setBusFacility(boolean busFacility) {
        this.busFacility = busFacility;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", gender=" + gender +
                ", stream=" + stream +
                ", identification=" + identification +
                ", hostelFacility=" + hostelFacility +
                ", libraryCard=" + libraryCard +
                ", address=" + address +
                ", busFacility=" + busFacility +
                '}';
    }
}
