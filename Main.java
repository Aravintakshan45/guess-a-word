package com.atk;

import javax.swing.*;
public class Main {


    public static void main(String args[]) {
        System.out.println("workdir"+System.getProperty("user.dir"));
        int computernumber = (int) (Math.random() * 100 + 1);
        int useranswer = 0;
        System.out.println("the guess number " + computernumber);
        int count = 1;

        while (computernumber != useranswer) {
            String responce = JOptionPane.showInputDialog(null, "enter the number between 0 to 100", "gussing game ", 3);
            useranswer = Integer.parseInt(responce);
            JOptionPane.showMessageDialog(null, "" + determineguess(useranswer, computernumber, count));
            count++;
        }
    }

            public static  String determineguess(int computernumber,int useranswer,int count){
        if(useranswer<=0 || useranswer>100) {
            return "ur guess is invalid ";
        }else if(useranswer==computernumber){
            return "correct\n total guess : "+count;

        }
        else if(useranswer<computernumber){
            return "the answer is too high "+count;
        }
        else{
            return "it is invalid : ";
        }
}

}