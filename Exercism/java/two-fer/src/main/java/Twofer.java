public class Twofer {
    public String twofer(String friendName) {
        if(friendName==null){
            return "One for you, one for me.";
        }
        return "One for "+friendName+", one for me.";
    }
}
