package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ju {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jx f2901;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2899 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Handler f2898 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jr f2900 = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.ju.4
        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            ju.m2746(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            ju.m2746(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ju.m2747(ju.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            ju.m2749(ju.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            ju.m2746(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            ju.m2746(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            ju.m2746(ju.this);
        }
    };

    public ju(jx jxVar) {
        this.f2901 = jxVar;
        jt.m2734().m2736(this.f2900);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2746(ju juVar) {
        juVar.f2898.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2750(ju juVar) {
        juVar.f2899 = true;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2747(ju juVar, final Activity activity) {
        juVar.f2898.postDelayed(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ju.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                ju.m2750(ju.this);
                if (ju.this.f2901 != null) {
                    ju.this.f2901.mo393(activity);
                }
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2749(ju juVar, Activity activity) {
        if (juVar.f2899) {
            juVar.f2899 = false;
            jx jxVar = juVar.f2901;
            if (jxVar != null) {
                jxVar.mo392(activity);
            }
        }
        juVar.f2898.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2751() {
        this.f2898.removeCallbacksAndMessages(null);
        if (this.f2900 != null) {
            jt.m2734().m2740(this.f2900);
            this.f2900 = null;
        }
    }
}
