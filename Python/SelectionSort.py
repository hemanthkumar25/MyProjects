def selectionSort(list):
    for fillslot in range(len(list)-1,0,-1):
        positionOfMax = 0
        for location in range(1,fillslot+1):
            if list[location]>list[positionOfMax]:
                positionOfMax = location
            list[fillslot],list[positionOfMax] = list[positionOfMax],list[fillslot]
list = [1,3,5,6,23,78,2,9]
selectionSort(list)
print list