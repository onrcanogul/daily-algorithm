package challanges.day2;

public class BuildTowerProblem {
    //Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.
    //
    //For example, a tower with 3 floors looks like this:
    //[
    //  "  *  ",
    //  " *** ",
    //  "*****"
    //]
    public static void main(String[] args) {
        System.out.println(String.join(",", towerBuilder(5)));
    }

    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 1; i <= nFloors; i++) {
             int stars = 2 * i - 1;
             int spaces = (2 * nFloors - 1 - stars) / 2;
             tower[i - 1] = " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces);
        }
        return tower;
    }
}
