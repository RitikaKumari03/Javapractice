package org.example.Encapsulation;

public class Identification {
    int identificationNumber;
    String identificationType;

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "identificationNumber=" + identificationNumber +
                ", identificationType='" + identificationType + '\'' +
                '}';
    }
}