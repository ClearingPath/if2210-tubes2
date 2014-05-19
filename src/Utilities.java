/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Afik
 */

public class Utilities {
    //ukuran asli peta
    public static int MAP_ROW_COUNT;
    public static int MAP_COL_COUNT;

    //ukuran peta yang dikasih lihat
    public static final int VIEW_ROW_COUNT=12;
    public static final int VIEW_COL_COUNT=12;

    //posisi tile peta yang ada di kiri atas peta yang dikasih lihat
    public static int VIEW_TILE_X=0;
    public static int VIEW_TILE_Y=0;

    //posisi ujung kiri atas peta
    public static final int VIEW_POS_X=50;
    public static final int VIEW_POS_Y=50;

    //ukuran tile
    public static final int TILE_SIZE_X=32;
    public static final int TILE_SIZE_Y=32; 
        
    public enum TileType {
       Walkable, UnWalkable,  Hideable;
    }
    
    public enum ItemType {
        Tissue(true, "tisu"), WC(false, "WC awal"), Key(true, "kunci"), Knife(true, "knife"), 
        Painting(false, "lukisan awal"), Manekin(false, "manekin awal"), ManekinR(false, "manekin akhir"),
        PaintingR(false, "lukisan akhir"), WCR(false, "WC akhir"),
        DoorClosed(false, "pintu"), Spidol(true, "marker"), ItemKosong(false, "kosong");
        
        public boolean walkable;
        public String pic;
        
        private ItemType(boolean walk, String pic) {
            walkable = walk;
            this.pic = pic;
        }
        
        public boolean IsWalkable() {
            return walkable;
        }
        
        public String getPic() {return pic;}
        
    }
	
    public enum StateType{
    	WelcomeScreen, StartScreen, Playing, HighScore, Help, Credits, Quit;
    }
    
    public static String mediator_string;
}

class AnimTypeNotFoundException extends Exception{
	private static final long serialVersionUID = 1897174443650738740L;
}

class ObjectNameNotFoundException extends Exception{
	private static final long serialVersionUID = 8872217230896936215L;
}
