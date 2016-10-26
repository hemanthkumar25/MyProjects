class Stack:
    def __init__(self):
        self.items=[]
        
    def peek(self):
        return self.items[len(self.items)-1]
    
    def push(self,item):
        return self.items.append(item)
    
    def pop(self):
        return self.items.pop()
    
    def isEmpty(self):
        return self.items==[]
    
    def size(self):
        return len(self.items)
    
s= Stack()
print s.isEmpty()
s.push(123)
s.push("Hello")
print s.isEmpty()
print s.peek()
print s.size()
s.pop()
print s.size()

