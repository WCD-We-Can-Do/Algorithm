def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x: x*3, reverse=True)
    return str(int(''.join(numbers)))

#print(solution([1,11,111,1111]))
print(solution([3,30,34,5,9]))

# 문자열 비교 연산
# 첫 글자가 큰 순서대로, 문자열의 길이가 긴 순서대로 크기 비교 가능
# 비교 되는 문자열을 아스키 코드로 바꿔서 비교함