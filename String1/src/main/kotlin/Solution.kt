class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""

        var index = myString.indexOf(pat)

        while(index != -1){
            answer = myString.substring(0, index + pat.length)
            index = myString.indexOf(pat, index + 1)
        }


        return answer
    }
}
/**
 * level 0) 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181872
 */