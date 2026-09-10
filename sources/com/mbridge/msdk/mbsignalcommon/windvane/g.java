package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f34934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f34935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WindVaneWebView f34936c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f34934a = context;
        this.f34936c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f34935b = obj;
        this.f34936c = windVaneWebView;
    }
}
