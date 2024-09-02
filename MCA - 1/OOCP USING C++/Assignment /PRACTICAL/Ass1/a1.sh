echo -n "Upto ? "
read n

echo

echo "*** Using While ***"
echo
i=1
echo "Even Numbers -"
while [ $i -le $n ]
do 
	if [ $(($i % 2)) -eq 0 ]
	then
		echo -n "$i "
	fi
	i=`expr $i + 1`
done

echo
echo

j=1
echo "Odd Numbers -"
while [ $j -le $n ]
do
	if [ `expr $j % 2` -ne 0 ]
	then
		echo -n "$j "
	fi
	j=`expr $j + 1`
done

echo
echo

echo "*** Using For ***"
echo
echo "Even Numbers -"
#for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
for i in {1..20}
do
	if [ $(($i % 2)) -eq 0 ]
	then
		echo -n "$i "
	fi
done

echo
echo

echo "Odd Number -"
for((j=1;j<=$n;j++)) 
do
	if [ `expr $j % 2` -ne 0 ]
	then
		echo -n "$j "
	fi
done

echo
echo

echo "*** Using Until ***"
echo
echo "Even Numbers -"
i=1
until [ $i -gt $n ]
do
	if [ $(($i % 2)) -eq 0 ]
	then
		echo -n "$i "
	fi
	i=`expr $i + 1`
done

echo
echo

echo "Odd Numbers -"
j=1
until [ $j -gt $n ]
do
	if [ `expr $j % 2` -ne 0 ]
	then
		echo -n "$j "
	fi
	j=`expr $j + 1`
done
echo
