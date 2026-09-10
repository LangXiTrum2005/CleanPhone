package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class exc {
    public static void qdl(Uri uri, com.bytedance.sdk.openadsdk.core.hkc hkcVar) {
        if (hkcVar == null || !hkcVar.qdl(uri)) {
            return;
        }
        try {
            hkcVar.ud(uri);
        } catch (Exception e2) {
            e2.toString();
        }
    }

    public static String qdl(WebView webView, int i2) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i2;
    }
}
