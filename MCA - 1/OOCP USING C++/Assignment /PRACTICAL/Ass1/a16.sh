read -p "Enter distance between two cities(in KM) : " km

mtr=`echo $km*1000|bc`
ft=`echo $mtr*3.2808|bc`
inc=`echo $ft*12|bc`
cen=`echo $inc*2.54|bc`

echo
echo -e "Meters\t\t: $mtr"
echo -e "Feets\t\t: $ft"
echo -e "Inches\t\t: $inc"
echo -e "Centimeters\t: $cen" 
