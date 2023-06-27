import java.util.*;
class RnaTranscription {
    
    String transcribe(String strandDNA) {
        String strandRNA="";
        if(strandDNA==null){
            throw new IllegalArgumentException();
        }
        for(int i=0; i<strandDNA.length(); i++){
            switch(strandDNA.charAt(i)){
                case 'G':
                    strandRNA+="C";
                    break;
                case 'C':
                    strandRNA+="G";
                    break;
                case 'T':
                    strandRNA+="A";
                    break;
                case 'A':
                    strandRNA+="U";
                    break;
            }
        }
        return strandRNA;
    }

}
