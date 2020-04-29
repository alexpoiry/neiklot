package me.alex.language;

import com.google.common.base.Objects;

/**
 * This class uniquely identifies a language, e.g., English, French, Italian, Chinese, etc.
 */
public final class LanguageIdentifier {
  private String languageName;

  /**
   * Default constructor (for Jackson purposes). May be able to remove.
   */
  public LanguageIdentifier() {
  }

  /**
   * Gets the language name.
   *
   * @return a string representing the language name
   */
  public String getLanguageName() {
    return languageName;
  }

  /**
   * Sets the language name.
   *
   * @param languageName a string representing the language name
   */
  public void setLanguageName(final String languageName) {
    this.languageName = languageName;
  }

  @Override
  public String toString() {
    return "LanguageIdentifier{"
      + "languageName='" + languageName + '\''
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
    final LanguageIdentifier that = (LanguageIdentifier) o;
    return Objects.equal(languageName, that.languageName);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(languageName);
  }

  /*
  @Override
  public final String toString() {
    return MoreObjects.toStringHelper(this)
      .add("dataSource", dataSource)
      .add("statusTrackerService", statusTrackerService)
      .add("maven2CoordinatesFactory", maven2CoordinatesFactory)
      .toString();
  }

  @Override
  public final boolean equals(final Object obj) {
    if (obj == this) {
      return true;
    } else if (!(obj instanceof CompletedScanSyncSource)) {
      return false;
    }

    final CompletedScanSyncSource other = (CompletedScanSyncSource) obj;
    return Objects.equals(this.dataSource, other.dataSource)
        && Objects.equals(this.statusTrackerService, other.statusTrackerService)
        && Objects.equals(this.maven2CoordinatesFactory, other.maven2CoordinatesFactory);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(this.dataSource, statusTrackerService, maven2CoordinatesFactory);
  }
   */
}
