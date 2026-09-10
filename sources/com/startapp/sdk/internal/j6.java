package com.startapp.sdk.internal;

import android.text.TextUtils;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static CookieManager f41135a;

    public static void a(HttpURLConnection httpURLConnection, String str) {
        Map<String, List<String>> map;
        List<String> list;
        CookieManager cookieManager = f41135a;
        if (cookieManager == null || (map = cookieManager.get(URI.create(str), httpURLConnection.getRequestProperties())) == null || map.size() <= 0 || (list = map.get("Cookie")) == null || list.size() <= 0) {
            return;
        }
        httpURLConnection.addRequestProperty("Cookie", TextUtils.join(com.ironsource.d9.i.f24747b, list));
    }
}
