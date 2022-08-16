package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//	    bankAccount one = new bankAccount();
//        char again = 's';
//
//        while (again == 's'){
//            System.out.println("Deseja efetuar alterações em sua conta bancária? (s/n)");
//            again = scanner.next().charAt(0);
//            if(again == 's'){
//                System.out.println("Você gostaria de adicionar fundos(digite 1), retirar fundos(digite 2), ou conferir seu saldo(digite 3)?");
//                int option = scanner.nextInt();
//                switch (option){
//                    case 1:
//                        System.out.println("Digite a quantia a ser adicionada em sua conta");
//                        one.addFunds(scanner.nextInt());
//                        break;
//                    case 2:
//                        System.out.println("Digite a quantia a ser retirada");
//                        one.withdrawFunds(scanner.nextInt());
//                        break;
//                    case 3:
//                        System.out.println(one.getBalance());
//                        break;
//                }
//            }
//            else{
//                break;
//            }
//        }
        VipCustomer one = new VipCustomer("GGA", 1000, "email");

    }
}
