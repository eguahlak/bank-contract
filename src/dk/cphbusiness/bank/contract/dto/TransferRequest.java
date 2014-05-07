package dk.cphbusiness.bank.contract.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransferRequest implements Serializable {
  private BigDecimal amount;
  private AccountIdentifier source;
  private AccountIdentifier target;

  public TransferRequest() {
    }

  public TransferRequest(BigDecimal amount, AccountIdentifier source, AccountIdentifier target) {
    this.amount = amount;
    this.source = source;
    this.target = target;
    }

  public BigDecimal getAmount() {
    return amount;
    }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
    }

  public AccountIdentifier getSource() {
    return source;
    }

  public void setSource(AccountIdentifier source) {
    this.source = source;
    }

  public AccountIdentifier getTarget() {
    return target;
    }

  public void setTarget(AccountIdentifier target) {
    this.target = target;
    }
  
  
  
}
