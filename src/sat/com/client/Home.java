package sat.com.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
//import com.google.gwt.dev.asm.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Home implements EntryPoint {
        

    private Button btn;
    private Button btn2; 
    private  int i =0;

    public void onModuleLoad() {
        
        MenuBar menu = new MenuBar();
        Command cmd = new Command() {
            
            public void execute () {
                
                Window.alert("clicke d");
            }
            
        };
        menu.addItem(new MenuItem("File", cmd));
        menu.addItem(new MenuItem("Edit", cmd));
        menu.addItem(new MenuItem("Save", cmd));
        
        
        DatePicker dp = new DatePicker();        
        btn = new Button("click me");
        btn2 = new Button("='("); 
      
        btn.addClickHandler(new ClickHandler() {

                       @Override
            public void onClick(ClickEvent event) {
                if (i++ %2 ==0)
                    btn2.setText("=)");
                else
                    btn2.setText("=(");

            }
        });
        RootPanel.get().add(dp);
        RootPanel.get().add(btn);
        RootPanel.get().add(btn2);
        RootPanel.get().add(menu);
        

    }
}
