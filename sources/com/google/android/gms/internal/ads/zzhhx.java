package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
final class zzhhx extends Number {
    private final String zza;

    public zzhhx(String str) {
        this.zza = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhhx) {
            return this.zza.equals(((zzhhx) obj).zza);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.zza);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.zza).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.zza);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.zza);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.zza).longValue();
        }
    }

    public final String toString() {
        return this.zza;
    }
}
