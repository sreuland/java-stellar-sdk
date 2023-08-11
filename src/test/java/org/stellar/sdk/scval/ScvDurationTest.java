package org.stellar.sdk.scval;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import org.junit.Test;
import org.stellar.sdk.xdr.Duration;
import org.stellar.sdk.xdr.SCVal;
import org.stellar.sdk.xdr.SCValType;
import org.stellar.sdk.xdr.Uint64;
import org.stellar.sdk.xdr.XdrUnsignedHyperInteger;

public class ScvDurationTest {
  @Test
  public void testScvDurationMax() {
    SCVal scVal = ScvDuration.toSCVal(XdrUnsignedHyperInteger.MAX_VALUE);
    assertEquals(scVal.getDuration().getDuration().getUint64(), XdrUnsignedHyperInteger.MAX_VALUE);
    assertEquals(ScvDuration.fromSCVal(scVal), scVal.getDuration().getDuration().getUint64().getNumber());
  }

  @Test
  public void testScvDurationMin() {
    SCVal scVal = ScvDuration.toSCVal(XdrUnsignedHyperInteger.MIN_VALUE);
    assertEquals(scVal.getDuration().getDuration().getUint64(), XdrUnsignedHyperInteger.MIN_VALUE);
    assertEquals(ScvDuration.fromSCVal(scVal), scVal.getDuration().getDuration().getUint64().getNumber());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testScvDurationMoreThanMaxThrows() {
    BigInteger value = XdrUnsignedHyperInteger.MAX_VALUE.add(BigInteger.ONE);
    ScvDuration.toSCVal(value);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testScvDurationLessThanMinThrows() {
    BigInteger value = XdrUnsignedHyperInteger.MIN_VALUE.subtract(BigInteger.ONE);
    ScvDuration.toSCVal(value);
  }
}
