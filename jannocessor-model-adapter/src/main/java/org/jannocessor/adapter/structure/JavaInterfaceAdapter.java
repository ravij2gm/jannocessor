/**
 * Copyright 2011 jannocessor.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jannocessor.adapter.structure;

import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

import org.jannocessor.model.bean.modifier.InterfaceModifiersBean;
import org.jannocessor.model.modifier.InterfaceModifiers;
import org.jannocessor.model.modifier.value.InterfaceModifierValue;
import org.jannocessor.model.structure.JavaInterface;
import org.jannocessor.model.util.Code;

public final class JavaInterfaceAdapter extends AbstractJavaInterfaceAdapter
		implements JavaInterface {

	@SuppressWarnings("unused")
	private final TypeElement tinterface;

	public JavaInterfaceAdapter(TypeElement tinterface, Elements elementUtils,
			Types typeUtils) {
		super(tinterface, elementUtils, typeUtils);
		this.setCode(Code.code(JavaInterface.class));
		this.tinterface = tinterface;
	}

	@Override
	public InterfaceModifiers getModifiers() {
		return new InterfaceModifiersBean(
				getModifierValues(InterfaceModifierValue.class));
	}

}