# [slf4j-kotlin-extensions](https://github.com/FrimaStudio/slf4j-kotlin-extensions)

Utilities to make working with [slf4j](https://www.slf4j.org/) `Logger`s from [Kotlin](https://kotlinlang.org/) more enjoyable.

[![Build Status](https://travis-ci.org/FrimaStudio/slf4j-kotlin-extensions.svg?branch=master)](https://travis-ci.org/FrimaStudio/slf4j-kotlin-extensions)


## Lazy loggers
Contains 3 `lazyLogger` utilities to get `Lazy<org.slf4j.Logger>` instances:
```kotlin
class TheClass {
    // Lazy logger with KClass
    private val logger by lazyLogger(TheClass::class)
    
    // Lazy logger with Java class
    private val logger by lazyLogger(TheClass::class.java)
    
    // Lazy logger with name
    private val logger by lazyLogger("the-logger's-name")
}
```

## `org.slf4j.Logger` extensions
Contains extensions to use Kotlin's string expansion feature in SLF4J loggers:
```kotlin
class TheClass {
    private val logger by lazyLogger(TheClass::class)
    private val marker by lazy { MarkerFactory.getMarker("the-marker") }
    
    fun doSomething(param: Int) {
        logger.debug {
            // This will NOT be called if debug logs are not enabled for the logger ('isDebugEnabled')
            "You can now use Kotlin's string expansion for your logs :: $param"
        }
        
        logger.trace(marker) {
            "Also works with markers :: $param"
        }
        
        try {
            // Do something risky here
        } catch (e: Throwable) {
            logger.errorThrowable {
                "You can also use the (String, Throwable) overloads :: $param" to e
            }
        }
    }
}
```
All log functions support the same features (markers, throwables) even if not specifically demonstrated in the above example.

## Issues
Issues/requests should be entered in the project's [issues](https://github.com/FrimaStudio/slf4j-kotlin-extensions/issues) page.

## TODO
- Publish to MavenCentral (or any other public Maven repository)

---
This project uses [semantic versioning 2.0.0](http://semver.org/spec/v2.0.0.html).
