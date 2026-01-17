package CoreProgramming.Methods.Level_3;
class EmployeeBonus {

    static int[][] generateEmployeeData() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // salary
            data[i][1] = (int)(Math.random() * 10) + 1; // years
        }
        return data;
    }

    static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = bonus;
            result[i][1] = data[i][0] + bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] emp = generateEmployeeData();
        double[][] bonus = calculateBonus(emp);

        System.out.println("OldSalary\tYears\tBonus\tNewSalary");
        for (int i = 0; i < 10; i++) {
            System.out.println(emp[i][0] + "\t\t" + emp[i][1] + "\t" +
                    bonus[i][0] + "\t" + bonus[i][1]);
        }
    }
}
