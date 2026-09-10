package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorEventListener;
import android.webkit.WebView;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10008c;

    public /* synthetic */ x8(int i10, Object obj, Object obj2) {
        this.f10006a = i10;
        this.f10007b = obj;
        this.f10008c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10006a) {
            case 0:
                d4.b.a((d4.c) this.f10007b, (d4.d) this.f10008c);
                break;
            case 1:
                ((ScheduledThreadPoolExecutor) this.f10007b).execute((f6.e) this.f10008c);
                break;
            case 2:
                ((k2.b) this.f10007b).a((AppLovinAd) this.f10008c);
                break;
            case 3:
                ((h0) this.f10007b).a((SensorEventListener) this.f10008c);
                break;
            case 4:
                ((h4) this.f10007b).b((WebView) this.f10008c);
                break;
            case 5:
                ((h4) this.f10007b).a((String) this.f10008c);
                break;
            case 6:
                ((h6) this.f10007b).b((MaxErrorImpl) this.f10008c);
                break;
            case 7:
                ((i6) this.f10007b).b((MaxErrorImpl) this.f10008c);
                break;
            case 8:
                ((i8) this.f10007b).a((WeakReference) this.f10008c);
                break;
            case 9:
                ((m5) this.f10007b).a((m3) this.f10008c);
                break;
            case 10:
                ((n5) this.f10007b).a((AppLovinAdLoadListener) this.f10008c);
                break;
            case 11:
                ((n8) this.f10007b).c((String) this.f10008c);
                break;
            case 12:
                ((n8) this.f10007b).b((WebView) this.f10008c);
                break;
            case 13:
                ((o3) this.f10007b).a((Context) this.f10008c);
                break;
            case 14:
                ((p2) this.f10007b).a((AppLovinAd) this.f10008c);
                break;
            case 15:
                ((p2) this.f10007b).b((com.applovin.impl.sdk.ad.b) this.f10008c);
                break;
            case 16:
                ((p2) this.f10007b).a((Context) this.f10008c);
                break;
            case 17:
                q7.a((Context) this.f10007b, (String) this.f10008c);
                break;
            case 18:
                ((u4) this.f10007b).a((u4.b) this.f10008c);
                break;
            case 19:
                ((v0) this.f10007b).a((Activity) this.f10008c);
                break;
            case 20:
                v2.b((AppLovinAdClickListener) this.f10007b, (AppLovinAd) this.f10008c);
                break;
            case 21:
                v2.b((AppLovinAdVideoPlaybackListener) this.f10007b, (AppLovinAd) this.f10008c);
                break;
            case 22:
                v2.b((n2) this.f10007b, (String) this.f10008c);
                break;
            case 23:
                v2.a((AppLovinNativeAdLoadListener) this.f10007b, (AppLovinError) this.f10008c);
                break;
            case 24:
                v2.a((AppLovinNativeAdEventListener) this.f10007b, (AppLovinNativeAd) this.f10008c);
                break;
            default:
                v2.b((AppLovinPostbackListener) this.f10007b, (String) this.f10008c);
                break;
        }
    }
}
