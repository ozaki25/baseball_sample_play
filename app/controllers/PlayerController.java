package controllers;

import play.mvc.*;
import views.html.players.*;

public class PlayerController extends Controller {
    public Result index() {
        return ok(index.render());
    }

    public Result newPlayer() {
        return ok(newPlayer.render());
    }

    public Result show(Long id) {
        return ok(show.render());
    }

    public Result edit(Long id) {
        return ok(edit.render());
    }

    public Result create() {
        return redirect(routes.PlayerController.index());
    }

    public Result update(Long id) {
        return redirect(routes.PlayerController.index());
    }

    public Result destroy(Long id) {
        return redirect(routes.PlayerController.index());
    }
}

