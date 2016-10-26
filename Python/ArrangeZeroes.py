l = [2,0,0,4,5,0,9]
pos = 0

for i in range(len(l)):
    if l[i] != 0:
        l[pos]=l[i]
        pos+=1

for j in range(pos-1):

    l[(len(l)-1)- j] = 0    

print l
    