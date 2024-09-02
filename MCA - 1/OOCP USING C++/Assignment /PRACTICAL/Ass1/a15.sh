read -p "Enter basic salary : " basic

da=`expr $((basic * 40)) / 100`
hr=`expr $((basic * 20)) / 100`
gross=`expr $basic + $hr + $da`

printf "\nBasic salary\t\t: %8.2f" "$basic"
printf "\nDearness allowance\t: %8.2f" "$da"
printf "\nHouse rent allowance\t: %8.2f" "$hr"
echo
echo -e -n "\t\t\t-----------"
printf "\nGross salary\t\t: %8.2f" "$gross"
echo
