package com.startapp.sdk.internal;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o7 extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p7 f41296a;

    public o7(p7 p7Var) {
        this.f41296a = p7Var;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        com.startapp.sdk.adsbase.l lVar = this.f41296a.f41351c;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        com.startapp.sdk.adsbase.l lVar = this.f41296a.f41351c;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        Intrinsics.f(adError, "adError");
        com.startapp.sdk.adsbase.l lVar = this.f41296a.f41351c;
        if (lVar != null) {
            adError.toString();
            lVar.e();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        com.startapp.sdk.adsbase.l lVar = this.f41296a.f41351c;
        if (lVar != null) {
            lVar.d();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        com.startapp.sdk.adsbase.l lVar = this.f41296a.f41351c;
        if (lVar != null) {
            lVar.a();
        }
    }
}
