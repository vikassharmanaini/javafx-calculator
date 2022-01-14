package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;


public class Controller {
    public Label label1;
    public Label lav2;
    private String s1;
    int kasoti=0;
    public void calculate(String s2){
        int f1=Integer.parseInt(s1);
        int f2=Integer.parseInt(s2);
        if (kasoti == 1) {
            label1.setText(String.valueOf(f1+f2));
        }
       else if (kasoti == 2) {
            label1.setText(String.valueOf(f1-f2));
        }
       else if (kasoti == 3) {
            label1.setText(String.valueOf(f1*f2));
        }
       else if (kasoti == 4) {
            label1.setText(String.valueOf(f1/f2));
        }
    }
    public void injectlb2(String a){
        lav2.setText(a);
        s1=label1.getText();
        label1.setText("");
    }
    public void injectlbel(int a){
        if (label1.getText().isBlank()){
        label1.setText(String.valueOf(a));}
        else{
            label1.setText(label1.getText()+a);
        }
    }
    public void press9(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(9);
    }
    public void press8(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(8);
    }
    public void press7(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(7);
    }
    public void press6(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(6);
    }
    public void press5(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(5);
    }
    public void press4(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(4);
    }
    public void press3(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(3);
    }
    public void press2(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(2);
    }
    public void press1(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(1);
    }
    public void pressadd(ActionEvent e){
        System.out.println(9+" "+e);
        injectlb2("+");
        kasoti=1;
    }
    public void presssub(ActionEvent e){
        System.out.println(9+" "+e);
        injectlb2("-");
        kasoti=2;
    }
    public void pressmul(ActionEvent e){
        System.out.println(9+" "+e);
        injectlb2("*");
        kasoti=3;
    }
    public void pressdiv(ActionEvent e){
        System.out.println(9+" "+e);
        injectlb2("/");
        kasoti=4;
    }
    public void pressequ(ActionEvent e){
        System.out.println(9+" "+e);
        calculate(label1.getText());
        lav2.setText("=");
    }
    public void presson(ActionEvent e){
        System.out.println(9+" "+e);
        label1.setText("");

    }
    public void press0(ActionEvent e){
        System.out.println(9+" "+e);
        injectlbel(0);
    }

}
