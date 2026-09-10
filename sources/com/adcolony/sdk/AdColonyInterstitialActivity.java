package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyInterstitialActivity extends b {
    AdColonyInterstitial j;
    private i k;

    public AdColonyInterstitialActivity() {
        this.j = !a.d() ? null : a.b().j();
    }

    @Override // com.adcolony.sdk.b
    public void a(h0 h0Var) {
        String strE;
        super.a(h0Var);
        d dVarC = a.b().c();
        f1 f1VarF = c0.f(h0Var.a(), "v4iap");
        e1 e1VarA = c0.a(f1VarF, "product_ids");
        AdColonyInterstitial adColonyInterstitial = this.j;
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null && (strE = e1VarA.e(0)) != null) {
            this.j.getListener().onIAPEvent(this.j, strE, c0.d(f1VarF, "engagement_type"));
        }
        dVarC.a(this.f8997a);
        if (this.j != null) {
            dVarC.f().remove(this.j.b());
            if (this.j.getListener() != null) {
                this.j.getListener().onClosed(this.j);
                this.j.a((c) null);
                this.j.setListener(null);
            }
            this.j.o();
            this.j = null;
        }
        i iVar = this.k;
        if (iVar != null) {
            iVar.a();
            this.k = null;
        }
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.adcolony.sdk.b, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.adcolony.sdk.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.j;
        this.f8998b = adColonyInterstitial2 == null ? -1 : adColonyInterstitial2.f();
        super.onCreate(bundle);
        if (!a.d() || (adColonyInterstitial = this.j) == null) {
            return;
        }
        p0 p0VarE = adColonyInterstitial.e();
        if (p0VarE != null) {
            p0VarE.a(this.f8997a);
        }
        this.k = new i(new Handler(Looper.getMainLooper()), this.j);
        if (this.j.getListener() != null) {
            this.j.getListener().onOpened(this.j);
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
