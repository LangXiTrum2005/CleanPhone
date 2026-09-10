package com.dexterous.flutterlocalnotifications;

import android.net.Uri;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import xi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j, OnLastDeeplinkReadListener, OnGoogleAdIdReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f10543a;

    @Override // com.dexterous.flutterlocalnotifications.j
    public void a() {
        this.f10543a.b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public void b(boolean z10) {
        this.f10543a.a(Boolean.valueOf(z10));
    }

    @Override // com.adjust.sdk.OnGoogleAdIdReadListener
    public void onGoogleAdIdRead(String str) {
        this.f10543a.a(str);
    }

    @Override // com.adjust.sdk.OnLastDeeplinkReadListener
    public void onLastDeeplinkRead(Uri uri) {
        o oVar = this.f10543a;
        if (uri != null) {
            oVar.a(uri.toString());
        } else {
            oVar.a("");
        }
    }
}
