package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvi implements zzwz {
    private final zzaeu zza;
    private zzaeo zzb;
    private zzaep zzc;

    public zzvi(zzaeu zzaeuVar) {
        this.zza = zzaeuVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zza(zzj zzjVar, Uri uri, Map map, long j, long j2, zzaer zzaerVar) throws IOException {
        zzaef zzaefVar = new zzaef(zzjVar, j, j2);
        this.zzc = zzaefVar;
        if (this.zzb != null) {
            return;
        }
        zzaeo[] zzaeoVarArrZzb = this.zza.zzb(uri, map);
        int length = zzaeoVarArrZzb.length;
        zzgta zzgtaVarZzv = zzgtd.zzv(length);
        boolean z2 = true;
        if (length == 1) {
            this.zzb = zzaeoVarArrZzb[0];
        } else {
            for (zzaeo zzaeoVar : zzaeoVarArrZzb) {
                try {
                    if (zzaeoVar.zza(zzaefVar)) {
                        this.zzb = zzaeoVar;
                        zzgqa.zzi(true);
                        zzaefVar.zzl();
                        break;
                    } else {
                        zzgtaVarZzv.zzh(zzaeoVar.zzb());
                        boolean z3 = this.zzb != null || zzaefVar.zzn() == j;
                        zzgqa.zzi(z3);
                        zzaefVar.zzl();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaefVar.zzn() == j) {
                    }
                } catch (Throwable th) {
                    if (this.zzb == null && zzaefVar.zzn() != j) {
                        z2 = false;
                    }
                    zzgqa.zzi(z2);
                    zzaefVar.zzl();
                    throw th;
                }
                zzgqa.zzi(z3);
                zzaefVar.zzl();
            }
            if (this.zzb == null) {
                String strZzd = zzgpu.zzd(zzgud.zzc(zzgtd.zzr(zzaeoVarArrZzb), zzvh.zza), ", ");
                throw new zzyi(android.support.v4.media.a.s(new StringBuilder(strZzd.length() + 58), "None of the available extractors (", strZzd, ") could read the stream."), uri, zzgtaVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzaerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzb() {
        zzaeo zzaeoVar = this.zzb;
        if (zzaeoVar != null) {
            zzaeoVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzc() {
        zzaeo zzaeoVar = this.zzb;
        if (zzaeoVar != null && (zzaeoVar instanceof zzaji)) {
            ((zzaji) zzaeoVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final long zzd() {
        zzaep zzaepVar = this.zzc;
        if (zzaepVar != null) {
            return zzaepVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zze(long j, long j2) {
        zzaeo zzaeoVar = this.zzb;
        zzaeoVar.getClass();
        zzaeoVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzf(zzafo zzafoVar) throws IOException {
        zzaep zzaepVar;
        zzaeo zzaeoVar = this.zzb;
        if (zzaeoVar == null || (zzaepVar = this.zzc) == null) {
            throw null;
        }
        return zzaeoVar.zzd(zzaepVar, zzafoVar);
    }
}
