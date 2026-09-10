package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.DataStoreImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfyb implements zzijg {
    private final zzijp zza;

    private zzfyb(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzfyb zza(zzijp zzijpVar) {
        return new zzfyb(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcln) this.zza).zza();
        Intrinsics.f(context, "context");
        DataStoreImpl dataStoreImplC = DataStoreFactory.c(zzfxz.zza, null, null, new Function0() { // from class: com.google.android.gms.internal.ads.zzfya
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Object invoke() {
                return DataStoreFile.a(context, "ad_quality_data.pb");
            }
        }, 14);
        zzijo.zzb(dataStoreImplC);
        return dataStoreImplC;
    }
}
