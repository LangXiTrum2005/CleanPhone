package com.yoadx.ad.lib.core;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: FullScreenAdManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yoadx/ad/lib/core/marial;", "", "<init>", "()V", "", "attabal", "()Z", "adShown", "", "saneness", "(Z)V", "dern", "Z", "interstitialAdShown", "rewardAdShown", "wireman", "openAdShown", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f23882attabal = new marial();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static boolean rewardAdShown;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static boolean interstitialAdShown;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static boolean openAdShown;

    public final boolean attabal() {
        return interstitialAdShown || rewardAdShown || openAdShown;
    }

    public final void dern(boolean adShown) {
        openAdShown = adShown;
    }

    public final void saneness(boolean adShown) {
        interstitialAdShown = adShown;
    }
}
