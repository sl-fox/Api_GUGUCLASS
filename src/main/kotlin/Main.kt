fun main(args:Array<String>) {
    print("enter num1 : ")
    var num1 : Int = readLine()!!.toInt() // 첫번째 숫자 입력
    print("enter num2 : ")
    var num2 : Int = readLine()!!.toInt() // 두번째 숫자 입력
    print("enter operator : ")
    var op : Char = readLine()!![0] // 연산자 입력
    var n : Int
    if(op == '+'){
        var n : Int = num1+num2
        println(n)
    }
    if(op == '-'){
        var n : Int = num1-num2
        println(n)
    }
    if(op == '*'){
        var n : Int = num1*num2
        println(n)
    }
    if(op == '/'){
        var n : Int = num1/num2
        println(n)
    }
}