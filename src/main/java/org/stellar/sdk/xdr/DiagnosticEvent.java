// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import com.google.common.base.Objects;
import com.google.common.io.BaseEncoding;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// === xdr source ============================================================

//  struct DiagnosticEvent
//  {
//      bool inSuccessfulContractCall;
//      ContractEvent event;
//  };

//  ===========================================================================
public class DiagnosticEvent implements XdrElement {
  public DiagnosticEvent() {}

  private Boolean inSuccessfulContractCall;

  public Boolean getInSuccessfulContractCall() {
    return this.inSuccessfulContractCall;
  }

  public void setInSuccessfulContractCall(Boolean value) {
    this.inSuccessfulContractCall = value;
  }

  private ContractEvent event;

  public ContractEvent getEvent() {
    return this.event;
  }

  public void setEvent(ContractEvent value) {
    this.event = value;
  }

  public static void encode(XdrDataOutputStream stream, DiagnosticEvent encodedDiagnosticEvent)
      throws IOException {
    stream.writeInt(encodedDiagnosticEvent.inSuccessfulContractCall ? 1 : 0);
    ContractEvent.encode(stream, encodedDiagnosticEvent.event);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static DiagnosticEvent decode(XdrDataInputStream stream) throws IOException {
    DiagnosticEvent decodedDiagnosticEvent = new DiagnosticEvent();
    decodedDiagnosticEvent.inSuccessfulContractCall = stream.readInt() == 1 ? true : false;
    decodedDiagnosticEvent.event = ContractEvent.decode(stream);
    return decodedDiagnosticEvent;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.inSuccessfulContractCall, this.event);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof DiagnosticEvent)) {
      return false;
    }

    DiagnosticEvent other = (DiagnosticEvent) object;
    return Objects.equal(this.inSuccessfulContractCall, other.inSuccessfulContractCall)
        && Objects.equal(this.event, other.event);
  }

  @Override
  public String toXdrBase64() throws IOException {
    BaseEncoding base64Encoding = BaseEncoding.base64();
    return base64Encoding.encode(toXdrByteArray());
  }

  @Override
  public byte[] toXdrByteArray() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(byteArrayOutputStream);
    encode(xdrDataOutputStream);
    return byteArrayOutputStream.toByteArray();
  }

  public static DiagnosticEvent fromXdrBase64(String xdr) throws IOException {
    BaseEncoding base64Encoding = BaseEncoding.base64();
    byte[] bytes = base64Encoding.decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static DiagnosticEvent fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }

  public static final class Builder {
    private Boolean inSuccessfulContractCall;
    private ContractEvent event;

    public Builder inSuccessfulContractCall(Boolean inSuccessfulContractCall) {
      this.inSuccessfulContractCall = inSuccessfulContractCall;
      return this;
    }

    public Builder event(ContractEvent event) {
      this.event = event;
      return this;
    }

    public DiagnosticEvent build() {
      DiagnosticEvent val = new DiagnosticEvent();
      val.setInSuccessfulContractCall(this.inSuccessfulContractCall);
      val.setEvent(this.event);
      return val;
    }
  }
}
