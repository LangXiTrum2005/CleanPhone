package com.adjust.sdk;

import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f6895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustLinkResolution.AdjustLinkResolutionCallback f6896b;

    public o0(URL url, AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        this.f6895a = url;
        this.f6896b = adjustLinkResolutionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustLinkResolution.requestAndResolve(this.f6895a, 0, this.f6896b);
    }
}
