import funsets.FunSets.*

val s1 = singletonSet(1)
val s2 = singletonSet(2)
val s3 = singletonSet(3)

printSet(s1)
printSet(s2)
printSet(s3)

val s12 = union(s1, s2)
val s23 = union(s2, s3)

printSet(s12)
printSet(s23)

printSet(intersect(s12, s23))
printSet(diff(s23, s12))
