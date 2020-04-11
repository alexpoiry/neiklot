package me.alex.language;

import static java.util.Objects.requireNonNull;

public class LinguisticException extends Exception {

  public LinguisticException(final String message) {
    super(requireNonNull(message, "message must not be null"));
  }

  public LinguisticException(final String message, final Throwable cause) {
    super(requireNonNull(message, "message must not be null"),
        requireNonNull(cause, "cause must not be null"));
  }

}
