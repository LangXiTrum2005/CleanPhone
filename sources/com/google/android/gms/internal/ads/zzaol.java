package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaol implements zzaog {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzapy zzb;
    private zzaok zzg;
    private long zzh;
    private String zzi;
    private zzaga zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaoj zze = new zzaoj(128);
    private long zzl = -9223372036854775807L;
    private final zzaox zzf = new zzaox(178, 128);
    private final zzer zzc = new zzer();

    public zzaol(zzapy zzapyVar, String str) {
        this.zzb = zzapyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        zzgm.zzj(this.zzd);
        this.zze.zza();
        zzaok zzaokVar = this.zzg;
        if (zzaokVar != null) {
            zzaokVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzi = zzapuVar.zzc();
        zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 2);
        this.zzj = zzagaVarZzu;
        this.zzg = new zzaok(zzagaVarZzu);
        this.zzb.zza(zzaerVar, zzapuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        int i2;
        int i3 = 3;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzh += (long) zzerVar.zzd();
        this.zzj.zzz(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzi == iZze) {
                break;
            }
            int i4 = iZzi + 3;
            int i5 = zzerVar.zzi()[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i6 = iZzi - iZzg;
            if (!this.zzk) {
                if (i6 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzi);
                }
                int i7 = i6 < 0 ? -i6 : 0;
                zzaoj zzaojVar = this.zze;
                if (zzaojVar.zzb(i5, i7)) {
                    zzaga zzagaVar = this.zzj;
                    int i8 = zzaojVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaojVar.zzc, zzaojVar.zza);
                    zzeq zzeqVar = new zzeq(bArrCopyOf, bArrCopyOf.length);
                    zzeqVar.zzo(i8);
                    zzeqVar.zzo(4);
                    zzeqVar.zzg();
                    zzeqVar.zzh(8);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                        zzeqVar.zzh(i3);
                    }
                    int iZzj = zzeqVar.zzj(4);
                    float f = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzeqVar.zzj(8);
                        int iZzj3 = zzeqVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzee.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f = zza[iZzj];
                    } else {
                        zzee.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(2);
                        zzeqVar.zzh(1);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(11);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                        }
                    }
                    if (zzeqVar.zzj(2) != 0) {
                        zzee.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzeqVar.zzg();
                    int iZzj4 = zzeqVar.zzj(16);
                    zzeqVar.zzg();
                    if (zzeqVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzee.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i9 = iZzj4 - 1;
                            int i10 = 0;
                            while (i9 > 0) {
                                i9 >>= 1;
                                i10++;
                            }
                            zzeqVar.zzh(i10);
                        }
                    }
                    zzeqVar.zzg();
                    int iZzj5 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    int iZzj6 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    zzeqVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzl("video/mp2t");
                    zztVar.zzm("video/mp4v-es");
                    zztVar.zzt(iZzj5);
                    zztVar.zzu(iZzj6);
                    zztVar.zzz(f2);
                    zztVar.zzp(Collections.singletonList(bArrCopyOf));
                    zzagaVar.zzu(zztVar.zzM());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzi);
            zzaox zzaoxVar = this.zzf;
            if (i6 > 0) {
                zzaoxVar.zzd(bArrZzi, iZzg, iZzi);
                i2 = 0;
            } else {
                i2 = -i6;
            }
            if (zzaoxVar.zze(i2)) {
                int iZza = zzgm.zza(zzaoxVar.zza, zzaoxVar.zzb);
                zzer zzerVar2 = this.zzc;
                String str2 = zzfj.zza;
                zzerVar2.zzb(zzaoxVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzerVar2);
            }
            if (i5 == 178) {
                if (zzerVar.zzi()[iZzi + 2] == 1) {
                    zzaoxVar.zzc(178);
                }
                i5 = 178;
            }
            int i11 = iZze - iZzi;
            this.zzg.zzd(this.zzh - ((long) i11), i11, this.zzk);
            this.zzg.zzb(i5, this.zzl);
            iZzg = i4;
            i3 = 3;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
        zzaok zzaokVar = this.zzg;
        zzaokVar.getClass();
        if (z2) {
            zzaokVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
