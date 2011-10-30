/**
 * Copyright 2011 Nikolche Mihajlovski
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

package org.jannocessor.model.structure;

import org.jannocessor.annotation.DomainModel;
import org.jannocessor.collection.api.PowerList;
import org.jannocessor.model.JavaElement;
import org.jannocessor.model.Name;
import org.jannocessor.model.executable.JavaMethod;
import org.jannocessor.model.type.JavaType;

@DomainModel
public interface AbstractJavaStructure extends JavaElement {

	String getNesting();

	Name getQualifiedName();

	JavaType getSuperclass();

	PowerList<JavaMetadata> getMetadata();

	PowerList<JavaMetadata> getAllMetadata();

	PowerList<JavaType> getInterfaces();

	PowerList<JavaMethod> getMethods();

	PowerList<JavaNestedClass> getNestedClasses();

	PowerList<JavaNestedEnum> getNestedEnums();

	PowerList<JavaNestedInterface> getNestedInterfaces();

	PowerList<JavaNestedAnnotation> getNestedAnnotations();

	@Override
	JavaElement getParent();

}
