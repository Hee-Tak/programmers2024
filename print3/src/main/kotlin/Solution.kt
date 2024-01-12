fun main(args: Array<String>) {
    val s1 = readLine()!!

    var answer: String = ""
    for(s in s1){
        if(s.isUpperCase()){
            answer += s.toLowerCase().toString()
        } else {
            answer += s.toUpperCase().toString()
        }
    }
    println(answer)
}

/**
 * level 0) 대소문자 바꿔서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949?language=kotlin
 */