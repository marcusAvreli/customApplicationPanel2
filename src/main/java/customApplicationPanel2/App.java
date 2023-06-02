package customApplicationPanel2;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import customApplicationPanel2.managers.ApplicationManager;

//https://github.com/omkar-ramtekkar/AYF-Fund-Manager/blob/fa57fbe2a382da0d7ba16b9d41c2d3bca30e9176/AYFFundManager/src/org/ayf/main/AYFMain.java
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
      /*  try 
        {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (ClassNotFoundException ex) {
        	logger.error("error",ex);
        } catch (InstantiationException ex) {
        	logger.error("error",ex);
        } catch (IllegalAccessException ex) {
        	logger.error("error",ex);
        } catch (UnsupportedLookAndFeelException ex) {
        	logger.error("error",ex);
        }
*/
    	logger.info("start application");
        ApplicationManager.getSharedManager().initialize();        
        
    }
}