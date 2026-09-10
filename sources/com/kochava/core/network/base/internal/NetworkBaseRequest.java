package com.kochava.core.network.base.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.net.Uri;
import com.inmobi.commons.core.configs.CrashConfig;
import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.util.internal.DeviceUtil;
import com.kochava.core.util.internal.TextUtil;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NetworkBaseRequest implements NetworkBaseRequestApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f28041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonElement f28042c;
    public HashMap d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f28043e = null;

    public NetworkBaseRequest(Context context, Uri uri, JsonElement jsonElement) {
        this.f28040a = context;
        this.f28041b = uri;
        this.f28042c = jsonElement;
    }

    public static HttpURLConnection a(JsonObject jsonObject, Uri uri, HashMap map, int i2) throws ProtocolException {
        String property;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(i2 >= 0);
        if (i2 >= 0) {
            httpURLConnection.setFixedLengthStreamingMode(i2);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestMethod(ko.f25535b);
            jsonObject.g("method", ko.f25535b);
        } else {
            httpURLConnection.setRequestMethod(ko.f25534a);
            jsonObject.g("method", ko.f25534a);
        }
        JsonObject jsonObjectW = JsonObject.w();
        jsonObject.r("request_headers", jsonObjectW);
        if ((map == null || !map.containsKey(Command.HTTP_HEADER_USER_AGENT)) && (property = System.getProperty("http.agent")) != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, property);
            jsonObjectW.g(Command.HTTP_HEADER_USER_AGENT, property);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                jsonObjectW.g((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return httpURLConnection;
    }

    public static void b(Context context) throws IOException {
        boolean z2;
        int i2 = 0;
        do {
            z2 = true;
            i2++;
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                try {
                    NetworkInfo activeNetworkInfo = DeviceUtil.a(context).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z2 = false;
                    }
                } catch (Throwable unused) {
                }
            }
            if (!z2) {
                if (i2 > 4) {
                    throw new IOException("No network access");
                }
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException unused2) {
                }
            }
        } while (!z2);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.io.OutputStream r2, byte[] r3) {
        /*
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r2)
            r0.write(r3)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r0.close()     // Catch: java.io.IOException -> Le
            r2.close()     // Catch: java.io.IOException -> Le
        Le:
            return
        Lf:
            r3 = move-exception
            goto L19
        L11:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Failed to write output stream"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> Lf
        L19:
            r0.close()     // Catch: java.io.IOException -> L1f
            r2.close()     // Catch: java.io.IOException -> L1f
        L1f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kochava.core.network.base.internal.NetworkBaseRequest.c(java.io.OutputStream, byte[]):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.kochava.core.json.internal.JsonElement d(java.io.InputStream r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = com.kochava.core.util.internal.TextUtil.a()
            r1.<init>(r4, r2)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r1)
        L13:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L56
            if (r3 == 0) goto L1f
            r0.append(r3)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L56
            goto L13
        L1d:
            r0 = move-exception
            goto L5e
        L1f:
            r2.close()     // Catch: java.io.IOException -> L28
            r1.close()     // Catch: java.io.IOException -> L28
            r4.close()     // Catch: java.io.IOException -> L28
        L28:
            java.lang.String r4 = r0.toString()
            java.lang.Object r0 = com.kochava.core.json.internal.JsonElement.f28017b
            r0 = 0
            com.kochava.core.json.internal.JsonObject r0 = com.kochava.core.json.internal.JsonObject.x(r4, r0)
            if (r0 == 0) goto L3b
            com.kochava.core.json.internal.JsonElement r4 = new com.kochava.core.json.internal.JsonElement
            r4.<init>(r0)
            goto L55
        L3b:
            com.kochava.core.json.internal.JsonArray r0 = new com.kochava.core.json.internal.JsonArray     // Catch: java.lang.Exception -> L46
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L46
            r1.<init>(r4)     // Catch: java.lang.Exception -> L46
            r0.<init>(r1)     // Catch: java.lang.Exception -> L46
            goto L47
        L46:
            r0 = 0
        L47:
            if (r0 == 0) goto L4f
            com.kochava.core.json.internal.JsonElement r4 = new com.kochava.core.json.internal.JsonElement
            r4.<init>(r0)
            goto L55
        L4f:
            com.kochava.core.json.internal.JsonElement r0 = new com.kochava.core.json.internal.JsonElement
            r0.<init>(r4)
            r4 = r0
        L55:
            return r4
        L56:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "Failed to read string from input stream"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L5e:
            r2.close()     // Catch: java.io.IOException -> L67
            r1.close()     // Catch: java.io.IOException -> L67
            r4.close()     // Catch: java.io.IOException -> L67
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kochava.core.network.base.internal.NetworkBaseRequest.d(java.io.InputStream):com.kochava.core.json.internal.JsonElement");
    }

    public static Bitmap f(JsonObject jsonObject, Context context, Uri uri, HashMap map, JsonElement jsonElement) throws IOException {
        byte[] bytes;
        if (jsonElement != null) {
            jsonObject.e("request", jsonElement);
        }
        b(context);
        HttpURLConnection httpURLConnectionA = null;
        if (jsonElement == null) {
            bytes = null;
        } else {
            try {
                bytes = jsonElement.toString().getBytes(TextUtil.a());
            } catch (Throwable th) {
                try {
                    throw new IOException(th.getMessage());
                } catch (Throwable th2) {
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                    throw th2;
                }
            }
        }
        httpURLConnectionA = a(jsonObject, uri, map, bytes != null ? bytes.length : -1);
        httpURLConnectionA.connect();
        if (bytes != null) {
            c(httpURLConnectionA.getOutputStream(), bytes);
        }
        InputStream inputStream = httpURLConnectionA.getInputStream();
        try {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream == null) {
                    throw new IOException();
                }
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                httpURLConnectionA.disconnect();
                return bitmapDecodeStream;
            } catch (IOException unused2) {
                throw new IOException("Failed to read bitmap from input stream.");
            }
        } catch (Throwable th3) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            throw th3;
        }
    }

    public static JsonElement g(JsonObject jsonObject, Context context, Uri uri, HashMap map, JsonElement jsonElement) throws IOException {
        byte[] bytes;
        if (jsonElement != null) {
            jsonObject.e("request", jsonElement);
        }
        b(context);
        HttpURLConnection httpURLConnectionA = null;
        if (jsonElement == null) {
            bytes = null;
        } else {
            try {
                bytes = jsonElement.toString().getBytes(TextUtil.a());
            } catch (Throwable th) {
                try {
                    throw new IOException(th);
                } catch (Throwable th2) {
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                    throw th2;
                }
            }
        }
        httpURLConnectionA = a(jsonObject, uri, map, bytes != null ? bytes.length : -1);
        httpURLConnectionA.connect();
        if (bytes != null) {
            c(httpURLConnectionA.getOutputStream(), bytes);
        }
        JsonElement jsonElementD = d(httpURLConnectionA.getInputStream());
        httpURLConnectionA.disconnect();
        return jsonElementD;
    }

    public final synchronized long e(int i2) {
        long j;
        long[] jArr = this.f28043e;
        if (jArr != null && jArr.length != 0) {
            return this.f28043e[Math.min(jArr.length - 1, Math.max(0, i2 - 1))];
        }
        int iMax = Math.max(1, i2);
        if (iMax == 1) {
            j = 7000;
        } else if (iMax != 2) {
            j = iMax != 3 ? 1800000L : 300000L;
        } else {
            j = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        return j;
    }
}
