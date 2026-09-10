package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f277a;

    public f(String str) {
        this.f277a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f277a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f277a;
        String str2 = ((f) obj).f277a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f277a);
    }

    public final int hashCode() {
        return this.f277a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f277a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f277a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f277a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f277a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f277a).longValue();
        }
    }

    public final String toString() {
        return this.f277a;
    }
}
