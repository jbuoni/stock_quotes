// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/h379769/Documents/jason/stock_quotes/conf/routes
// @DATE:Tue Mar 03 15:40:42 EST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStockSentiment StockSentiment = new controllers.ReverseStockSentiment(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStockSentiment StockSentiment = new controllers.javascript.ReverseStockSentiment(RoutesPrefix.byNamePrefix());
  }

}
