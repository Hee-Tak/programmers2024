class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Boolean = false
        for(i in 0..code.length-1){
            if(code[i] == '1'){
                mode = !mode
            } else {
                if(!mode){
                    if(i % 2 == 0){
                        answer += code[i].toString()
                    }
                } else {
                    if(i % 2 == 1){
                        answer += code[i].toString()
                    }
                }
            }
        }

        return if(answer.isEmpty()){
            "EMPTY"
        } else {
            answer
        }
    }
}

/**
 * level 0) 코드 처리하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */