/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author usercc
 */
public class TaskCompletionChart {
    public static void main(String[] args) {
        
        // Create the dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5, "Done", "Rayhan");
        dataset.addValue(2, "Not done", "Rayhan");
        dataset.addValue(7, "Total", "Rayhan");
        dataset.addValue(7, "Done", "Bijoy");
        dataset.addValue(0, "Not done", "Bijoy");
        dataset.addValue(7, "Total", "Bijoy");
        
        // Create the chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Task Completion Chart", // chart title
                "User", // domain axis label
                "Tasks", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // plot orientation
                true, // include legend
                true, // include tooltips
                false // include URLs
        );
        
        // Set the color of the bars for each category
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.GREEN); // Done
        renderer.setSeriesPaint(1, Color.RED); // Not done
        renderer.setSeriesPaint(2, Color.LIGHT_GRAY); // Total
        
        // Set the width of the bars
        CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryMargin(0.25);
        axis.setUpperMargin(0.05);
        axis.setLowerMargin(0.05);
        
        // Create the panel to display the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 300));
        
        // Create the frame to hold the panel and display it
        JFrame frame = new JFrame("Task Completion Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

}

