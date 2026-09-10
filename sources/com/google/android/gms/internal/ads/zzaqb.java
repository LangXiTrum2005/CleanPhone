package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
final class zzaqb implements zzaqa {
    private final zzaer zza;
    private final zzaga zzb;
    private final zzaqe zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaqb(zzaer zzaerVar, zzaga zzagaVar, zzaqe zzaqeVar, String str, int i2) throws zzat {
        this.zza = zzaerVar;
        this.zzb = zzagaVar;
        this.zzc = zzaqeVar;
        int i3 = zzaqeVar.zzb * zzaqeVar.zze;
        int i4 = zzaqeVar.zzd;
        int i5 = i3 / 8;
        if (i4 != i5) {
            throw zzat.zzb(p005e.a.a(new StringBuilder(String.valueOf(i5).length() + 28 + String.valueOf(i4).length()), i5, "Expected block size: ", i4, "; got: "), null);
        }
        int i6 = zzaqeVar.zzc * i5;
        int i7 = i6 * 8;
        int iMax = Math.max(i5, i6 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzl("audio/wav");
        zztVar.zzm(str);
        zztVar.zzh(i7);
        zztVar.zzi(i7);
        zztVar.zzn(iMax);
        zztVar.zzE(zzaqeVar.zzb);
        zztVar.zzF(zzaqeVar.zzc);
        zztVar.zzG(i2);
        this.zzd = zztVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(int i2, long j) {
        this.zza.zzw(new zzaqh(this.zzc, 1, i2, j));
        this.zzb.zzu(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final boolean zzc(zzaep zzaepVar, long j) throws IOException {
        int i2;
        int i3;
        long j2 = j;
        while (j2 > 0 && (i2 = this.zzg) < (i3 = this.zze)) {
            int iZzy = this.zzb.zzy(zzaepVar, (int) Math.min(i3 - i2, j2), true);
            if (iZzy == -1) {
                j2 = 0;
            } else {
                this.zzg += iZzy;
                j2 -= (long) iZzy;
            }
        }
        zzaqe zzaqeVar = this.zzc;
        int i4 = this.zzg;
        int i5 = zzaqeVar.zzd;
        int i6 = i4 / i5;
        if (i6 > 0) {
            long jZzt = this.zzf + zzfj.zzt(this.zzh, 1000000L, zzaqeVar.zzc, RoundingMode.DOWN);
            int i7 = i6 * i5;
            int i8 = this.zzg - i7;
            this.zzb.zzx(jZzt, 1, i7, i8, null);
            this.zzh += (long) i6;
            this.zzg = i8;
        }
        return j2 <= 0;
    }
}
