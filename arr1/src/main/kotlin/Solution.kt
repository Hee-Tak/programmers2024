class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        answer = arr
        for(i in query.indices){
            if(i % 2 == 0){
                answer = removeElement(answer, answer.size-1)
            } else {
                answer = removeElement(answer, 0)
            }
        }

        return answer
    }

    fun removeElement(arr: IntArray, indexToRemove: Int): IntArray {
        val mutableList = arr.toMutableList()
        mutableList.removeAt(indexToRemove)
        return mutableList.toIntArray()
    }
}

/**
 * level 0) 배열 조각하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 */