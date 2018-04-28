def solution(A):

    length=len(A)
    s=[]
    rs=[]

    for i in range(length):
        s.append(0)
        rs.append(0)

    for i in range(length):
        s[i]+=A[i]
        
        rs[length-i-1]+=A[length-i-1]
        if i > 0:
            s[i]+=s[i-1]
            
            rs[length-i-1]+=rs[length-i]

    min=1000000
    for i in range(length-1):
        diff=abs(s[i]-rs[i+1])
        if (diff<min):
            min=diff
    return min

if __name__ == '__main__':
    A=[3,1,2,4,3]
    solution(A)
