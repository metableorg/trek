/*
 * generated by Xtext 2.31.0
 */
package org.metable.trek.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.metable.trek.ui.internal.TrekActivator;

public class TrekUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TrekActivator.getInstance().getInjector("org.metable.trek.Trek");
	}

}
