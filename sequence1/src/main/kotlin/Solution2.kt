class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0

        while(true){
            var count = 0
            for(i in 0..arr.size-1){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2
                    count++
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1
                    count++
                }
                else continue
            }

            if(count == 0) break

            answer++
        }


        return answer
    }
}

/**
 * level 0) 조건에 맞게 수열 변환하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181881
 */