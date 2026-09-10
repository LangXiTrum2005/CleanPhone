package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzlq {
    private final zzik zza;

    @Deprecated
    public zzlq(Context context, zzced zzcedVar) {
        this.zza = new zzik(context, zzcedVar);
    }

    @Deprecated
    public final zzlq zza(final zzkg zzkgVar) {
        zzik zzikVar = this.zza;
        zzcw.zzf(!zzikVar.zzr);
        zzkgVar.getClass();
        zzikVar.zzf = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzic
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzkgVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlq zzb(final zzyb zzybVar) {
        zzik zzikVar = this.zza;
        zzcw.zzf(!zzikVar.zzr);
        zzybVar.getClass();
        zzikVar.zze = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzij
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzybVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlr zzc() {
        zzik zzikVar = this.zza;
        zzcw.zzf(!zzikVar.zzr);
        zzikVar.zzr = true;
        return new zzlr(zzikVar);
    }
}
