package com.company;

import java.sql.SQLOutput;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0  && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100 ){
                return -1;
            }
            else{
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        else{
            return -1;
        }



    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex == false){

        }
        else{
            if(pagesToPrint % 2 == 1){
                pagesToPrint/=2;
                pagesToPrint+= + 1;
            }
            else{
                pagesToPrint/=2;
            }
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
