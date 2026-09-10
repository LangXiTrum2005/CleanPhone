package com.ironsource;

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

/* JADX INFO: renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0281c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28347a = "POST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28348b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28349c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.c8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f28350h = 15000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f28351i = 15000;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f28352j = "UTF-8";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f28353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f28354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f28355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f28356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f28357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f28358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ArrayList<Pair<String, String>> f28359g;

        /* JADX INFO: renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class C0067a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f28361b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            String f28363d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            List<Pair<String, String>> f28360a = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            String f28362c = "POST";

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28364e = 15000;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f28365f = 15000;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            String f28366g = "UTF-8";

            public C0067a a(String str) {
                this.f28363d = str;
                return this;
            }

            public C0067a b(String str) {
                this.f28366g = str;
                return this;
            }

            public C0067a c(String str) {
                this.f28361b = str;
                return this;
            }

            public C0067a d(String str) {
                this.f28362c = str;
                return this;
            }

            public C0067a a(int i10) {
                this.f28364e = i10;
                return this;
            }

            public C0067a b(int i10) {
                this.f28365f = i10;
                return this;
            }

            public C0067a a(Pair<String, String> pair) {
                this.f28360a.add(pair);
                return this;
            }

            public C0067a a(List<Pair<String, String>> list) {
                this.f28360a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public a(C0067a c0067a) {
            this.f28353a = c0067a.f28361b;
            this.f28354b = c0067a.f28362c;
            this.f28355c = c0067a.f28363d;
            this.f28359g = new ArrayList<>(c0067a.f28360a);
            this.f28356d = c0067a.f28364e;
            this.f28357e = c0067a.f28365f;
            this.f28358f = c0067a.f28366g;
        }

        public boolean a() {
            return "POST".equals(this.f28354b);
        }
    }

    public static Pd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0067a c0067a = new a.C0067a();
        c0067a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0067a.a());
    }

    public static Pd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0067a c0067a = new a.C0067a();
        c0067a.c(str).a(str2).d("POST").a(list);
        return b(c0067a.a());
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0065: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:30:0x0065 */
    public static Pd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (a(aVar.f28353a, aVar.f28355c)) {
            Pd pd2 = new Pd();
            InputStream inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    httpURLConnectionA = a(aVar);
                    try {
                        a(httpURLConnectionA, aVar.f28359g);
                        a(httpURLConnectionA, aVar);
                        inputStream3 = httpURLConnectionA.getInputStream();
                        pd2.f27043a = httpURLConnectionA.getResponseCode();
                        if (inputStream3 != null) {
                            pd2.f27044b = C0647wg.a(inputStream3);
                        }
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                    } catch (InterruptedIOException | SSLException e10) {
                        e = e10;
                        Log.d(f28349c, "Failed post to " + aVar.f28353a + " exception: " + e.getMessage());
                        throw e;
                    } catch (IOException e11) {
                        e = e11;
                        inputStream = inputStream3;
                        httpURLConnection = httpURLConnectionA;
                        C0474n4.d().a(e);
                        if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                            throw new Fc(e);
                        }
                        if (httpURLConnection != null) {
                            int responseCode = httpURLConnection.getResponseCode();
                            pd2.f27043a = responseCode;
                            if (responseCode >= 400) {
                                Log.d(f28349c, "Failed post to " + aVar.f28353a + " StatusCode: " + pd2.f27043a);
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
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        throw th;
                    }
                } catch (InterruptedIOException | SSLException e12) {
                    e = e12;
                } catch (IOException e13) {
                    e = e13;
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnectionA = null;
                }
                httpURLConnectionA.disconnect();
                return pd2;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionA = null;
                inputStream3 = inputStream2;
            }
        } else {
            throw new InvalidParameterException("not valid params");
        }
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f28355c.getBytes(aVar.f28358f);
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

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f28353a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f28356d);
        httpURLConnection.setReadTimeout(aVar.f28357e);
        httpURLConnection.setRequestMethod(aVar.f28354b);
        return httpURLConnection;
    }
}
