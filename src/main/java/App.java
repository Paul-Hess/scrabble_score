import java.util.Map;
import java.util.HashMap;


import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (req, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/score", (request, res) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/score.vtl");

      String scrabbleWord = request.queryParams("scrabbleWord");

      Integer wordScore = Scrabble.calcScore(scrabbleWord);
      model.put("wordScore",wordScore);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }
}
