package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzft implements zzao {
    public final int zza;

    public zzft(int i2) {
        this.zza = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzft) && this.zza == ((zzft) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i2 = this.zza;
        return androidx.datastore.preferences.protobuf.a.g(i2, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i2).length() + 19));
    }
}
