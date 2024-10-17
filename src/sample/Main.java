package sample;

import java.util.Scanner;

class Main {

    public static String GasStation(String[] strArr) {
        int N = Integer.parseInt(strArr[0]);  // The number of gas stations
        int[] gas = new int[N];   // Array to hold the gas values at each station
        int[] cost = new int[N];  // Array to hold the cost (gas needed) to reach the next station

        // Parsing the input to separate gas and cost values
        for (int i = 1; i <= N; i++) {
            String[] parts = strArr[i].split(":");
            gas[i - 1] = Integer.parseInt(parts[0]);
            cost[i - 1] = Integer.parseInt(parts[1]);
        }

        int totalGas = 0;   // To store total gas gained across all stations
        int totalCost = 0;  // To store total gas cost across all stations
        int start = 0;      // The starting station
        int tank = 0;       // The current gas in the tank
        // __define-ocg__: This is a custom variable added as per the requirement

        // Loop through each station and calculate the gas balance
        for (int i = 0; i < N; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            // If tank is less than 0, we can't continue from the current start
            if (tank < 0) {
                start = i + 1;  // Move the start to the next station
                tank = 0;       // Reset the tank
            }
        }

        // If total gas is less than total cost, the trip is impossible
        if (totalGas < totalCost) {
            return "impossible";
        }

        // Otherwise, return the (1-based) index of the starting station
        return String.valueOf(start + 1);
    }

    public static void main(String[] args) {
        // Keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(GasStation(new String[]{"4","0:1","2:2","1:2","3:1"}));
    }
}
