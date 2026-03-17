def fact(i):
    if(i==0):
        return 1
    else:
        return i*fact(i-1)
    
n=int(input("enter the strong digit no:"))
result=0
temp=n
r=0
while n!=0:
    r=n%10
    result=result+fact(r)
    n=n//10
if result==temp:
    print("yes")
else:
    print("no")

