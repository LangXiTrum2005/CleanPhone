package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyAdViewActivity extends b {
    AdColonyAdView j;

    public AdColonyAdViewActivity() {
        this.j = !a.d() ? null : a.b().k();
    }

    public void b() {
        ViewParent parent = this.f8997a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f8997a);
        }
        this.j.a();
        a.b().a((AdColonyAdView) null);
        finish();
    }

    public void c() {
        this.j.b();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public void onBackPressed() {
        b();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (!a.d() || (adColonyAdView = this.j) == null) {
            a.b().a((AdColonyAdView) null);
            finish();
            return;
        }
        this.f8998b = adColonyAdView.getOrientation();
        super.onCreate(bundle);
        this.j.b();
        AdColonyAdViewListener listener = this.j.getListener();
        if (listener != null) {
            listener.onOpened(this.j);
        }
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }
}
