package OODesign.Creational.AbstractFactory.PrivateUniversity.FeeCalculator;

import OODesign.Creational.AbstractFactory.FeeCalculator;

public class MITFeeCalculator implements FeeCalculator {
    @Override
    public String fee() {
        return "15,000";
    }
}
