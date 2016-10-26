import collections
arr = [3,6,5,4,3,6,1,3]
a=[]
counter = collections.Counter(arr)
#print counter
for key,value in counter.iteritems():
    if(counter[key]>1):
        print key," occurs ",counter[key]," times."
        print "sum is ",key*counter[key]
        a.append(key*counter[key])
print "total sum is ",sum(a)
