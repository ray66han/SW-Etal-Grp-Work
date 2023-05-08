/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit 
 * this template.
 */
// All packages
package Main;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.Database.DatabaseFunctions;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author Rayhan Chowdhury Bijoy
 */
//PieChartGUI class extends JFrame
public class PieChartGUI extends JFrame {

    public PieChartGUI(String title) {
        super(title);
        // Create dataset with initial data
        DefaultPieDataset dataset = new DefaultPieDataset();
        DatabaseFunctions df = new DatabaseFunctions();
        // df = database function
        var gtwc = df.GET_THIS_WEEK_CHORE_LIST();
        // gtwc = Get this week chore list
        int ndc = 0; // ndc = not done chores list
        var dc = 0; // dc = done chores list
        for (Chore chore : gtwc) {
            if ("Completed".equals(chore.getStatus())) {
                dc++;
            } else {
                ndc++;
            }
        }
        dataset.setValue("Not-done Chores", ndc);
        dataset.setValue("Done Chores", dc);

        // Create chart
        JFreeChart chart = ChartFactory.createPieChart(
                "Chores Status!", // Chart title
                dataset, // Dataset
                true, // Show legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );

        // Create plot
        PiePlot plot = (PiePlot) chart.getPlot();

        // Set content panel
        ChartPanel chartPanel = new ChartPanel(chart);
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        // Create and show GUI
        SwingUtilities.invokeLater(() -> {
            PieChartGUI demo = new 
                PieChartGUI("Weekly Done & Not Done Pie Chart");
            demo.setSize(600, 300);
            demo.setLocationRelativeTo(null);
            demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            demo.setVisible(true);
        });
    }
}
