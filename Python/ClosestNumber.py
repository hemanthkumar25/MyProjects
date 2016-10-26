arr = [2,4,6,-3,-2,8,7,-1]
d={}
for i in range(len(arr)):
    d[arr[i]]=abs(arr[i]-0)

print min(d,key=d.get)