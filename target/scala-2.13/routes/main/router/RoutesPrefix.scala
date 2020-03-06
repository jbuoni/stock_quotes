// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/h379769/Documents/jason/stock_quotes/conf/routes
// @DATE:Tue Mar 03 15:40:42 EST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
