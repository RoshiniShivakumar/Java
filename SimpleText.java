import java.awt.*;
import java.awt.event.*;

public class SimpleText extends Frame {
    private TextArea textArea;
    private Choice fontChoice, fontSizeChoice;
    private Checkbox boldCheckbox, italicCheckbox;
    private Button applyButton;

    public SimpleText() {
        setTitle("Text Editor");

    
        textArea = new TextArea();

        fontChoice = new Choice();
        fontChoice.add("Arial");
        fontChoice.add("Courier New");
        fontChoice.add("Times New Roman");
        fontChoice.add("Verdana");
        fontChoice.add("Tahoma");


        fontSizeChoice = new Choice();
        fontSizeChoice.add("8");
        fontSizeChoice.add("10");
        fontSizeChoice.add("12");
        fontSizeChoice.add("14");
        fontSizeChoice.add("16");
        fontSizeChoice.add("18");
        fontSizeChoice.add("20");
        fontSizeChoice.add("22");
        fontSizeChoice.add("24");
        fontSizeChoice.add("26");
        fontSizeChoice.add("28");
        fontSizeChoice.add("30");
        fontSizeChoice.add("32");  

        boldCheckbox = new Checkbox("Bold");
        italicCheckbox = new Checkbox("Italic");

        applyButton = new Button("Apply");

        textArea.setBounds(50, 50, 300, 200);
        fontChoice.setBounds(50, 270, 120, 30);
        fontSizeChoice.setBounds(180, 270, 60, 30);
        boldCheckbox.setBounds(250, 270, 50, 30);
        italicCheckbox.setBounds(310, 270, 60, 30);
        applyButton.setBounds(380, 270, 50, 30);

        add(textArea);
        add(fontChoice);
        add(fontSizeChoice);
        add(boldCheckbox);
        add(italicCheckbox);
        add(applyButton);

     
        setLayout(null);
        setSize(500, 350);
        setVisible(true);

        
        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTextStyle();
            }
        });
    }

   
    private void updateTextStyle() {
       
        int fontSize = Integer.parseInt(fontSizeChoice.getSelectedItem());

        int style = Font.PLAIN;
        if (boldCheckbox.getState() && italicCheckbox.getState()) {
            style = Font.BOLD | Font.ITALIC;
        } else if (boldCheckbox.getState()) {
            style = Font.BOLD;
        } else if (italicCheckbox.getState()) {
            style = Font.ITALIC;
        }

        String fontName = fontChoice.getSelectedItem();

        textArea.setFont(new Font(fontName, style, fontSize));
    }

    public static void main(String[] args) {
        new SimpleText();
    }
}
