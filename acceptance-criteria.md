# acceptance-criteria.md

User Story 1
Given courses exist in the system//
When a student searches for course code "CpE371"
Then the matching course shall be displayed

User Story 2
Given courses exist in the system
When a student selects "List Courses"
Then all available courses shall be displayed

User Story 3
Given seats are available in a course
When a student registers
Then the student shall be added to the course

User Story 4
Given a student has registered courses
When the student views the schedule
Then all registered courses shall be displayed

User Story 5
Given prerequisites exist
When a student views course details
Then prerequisite information shall be displayed

User Story 6
Given a course exists
When a student views the course
Then the number of available seats shall be displayed

User Story 7
Given two courses overlap in time
When a student attempts registration
Then the system shall prevent registration and display a warning

User Story 8
Given a course has reached capacity
When a student views the course
Then the course shall be marked as full

User Story 9
Given students are enrolled in a course
When an instructor views the course roster
Then all enrolled students shall be displayed

User Story 10
Given a student creates a semester plan
When the plan is saved
Then the planned courses shall be stored
