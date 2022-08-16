public class BattleField {
   public static String nimrodDefence = "Enemy attack repulsed";
   public static String nimrodAttack = "Counter";
   public static String nimrodDestroy = "Enemy hit failed";
   public static String galavirDefence = "Our attack was successfully repelled by the enemy";
   public static String galavirAttack = "Enemy Strikes";
   public static String galavirDestroy = "Enemy ship destroyed";

   public static void main(String[] args) {
       GalavirXIII galavir = new GalavirXIII();
       Nimrod nimrod = new Nimrod();

       do {
           System.out.println(galavirAttack);
           nimrod.defend(galavir.attack());
           if (isNimrodAlive(nimrod)) {
               System.out.println(nimrodAttack);
               galavir.defend(nimrod.attack());
           } else {
               break;
           }
       } while (isGalavirAlive(galavir));
   }

   public static boolean isNimrodAlive(Nimrod nimrod) {
       if (nimrod.health > 0) {
           System.out.println(nimrodDefence);
           return true;
       } else {
           System.out.println(nimrodDestroy);
           return false;
       }
   }

   public static boolean isGalavirAlive(GalavirXIII galavir) {
       if (galavir.health > 0) {
           System.out.println(galavirDefence);
           return true;
       } else {
           System.out.println(galavirDestroy);
           return false;
       }
   }
}
