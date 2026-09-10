package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class vc {
    public HttpsURLConnection a(v2 request) throws IOException {
        Intrinsics.f(request, "request");
        URLConnection uRLConnectionOpenConnection = new URL(request.e()).openConnection();
        HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
        if (httpsURLConnection != null) {
            return httpsURLConnection;
        }
        throw new IOException("Invalid URL");
    }
}
