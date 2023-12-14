# Práctica Caja Negra

En esta práctica, vamos a aplicar la técnica de prueba de software conocida como Worst Case Robust Boundary Value Testing a la clase BST.

El Worst Case Robust Boundary Value Testing es una técnica de prueba exhaustiva que implica probar el sistema con todos los valores en los límites, justo dentro de los límites, y justo fuera de los límites. Esta técnica es especialmente efectiva para encontrar errores en los límites de los rangos de entrada.

Vamos a probar las funciones `insert`, `search` y `printBetweenLevel` de la clase BST. El árbol binario BST acepta números enteros como entrada. Los valores de los nodos deben encontrarse en el rango de [-2500, 2500). No se permitirán árboles con una profundidad mayor a 50.

# Pruebas de la clase InsertTest

El método `insert` de la clase BST se utiliza para insertar un valor específico en el árbol. Si el valor se inserta correctamente, el método aumenta el tamaño del árbol y coloca el valor en el nodo correspondiente. Si el valor está fuera del rango permitido, el método lanza una `IllegalArgumentException`, y una `DepthException` si intentamos insertar un elemento a una profundidad mayor que la permitida. A continuación, se detallan las pruebas realizadas, las entradas utilizadas, las salidas esperadas y las salidas reales.

1. `testInsertAtLowerBoundary()`: Probamos la inserción de `-2500`, que es el límite inferior del rango permitido. Esperábamos que el tamaño del BST fuera 1 y que el contenido de la raíz fuera `-2500`. Ambas expectativas se cumplieron.

2. `testInsertJustInsideLowerBoundary()`: Probamos la inserción de `-2499`, que está justo dentro del límite inferior. Esperábamos que el tamaño del BST fuera 1 y que el contenido de la raíz fuera `-2499`. Ambas expectativas se cumplieron.

3. `testInsertJustOutsideLowerBoundary()`: Probamos la inserción de `-2501`, que está justo fuera del límite inferior. Esperábamos que se lanzara una `IllegalArgumentException`. Esta expectativa se cumplió.

4. `testInsertAtUpperBoundary()`: Probamos la inserción de `2500`, que es el límite superior del rango permitido. Esperábamos que se lanzara una `IllegalArgumentException`. Sin embargo, esta prueba falló, lo que indica que la función `insert` no está manejando correctamente los valores en el límite superior.

5. `testInsertJustInsideUpperBoundary()`: Probamos la inserción de `2499`, que está justo dentro del límite superior. Esperábamos que el tamaño del BST fuera 1 y que el contenido de la raíz fuera `2499`. Ambas expectativas se cumplieron.

6. `testInsertJustOutsideUpperBoundary()`: Probamos la inserción de `2501`, que está justo fuera del límite superior. Esperábamos que se lanzara una `IllegalArgumentException`. Esta expectativa se cumplió.

7. `testInsertExceedingMaxDepth()`: Probamos la inserción de más elementos de los que permite la profundidad máxima del BST. Insertamos 50 elementos con éxito y esperábamos que se lanzara una `DepthException` al intentar insertar el 51º elemento. Esta expectativa se cumplió.

# Pruebas de la clase SearchTest

El método `search` de la clase BST se utiliza para buscar un valor específico en el árbol. Si el valor está presente en el árbol, el método devuelve el nodo que contiene ese valor. Si el valor no está presente, el método devuelve `null`.

Antes de ejecutar las pruebas, insertamos algunos elementos en el BST. Los elementos insertados son `-2500`, `-2499` y `2499`. A continuación, se detallan las pruebas realizadas, las entradas utilizadas, las salidas esperadas y las salidas reales.

1. `testSearchAtLowerBoundary()`: Probamos la búsqueda de `-2500`, que es el límite inferior del rango permitido. Esperábamos que el contenido del nodo devuelto fuera `-2500`. Esta expectativa se cumplió.

