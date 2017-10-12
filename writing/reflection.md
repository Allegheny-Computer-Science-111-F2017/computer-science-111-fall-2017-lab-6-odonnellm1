# Reflection by Molly O'Donnell

## October 12, 2017

This lab required me to write a file called `ManipulateDNA`. This program would
ask the user to input a DNA sequence and then the program would manipulate the
sequence in different ways. This lab allowed me to practice and master the
commands that we have been working on throughout the semester. Using the
command new Scanner() allowed the information that was being input by the user,
to be pulled from the external file and be used in the program. I also
practiced assgning varibales like int and char and having many mutations to the
original DNA code.

My biggest challenge was in step five when I used the replace command to change
a random position in the DNA String to a randomly chosen DNA letter. The
problem with this step is that in order to use the replace command, you need
your variables in char form. Unfortunately, the variables that I imported were
in int form. My solution to this problem, with the help of the TAs, was to
convert my int varibales to char varibales through using the command, char
newname = dna.charAt(int).
