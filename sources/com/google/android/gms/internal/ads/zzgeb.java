package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgeb implements zzijg {
    private final zzijp zza;

    private zzgeb(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzgeb zza(zzijp zzijpVar) {
        return new zzgeb(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zzijo.zzb(displayMetrics);
        return displayMetrics;
    }
}
