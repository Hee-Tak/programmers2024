class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for(i in 0 until my_str.length step n){
            val endIndex = if(i+n <= my_str.length){
                i+n
            } else {
                my_str.length
            }

            answer += my_str.substring(i, endIndex)
        }

        return answer
    }
}

/**
 * level 0) 잘라서 배열로 저장하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */