package me.alex.language.exp;

import com.google.common.base.Objects;
import java.util.List;

public class Randobject {
  private String name;
  private List<String> nicknames;

  public Randobject() {
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public List<String> getNicknames() {
    return nicknames;
  }

  public void setNicknames(final List<String> nicknames) {
    this.nicknames = nicknames;
  }

  @Override
  public String toString() {
    return "Randobject{"
      + "name='" + name + '\''
      + ", nicknames=" + nicknames
      + '}';
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Randobject that = (Randobject) o;
    return Objects.equal(name, that.name)
      && Objects.equal(nicknames, that.nicknames);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name, nicknames);
  }
}
