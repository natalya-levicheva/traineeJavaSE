package exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;

public class ExceededNumberOfArrayList extends Exception{

  private String message;
  private Throwable cause;

  public ExceededNumberOfArrayList() {
  }

  public ExceededNumberOfArrayList(String message) {
    super(message);
    this.message = message;
  }

  public ExceededNumberOfArrayList(String message, Throwable cause) {
    super(message, cause);
    this.message = message;
    this.cause = cause;
  }

  public Throwable getCause() {
    return cause;
  }

  public ExceededNumberOfArrayList(Throwable cause) {
    super(cause);
    this.cause = cause;
  }

  public String getMessage() {
    return message;
  }


  public String toString()
  {
    return message;
  }

  public void printStackTrace() {
    super.printStackTrace();
  }


}
