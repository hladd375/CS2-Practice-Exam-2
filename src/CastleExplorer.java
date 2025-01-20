public class CastleExplorer {

    private String ancientRunes = "z%nxt#%lh#@wsife#w#qr$mt*h!lho#gr&tw#sxrk^o#wl#tvqu!mf#*pzl#i#e!ksv#fe*$sioe#s#i#pmn#?*wt#bh#rzfhwie#xf#jntxo#h%nr#fue#*!orzs#jst#^*@";
    Dragon[] dragons = new Dragon[50];
    public static void main(String[] args) {
        new CastleExplorer();
    }

    public CastleExplorer(){
        System.out.println("Welcome, brave knight! May your code be as strong as your sword!");
        for (int x =0; x<dragons.length; x++){
            dragons[x] = new Dragon(((int)(Math.random()*91))+10,((int)(Math.random()*451))+50);
        }
        displayDragons();
        System.out.println(checkFirePower());
        System.out.println(decipher(ancientRunes));
    }
    public void displayDragons(){
        for (int x =0; x<dragons.length; x++){
            dragons[x].printInfo();
        }
    }
    public boolean checkFirePower(){
        boolean isEqual = false;
        for (int x =0; x<dragons.length; x++){
            for (int i =0; i<dragons.length; i++){
                if(dragons[x].getFirePower() == dragons[i].getFirePower() && x != i){
                    isEqual = true;
                    System.out.println(x +"  "+ i);

                }

            }
        }
        if(isEqual == true){
            return true;
        } else{
            return false;
        }

    }
    public String decipher(String seceretCode){
        String decodedLine = "";
        while(seceretCode.contains("#")){
            String letter = seceretCode.substring(seceretCode.indexOf("#")-1,seceretCode.indexOf("#"));
            System.out.println(letter);
            decodedLine += letter;
            seceretCode = seceretCode.substring(seceretCode.indexOf("#") +1);
        }
        return decodedLine;
    }
}