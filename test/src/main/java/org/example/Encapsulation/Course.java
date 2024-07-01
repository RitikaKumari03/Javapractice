package org.example.Encapsulation;

public class Course {
    String courseName;
    int courseDuration;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public int getCourseDuration() {
        return courseDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                '}';
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;


    }
}
