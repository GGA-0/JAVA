public class Weapons {
    public static int x = 1;

    public static int getMin(int weapon){
        switch (weapon) {
            case 1:
                return 1;

            case 2:
                return 3;

            case 3:
                return 6;
            
            case 4:
                return 9;
        
            default:
                return 0;
        }
    }
    public static int getMax(int weapon){
        switch (weapon) {
            case 1:
                return 5;

            case 2:
                return 15;

            case 3:
                return 20;

            case 4:
                return 25;
        
            default:
                return 0;
        }
    }
    public static String getWeaponName(int weapon){
        switch (weapon) {
            case 1:
                return "Dagger";

            case 2:
                return "Sword";

            case 3:
                return "Long Sword";

            case 4:
                return "Heavy Hammer";
        
            default:
                return "";
        }
    }
}
