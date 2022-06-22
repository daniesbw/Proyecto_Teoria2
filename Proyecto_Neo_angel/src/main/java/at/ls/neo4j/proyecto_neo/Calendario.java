/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.ls.neo4j.proyecto_neo;

import com.mindfusion.common.DateTime;
import com.mindfusion.scheduling.AeroEffect;
import com.mindfusion.scheduling.Calendar;
import com.mindfusion.scheduling.CalendarView;
import com.mindfusion.scheduling.GlassEffect;
import com.mindfusion.scheduling.ThemeType;
import com.mindfusion.scheduling.model.Appointment;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Daniel
 */
public class Calendario extends JFrame {

    private Calendar calendar = new Calendar();
    private ArrayList<Bug> bugsAsignados = new ArrayList();

    public void runn(ArrayList<Bug> bugs) {
        bugsAsignados = bugs;
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override

            public void run() {

                Calendario window = null;
                try {
                    window = new Calendario(bugsAsignados);

                    window.setVisible(true);
                    window.setLocationRelativeTo(null);
                } catch (Exception exp) {
                }
            }
        });
    }

    protected Calendario(ArrayList<Bug> bugs) {
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 700);
        setTitle("Calendario de errores");

        calendar.beginInit();
        calendar.setTheme(ThemeType.Light);
        calendar.setCurrentView(CalendarView.SingleMonth);
        calendar.getMonthSettings().getDaySettings().setShowToday(true);
        calendar.setDate(new DateTime(2022, 6, 1));
        calendar.setEndDate(new DateTime(2022, 6, 30));

        calendar.setEnableDragCreate(true);

        for (Bug b : bugs) {

            Appointment app = new Appointment();
            app.setHeaderText(b.getDescripcion());
            app.setDescriptionText(b.getEstado());

            String[] parts = b.getFechaInicio().split("-");
            app.setStartTime(new DateTime(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]), Integer.parseInt(parts[0]), 0, 0, 0));
            app.setEndTime(new DateTime(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]), Integer.parseInt(parts[0]), 0, 0, 0));
            calendar.getSchedule().getItems().add(app);

        }
        calendar.endInit();

        getContentPane().add(calendar, BorderLayout.CENTER);
    }

    public void crearEvento() {

    }

}