2. `testSearchJustInsideLowerBoundary()`: Probamos la búsqueda de `-2499`, que está justo dentro del límite inferior. Esperábamos que el contenido del nodo devuelto fuera `-2499`. Esta expectativa se cumplió.

3. `testSearchJustOutsideLowerBoundary()`: Probamos la búsqueda de `-2501`, que está justo fuera del límite inferior. Esperábamos que el resultado fuera `null`, indicando que el valor no se encontró en el BST. Esta expectativa se cumplió.

4. `testSearchAtUpperBoundary()`: Probamos la búsqueda de `2500`, que es el límite superior del rango permitido. Esperábamos que el resultado fuera `null`, indicando que el valor no se encontró en el BST. Esta expectativa se cumplió.

5. `testSearchJustInsideUpperBoundary()`: Probamos la búsqueda de `2499`, que está justo dentro del límite superior y es un elemento que hemos insertado previamente. Esperábamos que el contenido del nodo devuelto fuera `2499`. Esta expectativa se cumplió.

6. `testSearchJustOutsideUpperBoundary()`: Probamos la búsqueda de `2501`, que está justo fuera del límite superior. Esperábamos que el resultado fuera `null`, indicando que el valor no se encontró en el BST. Esta expectativa se cumplió.

7. `testSearchNonExistentValue()`: Probamos la búsqueda de `0`, que es un valor que no existe en el BST. Esperábamos que el resultado fuera `null`, indicando que el valor no se encontró en el BST. Esta expectativa se cumplió.

Estas pruebas cubren una variedad de casos, incluyendo valores en los límites, valores justo dentro y fuera de los límites, y valores que no existen en el BST. Al pasar todas estas pruebas, podemos tener confianza en que el método `search` de la clase BST está funcionando correctamente.

# Pruebas de la clase DepthTest

El método `depth` de la clase `BST` (Binary Search Tree) calcula y devuelve la profundidad máxima del árbol. Hemos utilizado pruebas de clases de equivalencia para verificar su correcto funcionamiento en diferentes escenarios.

A continuación, se detallan las pruebas realizadas, especificando las entradas utilizadas, las salidas esperadas y las salidas reales:

1. **Prueba `testDepthEmptyTree`**: Esta prueba verifica el caso en el que el árbol está vacío.
    - Entrada: Un árbol `BST` vacío.
    - Salida esperada: 0, ya que la profundidad de un árbol vacío es 0.
    - Salida real: El método `depth` devuelve 0, lo que indica que la prueba ha pasado.

2. **Prueba `testDepthSingleTreeNode`**: Esta prueba verifica el caso en el que el árbol tiene un solo nodo.
    - Entrada: Un árbol `BST` con un solo nodo.
    - Salida esperada: 1, ya que la profundidad de un árbol con un solo nodo es 1.
    - Salida real: El método `depth` devuelve 1, lo que indica que la prueba ha pasado.

3. **Prueba `testDepthMultipleTreeNodes`**: Esta prueba verifica el caso en el que el árbol tiene más de un nodo.
    - Entrada: Un árbol `BST` con varios nodos.
    - Salida esperada: Un número mayor que 1, ya que la profundidad de un árbol con más de un nodo es mayor que 1.
    - Salida real: El método `depth` devuelve un número mayor que 1, lo que indica que la prueba ha pasado.

La superación de estas pruebas muestra que el método `depth` de la clase `BST` está funcionando correctamente para estos casos de prueba.

# Pruebas de la clase SizeTest
Devuelve el número de nodos

# Pruebas de la clase DepthTest (Profundidad, no puede ser más de 50)
En el nivel 50 solo se puede insertar 1 número

# Pruebas de la clase toListTest
Devuelve la lista en orden de menor a mayor

# Pruebas de la clase GetSubTreeTest
Devuelve un subárbol del árbol principal

# GetRootTest
Devuelve el primer nodo. Para ello getRoot().getContent();

# PrintBetweenLevelTest
Verifica que el método devuelve correctamente los elementos entre los niveles especificados y que lanza excepciones cuando se le dan entradas inválidas.



