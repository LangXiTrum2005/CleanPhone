package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzabm {
    final /* synthetic */ zzabn zza;
    private zzv zzb;

    public /* synthetic */ zzabm(zzabn zzabnVar, byte[] bArr) {
        Objects.requireNonNull(zzabnVar);
        this.zza = zzabnVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzt(zzbvVar.zzb);
        zztVar.zzu(zzbvVar.zzc);
        zztVar.zzm("video/raw");
        this.zzb = zztVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j, long j2, boolean z2) {
        if (z2) {
            zzabn zzabnVar = this.zza;
            if (zzabnVar.zzA() != null) {
                zzabnVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzM = this.zzb;
        if (zzvVarZzM == null) {
            zzvVarZzM = new zzt().zzM();
        }
        zzv zzvVar = zzvVarZzM;
        zzabn zzabnVar2 = this.zza;
        zzabnVar2.zzD().zzcS(j2, j, zzvVar, null);
        ((zzadj) zzabnVar2.zzz().remove()).zza(j);
    }
}
