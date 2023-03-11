package OODesign.Creational.AbstractFactory.PrivateUniversity;

import OODesign.Creational.AbstractFactory.AdmitCard;
import OODesign.Creational.AbstractFactory.FeeCalculator;
import OODesign.Creational.AbstractFactory.PrivateUniversity.AdmitCard.HarvardAdmitCard;
import OODesign.Creational.AbstractFactory.PrivateUniversity.AdmitCard.MITAdmitCard;
import OODesign.Creational.AbstractFactory.PrivateUniversity.FeeCalculator.HarvardFeeCalculator;
import OODesign.Creational.AbstractFactory.PrivateUniversity.FeeCalculator.MITFeeCalculator;
import OODesign.Creational.AbstractFactory.UniversityAbstractFactory;

public class PrivateUniversity extends UniversityAbstractFactory {

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course) {
            case "cs" : {
                return new HarvardAdmitCard();
            }
            default: {
                return new MITAdmitCard();
            }
        }
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course) {
            case "cs" : {
                return new HarvardFeeCalculator();
            }
            default: {
                return new MITFeeCalculator();
            }
        }
    }
}
