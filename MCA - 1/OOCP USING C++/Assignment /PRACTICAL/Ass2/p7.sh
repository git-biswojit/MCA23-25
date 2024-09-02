read -p "Enter file : " fn

if [ -f $fn ]
then
	sed 's/^\(.\)\(.*\)\(.\)$/\3\2\1/' $fn
else
	echo "Invalid file"
fi	
