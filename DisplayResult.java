import java.util.Scanner;
class DisplayResults {

    void printLine(int cols) {
        System.out.print("+----------+");
        for (int j = 0; j < cols; j++) {
            System.out.print("--------+");
        }
        System.out.println("---------+");
    }

    void show(int[][] arr, int[] rowSums, int[] colSums) {

        int rows = arr.length;
        int cols = colSums.length;

        System.out.println("\n2D ARRAY WITH ROW AND COLUMN SUMS:");

        // Header
        printLine(cols);
        System.out.printf("| %8s ", "Row");
        for (int j = 0; j < cols; j++) {
            System.out.printf("| %6s ", "Col " + (j + 1));
        }
        System.out.printf("| %7s |%n", "Row Sum");
        printLine(cols);

        // Each row: label + elements + row sum
        for (int i = 0; i < rows; i++) {
            System.out.printf("| %8s ", "Row " + (i + 1));
            for (int j = 0; j < cols; j++) {
                System.out.printf("| %6d ", arr[i][j]);
            }
            System.out.printf("| %7d |%n", rowSums[i]);
            printLine(cols);
        }

        // Grand total
        int grandTotal = 0;
        for (int i = 0; i < rows; i++) {
            grandTotal += rowSums[i];
        }

        // Column sums row
        System.out.printf("| %8s ", "Col Sum");
        for (int j = 0; j < cols; j++) {
            System.out.printf("| %6d ", colSums[j]);
        }
        System.out.printf("| %7d |%n", grandTotal);
        printLine(cols);

        System.out.println("GRAND TOTAL: " + grandTotal);

        // Duplicate checker
        System.out.println("\nDUPLICATE CHECKER:");
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int value = arr[i][j];
                int count = 0;
                boolean firstOccurrence = true;
                String where = "";

                for (int a = 0; a < rows; a++) {
                    for (int b = 0; b < cols; b++) {
                        if (arr[a][b] == value) {
                            count++;

                            if (a < i || (a == i && b < j)) {
                                firstOccurrence = false;
                            }

                            if (where.length() > 0) {
                                where += ", ";
                            }
                            where += "Row " + (a + 1) + " Col " + (b + 1);
                        }
                    }
                }

                if (count > 1 && firstOccurrence) {
                    found = true;
                    System.out.println("Duplicate found: " + value + " (" + where + ")");
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}
