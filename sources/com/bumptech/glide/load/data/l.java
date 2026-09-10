package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6.h f10533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f10535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f10536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f10537e;

    public l(k6.h hVar, int i10) {
        this.f10533a = hVar;
        this.f10534b = i10;
    }

    public static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.f10536d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10535c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10535c = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f10537e = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.f fVar, d dVar) {
        k6.h hVar = this.f10533a;
        int i10 = a7.j.f3432b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            dVar.z0(f(hVar.d(), 0, null, hVar.f44349b.a()));
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            dVar.h(e10);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + a7.j.a(jElapsedRealtimeNanos));
            }
        }
    }

    public final InputStream f(URL url, int i10, URL url2, Map map) throws e6.c {
        if (i10 >= 5) {
            throw new e6.c(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new e6.c(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i11 = this.f10534b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i11);
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f10535c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f10536d = this.f10535c.getInputStream();
                if (this.f10537e) {
                    return null;
                }
                int iE = e(this.f10535c);
                int i12 = iE / 100;
                if (i12 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f10535c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f10536d = new a7.e(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f10536d = httpURLConnection2.getInputStream();
                        }
                        return this.f10536d;
                    } catch (IOException e10) {
                        throw new e6.c(e(httpURLConnection2), e10, "Failed to obtain InputStream");
                    }
                }
                if (i12 != 3) {
                    if (iE == -1) {
                        throw new e6.c(iE, null, "Http request failed");
                    }
                    try {
                        throw new e6.c(iE, null, this.f10535c.getResponseMessage());
                    } catch (IOException e11) {
                        throw new e6.c(iE, e11, "Failed to get a response message");
                    }
                }
                String headerField = this.f10535c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new e6.c(iE, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i10 + 1, url, map);
                } catch (MalformedURLException e12) {
                    throw new e6.c(iE, e12, defpackage.e.n("Bad redirect url: ", headerField));
                }
            } catch (IOException e13) {
                throw new e6.c(e(this.f10535c), e13, "Failed to connect or obtain data");
            }
        } catch (IOException e14) {
            throw new e6.c(0, e14, "URL.openConnection threw");
        }
    }
}
