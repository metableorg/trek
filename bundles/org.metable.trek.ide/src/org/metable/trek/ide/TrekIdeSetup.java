/*
 * generated by Xtext 2.31.0
 */
package org.metable.trek.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.metable.trek.TrekRuntimeModule;
import org.metable.trek.TrekStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TrekIdeSetup extends TrekStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TrekRuntimeModule(), new TrekIdeModule()));
	}
	
}
