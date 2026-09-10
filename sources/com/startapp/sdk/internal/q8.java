package com.startapp.sdk.internal;

import android.net.Uri;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;
import com.startapp.sdk.common.SDKException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f41394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3 f41395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41396c;
    public final lb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f41397e;
    public final lb f;

    public q8(lb lbVar, u3 u3Var, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5) {
        this.f41394a = lbVar;
        this.f41395b = u3Var;
        this.f41396c = lbVar2;
        this.d = lbVar3;
        this.f41397e = lbVar4;
        this.f = lbVar5;
    }

    public final boolean a(int i2) {
        ComponentInfoEventConfig componentInfoEventConfigB = ((HttpClientConfig) this.f.a()).b();
        return componentInfoEventConfigB != null && componentInfoEventConfigB.a((long) i2);
    }

    public final String b(p8 p8Var) throws Throwable {
        HashMap mapA = a();
        try {
            TimeoutConfig timeoutConfigC = p8Var.d;
            if (timeoutConfigC == null && (timeoutConfigC = ((HttpClientConfig) this.f.a()).c()) == null) {
                timeoutConfigC = TimeoutConfig.f40715a;
            }
            ((z6) ((y6) this.d.a())).c(p8Var, ii.r);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.f41397e.a()).schedule(a(atomicReference), timeoutConfigC.c(), TimeUnit.MILLISECONDS);
            String strA = a(p8Var.f41354b, mapA, p8Var.f41355c, atomicReference, timeoutConfigC);
            ((z6) ((y6) this.d.a())).c(p8Var, ii.s);
            ((z6) ((y6) this.d.a())).a(p8Var, r8.a(200, null, (HttpClientConfig) this.f.a()));
            return strA != null ? strA : "";
        } catch (SDKException e2) {
            ((z6) ((y6) this.d.a())).c(p8Var, ii.t);
            ((z6) ((y6) this.d.a())).a(p8Var, r8.a(e2.a(), null, (HttpClientConfig) this.f.a()));
            i7 i7Var = p8Var.f41356e;
            if (i7Var != null) {
                try {
                    i7Var.a(e2);
                } catch (Throwable th) {
                    if (a(32)) {
                        g9.a(th);
                    }
                }
            }
            return null;
        }
    }

    public final t8 a(p8 p8Var) throws Throwable {
        HashMap mapA = a();
        System.currentTimeMillis();
        vi.b();
        try {
            TimeoutConfig timeoutConfigC = p8Var.d;
            if (timeoutConfigC == null && (timeoutConfigC = ((HttpClientConfig) this.f.a()).c()) == null) {
                timeoutConfigC = TimeoutConfig.f40715a;
            }
            ((z6) ((y6) this.d.a())).c(p8Var, ii.o);
            AtomicReference atomicReference = new AtomicReference();
            ((ScheduledExecutorService) this.f41397e.a()).schedule(a(atomicReference), timeoutConfigC.c(), TimeUnit.MILLISECONDS);
            t8 t8VarA = a(p8Var.f41354b, mapA, atomicReference, timeoutConfigC);
            ((z6) ((y6) this.d.a())).c(p8Var, ii.f41112p);
            ((z6) ((y6) this.d.a())).a(p8Var, r8.a(200, t8VarA.d, (HttpClientConfig) this.f.a()));
            vi.b();
            return t8VarA;
        } catch (SDKException e2) {
            ((z6) ((y6) this.d.a())).c(p8Var, ii.q);
            ((z6) ((y6) this.d.a())).a(p8Var, r8.a(e2.a(), null, (HttpClientConfig) this.f.a()));
            i7 i7Var = p8Var.f41356e;
            if (i7Var != null) {
                try {
                    i7Var.a(e2);
                } catch (Throwable th) {
                    if (a(32)) {
                        g9.a(th);
                    }
                }
            }
            return null;
        }
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        if (!((HttpClientConfig) this.f.a()).f()) {
            String strEncode = null;
            try {
                strEncode = URLEncoder.encode(((com.startapp.sdk.common.advertisingid.b) this.f41394a.a()).a().f41193a, "UTF-8");
            } catch (Throwable th) {
                if (a(64)) {
                    g9.a(th);
                }
            }
            map.put("device-id", strEncode);
        }
        try {
            map.put("Accept-Language", ((cc) ((dc) this.f41396c.a()).b()).f40873c);
        } catch (Throwable th2) {
            if (a(128)) {
                g9.a(th2);
            }
        }
        try {
            String str = (String) this.f41395b.a();
            if (str != null) {
                map.put(Command.HTTP_HEADER_USER_AGENT, str);
            }
        } catch (Throwable th3) {
            if (a(256)) {
                g9.a(th3);
            }
        }
        return map;
    }

    public static HttpURLConnection a(String str, HashMap map, s8 s8Var, TimeoutConfig timeoutConfig) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        j6.a(httpURLConnection, str);
        httpURLConnection.setReadTimeout((int) timeoutConfig.b());
        httpURLConnection.setConnectTimeout((int) timeoutConfig.a());
        if (s8Var == null) {
            httpURLConnection.setRequestMethod(ko.f25534a);
        } else {
            httpURLConnection.setRequestMethod(ko.f25535b);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(s8Var.f41474a.length);
            httpURLConnection.setRequestProperty("Content-Type", s8Var.f41475b);
            String str2 = s8Var.f41476c;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("Content-Encoding", str2);
            }
        }
        httpURLConnection.setRequestProperty("Accept", "application/json;text/html;text/plain");
        httpURLConnection.setRequestProperty("Accept-Encoding", com.smartdigimkt.o0.b.d);
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null && str4 != null) {
                httpURLConnection.setRequestProperty(str3, str4);
            }
        }
        return httpURLConnection;
    }

    public static t8 a(String str, HashMap map, AtomicReference atomicReference, TimeoutConfig timeoutConfig) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnectionA;
        IOException iOException;
        int i2;
        try {
            httpURLConnectionA = a(str, map, (s8) null, timeoutConfig);
            try {
                try {
                    atomicReference.set(new C(httpURLConnectionA, 4));
                    int responseCode = httpURLConnectionA.getResponseCode();
                    try {
                        if (responseCode == 200) {
                            CookieManager cookieManager = j6.f41135a;
                            if (cookieManager != null) {
                                cookieManager.put(URI.create(str), httpURLConnectionA.getHeaderFields());
                            }
                            t8 t8Var = new t8();
                            t8Var.f41507a = str;
                            t8Var.f41509c = httpURLConnectionA.getContentType();
                            t8Var.d = httpURLConnectionA.getHeaderFields();
                            t8Var.f41508b = a(httpURLConnectionA);
                            httpURLConnectionA.disconnect();
                            atomicReference.set(null);
                            return t8Var;
                        }
                        throw new SDKException(ko.f25534a, Uri.parse(str).buildUpon().query(null).build(), responseCode, true, null);
                    } catch (IOException e2) {
                        iOException = e2;
                        i2 = responseCode;
                        throw new SDKException(ko.f25534a, Uri.parse(str).buildUpon().query(null).build(), i2, false, iOException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                        atomicReference.set(null);
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException e3) {
                iOException = e3;
                i2 = 0;
                throw new SDKException(ko.f25534a, Uri.parse(str).buildUpon().query(null).build(), i2, false, iOException);
            }
        } catch (IOException e4) {
            iOException = e4;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionA = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v5 */
    public static String a(String str, HashMap map, s8 s8Var, AtomicReference atomicReference, TimeoutConfig timeoutConfig) throws Throwable {
        Throwable th;
        ?? r10;
        IOException iOException;
        int i2;
        Throwable th2;
        OutputStream outputStream;
        try {
            try {
                HttpURLConnection httpURLConnectionA = a(str, map, s8Var, timeoutConfig);
                try {
                    atomicReference.set(new C(httpURLConnectionA, 4));
                    if (s8Var.f41474a.length > 0) {
                        try {
                            outputStream = httpURLConnectionA.getOutputStream();
                            try {
                                outputStream.write(s8Var.f41474a);
                                outputStream.flush();
                                int i3 = q0.f41381a;
                                try {
                                    outputStream.close();
                                } catch (Exception unused) {
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                int i4 = q0.f41381a;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                        throw th2;
                                    } catch (Exception unused2) {
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            outputStream = null;
                        }
                    }
                    int responseCode = httpURLConnectionA.getResponseCode();
                    try {
                        if (responseCode == 200) {
                            String strA = a(httpURLConnectionA);
                            httpURLConnectionA.disconnect();
                            atomicReference.set(null);
                            return strA;
                        }
                        throw new SDKException(ko.f25535b, Uri.parse(str).buildUpon().query(null).build(), responseCode, false, null);
                    } catch (IOException e2) {
                        iOException = e2;
                        i2 = responseCode;
                        throw new SDKException(ko.f25535b, Uri.parse(str).buildUpon().query(null).build(), i2, false, iOException);
                    }
                } catch (IOException e3) {
                    iOException = e3;
                    i2 = 0;
                    throw new SDKException(ko.f25535b, Uri.parse(str).buildUpon().query(null).build(), i2, false, iOException);
                }
            } catch (IOException e4) {
                iOException = e4;
            } catch (Throwable th5) {
                th = th5;
                r10 = 0;
                if (r10 != 0) {
                    r10.disconnect();
                    atomicReference.set(null);
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            r10 = map;
            if (r10 != 0) {
                r10.disconnect();
                atomicReference.set(null);
                throw th;
            }
            throw th;
        }
    }

    public static String a(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = httpURLConnection.getInputStream();
            if (inputStream2 != null) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[1024];
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(com.smartdigimkt.o0.b.d.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream2) : inputStream2, "UTF-8"));
                    while (true) {
                        int i2 = bufferedReader.read(cArr);
                        if (i2 == -1) {
                            break;
                        }
                        stringWriter.write(cArr, 0, i2);
                    }
                    String string = stringWriter.toString();
                    int i3 = q0.f41381a;
                    try {
                        inputStream2.close();
                    } catch (Exception unused) {
                    }
                    return string;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    int i4 = q0.f41381a;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            int i5 = q0.f41381a;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception unused3) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Runnable a(AtomicReference atomicReference) {
        return new C(atomicReference, 5);
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, String str) {
        try {
            Runnable runnable = (Runnable) atomicReference.get();
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable unused) {
        }
    }
}
