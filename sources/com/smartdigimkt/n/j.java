package com.smartdigimkt.n;

import android.content.Context;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f36897c;
    protected Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f36898e;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f36897c = context;
        this.f36898e = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.d = obj;
        this.f36898e = windVaneWebView;
    }
}
