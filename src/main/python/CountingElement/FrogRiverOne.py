# Given an array with location where leaves fall.
# Take a set. Add the position. If able to add the position and it is less than or equal to the river width.
# When the size becomes the width of the river , return that time
def solution(X, A):
    # write your code in Python 3.6
    s=set()
    for i in range(len(A)):
        if A[i] <= X:
            s.add(A[i])
            if len(s)==X:
                return i
    return -1
