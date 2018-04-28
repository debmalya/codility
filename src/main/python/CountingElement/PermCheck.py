def solution(A):
    # write your code in Python 3.6
    A.sort()
    print(A)
    prev = A[0]
    if (prev != 1):
        return 0
    else:
        for i in range(1, len(A)):
            if (A[i] - prev) != 1:
                return 0
            prev=A[i]
    return 1
if __name__ == '__main__':
    A = [ 4,1, 3]
    print(solution(A))
    A = [4, 1, 3,2]
    print(solution(A))
