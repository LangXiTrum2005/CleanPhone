package com.inmobi.media;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22863a = 0;

    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX WARN: Code duplicated, block: B:91:0x019e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.HttpURLConnection] */
    public static C3324yc a(C3260uc request, Function2 function2) {
        HttpURLConnection httpURLConnectionA;
        C3324yc c3324yc;
        C3324yc c3324yc2;
        EnumC3157o4 enumC3157o4A;
        C3324yc response;
        int i2;
        C3244tc c3244tc;
        Intrinsics.f(request, "request");
        String msg = "REQUEST START, Attempt:" + (request.m + 1) + ", Time:" + System.currentTimeMillis();
        Intrinsics.f(msg, "msg");
        request.toString();
        boolean z2 = false;
        EnumC3157o4 enumC3157o4A2 = T9.a(false);
        ?? r3 = 0;
        try {
            if (enumC3157o4A2 != null) {
                response = new C3324yc();
                response.f24133a = new I9(enumC3157o4A2, "Network not reachable currently. Please try again.");
            } else {
                try {
                    httpURLConnectionA = a(request, J9.a(request.f24031a, request.d));
                    try {
                        httpURLConnectionA.setInstanceFollowRedirects(request.g);
                        if (request.f24032b == EnumC3212rc.POST) {
                            a(request.f24034e, httpURLConnectionA, J9.a(request));
                        }
                        c3324yc2 = a(request, httpURLConnectionA);
                        T9.a(httpURLConnectionA);
                    } catch (MalformedURLException e2) {
                        e = e2;
                        c3324yc = new C3324yc();
                        c3324yc.f24133a = new I9(EnumC3157o4.f23861u, e.getLocalizedMessage());
                        T9.a(httpURLConnectionA);
                        c3324yc2 = c3324yc;
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                        c3324yc = new C3324yc();
                        c3324yc.f24133a = new I9(EnumC3157o4.f23851A, e.getLocalizedMessage());
                        T9.a(httpURLConnectionA);
                        c3324yc2 = c3324yc;
                    } catch (IOException e4) {
                        e = e4;
                        c3324yc2 = new C3324yc();
                        c3324yc2.f24133a = new I9(EnumC3157o4.f, e.getLocalizedMessage());
                        T9.a(httpURLConnectionA);
                        z2 = true;
                    } catch (Exception e5) {
                        e = e5;
                        c3324yc = new C3324yc();
                        c3324yc.f24133a = new I9(EnumC3157o4.f23855e, e.getLocalizedMessage());
                        T9.a(httpURLConnectionA);
                        c3324yc2 = c3324yc;
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        c3324yc = new C3324yc();
                        c3324yc.f24133a = new I9(EnumC3157o4.g, e.getLocalizedMessage());
                        T9.a(httpURLConnectionA);
                        c3324yc2 = c3324yc;
                    } catch (Error e7) {
                        e = e7;
                        c3324yc = new C3324yc();
                        c3324yc.f24133a = new I9(EnumC3157o4.f23855e, e.getLocalizedMessage());
                        T9.a(httpURLConnectionA);
                        c3324yc2 = c3324yc;
                    }
                } catch (IOException e8) {
                    e = e8;
                    httpURLConnectionA = null;
                } catch (OutOfMemoryError e9) {
                    e = e9;
                    httpURLConnectionA = null;
                } catch (Error e10) {
                    e = e10;
                    httpURLConnectionA = null;
                } catch (MalformedURLException e11) {
                    e = e11;
                    httpURLConnectionA = null;
                } catch (SocketTimeoutException e12) {
                    e = e12;
                    httpURLConnectionA = null;
                } catch (Exception e13) {
                    e = e13;
                    httpURLConnectionA = null;
                } catch (Throwable th) {
                    th = th;
                    T9.a((HttpURLConnection) r3);
                    throw th;
                }
                if (z2) {
                    try {
                        if (T9.f23231a && (enumC3157o4A = T9.a(true)) != null) {
                            c3324yc2.f24133a = new I9(enumC3157o4A, "Network request failed because of internet. Please try again");
                        }
                    } catch (Exception unused) {
                    }
                }
                response = c3324yc2;
            }
            Intrinsics.f(response, "response");
            request.toString();
            response.toString();
            Integer num = response.d;
            if (num == null || num.intValue() != 200) {
                Integer num2 = response.d;
                if ((num2 != null && num2.intValue() == 401) || (num2 != null && num2.intValue() == 403)) {
                    i2 = request.m;
                    c3244tc = request.f24035h;
                    if (c3244tc != null && i2 < c3244tc.f24011a) {
                        if (function2 != null) {
                            function2.invoke(request, Long.valueOf((long) (Math.pow(1.0d, i2) * ((double) c3244tc.f24012b))));
                        }
                        request.m++;
                        response.f24133a = new I9(EnumC3157o4.m, "Retry Attempted");
                    }
                } else {
                    IntRange intRange = new IntRange(500, CommonGatewayClient.CODE_599, 1);
                    if (num2 == null || !intRange.a(num2.intValue())) {
                        I9 i9 = response.f24133a;
                        if ((i9 != null ? i9.f22886a : null) == EnumC3157o4.f23851A) {
                            i2 = request.m;
                            c3244tc = request.f24035h;
                            if (c3244tc != null) {
                                if (function2 != null) {
                                    function2.invoke(request, Long.valueOf((long) (Math.pow(1.0d, i2) * ((double) c3244tc.f24012b))));
                                }
                                request.m++;
                                response.f24133a = new I9(EnumC3157o4.m, "Retry Attempted");
                            }
                        } else {
                            List listI = CollectionsKt.I(EnumC3157o4.f, EnumC3157o4.y, EnumC3157o4.f23863z, EnumC3157o4.f23862w);
                            I9 i10 = response.f24133a;
                            if (CollectionsKt.o(listI, i10 != null ? i10.f22886a : null)) {
                                i2 = request.m;
                                c3244tc = request.f24035h;
                                if (c3244tc != null) {
                                    if (function2 != null) {
                                        function2.invoke(request, Long.valueOf((long) (Math.pow(1.0d, i2) * ((double) c3244tc.f24012b))));
                                    }
                                    request.m++;
                                    response.f24133a = new I9(EnumC3157o4.m, "Retry Attempted");
                                }
                            }
                        }
                    } else {
                        i2 = request.m;
                        c3244tc = request.f24035h;
                        if (c3244tc != null) {
                            if (function2 != null) {
                                function2.invoke(request, Long.valueOf((long) (Math.pow(1.0d, i2) * ((double) c3244tc.f24012b))));
                            }
                            request.m++;
                            response.f24133a = new I9(EnumC3157o4.m, "Retry Attempted");
                        }
                    }
                }
            }
            return response;
        } catch (Throwable th2) {
            th = th2;
            r3 = enumC3157o4A2;
        }
    }

    public static HttpURLConnection a(C3260uc c3260uc, String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Intrinsics.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(c3260uc.f24036i);
        httpURLConnection.setReadTimeout(c3260uc.j);
        httpURLConnection.setUseCaches(false);
        HashMap map = c3260uc.f24033c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnection.setRequestMethod(c3260uc.f24032b.name());
        if (EnumC3212rc.GET != c3260uc.f24032b) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }

    public static void a(String str, HttpURLConnection httpURLConnection, boolean z2) {
        OutputStream bufferedOutputStream;
        OutputStream outputStream = null;
        try {
            if (z2) {
                bufferedOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream(), 4096);
            } else {
                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            }
            outputStream = bufferedOutputStream;
            byte[] bytes = str.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
            outputStream.flush();
            T9.a(outputStream);
        } catch (Throwable th) {
            T9.a(outputStream);
            throw th;
        }
    }

    public static C3324yc a(C3260uc c3260uc, HttpURLConnection httpURLConnection) throws IOException {
        EnumC3157o4 enumC3157o4;
        String string;
        C3324yc c3324yc = new C3324yc();
        int responseCode = httpURLConnection.getResponseCode();
        c3324yc.d = Integer.valueOf(responseCode);
        c3324yc.f24134b = httpURLConnection.getHeaderFields();
        c3324yc.f24136e = httpURLConnection.getContentLength();
        if (!c3260uc.k) {
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.e(inputStream, "getInputStream(...)");
                a(c3324yc, inputStream);
                return c3324yc;
            }
            EnumC3157o4.f23853b.getClass();
            if (400 <= responseCode && 500 > responseCode) {
                enumC3157o4 = EnumC3157o4.f23857i;
            } else if (200 < responseCode && 300 > responseCode) {
                enumC3157o4 = EnumC3157o4.k;
            } else {
                enumC3157o4 = (EnumC3157o4) EnumC3157o4.f23854c.get(responseCode);
                if (enumC3157o4 == null) {
                    enumC3157o4 = EnumC3157o4.f23855e;
                }
            }
            if (enumC3157o4 == EnumC3157o4.f23857i) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                Intrinsics.e(errorStream, "getErrorStream(...)");
                a(c3324yc, errorStream);
                try {
                    JSONObject jSONObject = new JSONObject(J9.a(c3324yc.f24135c));
                    string = jSONObject.has("errorMessage") ? jSONObject.getString("errorMessage") : null;
                } catch (JSONException unused) {
                }
                c3324yc.f24133a = new I9(enumC3157o4, string);
            } else {
                c3324yc.f24133a = new I9(enumC3157o4, android.support.v4.media.a.h(responseCode, "HTTP:"));
                return c3324yc;
            }
        }
        return c3324yc;
    }

    public static void a(C3324yc c3324yc, InputStream inputStream) {
        byte[] bArrA = T9.a(inputStream);
        T9.a((Closeable) inputStream);
        if (bArrA != null) {
            if (!(bArrA.length == 0)) {
                Intrinsics.f(c3324yc, "<this>");
                Map map = c3324yc.f24134b;
                List list = map != null ? (List) map.get("Content-Encoding") : null;
                if (Intrinsics.a(list != null ? (String) list.get(0) : null, com.smartdigimkt.o0.b.d) && (bArrA = T9.a(bArrA)) == null) {
                    c3324yc.f24133a = new I9(EnumC3157o4.f23856h, "Failed to uncompress gzip response");
                }
                if (bArrA != null) {
                    c3324yc.f24135c = bArrA;
                }
            }
        }
    }
}
