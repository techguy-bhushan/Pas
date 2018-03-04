I love this feature
**Introducing new functionality with aspects**

Some languages, such as Ruby and Groovy, have the notion of open classes. They make
it possible to add new methods to an object or class without directly changing the def-
inition of those objects/classes. Unfortunately, Java isn’t quite that dynamic. Once a
class has been compiled, there’s little you can do to append new functionality to it.
But if you think about it, isn’t that what we’ve been doing in this chapter with
aspects? Sure, we haven’t added any new methods to objects, but we’re adding new
functionality around the methods that the objects already have. If an aspect can wrap
existing methods with additional functionality, why not add new methods to the
object? In fact, using an AOP concept known as **introduction**, aspects can attach all new
methods to Spring beans.