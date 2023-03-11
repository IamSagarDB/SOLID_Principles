package OODesign.Creational.AbstractFactory.PublicUniversity.FeeCalculator;

import OODesign.Creational.AbstractFactory.FeeCalculator;

public class PennStateFeeCalculator implements FeeCalculator {
    @Override
    public String fee() {
        return "20,000";
    }
}
