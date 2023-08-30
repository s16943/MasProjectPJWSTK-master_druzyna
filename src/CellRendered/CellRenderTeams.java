package CellRendered;

import Persons.Pilkarz;
import Team.Druzyna;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class CellRenderTeams extends DefaultListCellRenderer implements ListCellRenderer<Object>{

        private String zdjecieDruzyny = "C:\\Users\\Jakub\\team_icon.png";
    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        try {
            Druzyna is=(Druzyna) value;
            
            setText(is.getNazwa());
            Image image = ImageIO.read(new File(zdjecieDruzyny));
            Icon icon = new ImageIcon(image);
            setIcon(icon);

            if(isSelected)
            {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            }else
            {
                
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

        } catch (IOException ex) {
            Logger.getLogger(CellRenderFootbaler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }
}
