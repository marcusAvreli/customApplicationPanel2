package customApplicationPanel2.ui.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import customApplicationPanel2.managers.ApplicationManager;
import customApplicationPanel2.ui.CustomApplicationView;
import customApplicationPanel2.ui.MainFrame;

public class CustomApplicationController {
	private static final Logger logger = LoggerFactory.getLogger(CustomApplicationController.class);
	CustomApplicationView customApplicationView;
	
	
	public CustomApplicationController() 
    {
		
		initializeView();
    }
    
    void initializeView()
    {
    	
    	customApplicationView = new CustomApplicationView();
        //settingsView.initializeSettingsData();
    	ApplicationManager manager = ApplicationManager.getSharedManager();
    	
    		MainFrame mainFrame = manager.getMainFrame();
    	
    		
    		mainFrame.setRightView(customApplicationView);
    	
    }
    
    public void showSettingsView()
    {
        //this.settingsView.initializeSettingsData();
        this.customApplicationView.setVisible(true);
       // this.settingsView.toFront();
    }
    
    void databasePathDidChange(String oldPath, String newPath)
    {
        //ApplicationManager.getSharedManager().databasePathDidChange(oldPath, newPath);
    }
}
