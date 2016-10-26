from collections import defaultdict
word = "Hello Worldl"
d = defaultdict(int)
for i in range(len(word)):
    if word[i] in word[i+1::]:
        d[word[i]]+=1
for i in d:
    print i,d[i]