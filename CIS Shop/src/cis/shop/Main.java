/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.shop;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String args[]){
        
        String[] Productlist = new String[]{
            
        "1.แชมพูสระผม.    ราคา.   65.   บาท"
       ,"2.มาม่า.         ราคา.    7.   บาท"
       ,"3.เลย์.          ราคา.   30.   บาท"
       ,"4.ปลั๊กไฟ.       ราคา.  179.   บาท"
       ,"5.ทิชชู่.        ราคา.  149.   บาท"
       ,"6.หม้อสุกี้.     ราคา. 1250.   บาท"
       ,"7.มีด.           ราคา.   79.   บาท"
       ,"8.ผ้าขนหนู.      ราคา.  119.   บาท"
       ,"9.ปลากระป๋อง.    ราคา.   35.   บาท"
       ,"10.ความรักจากTA. ราคา.  3500.  บาท"};
    
      NewJFrame f = new NewJFrame (Productlist);
     f.show();
    }
}
