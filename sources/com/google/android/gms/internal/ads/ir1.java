package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15833a;

    public ir1(String str) {
        this.f15833a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f15833a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ir1) {
            return this.f15833a.equals(((ir1) obj).f15833a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f15833a);
    }

    public final int hashCode() {
        return this.f15833a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f15833a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return vc1.b(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f15833a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return vc1.b(str).longValue();
        }
    }

    public final String toString() {
        return this.f15833a;
    }
}
