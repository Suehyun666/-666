package sugangSincheong;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import valueObject.VUser;

public class PSugangSincheongPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private PHeaderPanel pHeaderPanel;
	private PContentPanel pContentPanel;
	private PFooterPanel pFooterPanel;
	
	public PSugangSincheongPanel() {
		this.setLayout(new BorderLayout());
		
		this.pHeaderPanel = new PHeaderPanel();
		this.add(this.pHeaderPanel, BorderLayout.NORTH);
		
		this.pContentPanel = new PContentPanel();
		this.add(this.pContentPanel, BorderLayout.CENTER);
		
		this.pFooterPanel = new PFooterPanel();
		this.add(this.pFooterPanel, BorderLayout.SOUTH);
	}

	public void initialize(VUser vUser) throws Exception {
		this.pHeaderPanel.intialize(vUser);
		this.pContentPanel.intialize(vUser);		
		this.pFooterPanel.intialize();		
	}

	public void finish() {
		this.pContentPanel.finish();
	}
}
