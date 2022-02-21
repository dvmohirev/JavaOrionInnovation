package homework.Task8.v2;

//Вроде бы v2 лучше, чем v1
//проработать, посмотреть в чем разница

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student("Aleksandr", "Novikov", 19, "IS-1", 1);
        JsonSerializer serializer = new JsonSerializer();
        String jsonFirstStudent = serializer.serializeToJson(firstStudent);
        System.out.println(jsonFirstStudent);

        System.out.println();

        Student secondStudent = new Student("Vladimir", "Eremeev", 22, "T-3", 4, "manager", "Some information about hobbies");
        String jsonSecondStudent = serializer.serializeToJson(secondStudent);
        System.out.println(jsonSecondStudent);

        System.out.println();

        Student thirdStudent = new Student();
        String jsonThirdStudent = serializer.serializeToJson(thirdStudent);
        System.out.println(jsonThirdStudent);

        System.out.println();

        JsonDeserializer deserializer = new JsonDeserializer();
        Object firstDeserializedStudent = deserializer.deserializeFromJson(jsonFirstStudent, Student.class);
        System.out.println(firstDeserializedStudent.toString());

        Object secondDeserializedStudent = deserializer.deserializeFromJson(jsonSecondStudent, Student.class);
        System.out.println(secondDeserializedStudent.toString());

        Object thirdDeserializedStudent = deserializer.deserializeFromJson(jsonThirdStudent, Student.class);
        System.out.println(thirdDeserializedStudent.toString());
    }
}
