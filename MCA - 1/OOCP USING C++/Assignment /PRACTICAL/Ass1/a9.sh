time=`date +%H`
#time=16
echo
if [ $time -ge 6 -a $time -lt 12 ]
then
	echo "Good Morning..."
elif [ $time -ge 12 -a $time -lt 16 ]
then
	echo "Good Afternoon..."
elif [ $time -ge 16 ] && [ $time -lt 21 ]
then
	echo "Good Evening..."
else
	echo "Good Night..."
fi
echo
echo "Current Time -"
echo "`date +%r`"
