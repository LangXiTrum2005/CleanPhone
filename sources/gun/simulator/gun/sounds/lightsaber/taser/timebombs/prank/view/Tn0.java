package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes4.dex */
public final class Tn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3958lR f3794a;
    public final /* synthetic */ NativeAd.OnNativeAdLoadedListener b;
    public final /* synthetic */ AdListener c;
    public final /* synthetic */ C3293do0 d;

    public Tn0(C3293do0 c3293do0, C3958lR c3958lR, Sn0 sn0, Qn0 qn0) {
        this.d = c3293do0;
        this.f3794a = c3958lR;
        this.b = sn0;
        this.c = qn0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context contextJ = X0.j.j();
        C3958lR c3958lR = this.f3794a;
        this.d.F0(contextJ, c3958lR.c.w(1), c3958lR.e, (String) c3958lR.b, 1, this.b, this.c);
    }
}
