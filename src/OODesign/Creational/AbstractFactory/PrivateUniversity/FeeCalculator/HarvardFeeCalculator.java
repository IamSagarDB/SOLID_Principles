package OODesign.Creational.AbstractFactory.PrivateUniversity.FeeCalculator;

import OODesign.Creational.AbstractFactory.FeeCalculator;

public class HarvardFeeCalculator implements FeeCalculator {
    @Override
    public String fee() {
        return "10,000";
    }
}
