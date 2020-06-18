read

awk 'BEGIN{FS=","}
   {
     if($3>50 && $4>40)
      {
           avg=($3+$4)/2; 
           if(avg>=75) 
           print $1,$2,avg
        }
    }'
|sort -k3 -nr