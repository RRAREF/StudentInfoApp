import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Student Info Input");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label and text field for Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(140, 20, 200, 25);
        frame.add(nameField);

        // ID
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 60, 100, 25);
        frame.add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(140, 60, 200, 25);
        frame.add(idField);

        // Section
        JLabel sectionLabel = new JLabel("Section:");
        sectionLabel.setBounds(20, 100, 100, 25);
        frame.add(sectionLabel);

        JTextField sectionField = new JTextField();
        sectionField.setBounds(140, 100, 200, 25);
        frame.add(sectionField);

        // Batch
        JLabel batchLabel = new JLabel("Batch:");
        batchLabel.setBounds(20, 140, 100, 25);
        frame.add(batchLabel);

        JTextField batchField = new JTextField();
        batchField.setBounds(140, 140, 200, 25);
        frame.add(batchField);

        // University
        JLabel uniLabel = new JLabel("University:");
        uniLabel.setBounds(20, 180, 100, 25);
        frame.add(uniLabel);

        JTextField uniField = new JTextField();
        uniField.setBounds(140, 180, 200, 25);
        frame.add(uniField);

        // Preview Button
        JButton previewButton = new JButton("Preview");
        previewButton.setBounds(140, 230, 100, 30);
        frame.add(previewButton);

        // Action for Preview Button
        previewButton.addActionListener(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            String section = sectionField.getText();
            String batch = batchField.getText();
            String university = uniField.getText();

            String previewInfo = "Name: " + name +
                    "\nID: " + id +
                    "\nSection: " + section +
                    "\nBatch: " + batch +
                    "\nUniversity: " + university;

            JOptionPane.showMessageDialog(frame, previewInfo, "StudentInfo", JOptionPane.PLAIN_MESSAGE);
        });

        // Show frame
        frame.setVisible(true);

	}

}
