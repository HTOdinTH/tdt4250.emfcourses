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

