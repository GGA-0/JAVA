package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,2,12));
        //canPack(2,2,12);
    }
    public static boolean canPack (int bigCount, int smallCount, int goal){
        boolean x = false;
        if(bigCount<0 || smallCount <0 || goal < 0){
            x = false;
        }
        else if (smallCount == 0){
            int filling;
            for (int i = 0; i <= bigCount; i++){
                filling = i * 5;
                if (filling == goal){
                    x = true;
                    break;
                }
            }
        }
        else if (bigCount == 0){
            int filling;
            for (int i = 0; i <= smallCount; i++){
                filling = i;
                if (filling == goal){
                    x = true;
                    break;
                }
            }
        }
        else if (smallCount > 0 && bigCount > 0){
            int filling;
            for (int i = 0; i <= bigCount; i++){
                filling = i * 5;
                if (filling == goal){
                    x = true;
                    break;
                }
                else if (filling > goal){
                    filling -= 5;
                    for (int i2 = 0; i2 <= smallCount; i2++){
                        if (filling == goal){
                            x = true;
                            break;
                        }
                        else{
                            filling = filling + i2;
                        }
                    }
                }
                else if (filling < goal){
                    int filling2 = filling;
                    for (int i2 = 0; i2 <= smallCount; i2++){
                        if (filling2 == goal){
                            x = true;
                            break;
                        }
                        else{
                            int filling3 = filling;
                            for (int i3 = 1; i3 <= smallCount; i3++){
                                filling3++;
                                if (filling3 == goal){
                                    x = true;
                                    break;
                                }
                            }

                        }
                    }

                }
            }
        }
        return x;
    }
}
