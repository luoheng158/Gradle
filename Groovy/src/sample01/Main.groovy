package sample01

println('Hello, World')
println 'Hello, World'
println("Hello, World")

assert 3.class == Integer
assert (3.5).class == BigDecimal
assert 'abc' instanceof String
assert "abc" instanceof String

def name = 'Dolly'
assert "Hello, ${name}!" == 'Hello, Dolly!'
assert "Hello, $name!" == 'Hello, Dolly!'
assert "Hello, $name!" instanceof GString
println("aaa".class)
println('aaa'.class)
println("Hello, $name!".class)
println("Hello, $name!".is('Hello, Dolly!'))


Integer n = 3
Date now = new Date()

def x = 3
assert x.class == Integer
x = 'abc'
assert x.class == String
x = new Date()
assert x.class == Date

assert 3
assert -1
assert !0
assert 'abc'
assert !''
assert !""
assert [3, 1, 4, 1, 5, 9]
assert ![]

int x1 = 5
int y1 = 7
assert 12 == x1 + y1
// assert 12 == 3 * x1

// Operator Overloading
assert 3 + 4 == 3.plus(4)
assert 3 * 4 == 3.multiply(4)

assert 2**6 == 64
assert 2**6 == 2.power(6)
assert 'abc' * 3 == 'abcabcabc'
try {
    3 * 'abc'
    println("right")
} catch (MissingMethodException e) {
    println("miss")
}

String s = 'this is a string'
assert s + ' and more' == 'this is a string and more'
assert s - 'is' == 'th is a string'
assert s - 'is' - 'is' == 'th  a string'

Date tommorrow = now + 1
println(now.hashCode())
println((tommorrow - 1).hashCode())
// == 是调用equals方法
assert tommorrow - 1 == now

// 两个对象是否一样，is
assert now.is(now)

// Collections
def nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]
assert nums instanceof ArrayList

Set uniques = nums as Set
assert uniques == [3, 1, 4, 5, 9, 2, 6] as Set

def sorted = nums as SortedSet
println(sorted.class)
assert sorted == [1, 2, 3, 4, 5, 6, 9] as SortedSet
assert sorted instanceof TreeSet

// [-9, 8]
// [-9, -1]
// [ 0, 8 ]
assert nums[0] == 3
assert nums[1] == 1
assert nums[-1] == 5
assert nums[-2] == 6

assert nums[0..3] == [3, 1, 4, 1]
assert nums[-3..-1] == [2, 6, 5]
assert nums[-1..-3] == [5, 6, 2]

String hello = 'hello'
assert 'olleh' == hello[-1..0]

def map = [a:1, b:2, c:2]
assert map.getClass() == LinkedHashMap
assert map.a == 1
assert map['b'] == 2
assert map.get('c') == 2
map.a = 3
println(map)


// Closures 闭包
nums = [3, 1, 4, 1, 5 ,9]

def doubles = []
nums.each {
    it1 -> doubles << it1 * 2
}
assert doubles == [6, 2, 8, 2, 10, 18]

def doubles2 = nums.collect { it * 2}
assert doubles2 == [6, 2, 8, 2, 10, 18]