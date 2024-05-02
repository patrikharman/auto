
package main;


public class Auto {
    private static int objektumDb = 0;
    private boolean uzemanyag;
    private boolean beinditva;
    
    public Auto(){
        this(true,false);
        
    }
    public Auto(boolean beinditva){
        this(false,beinditva);
    }
    
    
    public Auto(boolean uzemanyag,boolean beinditva){
        Auto.objektumDb++;
        System.out.printf("*********%d. bemutató*******".formatted(Auto.objektumDb));
        System.out.println("**********************");
        this.uzemanyag = uzemanyag;
        this.beinditva = beinditva;
        String info = uzemanyag ? "van" : "nincs";
        System.out.println("üzemanyag: "+ info);
        info = beinditva ? "van" : "nincs";
        System.out.println("beinditva: " + info);
        System.out.println("----------------------");
    }
    
    public void setBeinditva(boolean beinditva){
         this.beinditva = beinditva;
         if(beinditva){
             System.out.println("A motor be van indítva");
         }else{
             System.out.println("A motor le van állítva");
         }
    }
    public void megy(){
        if (beinditva && uzemanyag) {
            this.uzemanyag = false;
            System.out.println("A kocsi megérkezett, de üres a tank");
        }
        else if(!beinditva){
            System.out.println("Az autó nincs beindítva");
        }
        else if(!uzemanyag){
            System.out.println("Nem haladtunk,mert üres a tank");
        }
    }
    public void tankol(){
        if (!beinditva) {
            this.uzemanyag = true;
            System.out.println("Sikerült tankolni, tele a tank");
        }else{
            System.out.println("Sikertelen tankolás,mert be van indítva");
        }
    }
}
