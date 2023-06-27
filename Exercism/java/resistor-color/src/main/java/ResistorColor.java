class ResistorColor {
   static int colorCode(String color) {
        String[] colours=ResistorColor.colors();
       for(int i=0; i<colours.length; i++){
           if(colours[i].equalsIgnoreCase(color)){
               return i;
           }
       }
       return -1;
    }

   static String[] colors() {
        String[] colours ={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colours;
    }
}
