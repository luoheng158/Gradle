package sample01

def nums = [3, 1, 4, 1, 5 ,9]

def doublePrint(int a) {
    println("adas: " + a)
    println(2 * a)
}

def doubles = []
nums.each {
    it1 -> doubles << it1 * 2
}

nums.each {println(it)}

nums.each {}

println(doubles)

def fun() {

}

