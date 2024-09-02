read -p "Enter file : " fn

if [ -f $fn ]
then
	sed -n '/^[a-z 0-9]/I p' $fn
else
	echo "Invalid File"
fi
