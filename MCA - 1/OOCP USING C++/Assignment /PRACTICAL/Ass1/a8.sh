echo "*** FIND AREA ***"
echo
echo "R. Rectangle"
echo "T. Triangle"
echo "C. Circle"
echo "E. Exit"
echo
echo -n "Enter your choice : "
read ch

echo
case $ch in
	r)
		echo -n "Enter length : "
		read l
		echo -n "Enter breadth : "
		read b
		echo
		echo "Area of Rectangle-"
		echo $(echo "scale=2; $l * $b" | bc)
		;;
	t)
		echo -n "Enter base : "
		read b
		echo -n "Enter height : "
		read h
		echo
		echo "Area of Triangle-"
		echo "$(echo "scale=2; 1 / 2 * $b * $h" | bc)"
		;;
	c)
		echo -n "Enter radius : "
		read r
		echo
		echo "Area of Circle-"
		echo "$(echo "scale=2; 22 / 7 * $r * $r" | bc)"
		;;
	e)
		echo "Good Bye!"
		exit
		;;
	*)
		echo "INVALID CHOICE"
		;;
esac
