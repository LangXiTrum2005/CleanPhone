package com.startapp.sdk.ads.banner.bannerstandard;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f40459a;

    public c(BannerStandard bannerStandard) {
        this.f40459a = bannerStandard;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f40459a.webViewTouched = true;
        return false;
    }
}
