package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready!"));
    }

    public Result hello() {
    	return ok("Hello World");
    }

    public Result echo(String msg) {
    	return ok("Echoing " + msg);	
    }

    public Result helloRedirect() {
    	return redirect (controllers.routes.Application.hello()); 
    }
}

