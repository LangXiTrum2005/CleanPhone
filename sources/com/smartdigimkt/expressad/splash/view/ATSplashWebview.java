package com.smartdigimkt.expressad.splash.view;

import android.content.Context;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes5.dex */
public class ATSplashWebview extends WindVaneWebView {
    private static final String x0 = "ATSplashWebview";
    private String w0;

    public ATSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
    }

    public String getRequestId() {
        return this.w0;
    }

    public void setRequestId(String str) {
        this.w0 = str;
    }
}
