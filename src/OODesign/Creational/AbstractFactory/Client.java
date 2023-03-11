package OODesign.Creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Integer score = 101;
        String course = "cs";
        UniversityAbstractFactory universityAbstractFactory = UniversityAbstractFactory.getCollage(score);
        System.out.println(universityAbstractFactory.getAdmitCard(course).getClass());
        System.out.println(universityAbstractFactory.getFeeCalculator(course).fee());
    }
}
