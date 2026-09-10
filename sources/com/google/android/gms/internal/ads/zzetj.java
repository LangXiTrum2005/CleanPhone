package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzetj implements zzgpr {
    static final /* synthetic */ zzetj zza = new zzetj();

    private /* synthetic */ zzetj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzetl(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
