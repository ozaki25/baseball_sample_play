# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table player (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  age                           integer,
  team                          varchar(255),
  position                      varchar(255),
  constraint pk_player primary key (id)
);


# --- !Downs

drop table if exists player;

