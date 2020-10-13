def solution(prices):
    result = list()
    while len(prices) != 0:
        first = prices[0]
        del prices[0]
        count = 0
        for i in prices:
            count += 1
            if i < first:
                break
        result.append(count)

    answer = result
    return answer


if __name__ == '__main__':
    price = [1, 2, 3, 2, 3]
    print(solution(price))