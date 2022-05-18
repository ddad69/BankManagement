package wps.srohter.BankManagement;

import wps.srohter.BankManagement.Annotations.ListField;

/**
 * @author Skylar Rohter
 * @return Created JFrame
 * @since Version 0.1
 */
public class BMMain {
    public static void main(String[] args) {
        CreateJFrame FrameCreator = new CreateJFrame();
        FrameCreator.CreateFrame();
        if(CreateJFrame.class.isAnnotationPresent(ListField.class)){

        }
    }
}