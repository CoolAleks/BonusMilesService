public class BonusMilesService {
    public int calculate(int price, int bonusRate) {
        int bonusMiles = price / bonusRate;
        return bonusMiles;
    }
}
