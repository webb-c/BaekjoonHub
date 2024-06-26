import sys

def input():
    return sys.stdin.readline().rstrip()
    
    
def solve():
    n = int(input())
    F_n = (1/(5**0.5))*(((1+(5**0.5))/2)**n - ((1-(5**0.5))/2)**n)
    print(int(F_n))
    
if __name__ == "__main__":
    solve()
    