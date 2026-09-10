package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzli {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzli(zzlh zzlhVar, byte[] bArr) {
        this.zza = zzlhVar.zze();
        this.zzb = zzlhVar.zzf();
        this.zzc = zzlhVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzli)) {
            return false;
        }
        zzli zzliVar = (zzli) obj;
        return this.zza == zzliVar.zza && this.zzb == zzliVar.zzb && this.zzc == zzliVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final zzlh zza() {
        return new zzlh(this, null);
    }
}
