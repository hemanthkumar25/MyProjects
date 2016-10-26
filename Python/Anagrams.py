w1 = "hello world"
w2 = "holldl rweo"
n1 = w1.replace(" ","")
n2 = w2.replace(" ","")
if sorted(list(n1)) == sorted(list(n2)):
    print "Yes"
else:
    print "No"     