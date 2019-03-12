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

import com.nhaarman.mockito_kotlin.*
import org.junit.jupiter.api.Test
import org.slf4j.*
import java.util.*

class ExtensionsTest {
    private val logger: Logger = mock()
    private val marker: Marker = mock()
    private val throwable: Throwable = mock()

    @Test
    fun trace_enabled() {
        given(logger.isTraceEnabled).willReturn(true)

        logger.trace {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isTraceEnabled
        then(logger).should(order).trace(TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun trace_disabled() {
        given(logger.isTraceEnabled).willReturn(false)

        logger.trace {
            TEST_STR
        }

        then(logger).should().isTraceEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun trace_marker_enabled() {
        given(logger.isTraceEnabled(marker)).willReturn(true)

        logger.trace(marker) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isTraceEnabled(marker)
        then(logger).should(order).trace(marker, TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun trace_marker_disabled() {
        given(logger.isTraceEnabled(marker)).willReturn(false)

        logger.trace(marker) {
            TEST_STR
        }

        then(logger).should().isTraceEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun traceThrowable_enabled() {
        given(logger.isTraceEnabled).willReturn(true)

        logger.trace(throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isTraceEnabled
        then(logger).should(order).trace(TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun traceThrowable_disabled() {
        given(logger.isTraceEnabled).willReturn(false)

        logger.trace(throwable) {
            TEST_STR
        }

        then(logger).should().isTraceEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun traceThrowable_marker_enabled() {
        given(logger.isTraceEnabled(marker)).willReturn(true)

        logger.trace(marker, throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isTraceEnabled(marker)
        then(logger).should(order).trace(marker, TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun traceThrowable_marker_disabled() {
        given(logger.isTraceEnabled(marker)).willReturn(false)

        logger.trace(marker, throwable) {
            TEST_STR
        }

        then(logger).should().isTraceEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun debug_enabled() {
        given(logger.isDebugEnabled).willReturn(true)

        logger.debug {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isDebugEnabled
        then(logger).should(order).debug(TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun debug_disabled() {
        given(logger.isDebugEnabled).willReturn(false)

        logger.debug {
            TEST_STR
        }

        then(logger).should().isDebugEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun debug_marker_enabled() {
        given(logger.isDebugEnabled(marker)).willReturn(true)

        logger.debug(marker) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isDebugEnabled(marker)
        then(logger).should(order).debug(marker, TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun debug_marker_disabled() {
        given(logger.isDebugEnabled(marker)).willReturn(false)

        logger.debug(marker) {
            TEST_STR
        }

        then(logger).should().isDebugEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun debugThrowable_enabled() {
        given(logger.isDebugEnabled).willReturn(true)

        logger.debug(throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isDebugEnabled
        then(logger).should(order).debug(TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun debugThrowable_disabled() {
        given(logger.isDebugEnabled).willReturn(false)

        logger.debug(throwable) {
            TEST_STR
        }

        then(logger).should().isDebugEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun debugThrowable_marker_enabled() {
        given(logger.isDebugEnabled(marker)).willReturn(true)

        logger.debug(marker, throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isDebugEnabled(marker)
        then(logger).should(order).debug(marker, TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun debugThrowable_marker_disabled() {
        given(logger.isDebugEnabled(marker)).willReturn(false)

        logger.debug(marker, throwable) {
            TEST_STR
        }

        then(logger).should().isDebugEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun info_enabled() {
        given(logger.isInfoEnabled).willReturn(true)

        logger.info {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isInfoEnabled
        then(logger).should(order).info(TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun info_disabled() {
        given(logger.isInfoEnabled).willReturn(false)

        logger.info {
            TEST_STR
        }

        then(logger).should().isInfoEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun info_marker_enabled() {
        given(logger.isInfoEnabled(marker)).willReturn(true)

        logger.info(marker) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isInfoEnabled(marker)
        then(logger).should(order).info(marker, TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun info_marker_disabled() {
        given(logger.isInfoEnabled(marker)).willReturn(false)

        logger.info(marker) {
            TEST_STR
        }

        then(logger).should().isInfoEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun infoThrowable_enabled() {
        given(logger.isInfoEnabled).willReturn(true)

        logger.info(throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isInfoEnabled
        then(logger).should(order).info(TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun infoThrowable_disabled() {
        given(logger.isInfoEnabled).willReturn(false)

        logger.info(throwable) {
            TEST_STR
        }

        then(logger).should().isInfoEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun infoThrowable_marker_enabled() {
        given(logger.isInfoEnabled(marker)).willReturn(true)

        logger.info(marker, throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isInfoEnabled(marker)
        then(logger).should(order).info(marker, TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun infoThrowable_marker_disabled() {
        given(logger.isInfoEnabled(marker)).willReturn(false)

        logger.info(marker, throwable) {
            TEST_STR
        }

        then(logger).should().isInfoEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun warn_enabled() {
        given(logger.isWarnEnabled).willReturn(true)

        logger.warn {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isWarnEnabled
        then(logger).should(order).warn(TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun warn_disabled() {
        given(logger.isWarnEnabled).willReturn(false)

        logger.warn {
            TEST_STR
        }

        then(logger).should().isWarnEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun warn_marker_enabled() {
        given(logger.isWarnEnabled(marker)).willReturn(true)

        logger.warn(marker) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isWarnEnabled(marker)
        then(logger).should(order).warn(marker, TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun warn_marker_disabled() {
        given(logger.isWarnEnabled(marker)).willReturn(false)

        logger.warn(marker) {
            TEST_STR
        }

        then(logger).should().isWarnEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun warnThrowable_enabled() {
        given(logger.isWarnEnabled).willReturn(true)

        logger.warn(throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isWarnEnabled
        then(logger).should(order).warn(TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun warnThrowable_disabled() {
        given(logger.isWarnEnabled).willReturn(false)

        logger.warn(throwable) {
            TEST_STR
        }

        then(logger).should().isWarnEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun warnThrowable_marker_enabled() {
        given(logger.isWarnEnabled(marker)).willReturn(true)

        logger.warn(marker, throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isWarnEnabled(marker)
        then(logger).should(order).warn(marker, TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun warnThrowable_marker_disabled() {
        given(logger.isWarnEnabled(marker)).willReturn(false)

        logger.warn(marker, throwable) {
            TEST_STR
        }

        then(logger).should().isWarnEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun error_enabled() {
        given(logger.isErrorEnabled).willReturn(true)

        logger.error {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isErrorEnabled
        then(logger).should(order).error(TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun error_disabled() {
        given(logger.isErrorEnabled).willReturn(false)

        logger.error {
            TEST_STR
        }

        then(logger).should().isErrorEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun error_marker_enabled() {
        given(logger.isErrorEnabled(marker)).willReturn(true)

        logger.error(marker) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isErrorEnabled(marker)
        then(logger).should(order).error(marker, TEST_STR)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun error_marker_disabled() {
        given(logger.isErrorEnabled(marker)).willReturn(false)

        logger.error(marker) {
            TEST_STR
        }

        then(logger).should().isErrorEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun errorThrowable_enabled() {
        given(logger.isErrorEnabled).willReturn(true)

        logger.error(throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isErrorEnabled
        then(logger).should(order).error(TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun errorThrowable_disabled() {
        given(logger.isErrorEnabled).willReturn(false)

        logger.error(throwable) {
            TEST_STR
        }

        then(logger).should().isErrorEnabled
        verifyNoMoreInteractions(logger)
    }

    @Test
    fun errorThrowable_marker_enabled() {
        given(logger.isErrorEnabled(marker)).willReturn(true)

        logger.error(marker, throwable) {
            TEST_STR
        }

        val order = inOrder(logger)
        then(logger).should(order).isErrorEnabled(marker)
        then(logger).should(order).error(marker, TEST_STR, throwable)
        order.verifyNoMoreInteractions()
    }

    @Test
    fun errorThrowable_marker_disabled() {
        given(logger.isErrorEnabled(marker)).willReturn(false)

        logger.error(marker, throwable) {
            TEST_STR
        }

        then(logger).should().isErrorEnabled(marker)
        verifyNoMoreInteractions(logger)
    }

    companion object {
        private val TEST_STR = UUID.randomUUID().toString()
    }
}
