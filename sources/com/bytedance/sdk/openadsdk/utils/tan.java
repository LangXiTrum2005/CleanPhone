package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class tan {
    public static void ri(Uri uri, com.bytedance.sdk.openadsdk.core.dzy dzyVar) {
        if (dzyVar == null || !dzyVar.ri(uri)) {
            return;
        }
        try {
            dzyVar.lr(uri);
        } catch (Exception e) {
            e.toString();
        }
    }

    public static String ri(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i;
    }
}
