package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dern implements Callable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ PurchasesResponseListener f16507arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ String f16508kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final /* synthetic */ attabal f16509monoploid;

    public dern(attabal attabalVar, String str, PurchasesResponseListener purchasesResponseListener) {
        this.f16508kowloon = str;
        this.f16507arytenoidectomy = purchasesResponseListener;
        this.f16509monoploid = attabalVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcz zzczVarMerc = attabal.merc(this.f16509monoploid, this.f16508kowloon, 9);
        if (zzczVarMerc.zzb() != null) {
            this.f16507arytenoidectomy.onQueryPurchasesResponse(zzczVarMerc.zza(), zzczVarMerc.zzb());
            return null;
        }
        this.f16507arytenoidectomy.onQueryPurchasesResponse(zzczVarMerc.zza(), com.google.android.gms.internal.play_billing.zzai.zzk());
        return null;
    }
}
