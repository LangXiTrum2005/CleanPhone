package com.smartdigimkt.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.p1.a;

/* JADX INFO: loaded from: classes5.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        try {
            new WindVaneWebView(context).loadDataWithBaseURL(null, "<html><script>" + a.b().c() + "</script></html>", "text/html", "utf-8", null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
