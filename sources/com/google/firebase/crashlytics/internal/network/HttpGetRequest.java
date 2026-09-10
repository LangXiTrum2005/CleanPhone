package com.google.firebase.crashlytics.internal.network;

import android.support.v4.media.a;
import com.applovin.shadow.okio.Segment;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class HttpGetRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20718c = new HashMap();

    public HttpGetRequest(String str, HashMap map) {
        this.f20716a = str;
        this.f20717b = map;
    }

    public static String a(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append(d9.i.f24747b);
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append(d9.i.f24749c);
            sb.append((String) entry2.getKey());
            sb.append(d9.i.f24747b);
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return a.D(str, "?", string);
        }
        if (!str.endsWith(d9.i.f24749c)) {
            string = d9.i.f24749c.concat(string);
        }
        return a.m(str, string);
    }

    public final HttpResponse b() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.f20716a, this.f20717b);
            Logger.f20289a.e("GET Request URL: " + strA);
            httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(ko.f25534a);
                for (Map.Entry entry : this.f20718c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[Segment.SIZE];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i2 = bufferedReader.read(cArr);
                            if (i2 == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i2);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, string);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final void c(String str, String str2) {
        this.f20718c.put(str, str2);
    }
}
