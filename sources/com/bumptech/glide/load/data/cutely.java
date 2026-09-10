package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: HttpUrlFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class cutely implements wireman<InputStream> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final saneness f17599adultoid = new attabal();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f17600arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public volatile boolean f17601graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final glutethimide.impromptu f17602kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public InputStream f17603molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final saneness f17604monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public HttpURLConnection f17605polloi;

    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public static class attabal implements saneness {
        @Override // com.bumptech.glide.load.data.cutely.saneness
        public HttpURLConnection attabal(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public interface saneness {
        HttpURLConnection attabal(URL url) throws IOException;
    }

    public cutely(glutethimide.impromptu impromptuVar, int i) {
        this(impromptuVar, i, f17599adultoid);
    }

    public static int beachfront(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    public static boolean impromptu(int i) {
        return i / 100 == 2;
    }

    public static boolean taiyuan(int i) {
        return i / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.wireman
    public Class<InputStream> attabal() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void cancel() {
        this.f17601graveside = true;
    }

    public final InputStream competently(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f17603molybdenite = com.bumptech.glide.util.dern.saneness(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f17603molybdenite = httpURLConnection.getInputStream();
            }
            return this.f17603molybdenite;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", beachfront(httpURLConnection), e);
        }
    }

    public final InputStream cutely(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionDern = dern(url, map);
        this.f17605polloi = httpURLConnectionDern;
        try {
            httpURLConnectionDern.connect();
            this.f17603molybdenite = this.f17605polloi.getInputStream();
            if (this.f17601graveside) {
                return null;
            }
            int iBeachfront = beachfront(this.f17605polloi);
            if (impromptu(iBeachfront)) {
                return competently(this.f17605polloi);
            }
            if (!taiyuan(iBeachfront)) {
                if (iBeachfront == -1) {
                    throw new HttpException(iBeachfront);
                }
                try {
                    throw new HttpException(this.f17605polloi.getResponseMessage(), iBeachfront);
                } catch (IOException e) {
                    throw new HttpException("Failed to get a response message", iBeachfront, e);
                }
            }
            String headerField = this.f17605polloi.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iBeachfront);
            }
            try {
                URL url3 = new URL(url, headerField);
                saneness();
                return cutely(url3, i + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new HttpException("Bad redirect url: " + headerField, iBeachfront, e2);
            }
        } catch (IOException e3) {
            throw new HttpException("Failed to connect or obtain data", beachfront(this.f17605polloi), e3);
        }
    }

    public final HttpURLConnection dern(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionAttabal = this.f17604monoploid.attabal(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionAttabal.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionAttabal.setConnectTimeout(this.f17600arytenoidectomy);
            httpURLConnectionAttabal.setReadTimeout(this.f17600arytenoidectomy);
            httpURLConnectionAttabal.setUseCaches(false);
            httpURLConnectionAttabal.setDoInput(true);
            httpURLConnectionAttabal.setInstanceFollowRedirects(false);
            return httpURLConnectionAttabal;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void marial(Priority priority, wireman.attabal<? super InputStream> attabalVar) {
        long jSaneness = com.bumptech.glide.util.competently.saneness();
        try {
            attabalVar.beachfront(cutely(this.f17602kowloon.impromptu(), 0, null, this.f17602kowloon.marial()));
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            attabalVar.dern(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                com.bumptech.glide.util.competently.attabal(jSaneness);
            }
        }
    }

    @Override // com.bumptech.glide.load.data.wireman
    public void saneness() {
        InputStream inputStream = this.f17603molybdenite;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f17605polloi;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f17605polloi = null;
    }

    @Override // com.bumptech.glide.load.data.wireman
    public DataSource wireman() {
        return DataSource.REMOTE;
    }

    public cutely(glutethimide.impromptu impromptuVar, int i, saneness sanenessVar) {
        this.f17602kowloon = impromptuVar;
        this.f17600arytenoidectomy = i;
        this.f17604monoploid = sanenessVar;
    }
}
