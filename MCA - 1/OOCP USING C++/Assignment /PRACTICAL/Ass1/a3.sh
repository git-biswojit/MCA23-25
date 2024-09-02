echo -n "Upto ? "
read n

pre=0
cur=1
i=1

echo
echo "Fibonacci -"

while [ $i -le $n ]
do
	nex=`expr $pre + $cur`
	echo -n "$cur "
	pre=$cur
	cur=$nex
	i=`expr $i + 1`
done
echo
