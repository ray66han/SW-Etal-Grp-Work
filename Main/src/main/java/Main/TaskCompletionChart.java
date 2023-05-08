/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.Database.DatabaseFunctions;
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
 * @author Rayhan Chowdhury Bijoy
 */
public class TaskCompletionChart {
    public static void main(String[] args) {
        
        // Create the dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        DatabaseFunctions df = new DatabaseFunctions();
        int ot = 0, oc = 0, ond = 0; /** ot = user one total chores/task,
         * oc = user one done chores
         * ond = user one not done chores
         */
        int tt = 0, tc = 0, tnd = 0;
        /** tt = user two total chores/task,
         * tc = user two done chores
         * tnd = user two not done chores
         */
        String one = "",two = "";
        try {
            User userOne = df.GET_USER_WITH_ID(0);
            int userOneTotal = df.GET_USER_TOTAL_CHORES_COUNT(userOne);
            int userOneCompleted = df.GET_USER_COMPLETED_CHORES_COUNT(userOne);
            one = userOne.getName();
            ot = userOneTotal;
            oc = userOneCompleted;
            ond = userOneTotal - userOneCompleted;
            User userTwo = df.GET_USER_WITH_ID(1);
            int userTwoTotal = df.GET_USER_TOTAL_CHORES_COUNT(userTwo);
            int userTwoCompleted = df.GET_USER_COMPLETED_CHORES_COUNT(userTwo);
            two = userTwo.getName();
            tt = userTwoTotal;
            tc = userTwoCompleted;
            tnd = userTwoTotal - userTwoCompleted;
        } catch (Exception e) {
        }
        dataset.addValue(oc, "Done", one);
        dataset.addValue(ond, "Not done", one);
        dataset.addValue(ot, "Total", one);
        dataset.addValue(tc, "Done", two);
        dataset.addValue(tnd, "Not done", two);
        dataset.addValue(tt, "Total", two);
        
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
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

}

