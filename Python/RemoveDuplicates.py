word = "bananas"
output = []
for i in range(len(word)):
    if(i<1):
        if(word[i] not in word[i+1::]):
            output.append(word[i])
            
        if(word[i] not in output ):
            output.append(word[i])
                
    else:
        if(word[i] not in word[i+1::]) and word[i] not in word[i-1::-1]:
            output.append(word[i])
            
        if(word[i] not in output ):
            output.append(word[i])
            
print "".join(output)