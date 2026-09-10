package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctl implements zzijg {
    private final zzctj zza;

    private zzctl(zzctj zzctjVar) {
        this.zza = zzctjVar;
    }

    public static zzctl zzc(zzctj zzctjVar) {
        return new zzctl(zzctjVar);
    }

    public static View zzd(zzctj zzctjVar) {
        View viewZzb = zzctjVar.zzb();
        zzijo.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
