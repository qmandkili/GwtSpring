package com.gwt.startpoint.client;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class StartPoint implements EntryPoint {
	
	private final WorkerClient client = GWT.create(WorkerClient.class);

    private static final String HELLO_MESSAGE = "Hi, I'm your gwt application!";
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
    	/*final Label label = new Label();
    	client.get(new MethodCallback<String>() {
			
			@Override
			public void onSuccess(Method method, String response) {
				// TODO Auto-generated method stub
				label.setText(response);
			}
			
			@Override
			public void onFailure(Method method, Throwable exception) {
				// TODO Auto-generated method stub
				label.setText(exception.getMessage());
			}
		});*/
    	
    	
    	Button send = new Button("Send");
    	send.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                client.get(new MethodCallback<Integer>() {
					
					@Override
					public void onSuccess(Method method, Integer response) {
						// TODO Auto-generated method stub
						Window.alert(response.toString());
					}
					
					@Override
					public void onFailure(Method method, Throwable exception) {
						// TODO Auto-generated method stub
						Window.alert(exception.toString() + "\n" + exception.getMessage());
					}
				});
            }
        });
    	
    	RootPanel.get().add(send);    	
    	
        final Label label = new Label(HELLO_MESSAGE);
        RootPanel.get().add(label);

        final Button button = new Button("Click me");
        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                Window.alert("You press on me! Don't it anymore");
            }
        });
        RootPanel.get().add(button);
    }
}
