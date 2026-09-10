package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class Wn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3940a;
    public final /* synthetic */ UQ b;
    public final /* synthetic */ NativeAd.OnNativeAdLoadedListener c;
    public final /* synthetic */ AdListener d;
    public final /* synthetic */ C3293do0 e;

    public Wn0(C3293do0 c3293do0, WeakReference weakReference, UQ uq, Vn0 vn0, Un0 un0) {
        this.e = c3293do0;
        this.f3940a = weakReference;
        this.b = uq;
        this.c = vn0;
        this.d = un0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.f3940a.get();
        UQ uq = this.b;
        this.e.F0(context, ((C3491g4) uq.f3354a).w(1), uq.h, (String) uq.b, uq.i, this.c, this.d);
    }
}
