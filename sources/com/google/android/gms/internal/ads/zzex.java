package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzex {
    final /* synthetic */ zzfa zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzex(zzfa zzfaVar, int i2) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i2;
    }

    public final void zza() {
        zzfa zzfaVar = this.zza;
        if (!zzfaVar.zzd().zza()) {
            if (this.zzg) {
                zzfaVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzbfVarZzq = zzfaVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfaVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfaVar.zzd();
        zzbb zzbbVarZzd2 = zzfaVar.zzd();
        zzbb zzbbVarZzd3 = zzfaVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzu = zzbbVarZzd3.zzu();
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzfaVar.zzf());
            jZzu -= zzfj.zzp(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzu == this.zzf) {
            long j = jElapsedRealtime - this.zzh;
            int i2 = this.zzb;
            if (j >= i2) {
                zzfaVar.zze().zza(new zzfb(2, i2));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzu;
        zzfaVar.zzg().zzk(2);
        zzfaVar.zzg().zzi(2, this.zzb);
    }
}
