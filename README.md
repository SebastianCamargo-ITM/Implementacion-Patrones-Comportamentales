# AUTENTICACIÓN DE USUARIO (CHAIN OF RESPONSIBILITY) 

Se necesita desarrollar una funcionalidad para un sistema de autenticación de usuarios. Esta funcionalidad debe ofrecer diferentes métodos de verificación que pueden aplicarse secuencialmente. Cada paso de verificación representa un nivel específico de autenticación que el usuario debe superar para obtener acceso al sistema. La estructura del proceso de autenticación debe ser flexible, permitiendo la adición, eliminación o modificación de los pasos de verificación según las necesidades. 

El sistema debe adaptarse a diferentes niveles de complejidad en la autenticación, que permita encadenar múltiples pasos de verificación que pueden variar en dificultad y tipo de validación. 

Se selecciona el patrón Chain of Responsibility como la solución más adecuada ya que con el patrón Chain of Responsibility, podemos construir una cadena de verificación donde cada objeto tiene la responsabilidad de procesar una solicitud de autenticación o de pasársela al siguiente objeto en la cadena. Esto proporciona una forma modular y flexible de construir y gestionar el proceso de autenticación, facilitando la adición, eliminación o modificación de pasos de verificación de manera dinámica. 

Además, este patrón facilita la implementación de diferentes estrategias de autenticación que pueden ser combinadas según sea necesario. Por ejemplo, un paso de verificación puede ser la validación de credenciales, seguido de un paso de verificación de token, y luego una autenticación biométrica, todo como una cadena organizada y modificable. 

### Diagrama de Clases 

![Diagrama Entrega 3 - Patrones-AuthenticationChain drawio](https://github.com/SebastianCamargo-ITM/Implementacion-Patrones-Comportamentales/assets/160674875/95422c96-c853-4454-a971-9b9ac9732b82)




# CONTROL DE VERSIONES DE DOCUMENTOS (MEMENTO) 

Se necesita desarrollar una funcionalidad para un sistema de control de versiones de documentos. Esta funcionalidad debe permitir al usuario guardar y restaurar diferentes versiones de un documento a lo largo del tiempo. Cada versión del documento debe ser almacenada, permitiendo que el usuario pueda revertir a versiones anteriores o deshacer los cambios revertidos. 

Se selecciona el patrón Memento como la solución más adecuada. Con el patrón Memento, podemos capturar y almacenar el estado interno de un documento sin exponer los detalles de su implementación. Cada memento representa una versión específica del documento, permitiendo así guardar múltiples estados a lo largo del tiempo. Esto proporciona una forma modular y flexible de gestionar el control de versiones, facilitando la restauración de estados anteriores del documento de manera dinámica. 

Además, este patrón facilita la implementación de un historial de versiones que los usuarios pueden recorrer para ver los cambios realizados. El recorrido de los cambios se realiza mediante el uso del patrón Iterator, que permite iterar a través de los mementos almacenados de manera ordenada y eficiente. Por ejemplo, un usuario puede crear un memento del estado actual del documento antes de hacer cambios significativos, y luego, si es necesario, restaurar el documento a ese estado previo. De esta manera, se asegura la integridad y la capacidad de recuperación del documento en cualquier momento. 

### Diagrama de Clases 

![Diagrama Entrega 3 - Patrones-DocumentMemento drawio](https://github.com/SebastianCamargo-ITM/Implementacion-Patrones-Comportamentales/assets/160674875/0cf723f8-c2f6-48d4-9f19-e3346d4d8178)





# SISTEMA DE NAVEGACIÓN (STRATEGY) 

Se necesita desarrollar una funcionalidad para un sistema de navegación que permita a los usuarios elegir entre diferentes tipos de rutas: la ruta más rápida, la más corta o la ruta panorámica. Cada tipo de ruta representa una estrategia de cálculo diferente, que debe ser aplicable según las preferencias del usuario como los puntos de inicio y fin del viaje.  

Se selecciona el patrón Strategy como la solución más adecuada. Con el patrón Strategy, podemos definir una familia de algoritmos de cálculo de rutas, encapsular cada uno de ellos y hacerlos intercambiables. Esto permite que el sistema de navegación use la estrategia de cálculo de ruta más adecuada, según las preferencias del usuario. 

Además, este patrón facilita la extensión y el mantenimiento del sistema, ya que nuevas estrategias de cálculo de rutas pueden ser añadidas sin modificar el código existente. Por ejemplo, el usuario puede seleccionar la ruta más rápida durante horas pico para evitar congestiones, la ruta más corta cuando necesita llegar a un destino cercano rápidamente, o la ruta panorámica para disfrutar de un viaje más agradable y escénico. 

La flexibilidad del patrón Strategy también permitiría intercambiar automáticamente las estrategias para que el sistema responda a cambios en tiempo real, como el tráfico o condiciones climáticas, adaptando la ruta seleccionada de manera eficiente. 

![Diagrama Entrega 3 - Patrones-RoutingStrategy drawio](https://github.com/SebastianCamargo-ITM/Implementacion-Patrones-Comportamentales/assets/160674875/93362a27-60b2-485c-a1d6-77727dbf3a34)

 
