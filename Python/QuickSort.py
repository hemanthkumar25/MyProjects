def quickSort(aList):
    quickSortHelper(aList,0,len(aList)-1)
    
def quickSortHelper(aList,first,last):
    if first < last:
        splitpoint = partition(aList,first,last)
        quickSortHelper(aList, first, splitpoint-1)
        quickSortHelper(aList, splitpoint+1, last)
        
def partition(aList,first,last):
    pivotValue = aList[first]
    leftMark = first +1
    rightMark = last
    done = False
    while not done:
        while leftMark <=rightMark and aList[leftMark]<= pivotValue:
            leftMark = leftMark +1
        while aList[rightMark] >= pivotValue and rightMark >= leftMark:
            rightMark = rightMark -1
        if rightMark < leftMark:
            done = True
        else:
            aList[leftMark],aList[rightMark] = aList[rightMark],aList[leftMark]
            
    aList[first],aList[rightMark] = aList[rightMark],aList[first]
    return rightMark

aList = [1,4,57,3,8,3456,654,2]
quickSort(aList)
print aList
            