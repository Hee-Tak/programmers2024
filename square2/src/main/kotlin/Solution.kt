class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        answer += arr

        var num: Int = 1
        while(true){
            if(arr.size < num){
                val temp = num - arr.size
                for(i in 1..temp){
                    answer += 0
                }
                break

            } else if(arr.size > num) {
                num *= 2
            } else {
                break
            }

        }

        return answer
    }

}


/**
 * level 0) 배열의 길이를 2의 거듭제곱으로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181857
 *
 */