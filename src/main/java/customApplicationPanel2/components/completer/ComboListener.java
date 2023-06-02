package customApplicationPanel2.components.completer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import customApplicationPanel2.entity.CustomApplication;
//import org.apache.commons.lang3.text.WordUtils;

public class ComboListener<T> extends KeyAdapter
{
@SuppressWarnings("rawtypes")
JComboBox cbListener;
@SuppressWarnings("rawtypes")
Searchable<T, String>  vector;

@SuppressWarnings("rawtypes")
public ComboListener(JComboBox cbListenerParam, Searchable<T, String> s)
{
    cbListener = cbListenerParam;
    vector = s;
}

@SuppressWarnings({ "unchecked", "rawtypes" })
public void keyReleased(KeyEvent key)
{
            // TODO Auto-generated method stub
            String text = ((JTextField)key.getSource()).getText();

            cbListener.setModel(new ToComboBoxModel(getFilteredList(text)));
            cbListener.setSelectedIndex(-1);
            ((JTextField)cbListener.getEditor().getEditorComponent()).setText(text);
            cbListener.showPopup();
}


@SuppressWarnings({ "rawtypes", "unchecked" })
public List<T> getFilteredList(String text)
{
    Vector v = new Vector();
   /* for(int a = 0;a<vector.size();a++)
    {
        if(vector.get(a).toString().startsWith(text))
        {
            v.add(vector.get(a).toString());
        }
                    else if(vector.get(a).toString().startsWith(text.toLowerCase()))
        {
            v.add(vector.get(a).toString());
        }
                     else if(vector.get(a).toString().startsWith(text.toUpperCase()))
        {
            v.add(vector.get(a).toString());
        }
                     else if(vector.get(a).toString().startsWith((text)))
        {
            v.add(vector.get(a).toString());
        }
                     else if(vector.get(a).toString().startsWith((text)))
        {
            v.add(vector.get(a).toString());
        }
    }*/
    List<T> founds =  (List<T>) vector.search(text);
    return founds;
}
}