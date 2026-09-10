package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.P2;
import com.ironsource.Q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class BannerAdView extends FrameLayout implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private P2 f38451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BannerAdViewListener f38452b;

    private BannerAdView(Context context) {
        super(context);
    }

    public final BannerAdInfo getAdInfo() {
        P2 p10 = this.f38451a;
        if (p10 != null) {
            return p10.c();
        }
        n.l("bannerAdViewInternal");
        throw null;
    }

    public final BannerAdViewListener getListener() {
        return this.f38452b;
    }

    @Override // com.ironsource.Q2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f38452b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.Q2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f38452b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.f38452b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(P2 bannerAdViewInternal) {
        n.f(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.d().getContext();
        n.e(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f38451a = bannerAdViewInternal;
        bannerAdViewInternal.a(new WeakReference<>(this));
        bannerAdViewInternal.b(new WeakReference<>(this));
    }
}
