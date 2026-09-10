package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class LazilyParsedNumber extends Number {
    public final String X;

    public LazilyParsedNumber(String str) {
        this.X = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.X);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        Object obj2 = ((LazilyParsedNumber) obj).X;
        String str = this.X;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.X;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.X;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.X;
    }
}
