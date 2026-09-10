package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.ironsource.f7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0334f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f28633a = 15000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28634b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28635c = "POST";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28636d = "UTF-8";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28637e = "ERROR:";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28638f = "Bad Request - 400";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ExecutorService f28639g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.ironsource.f7$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0352g7 f28642c;

        public a(String str, String str2, InterfaceC0352g7 interfaceC0352g7) {
            this.f28640a = str;
            this.f28641b = str2;
            this.f28642c = interfaceC0352g7;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnectionB;
            OutputStream outputStream = null;
            try {
                httpURLConnectionB = C0334f7.b(this.f28640a);
                try {
                    try {
                        outputStream = httpURLConnectionB.getOutputStream();
                        C0334f7.a(this.f28641b, outputStream);
                        int responseCode = httpURLConnectionB.getResponseCode();
                        boolean z10 = responseCode == 200;
                        if (!z10) {
                            IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                        }
                        this.f28642c.a(z10);
                    } catch (Throwable th2) {
                        th = th2;
                        C0334f7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    C0474n4.d().a(e);
                    IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                    this.f28642c.a(false);
                }
            } catch (Exception e11) {
                e = e11;
                httpURLConnectionB = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnectionB = null;
                C0334f7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                throw th;
            }
            C0334f7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
        }
    }

    public static String a(String str) throws Exception {
        return a(str, (com.ironsource.mediationsdk.p.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String a(String str, com.ironsource.mediationsdk.p.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e10;
        BufferedReader bufferedReader2;
        Throwable th2;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (bVar != null) {
                        bVar.a("Bad Request - 400");
                    }
                    a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String strA = a(bufferedReader2);
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return strA;
                } catch (Exception e11) {
                    e10 = e11;
                    try {
                        C0474n4.d().a(e10);
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th3) {
                        bufferedReader = bufferedReader2;
                        th = th3;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th2 = th;
                        bufferedReader2 = bufferedReader3;
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th2;
                }
            } catch (Exception e12) {
                e = e12;
                e10 = e;
                bufferedReader2 = null;
                C0474n4.d().a(e10);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                BufferedReader bufferedReader4 = bufferedReader;
                th2 = th;
                bufferedReader2 = bufferedReader4;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th2;
            }
        } catch (Exception e13) {
            e = e13;
            httpURLConnection = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static void a(String str, String str2, InterfaceC0352g7 interfaceC0352g7) {
        f28639g.submit(new a(str, str2, interfaceC0352g7));
    }

    public static String a(String str, String str2, com.ironsource.mediationsdk.p.b bVar) {
        InterfaceC0370h7 interfaceC0370h7A = a(str, str2);
        if (interfaceC0370h7A instanceof InterfaceC0370h7.a) {
            InterfaceC0370h7.a aVar = (InterfaceC0370h7.a) interfaceC0370h7A;
            if (aVar.b()) {
                return null;
            }
            bVar.a(aVar.a());
            return null;
        }
        return ((InterfaceC0370h7.b) interfaceC0370h7A).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    public static InterfaceC0370h7 a(String str, String str2) throws Throwable {
        OutputStream outputStream;
        Exception e10;
        Exception e11;
        BufferedReader bufferedReader;
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        try {
            try {
                str = b(str);
                try {
                    str.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                    outputStream = str.getOutputStream();
                    try {
                        a(str2, outputStream);
                        int responseCode = str.getResponseCode();
                        if (responseCode == 200) {
                            bufferedReader = new BufferedReader(new InputStreamReader(str.getInputStream()));
                            try {
                                String strA = a(bufferedReader);
                                if (strA != null) {
                                    InterfaceC0370h7.b bVar = new InterfaceC0370h7.b(strA);
                                    a(outputStream, (HttpURLConnection) str, bufferedReader);
                                    return bVar;
                                }
                                InterfaceC0370h7.a.c cVar = new InterfaceC0370h7.a.c();
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return cVar;
                            } catch (Exception e12) {
                                e11 = e12;
                                C0474n4.d().a(e11);
                                IronLog.INTERNAL.error("exception while sending request " + e11.getMessage());
                                InterfaceC0370h7.a.C0073a c0073a = new InterfaceC0370h7.a.C0073a(e11);
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return c0073a;
                            }
                        }
                        InterfaceC0370h7.a.b bVar2 = new InterfaceC0370h7.a.b(responseCode, str.getResponseMessage());
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) null);
                        return bVar2;
                    } catch (Exception e13) {
                        e10 = e13;
                        e11 = e10;
                        bufferedReader = null;
                        C0474n4.d().a(e11);
                        IronLog.INTERNAL.error("exception while sending request " + e11.getMessage());
                        InterfaceC0370h7.a.C0073a c0073a2 = new InterfaceC0370h7.a.C0073a(e11);
                        a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return c0073a2;
                    } catch (Throwable th2) {
                        th = th2;
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) r2);
                        throw th;
                    }
                } catch (Exception e14) {
                    e10 = e14;
                    outputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                }
            } catch (Exception e15) {
                e10 = e15;
                str = 0;
                outputStream = null;
            } catch (Throwable th4) {
                th = th4;
                str = 0;
                outputStream = null;
            }
        } catch (Throwable th5) {
            r2 = str2;
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error("exception while closing output stream " + e10.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e11) {
                C0474n4.d().a(e11);
                IronLog.INTERNAL.error("exception while closing reader " + e11.getMessage());
            }
        }
    }
}
