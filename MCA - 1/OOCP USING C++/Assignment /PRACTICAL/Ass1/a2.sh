echo -n "Enter no 1 : "
read n1
echo -n "Enter no 2 : "
read n2

echo

echo "*** Basic Calculator ***"
echo
echo "Press + for Addition"
echo "Press - for Subtraction"
echo "Press * for Multiplication"
echo "Press / for Division"
echo "Press % for Remainder"
echo "Press E for Exit"
echo
echo -n "Enter your choice : "
read ch

echo

case $ch in
	+)  echo "$n1 + $n2 = $(($n1 + $n2))" ;;
	-)  echo "$n1 - $n2 = $(($n1 - $n2))" ;;
	\*) echo "$n1 * $n2 = `expr $n1 \* $n2`" ;;
	/)  echo "$n1 / $n2 = `expr $n1 / $n2`" ;;
	%)  echo "$n1 % $n2 = `expr $n1 % $n2`" ;;
	e)  echo "Good Bye!"; exit ;;
	*)  echo "INVALID CHOICE" ;;
esac
