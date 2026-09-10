package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xf {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        Intrinsics.f(view, "view");
        Intrinsics.f(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("source", source), new Pair("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        Pd pd = Pd.f23077a;
        Pd.b("WebViewRenderProcessGoneEvent", linkedHashMapL, Td.SDK);
        view.destroy();
        return true;
    }
}
