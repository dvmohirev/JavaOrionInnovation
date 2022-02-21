package homework.Task8.v2;

public class Student {
    @JsonName("first_name")
    String firstName;

    @JsonName("last_name")
    String lastName;

    @JsonName("age")
    double age;

    @JsonName("group")
    String group;

    @JsonName("course")
    double course;

    @JsonIgnore
    String qualification;

    @JsonIgnore
    String additionalInformation;

    public Student() {
        firstName = "Maria";
        lastName = "Andreeva";
        age = 18d;
        group = "IS-3";
        course = 3d;
        qualification = "programmer";
        additionalInformation = "Some information about being foreign student";
    }

    public Student(String firstName, String lastName, int age, String group, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
        this.course = course;
    }

    public Student(String firstName, String lastName, int age, String group, int course, String qualification, String additionalInformation) {
        this(firstName, lastName, age, group, course);
        this.qualification = qualification;
        this.additionalInformation = additionalInformation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public double getCourse() {
        return course;
    }

    public String getQualification() {
        return qualification;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", group='").append(group).append('\'');
        sb.append(", course=").append(course);
        sb.append(", qualification='").append(qualification).append('\'');
        sb.append(", additionalInformation='").append(additionalInformation).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
