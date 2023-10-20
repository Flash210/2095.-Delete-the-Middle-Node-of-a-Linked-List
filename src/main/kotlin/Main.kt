import java.lang.StringBuilder
import java.util.Stack

fun main(args: Array<String>) {


    val ch="leet**cod*e"

    System.out.println(RemoveStarts(ch))

}

fun RemoveStarts(ch:String):String{

val sb=StringBuilder()

    val st=Stack<Char>()

  ch.forEach {

      //it.takeIf { it != '*' }?.run { st.add(this) } ?: st.pop()
      if (it != '*') st.add(it) else st.pop()

  }

    //The Power of StringBuilder: A Deep Dive into Stack Data Storage
   // sb.append(st)
    st.forEach{ sb.append(it)}



    return sb.toString()
}
