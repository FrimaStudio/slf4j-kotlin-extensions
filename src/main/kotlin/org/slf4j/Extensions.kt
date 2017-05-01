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

/**
 * Log a message at the TRACE level.
 *
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isTraceEnabled] returns true.
 */
inline fun Logger.trace(crossinline block: () -> String) {
    if (isTraceEnabled) {
        trace(block())
    }
}

/**
 * Log a message with the specific [Marker] at the TRACE level.
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isTraceEnabled] returns true.
 */
inline fun Logger.trace(marker: Marker, crossinline block: (Marker) -> String) {
    if (isTraceEnabled(marker)) {
        trace(marker, block(marker))
    }
}

/**
 * Log an exception (throwable) at the TRACE level with an
 * accompanying message.
 *
 * @param block lazy-evaluated function that returns the message and exception to log.
 * Will not be called unless [Logger.isTraceEnabled] returns true.
 */
inline fun Logger.traceThrowable(crossinline block: () -> Pair<String, Throwable>) {
    if (isTraceEnabled) {
        val (msg, throwable) = block()
        trace(msg, throwable)
    }
}

/**
 * Log an exception (throwable) at the TRACE level with an
 * accompanying message and with the specified [Marker]
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isTraceEnabled] returns true.
 */
inline fun Logger.traceThrowable(marker: Marker, crossinline block: (Marker) -> Pair<String, Throwable>) {
    if (isTraceEnabled(marker)) {
        val (msg, throwable) = block(marker)
        trace(marker, msg, throwable)
    }
}

/**
 * Log a message at the DEBUG level.
 *
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isDebugEnabled] returns true.
 */
inline fun Logger.debug(crossinline block: () -> String) {
    if (isDebugEnabled) {
        debug(block())
    }
}

/**
 * Log a message with the specific [Marker] at the DEBUG level.
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isDebugEnabled] returns true.
 */
inline fun Logger.debug(marker: Marker, crossinline block: (Marker) -> String) {
    if (isDebugEnabled(marker)) {
        debug(marker, block(marker))
    }
}

/**
 * Log an exception (throwable) at the DEBUG level with an
 * accompanying message.
 *
 * @param block lazy-evaluated function that returns the message and exception to log.
 * Will not be called unless [Logger.isDebugEnabled] returns true.
 */
inline fun Logger.debugThrowable(crossinline block: () -> Pair<String, Throwable>) {
    if (isDebugEnabled) {
        val (msg, throwable) = block()
        debug(msg, throwable)
    }
}

/**
 * Log an exception (throwable) at the DEBUG level with an
 * accompanying message and with the specified [Marker]
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isDebugEnabled] returns true.
 */
inline fun Logger.debugThrowable(marker: Marker, crossinline block: (Marker) -> Pair<String, Throwable>) {
    if (isDebugEnabled(marker)) {
        val (msg, throwable) = block(marker)
        debug(marker, msg, throwable)
    }
}

/**
 * Log a message at the INFO level.
 *
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isInfoEnabled] returns true.
 */
inline fun Logger.info(crossinline block: () -> String) {
    if (isInfoEnabled) {
        info(block())
    }
}

/**
 * Log a message with the specific [Marker] at the INFO level.
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isInfoEnabled] returns true.
 */
inline fun Logger.info(marker: Marker, crossinline block: (Marker) -> String) {
    if (isInfoEnabled(marker)) {
        info(marker, block(marker))
    }
}

/**
 * Log an exception (throwable) at the INFO level with an
 * accompanying message.
 *
 * @param block lazy-evaluated function that returns the message and exception to log.
 * Will not be called unless [Logger.isInfoEnabled] returns true.
 */
inline fun Logger.infoThrowable(crossinline block: () -> Pair<String, Throwable>) {
    if (isInfoEnabled) {
        val (msg, throwable) = block()
        info(msg, throwable)
    }
}

/**
 * Log an exception (throwable) at the INFO level with an
 * accompanying message and with the specified [Marker]
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isInfoEnabled] returns true.
 */
inline fun Logger.infoThrowable(marker: Marker, crossinline block: (Marker) -> Pair<String, Throwable>) {
    if (isInfoEnabled(marker)) {
        val (msg, throwable) = block(marker)
        info(marker, msg, throwable)
    }
}

/**
 * Log a message at the WARN level.
 *
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isWarnEnabled] returns true.
 */
inline fun Logger.warn(crossinline block: () -> String) {
    if (isWarnEnabled) {
        warn(block())
    }
}

/**
 * Log a message with the specific [Marker] at the WARN level.
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isWarnEnabled] returns true.
 */
inline fun Logger.warn(marker: Marker, crossinline block: (Marker) -> String) {
    if (isWarnEnabled(marker)) {
        warn(marker, block(marker))
    }
}

/**
 * Log an exception (throwable) at the WARN level with an
 * accompanying message.
 *
 * @param block lazy-evaluated function that returns the message and exception to log.
 * Will not be called unless [Logger.isWarnEnabled] returns true.
 */
inline fun Logger.warnThrowable(crossinline block: () -> Pair<String, Throwable>) {
    if (isWarnEnabled) {
        val (msg, throwable) = block()
        warn(msg, throwable)
    }
}

/**
 * Log an exception (throwable) at the WARN level with an
 * accompanying message and with the specified [Marker]
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isWarnEnabled] returns true.
 */
inline fun Logger.warnThrowable(marker: Marker, crossinline block: (Marker) -> Pair<String, Throwable>) {
    if (isWarnEnabled(marker)) {
        val (msg, throwable) = block(marker)
        warn(marker, msg, throwable)
    }
}

/**
 * Log a message at the ERROR level.
 *
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isErrorEnabled] returns true.
 */
inline fun Logger.error(crossinline block: () -> String) {
    if (isErrorEnabled) {
        error(block())
    }
}

/**
 * Log a message with the specific [Marker] at the ERROR level.
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isErrorEnabled] returns true.
 */
inline fun Logger.error(marker: Marker, crossinline block: (Marker) -> String) {
    if (isErrorEnabled(marker)) {
        error(marker, block(marker))
    }
}

/**
 * Log an exception (throwable) at the ERROR level with an
 * accompanying message.
 *
 * @param block lazy-evaluated function that returns the message and exception to log.
 * Will not be called unless [Logger.isErrorEnabled] returns true.
 */
inline fun Logger.errorThrowable(crossinline block: () -> Pair<String, Throwable>) {
    if (isErrorEnabled) {
        val (msg, throwable) = block()
        error(msg, throwable)
    }
}

/**
 * Log an exception (throwable) at the ERROR level with an
 * accompanying message and with the specified [Marker]
 *
 * @param marker the marker data specific to this log statement
 * @param block lazy-evaluated function that returns the message to log.
 * Will not be called unless [Logger.isErrorEnabled] returns true.
 */
inline fun Logger.errorThrowable(marker: Marker, crossinline block: (Marker) -> Pair<String, Throwable>) {
    if (isErrorEnabled(marker)) {
        val (msg, throwable) = block(marker)
        error(marker, msg, throwable)
    }
}
