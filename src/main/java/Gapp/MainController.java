package Gapp;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController {
	@FXML
    private WebView webView;
    @FXML
    private WebView menuView;
    @FXML
    private WebView areaView;
    
    private WebEngine login;
	/*
	 * private WebEngine menu; private WebEngine visualization;
	 */

    @FXML
    public void initialize() {
    	
    	try {
    	    new Thread(() -> {
    	        try {
    	            ServidorHTTP.main(new String[]{});
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
    	    }).start();
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}


    	
    	
        login = webView.getEngine();
        login.setJavaScriptEnabled(true);
        
        String path = getClass().getResource("/index.html").toString();
        System.out.println("Carregando HTML de: " + path);
        login.load(path);
    }
	
	/*
	 * @FXML public void initializeMenu() {
	 * 
	 * menu = menuView.getEngine(); visualization = areaView.getEngine();
	 * 
	 * String menuPath = new
	 * File("D:\\java\\webtest\\src\\html\\menu.html").toURI().toString(); String
	 * viewPath = new
	 * File("D:\\java\\webtest\\src\\html\\presentations.html").toURI().toString();
	 * 
	 * menu.load(menuPath); visualization.load(viewPath);
	 * 
	 * }
	 */
	
}
