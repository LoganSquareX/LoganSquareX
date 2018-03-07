# LoganSquare
-keep class com.bluelinelabs.logansquare.** { *; }
-keep @io.logansquarex.core.annotation.JsonObject class *
-keep class **$$JsonObjectMapper { *; }

# Jackson
-dontwarn org.w3c.dom.bootstrap.DOMImplementationRegistry
