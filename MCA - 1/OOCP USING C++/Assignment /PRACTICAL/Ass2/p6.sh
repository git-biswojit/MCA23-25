read -p "Enter file : " fn

if [ -f $fn ]
then
	#SALES TABLE
	echo -e "name\t\tp1\tp2\tp3\ttotal\n"
	awk -F": " '{
		print $1"\t"$2"\t"$3"\t"$4"\t"($2+$3+$4)
	}' $fn
	awk -F": " '{
		sum1+=$2;sum2+=$3;sum3+=$4;tot+=($2+$3+$4)
	} 
	END {
		print "\ntotal\t\t"sum1"\t"sum2"\t"sum3"\t"tot
	}' $fn
	
	echo -e "\n============================================="

	#TOTAL SALES
	awk -F": " '{
		sum+=($2+$3+$4)
	}
	END {
		print "\nTotal sales\t\t: " sum
	}' $fn

	#HIGHEST SOLD PRODUCT
	awk -F": " '{
		sum1+=$2; sum2+=$3; sum3+=$4;
	}
	END {
		if ((sum1 > sum2) && (sum1 > sum3)) {
			print "Highest sold product\t: " sum1
		}
		else if (sum2 > sum3) {
			print "Highest sold product\t: " sum2
		}
		else {
			print "Highest sold product\t: " sum3
		}
	}' $fn

	#BEST SALESMAN
	awk -F": " 'BEGIN {
		max=0
	}
	{
		sm[NR]=($2+$3+$4); name[NR]=$1
	}
	END {
		max=sm[NR]; best=name[NR]
		for(i = 1; i <= NR; i++) {
			if(max < sm[i]) {
				max = sm[i]; best=name[i];
			}
		}
		print "Best salesman\t\t: " best
	}' $fn

	#WORST SALESMAN
	awk -F": " 'BEGIN {
		min=sm[NR]
	}
	{
		sm[NR]=($2+$3+$4); name[NR]=$1
	}
	END {
		min=sm[NR]; worst=name[NR]
		for(i = 1; i <= NR; i++) {
			if(min > sm[i]) {
				min = sm[i]; worst = name[i]
			}
		}
		print "Worst salesman\t\t: " worst
	}' $fn
else
	echo "Invalid file"
fi
