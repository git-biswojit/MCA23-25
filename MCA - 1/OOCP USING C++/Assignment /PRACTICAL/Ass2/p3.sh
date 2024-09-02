read -p "Enter file : " fn

if [ -f $fn ]
then
	echo "LINE 3 TO 5"
	sed -n '3,5p' $fn
else
	echo "Invalid file"
fi
