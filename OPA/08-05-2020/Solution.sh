awk 'BEGIN{e=0;o=0} {if ($0%2==0) {e+=$0*$0} else { o+=$0*$0}} END{print (e-o)}'