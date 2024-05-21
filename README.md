# Implementaci-n-SGH
<div align="center">
<p><img src="https://content.presentermedia.com/files/animsp/00003000/3076/hospital_building_helicopter_pa_lg_wm.gif" alt="GIF" width="400" height="230"></p><p>
                                                                                                                                                                  
 <div align="left">                                                                                                                                                                 
Descripción 
El objetivo es diseñar un diagrama de clases para un sistema de gestión de hospital que incorpore diversos elementos de la programación orientada a objetos, tales como asociaciones, herencias, realizaciones, agregaciones, composiciones, dependencias, clases abstractas, interfaces, enumeradores, atributos de solo lectura y atributos de clase.

<details><summary>Requisitos del Sistema:</summary><br>

Personas:

Existen tres tipos de personas: Paciente, Doctor y Enfermero.
Todas las personas tienen atributos como nombre, identificación y dirección.
Los Pacientes pueden tener múltiples citas médicas.
Los Doctores pueden atender múltiples pacientes y tienen una especialidad.
Los Enfermeros asisten a los doctores y también pueden tener múltiples pacientes asignados.
Citas Médicas:

Las citas médicas tienen atributos como fecha, hora, motivo de la cita y estado (programada, realizada, cancelada).
Cada cita médica está asociada a un Paciente y a un Doctor.
Expedientes Médicos:

Los expedientes médicos contienen el historial médico del paciente, incluyendo diagnósticos, tratamientos y prescripciones.
Cada Paciente tiene un expediente médico.
Especialidades Médicas:

Definir un enumerador para las especialidades médicas (ej. Cardiología, Dermatología, Pediatría).
Relaciones:

Los Pacientes pueden tener múltiples citas médicas.
Los Doctores pueden atender múltiples pacientes y citas médicas.
Los Enfermeros pueden asistir a múltiples doctores y pacientes.
Clases Abstractas e Interfaces:

Crear una clase abstracta Persona que será la superclase de Paciente, Doctor y Enfermero.
Definir una interfaz GestiónCitas con métodos para programar, cancelar y realizar citas médicas.
Agregaciones y Composiciones:

Los Expedientes Médicos tienen una relación de composición con los Pacientes.
Las Citas Médicas tienen una relación de agregación con los Doctores y Pacientes.
Dependencias:

La clase Doctor depende de la interfaz GestiónCitas para realizar sus funciones.
La clase Cita Médica depende de las clases Paciente y Doctor para gestionar las citas.
Atributos de solo lectura y de clase:

Los atributos como el número de identificación y la especialidad de los doctores deben ser de solo lectura.
Los contadores de citas médicas pueden ser atributos de clase para llevar el registro a nivel del sistema.
</details>
<details><summary>Instrucciones:</summary><br>
Diseñar el diagrama de clases que represente el sistema descrito(Implementar la retroalimentación).
Asegurarse de incluir y etiquetar adecuadamente todos los elementos mencionados en los requisitos.
Prestar especial atención a las relaciones entre las clases y cómo se implementan los diferentes tipos de asociaciones.
Incluir cualquier otro elemento que considere relevante para el correcto funcionamiento del sistema.
Subir el enlace al repositorio
Incluir en el readme la imagen del diagrama de clases actualizado
Seleccionar un lengauje Java o Python(Django), para su implementación
</details>
<p><img src="https://raw.githubusercontent.com/Diego162306/Implementaci-n-SGH/main/Captura%20de%20pantalla%202024-05-21%20102026.png"></p><p>
</details>
