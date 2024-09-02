echo -n "Upto ? "
read n

echo

for((i=1; i<=$n; i++))
do
	for((j=1; j<=$i; j++))
	do
		if [ $j -eq $i ]
		then
			echo -n "|_"
		else
			echo -n "| "
		fi	
	done
	echo
done
