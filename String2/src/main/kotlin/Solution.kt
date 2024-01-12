class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = ""

        val result = StringBuilder(my_string)
        indices.sortedDescending().forEach {
            result.deleteCharAt(it)
        }

        answer = result.toString()

        return answer
    }
}
/**
 * level 0) 글자 지우기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181900
 */