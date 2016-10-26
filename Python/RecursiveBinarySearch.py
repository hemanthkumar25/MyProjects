def recursiveBinarySearch(arr,item):
    mid=len(arr)/2
    if(arr[mid]==item):
        return mid  
    else:
        if(item < arr[mid]):
            return(recursiveBinarySearch(arr[:mid], item))  
        else:
            return(recursiveBinarySearch(arr[mid+1:], item))
        
arr = [0, 1, 2, 8, 13, 17, 19, 32, 42]
print(recursiveBinarySearch(arr, 13))