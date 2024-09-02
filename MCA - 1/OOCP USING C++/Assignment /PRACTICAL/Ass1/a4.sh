echo -n "Upto ? "
read n

echo
echo "Prime numbers upto $n -"

count=0
i=2
while [ $i -le $n ]
do
	is_prime=true
	j=2
	while [ $j -le `expr $i / 2` ]
	do
		prime=`expr $i % $j`
		if [ $prime -eq 0 ]
		then
			is_prime=false
			break
		fi
		j=`expr $j + 1`
	done
	if $is_prime
	then
		echo -n "$i "
		count=`expr $count + 1`
	fi
	i=`expr $i + 1`
done
echo
echo "Total - $count"
echo
