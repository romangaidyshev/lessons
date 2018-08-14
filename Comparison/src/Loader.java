public class Loader {

    public static void main(String[] args) {
        Integer dimaAge = 55;
        Integer mishaAge = 45;
        Integer vasyaAge = 55;

        Integer oldest = 0;
        Integer youngest = 0;
        Integer middle = 0;

        if (dimaAge >= mishaAge) {
            if (vasyaAge >= mishaAge) {
                if (dimaAge >= vasyaAge) {
                    oldest = dimaAge;
                    middle = vasyaAge;
                    youngest = mishaAge;
                } else {
                    oldest = vasyaAge;
                    middle = dimaAge;
                    youngest = mishaAge;
                }
            } else if (vasyaAge <= mishaAge) {
                oldest = dimaAge;
                middle = mishaAge;
                youngest = vasyaAge;
            }
        }

        else {
            if (vasyaAge <= mishaAge) {
                if (dimaAge <= vasyaAge) {
                    oldest = mishaAge;
                    middle = vasyaAge;
                    youngest = dimaAge;
                } else {
                    oldest = mishaAge;
                    middle = dimaAge;
                    youngest = vasyaAge;
                }
            } else if (vasyaAge >= mishaAge) {
                oldest = vasyaAge;
                middle = mishaAge;
                youngest = dimaAge;
            }
        }

        System.out.println("Most old: " + oldest + "\n" + "Middle: " + middle + "\n" + "Most young: " + youngest);
    }
}

