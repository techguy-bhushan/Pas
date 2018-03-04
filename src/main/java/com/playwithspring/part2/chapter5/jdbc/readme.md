**Note:**

**Spring’s data access exceptions** Rooted with DataAccessException(unchecked exception).
* CannotAcquireLockException
* CannotSerializeTransactionException
* CleanupFailureDataAccessException
* ConcurrencyFailureException
* DataAccessException
* DataAccessResourceFailureException
* DataIntegrityViolationException
* DataRetrievalFailureException
* DeadlockLoserDataAccessException
* EmptyResultDataAccessException
* IncorrectResultSizeDataAccessException
* IncorrectUpdateSemanticsDataAccessException
* InvalidDataAccessApiUsageException
* InvalidDataAccessResourceUsageException
* OptimisticLockingFailureException
* PermissionDeniedDataAccessException
* PessimisticLockingFailureException
* TypeMismatchDataAccessException
* UncategorizedDataAccessException

JDBC driver-based data source : 
* **DriverManagerDataSource** —Returns a new connection every time that a con-
nection is requested. Unlike DBCP ’s BasicDataSource , the connections pro-
vided by DriverManagerDataSource aren’t pooled.
* **SingleConnectionDataSource** —Returns the same connection every time a
connection is requested. Although SingleConnectionDataSource isn’t exactly
a pooled data source, you can think of it as a data source with a pool of exactly
one connection.

Database Connection Pooling(DBCP) includes several data sources that provide pooling, but the **BasicDataSource** (apache) is one that’s often used because it’s simple to configure in Spring and because it

-----------------------JDBC TEMPLATE-----------------------------------------

* **JdbcTemplate** —The most basic of Spring’s JDBC templates, this class provides
simple access to a database through JDBC and simple indexed-parameter queries.
* **NamedParameterJdbcTemplate** —This JDBC template class enables you to per-
form queries where values are bound to named parameters in SQL , rather than
indexed parameters.
* **SimpleJdbcTemplate** —This version of the JDBC template takes advantage of
Java 5 features such as autoboxing, generics, and variable parameter lists to sim-
plify how a JDBC template is used.


