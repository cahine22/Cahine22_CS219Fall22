package ZipCodeDB;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPamel is the "base class, GuiPanel is the "derived class"

public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;

    private JButton northernmost;
    private JTextArea output;

    private Database db; // The zipcode database

    public GUIPanel() {
        this.zipcode = new JTextField("Zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.northernmost = new JButton("Northernmost");
        this.add(northernmost);
        this.northernmost.addActionListener(new northernmostButtonListener());



        this.output = new JTextArea(5,20);
        this.add(output);

        this.db = new Database(); // load zipcodes


    }

    class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit
            // get the zipcode out of the textfeild

            String code = zipcode.getText();
            Zipcode zc = db.search(code);


            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());

        }


    }
    class northernmostButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses northernmost
            String code = zipcode.getText();
            Zipcode zc = db.search(code);
            Database north = zc.getNorthern;
            output.setText(north.toString);

        }

    }