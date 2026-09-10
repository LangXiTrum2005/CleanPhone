package com.dexterous.flutterlocalnotifications;

import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.OnIsEnabledListener;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import java.util.HashMap;
import xi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j, OnIsEnabledListener, OnPurchaseVerificationFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f10546a;

    public /* synthetic */ d(o oVar) {
        this.f10546a = oVar;
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public void a() {
        this.f10546a.b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public void b(boolean z10) {
        this.f10546a.a(Boolean.valueOf(z10));
    }

    @Override // com.adjust.sdk.OnIsEnabledListener
    public void onIsEnabledRead(boolean z10) {
        this.f10546a.a(Boolean.valueOf(z10));
    }

    @Override // com.adjust.sdk.OnPurchaseVerificationFinishedListener
    public void onVerificationFinished(AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
        HashMap map = new HashMap();
        map.put("code", String.valueOf(adjustPurchaseVerificationResult.getCode()));
        map.put("verificationStatus", adjustPurchaseVerificationResult.getVerificationStatus());
        map.put("message", adjustPurchaseVerificationResult.getMessage());
        this.f10546a.a(map);
    }
}
