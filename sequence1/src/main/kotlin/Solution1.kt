class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0

        var a1: IntArray = arr
        var a2: IntArray = fun1(a1)
        if(fun2(a1, a2)) return answer
        else answer++


        while(true){
            if(fun2(a1, a2)) break
            else {
                answer++
                a1 = a2
                a2 = fun1(a1)
            }
        }

        answer--
        return answer
    }

    fun fun1(arr: IntArray): IntArray{
        var temp: IntArray = intArrayOf()

        for(a in arr){
            if(a >= 50 && a % 2 == 0){
                temp += a / 2
            } else if(a < 50 && a % 2 == 1){
                temp += a * 2 + 1
            } else {
                temp += a
            }
        }

        return temp
    }

    fun fun2(A: IntArray, B: IntArray): Boolean {
        if(A.size != B.size) return false

        for(i in A.indices){
            if(A[i] != B[i]){
                return false
            }
        }

        return true
    }
}


/**
 * 근데 시간초과걸리고 뭐가 잘 안됨 이상함.
 */