package com.kickstarter.models;

import org.joda.time.DateTime;

public class Activity {
  Category category = null;
  DateTime createdAt = null;
  Integer id = null;
  Project project = null;
  Update update = null;
  DateTime updatedAt = null;
  User user = null;

  public enum Category {
    UNKNOWN,
    WATCH,
    RESUME,
    UPDATE,
    COMMENT_PROJECT,
    BACKING,
    COMMENT_POST,
    CANCELLATION,
    SUCCESS,
    SUSPENSION,
    LAUNCH,
    FAILURE,
    FUNDING,
    BACKING_CANCELED,
    BACKING_DROPPED,
    BACKING_REWARD,
    BACKING_AMOUNT,
    COMMENT_PROPOSAL,
    FOLLOW;
  }

  public Category category() {
    return category;
  }

  public DateTime createdAt() {
    return createdAt;
  }

  public Integer id() {
    return id;
  }

  public Project project() {
    return project;
  }

  public Update update() {
    return update;
  }

  public DateTime updatedAt() {
    return updatedAt;
  }

  public User user() {
    return user;
  }
}
