package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {
    public final GlideUrl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f12377Y;
    public HttpURLConnection Z;
    public InputStream e0;
    public volatile boolean f0;

    public static class DefaultHttpUrlConnectionFactory implements HttpUrlConnectionFactory {
    }

    public interface HttpUrlConnectionFactory {
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i2) {
        this.X = glideUrl;
        this.f12377Y = i2;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() {
        InputStream inputStream = this.e0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.Z;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.Z = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.f0 = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final DataSource d() {
        return DataSource.f12350Y;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void e(Priority priority, DataFetcher.DataCallback dataCallback) {
        GlideUrl glideUrl = this.X;
        int i2 = LogTime.f12842b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            dataCallback.f(f(glideUrl.d(), 0, null, glideUrl.f12560b.b()));
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
            }
            dataCallback.c(e2);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.a(jElapsedRealtimeNanos));
            }
        }
    }

    public final InputStream f(URL url, int i2, URL url2, Map map) throws HttpException {
        if (i2 >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i3 = this.f12377Y;
            httpURLConnection.setConnectTimeout(i3);
            httpURLConnection.setReadTimeout(i3);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.Z = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.e0 = this.Z.getInputStream();
                if (this.f0) {
                    return null;
                }
                int iC = c(this.Z);
                int i4 = iC / 100;
                if (i4 == 2) {
                    HttpURLConnection httpURLConnection2 = this.Z;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.e0 = new ContentLengthInputStream(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.e0 = httpURLConnection2.getInputStream();
                        }
                        return this.e0;
                    } catch (IOException e2) {
                        throw new HttpException(c(httpURLConnection2), e2, "Failed to obtain InputStream");
                    }
                }
                if (i4 != 3) {
                    if (iC == -1) {
                        throw new HttpException(iC, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(iC, null, this.Z.getResponseMessage());
                    } catch (IOException e3) {
                        throw new HttpException(iC, e3, "Failed to get a response message");
                    }
                }
                String headerField = this.Z.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(iC, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i2 + 1, url, map);
                } catch (MalformedURLException e4) {
                    throw new HttpException(iC, e4, a.C("Bad redirect url: ", headerField));
                }
            } catch (IOException e5) {
                throw new HttpException(c(this.Z), e5, "Failed to connect or obtain data");
            }
        } catch (IOException e6) {
            throw new HttpException(0, e6, "URL.openConnection threw");
        }
    }
}
