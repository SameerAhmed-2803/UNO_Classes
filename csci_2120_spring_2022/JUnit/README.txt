Some aliases I like to set up in my bash shell, by adding the following line to my .profile in
my home directory:

alias javadoc='javadoc -tag custom.require:cm:"Precondition:"  -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java'

alias JUNIT5='/Users/cmsumma/Source/junit/junit-platform-console-standalone-1.8.0-M1.jar'

alias junit='java -jar $JUNIT5 -cp . --select-class'
