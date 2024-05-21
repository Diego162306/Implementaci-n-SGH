# Implementaci-n-SGH
<div align="center">
<p><img src="https://content.presentermedia.com/files/animsp/00003000/3076/hospital_building_helicopter_pa_lg_wm.gif" alt="GIF" width="400" height="230"></p><p>
                                                                                                                                                              
 <div align="left">                                                                                                                                                            
Descripción:<br>

<summary>El objetivo es diseñar un diagrama de clases para un sistema de gestión de hospital que incorpore diversos elementos de la programación orientada a objetos, tales como asociaciones, herencias, realizaciones, agregaciones, composiciones, dependencias, clases abstractas, interfaces, enumeradores, atributos de solo lectura y atributos de clase.<br>
<br>
<details><summary>Requisitos del Sistema:</summary><br>
Personas:
<summary>Existen tres tipos de personas: Paciente, Doctor y Enfermero.
<summary>Todas las personas tienen atributos como nombre, identificación y dirección.
<summary>Los Pacientes pueden tener múltiples citas médicas.
<summary>Los Doctores pueden atender múltiples pacientes y tienen una especialidad.
<summary>Los Enfermeros asisten a los doctores y también pueden tener múltiples pacientes asignados.<br>
<br>
Citas Médicas:
<summary>Las citas médicas tienen atributos como fecha, hora, motivo de la cita y estado (programada, realizada, cancelada).
<summary>Cada cita médica está asociada a un Paciente y a un Doctor.<br>
<br>
Expedientes Médicos:
<summary>Los expedientes médicos contienen el historial médico del paciente, incluyendo diagnósticos, tratamientos y prescripciones.
<summary>Cada Paciente tiene un expediente médico.<br>
<br>
Especialidades Médicas:
<summary>Definir un enumerador para las especialidades médicas (ej. Cardiología, Dermatología, Pediatría).<br>
<br>
Relaciones:
<summary>Los Pacientes pueden tener múltiples citas médicas.
<summary>Los Doctores pueden atender múltiples pacientes y citas médicas.
<summary>Los Enfermeros pueden asistir a múltiples doctores y pacientes.<br>
<br>
Clases Abstractas e Interfaces:
<summary>Crear una clase abstracta Persona que será la superclase de Paciente, Doctor y Enfermero.
<summary>Definir una interfaz GestiónCitas con métodos para programar, cancelar y realizar citas médicas.<br>
<br>
Agregaciones y Composiciones:
<summary>Los Expedientes Médicos tienen una relación de composición con los Pacientes.
<summary>Las Citas Médicas tienen una relación de agregación con los Doctores y Pacientes.<br>
<br>
Dependencias:
<summary>La clase Doctor depende de la interfaz GestiónCitas para realizar sus funciones.
<summary>La clase Cita Médica depende de las clases Paciente y Doctor para gestionar las citas.<br>
<br>
Atributos de solo lectura y de clase:
<summary>Los atributos como el número de identificación y la especialidad de los doctores deben ser de solo lectura.
<summary>Los contadores de citas médicas pueden ser atributos de clase para llevar el registro a nivel del sistema.<br>
</details>
<details><summary>Instrucciones:</summary><br>
<summary>Diseñar el diagrama de clases que represente el sistema descrito(Implementar la retroalimentación).
<summary>Asegurarse de incluir y etiquetar adecuadamente todos los elementos mencionados en los requisitos.
<summary>Prestar especial atención a las relaciones entre las clases y cómo se implementan los diferentes tipos de asociaciones.
<summary>Incluir cualquier otro elemento que considere relevante para el correcto funcionamiento del sistema.
<summary>Subir el enlace al repositorio
<summary>Incluir en el readme la imagen del diagrama de clases actualizado
<summary>Seleccionar un lengauje Java o Python(Django), para su implementación
</details><br>
<br>
<div align="center">
Diagrama UML<br>
<br>
<p><img src="https://raw.githubusercontent.com/Diego162306/Implementaci-n-SGH/main/Captura%20de%20pantalla%202024-05-21%20102026.png"></p><p>
</details>
END
<p><img src="https://media.tenor.com/0jI-YXeywSsAAAAM/nyan-cat-cat.gif" width="40px"></summary><br>
