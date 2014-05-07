package dk.cphbusiness.bank.contract.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransferResponse implements Serializable {
  private boolean ok;
  private String message;

  public TransferResponse() {
    }

  public TransferResponse(boolean ok, String message) {
    this.ok = ok;
    this.message = message;
    }

  public boolean isOk() {
    return ok;
    }

  public void setOk(boolean ok) {
    this.ok = ok;
    }

  public String getMessage() {
    return message;
    }

  public void setMessage(String message) {
    this.message = message;
    }
  
  }
