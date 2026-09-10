package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f29307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f29308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f29309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f29310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LevelPlayMediaView f29311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f29312f;

    public final View getAdvertiserView() {
        return this.f29308b;
    }

    public final View getBodyView() {
        return this.f29310d;
    }

    public final View getCallToActionView() {
        return this.f29312f;
    }

    public final View getIconView() {
        return this.f29309c;
    }

    public final LevelPlayMediaView getMediaView() {
        return this.f29311e;
    }

    public final View getTitleView() {
        return this.f29307a;
    }

    public final void setAdvertiserView(View view) {
        this.f29308b = view;
    }

    public final void setBodyView(View view) {
        this.f29310d = view;
    }

    public final void setCallToActionView(View view) {
        this.f29312f = view;
    }

    public final void setIconView(View view) {
        this.f29309c = view;
    }

    public final void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f29311e = levelPlayMediaView;
    }

    public final void setTitleView(View view) {
        this.f29307a = view;
    }
}
