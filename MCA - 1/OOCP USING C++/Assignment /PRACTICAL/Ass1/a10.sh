while [ true ]
do
	echo "*** Employee Information ***"
	echo
	echo "1. Add"
	echo "2. Modify"
	echo "3. Delete"
	echo "4. Display"
	echo "0. Exit"
	echo
	echo -n "Enter your choice : "
	read ch

	echo


	if [ $ch -eq 1 ]
	then
		echo -n "How many employee to add ? "
		read n

		echo
		for((i=1;i<=$n;i++))
		do
			echo "Enter Employee $i details -"
			echo
			echo -n " ID : "; read id
			echo -n " Name : "; read name
			echo -n " Job : "; read job
			echo -n " Salary : "; read salary
			echo -n " Contact : "; read contact
			echo
		done

	elif [ $ch -eq 2 ]
	then
		echo "Enter Employee ID to Modify Data : "
		read tid
			if [ $tid == $id ]



	elif [ $ch -eq 3 ]
	then
		echo "bye"

	elif [ $ch -eq 4 ]
	then
		echo -e "Id\tName\t\tJob\tSalary\tContact"
		echo "=========================================="
		for((i=1;i<=$n;i++))
		do
			echo -e "$id\t$name\t\t$job\t$salary\t$contact"
		done
	elif [ $ch -eq 0 ]
	then
		echo "Good Bye!"
		exit

	else
		echo "INVALID CHOICE"

	fi
	echo
done

