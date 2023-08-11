package org.stellar.sdk.xdr;

import java.io.IOException;

/** Common parent interface for all generated classes. */
interface XdrElement {
  void encode(XdrDataOutputStream stream) throws IOException;

  String toXdrBase64() throws IOException;

  byte[] toXdrByteArray() throws IOException;
}
