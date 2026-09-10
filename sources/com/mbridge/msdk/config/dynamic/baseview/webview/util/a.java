package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        Object[] array = uri.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + uri.getQueryParameter(String.valueOf(array[0]));
        }
        if (TextUtils.isEmpty(scheme) || !scheme.equals("mv")) {
            return str;
        }
        String queryParameter = uri.getQueryParameter(String.valueOf(array[0]));
        String queryParameter2 = array.length > 1 ? uri.getQueryParameter(String.valueOf(array[1])) : "";
        StringBuilder sb2 = new StringBuilder("javascript:window.WindVane.");
        sb2.append(uri.getHost());
        sb2.append("(");
        sb2.append(queryParameter);
        sb2.append(",");
        return e.q(queryParameter2, ");", sb2);
    }
}
