package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController2;

public class GuiFrame2 extends JFrame
{
	private GuiController2 baseController;
	private GuiPanel2 basePanel;
	
	public GuiFrame2(GuiController2 baseController)
	{
		this.baseController = baseController;
		basePanel = new GuiPanel2(baseController);
		setupFrame();
	}
	
	/**
	 * Required helper method to prepare the frame.
	 */
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be the first line of setupFrame.
		this.setSize(1000, 1000);
		this.setTitle("REMIX!!!");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GuiController2 getBaseController()
	{
		return baseController;
	}
}
