class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for(i in l..r){
            if(containsOnly05(i)){
                answer += i
            }
        }


        if(answer.isEmpty()){
            answer += -1
        } else {
            answer = answer.sorted().toIntArray()
        }

        return answer
    }

    fun containsOnly05(num: Int): Boolean {
        val numString = num.toString()
        return numString.all { it == '0' || it == '5'}
    }
}

/**
 * level 0) 배열 만들기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181921
 */