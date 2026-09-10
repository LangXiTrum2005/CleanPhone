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

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3473d7 {
    private static final int a = 15000;
    private static final String b = "GET";
    private static final String c = "POST";
    private static final String d = "UTF-8";
    public static final String e = "ERROR:";
    private static final String f = "Bad Request - 400";
    private static final ExecutorService g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ InterfaceC3491e7 c;

        public a(String str, String str2, InterfaceC3491e7 interfaceC3491e7) {
            this.a = str;
            this.b = str2;
            this.c = interfaceC3491e7;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnectionB;
            OutputStream outputStream;
            try {
                httpURLConnectionB = C3473d7.b(this.a);
                try {
                    outputStream = httpURLConnectionB.getOutputStream();
                    try {
                        try {
                            C3473d7.a(this.b, outputStream);
                            int responseCode = httpURLConnectionB.getResponseCode();
                            boolean z = responseCode == 200;
                            if (!z) {
                                IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                            }
                            this.c.a(z);
                        } catch (Throwable th) {
                            th = th;
                            C3473d7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        C3631m4.d().a(e);
                        IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                        this.c.a(false);
                    }
                } catch (Exception e2) {
                    e = e2;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    C3473d7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnectionB = null;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnectionB = null;
                outputStream = null;
            }
            C3473d7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
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
        Exception e2;
        BufferedReader bufferedReader2;
        Throwable th;
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
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        C3631m4.d().a(e2);
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                e2 = e;
                bufferedReader2 = null;
                C3631m4.d().a(e2);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                BufferedReader bufferedReader4 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader4;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static void a(String str, String str2, InterfaceC3491e7 interfaceC3491e7) {
        g.submit(new a(str, str2, interfaceC3491e7));
    }

    public static String a(String str, String str2, com.ironsource.mediationsdk.p.b bVar) {
        InterfaceC3509f7 interfaceC3509f7A = a(str, str2);
        if (interfaceC3509f7A instanceof InterfaceC3509f7.a) {
            InterfaceC3509f7.a aVar = (InterfaceC3509f7.a) interfaceC3509f7A;
            if (aVar.b()) {
                return null;
            }
            bVar.a(aVar.a());
            return null;
        }
        return ((InterfaceC3509f7.b) interfaceC3509f7A).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    public static InterfaceC3509f7 a(String str, String str2) throws Throwable {
        OutputStream outputStream;
        Exception e2;
        Exception e3;
        BufferedReader bufferedReader;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
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
                                    InterfaceC3509f7.b bVar = new InterfaceC3509f7.b(strA);
                                    a(outputStream, (HttpURLConnection) str, bufferedReader);
                                    return bVar;
                                }
                                InterfaceC3509f7.a.c cVar = new InterfaceC3509f7.a.c();
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return cVar;
                            } catch (Exception e4) {
                                e3 = e4;
                                C3631m4.d().a(e3);
                                IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                                InterfaceC3509f7.a.C0399a c0399a = new InterfaceC3509f7.a.C0399a(e3);
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return c0399a;
                            }
                        }
                        InterfaceC3509f7.a.b bVar2 = new InterfaceC3509f7.a.b(responseCode, str.getResponseMessage());
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) null);
                        return bVar2;
                    } catch (Exception e5) {
                        e2 = e5;
                        e3 = e2;
                        bufferedReader = null;
                        C3631m4.d().a(e3);
                        IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                        InterfaceC3509f7.a.C0399a c0399a2 = new InterfaceC3509f7.a.C0399a(e3);
                        a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return c0399a2;
                    } catch (Throwable th) {
                        th = th;
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) r0);
                        throw th;
                    }
                } catch (Exception e6) {
                    e2 = e6;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (Exception e7) {
                e2 = e7;
                str = 0;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
                outputStream = null;
            }
        } catch (Throwable th4) {
            r0 = str2;
            th = th4;
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
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
        }
        String string = sb.toString();
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
            } catch (IOException e2) {
                C3631m4.d().a(e2);
                IronLog.INTERNAL.error("exception while closing output stream " + e2.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                C3631m4.d().a(e3);
                IronLog.INTERNAL.error("exception while closing reader " + e3.getMessage());
            }
        }
    }
}
