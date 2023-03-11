package OODesign.Creational.AbstractFactory;

import OODesign.Creational.AbstractFactory.PrivateUniversity.PrivateUniversity;
import OODesign.Creational.AbstractFactory.PublicUniversity.PublicUniversity;

public abstract class UniversityAbstractFactory {
    private static Integer CUTOFF_SCORE = 100;

    public static UniversityAbstractFactory getCollage(Integer score) {
        if (score > CUTOFF_SCORE) {
            return new PrivateUniversity();
        } else {
            return new PublicUniversity();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);
    public abstract FeeCalculator getFeeCalculator(String course);
}
