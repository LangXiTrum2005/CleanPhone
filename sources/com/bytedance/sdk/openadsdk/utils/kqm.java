package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class kqm {
    public static void Lxb(Uri uri, com.bytedance.sdk.openadsdk.core.Ivz ivz) {
        if (ivz == null || !ivz.Lxb(uri)) {
            return;
        }
        try {
            ivz.LD(uri);
        } catch (Exception e) {
            e.toString();
        }
    }

    public static String Lxb(WebView webView, int i) {
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
