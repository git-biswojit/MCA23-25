read -p "Enter file : " fn

if [ -f $fn ]
then
	awk -F": " '{
		printf "Record %d\n %s %s %s\n %s\n %s-%s\n %s\n\n",NR, $1,$2,$3,$4,$5,$6,$7
	}' $fn
else
	echo "Invalid file"
fi	
