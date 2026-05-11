# SoftEng_Composite-Design-Pattern_LabAss8

## Problem Statement
New Era University is composed of various organizational units. These units can be either individual entities or compositions of other entities. The system should be able to represent the following:
<ul>
  <li>Colleges: A College is a high-level organizational unit (e.g., "College of Engineering", "College of Business"). A College can contain departments, teachers, and students. It can also contain other Colleges (e.g., a university is composed of several Colleges).</li>
  <li>Departments: A department is a subdivision within a College, focusing on a specific subject (e.g., "Department of Computer Science", "Department of Information Technology"). A department can contain teachers and students.</li>
  <li>Teachers: A teacher is an individual entity responsible for instructing students. Each teacher has a name, a subject they teach, and a salary.</li>
  <li>Students: A student is an individual entity enrolled in a College or department. Each student has a name, a unique student ID, and pays a tuition fee.</li>
</ul>

#### Requirements:
<ol>
  <li>Model the hierarchical structure: The system must accurately represent the "part-whole" relationship between the different entities (e.g., a College "has-a" department, a department "has-a" teacher).</li>
  <li>Calculate the number of students: The system should be able to calculate the total number of students within any given College, including students in its departments and any sub-Colleges.</li>
  <li>Display details: The system should be able to display the details of any educational unit (College, department, teacher, or student) in a clear and organized manner.</li>
  <li>Calculate the budget: The system should be able to calculate the total budget for a College. The budget for a College is the sum of the budgets of its departments, teachers, and the negative sum of all the tuition fees of the students. The budget of a department is the sum of the budgets of its teachers and the negative sum of the tuition fees of the students in that department. A teacher's budget is their salary. A student's budget is the negative value of their tuition fee.</li>
</ol>

#### Tasks:
<ol>
  <li>Design a UML class diagram: Create a UML class diagram that illustrates the classes, interfaces, and relationships involved in the system.</li>
  <li>Implement the system in Java: Write Java code that implements the design, adhering to the Composite Design Pattern.</li>
  <li>Create a client program: Write a client program that demonstrates the functionality of the system by:
    <ul>
      <li>Creating instances of Colleges, departments, teachers, and students.</li>
      <li>Organizing these instances into a hierarchical structure.</li>
      <li>Displaying the details of a College.</li>
      <li>Calculating and displaying the total number of students in a College.</li>
      <li>Calculating and displaying the total budget of a College.</li></ul></li>
</ol>


## UML Class Diagram
![alt text](https://github.com/ThezzaSalcedo/SoftEng_Composite-Design-Pattern_LabAss8/blob/main/composite%20UML%20diagram.png.png)
