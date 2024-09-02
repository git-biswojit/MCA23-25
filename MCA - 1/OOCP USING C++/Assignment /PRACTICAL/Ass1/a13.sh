read -p "Enter any number : " n

if [ $n -lt 2 ]
then
	echo "$n is NOT PRIME"
	exit
fi

if [ $((n % 2)) -eq 0 -a $n -ne 2 ]
then
	echo "$n is NOT PRIME"
	exit
fi

for((i=2;i<$n/2;i++))
do
	if [ $((n % i)) -eq 0 ]
	then
		echo "$n is NOT PRIME"
		exit
	fi
done
echo "$n is PRIME"
