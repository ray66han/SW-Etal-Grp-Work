/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class PieChartGUI extends JFrame {

    public PieChartGUI(String title) {
        super(title);
        // Create dataset with initial data
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Not-done Chores", 10);
        dataset.setValue("Done Chores", 80);
//        dataset.setValue("Bananas", 20);
//        dataset.setValue("Pears", 5);

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
//        plot.setSimpleLabels(true);

        // Set content pane
        ChartPanel chartPanel = new ChartPanel(chart);
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        // Create and show GUI
        SwingUtilities.invokeLater(() -> {
            PieChartGUI demo = new PieChartGUI("Weekly Done & Not Done Pie Chart");
            demo.setSize(600, 300);
            demo.setLocationRelativeTo(null);
            demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            demo.setVisible(true);
        });
    }
}
