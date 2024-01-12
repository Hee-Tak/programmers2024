class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var i = 0
        while(i < arr.size){
            if(answer.isEmpty()){
                answer += arr[i]
                i++
            } else{
                if(answer.last() == arr[i]){
                    val temp = answer.toMutableList()
                    temp.removeAt(temp.size-1)
                    answer = temp.toIntArray()
                    i++
                } else {
                    answer += arr[i]
                    i++
                }
            }
        }
        return if(answer.isEmpty()){
            intArrayOf(-1)
        } else {
            answer
        }
    }
}

/**
 * level 0) 배열 만들기 6
 * https://school.programmers.co.kr/learn/courses/30/lessons/181859
 */