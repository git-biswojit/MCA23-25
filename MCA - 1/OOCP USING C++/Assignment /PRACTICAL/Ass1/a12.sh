echo -n "Enter any string : "
read string

echo

temp=`rev <<< $string`
if [ $temp = $string ]
then
	echo "PALINDROME"
else
	echo "NOT PALINDROME"
fi
