def binarySearch(arr,item):
    start = 0;
    end = len(arr)-1;
    found = False
    while(start<=end) and not found:
        mid = (start+end)/2
        if(arr[mid])==item:
            found = True
            
        else:
            if(item > arr[mid]):
                start = mid+1
            else:
                end = mid-1
    return found
        
arr = [0, 1, 2, 8, 13, 17, 19, 32, 42,]
print(binarySearch(arr, 3))
print(binarySearch(arr, 13))
    