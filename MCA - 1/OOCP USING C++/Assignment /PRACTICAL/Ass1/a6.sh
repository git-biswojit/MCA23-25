echo "FOLLOWING FILE EXISTS -" 
ls
echo
echo "*** FILE OPERATION ***"
echo
echo "1. Remove"
echo "2. Rename"
echo "3. Copy"
echo "4. Modify"
echo "0. Exit"
echo
echo -n "Enter your choice : "
read ch

if [ $ch -ge 1 ] && [ $ch -le 4 ]
then
	echo
	echo -n "Enter file name : "
	read fn
fi

#if test -f /pwd/to/$fn

case $ch in
	1)
		rm $fn
		echo
		echo "File successfully deleted"
		echo
		ls
		;;
	2)
		echo -n "Enter new name : "
		read nn
		mv $fn $nn
		echo
		echo "File successfully renamed"
		echo
		ls
		;;
	3)
		ls
		echo -n "Enter destination file or directory : "
		read dst
		cp $fn $dst
		echo
		echo "File successfully copied"
		echo
		ls
		;;
	4)	
		vi +star $fn
		;;
	0)
		echo
		echo "Good bye!"
		exit ;;
	*)
		echo
		echo "INVALID CHOICE" ;;
esac
