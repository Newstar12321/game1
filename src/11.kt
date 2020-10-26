fun main(){
    var x = "X"
    var o = "0"

    var turn = 0

    var pole = mutableListOf(

        mutableListOf(" "," "," "),
        mutableListOf(" "," "," "),
        mutableListOf(" "," "," ")
    )
    while (true){
        if (turn == 0){
            pole[readLine()!!.toInt()][readLine()!!.toInt()] = o
            turn = 1
        }
        else{
            pole[readLine()!!.toInt()][readLine()!!.toInt()] = x
            turn = 0
        }
        println(pole[0])
        println(pole[1])
        println(pole[2])
    }

}