package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1379cd extends AbstractC04805q<C1375cZ> {
    public int A01;
    public final int A02;
    public final MG A05;
    public final C1828k1 A06;
    public final ViewOnClickListenerC1617gW A07;
    public final List<String> A09;
    public int A00 = 0;
    public final Application.ActivityLifecycleCallbacks A03 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (activity != this.A00.A06.A0E()) {
                return;
            }
            this.A00.A04.removeCallbacks(this.A00.A08);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            this.A00.A04.post(this.A00.A08);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A08 = new I4(this);

    public C1379cd(C1828k1 c1828k1, List<String> screenshotUrls, int i, MG mg, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, int i2) {
        this.A09 = screenshotUrls;
        this.A02 = i;
        this.A06 = c1828k1;
        this.A05 = mg;
        this.A07 = viewOnClickListenerC1617gW;
        this.A01 = i2;
        this.A04.post(this.A08);
        if (Build.VERSION.SDK_INT >= 29) {
            ((Activity) Objects.requireNonNull(this.A06.A0E())).registerActivityLifecycleCallbacks(this.A03);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A06, reason: merged with bridge method [inline-methods] */
    public final C1375cZ A0D(ViewGroup viewGroup, int i) {
        C1371cV c1371cV = new C1371cV(this.A06);
        if (C05789m.A1B(this.A06)) {
            c1371cV.setOnClickListener(new I5(this));
        }
        return new C1375cZ(c1371cV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1375cZ c1375cZ, int i) {
        String str = this.A09.get(i % this.A09.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i2 = this.A02;
        int actualPosition = this.A02;
        marginLayoutParams.setMargins(i2, 0, actualPosition, 0);
        c1375cZ.A0j().setLayoutParams(marginLayoutParams);
        c1375cZ.A0j().setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    public final int A0C() {
        return this.A09.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    public final void A0F(MG mg) {
        super.A0F(mg);
        this.A04.removeCallbacks(this.A08);
        if (Build.VERSION.SDK_INT >= 29) {
            ((Activity) Objects.requireNonNull(this.A06.A0E())).unregisterActivityLifecycleCallbacks(this.A03);
        }
    }

    public final void A0G(int i) {
        this.A01 = i;
    }
}
