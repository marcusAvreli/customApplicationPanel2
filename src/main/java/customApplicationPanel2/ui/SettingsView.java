package customApplicationPanel2.ui;

import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author om
 */
public class SettingsView extends javax.swing.JFrame {
	   private javax.swing.JTextField databaseDirTxt;
	   private JPanel jPanel2 = null;
    /**
     * Creates new form SettingsView
     */
    public SettingsView() {
        initComponents();
        
        setTitle("Settings");
        
       setAlwaysOnTop(true);
    }
    
    private void initComponents() {
    	  databaseDirTxt = new javax.swing.JTextField();
    	  
    	  jPanel2 = new javax.swing.JPanel();
    	  
    	  GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
              jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    //  .add(jLabel1)
                      //.add(jLabel2)
                		  )
                  .addGap(59, 59, 59)
                  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addComponent(databaseDirTxt)
                      //.add(imageDirTxt)
                      )
                  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                     // .add(GroupLayout.Alignment.TRAILING, databseDirChangeButton)
                     // .add(GroupLayout.Alignment.TRAILING, imageDirChangeButton)
                		  )
                  .addContainerGap())
          );
          jPanel2Layout.setVerticalGroup(
              jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(12, 12, 12)
                  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                      //.add(jLabel1)
                      .addComponent(databaseDirTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                      //.add(databseDirChangeButton)
                      )
                  .addGap(18, 18, 18)
                  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                     // .add(jLabel2)
                      //.add(imageDirTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                      //.add(imageDirChangeButton)
                		  )
                  .addGap(17, 17, 17))
          );
          
          GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
              layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addGap(12, 12, 12)
                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      //.add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      )
                  .addContainerGap())
          );
          layout.setVerticalGroup(
              layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  //.add(jPanel4GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addGap(12, 12, 12)
                  )
          );

          pack();
    }
    public void initializeSettingsData() {
        this.databaseDirTxt.setText("text");
    }
}
