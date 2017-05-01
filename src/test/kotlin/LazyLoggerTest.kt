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

import org.junit.Assert.*
import org.junit.Test
import org.slf4j.KLogger
import org.slf4j.lazyLogger
import java.util.*

class LazyLoggerTest {
    @Test
    fun withKClass() {
        val logger = lazyLogger(LazyLoggerTest::class)

        assertTrue(logger is Lazy<KLogger>)
        assertNotNull(logger.value)
        assertTrue(logger.value is KLogger)
        assertEquals(LazyLoggerTest::class.simpleName, logger.value.name)
    }

    @Test
    fun withJavaClass() {
        val logger = lazyLogger(LazyLoggerTest::class.java)

        assertTrue(logger is Lazy<KLogger>)
        assertNotNull(logger.value)
        assertTrue(logger.value is KLogger)
        assertEquals(LazyLoggerTest::class.simpleName, logger.value.name)
    }

    @Test
    fun withName() {
        val name = UUID.randomUUID().toString()
        val logger = lazyLogger(name)

        assertTrue(logger is Lazy<KLogger>)
        assertNotNull(logger.value)
        assertTrue(logger.value is KLogger)
        assertEquals(name, logger.value.name)
    }
}
