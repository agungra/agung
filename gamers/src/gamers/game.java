
package gamers;


 


public class game {

    
     
    
    public static void main(String[] args) {
      Player agung = new Player();
      agung.nama = "rachmat";
      agung.speed = 90;
      agung.hp = 100;
      
      agung.run();
      if (agung.mati()) {
          System.out.println("ayo main lagi sayang:");
      }
    }
    
}
