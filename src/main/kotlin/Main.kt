import java.util.*

fun main(args:Array<String>){
    var respMenuInicial:Int=0
    var respMenuProg:Int=0
    var respMenuCoc:Int=0
    var nombre:String=""
    val cookingCourse:CookingCourse
    val programingCourse:CookingCourse
    var descripcion:String=""
    var id:Int=0
    val leer = Scanner(System.`in`)
        do{
        println("Binevenido\n¿Qué deseas consultar?\n1.Cursos de programación\n2.Cursos de cocina\n3.Consultar todos los cursos\n4.Salir")
        respMenuInicial=leer.nextInt()
            when(respMenuInicial){
                1->{
                    println("¿Qué deseas hacer?\n1.Registrar\n2.Actualizar\n3.Eliminar\n4.Consultar Curso\n5.Regresar al menu principal")
                    respMenuProg=leer.nextInt()
                    when(respMenuProg){
                        1->{
                            println("Ingresa el id del curso")
                            id=leer.nextInt()
                            println("Ingresa el nombre del curso")
                            nombre=leer.nextLine()
                            println("Ingresa la descripcion del curso")
                            descripcion=leer.nextLine()
                            if (id==null || nombre.equals("") || descripcion.equals("")){
                                println(Course.MSG_INFO)
                            }else{
                                //Se agrega un nuevo curso siempre y cuando este cuente con todos los datos
                                println(Course.MSG_SUCCESS)
                            }

                        }
                        2->{
                            println("Ingresa el id del registro que deseas actualizar")
                            println("Ingresa el nuevo id")
                            id=leer.nextInt()
                            println("Ingresa el nuevo nombre")
                            nombre=leer.nextLine()
                            println("Ingresa la nueva descripción")
                            var idN=leer.nextInt()
                            descripcion=leer.nextLine()

                        }
                        3->{
                            println("Ingresa el id del curso que deseas eliminar")
                            id=leer.nextInt()
                            println("¿Estás seguro de querer eliminar el curso?\n1.Si\n2.No")
                            var respEliminar:Int=leer.nextInt();
                            if(respEliminar==1){
                                listCourseProgramming.removeAt(id)
                                println(Course.MSG_SUCCESS)
                            }else{
                                //Se imprime un mensaje diciendo que hay un error
                                println(Course.MSG_ERROR)
                            }
                        }
                        4->{
                            println("Ingresa el id del curso que deseas consultar")

                        }
                        5->{
                            println("Regresando al menu")
                        }

                    }
                }
                2->{
                    println("¿Qué deseas hacer?\n1.Registrar\n2.Actualizar\n3.Eliminar\n4.Consultar Curso\n5.Regresar al menu principal")
                    respMenuCoc=leer.nextInt()
                    when(respMenuCoc){
                        1->{
                            println("Ingresa el id del curso")
                            id=leer.nextInt()
                            println("Ingresa el nombre del curso")
                            nombre=leer.nextLine()
                            println("Ingresa la descripcion del curso")
                            descripcion=leer.nextLine()
                            if (id==null || nombre.equals("") || descripcion.equals("")){
                                println(Course.MSG_INFO)
                            }else{
                                //listCourseCooking.add(id,nombre,descripcion)
                                println(Course.MSG_SUCCESS)
                            }

                        }
                        2->{
                            println("Ingresa el id del registro que deseas actualizar")

                        }
                        3->{
                            println("Ingresa el id del curso que deseas eliminar")
                            id=leer.nextInt()
                            println("¿Estás seguro de querer eliminar el curso?\n1.Si\n2.No")
                            var respEliminar:Int=leer.nextInt();
                            if(respEliminar==1){

                            }else{
                                //Se imprime un mensaje diciendo que hay un error
                                println(Course.MSG_ERROR)
                            }
                        }
                        4->{
                            println("Ingresa el id del curso que deseas consultar")

                        }
                        5->{
                            println("Regresando al menu")
                        }

                    }
                }
                3->{
                //Imprime todos los datos de ambas listas
                    println("Cursos de programación ${listCourseProgramming}\nCursos de cocina ${listCourseCooking}")
                }
                4->{
                    println("Hasta luego vuelva pronto")
                }else->{
                    println("Opción no válida")
                }
            }
    }while (respMenuInicial != 3)
}

