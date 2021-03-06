package reactive2.FSM


object Messages {

  sealed trait Command

  case class AddItem(id: String, count: Int) extends Command
  case class RemoveItem(id: String, count: Int) extends Command

  case object Buy extends Command
  case object Pay extends Command
  case object Failed
  case object Init
}
