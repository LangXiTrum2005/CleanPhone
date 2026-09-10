package com.p004ironsource;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes5.dex */
public class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27896a = "POST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27897b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27898c = "ISHttpService";

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f27899h = 15000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f27900i = 15000;
        private static final String j = "UTF-8";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f27901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f27902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f27903c;
        final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f27904e;
        final String f;
        ArrayList<Pair<String, String>> g;

        /* JADX INFO: renamed from: com.ironsource.zg$a$a, reason: collision with other inner class name */
        public static class C0303a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f27906b;
            String d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            List<Pair<String, String>> f27905a = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            String f27907c = "POST";

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f27908e = 15000;
            int f = 15000;
            String g = "UTF-8";

            public C0303a a(int i2) {
                this.f27908e = i2;
                return this;
            }

            public C0303a b(int i2) {
                this.f = i2;
                return this;
            }

            public C0303a c(String str) {
                this.f27906b = str;
                return this;
            }

            public C0303a d(String str) {
                this.f27907c = str;
                return this;
            }

            public C0303a a(Pair<String, String> pair) {
                this.f27905a.add(pair);
                return this;
            }

            public C0303a b(String str) {
                this.g = str;
                return this;
            }

            public C0303a a(String str) {
                this.d = str;
                return this;
            }

            public C0303a a(List<Pair<String, String>> list) {
                this.f27905a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public a(C0303a c0303a) {
            this.f27901a = c0303a.f27906b;
            this.f27902b = c0303a.f27907c;
            this.f27903c = c0303a.d;
            this.g = new ArrayList<>(c0303a.f27905a);
            this.d = c0303a.f27908e;
            this.f27904e = c0303a.f;
            this.f = c0303a.g;
        }

        public boolean a() {
            return "POST".equals(this.f27902b);
        }
    }

    public static ir a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0303a c0303a = new a.C0303a();
        c0303a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0303a.a());
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:32:0x0067 */
    public static ir b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (!a(aVar.f27901a, aVar.f27903c)) {
            throw new InvalidParameterException("not valid params");
        }
        ir irVar = new ir();
        InputStream inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnectionA = a(aVar);
                try {
                    a(httpURLConnectionA, aVar.g);
                    a(httpURLConnectionA, aVar);
                    inputStream3 = httpURLConnectionA.getInputStream();
                    irVar.f25367a = httpURLConnectionA.getResponseCode();
                    if (inputStream3 != null) {
                        irVar.f25368b = rw.a(inputStream3);
                    }
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                } catch (InterruptedIOException e2) {
                    e = e2;
                    Log.d(f27898c, "Failed post to " + aVar.f27901a + " exception: " + e.getMessage());
                    throw e;
                } catch (SSLException e3) {
                    e = e3;
                    Log.d(f27898c, "Failed post to " + aVar.f27901a + " exception: " + e.getMessage());
                    throw e;
                } catch (IOException e4) {
                    e = e4;
                    inputStream = inputStream3;
                    httpURLConnection = httpURLConnectionA;
                    q9.d().a(e);
                    if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                        throw new ip(e);
                    }
                    if (httpURLConnection != null) {
                        int responseCode = httpURLConnection.getResponseCode();
                        irVar.f25367a = responseCode;
                        if (responseCode >= 400) {
                            Log.d(f27898c, "Failed post to " + aVar.f27901a + " StatusCode: " + irVar.f25367a);
                            if (inputStream != null) {
                                InputStream inputStream4 = inputStream;
                                httpURLConnectionA = httpURLConnection;
                                inputStream3 = inputStream4;
                                inputStream3.close();
                            } else {
                                httpURLConnectionA = httpURLConnection;
                            }
                        }
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                    throw th;
                }
            } catch (InterruptedIOException e5) {
                e = e5;
                Log.d(f27898c, "Failed post to " + aVar.f27901a + " exception: " + e.getMessage());
                throw e;
            } catch (SSLException e6) {
                e = e6;
                Log.d(f27898c, "Failed post to " + aVar.f27901a + " exception: " + e.getMessage());
                throw e;
            } catch (IOException e7) {
                e = e7;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnectionA = null;
            }
            httpURLConnectionA.disconnect();
            return irVar;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionA = null;
            inputStream3 = inputStream2;
        }
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f27901a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.f27904e);
        httpURLConnection.setRequestMethod(aVar.f27902b);
        return httpURLConnection;
    }

    public static ir b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0303a c0303a = new a.C0303a();
        c0303a.c(str).a(str2).d("POST").a(list);
        return b(c0303a.a());
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f27903c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }
}
