class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0

        when(ineq){
            ">" -> {
                when(eq){
                    "=" -> {
                        if(n >= m) answer = 1 else answer = 0
                    }
                    "!" -> {
                        if(n > m) answer = 1 else answer = 0
                    }
                }
            }

            "<" -> {
                when(eq){
                    "=" -> {
                        if(n <= m) answer = 1 else answer = 0
                    }
                    "!" -> {
                        if(n < m) answer = 1 else answer = 0
                    }
                }
            }
        }
        return answer
    }
}

/**
 * level 0) 조건 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934?language=kotlin
 */