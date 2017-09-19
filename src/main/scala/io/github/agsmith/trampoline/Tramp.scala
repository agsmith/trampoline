package io.github.agsmith.trampoline

sealed trait Bounce[A]
case class Done[A](result: A) extends Bounce[A]
case class Call[A](thunk: () => Bounce[A]) extends Bounce[A]

def trampoline[A](bounce: Bounce[A]): A = bounce match {
  case Call(thunk) => trampoline(thunk())
  case Done(result) => result
}
