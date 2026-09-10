package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzut {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzut(String str, boolean z2, boolean z3) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzut.class) {
            zzut zzutVar = (zzut) obj;
            if (TextUtils.equals(this.zza, zzutVar.zza) && this.zzb == zzutVar.zzb && this.zzc == zzutVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
