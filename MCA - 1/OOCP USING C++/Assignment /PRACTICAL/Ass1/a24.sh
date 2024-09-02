for x in *
do
	if [ -f $x ]
	then
		echo
		echo "$x is a file"
		echo "Number of lines in the file are "
		wc -l $x
	elif [ -d $x ]
	then
		echo
		echo "$x is a directory"
	else
		echo
		echo "Enter valid file name or directory name"
	fi
done
