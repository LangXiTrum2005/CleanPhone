package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f41191a;

    public kk(View view, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f41191a = handler;
        handler.postDelayed(new jk(this, new WeakReference(view), point, bannerOptions, eVar), 100L);
    }
}
