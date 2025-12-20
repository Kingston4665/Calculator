import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
            boolean modeBool = false;
            boolean operationBool = false;
            boolean addition = false;
            boolean subtraction = false;
            boolean multiplication = false;
            boolean division = false;
            boolean threeModeBool = false;
            boolean choice = false;
            boolean addFirst = false;
            boolean addSeccond = false;
            boolean subtractFirst = false;
            boolean subtractSecond = false;
            boolean multiplyFirst = false;
            boolean multiplySecond = false;
            boolean divideFirst = false;
            boolean divideSecond = false;
        
    while (true) {
        
        System.out.println("Welcome To The Calculator!" + "Press 1 To Start: \n");
        System.out.print("Selection: ");
        int start = scanner.nextInt();
        
        if (start == 1) {
            modeBool = true;
            
        }
            
        if (modeBool == true) {    
            
            System.out.println("Please Select Mode: \n" + 
                               "2 Number Mode(Enter 2) - Ex: Number1 + Number2 \n" +
                               "OR \n" +
                               "3 Number Mode(Enter 3) - Ex: Number1 + Number2 * Number3 \n");
        
                System.out.print("Selection: ");
                int mode = scanner.nextInt();
            
                modeBool = false;
            
            if (mode == 2) {
                operationBool = true;
            }
        
            else if (mode == 3) {
                threeModeBool = true;
            }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
            }
        }
        
        
    //Two Number Mode
        
        if (operationBool == true) {
            
            System.out.println("\n");
            System.out.println("Choose Your Operation(Enter The Corresponding Number): \n" +
                               "1. Addition(+) \n" +
                               "2. Subtraction(-) \n" +
                               "3. Multiplication(x) \n" +
                               "4. Division(/) \n");
            
                System.out.print("Selection: ");
                int operation = scanner.nextInt();
            
                operationBool = false;
            
            if (operation == 1) {
                addition = true;
            } 
        
            else if (operation == 2) {
                subtraction = true;
            }
            
            else if (operation == 3) {
                multiplication = true;
            }
            
            else if (operation == 4) {
                division = true;
            }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
            }
        }    
        
    //Addition
            
        if (addition == true) {
            
            System.out.println("\n");
            System.out.println("Format Ex: Number1 + Number2 \n");
            
            System.out.print("Enter Number1: ");
            double numOne = scanner.nextDouble();
            
            System.out.print("Enter Number2: ");
            double numTwo = scanner.nextDouble();
            
            System.out.println("\n" + numOne + " + " + numTwo + " = "  + (numOne+numTwo));
            
            addition = false;
            
            System.out.println("\n");
            System.out.println("Choose Your Next Action(Enter The Corresponding Number): \n" +
                               "1. Change Calcualtor Mode \n" +
                               "2. Change Operation \n" +
                               "3. Compute Another Equation \n" +
                               "4. End Calculator \n");
            
                System.out.print("Selection: ");
                int nextAction = scanner.nextInt();
                System.out.println("\n");
            
            if (nextAction == 1) {
                modeBool = true;
            } 
        
            else if (nextAction == 2) {
                operationBool = true;
            }
            
            else if (nextAction == 3) {
                addition = true;
            }
            
            else if (nextAction == 4) {
                System.out.println("You Have Ended The Calculator. Goodbye!");
                break;
            }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
            }
        }
            
            
    //Subtraction
            
        if (subtraction == true) {
            
            System.out.println("\n");
            System.out.println("Format Ex: Number1 - Number2 \n");
            
            System.out.print("Enter Number1: ");
            double numOne = scanner.nextDouble();
            
            System.out.print("Enter Number2: ");
            double numTwo = scanner.nextDouble();
            
            System.out.println("\n" + numOne + " - " + numTwo + " = "  + (numOne-numTwo));
            
            subtraction = false;
            
            System.out.println("\n");
            System.out.println("Choose Your Next Action(Enter The Corresponding Number): \n" +
                               "1. Change Calcualtor Mode \n" +
                               "2. Change Operation \n" +
                               "3. Compute Another Equation \n" +
                               "4. End Calculator \n");
            
                System.out.print("Selection: ");
                int nextAction = scanner.nextInt();
                System.out.println("\n");
            
            if (nextAction == 1) {
                modeBool = true;
            } 
        
            else if (nextAction == 2) {
                operationBool = true;
            }
            
            else if (nextAction == 3) {
                subtraction = true;
            }
        
            else if (nextAction == 4) {
                System.out.println("You Have Ended The Calculator. Goodbye!");
                break;
            }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
            }
        }
            
    //Multiplication
            
        if (multiplication == true) {
            
            System.out.println("\n");
            System.out.println("Format Ex: Number1 x Number2 \n");
            
            System.out.print("Enter Number1: ");
            double numOne = scanner.nextDouble();
            
            System.out.print("Enter Number2: ");
            double numTwo = scanner.nextDouble();
            
            System.out.println("\n" + numOne + " x " + numTwo + " = "  + (numOne*numTwo));
            
            multiplication = false;
            
            System.out.println("\n");
            System.out.println("Choose Your Next Action(Enter The Corresponding Number): \n" +
                               "1. Change Calcualtor Mode \n" +
                               "2. Change Operation \n" +
                               "3. Compute Another Equation \n" +
                               "4. End Calculator \n");
            
                System.out.print("Selection: ");
                int nextAction = scanner.nextInt();
                System.out.println("\n");
            
            if (nextAction == 1) {
                modeBool = true;
                } 
        
            else if (nextAction == 2) {
                operationBool = true;
                }
            
            else if (nextAction == 3) {
                multiplication = true;
                }
            
            else if (nextAction == 4) {
                System.out.println("You Have Ended The Calculator. Goodbye!");
                break;
                }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
            }
        }
            
    //Division
            
        if (division == true) {
            
            System.out.println("\n");
            System.out.println("Format Ex: Number1 / Number2 \n");
            
            System.out.print("Enter Number1: ");
            double numOne = scanner.nextDouble();
            
            System.out.print("Enter Number2: ");
            double numTwo = scanner.nextDouble();
            
            if (numTwo == 0) {
                System.out.println("\n");
                System.out.println("ERROR! Cannot Divide By 0!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
            
            } else {
                System.out.println("\n" + numOne + " / " + numTwo + " = "  + (numOne/numTwo));
                division = false;
            }
                
                System.out.println("\n");
                System.out.println("Choose Your Next Action(Enter The Corresponding Number): \n" +
                                   "1. Change Calcualtor Mode \n" +
                                   "2. Change Operation \n" +
                                   "3. Compute Another Equation \n" +
                                   "4. End Calculator \n");
            
                System.out.print("Selection: ");
                int nextAction = scanner.nextInt();
                System.out.println("\n");
            
            if (nextAction == 1) {
                modeBool = true;
            } 
        
            else if (nextAction == 2) {
                operationBool = true;
            }
            
            else if (nextAction == 3) {
                division = true;
            }
        
            else if (nextAction == 4) {
                System.out.println("You Have Ended The Calculator. Goodbye!");
                break;
            }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
            }
        }
            
    //3 Number Mode
        
        if (threeModeBool == true) {
            
            System.out.println("\n");
            System.out.println("Format Ex: Number1 + Number2 * Number3");
            System.out.println("Format Ex: Number1 (Operation1) Number2 (Operation2) Number3 \n");
            System.out.println("For Addition Enter: '+', For Subtraction Enter '-' \n" + 
                               "For Multiplication Enter: 'x', For Division Enter: '/' \n");
            
            System.out.print("Enter Number1: ");
            double numOne = scanner.nextDouble();
            
            System.out.print("Enter Operation1: " + 
                             "Enter the Sign: +, -, x, /: ");
            char operationOne = scanner.next().charAt(0);
            
            System.out.print("Enter Number2: ");
            double numTwo = scanner.nextDouble();
            
            System.out.print("Enter Operation1: " + 
                             "Enter the Sign: +, -, x, /: ");
            char operationTwo = scanner.next().charAt(0);
            
            System.out.print("Enter Number3: ");
            double numThree = scanner.nextDouble();
        
            
            if (operationOne == '+') {
            
                if (operationTwo == '+') {
                    System.out.println("\n");
                    System.out.println(numOne + " + " + numTwo + " + " + numThree + " = " + (numOne+numTwo+numThree));
                    threeModeBool = false;
                    choice = true;
                }
                
                else if (operationTwo == '-') {
                    System.out.println("\n");
                    System.out.println(numOne + " + " + numTwo + " - " + numThree + " = " + (numOne+numTwo-numThree));
                    threeModeBool = false;
                    choice = true;
                }
            
                else if (operationTwo == 'x') {
                    System.out.println("\n");
                    System.out.println(numOne + " + " + numTwo + " x " + numThree + " = " + (numOne+(numTwo*numThree)));
                    threeModeBool = false;
                    choice = true;
                }
            
                else if (operationTwo == '/') {
                
                    if (numThree == 0) {
                        System.out.println("\n");
                        System.out.println("ERROR! Cannot Divide By 0!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        break;
                    
                    } else {
                        System.out.println("\n");
                        System.out.println(numOne + " + " + numTwo + " / " + numThree + " = " + (numOne+(numTwo/numThree)));
                        threeModeBool = false;
                        choice = true;
                    }
                }    
            } 
        
            else if (operationOne == '-') {
            
                if (operationTwo == '+') {
                    System.out.println("\n");
                    System.out.println(numOne + " - " + numTwo + " + " + numThree + " = " + (numOne-numTwo+numThree));
                    threeModeBool = false;
                    choice = true;
                }
                
                else if (operationTwo == '-') {
                    System.out.println("\n");
                    System.out.println(numOne + " - " + numTwo + " - " + numThree + " = " + (numOne-numTwo-numThree));
                    threeModeBool = false;
                    choice = true;
                }
            
                else if (operationTwo == 'x') {
                    System.out.println("\n");
                    System.out.println(numOne + " - " + numTwo + " x " + numThree + " = " + (numOne-(numTwo*numThree)));
                    threeModeBool = false;
                    choice = true;
                }
            
                else if (operationTwo == '/') {
                
                    if (numThree == 0) {
                        System.out.println("\n");
                        System.out.println("ERROR! Cannot Divide By 0!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        break;
                    
                    } else {
                        System.out.println("\n");
                        System.out.println(numOne + " - " + numTwo + " / " + numThree + " = " + (numOne-(numTwo/numThree)));
                        threeModeBool = false;
                        choice = true;
                }
            }
            
            else if (operationOne == 'x') {
            
                if (operationTwo == '+') {
                    System.out.println("\n");
                    System.out.println(numOne + " x " + numTwo + " + " + numThree + " = " + ((numOne*numTwo)+numThree));
                    threeModeBool = false;
                    choice = true;
                }
                
                else if (operationTwo == '-') {
                    System.out.println("\n");
                    System.out.println(numOne + " x " + numTwo + " - " + numThree + " = " + ((numOne*numTwo)-numThree));
                    threeModeBool = false;
                    choice = true;
                }
            
                else if (operationTwo == 'x') {
                    System.out.println("\n");
                    System.out.println(numOne + " x " + numTwo + " x " + numThree + " = " + (numOne*numTwo*numThree));
                    threeModeBool = false;
                    choice = true;
                }
            
                else if (operationTwo == '/') {
                
                    if (numThree == 0) {
                        System.out.println("\n");
                        System.out.println("ERROR! Cannot Divide By 0!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        break;
                    
                    } else {
                        System.out.println("\n");
                        System.out.println(numOne + " + " + numTwo + " / " + numThree + " = " + (numOne+(numTwo/numThree)));
                        threeModeBool = false;
                        choice = true;
                    }
                }
            }
            
            else if (operationOne == '/') {
            
                if (numTwo == 0) {
                    System.out.println("\n");
                    System.out.println("ERROR! Cannot Divide By 0!");
                    System.out.println("The Calculator Has Ended. Goodbye!");
                    break;
                    
                } else {
                    
                    if (operationTwo == '+') {
                System.out.println("\n");
                System.out.println(numOne + " / " + numTwo + " + " + numThree + " = " + ((numOne/numTwo)+numThree));
                threeModeBool = false;
                choice = true;
                }
                
            else if (operationTwo == '-') {
                System.out.println("\n");
                System.out.println(numOne + " / " + numTwo + " - " + numThree + " = " + ((numOne/numTwo)-numThree));
                threeModeBool = false;
                choice = true;
                }
            
            else if (operationTwo == 'x') {
                System.out.println("\n");
                System.out.println(numOne + " / " + numTwo + " x " + numThree + " = " + ((numOne/numTwo)*numThree));
                threeModeBool = false;
                choice = true;
                }
            
            else if (operationTwo == '/') {
                
                if (numThree == 0) {
                    System.out.println("\n");
                    System.out.println("ERROR! Cannot Divide By 0!");
                    System.out.println("The Calculator Has Ended. Goodbye!");
                    break;
                    
                } else {
                    System.out.println("\n");
                    System.out.println(numOne + " / " + numTwo + " / " + numThree + " = " + ((numOne/numTwo)/numThree));
                    threeModeBool = false;
                    choice = true;
                            }
                        }
                    }
                }
            }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
                }
            }
            
        if (choice == true) {
            
            System.out.println("\n");
            System.out.println("Choose Your Next Action(Enter The Corresponding Number): \n" +
                               "1. Change Calcualtor Mode \n" +
                               "2. Compute Another Equation \n" +
                               "4. End Calculator \n");
            
                System.out.print("Selection: ");
                int nextAction = scanner.nextInt();
                System.out.println("\n");
            
            if (nextAction == 1) {
                
                if (nextAction == 1) {
                modeBool = true;
            } 
        
            else if (nextAction == 2) {
                threeModeBool = true;
            }
            
        
            else if (nextAction == 4) {
                System.out.println("You Have Ended The Calculator. Goodbye!");
                break;
            }
        
            else {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("The Calculator Has Ended. Goodbye!");
                break;
                    }
                }
            }
        }
        
        scanner.close(); // Close the scanner
        
    }
}

