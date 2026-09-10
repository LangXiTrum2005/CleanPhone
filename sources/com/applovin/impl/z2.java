package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f10091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f10092c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10093d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10094e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f10095f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public z2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f10090a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f10095f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f10091b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, i.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f10091b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f10094e) {
            maxAd = null;
            while (!this.f10092c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f10092c.remove();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f10095f = null;
        a();
        this.f10091b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f10094e) {
            z10 = !this.f10092c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f10094e) {
            try {
                if (!this.f10093d && this.f10092c.size() < this.f10090a) {
                    this.f10093d = true;
                    this.f10091b.loadAd();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f10095f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f10095f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f10095f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f10094e) {
            this.f10092c.add(maxAd);
            this.f10093d = false;
            e();
        }
        a aVar = this.f10095f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f10094e) {
            try {
                Iterator it = this.f10092c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f10092c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f10091b.render(maxNativeAdView, maxAd);
    }
}
