package net.ushadow.calliope

trait Event {

  def kind: String

  def apply[T](name: String): Option[Object] = {
    if (hasProperty(name)) {
      Some(getProperty(name))
    } else {
      None
    }
  }

  protected def hasProperty(name: String): Boolean
  protected def getProperty(name: String): Object

}