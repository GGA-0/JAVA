public class Weapons {
    public static int x = 1;

    public static int getMin(String weapon){
        switch (weapon) {
            case "Dagger":
                return 1;
        
            default:
                return 0;
                break;
        }
    }
    public static int getMax(String weapon){
        return 1;
    }
}
