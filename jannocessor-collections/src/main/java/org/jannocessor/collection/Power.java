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

package org.jannocessor.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.jannocessor.collection.api.PowerList;
import org.jannocessor.collection.api.PowerMap;
import org.jannocessor.collection.api.PowerSet;
import org.jannocessor.collection.filter.api.Condition;
import org.jannocessor.collection.filter.api.Criteria;
import org.jannocessor.collection.filter.impl.CriteriaImpl;
import org.jannocessor.collection.impl.PowerArrayList;
import org.jannocessor.collection.impl.PowerLinkedHashMap;
import org.jannocessor.collection.impl.PowerLinkedHashSet;

public class Power {

	public static <T> PowerList<T> list(T... items) {
		return PowerArrayList.create(items);
	}

	@SuppressWarnings("unchecked")
	public static <T> PowerList<T> emptyList() {
		return PowerArrayList.create();
	}

	@SuppressWarnings("unchecked")
	public static <T> PowerList<T> emptyList(Class<T> clazz) {
		return PowerArrayList.create();
	}

	public static <T> PowerList<T> unmodifiableList(T... items) {
		// FIXME: Implement this!
		return PowerArrayList.create(items);
	}

	public static <T> PowerList<T> list(Collection<T> collection) {
		return PowerArrayList.powerList(collection);
	}

	public static <T> PowerSet<T> set(T... items) {
		return PowerLinkedHashSet.create(items);
	}

	public static <T> PowerSet<T> set(Collection<T> collection) {
		return PowerLinkedHashSet.powerSet(collection);
	}

	public static <K, V> PowerMap<K, V> map() {
		return PowerLinkedHashMap.powerMap();
	}

	public static <K, V> PowerMap<K, V> map(Class<K> keyClass,
			Class<V> valueClass) {
		return PowerLinkedHashMap.powerMap();
	}

	public static <K, V> PowerMap<K, V> map(K key, V value) {
		return PowerLinkedHashMap.powerMap(key, value);
	}

	public static <K, V> PowerMap<K, V> map(K key1, V value1, K key2, V value2) {
		return PowerLinkedHashMap.powerMap(key1, value1, key2, value2);
	}

	public static <K, V> PowerMap<K, V> map(K key1, V value1, K key2, V value2,
			K key3, V value3) {
		return PowerLinkedHashMap.powerMap(key1, value1, key2, value2, key3,
				value3);
	}

	public static <K, V> PowerMap<K, V> map(Map<K, V> map) {
		return PowerLinkedHashMap.powerMap(map);
	}

	public static <K, V> PowerMap<K, V> map(Set<Entry<K, V>> entrySet) {
		return PowerLinkedHashMap.powerMap(entrySet);
	}

	public static <T> Criteria<T> criteria(Condition<T> condition) {
		return CriteriaImpl.create(condition);
	}

}
