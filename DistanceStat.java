/*
 * @author 6610685247@cn103
 */

import java.util.Scanner;

public class DistanceStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter centre: ");
        int cenX = sc.nextInt();
        int cenY = sc.nextInt();

        System.out.print("Enter other points: ");
        sc.nextLine(); // \n error fix
        String input = sc.nextLine();
        sc.close();
        String[] inputArr = input.split("\\ ");
        double sumDistance = 0;
        double minDistance = 0;
        double maxDistance = 0;
        int pointCounts;

        for (pointCounts = 0; pointCounts < inputArr.length / 2; pointCounts++) {
            double x = Double.parseDouble(inputArr[2 * pointCounts]);
            double y = Double.parseDouble(inputArr[2 * pointCounts + 1]);

            double distance = Math.sqrt((Math.pow(x - cenX, 2) + (Math.pow(y - cenY, 2))));

            sumDistance += distance;

            if (pointCounts == 0) {
                minDistance = distance;
                maxDistance = distance;
            }
            if (distance > maxDistance) {
                maxDistance = distance;
            }
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        double meanDistance = sumDistance / pointCounts;

        System.out.printf("Min distance to (%d, %d) is %.1f\n", cenX, cenY, minDistance);
        System.out.printf("Max distance to (%d, %d) is %.1f\n", cenX, cenY, maxDistance);
        System.out.printf("Mean distance to (%d, %d) is %.1f", cenX, cenY, meanDistance);
    }
}
