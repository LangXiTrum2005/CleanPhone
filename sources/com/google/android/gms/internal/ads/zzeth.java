package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzeth implements zzgxu {
    static final /* synthetic */ zzeth zza = new zzeth();

    private /* synthetic */ zzeth() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgym.zza(new zzetl(null, -1)) : zzgym.zza(new zzetl(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
