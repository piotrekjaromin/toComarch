package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Yourication."))
  }

  def index2 = Action{
    Ok(views.html.index("dupadupa."))
  }

}