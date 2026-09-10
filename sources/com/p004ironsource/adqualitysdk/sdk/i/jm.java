package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public final class jm {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jo f2738;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2735 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2737 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jh f2736 = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.4
        @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jm.m2627(jm.this);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jm.m2627(jm.this);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jm.m2626(jm.this, activity);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jm.m2629(jm.this, activity);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jm.m2627(jm.this);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jm.m2627(jm.this);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jm.m2627(jm.this);
        }
    };

    public jm(jo joVar) {
        this.f2738 = joVar;
        ji.m2594().m2597(this.f2736);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2626(jm jmVar, final Activity activity) {
        jmVar.f2737.postDelayed(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                jm.m2630(jm.this);
                if (jm.this.f2738 != null) {
                    jm.this.f2738.mo390(activity);
                }
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2627(jm jmVar) {
        jmVar.f2737.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2630(jm jmVar) {
        jmVar.f2735 = true;
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2629(jm jmVar, Activity activity) {
        if (jmVar.f2735) {
            jmVar.f2735 = false;
            jo joVar = jmVar.f2738;
            if (joVar != null) {
                joVar.mo391(activity);
            }
        }
        jmVar.f2737.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2631() {
        this.f2737.removeCallbacksAndMessages(null);
        if (this.f2736 != null) {
            ji.m2594().m2596(this.f2736);
            this.f2736 = null;
        }
    }
}
