package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclq implements zzijg {
    private final zzcli zza;

    private zzclq(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    public static zzclq zzc(zzcli zzcliVar) {
        return new zzclq(zzcliVar);
    }

    public static WeakReference zzd(zzcli zzcliVar) {
        WeakReference weakReferenceZzc = zzcliVar.zzc();
        zzijo.zzb(weakReferenceZzc);
        return weakReferenceZzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
