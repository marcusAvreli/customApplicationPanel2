package customApplicationPanel2.toolbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;

import customApplicationPanel2.command.Command;
import customApplicationPanel2.command.ToolbarCommand;
import customApplicationPanel2.managers.ApplicationManager;

/**
 *
 * @author om
 */
public class ToolbarController implements ActionListener{
    
    JToolBar toolbarView;
    private BufferedImage backgroundImage = null;
    
    public ToolbarController() {
        setupToolbar();
    }
    
    protected void setupToolbar()
    {
        toolbarView = new JToolBar("MainToolbar")
        {
            @Override
            protected void paintComponent(Graphics g) 
            {
                if(backgroundImage == null)
                {
                    //backgroundImage = ResourceManager.getImage("background_GrayTexture", getSize());
                }

                if(backgroundImage != null)
                {
                    g.drawImage(backgroundImage, 0, 0, null);
                }

                super.paintComponent(g);
            }
            
            @Override
            protected JButton createActionComponent(Action a)
            {
                JButton button = super.createActionComponent(a);
                button.setSize(128, 128);
                return button;
            }
        };
        
        toolbarView.setBorder(new LineBorder(Color.LIGHT_GRAY));
        toolbarView.setBorderPainted(true);
        
        toolbarView.add(new ActionItem("Home", ToolbarCommand.SubCommandType.Home, "home"));
        toolbarView.addSeparator();
        toolbarView.addSeparator();
        
        toolbarView.add(new ActionItem("Add Member", ToolbarCommand.SubCommandType.UserAdd, "user_add"));
        toolbarView.add(new ActionItem("Remove Member", ToolbarCommand.SubCommandType.UserDelete, "user_remove"));
        toolbarView.add(new ActionItem("Edit Member Info", ToolbarCommand.SubCommandType.UserEdit, "user_edit"));
        toolbarView.add(new ActionItem("Search Member", ToolbarCommand.SubCommandType.UserSearch, "user_search"));
        toolbarView.addSeparator();
        toolbarView.add(new ActionItem("Donate", Command.SubCommandType.Donate, "donate"));
        toolbarView.addSeparator();
        toolbarView.add(new ActionItem("Settings", ToolbarCommand.SubCommandType.Settings, "settings"));
        
        toolbarView.add( Box.createHorizontalGlue() );
        
        
        
        toolbarView.setRollover(true);
        
        ApplicationManager.getSharedManager().getMainFrame().add(getToolbarView(), BorderLayout.NORTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public JToolBar getToolbarView() {
        return toolbarView;
    }
}
