// Video link: https://youtu.be/vvsZMYVkTGw

import java.util.Scanner;

    public class myCalculator {

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            char shouldStartOver;
            do {
                System.out.println("Enter the calculator mode: Standard/Scientific?");
                String modeInput = scnr.next();

                while (!(modeInput.equalsIgnoreCase("Standard") || modeInput.equalsIgnoreCase("Scientific"))) {
                    System.out.println("Enter a mode. Standard or Scientific: ");
                    modeInput = scnr.next();
                }

                if (modeInput.equals("Standard")) {
                    boolean isStandard = true;
                    System.out.println("The calculator will operate in standard mode. ");

                    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division ");
                    String staOperator = scnr.next();


                    while (!(staOperator.equals("+") || staOperator.equals("-") || staOperator.equals("*") || staOperator.equals("/"))) {
                        System.out.println("Invalid operator ");
                        System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
                        staOperator = scnr.next();
                    }

                    String opWord;

                    switch (staOperator) {
                        case "+":
                            opWord = "add";
                            break;
                        case "-":
                            opWord = "subtract";
                            break;
                        case "*":
                            opWord = "multiply";
                            break;
                        default:
                            opWord = "divide";
                    }


                    System.out.println("How many numbers do you want to " + opWord + "?");
                    int num = scnr.nextInt();
                    System.out.println("Enter " + num + " numbers");
                    double sum = scnr.nextDouble();

                    switch (staOperator) {
                        case "+":
                            for (int i = 1; i < num; i++) {
                                double currNum = scnr.nextInt();
                                sum = sum + currNum;
                            }
                            System.out.println("Result: " + sum);
                            break;

                        case "-":
                            for (int i = 1; i < num; i++) {
                                double currNum = scnr.nextInt();
                                sum = sum - currNum;
                            }
                            System.out.println("Result: " + sum);
                            break;

                        case "*":
                            for (int i = 1; i < num; i++) {
                                double currNum = scnr.nextInt();
                                sum = sum * currNum;
                            }
                            System.out.println("Result: " + sum);
                            break;

                        default:
                            for (int i = 1; i < num; i++) {
                                double currNum = scnr.nextDouble();
                                if (currNum == 0) {
                                    System.out.println("Cannot divide be zero!");
                                } else {
                                    sum = sum / currNum;
                                }
                            }
                            System.out.println("Result: " + sum);
                    }

                }

                // Scientific Mode
                else {
                    boolean isScientific = true;
                    System.out.println("The calculator will operate in scientific mode. ");

                    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                    String sciOperator = scnr.next();

                    while (!(sciOperator.equals("+") || sciOperator.equals("-") || sciOperator.equals("*") || sciOperator.equals("/") || sciOperator.equals("sin") || sciOperator.equals("cos") || sciOperator.equals("tan"))) {
                        System.out.println("Invalid operator ");
                        System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
                        sciOperator = scnr.next();
                    }

                    if (sciOperator.equalsIgnoreCase("sin") || sciOperator.equalsIgnoreCase("cos") || sciOperator.equalsIgnoreCase("tan")) {
                        if (sciOperator.equals("sin")){
                            System.out.println("Enter a number in radians to find the sine");
                        } else if (sciOperator.equals("cos")) {
                            System.out.println("Enter a number in radians to find the cosine");
                        } else {
                            System.out.println("Enter a number in radians to find the tangent");
                        }
                        double trigNum = scnr.nextInt();

                        double result;

                        switch (sciOperator) {
                            case "sin":
                                result = Math.sin(trigNum);
                                System.out.println("Result: " + result);
                                break;

                            case "cos":
                                result = Math.cos(trigNum);
                                System.out.println("Result: " + result);
                                break;

                            case "tan":
                                result = Math.tan(trigNum);
                                System.out.println("Result: " + result);
                                break;

                        }
                    } else {

                        String opWord;

                        switch (sciOperator) {
                            case "+":
                                opWord = "add";
                                break;
                            case "-":
                                opWord = "subtract";
                                break;
                            case "*":
                                opWord = "multiply";
                                break;
                            default:
                                opWord = "divide";
                        }
                        System.out.println("How many numbers do you want to " + opWord + "?");
                        int num = scnr.nextInt();
                        System.out.println("Enter " + num + " numbers");
                        double sum = scnr.nextDouble();


                        switch (sciOperator) {
                            case "+":
                                for (int i = 1; i < num; i++) {
                                    double currNum = scnr.nextInt();
                                    sum = sum + currNum;
                                }
                                System.out.println("Result: " + sum);
                                break;

                            case "-":
                                for (int i = 1; i < num; i++) {
                                    double currNum = scnr.nextInt();
                                    sum = sum - currNum;
                                }
                                System.out.println("Result: " + sum);
                                break;

                            case "*":
                                for (int i = 1; i < num; i++) {
                                    double currNum = scnr.nextInt();
                                    sum = sum * currNum;
                                }
                                System.out.println("Result: " + sum);
                                break;

                            default:
                                for (int i = 1; i < num; i++) {
                                    double currNum = scnr.nextDouble();
                                    if (currNum == 0) {
                                        System.out.println("Cannot divide be zero!");
                                    } else {
                                        sum = sum / currNum;
                                    }
                                }
                                System.out.println("Result: " + sum);
                        }
                    }

                }

                System.out.println("Do you want to start over? (Y/N) ");
                shouldStartOver = scnr.next().charAt(0);

            } while ((shouldStartOver) == 'Y' || (shouldStartOver) == 'y');

            System.out.println("Goodbye");

            scnr.close();
        }
    }
