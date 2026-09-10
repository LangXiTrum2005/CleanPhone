package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oo {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapKowloon = seminary.kowloon(formularize.attabal("source", source), formularize.attabal("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        Wj wj = Wj.a;
        Wj.b("WebViewRenderProcessGoneEvent", mapKowloon, EnumC2779ak.SDK);
        view.destroy();
        return true;
    }
}
