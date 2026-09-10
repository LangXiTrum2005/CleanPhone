package com.google.android.gms.ads.internal.util;

import eb.d0;
import java.util.Arrays;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbd {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbd(String str, double d10, double d11, double d12, int i10) {
        this.zza = str;
        this.zzc = d10;
        this.zzb = d11;
        this.zzd = d12;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return c0.l(this.zza, zzbdVar.zza) && this.zzb == zzbdVar.zzb && this.zzc == zzbdVar.zzc && this.zze == zzbdVar.zze && Double.compare(this.zzd, zzbdVar.zzd) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        d0 d0Var = new d0(this);
        d0Var.P0(this.zza, "name");
        d0Var.P0(Double.valueOf(this.zzc), "minBound");
        d0Var.P0(Double.valueOf(this.zzb), "maxBound");
        d0Var.P0(Double.valueOf(this.zzd), "percent");
        d0Var.P0(Integer.valueOf(this.zze), "count");
        return d0Var.toString();
    }
}
