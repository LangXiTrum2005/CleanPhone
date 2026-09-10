package com.google.ads.mediation.inmobi;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiAdViewHolder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final FrameLayout f18876attabal;

    public InMobiAdViewHolder(FrameLayout frameLayout) {
        this.f18876attabal = frameLayout;
    }

    public void addView(InMobiBannerWrapper inMobiBannerWrapper) {
        this.f18876attabal.addView(inMobiBannerWrapper.getInMobiBanner());
    }

    public FrameLayout getFrameLayout() {
        return this.f18876attabal;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f18876attabal.setLayoutParams(layoutParams);
    }
}
