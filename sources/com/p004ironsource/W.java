package com.p004ironsource;

import com.p004ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class W implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ TestSuiteActivity f24223Y;
    public final /* synthetic */ LevelPlayBannerAdView Z;

    public /* synthetic */ W(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView, int i2) {
        this.X = i2;
        this.f24223Y = testSuiteActivity;
        this.Z = levelPlayBannerAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                mv.b(this.f24223Y, this.Z);
                break;
            default:
                mv.a(this.f24223Y, this.Z);
                break;
        }
    }
}
