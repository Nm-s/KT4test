
 package kirjasotoGUI_final;

import java.awt.Image;

@SuppressWarnings("unused")
public class Tiedot {
    
    private String teoksennimi;
    private int julkaisuvuosi;
    private String tekij�nimi; 
    private byte[] kuva;
    
    public Tiedot(int pjulkaisuvuosi, String pkirjanimi, String ptekij�nimi, byte[] pkuva)
    {
       
        this.teoksennimi = pkirjanimi;
        this.julkaisuvuosi = pjulkaisuvuosi;
        this.tekij�nimi = ptekij�nimi;
        this.kuva = pkuva;
    }
    
    
    public Tiedot(int int1, String string, float parseFloat, String string2, byte[] bytes) {
		// TODO Auto-generated constructor stub
	}


	public String getTeoksennimi()
    {
        return teoksennimi;
    }
    
    public String getTekij�nimi()
    {
        return tekij�nimi;
    }
    
    
    public int getJulkaisuvuosi()
    {
        return julkaisuvuosi;
    }
    
    
    public byte[] getImage()
    {
        return kuva;
    }
    
}