package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* JADX INFO: loaded from: classes6.dex */
public final class mj extends fb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tj f41257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.startapp.sdk.ads.video.a f41258i;
    public final sj j;

    public mj(OverlayActivity overlayActivity, oa oaVar, oa oaVar2, tj tjVar, com.startapp.sdk.ads.video.a aVar, sj sjVar, TrackingParams trackingParams, boolean z2) {
        super(overlayActivity, oaVar, trackingParams);
        this.d = oaVar2;
        this.f41257h = tjVar;
        this.f41258i = aVar;
        this.j = sjVar;
        this.f40964b = z2;
    }

    @JavascriptInterface
    public void replayVideo() {
        new Handler(Looper.getMainLooper()).post(this.f41257h);
    }

    @JavascriptInterface
    public void skipVideo() {
        new Handler(Looper.getMainLooper()).post(this.f41258i);
    }

    @JavascriptInterface
    public void toggleSound() {
        new Handler(Looper.getMainLooper()).post(this.j);
    }
}
