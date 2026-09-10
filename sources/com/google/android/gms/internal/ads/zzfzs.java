package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzs implements zzijg {
    private final zzijp zza;

    private zzfzs(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzfzs zza(zzijp zzijpVar) {
        return new zzfzs(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zzijo.zzb(dir);
        return dir;
    }
}
