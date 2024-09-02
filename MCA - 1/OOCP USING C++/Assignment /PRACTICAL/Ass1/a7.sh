while [ true ]
do
	echo -n "Enter a six digit number : "
	read n

	len=${#n}

	if [ $len -eq 6 ]
	then
	rev=0
	while [ $n -gt 0 ]
	do
		rem=`expr $n % 10`
		rev=`expr $rev \* 10 + $rem`
		n=`expr $n / 10`
	done
	
	echo
	echo "Reverse number -"
	echo $rev
	
	break
	
	else
		echo
		echo "Enter six digit number only"
		echo

	fi
done
