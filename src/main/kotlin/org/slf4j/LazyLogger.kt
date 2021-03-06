/*
 * Copyright 2017 Frima Studio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.slf4j

import org.slf4j.LoggerFactory.getLogger
import kotlin.reflect.KClass

/**
 * Returns a [Lazy] instantiated [Logger] instance for the specified [KClass].
 */
fun lazyLogger(clazz: KClass<*>): Lazy<KLogger> = lazyLogger(clazz.java)

/**
 * Returns a [Lazy] instantiated [Logger] instance for the specified [Class].
 */
fun lazyLogger(clazz: Class<*>): Lazy<KLogger> = lazy { KLogger(getLogger(clazz)) }

/**
 * Returns a [Lazy] instantiated [Logger] instance with the specified name.
 */
fun lazyLogger(name: String): Lazy<KLogger> = lazy { KLogger(getLogger(name)) }
