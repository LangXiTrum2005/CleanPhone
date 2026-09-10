package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzsj implements zzpx {
    final /* synthetic */ zzss zza;
    private final zzqi zzb;

    public /* synthetic */ zzsj(zzss zzssVar, zzqi zzqiVar, byte[] bArr) {
        Objects.requireNonNull(zzssVar);
        this.zza = zzssVar;
        this.zzb = zzqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zza(long j) {
        zzss zzssVar = this.zza;
        if (equals(zzssVar.zzI()) && zzssVar.zzJ() != null) {
            ((zzsv) zzssVar.zzJ()).zza.zzaw().zzd(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzb() {
        zzmh zzmhVarZzaY;
        zzss zzssVar = this.zza;
        if (equals(zzssVar.zzI()) && zzssVar.zzJ() != null && zzssVar.zzN() && (zzmhVarZzaY = ((zzsv) zzssVar.zzJ()).zza.zzaY()) != null) {
            zzmhVarZzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzc() {
        zzss zzssVar = this.zza;
        if (equals(zzssVar.zzI())) {
            zzssVar.zzM(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzd() {
        long jZzr;
        zzss zzssVar = this.zza;
        if (equals(zzssVar.zzI()) && zzssVar.zzJ() != null) {
            if (zzssVar.zzK().zzj() != -1) {
                long jZzj = zzssVar.zzK().zzk().zze / zzssVar.zzK().zzj();
                zzpz zzpzVarZzL = zzssVar.zzL();
                zzpzVarZzL.getClass();
                jZzr = zzfj.zzr(jZzj, zzpzVarZzL.zzi());
            } else {
                jZzr = -9223372036854775807L;
            }
            ((zzsv) zzssVar.zzJ()).zza.zzaw().zze(zzssVar.zzK().zzk().zze, zzfj.zzp(jZzr), SystemClock.elapsedRealtime() - zzssVar.zzO());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zze() {
        zzss.zza.getAndDecrement();
        zzss zzssVar = this.zza;
        if (zzssVar.zzJ() != null) {
            zzqi zzqiVar = this.zzb;
            ((zzsv) zzssVar.zzJ()).zza.zzaw().zzl(new zzqz(zzqiVar.zza, zzqiVar.zzb, zzqiVar.zzc, false, false, zzqiVar.zze));
        }
    }
}
