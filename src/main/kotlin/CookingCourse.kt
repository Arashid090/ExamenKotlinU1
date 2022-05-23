class CookingCourse(
    id: Int,
    name: String,
    description: String
) : Course(
    id, name, description
) {

}
var listCourseCooking=mutableListOf<ProgramingCourse>()
fun getCourseCooking(id:Int){
    listCourseCooking.get(id)
}

fun <E> MutableList<E>.add(id: Int, name: String, description: String) {
    listCourseCooking.add(id,name,description)
}
