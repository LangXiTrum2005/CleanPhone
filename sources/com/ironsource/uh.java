package com.ironsource;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestSuiteActivity f30830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LevelPlayBannerAdView f30831c;

    public /* synthetic */ uh(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView, int i10) {
        this.f30829a = i10;
        this.f30830b = testSuiteActivity;
        this.f30831c = levelPlayBannerAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30829a) {
            case 0:
                Lf.a(this.f30830b, this.f30831c);
                break;
            default:
                Lf.b(this.f30830b, this.f30831c);
                break;
        }
    }
}
