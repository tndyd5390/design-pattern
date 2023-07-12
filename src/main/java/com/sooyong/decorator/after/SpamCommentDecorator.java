package com.sooyong.decorator.after;

public class SpamCommentDecorator extends CommentDecorator {

  public SpamCommentDecorator(CommentService commentService) {
    super(commentService);
  }

  @Override
  public void addComment(String comment) {
    if (isNotSpam(comment)) {
      super.addComment(comment);
    }
  }

  private boolean isNotSpam(String comment) {
    return !comment.contains("http");
  }
}
