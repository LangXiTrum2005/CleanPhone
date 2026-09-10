package com.facebook.internal.logging.dumpsys;

import android.webkit.WebView;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper;", "", "Companion", "WebViewData", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class WebViewDumpHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f16450a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16451b = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$Companion;", "", "", "GET_WEBVIEW_HTML_JS_SCRIPT", "Ljava/lang/String;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final String a(WebViewData webViewData, String str) {
            String strI = StringsKt.I(StringsKt.I(StringsKt.I(str, "\\u003C", "<"), "\\n", ""), "\\\"", "\"");
            Integer numValueOf = Integer.valueOf(webViewData.f16453b);
            Integer numValueOf2 = Integer.valueOf(webViewData.f16454c);
            Integer numValueOf3 = Integer.valueOf(webViewData.d);
            Integer numValueOf4 = Integer.valueOf(webViewData.f16455e);
            String strSubstring = strI.substring(1, strI.length() - 1);
            Intrinsics.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", Arrays.copyOf(new Object[]{webViewData.f16452a, numValueOf, numValueOf2, numValueOf3, numValueOf4, strSubstring}, 6));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class WebViewData {
        public static final int[] f = new int[2];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16454c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f16455e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData$Companion;", "", "", "location", "[I", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        public WebViewData(WebView webView) {
            Intrinsics.f(webView, "webView");
            this.f16452a = String.format("%s{%s}", Arrays.copyOf(new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())}, 2));
            int[] iArr = f;
            webView.getLocationOnScreen(iArr);
            this.f16453b = iArr[0];
            this.f16454c = iArr[1];
            this.d = webView.getWidth();
            this.f16455e = webView.getHeight();
        }
    }

    public final void a(PrintWriter printWriter) {
        LinkedHashMap linkedHashMap = this.f16451b;
        LinkedHashSet<WebViewData> linkedHashSet = this.f16450a;
        try {
            for (WebViewData webViewData : linkedHashSet) {
                String str = (String) linkedHashMap.get(webViewData.f16452a);
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(webViewData);
                    printWriter.println(":");
                    printWriter.println(Companion.a(webViewData, str));
                }
            }
        } catch (Exception unused) {
        }
        linkedHashSet.clear();
        linkedHashMap.clear();
    }
}
