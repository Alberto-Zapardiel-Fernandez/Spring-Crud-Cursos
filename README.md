# Spring-Crud-Cursos

<h2>La aplicación consta de un CRUD y una API REST de Cursos, conectada a una base de datos para hacer las operaciones.</h2>

<h2>Tenemos varios paquetes</h2>

<ol>
  <li><h3>Controller</h3>  Es el encargado de gestionar las rutas y endpoints hacia donde lanzar nuestras consultas
  #Pueden ser:
    <ul>
      <li>GET: Para obtener los datos requeridos</li>
      <li>POST: Para almacenar los cursos nuevos a insertar</li>
      <li>PUT: Para actualizar el cursos que queramos </li>
      <li>DELETE: Para borrar el curso según el ID que le pasemos por parámetro</li>
    </ul>
    <br>
    <h6>Tenemos un método de tipo <i>POST</i> altaCurso(Curso curso) al cual le pasamos un curso y según su Id le modificamos los datos</h6>
    <h6>Tenemos un método de tipo <i>DELETE</i> borrarCurso(int id) al cual le pasamos un id de un curso y lo borramos</h6>
    <h6>Tenemos un método de tipo <i>GET</i> buscarCurso(int id) al cual le pasamos id de un curso y devolvemos los datos de este en formato <i>JSON</i></h6>
    <h6>Tenemos otro método de tipo <i>GET</i> verCursosPorPrecio(Double pmin, Double pmax) al cual le pasamos un precio mínimo y otro máximo y filtramos entre todos los cursos y los retornamos en un ArrayList</h6>
    <h6>Tenemos un método de tipo <i>PUT</i> actualizarCurso(int id,int horas) al cual le pasamos un id para buscar el curso y las horas a modificar de este curso</h6>
  </li>  
  <br>
  <li><h3>DAO</h3>  Es la capa que gestiona la conexión con el JPARepository, al que le decimos del tipo que será.</li>
  <br>
  <li><h3>Model</h3>  Es el POJO en este caso de Curso, el cual tiene, sus constructores,getters y setters y las siguientes variables:
    <ul>
      <li>codCurso. Identificador único para cada curso</li>
      <li>Nombre. El nombre del curso</li>
      <li>Duracion. Tiempo en horas de la duración del curso</li>
      <li>Precio. El precio que tendrá cada curso</li>
    </ul>
  </li>
  <li><h3>Inicio</h3>  Clase main encargada del arranque de la aplicación a través de Spring</li>
  <br>
  <li><h3>Service</h3>  En este paquete tendremos 2 clases
    <ul>
      <li>CursoService - Es la interfaz encargada de definir los métodos que vamos a implementar</li>
      <li>CursoServiceImpl - Es la clase que gestiona, gracias a la capa DAO, la conexión con los métodos que tiene Spring a través del JPARepository
        para guardar los datos y realizar los métodos de la interfaz antes comentada.</li>
    </ul>
  </li>
</ol>
