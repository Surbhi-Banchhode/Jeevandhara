/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author surbh
 */
package BloodBank;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.DriverManager;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author surbh
 */
public class CommonMethods
{
    public static void setLabelImage(JLabel lbl,String path)
    {
        BufferedImage img;
        try
        {
            img = ImageIO.read(new File(path));
            Image dimg = img.getScaledInstance(lbl.getWidth(),lbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(dimg);
            lbl.setIcon(imageicon);
        }
        catch(Exception e)
        {
            System.out.println("caught"+e);
        }
    }
    public static Connection getConnection()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","sa123");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
