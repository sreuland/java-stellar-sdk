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

//  union ExtensionPoint switch (int v)
//  {
//  case 0:
//      void;
//  };

//  ===========================================================================
public class ExtensionPoint implements XdrElement {
  public ExtensionPoint() {}

  Integer v;

  public Integer getDiscriminant() {
    return this.v;
  }

  public void setDiscriminant(Integer value) {
    this.v = value;
  }

  public static final class Builder {
    private Integer discriminant;

    public Builder discriminant(Integer discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public ExtensionPoint build() {
      ExtensionPoint val = new ExtensionPoint();
      val.setDiscriminant(discriminant);
      return val;
    }
  }

  public static void encode(XdrDataOutputStream stream, ExtensionPoint encodedExtensionPoint)
      throws IOException {
    // Xdrgen::AST::Typespecs::Int
    // Integer
    stream.writeInt(encodedExtensionPoint.getDiscriminant().intValue());
    switch (encodedExtensionPoint.getDiscriminant()) {
      case 0:
        break;
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static ExtensionPoint decode(XdrDataInputStream stream) throws IOException {
    ExtensionPoint decodedExtensionPoint = new ExtensionPoint();
    Integer discriminant = stream.readInt();
    decodedExtensionPoint.setDiscriminant(discriminant);
    switch (decodedExtensionPoint.getDiscriminant()) {
      case 0:
        break;
    }
    return decodedExtensionPoint;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.v);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ExtensionPoint)) {
      return false;
    }

    ExtensionPoint other = (ExtensionPoint) object;
    return Objects.equal(this.v, other.v);
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

  public static ExtensionPoint fromXdrBase64(String xdr) throws IOException {
    BaseEncoding base64Encoding = BaseEncoding.base64();
    byte[] bytes = base64Encoding.decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static ExtensionPoint fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
