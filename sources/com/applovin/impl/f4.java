package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f4 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f7903c = new AtomicReference();

    public f4(com.applovin.impl.sdk.l lVar) {
        this.f7901a = lVar;
        this.f7902b = lVar.Q();
    }

    private OkHttpClient a() {
        Object objBuild = this.f7903c.get();
        if (objBuild == null) {
            synchronized (this.f7903c) {
                try {
                    objBuild = this.f7903c.get();
                    if (objBuild == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long jIntValue = ((Integer) this.f7901a.a(z4.Y2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f7901a.a(z4.Z2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (objBuild == null) {
                            objBuild = this.f7903c;
                        }
                        this.f7903c.set(objBuild);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (objBuild == this.f7903c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    @Override // com.applovin.impl.i2
    public InputStream a(String str, Map map) throws IOException {
        Response responseExecute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f7901a.E().a("loadResource", str, iCode, responseExecute.message());
        if (s0.a(iCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Opened stream to resource ", str, this.f7902b, "OkHttpLoader");
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f7901a.g().d(f2.R, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
