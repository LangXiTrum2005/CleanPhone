package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzama implements zzacn {
    private final zzamb zza = new zzamb(null, 0);
    private final zzdy zzb = new zzdy(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        int iZza = zzacoVar.zza(this.zzb.zzN(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        this.zza.zzb(zzacqVar, new zzanx(Integer.MIN_VALUE, 0, 1));
        zzacqVar.zzD();
        zzacqVar.zzO(new zzadl(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        zzdy zzdyVar = new zzdy(10);
        int i = 0;
        while (true) {
            zzacc zzaccVar = (zzacc) zzacoVar;
            zzaccVar.zzm(zzdyVar.zzN(), 0, 10, false);
            zzdyVar.zzL(0);
            if (zzdyVar.zzo() != 4801587) {
                break;
            }
            zzdyVar.zzM(3);
            int iZzl = zzdyVar.zzl();
            i += iZzl + 10;
            zzaccVar.zzl(iZzl, false);
        }
        zzacoVar.zzj();
        zzacc zzaccVar2 = (zzacc) zzacoVar;
        zzaccVar2.zzl(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                zzaccVar2.zzm(zzdyVar.zzN(), 0, 6, false);
                zzdyVar.zzL(0);
                if (zzdyVar.zzq() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iZzb = zzabn.zzb(zzdyVar.zzN());
                if (iZzb == -1) {
                    return false;
                }
                zzaccVar2.zzl(iZzb - 6, false);
            }
            zzacoVar.zzj();
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            zzaccVar2.zzl(i2, false);
        }
    }
}
