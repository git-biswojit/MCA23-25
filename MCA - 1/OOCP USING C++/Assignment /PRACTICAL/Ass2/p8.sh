read -p "enter file : " fn

	echo "USING GREP:"
		grep "^[ ]" $fn
	echo -e "\nUSING SED:"
		sed -n "/^[ ]/p" $fn
