w = "wo#rd"
li =list(w)
print li
l=0
r = len(li)-1
while(l<r):
    if not (li[l].isalpha()):
        l+=1
    elif not (li[r].isalpha()):
        r-=1
        
    else:
        li[l],li[r] = li[r],li[l]
        l+=1
        r-=1
        
print "".join(li)    
