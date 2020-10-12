# EMF model for NTNU Programmes and Courses

By Odin Johan Vatne (HTOdinTH) and Joakim Danielsen Petersen (joakimdp)


## Structure

The ECore model is found in model/eMFCourses.ecore.
The generated code is found in src-gen.
bin and META-INF are not relevant.

Manual code can be found in:
src-gen/eMFCourses.impl:
- ConstraintSlotImpl 
- ProgrammeImpl 
- SelectionSlotImpl 
- SemesterImpl 
- YearImpl 

src-gen/eMFCourses.util:
- EMFCoursesValidator

(lookup "@generated NOT")


## Transformation

To run the transformation on the instance model from assignment 1,
navigate to the file `listingToTextGenerator.mtl` in the acceleo
project, right click it and select Run As... > Launch Acceleo Application.
The result can be found in the directory `target` in the same project.
