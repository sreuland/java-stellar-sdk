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

//  union SCSpecTypeDef switch (SCSpecType type)
//  {
//  case SC_SPEC_TYPE_VAL:
//  case SC_SPEC_TYPE_BOOL:
//  case SC_SPEC_TYPE_VOID:
//  case SC_SPEC_TYPE_ERROR:
//  case SC_SPEC_TYPE_U32:
//  case SC_SPEC_TYPE_I32:
//  case SC_SPEC_TYPE_U64:
//  case SC_SPEC_TYPE_I64:
//  case SC_SPEC_TYPE_TIMEPOINT:
//  case SC_SPEC_TYPE_DURATION:
//  case SC_SPEC_TYPE_U128:
//  case SC_SPEC_TYPE_I128:
//  case SC_SPEC_TYPE_U256:
//  case SC_SPEC_TYPE_I256:
//  case SC_SPEC_TYPE_BYTES:
//  case SC_SPEC_TYPE_STRING:
//  case SC_SPEC_TYPE_SYMBOL:
//  case SC_SPEC_TYPE_ADDRESS:
//      void;
//  case SC_SPEC_TYPE_OPTION:
//      SCSpecTypeOption option;
//  case SC_SPEC_TYPE_RESULT:
//      SCSpecTypeResult result;
//  case SC_SPEC_TYPE_VEC:
//      SCSpecTypeVec vec;
//  case SC_SPEC_TYPE_MAP:
//      SCSpecTypeMap map;
//  case SC_SPEC_TYPE_SET:
//      SCSpecTypeSet set;
//  case SC_SPEC_TYPE_TUPLE:
//      SCSpecTypeTuple tuple;
//  case SC_SPEC_TYPE_BYTES_N:
//      SCSpecTypeBytesN bytesN;
//  case SC_SPEC_TYPE_UDT:
//      SCSpecTypeUDT udt;
//  };

//  ===========================================================================
public class SCSpecTypeDef implements XdrElement {
  public SCSpecTypeDef() {}

  SCSpecType type;

  public SCSpecType getDiscriminant() {
    return this.type;
  }

  public void setDiscriminant(SCSpecType value) {
    this.type = value;
  }

  private SCSpecTypeOption option;

  public SCSpecTypeOption getOption() {
    return this.option;
  }

  public void setOption(SCSpecTypeOption value) {
    this.option = value;
  }

  private SCSpecTypeResult result;

  public SCSpecTypeResult getResult() {
    return this.result;
  }

  public void setResult(SCSpecTypeResult value) {
    this.result = value;
  }

  private SCSpecTypeVec vec;

  public SCSpecTypeVec getVec() {
    return this.vec;
  }

  public void setVec(SCSpecTypeVec value) {
    this.vec = value;
  }

  private SCSpecTypeMap map;

  public SCSpecTypeMap getMap() {
    return this.map;
  }

  public void setMap(SCSpecTypeMap value) {
    this.map = value;
  }

  private SCSpecTypeSet set;

  public SCSpecTypeSet getSet() {
    return this.set;
  }

  public void setSet(SCSpecTypeSet value) {
    this.set = value;
  }

  private SCSpecTypeTuple tuple;

  public SCSpecTypeTuple getTuple() {
    return this.tuple;
  }

  public void setTuple(SCSpecTypeTuple value) {
    this.tuple = value;
  }

  private SCSpecTypeBytesN bytesN;

  public SCSpecTypeBytesN getBytesN() {
    return this.bytesN;
  }

  public void setBytesN(SCSpecTypeBytesN value) {
    this.bytesN = value;
  }

  private SCSpecTypeUDT udt;

  public SCSpecTypeUDT getUdt() {
    return this.udt;
  }

  public void setUdt(SCSpecTypeUDT value) {
    this.udt = value;
  }

  public static final class Builder {
    private SCSpecType discriminant;
    private SCSpecTypeOption option;
    private SCSpecTypeResult result;
    private SCSpecTypeVec vec;
    private SCSpecTypeMap map;
    private SCSpecTypeSet set;
    private SCSpecTypeTuple tuple;
    private SCSpecTypeBytesN bytesN;
    private SCSpecTypeUDT udt;

    public Builder discriminant(SCSpecType discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder option(SCSpecTypeOption option) {
      this.option = option;
      return this;
    }

    public Builder result(SCSpecTypeResult result) {
      this.result = result;
      return this;
    }

    public Builder vec(SCSpecTypeVec vec) {
      this.vec = vec;
      return this;
    }

    public Builder map(SCSpecTypeMap map) {
      this.map = map;
      return this;
    }

    public Builder set(SCSpecTypeSet set) {
      this.set = set;
      return this;
    }

    public Builder tuple(SCSpecTypeTuple tuple) {
      this.tuple = tuple;
      return this;
    }

    public Builder bytesN(SCSpecTypeBytesN bytesN) {
      this.bytesN = bytesN;
      return this;
    }

    public Builder udt(SCSpecTypeUDT udt) {
      this.udt = udt;
      return this;
    }

    public SCSpecTypeDef build() {
      SCSpecTypeDef val = new SCSpecTypeDef();
      val.setDiscriminant(discriminant);
      val.setOption(this.option);
      val.setResult(this.result);
      val.setVec(this.vec);
      val.setMap(this.map);
      val.setSet(this.set);
      val.setTuple(this.tuple);
      val.setBytesN(this.bytesN);
      val.setUdt(this.udt);
      return val;
    }
  }

