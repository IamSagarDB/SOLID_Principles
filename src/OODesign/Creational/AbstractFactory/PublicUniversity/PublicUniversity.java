package OODesign.Creational.AbstractFactory.PublicUniversity;

import OODesign.Creational.AbstractFactory.AdmitCard;
import OODesign.Creational.AbstractFactory.FeeCalculator;
import OODesign.Creational.AbstractFactory.UniversityAbstractFactory;

public class PublicUniversity extends UniversityAbstractFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        return null;
    }
}
