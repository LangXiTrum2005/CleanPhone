package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalf implements zzaeo {
    private zzaer zza;
    private zzalm zzb;
    private boolean zzc;

    @EnsuresNonNullIf
    private final boolean zzh(zzaep zzaepVar) throws IOException {
        zzalh zzalhVar = new zzalh();
        if (zzalhVar.zzc(zzaepVar, true) && (zzalhVar.zza & 2) == 2) {
            int iMin = Math.min(zzalhVar.zze, 8);
            zzer zzerVar = new zzer(iMin);
            zzaepVar.zzi(zzerVar.zzi(), 0, iMin);
            zzerVar.zzh(0);
            if (zzerVar.zzd() >= 5 && zzerVar.zzs() == 127 && zzerVar.zzz() == 1179402563) {
                this.zzb = new zzald();
            } else {
                zzerVar.zzh(0);
                try {
                    if (zzagg.zzd(1, zzerVar, true)) {
                        this.zzb = new zzalo();
                    } else {
                        zzerVar.zzh(0);
                        if (zzalj.zzd(zzerVar)) {
                            this.zzb = new zzalj();
                        }
                    }
                } catch (zzat unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        try {
            return zzh(zzaepVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zza = zzaerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzaepVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzaepVar.zzl();
        }
        if (!this.zzc) {
            zzaga zzagaVarZzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzagaVarZzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzaepVar, zzafoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        zzalm zzalmVar = this.zzb;
        if (zzalmVar != null) {
            zzalmVar.zzf(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
