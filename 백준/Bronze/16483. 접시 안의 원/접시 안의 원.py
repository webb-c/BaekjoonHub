import sys

def input():
    return sys.stdin.readline().rstrip()

def main():
    T = int(input())
    print(round((T/2)**2))

if __name__ == "__main__":
    main()
