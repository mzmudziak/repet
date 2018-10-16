package com.umcs;

public class Czlowiek {
  private String login;
  private String name;
  private String surname;

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Czlowiek(String login, String name, String surname) {
    this.login = login;
    this.name = name;
    this.surname = surname;
  }
}
