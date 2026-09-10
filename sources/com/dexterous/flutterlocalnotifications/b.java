package com.dexterous.flutterlocalnotifications;

import com.adjust.sdk.OnAmazonAdIdReadListener;
import com.adjust.sdk.OnSdkVersionReadListener;
import xi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements j, OnSdkVersionReadListener, OnAmazonAdIdReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f10544a;

    @Override // com.dexterous.flutterlocalnotifications.j
    public void a() {
        this.f10544a.b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public void b(boolean z10) {
        this.f10544a.a(Boolean.valueOf(z10));
    }

    @Override // com.adjust.sdk.OnAmazonAdIdReadListener
    public void onAmazonAdIdRead(String str) {
        this.f10544a.a(str);
    }

    @Override // com.adjust.sdk.OnSdkVersionReadListener
    public void onSdkVersionRead(String str) {
        this.f10544a.a(str);
    }
}
