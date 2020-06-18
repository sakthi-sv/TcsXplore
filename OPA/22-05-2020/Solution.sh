readarray f
first=$(echo $f |wc -w )
second=$(echo $f | wc -c )
k=$(( second/first ))
echo $k