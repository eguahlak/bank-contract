package dk.cphbusiness.bank.contract.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AccountIdentifier implements Serializable {
  private String reg;
  private String number;

  public AccountIdentifier() {
    }

  public AccountIdentifier(String reg, String number) {
    this.reg = reg;
    this.number = number;
    }
  
  public AccountIdentifier(String number) {
    this(null, number);
    }

  public String getNumber() {
    return number;
    }

  public void setNumber(String number) {
    this.number = number;
    }
  
  public String getReg() {
    return reg;
    }

  public void setReg(String reg) {
    this.reg = reg;
    }

  @Override
  public String toString() {
    return (reg == null ? "LOCAL" : reg)+": "+number;
    }
  
  public static AccountIdentifier fromString(String string) {
    return new AccountIdentifier(string);
    }
  
  }
