package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaop implements zzaog {
    private final zzapj zza;
    private String zzb;
    private zzaga zzc;
    private zzaoo zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaox zzg = new zzaox(32, 128);
    private final zzaox zzh = new zzaox(33, 128);
    private final zzaox zzi = new zzaox(34, 128);
    private final zzaox zzj = new zzaox(39, 128);
    private final zzaox zzk = new zzaox(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaop(zzapj zzapjVar, String str) {
        this.zza = zzapjVar;
    }

    @RequiresNonNull
    private final void zzf(long j, int i2, int i3, long j2) {
        this.zzd.zzb(j, i2, i3, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i3);
            this.zzh.zzc(i3);
            this.zzi.zzc(i3);
        }
        this.zzj.zzc(i3);
        this.zzk.zzc(i3);
    }

    @RequiresNonNull
    private final void zzg(byte[] bArr, int i2, int i3) {
        this.zzd.zzc(bArr, i2, i3);
        if (!this.zze) {
            this.zzg.zzd(bArr, i2, i3);
            this.zzh.zzd(bArr, i2, i3);
            this.zzi.zzd(bArr, i2, i3);
        }
        this.zzj.zzd(bArr, i2, i3);
        this.zzk.zzd(bArr, i2, i3);
    }

    @RequiresNonNull
    private final void zzh(long j, int i2, int i3, long j2) {
        this.zzd.zzd(j, i2, this.zze);
        if (!this.zze) {
            zzaox zzaoxVar = this.zzg;
            zzaoxVar.zze(i3);
            zzaox zzaoxVar2 = this.zzh;
            zzaoxVar2.zze(i3);
            zzaox zzaoxVar3 = this.zzi;
            zzaoxVar3.zze(i3);
            if (zzaoxVar.zzb() && zzaoxVar2.zzb() && zzaoxVar3.zzb()) {
                String str = this.zzb;
                int i4 = zzaoxVar.zzb;
                byte[] bArr = new byte[zzaoxVar2.zzb + i4 + zzaoxVar3.zzb];
                System.arraycopy(zzaoxVar.zza, 0, bArr, 0, i4);
                System.arraycopy(zzaoxVar2.zza, 0, bArr, zzaoxVar.zzb, zzaoxVar2.zzb);
                System.arraycopy(zzaoxVar3.zza, 0, bArr, zzaoxVar.zzb + zzaoxVar2.zzb, zzaoxVar3.zzb);
                String strZzb = null;
                zzgg zzggVarZzg = zzgm.zzg(zzaoxVar2.zza, 3, zzaoxVar2.zzb, null);
                zzgb zzgbVar = zzggVarZzg.zzb;
                if (zzgbVar != null) {
                    int i5 = zzgbVar.zzf;
                    int[] iArr = zzgbVar.zze;
                    int i6 = zzgbVar.zzd;
                    strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, i6, iArr, i5);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzl("video/mp2t");
                zztVar.zzm("video/hevc");
                zztVar.zzj(strZzb);
                zztVar.zzt(zzggVarZzg.zze);
                zztVar.zzu(zzggVarZzg.zzf);
                zztVar.zzv(zzggVarZzg.zzg);
                zztVar.zzw(zzggVarZzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzggVarZzg.zzk);
                zzhVar.zzb(zzggVarZzg.zzl);
                zzhVar.zzc(zzggVarZzg.zzm);
                zzhVar.zze(zzggVarZzg.zzc + 8);
                zzhVar.zzf(zzggVarZzg.zzd + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzggVarZzg.zzi);
                zztVar.zzo(zzggVarZzg.zzj);
                zztVar.zzD(zzggVarZzg.zza + 1);
                zztVar.zzp(Collections.singletonList(bArr));
                zzv zzvVarZzM = zztVar.zzM();
                this.zzc.zzu(zzvVarZzM);
                int i7 = zzvVarZzM.zzq;
                zzgqa.zzi(i7 != -1);
                this.zza.zzb(i7);
                this.zze = true;
            }
        }
        zzaox zzaoxVar4 = this.zzj;
        if (zzaoxVar4.zze(i3)) {
            int iZza = zzgm.zza(zzaoxVar4.zza, zzaoxVar4.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzaoxVar4.zza, iZza);
            zzerVar.zzk(5);
            this.zza.zzc(j2, zzerVar);
        }
        zzaox zzaoxVar5 = this.zzk;
        if (zzaoxVar5.zze(i3)) {
            int iZza2 = zzgm.zza(zzaoxVar5.zza, zzaoxVar5.zzb);
            zzer zzerVar2 = this.zzn;
            zzerVar2.zzb(zzaoxVar5.zza, iZza2);
            zzerVar2.zzk(5);
            this.zza.zzc(j2, zzerVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaoo zzaooVar = this.zzd;
        if (zzaooVar != null) {
            zzaooVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzb = zzapuVar.zzc();
        zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 2);
        this.zzc = zzagaVarZzu;
        this.zzd = new zzaoo(zzagaVarZzu);
        this.zza.zza(zzaerVar, zzapuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzm = j;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        int i2;
        int i3;
        this.zzc.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int iZzg = zzerVar.zzg();
            int iZze = zzerVar.zze();
            byte[] bArrZzi = zzerVar.zzi();
            this.zzl += (long) zzerVar.zzd();
            this.zzc.zzz(zzerVar, zzerVar.zzd());
            while (iZzg < iZze) {
                int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzi == iZze) {
                    zzg(bArrZzi, iZzg, iZze);
                    return;
                }
                int i4 = bArrZzi[iZzi + 3] & 126;
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
                long j = this.zzl - ((long) i7);
                zzh(j, i7, i6 < 0 ? -i6 : 0, this.zzm);
                zzf(j, i7, i4 >> 1, this.zzm);
                iZzg = i2 + i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
        this.zzc.getClass();
        String str = zzfj.zza;
        if (z2) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
