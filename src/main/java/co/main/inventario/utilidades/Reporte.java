package co.main.inventario.utilidades;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author usuario
 */
public class Reporte {

    public static void main(String[] args) {
        String reportPath = "src\\main\\resources\\reportes\\report1.jasper";

        try {
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, null, new JREmptyDataSource());
            jasperPrint.setName("Reporte de prueba");
            JasperViewer.viewReport(jasperPrint);
           // JasperViewer jviewer = new JasperViewer(jasperPrint);
             // jviewer.setTitle("Reporte de prueba");
              //jviewer.setVisible(true);
             /// jviewer.show();
            
            //jviewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
