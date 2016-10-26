def shellSort(list):
    sublistcount = len(list)/2
    while sublistcount > 0:
        for startposition in range(sublistcount):
            gapInsertionSort(list,startposition,sublistcount)
        print ("After increments of size ",sublistcount,".  The list is ", list)
        sublistcount = sublistcount/2
        
def gapInsertionSort(list,start,gap):
    for i in range(start+gap,len(list),gap):
        currentvalue = list[i]
        position = i
        while position>=gap and list[position-gap]>currentvalue:
            list[position] = list[position - gap]
            position = position - gap
        list[position]=currentvalue
        
list = [54,26,93,17,77,31,44,55,20]
shellSort(list)
print list