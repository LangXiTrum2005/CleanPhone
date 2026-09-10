package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzvj implements zzxw {
    public final zzxw zza;
    final /* synthetic */ zzvk zzb;
    private boolean zzc;

    public zzvj(zzvk zzvkVar, zzxw zzxwVar) {
        Objects.requireNonNull(zzvkVar);
        this.zzb = zzvkVar;
        this.zza = zzxwVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzd(zzle zzleVar, zzih zzihVar, int i2) {
        zzvk zzvkVar = this.zzb;
        if (zzvkVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzihVar.zzg(4);
            return -4;
        }
        long jZzi = zzvkVar.zzi();
        int iZzd = this.zza.zzd(zzleVar, zzihVar, i2);
        if (iZzd != -5) {
            long j = zzvkVar.zzb;
            if (j == Long.MIN_VALUE || ((iZzd != -4 || zzihVar.zze < j) && !(iZzd == -3 && jZzi == Long.MIN_VALUE && !zzihVar.zzd))) {
                return iZzd;
            }
            zzihVar.zza();
            zzihVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        zzv zzvVar = zzleVar.zzb;
        zzvVar.getClass();
        int i3 = zzvVar.zzJ;
        if (i3 != 0) {
            int i4 = zzvkVar.zzb == Long.MIN_VALUE ? zzvVar.zzK : 0;
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzH(i3);
            zztVarZza.zzI(i4);
            zzleVar.zzb = zztVarZza.zzM();
        } else if (zzvVar.zzK != 0) {
            i3 = 0;
            if (zzvkVar.zzb == Long.MIN_VALUE) {
            }
            zzt zztVarZza2 = zzvVar.zza();
            zztVarZza2.zzH(i3);
            zztVarZza2.zzI(i4);
            zzleVar.zzb = zztVarZza2.zzM();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
