package com.google.android.libraries.ads.mobile.sdk.common;

import ads_mobile_sdk.a0;
import ads_mobile_sdk.c0;
import ads_mobile_sdk.d13;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.kn0;
import ads_mobile_sdk.x13;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.p000activity.ComponentActivity;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.loun;
import saneness.sunback;
import saneness.terni;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/AdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AdActivity extends ComponentActivity {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public sunback f19399kowloon;

    @Override // androidx.p000activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.onConfigurationChanged(newConfig);
        }
    }

    @Override // androidx.p000activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        monroe monroeVar;
        Bundle bundle2;
        super.onCreate(bundle);
        terni.f37333attabal.getClass();
        if (!en0.b.b()) {
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        Integer numValueOf = (extras == null || (bundle2 = extras.getBundle("ad_activity_delegate_bundle")) == null) ? null : Integer.valueOf(bundle2.getInt("ad_activity_delegate"));
        if (numValueOf == null) {
            ((d13) ((loun) ((i60) ((terni) en0.c.getValue())).q.get())).a("AdActivityMissingDelegateKey", new Exception("AdActivityMissingDelegateKey"));
            kn0.a("Could not retrieve AdActivityDelegate key", (Throwable) null);
            finish();
            return;
        }
        taiyuan taiyuanVar = en0.c;
        a0 a0Var = (a0) ((c0) ((i60) ((terni) taiyuanVar.getValue())).K.get()).d.remove(numValueOf);
        if (a0Var != null && (monroeVar = a0Var.b) != null) {
            monroe.attabal.attabal(monroeVar, null, 1, null);
        }
        sunback sunbackVar = a0Var != null ? a0Var.a : null;
        if (sunbackVar == null) {
            ((d13) ((loun) ((i60) ((terni) taiyuanVar.getValue())).q.get())).a("AdActivityMissingDelegate", new Exception("AdActivityMissingDelegate"));
            kn0.a("No AdActivityDelegate associated with key", (Throwable) null);
            finish();
            return;
        }
        this.f19399kowloon = sunbackVar;
        requestWindowFeature(1);
        try {
            Intrinsics.checkNotNullExpressionValue(getWindow().getDecorView(), "getDecorView(...)");
            sunbackVar.a(this);
        } catch (Exception e) {
            terni.f37333attabal.getClass();
            taiyuan taiyuanVar2 = en0.c;
            ((d13) ((loun) ((i60) ((terni) taiyuanVar2.getValue())).q.get())).a("AdActivityDecorViewWorkaround", e);
            kn0.a("Failed to get DecorView", e);
            saran saranVar = (saran) ((i60) ((terni) taiyuanVar2.getValue())).t.get();
            a block = new a(sunbackVar, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.onDestroy();
        }
        this.f19399kowloon = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.d();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.onResume();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.b();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.a();
        }
        super.onStop();
    }

    @Override // androidx.p000activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.c();
        }
    }

    @Override // androidx.p000activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.e();
        }
    }

    @Override // androidx.p000activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.e();
        }
    }

    @Override // androidx.p000activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        sunback sunbackVar = this.f19399kowloon;
        if (sunbackVar != null) {
            sunbackVar.e();
        }
    }
}
