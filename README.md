In Java, the "try-with-resources" statement is used to automatically manage resources that implement the AutoCloseable interface.
JDBC resources, such as database connections, statements, and result sets, fall under this category.

The try-with-resources statement ensures that these resources are properly closed after the execution block,
even in the event of an exception being thrown. 
