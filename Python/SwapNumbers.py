"""
a=10
b=20
a=a+b
b=a-b
a=a-b
print a
print b

"""
def swap(a,b):
    a=a+b
    b=a-b
    a=a-b
    print "The number a is",a
    print "The number b is",b
    
a= input("number a is ")
b = input("number b is ")
swap(a,b)

""" or we can use 
a,b = b,a
"""