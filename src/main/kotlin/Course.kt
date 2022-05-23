open class Course (var id: Int=0,
                   var name: String="",
                   var description: String=""){
    companion object{
            val MSG_ERROR:String="Ha ocurrido un error al realizar la operación"
            val MSG_INFO:String="No se puede realizar la operación"
            val MSG_SUCCESS:String="Se ha realizado con éxito la eliminación"
    }
}

