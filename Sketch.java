import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage imgCookieMonster;
  PImage imgCookie;
  PImage imgKitchen;

  float fltKitchenX = 0;
  float fltKitchenY = 0;

  float fltCookieMonsterX = 0;
  float fltCookieMonsterY = 250;

  float fltCookieX = 300;
  float fltCookieY = 150;

  float fltCookieMonsterSpeedX = 2;

  float fltCookieSpeedX = 2;
  float fltCookieCurveX = 2;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  
     imgKitchen = loadImage("Kitchen Background.jpg");
     imgCookieMonster = loadImage("Cookie Monster.png");
     imgCookie = loadImage("Cookie.png");

     imgCookieMonster.resize(imgCookieMonster.width/5, imgCookieMonster.height/5);
     imgCookie.resize(imgCookie.width/11, imgCookie.height/11);
    
  }

  
  
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
   image(imgKitchen, fltKitchenX, fltKitchenY);
   image(imgCookieMonster, fltCookieMonsterX, fltCookieMonsterY);
   image(imgCookie, fltCookieX, fltCookieY);

   fltCookieMonsterX += fltCookieMonsterSpeedX;
   if (fltCookieMonsterX < 0 || fltCookieMonsterX > width - 140){
     fltCookieMonsterSpeedX *= -1;
     }

   fltCookieX += fltCookieSpeedX;
    if(fltCookieX < 0 || fltCookieX > width - 80){
      fltCookieSpeedX *= -1;
    }

    fltCookieY = ((float) 0.006 * ((float) Math.pow(fltCookieX - width / (float) 2.5, (float) 2))) + (float) 10;
    fltCookieCurveX = width - (float) fltCookieX;
    
   }
  
  
  
  // define other methods down here.
}