package Window;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class Back extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Back(Composite parent, int style) {
		super(parent, style);
		
		Label lblBack = new Label(this, SWT.NONE);
		lblBack.setBounds(28, 21, 59, 14);
		lblBack.setText("Back");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
