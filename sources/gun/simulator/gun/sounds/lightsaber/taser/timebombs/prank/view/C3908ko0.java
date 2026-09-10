package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ko0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3908ko0 implements HB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NativeAdView f4617a;
    public CB b;
    public NativeAd c;
    public ViewGroup d;
    public boolean e = false;

    public C3908ko0(Context context) {
        this.f4617a = new NativeAdView(context);
        this.f4617a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
