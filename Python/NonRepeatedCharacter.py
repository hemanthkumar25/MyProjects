word = "ginorning"
for i in range(len(word)):
    if(word[i] not in  word[i+1::]):
        print word[i]
        break
