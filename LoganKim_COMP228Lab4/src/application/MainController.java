package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
	// field variables
	@FXML private ComboBox<String> _cmbCourse;
	@FXML private RadioButton _btnCS;
	@FXML private RadioButton _btnB;
	@FXML private TextField _txtName;
	@FXML private TextField _txtAddress;
	@FXML private TextField _txtProvince;
	@FXML private TextField _txtCity;
	@FXML private TextField _txtPostalCode;
	@FXML private TextField _txtPhoneNumber;
	@FXML private TextField _txtEmail;
	@FXML private CheckBox _cbxStudentCouncil;
	@FXML private CheckBox _cbxVolunteerWork;
	@FXML private TextArea _txtCourse;
	@FXML private TextArea _txtOutput;
	@FXML private Button _btnDisplay;

	// when computer science program is selected
    @FXML private void onSelectCS(ActionEvent e){
    	// clear previous value
		_txtCourse.clear();
		// create an array for the courses of computer science
		String[] csCourseList = { "Java", "C#", "Python" };
		// create an observable list for computer science
		ObservableList<String> csCourseOList = FXCollections.observableArrayList(csCourseList);
		// initialize computer science observable list to combo box
		_cmbCourse.setItems(csCourseOList);
    } // end onSelectCS

    // when business program is selected
    @FXML private void onSelectB(ActionEvent e){
    	// clear previous value
		_txtCourse.clear();
		// create an array for the courses of business
		String[] bCourseList = { "Accounting", "Finance", "Business Management" };
		// create an observable list for business
		ObservableList<String> bCourseOList = FXCollections.observableArrayList(bCourseList);
		// initialize business observable list to combo box
		_cmbCourse.setItems(bCourseOList);
    } // end onSelectB

    // when course combobox is selected
    @FXML private void onSelectCmb(ActionEvent e){
    	// local variables
    	String selectedCourse;
    	boolean matchJava, matchCSharp, matchPython, matchAccounting, matchFinance, matchManagement;

    	// initialize the values
   	 	selectedCourse = _cmbCourse.getSelectionModel().getSelectedItem(); // selected combo item
   	 	matchJava = _txtCourse.getText().contains("Java"); // if _txtCourse contains Java
   	 	matchCSharp = _txtCourse.getText().contains("C#"); // if _txtCourse contains C#
   	 	matchPython = _txtCourse.getText().contains("Python"); // if _txtCourse contains Python
   	 	matchAccounting = _txtCourse.getText().contains("Accounting"); // if _txtCourse contains Accounting
   	 	matchFinance = _txtCourse.getText().contains("Finance"); // if _txtCourse contains Finance
   	 	matchManagement = _txtCourse.getText().contains("Business Management"); // if _txtCourse contains Business Management

   	 	// if computer science is selected
   	 	if (_btnCS.isSelected()) {
   	 		// add the selected if the course selected is not added yet
	   	 	if (selectedCourse == "Java" && matchJava == false ||
	   	 		selectedCourse == "C#" && matchCSharp == false ||
	   	 		selectedCourse == "Python" && matchPython == false) {
	   	   	 	_txtCourse.appendText(selectedCourse + "\n");
	   	 	} // end if
   	 	} // end if

   	 	// if business is selected
   	 	else if (_btnB.isSelected()) {
   	 		// add the selected if the course selected is not added yet
	   	 	if (selectedCourse == "Accounting" && matchAccounting == false ||
		   	 	selectedCourse == "Finance" && matchFinance == false ||
		   	 	selectedCourse == "Business Management" && matchManagement == false) {
		   	   	 	_txtCourse.appendText(selectedCourse + "\n");
		   	 } // end if
   	 	} // end else if
    } // end onSelectCmb

    // when display button is clicked
    @FXML public void onDisplayClicked(ActionEvent e) {
    	// Display error message if name field is empty
    	if(_txtName.getText().isEmpty()) {
			_txtOutput.setText("**You must enter a name**");
    	} // end if
    	// Display error message if address field is empty
    	else if (_txtAddress.getText().isEmpty()) {
    		_txtOutput.setText("**You must enter an address**");
    	} // end else if
    	// Display error message if province field is empty
    	else if (_txtProvince.getText().isEmpty()) {
    		_txtOutput.setText("**You must enter a province**");
    	} // end else if
    	// Display error message if city field is empty
    	else if (_txtCity.getText().isEmpty()) {
    		_txtOutput.setText("**You must enter a city**");
    	} // end else if
    	// Display error message if postal code field is empty
    	else if (_txtPostalCode.getText().isEmpty()) {
    		_txtOutput.setText("**You must enter a postal code**");
    	} // end else if
    	// Display error message if phone number field is empty
    	else if (_txtPhoneNumber.getText().isEmpty()) {
    		_txtOutput.setText("**You must enter a phone number**");
    	} // end else if
    	// Display error message if email field is empty
    	else if (_txtEmail.getText().isEmpty()) {
    		_txtOutput.setText("**You must enter an email**");
    	} // end else if
    	// Display error message if program and courses are not selected
    	else if (_txtCourse.getText().isEmpty()) {
    		_txtOutput.setText("**You must choose a program and courses**");
    	} // end else if
    	// display output
    	else {
			_txtOutput.setText(_txtName.getText() + ", " + _txtAddress.getText() + ", " +
					   _txtCity.getText() + ", " + _txtProvince.getText() + ", " +
					   _txtPostalCode.getText() + ", " + _txtPhoneNumber.getText() + ", " +
					   _txtEmail.getText() + "\nCourses:\n" + _txtCourse.getText());
		} // end else
    } // end onDisplayClicked
} // end class
