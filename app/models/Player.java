package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player extends Model {
    @Id
    public Long id;
    public String name;
    public Integer age;
    public String team;
    public String position;
    public static final Finder<Long, Player> find = new Finder<Long, Player>(Player.class);
}
