
**Note: InitializingBean and DisposableBean**

An optional way to define init and destroy methods for a bean is to write the bean
class to implement Spring’s InitializingBean and DisposableBean interfaces.
The Spring container treats beans that implement these interfaces in a special way
by allowing them to hook into the bean lifecycle. InitializingBean declares an
afterPropertiesSet() method that serves as the init method. As for Disposable-
Bean, it declares a destroy() method that gets called when a bean is removed from
the application context.

The chief benefit of using these lifecycle interfaces is that the Spring container can
automatically detect beans that implement them without any external configuration.
The disadvantage of implementing these interfaces is that you couple your applica-
tion’s beans to Spring’s API. For this reason alone, I recommend that you rely on the
init-method and destroy-method attributes to initialize and destroy your beans.
The only scenario where you might favor Spring’s lifecycle interfaces is if you’re devel-
oping a framework bean that’s to be used specifically within Spring’s container.