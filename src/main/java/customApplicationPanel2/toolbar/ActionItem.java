package customApplicationPanel2.toolbar;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import customApplicationPanel2.command.Command;
import customApplicationPanel2.command.ToolbarCommand;
import customApplicationPanel2.managers.ApplicationManager;

/**
 *
 * @author om
 */
public class ActionItem extends AbstractAction{

    String title;
    ImageIcon icon;
    Command.SubCommandType type;
    String iconName;

    public ActionItem(String title, Command.SubCommandType type, String iconName) 
    {
        super(title, null);
        
        this.title = title;
        this.type = type;
        this.iconName = iconName;
     //   icon = ResourceManager.getIcon(iconName, new Dimension(50, 50));
        
       // putValue(SMALL_ICON, icon);
        putValue(SHORT_DESCRIPTION, title);
      //  putValue(LARGE_ICON_KEY, icon);      
    }
    
    public ActionItem(String title, Command.SubCommandType type, String iconName, Dimension dimention)
    {
        super(title, null);
        
        this.title = title;
        this.type = type;
        this.iconName = iconName;
        //icon = ResourceManager.getIcon(iconName, dimention);
        
        //putValue(SMALL_ICON, icon);
        putValue(SHORT_DESCRIPTION, title);
        //putValue(LARGE_ICON_KEY, icon);      
    }
    

    public String getTitle() {
        return title;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public ToolbarCommand.SubCommandType getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public void setType(ToolbarCommand.SubCommandType type) {
        this.type = type;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {        
        long uniqueId = System.currentTimeMillis() ;
        Command command = new ToolbarCommand(Command.CommandType.Toolbar, getType());
        ApplicationManager.getSharedManager().actionPerformed(new ActionEvent(command, (int) uniqueId, Command.CommandType.Toolbar.toString()));        
    }
    
}