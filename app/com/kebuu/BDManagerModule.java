package com.kebuu;

import service.FakeService;
import service.IFakeService;

import com.google.inject.AbstractModule;

/**
 * Contains Guice configuration.
 */
public class BDManagerModule extends AbstractModule{

	@Override
	protected void configure() {
		this.bind(IFakeService.class).to(FakeService.class);
	}
}
