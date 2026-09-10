package com.dexterous.flutterlocalnotifications;

import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import java.util.HashMap;
import xi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j, OnPurchaseVerificationFinishedListener, OnDeeplinkResolvedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f10545a;

    public /* synthetic */ c(o oVar) {
        this.f10545a = oVar;
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public void a() {
        this.f10545a.b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public void b(boolean z10) {
        this.f10545a.a(Boolean.valueOf(z10));
    }

    @Override // com.adjust.sdk.OnDeeplinkResolvedListener
    public void onDeeplinkResolved(String str) {
        this.f10545a.a(str);
    }

    @Override // com.adjust.sdk.OnPurchaseVerificationFinishedListener
    public void onVerificationFinished(AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
        HashMap map = new HashMap();
        map.put("code", String.valueOf(adjustPurchaseVerificationResult.getCode()));
        map.put("verificationStatus", adjustPurchaseVerificationResult.getVerificationStatus());
        map.put("message", adjustPurchaseVerificationResult.getMessage());
        this.f10545a.a(map);
    }
}
