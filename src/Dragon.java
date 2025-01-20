public class Dragon {
    private int firePower;
    private int treasureGaurded;
    public Dragon (int pFirePower, int pTreasureGaurded){
        firePower = pFirePower;
        treasureGaurded = pTreasureGaurded;
    }
    public int getFirePower(){
        return firePower;
    }
    public int getTreasureGaurded(){
        return treasureGaurded;
    }
    public void setFirePower(int pFirePower){
        firePower = pFirePower;
    }
    public void setTreasureGaurded(int pTreasureGaurded){
        treasureGaurded = pTreasureGaurded;
    }
    public void  printInfo(){
        System.out.println("The fire power for this dragon is: " + firePower);
        System.out.println("The amount of treasure gaurded for this dragon is: " + treasureGaurded);
    }
}
