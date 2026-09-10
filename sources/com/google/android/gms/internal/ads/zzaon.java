package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaon implements zzaog {
    private final zzapj zza;
    private long zzf;
    private String zzh;
    private zzaga zzi;
    private zzaom zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzaox zzc = new zzaox(7, 128);
    private final zzaox zzd = new zzaox(8, 128);
    private final zzaox zze = new zzaox(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaon(zzapj zzapjVar, boolean z2, boolean z3, String str) {
        this.zza = zzapjVar;
    }

    @RequiresNonNull
    private final void zzf(long j, int i2, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i2);
            this.zzd.zzc(i2);
        }
        this.zze.zzc(i2);
        this.zzj.zzd(j, i2, j2, this.zzm);
    }

    @RequiresNonNull
    private final void zzg(byte[] bArr, int i2, int i3) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i2, i3);
            this.zzd.zzd(bArr, i2, i3);
        }
        this.zze.zzd(bArr, i2, i3);
    }

    @RequiresNonNull
    private final void zzh(long j, int i2, int i3, long j2) {
        if (!this.zzk) {
            zzaox zzaoxVar = this.zzc;
            zzaoxVar.zze(i3);
            zzaox zzaoxVar2 = this.zzd;
            zzaoxVar2.zze(i3);
            if (this.zzk) {
                if (zzaoxVar.zzb()) {
                    zzgl zzglVarZze = zzgm.zze(zzaoxVar.zza, 4, zzaoxVar.zzb);
                    this.zza.zzb(zzglVarZze.zzm);
                    this.zzj.zza(zzglVarZze);
                    zzaoxVar.zza();
                } else if (zzaoxVar2.zzb()) {
                    this.zzj.zzb(zzgm.zzh(zzaoxVar2.zza, 4, zzaoxVar2.zzb));
                    zzaoxVar2.zza();
                }
            } else if (zzaoxVar.zzb() && zzaoxVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaoxVar.zza, zzaoxVar.zzb));
                arrayList.add(Arrays.copyOf(zzaoxVar2.zza, zzaoxVar2.zzb));
                zzgl zzglVarZze2 = zzgm.zze(zzaoxVar.zza, 4, zzaoxVar.zzb);
                zzgk zzgkVarZzh = zzgm.zzh(zzaoxVar2.zza, 4, zzaoxVar2.zzb);
                String strZza = zzdo.zza(zzglVarZze2.zza, zzglVarZze2.zzb, zzglVarZze2.zzc);
                zzaga zzagaVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(strZza);
                zztVar.zzt(zzglVarZze2.zze);
                zztVar.zzu(zzglVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzglVarZze2.zzj);
                zzhVar.zzb(zzglVarZze2.zzk);
                zzhVar.zzc(zzglVarZze2.zzl);
                zzhVar.zze(zzglVarZze2.zzh + 8);
                zzhVar.zzf(zzglVarZze2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzglVarZze2.zzg);
                zztVar.zzp(arrayList);
                int i4 = zzglVarZze2.zzm;
                zztVar.zzo(i4);
                zzagaVar.zzu(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i4);
                this.zzj.zza(zzglVarZze2);
                this.zzj.zzb(zzgkVarZzh);
                zzaoxVar.zza();
                zzaoxVar2.zza();
            }
        }
        zzaox zzaoxVar3 = this.zze;
        if (zzaoxVar3.zze(i3)) {
            int iZza = zzgm.zza(zzaoxVar3.zza, zzaoxVar3.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzaoxVar3.zza, iZza);
            zzerVar.zzh(4);
            this.zza.zzc(j2, zzerVar);
        }
        if (this.zzj.zze(j, i2, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgm.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaom zzaomVar = this.zzj;
        if (zzaomVar != null) {
            zzaomVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzh = zzapuVar.zzc();
        zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 2);
        this.zzi = zzagaVarZzu;
        this.zzj = new zzaom(zzagaVarZzu, false, false);
        this.zza.zza(zzaerVar, zzapuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzl = j;
        int i3 = i2 & 2;
        this.zzm = (i3 != 0) | this.zzm;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        int i2;
        int i3;
        this.zzi.getClass();
        String str = zzfj.zza;
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzf += (long) zzerVar.zzd();
        this.zzi.zzz(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzi == iZze) {
                zzg(bArrZzi, iZzg, iZze);
                return;
            }
            int i4 = bArrZzi[iZzi + 3] & 31;
            if (iZzi > 0) {
                int i5 = iZzi - 1;
                if (bArrZzi[i5] == 0) {
                    i3 = 4;
                    i2 = i5;
                } else {
                    i2 = iZzi;
                    i3 = 3;
                }
            } else {
                i2 = iZzi;
                i3 = 3;
            }
            int i6 = i2 - iZzg;
            if (i6 > 0) {
                zzg(bArrZzi, iZzg, i2);
            }
            int i7 = iZze - i2;
            long j = this.zzf - ((long) i7);
            zzh(j, i7, i6 < 0 ? -i6 : 0, this.zzl);
            zzf(j, i4, this.zzl);
            iZzg = i2 + i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
        this.zzi.getClass();
        String str = zzfj.zza;
        if (z2) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
