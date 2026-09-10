package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 extends dr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f15368a;

    public hr1(bi1 bi1Var) {
        this.f15368a = bi1Var;
    }

    public static boolean q(hr1 hr1Var) {
        Serializable serializable = hr1Var.f15368a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.dr1
    public final String b() {
        Serializable serializable = this.f15368a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return n().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hr1.class != obj.getClass()) {
            return false;
        }
        hr1 hr1Var = (hr1) obj;
        Serializable serializable = hr1Var.f15368a;
        Serializable serializable2 = this.f15368a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (q(this) && q(hr1Var)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return p().equals(hr1Var.p());
            }
            return n().longValue() == hr1Var.n().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : vc1.b(b())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : vc1.b(hr1Var.b())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? n().doubleValue() : Double.parseDouble(b());
        double dDoubleValue2 = serializable instanceof Number ? hr1Var.n().doubleValue() : Double.parseDouble(hr1Var.b());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f15368a;
        if (serializable == null) {
            return 31;
        }
        if (q(this)) {
            jDoubleToLongBits = n().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(n().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final Number n() {
        Serializable serializable = this.f15368a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ir1((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final BigInteger p() {
        Serializable serializable = this.f15368a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (q(this)) {
            return BigInteger.valueOf(n().longValue());
        }
        String strB = b();
        vc1.h(strB);
        return new BigInteger(strB);
    }

    public hr1(Boolean bool) {
        this.f15368a = bool;
    }

    public hr1(String str) {
        this.f15368a = str;
    }
}
