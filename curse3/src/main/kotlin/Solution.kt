class Solution {
    fun solution(n: Int): Int {
        var answer = n
        var i = 1
        while (i <= answer) {
            if ((i % 3 == 0) || i.toString().contains("3")) {
                answer++
            }
            i++
        }

        return answer
    }
}
/**
 * level 0) 저주의 숫자 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/120871
 */