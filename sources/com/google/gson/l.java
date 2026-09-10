package com.google.gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f24755a;

    public l(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f24755a = bool;
    }

    public static boolean r(l lVar) {
        Serializable serializable = lVar.f24755a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.g
    public final boolean b() {
        Serializable serializable = this.f24755a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        Serializable serializable = lVar.f24755a;
        Serializable serializable2 = this.f24755a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (r(this) && r(lVar)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return n().equals(lVar.n());
            }
            return q().longValue() == lVar.q().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : ae.i.j(m())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : ae.i.j(lVar.m())) == 0;
        }
        double dP = p();
        double dP2 = lVar.p();
        if (dP != dP2) {
            return Double.isNaN(dP) && Double.isNaN(dP2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f24755a;
        if (serializable == null) {
            return 31;
        }
        if (r(this)) {
            jDoubleToLongBits = q().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(q().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // com.google.gson.g
    public final String m() {
        Serializable serializable = this.f24755a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return q().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger n() {
        Serializable serializable = this.f24755a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (r(this)) {
            return BigInteger.valueOf(q().longValue());
        }
        String strM = m();
        ae.i.c(strM);
        return new BigInteger(strM);
    }

    public final double p() {
        return this.f24755a instanceof Number ? q().doubleValue() : Double.parseDouble(m());
    }

    public final Number q() {
        Serializable serializable = this.f24755a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ae.k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public l(Number number) {
        Objects.requireNonNull(number);
        this.f24755a = number;
    }

    public l(String str) {
        Objects.requireNonNull(str);
        this.f24755a = str;
    }
}
