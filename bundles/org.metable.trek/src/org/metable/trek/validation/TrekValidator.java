/*
 * generated by Xtext 2.31.0
 */
package org.metable.trek.validation;

import org.eclipse.xtext.validation.Check;
import org.metable.trek.trek.RepComponent;
import org.metable.trek.trek.RepComponentType;
import org.metable.trek.trek.TrekPackage;
import org.metable.trek.trek.Type;
import org.metable.trek.trek.TypeType;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class TrekValidator extends AbstractTrekValidator {

//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					TrekPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}

	@Check
	public void checkTypeDoesNotReferenceSelfInRepresentationComponent(RepComponentType repComponentType) {

		if (!(repComponentType instanceof TypeType)) {
			return;
		}

		TypeType componentType = (TypeType) repComponentType;
		RepComponent repComponent = (RepComponent) componentType.eContainer();
		Type parentType = (Type) repComponent.eContainer().eContainer();

		if (componentType.getType() != parentType) {
			return;
		}

		error("type '" + parentType.getName() + "' can not reference self in representation component '"
				+ repComponent.getName() + "'", TrekPackage.eINSTANCE.getTypeType_Type());
	}
}
