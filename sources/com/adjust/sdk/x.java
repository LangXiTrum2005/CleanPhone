package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements InstallReferrerReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7062b;

    public /* synthetic */ x(Object obj, int i10) {
        this.f7061a = i10;
        this.f7062b = obj;
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public final void onFail(String str) {
        switch (this.f7061a) {
            case 0:
                ((ActivityHandler) this.f7062b).logger.debug(str, new Object[0]);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.f7062b).onFail(str);
                break;
        }
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
        switch (this.f7061a) {
            case 0:
                ((ActivityHandler) this.f7062b).sendInstallReferrer(referrerDetails, str);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.f7062b).onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
                break;
        }
    }
}
