package sokoban_v6;

/**
 *
 * @author danie
 */
public class MapElement {
    
    private String symbol;
    private String imgFileName;
    
    public MapElement() {
        
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }
    
    public String getImgFileName() {
        return imgFileName;
    }
}
