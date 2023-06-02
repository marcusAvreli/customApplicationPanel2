package customApplicationPanel2.ui.controllers;

import customApplicationPanel2.managers.ApplicationManager;
import customApplicationPanel2.ui.SettingsView;

/**
 *
 * @author om
 */
public class SettingsViewController {
    
    SettingsView settingsView;
 
    public SettingsViewController() 
    {
        settingsView = new SettingsView();
    }
    
    void initializeView()
    {
        settingsView.initializeSettingsData();
    }
    
    public void showSettingsView()
    {
        this.settingsView.initializeSettingsData();
        this.settingsView.setVisible(true);
        this.settingsView.toFront();
    }
    
    void databasePathDidChange(String oldPath, String newPath)
    {
        //ApplicationManager.getSharedManager().databasePathDidChange(oldPath, newPath);
    }
    
    void imagePathDidChange(String oldPath, String newPath)
    {
        ApplicationManager.getSharedManager().imagePathDidChange(oldPath, newPath);
    }
   
}