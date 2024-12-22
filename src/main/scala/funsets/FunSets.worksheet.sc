import funsets.FunSets.*

val s1 = singletonSet(1)
val s2 = singletonSet(2)
val s3 = singletonSet(3)

printSet(s1)
printSet(s2)
printSet(s3)

val s12  = union(s1, s2)
val s23  = union(s2, s3)
val s123 = union(s12, s23)

printSet(s12)
printSet(s23)
printSet(s123)

printSet(intersect(s12, s23))
printSet(diff(s23, s12))

forall(s123, x => x < 0) // false
forall(s123, x => x < 1) // false
forall(s123, x => x < 2) // false
forall(s123, x => x < 3) // false
forall(s123, x => x < 4) // true
forall(s123, x => x > 0) // true
forall(s123, x => x > 1) // false
forall(s123, x => x > 2) // false
forall(s123, x => x > 3) // false
forall(s123, x => x > 4) // false

exists(s123, x => x < 0) // false
exists(s123, x => x < 1) // false
exists(s123, x => x < 2) // true
exists(s123, x => x < 3) // true
exists(s123, x => x < 4) // true
exists(s123, x => x > 0) // true
exists(s123, x => x > 1) // true
exists(s123, x => x > 2) // true
exists(s123, x => x > 3) // false
exists(s123, x => x > 4) // false

printSet(map(s123, x => x + 1))
