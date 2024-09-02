read -p "Enter file : " fn

if [ -f $fn ]
then
	echo "USING GREP:"
		grep -vi "^[abc]" $fn
	echo -e "\nUSING SED:"
		sed -n "/^[^abc]/I p" $fn
fi
