package customApplicationPanel2.managers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import customApplicationPanel2.command.Command;
import customApplicationPanel2.mainmenubar.MainMenuController;
import customApplicationPanel2.ui.MainFrame;
import customApplicationPanel2.ui.controllers.CustomApplicationController;
import customApplicationPanel2.ui.controllers.SettingsViewController;

/**

 * @author om
 */
public class ApplicationManager implements ActionListener
{
    private MainFrame mainFrame = null;
    private CustomApplicationController caController= null;
   /* private SideBarTableController sidebarTableController;
    private ReportViewController reportController;
    private ToolbarController   toolbarController;
    
    */
    private MainMenuController  mainMenuBarController;
    private SettingsViewController settingViewController;
    
    private static ApplicationManager instance = null;

    public static ApplicationManager getSharedManager()
    {
        if(instance == null)
        {
            instance = new ApplicationManager();
        }
        
        return instance;
    }
    
    
    private ApplicationManager() 
    {
    }
    
    public void initialize()
    {
    	
    	
    	/*
        DatabaseManager.loadDatabaseClass();
        
        
        
        File databaseFile = new File(PreferenceManager.getDatabaseDir());
        if(!databaseFile.isDirectory() && databaseFile.exists())
        {
            DatabaseManager.initializeDatabaseManager();
        }
       */ 
        this.mainFrame = new MainFrame();
        //caController.showSettingsView();
        this.settingViewController = new SettingsViewController();
    	this.caController = new CustomApplicationController();
        this.mainMenuBarController = new MainMenuController();
        
/*
        this.toolbarController = new ToolbarController();        
       

        //Configure sidebar table
        this.sidebarTableController = new SideBarTableController();
        this.reportController = new ReportViewController();
        this.sidebarTableController.addActionListener(this);
        */
        //checkAndUpdateDatabaseLocation();
    }

    
    public MainFrame getMainFrame() {
        return mainFrame;
    }
/*
    public SideBarTableController getSidebarTableController() {
        return sidebarTableController;
    }

    public ReportViewController getReportController() {
        return reportController;
    }

    public ToolbarController getToolbarController() {
        return toolbarController;
    }
*/
    
   
    @Override
    public void actionPerformed(ActionEvent e) 
    {  
        Command command = (Command)e.getSource();
        if(command != null)
        {
            switch(command.getType())
            {
                case Report:
                  //  getReportController().actionPerformed(e);
                    break;
                case Toolbar:
                    handleAction(command);
                    break;
                case Menubar: 
                    handleAction(command);
                    break;
            }
        }
    }
    
    void handleAction(Command command)
    {
        if(command != null)
        {
            switch(command.getSubType())
            {
                case UserAdd:
                  //  handleUserAddAction();
                    break;
                case UserDelete:
                    handleUserDeleteAction();
                    break;
                case UserSearch:
                    handleUserSearchAction();
                    break;
                case UserInfo:
                    break;
                case UserEdit:
                    handleUserEditAction();
                    break;
                case Settings:
                    handleSettingsAction();
                    break;
                case Save:
                    break;
                case Donate:
                  //  handleDonateAction();
                    break;
                case Home:
                    //sidebarTableController.selectOption(Command.SubCommandType.Dashboard, null);
                    break;
                case AdminPassword:
                    handleAdminSettings();
                    break;
                    
            }
        }
    }
/*
    private void handleUserAddAction() 
    {
        new MemberFrame(null, InformationPanel.PanelType.Registeration).setVisible(true);
    }
*/
    private void handleUserDeleteAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleUserSearchAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleUserEditAction() {
        
    }

    private void handleSettingsAction() {
        this.settingViewController.showSettingsView();
    }
/*
    private void handleDonateAction() {
        new MemberFrame(null, InformationPanel.PanelType.Donate).setVisible(true);
    }

    private void checkAndUpdateDatabaseLocation()
    {
        try {
            File databaseFile = new File(PreferenceManager.getDatabaseDir());
            if (databaseFile.isDirectory() || !databaseFile.exists()) 
            {
                throw new Exception();
            }
        } catch (Exception exception) 
        {
            Point centerPoint = new Point((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2.0), (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2.0));
            Toast.showToast("Invalid Database directory path", centerPoint, false);
            this.settingViewController.showSettingsView();
        }
    }
    
    public void memberDidRegister(Member member)
    {
        PreferenceManager.updateNextRegID();
    }
    
    public void donationDidPerform(Donor donor)
    {
        PreferenceManager.updateNextDonationID();
    }

    void entityDidAdded(BaseEntity entity) 
    {
        if(entity != null)
        {
            if(entity.getClass().equals(Donor.class))
            {
                donationDidPerform((Donor) entity);
            }
            else if(entity.getClass().equals(Member.class))
            {
                memberDidRegister((Member) entity);
            }
        }
    }
    
    public void databasePathDidChange(String oldPath, String newPath)
    {
        DatabaseManager.initializeDatabaseManager();
        this.reportController.refresh();
    }

    void showSettingsPanel() {
        this.settingViewController.showSettingsView();
    }
*/
    public void imagePathDidChange(String oldPath, String newPath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleAdminSettings() {
        
    }


	
}