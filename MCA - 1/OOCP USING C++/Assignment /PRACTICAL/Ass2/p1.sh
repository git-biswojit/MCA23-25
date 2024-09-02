echo -n "Enter file name : "
read fn

if [ -f $fn ]
then
	echo "USING GREP:"
		grep -i "^[abc]" $fn
	echo -e "\nUSING SED:"
		sed -n '/^[abc]/I p' $fn
else
	echo "Invalid file"
fi