  public static void encode(XdrDataOutputStream stream, SCSpecTypeDef encodedSCSpecTypeDef)
      throws IOException {
    // Xdrgen::AST::Identifier
    // SCSpecType
    stream.writeInt(encodedSCSpecTypeDef.getDiscriminant().getValue());
    switch (encodedSCSpecTypeDef.getDiscriminant()) {
      case SC_SPEC_TYPE_VAL:
      case SC_SPEC_TYPE_BOOL:
      case SC_SPEC_TYPE_VOID:
      case SC_SPEC_TYPE_ERROR:
      case SC_SPEC_TYPE_U32:
      case SC_SPEC_TYPE_I32:
      case SC_SPEC_TYPE_U64:
      case SC_SPEC_TYPE_I64:
      case SC_SPEC_TYPE_TIMEPOINT:
      case SC_SPEC_TYPE_DURATION:
      case SC_SPEC_TYPE_U128:
      case SC_SPEC_TYPE_I128:
      case SC_SPEC_TYPE_U256:
      case SC_SPEC_TYPE_I256:
      case SC_SPEC_TYPE_BYTES:
      case SC_SPEC_TYPE_STRING:
      case SC_SPEC_TYPE_SYMBOL:
      case SC_SPEC_TYPE_ADDRESS:
        break;
      case SC_SPEC_TYPE_OPTION:
        SCSpecTypeOption.encode(stream, encodedSCSpecTypeDef.option);
        break;
      case SC_SPEC_TYPE_RESULT:
        SCSpecTypeResult.encode(stream, encodedSCSpecTypeDef.result);
        break;
      case SC_SPEC_TYPE_VEC:
        SCSpecTypeVec.encode(stream, encodedSCSpecTypeDef.vec);
        break;
      case SC_SPEC_TYPE_MAP:
        SCSpecTypeMap.encode(stream, encodedSCSpecTypeDef.map);
        break;
      case SC_SPEC_TYPE_SET:
        SCSpecTypeSet.encode(stream, encodedSCSpecTypeDef.set);
        break;
      case SC_SPEC_TYPE_TUPLE:
        SCSpecTypeTuple.encode(stream, encodedSCSpecTypeDef.tuple);
        break;
      case SC_SPEC_TYPE_BYTES_N:
        SCSpecTypeBytesN.encode(stream, encodedSCSpecTypeDef.bytesN);
        break;
      case SC_SPEC_TYPE_UDT:
        SCSpecTypeUDT.encode(stream, encodedSCSpecTypeDef.udt);
        break;
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static SCSpecTypeDef decode(XdrDataInputStream stream) throws IOException {
    SCSpecTypeDef decodedSCSpecTypeDef = new SCSpecTypeDef();
    SCSpecType discriminant = SCSpecType.decode(stream);
    decodedSCSpecTypeDef.setDiscriminant(discriminant);
    switch (decodedSCSpecTypeDef.getDiscriminant()) {
      case SC_SPEC_TYPE_VAL:
      case SC_SPEC_TYPE_BOOL:
      case SC_SPEC_TYPE_VOID:
      case SC_SPEC_TYPE_ERROR:
      case SC_SPEC_TYPE_U32:
      case SC_SPEC_TYPE_I32:
      case SC_SPEC_TYPE_U64:
      case SC_SPEC_TYPE_I64:
      case SC_SPEC_TYPE_TIMEPOINT:
      case SC_SPEC_TYPE_DURATION:
      case SC_SPEC_TYPE_U128:
      case SC_SPEC_TYPE_I128:
      case SC_SPEC_TYPE_U256:
      case SC_SPEC_TYPE_I256:
      case SC_SPEC_TYPE_BYTES:
      case SC_SPEC_TYPE_STRING:
      case SC_SPEC_TYPE_SYMBOL:
      case SC_SPEC_TYPE_ADDRESS:
        break;
      case SC_SPEC_TYPE_OPTION:
        decodedSCSpecTypeDef.option = SCSpecTypeOption.decode(stream);
        break;
      case SC_SPEC_TYPE_RESULT:
        decodedSCSpecTypeDef.result = SCSpecTypeResult.decode(stream);
        break;
      case SC_SPEC_TYPE_VEC:
        decodedSCSpecTypeDef.vec = SCSpecTypeVec.decode(stream);
        break;
      case SC_SPEC_TYPE_MAP:
        decodedSCSpecTypeDef.map = SCSpecTypeMap.decode(stream);
        break;
      case SC_SPEC_TYPE_SET:
        decodedSCSpecTypeDef.set = SCSpecTypeSet.decode(stream);
        break;
      case SC_SPEC_TYPE_TUPLE:
        decodedSCSpecTypeDef.tuple = SCSpecTypeTuple.decode(stream);
        break;
      case SC_SPEC_TYPE_BYTES_N:
        decodedSCSpecTypeDef.bytesN = SCSpecTypeBytesN.decode(stream);
        break;
      case SC_SPEC_TYPE_UDT:
        decodedSCSpecTypeDef.udt = SCSpecTypeUDT.decode(stream);
        break;
    }
    return decodedSCSpecTypeDef;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(
        this.option,
        this.result,
        this.vec,
        this.map,
        this.set,
        this.tuple,
        this.bytesN,
        this.udt,
        this.type);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SCSpecTypeDef)) {
      return false;
    }

    SCSpecTypeDef other = (SCSpecTypeDef) object;
    return Objects.equal(this.option, other.option)
        && Objects.equal(this.result, other.result)
        && Objects.equal(this.vec, other.vec)
        && Objects.equal(this.map, other.map)
        && Objects.equal(this.set, other.set)
        && Objects.equal(this.tuple, other.tuple)
        && Objects.equal(this.bytesN, other.bytesN)
        && Objects.equal(this.udt, other.udt)
        && Objects.equal(this.type, other.type);
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

  public static SCSpecTypeDef fromXdrBase64(String xdr) throws IOException {
    BaseEncoding base64Encoding = BaseEncoding.base64();
    byte[] bytes = base64Encoding.decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static SCSpecTypeDef fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
