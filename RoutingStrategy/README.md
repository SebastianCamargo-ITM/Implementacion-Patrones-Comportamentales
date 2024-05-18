## SISTEMA DE NAVEGACIÓN (STRATEGY) 

Se selecciona el patrón Strategy como la solución más adecuada. Con el patrón Strategy, podemos definir una familia de algoritmos de cálculo de rutas, encapsular cada uno de ellos y hacerlos intercambiables. Esto permite que el sistema de navegación use la estrategia de cálculo de ruta más adecuada, según las preferencias del usuario. 

Además, este patrón facilita la extensión y el mantenimiento del sistema, ya que nuevas estrategias de cálculo de rutas pueden ser añadidas sin modificar el código existente. Por ejemplo, el usuario puede seleccionar la ruta más rápida durante horas pico para evitar congestiones, la ruta más corta cuando necesita llegar a un destino cercano rápidamente, o la ruta panorámica para disfrutar de un viaje más agradable y escénico. 

La flexibilidad del patrón Strategy también permitiría intercambiar automáticamente las estrategias para que el sistema responda a cambios en tiempo real, como el tráfico o condiciones climáticas, adaptando la ruta seleccionada de manera eficiente 