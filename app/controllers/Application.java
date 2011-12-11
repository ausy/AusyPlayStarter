package controllers;

import javax.inject.Inject;

import service.IFakeService;



public class Application extends LoggedApplication {

	@Inject
	public static IFakeService fakeService;
	
	public static void index() {
		render();
	}
}