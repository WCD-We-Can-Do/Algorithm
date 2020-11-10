def solution(brown, yellow):
    total = brown + yellow
    for i in range(3, total + 1):
        rem = total % i
        if rem == 0:
            k = int(total / i)
            if (k - 2) * (i - 2) == yellow:
                return [max(k, i), min(k, i)]

    return 0

print(solution(10,2))