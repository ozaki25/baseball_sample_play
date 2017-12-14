package controllers;

import models.Player;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.players.*;

import javax.inject.Inject;
import java.util.List;

public class PlayerController extends Controller {
    private final Form<Player> playerForm;

    @Inject
    public PlayerController(FormFactory formFactory) {
         playerForm = formFactory.form(Player.class);
    }

    public Result index() {
        List<Player> players = Player.find.all();
        return ok(index.render(players));
    }

    public Result newPlayer() {
        return ok(newPlayer.render(playerForm));
    }

    public Result show(Long id) {
        Player player = Player.find.byId(id);
        return ok(show.render());
    }

    public Result edit(Long id) {
        Player player = Player.find.byId(id);
        Form<Player> form = playerForm.fill(player);
        return ok(edit.render(form));
    }

    public Result create() {
        Player player = playerForm.bindFromRequest().get();
        player.save();
        return redirect(routes.PlayerController.index());
    }

    public Result update(Long id) {
        Player player = playerForm.bindFromRequest().get();
        player.id = id;
        player.update();
        return redirect(routes.PlayerController.index());
    }

    public Result destroy(Long id) {
        Player player = Player.find.ref(id);
        player.delete();
        return redirect(routes.PlayerController.index());
    }
}
