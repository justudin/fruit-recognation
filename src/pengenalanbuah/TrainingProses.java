/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pengenalanbuah;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author umi & abi
 */
public class TrainingProses {
     int r;
     int g;
     int b;
    //apple max (rgb)
     int applermax;
     int applegmax;
     int applebmax;
    //apple min
     int applermin;
     int applegmin;
     int applebmin;
    //jeruk max (rgb)
     int jerukrmax;
     int jerukgmax;
     int jerukbmax;
    //jeruk min
     int jerukrmin;
     int jerukgmin;
     int jerukbmin;  
     //gambar
     
    // File gmbapel[]= new File();
     //File gmbjeruk= new File;
    
    // BufferedImage image = ImageIO.read(gmbapel);
   
    
    public void bacaGambar(){
        try {
             //String gmbapel = "apel1.jpg"; 
             InputStream is = new BufferedInputStream(  
                new FileInputStream("src\\pengenalanbuah\\resources\\apel\\apel1.jpg"));  
            // get the BufferedImage, using the ImageIO class
            BufferedImage gambar = ImageIO.read(is);
            getRgb(gambar);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
        
    }
    public int hitungRGB(){
        
        return r;
    }
    
    public int hitungRata2(){
        
        return b;
    }
    
    
    public void getRgb(BufferedImage gmbr){
    int w = gmbr.getWidth();
    int h = gmbr.getHeight();
    int sumR=0, sumG=0, sumB=0;
    
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        //System.out.println("x,y: " + j + ", " + i);
        int pixel = gmbr.getRGB(j, i);
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;
        sumR+=red;
        sumG+=green;
        sumB+=blue;
        //printRGB(pixel);
        //System.out.println("");
      }
    }
    
    this.r=sumR/(w*h);
    this.g=sumG/(w*h);
    this.b=sumB/(w*h);
    //System.out.println("Rata-Rata RGB: " + ratR + ", " + ratG + ", " + ratB);
    //System.out.println("width, height: " + w + ", " + h);
}
   
}
