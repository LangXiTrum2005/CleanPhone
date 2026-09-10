package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bi1 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12797a;

    public bi1(String str) {
        this.f12797a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f12797a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bi1) {
            return this.f12797a.equals(((bi1) obj).f12797a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f12797a);
    }

    public final int hashCode() {
        return this.f12797a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f12797a;
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
        String str = this.f12797a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f12797a;
    }
}
