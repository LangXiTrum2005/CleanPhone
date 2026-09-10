package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.ironsource.B5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        new WindVaneWebView(context).loadDataWithBaseURL(null, "<html><script>" + b.c().d() + "</script></html>", "text/html", B5.O, null);
    }
}
