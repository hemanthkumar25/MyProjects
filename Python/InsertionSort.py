def insertionSort(list):
    for index in range(1,len(list)):
        currentvalue = list[index]
        position = index
        while position > 0 and list[position-1]>currentvalue:
            list[position] = list[position -1]
            position = position -1
            
        list[position] = currentvalue
        
list = [1,9,87,646,2,57,5]
insertionSort(list)
print list
            