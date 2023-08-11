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

//  union EndSponsoringFutureReservesResult switch (
//      EndSponsoringFutureReservesResultCode code)
//  {
//  case END_SPONSORING_FUTURE_RESERVES_SUCCESS:
//      void;
//  case END_SPONSORING_FUTURE_RESERVES_NOT_SPONSORED:
//      void;
//  };

//  ===========================================================================
public class EndSponsoringFutureReservesResult implements XdrElement {
  public EndSponsoringFutureReservesResult() {}

  EndSponsoringFutureReservesResultCode code;

  public EndSponsoringFutureReservesResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(EndSponsoringFutureReservesResultCode value) {
    this.code = value;
  }

  public static final class Builder {
    private EndSponsoringFutureReservesResultCode discriminant;

    public Builder discriminant(EndSponsoringFutureReservesResultCode discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public EndSponsoringFutureReservesResult build() {
      EndSponsoringFutureReservesResult val = new EndSponsoringFutureReservesResult();
      val.setDiscriminant(discriminant);
      return val;
    }
  }

  public static void encode(
      XdrDataOutputStream stream,
      EndSponsoringFutureReservesResult encodedEndSponsoringFutureReservesResult)
      throws IOException {
    // Xdrgen::AST::Identifier
    // EndSponsoringFutureReservesResultCode
    stream.writeInt(encodedEndSponsoringFutureReservesResult.getDiscriminant().getValue());
    switch (encodedEndSponsoringFutureReservesResult.getDiscriminant()) {
      case END_SPONSORING_FUTURE_RESERVES_SUCCESS:
        break;
      case END_SPONSORING_FUTURE_RESERVES_NOT_SPONSORED:
        break;
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static EndSponsoringFutureReservesResult decode(XdrDataInputStream stream)
      throws IOException {
    EndSponsoringFutureReservesResult decodedEndSponsoringFutureReservesResult =
        new EndSponsoringFutureReservesResult();
    EndSponsoringFutureReservesResultCode discriminant =
        EndSponsoringFutureReservesResultCode.decode(stream);
    decodedEndSponsoringFutureReservesResult.setDiscriminant(discriminant);
    switch (decodedEndSponsoringFutureReservesResult.getDiscriminant()) {
      case END_SPONSORING_FUTURE_RESERVES_SUCCESS:
        break;
      case END_SPONSORING_FUTURE_RESERVES_NOT_SPONSORED:
        break;
    }
    return decodedEndSponsoringFutureReservesResult;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.code);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof EndSponsoringFutureReservesResult)) {
      return false;
    }

    EndSponsoringFutureReservesResult other = (EndSponsoringFutureReservesResult) object;
    return Objects.equal(this.code, other.code);
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

  public static EndSponsoringFutureReservesResult fromXdrBase64(String xdr) throws IOException {
    BaseEncoding base64Encoding = BaseEncoding.base64();
    byte[] bytes = base64Encoding.decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static EndSponsoringFutureReservesResult fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
