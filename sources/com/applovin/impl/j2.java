package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8213b;

    public j2(com.applovin.impl.sdk.l lVar) {
        this.f8212a = lVar;
        this.f8213b = lVar.Q();
    }

    @Override // com.applovin.impl.i2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f8212a.a(z4.Y2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f8212a.a(z4.Z2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int responseCode = httpURLConnection.getResponseCode();
        this.f8212a.E().a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (s0.a(responseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Opened stream to resource ", str, this.f8213b, "HttpUrlConnectionLoader");
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f8212a.g().d(f2.R, mapHashMap);
        return inputStream;
    }
}
