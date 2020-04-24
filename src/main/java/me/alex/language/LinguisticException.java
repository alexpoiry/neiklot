package me.alex.language;

import static java.util.Objects.requireNonNull;

/**
 * The named exception representing a linguistic error.
 */
public class LinguisticException extends Exception {

  /**
   * Constructs an error with a message.
   *
   * @param message a String representing the error
   */
  public LinguisticException(final String message) {
    super(requireNonNull(message, "message must not be null"));
  }

  /**
   * Constructs an error with a message and cause.
   *
   * @param message a String representing the error
   * @param cause a Throwable that caused the exception
   */
  public LinguisticException(final String message, final Throwable cause) {
    super(requireNonNull(message, "message must not be null"), requireNonNull(cause, "cause must not be null"));
  }

}
