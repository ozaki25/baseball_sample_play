package controllers;

import models.Player;
import play.mvc.*;
import views.html.players.*;

import java.util.List;

public class PlayerController extends Controller {
    public Result index() {
        List<Player> players = Player.find.all();
        return ok(index.render());
    }

    public Result newPlayer() {
        return ok(newPlayer.render());
    }

    public Result show(Long id) {
        Player player = Player.find.byId(id);
        return ok(show.render());
    }

    public Result edit(Long id) {
        Player player = Player.find.byId(id);
        return ok(edit.render());
    }

    public Result create() {
        return redirect(routes.PlayerController.index());
    }

    public Result update(Long id) {
        Player player = Player.find.byId(id);
        return redirect(routes.PlayerController.index());
    }

    public Result destroy(Long id) {
        Player player = Player.find.ref(id);
        player.delete();
        return redirect(routes.PlayerController.index());
    }
}
