PIZZA BOMBA:
 Es un pequeño proyecto de ventas llevada a android nativo como desafio personal, antes elaborado en la plataforma .NET MAUI. Para su uso se ha utilizado los siguientes recursos:
 - Arquitectura MVVM
 - Dagger Hilt : Para inyeccion de Dependencias
 - Room: Para guardar algunos datos que son necesarios en el dispositivo local
 - Retrofit: Consumo de API y otros servicios Webs

En el proyecto se usaron patrones de diseno para fundamentalmente controlar la construccion de objetos , mediante un patron Facory, fundamentalmente para los modelo de datos de la aplicacion. En el caso del Dominio, en este caso esta encapsulado en el paquete Servicio ya que en dicho paquete esta la logica de obtencion de datos y la logica general d ela aplicacion, aunque se desvia un poco del uso del Clean Arquitecture quize experimentar con otro enfoque exactamente con el Modelo por Capas, o sea la organizacion del proyectos en capas de logica, en este caso, es el programador que decide por cuantas capaz es necesario pasar para la solucion final, y no esta acotada solo a 4 capas, repito, es solo para experimentar un nuevo enfoque en el desarrollo de aplicaciones Android. 
