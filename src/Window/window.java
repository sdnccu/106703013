package Window;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class window {

	protected Shell shell;
	private Composite Page_change;
	private Back back;
	private Top top;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			window window = new window();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Page_change = new Composite(shell, SWT.NONE);
		Page_change.setLayout(new StackLayout());
		
		top = new Top(Page_change, SWT.NONE);
		
		back = new Back(Page_change, SWT.NONE);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		
		Mid mid = new Mid(composite_1, SWT.NONE);
		mid.setBounds(31, 78, 392, 115);
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		
		Button btnNewButton = new Button(composite_2, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showBack();
			}
		});
		btnNewButton.setBounds(31, 27, 94, 27);
		btnNewButton.setText("Back");
		
		Button btnNewButton_1 = new Button(composite_2, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showNext();
			}
		});
		btnNewButton_1.setBounds(209, 27, 94, 27);
		btnNewButton_1.setText("Next");

	}
	
	private void showBack()
	{
		StackLayout layout = (StackLayout)this.Page_change.getLayout();
		layout.topControl=this.back;
		this.Page_change.layout();
		
	}
	
	private void showNext()
	{
		StackLayout layout = (StackLayout)this.Page_change.getLayout();
		layout.topControl=this.top;
		this.Page_change.layout();
	}
}
