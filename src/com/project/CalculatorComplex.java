package com.project;
/*
        Project Exercise 2 {Procedural Programming}
        Name Project    :   Calculator Complex (Application) 
        Subject         :   1. Type Data Primitive
                            2. Type Data String
                            3. Do While Loop
                            4. Switch Statement
                            5. Type Data not Primitive
                            6. Variables
                            7. Ternary Operator
                            8. Recurrsive Method
                            9. For Loop
                            10. Type Data Array
                            11. Method Return Value
                            12. Operation Mathematics & Comparisons
        
        features        :   1. Main Menu
                            2. Mathematic Basic Operations (+, -, *, /, %)
                            3. Matrix Operations
                            4. Mean Data
                            5. Factorial (n)
                            6. Fibonacci (n)
*/

import java.util.Scanner;

public class CalculatorComplex {
    static int choiceMenu;
    static String[] mainMenu = {"1. Basic Math Operations (+ - x / %)", "2. Matrix Operations", "3. Mean Data", "4. Factorial(n)", "5. Fibonacci(n)", "6. Exit Application"};
    public static void main(String[] args) {
        // This Project is Calculator Complex you can SUM, Divide, Multiplication, or Factorial, Fibonacci, etc.
        Scanner input = new Scanner(System.in);

        System.out.println("\n=========================================================");
        System.out.println("\t    WELCOME TO CALCULATOR APPLICATIONS");
        System.out.println("=========================================================\n");

        do {
            System.out.println("\n=========================================================");
            System.out.println("\t\t\tMAIN MENU");
            System.out.println("=========================================================");
            for (int i = 0; i < mainMenu.length; ++i) {
                System.out.println(mainMenu[i]);
            }
            System.out.println("=========================================================\n");
            System.out.print("Input Your Choice with Number of Menu: ");
            choiceMenu = input.nextInt();

            if (choiceMenu == 6) {
                input.close();
            }

            switch (choiceMenu) {
                case 1 : {
                    boolean Y1 = false;
                    boolean Y2 = false;
                    boolean isFirstOperation = false;
                    double tempResult = 0;

                    do {
                        System.out.println("\n~ BASIC MATH OPERATIONS ~");
                        System.out.println("========================");
                        System.out.print("Input the first number = ");
                        double numMath1 = input.nextDouble(); // --> for user input number that user want to operate
                        System.out.println("------------------------");
    
                        System.out.print("Choose the Operations (* / + - %) = ");
                        String opMath = input.next(); // --> for validate the operate user want to do
                        System.out.println("------------------------");
    
                        System.out.print("Input the second number = ");
                        double numMath2 = input.nextDouble(); // --> number to operate with it

                        do {
                            if (!isFirstOperation) {
                                tempResult = basicMathOperations(numMath1, opMath, numMath2);
                                System.out.println(numMath1 + " " + opMath + " " + numMath2 + " = " + tempResult);
                                isFirstOperation = true;
                            } else if (isFirstOperation) {
                                System.out.println("Previous result = " + tempResult);
                                System.out.print("Choose the Operations (* / + - %) = ");
                                String opMathNext = input.next(); // --> for validate the operate user want to do
                                System.out.println("------------------------");
                                System.out.print("Input the Another number = ");
                                double numMath3 = input.nextDouble(); // --> number to operate with it

                                tempResult = basicMathOperations(tempResult, opMathNext, numMath3);
                                System.out.println(tempResult + " " + opMathNext + " " + numMath3 + " = " + tempResult);
                            } else {
                                System.err.println("\nInput Isn't Valid Type !!\n");
                            }
                            
                            System.out.print("\nDo you want to Continue the Operations with it result? (yes/no) = ");
                            String repeat1 = input.next();
                            if (repeat1.equalsIgnoreCase("yes")) {
                                Y2 = true;
                            } else {
                                break;
                            }
                        } while (Y2);
                        System.out.print("\nDo you want to Operate Again? (yes/no) = ");
                        String repeat2 = input.next();
                        if (repeat2.equalsIgnoreCase("yes")) {
                            isFirstOperation = false;
                            tempResult = 0;
                            Y1 = true;
                        } else {
                            break;
                        }
                    } while (Y1);
                    break;
                }
                case 2 : {
                    int choiceMatrixMenu;
                    int columnA = 0, columnB = 0, rowA = 0, rowB = 0;
                    boolean isMatrix = false;

                    int[][] A = new int[20][20];
                    int[][] B = new int[20][20];
                    int[][] C = new int[20][20];

                    do {
                        System.out.println("\n     ~ MATRIX MENU (Matrix A & B)~");
                        System.out.println("=======================================");
                        String[] matrixMenu = {"1. Input Data Matrix", "2. Matrix Visualization", "3. Matrix Operations", "4. Back to Main Menu"};
                        for (int i = 0; i < matrixMenu.length; ++i) {
                        System.out.println(matrixMenu[i]);
                        }
                        System.out.println("=========================================================\n");
                        System.out.print("Input Your Choice with Number of Matrix Menu: ");
                        choiceMatrixMenu = input.nextInt();

                        switch (choiceMatrixMenu) {
                            case 1 : {
                                System.out.println("\n--> MATRIX A <--");
                                System.out.print("\nHow Much the Column of Matrix\t= ");
                                columnA = input.nextInt();
                                System.out.println();
                                System.out.print("How Much the Row of Matrix\t= ");
                                rowA = input.nextInt();
                                System.out.println();
                                for (int i = 0; i < columnA; i++) {
                                    for (int j = 0; j < rowA; j++) {
                                        System.out.print("Input Element of Matrix A[" + (i+1) + "][" + (j+1) + "]\t= ");
                                        A[i][j] = input.nextInt();
                                    }
                                }
                                System.out.println("\n--> MATRIX B <--");
                                System.out.print("\nHow Much the Column of Matrix\t= ");
                                columnB = input.nextInt();
                                System.out.println();
                                System.out.print("How Much the Row of Matrix\t= ");
                                rowB = input.nextInt();
                                System.out.println();
                                for (int i = 0; i < columnB; i++) {
                                    for (int j = 0; j < rowB; j++) {
                                        System.out.print("Input Element of Matrix B[" + (i+1) + "][" + (j+1) + "]\t= ");
                                        B[i][j] = input.nextInt();
                                    }
                                }
                                isMatrix = true;
                                break;
                            }
                            case 2 : {
                                if (isMatrix == false) {
                                    System.err.println("\nSorry, Data Matrix is Empty !\n");
                                    break;
                                }
                                System.out.println("\n\t\t~ Visualize the Matrix ~");
                                System.out.println("=========================================================");
                                System.out.println("~ MATRIX A ~");
                                for(int i = 0; i < columnA; ++i) {
                                    for(int j = 0; j < rowA; ++j) {
                                        System.out.print(A[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                System.out.println("\n~ MATRIX B ~");
                                for(int i = 0; i < columnB; ++i) {
                                    for(int j = 0; j < rowB; ++j) {
                                        System.out.print(B[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();
                                break;
                            }
                            case 3 : {
                                int choiceMatrixOperations;

                                if (isMatrix == false) {
                                    System.err.println("\nSorry, Data Matrix is Empty !\n");
                                    break;
                                }

                                System.out.println("\n     ~ MATRIX OPERATIONS MENU (Matrix A & B)~");
                                System.out.println("==================================================");
                                String[] matrixOperations = {"1. Multiplication (*)", "2. Summation (+)", "3. Subtraction (-)", "4. Back to Matrix Menu"};
                                for (int i = 0; i < matrixOperations.length; ++i) {
                                System.out.println(matrixOperations[i]);
                                }
                                System.out.println("=========================================================\n");
                                System.out.print("Input Your Choice with Number of Matrix Menu: ");
                                choiceMatrixOperations = input.nextInt();
                                
                                switch (choiceMatrixOperations) {
                                    case 1 : {
                                        System.out.println("\n     ~ MATRIX MULTIPLICATION (Matrix A & B)~");
                                        System.out.println("================================================");
                                        for(int i = 0; i < columnA; ++i)
                                            for(int j = 0; j < rowB; ++j)
                                                for(int k = 0; k < rowA; ++k) {
                                                C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                                            }
                                        System.out.println("\nPrint the Result of Matrix Operation\t: ");
                                        for(int i = 0; i < columnA; ++i) {
                                            for(int j = 0; j < rowB; ++j) {
                                                System.out.print(C[i][j] + " ");
                                            }
                                            System.out.println();
                                        }
                                        break;
                                    }
                                    case 2 : {
                                        if(columnA != columnB || rowA != rowB) {
                                            System.err.println("\nYou Can't Operate with this operation because the rows or columns\n");
                                        }
                                        for(int i = 0; i < columnA; ++i) {
                                            for(int j = 0; j < rowB; ++j) {
                                                C[i][j] = A[i][j] + B[i][j];
                                            }
                                        }
                                        System.out.println("\nPrint the Result of Matrix Operation\t: ");
                                        for(int i = 0; i < columnA; ++i) {
                                            for(int j = 0; j < rowB; ++j) {
                                                System.out.print(C[i][j] + " ");
                                            }
                                            System.out.println();
                                        }
                                        break;
                                    }
                                    case 3 : {
                                        if(columnA != columnB || rowA != rowB) {
                                            System.err.println("\nYou Can't Operate with this operation because the rows or columns\n");
                                        }
                                        for(int i = 0; i < columnA; ++i) {
                                            for(int j = 0; j < rowB; ++j) {
                                                C[i][j] = (A[i][j] - B[i][j]);
                                            }
                                        }
                                        System.out.println("\nPrint the Result of Matrix Operation\t: ");
                                        for(int i = 0; i < columnA; ++i) {
                                            for(int j = 0; j < rowB; ++j) {
                                                System.out.print(C[i][j] + " ");
                                            }
                                            System.out.println();
                                        }
                                        break;
                                    }
                                    case 4 : {
                                        break;
                                    }
                                    default : {
                                        System.err.println("\nInput Isn't Valid Type !!\n");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 4 : {
                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();
                                break;
                            }
                            default : {
                                System.err.println("\nYour Input Isn't Valid Type !\n");
                                break;
                            }
                        }
                    } while(choiceMatrixMenu != 4);

                    break;
                }
                case 3 : {
                    int choiceMeanData;
                    String[] meanMenu = {"1. Students Grade", "2. Employees Payroll", "3. Savings Income Average", "4. Time Management (Weekly System)", "5. Back to Main Menu"};

                    do {
                        System.out.println("\n~ MEAN DATA OPERATIONS ~");
                        System.out.println("========================");
                        for (int i = 0; i < meanMenu.length; ++i) {
                            System.out.println(meanMenu[i]);
                        }
                        System.out.println("=========================================================\n");
                        System.out.print("Input Your Choice with Number of Calculation Mean Menu: ");
                        choiceMeanData = input.nextInt();

                        switch (choiceMeanData) {
                            case 1 : {
                                int dataSet;

                                System.out.println("=========================================================\n");
                                System.out.print("How Much Data you will input: ");
                                dataSet = input.nextInt();

                                double[] grade = new double[dataSet]; // --> For Initiate the array to loop
                                String[] nameStudent = new String[dataSet];

                                input.nextLine(); // --> clear the buffer

                                System.out.println("\n=========================================================\n");
                                for (int i = 0; i < dataSet; ++i) {
                                    System.out.print("Student Name\t= ");
                                    String name = input.nextLine();
                                    nameStudent[i] = name;
                                    System.out.print("Student Grade\t= ");
                                    float score = input.nextFloat();
                                    grade[i] = score;
                                    System.out.println("---------------------------\n");
                                    input.nextLine();
                                }
                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();

                                System.out.println("=========================================================");
                                System.out.println("\t\t\tDATASET");
                                System.out.println("=========================================================");
                                for (int i = 0; i < dataSet; ++i) {
                                    System.out.println("- Student Name\t= " + nameStudent[i]);
                                    System.out.println("- Student Grade\t= " + grade[i] + "\n");
                                }
                                System.out.println("=========================================================");

                                System.out.println("Average Grade from Total Grade in your Class\t= " + meanDataOperations(dataSet, grade, choiceMeanData));
                                System.out.println("----------------------------------------\n");

                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();
                                break;
                            }
                            case 2 : {
                                int dataSet2;

                                System.out.println("=========================================================\n");
                                System.out.print("How Much Data you will input: ");
                                dataSet2 = input.nextInt();

                                double[] amount = new double[dataSet2]; // --> For Initiate the array to loop
                                String[] workerName = new String[dataSet2];

                                input.nextLine();

                                System.out.println("\n=========================================================\n");
                                for (int i = 0; i < dataSet2; ++i) {
                                    System.out.print("Employee Name\t= ");
                                    String name = input.nextLine();
                                    workerName[i] = name;
                                    System.out.print("Employee Salary\t= ");
                                    long salary= input.nextLong();
                                    amount[i] = salary;
                                    System.out.println("---------------------------\n");
                                    input.nextLine();
                                }
                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();

                                System.out.println("=========================================================");
                                System.out.println("\t\t\tDATASET");
                                System.out.println("=========================================================");
                                for (int i = 0; i < dataSet2; ++i) {
                                    System.out.println("- Employee Name\t= " + workerName[i]);
                                    System.out.println("- Employee Salary\t= " + (int) amount[i] + "\n");
                                }
                                System.out.println("=========================================================");

                                System.out.printf("Average Salaries by Dataset\t= %.0f\n", meanDataOperations(dataSet2, amount, choiceMeanData));
                                System.out.println("----------------------------------------\n");

                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();
                                break;
                            }
                            case 3 : {
                                int dataSet3;
                                double totalCheck = 0;

                                System.out.println("=========================================================\n");
                                System.out.print("How Much Data Transaction You Will Input to Your Account: ");
                                dataSet3 = input.nextInt();

                                double[] checkCust = new double[dataSet3]; // --> For Instanciate the array to loop

                                input.nextLine();

                                System.out.print("Your Name\t: ");
                                String custName = input.nextLine();

                                System.out.println("=========================================================");
                                System.out.println("Account Customer\t: " + custName);
                                for(int i = 0; i < dataSet3; ++i) {
                                    System.out.print("Input Data-" + (i + 1) + "\t: ");
                                    checkCust[i] = input.nextDouble();
                                }
                                System.out.println("=========================================================\n");
                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();

                                System.out.println("=========================================================");
                                System.out.println("\t\t\tDATASET");
                                System.out.println("=========================================================");
                                System.out.println("Account Customer\t: " + custName);
                                for (int i = 0; i < dataSet3; ++i) {
                                    System.out.print("- Customer Check\t= " + (int) checkCust[i] + "\n");
                                    totalCheck += checkCust[i];
                                }
                                System.out.println("\n--> Total Check\t= " + totalCheck);
                                System.out.println("=========================================================");

                                System.out.printf("Average Income Account by Dataset\t= %.0f\n", meanDataOperations(dataSet3, checkCust, choiceMeanData));
                                System.out.println("----------------------------------------\n");

                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();
                                break;
                            }
                            case 4 : {
                                int dataSet4 = 7;
                                double totalTime = 0;

                                System.out.println("\n===========================>> Weekly <<==============================\n");

                                double[] time = new double[dataSet4]; // --> For Instanciate the array to loop

                                input.nextLine();

                                for(int i = 0; i < dataSet4; ++i) {
                                    System.out.print("Input Your Work Time or Study Time" + " Day-" + (i + 1) + "\t= ");
                                    time[i] = input.nextDouble();
                                }
                                System.out.println("=========================================================\n");
                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();

                                System.out.println("=========================================================");
                                System.out.println("\t\t\tDATASET");
                                System.out.println("=========================================================");
                                for (int i = 0; i < dataSet4; ++i) {
                                    System.out.print("- Day " + (i + 1) + "\t\t= " + (int) time[i] + "\n");
                                    totalTime += time[i];
                                }
                                System.out.println("\n--> Total Work Time or Study Time in this Week\t= " + totalTime + " hours");
                                System.out.println("=========================================================");

                                System.out.printf("Average Work Time or Study TIme /week\t= %.1f hours\n", meanDataOperations(dataSet4, time, choiceMeanData));
                                System.out.println("----------------------------------------\n");

                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();
                                break;
                            }
                            case 5 : {
                                System.out.println("Press Any Key to Continue...");
                                input.nextLine();
                                break;
                            }
                            default : {
                                System.err.println("\nYour Input Isn't Valid !!!\n");
                                break;
                            }
                        }
                    } while (choiceMeanData != 5);
                    break;
                }
                case 4 : {
                    System.out.println("\n~ FACTORIAL OPERATIONS ~");
                    System.out.println("========================");
                    System.out.print("Input the number to operating the factorial = ");
                    int numFac = input.nextInt(); // --> for user input number that user want to operate
                    if (numFac < 1) {
                        System.err.println("\nsorry, your input can't be operate\n");
                        return;
                    }
                    
                    System.out.print("\n" + numFac + "! = ");
                    for (int i = numFac; i >= 1; --i) { // --> to print step by step iterations multiplications
                        System.out.print(i);
                        if (i > 1) { // --> this is to print x after the number but if after 1 it closed
                            System.out.print(" x ");
                        }
                    }
                    System.out.println(" = " + factorial(numFac)); // --> this is the result
                    System.out.println("Press Any Key to Continue...");
                    input.nextLine();
                    break;
                }
                case 5 : {
                    System.out.println("\n~ FIBONACCI OPERATIONS ~");
                    System.out.println("========================");
                    System.out.print("Input the number to operating the fibonacci = ");
                    int numFibo = input.nextInt(); // --> for user input number that user want to operate
                    if (numFibo < 1) { // --> make sure user not input 0 number
                        System.err.println("\nsorry, your input can't be operate\n");
                        return;
                    }

                    System.out.print("\nfibonacci " + numFibo + " = ");
                    for (int i = 1; i <= numFibo; ++i) { // --> iterating the operations by recurrsion method
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.println("= " + fibonacci(numFibo)); // --> the result
                    System.out.println("Press Any Key to Continue...");
                    input.nextLine();
                    break;
                }
                case 6 : {
                    System.out.println("\n\t\tTHANK YOU, SEE YOU AGAIN !!!\n");
                    break;
                }
                default:{
                    System.out.println("Your Input is not Valid Type!\n");
                    break;
                }
            }
        } while (choiceMenu != 6);
        
    }

    static double basicMathOperations(double num1, String operate, double num2) {
        double resultMath = 0;
        switch (operate) {
            case "*" -> resultMath = (num1 * num2);
            case "/" -> resultMath = (num1 / num2);
            case "+" -> resultMath = (num1 + num2);
            case "-" -> resultMath = (num1 - num2);
            case "%" -> resultMath = (num1 % num2);
            default -> {
                System.out.println("\nInput Isn't Valid Type!\n");
            }
        }
        return resultMath;
    }

    static float meanDataOperations(int totalData, double valueData[], int choice) {
        float result = 0;

        switch (choice) {
            case 1 : {
                float totalGrade = 0;

                for (int i = 0; i < totalData; ++i) {
                    totalGrade += valueData[i];
                }
                if (totalData > 0) {
                    result = totalGrade / totalData;
                } else {
                    System.err.println("\nYour Input Isn't Valid !!\n");
                }
                break;
            }
            case 2 : {
                long totalAmounts = 0;
                float salaryDeduction = 0;

                for (int i = 0; i < totalData; ++i) {
                    if (valueData[i] > 3_000_000) {
                        salaryDeduction = 0.04f;
                    } else if (valueData[i] >= 1_000_000) { 
                        salaryDeduction = 0.02f;
                    } else if (valueData[i] > 0) { 
                        salaryDeduction = 0.01f;
                    } else {
                        salaryDeduction = 0.1f;
                    }
                    valueData[i] = valueData[i] - (valueData[i] * salaryDeduction);

                    totalAmounts += valueData[i];

                    System.out.println("Employee -" + (i + 1));
                    System.out.printf("Net Salary\t= %.2f \n", valueData[i]);
                    System.out.printf("Salary Deduction\t= %.0f%s", (salaryDeduction * 100), "%\n");
                    System.out.println("--------------------------------------------\n");
                }

                if (totalData > 0) {
                    result = totalAmounts / totalData;
                } else {
                    System.err.println("\nYour Input Isn't Valid, please check the type !\n");
                }
                break;
            }
            case 3 : {
                long totalIncome = 0;

                for(int i = 0; i < totalData; ++i) {
                    totalIncome += valueData[i]; 
                }
                if(totalData > 0) {
                    result = totalIncome / totalData;
                } else {
                    System.err.println("\\nYour Input Isn't Valid, please check the type !\\n");
                }
                break;
            }
            case 4 : {
                float totalT = 0;

                for(int i = 0; i < totalData; ++i) {
                    totalT += valueData[i];
                }
                if(totalData > 0) {
                    result = totalT / totalData;
                } else {
                    System.err.println("\\nYour Input Isn't Valid, please check the type !\\n");
                }
                break;
            }
            case 5 : {
                break;
            }
            default : {
                System.err.println("\nYour Input Isn't Valid Type !!!\n");
                break;
            }
        }
        return result;
    }

    static int fibonacci (int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int factorial (int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // --> recurrsion
    }
}