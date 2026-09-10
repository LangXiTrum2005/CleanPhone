package com.ironsource;

import android.net.Uri;
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

/* JADX INFO: renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3420a8 {
    private static final String a = "POST";
    private static final String b = "GET";
    private static final String c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.a8$a */
    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final String j = "UTF-8";
        final String a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList<Pair<String, String>> g;

        /* JADX INFO: renamed from: com.ironsource.a8$a$a, reason: collision with other inner class name */
        public static class C0380a {
            String b;
            String d;
            List<Pair<String, String>> a = new ArrayList();
            String c = "POST";
            int e = 15000;
            int f = 15000;
            String g = "UTF-8";

            public C0380a a(String str) {
                this.d = str;
                return this;
            }

            public C0380a b(String str) {
                this.g = str;
                return this;
            }

            public C0380a c(String str) {
                this.b = str;
                return this;
            }

            public C0380a d(String str) {
                this.c = str;
                return this;
            }

            public C0380a a(int i) {
                this.e = i;
                return this;
            }

            public C0380a b(int i) {
                this.f = i;
                return this;
            }

            public C0380a a(Pair<String, String> pair) {
                this.a.add(pair);
                return this;
            }

            public C0380a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public a(C0380a c0380a) {
            this.a = c0380a.b;
            this.b = c0380a.c;
            this.c = c0380a.d;
            this.g = new ArrayList<>(c0380a.a);
            this.d = c0380a.e;
            this.e = c0380a.f;
            this.f = c0380a.g;
        }

        public boolean a() {
            return "POST".equals(this.b);
        }
    }

    public static Cd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0380a c0380a = new a.C0380a();
        c0380a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0380a.a());
    }

    public static Cd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0380a c0380a = new a.C0380a();
        c0380a.c(str).a(str2).d("POST").a(list);
        return b(c0380a.a());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    public static Cd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (a(aVar.a, aVar.c)) {
            Cd cd = new Cd();
            InputStream inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            HttpURLConnection httpURLConnection = null;
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnectionA = a(aVar);
                try {
                    a(httpURLConnectionA, aVar.g);
                    a(httpURLConnectionA, aVar);
                    inputStream3 = httpURLConnectionA.getInputStream();
                    cd.a = httpURLConnectionA.getResponseCode();
                    if (inputStream3 != null) {
                        cd.b = C3482dg.a(inputStream3);
                    }
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                } catch (InterruptedIOException e) {
                    e = e;
                    inputStream2 = inputStream3;
                    httpURLConnection = httpURLConnectionA;
                    try {
                        e.getMessage();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnectionA = httpURLConnection;
                        inputStream3 = inputStream2;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        throw th;
                    }
                } catch (SSLException e2) {
                    e = e2;
                    inputStream2 = inputStream3;
                    httpURLConnection = httpURLConnectionA;
                    e.getMessage();
                    throw e;
                } catch (IOException e3) {
                    e = e3;
                    inputStream = inputStream3;
                    httpURLConnection2 = httpURLConnectionA;
                    try {
                        C3631m4.d().a(e);
                        if (httpURLConnection2 != null && httpURLConnection2.getHeaderFields().isEmpty()) {
                            throw new Ac(e);
                        }
                        if (httpURLConnection2 != null) {
                            int responseCode = httpURLConnection2.getResponseCode();
                            cd.a = responseCode;
                            if (responseCode >= 400) {
                                if (inputStream != null) {
                                    InputStream inputStream4 = inputStream;
                                    httpURLConnectionA = httpURLConnection2;
                                    inputStream3 = inputStream4;
                                    inputStream3.close();
                                } else {
                                    httpURLConnectionA = httpURLConnection2;
                                }
                            }
                        }
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        InputStream inputStream5 = inputStream;
                        httpURLConnectionA = httpURLConnection2;
                        inputStream3 = inputStream5;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                    throw th;
                }
            } catch (InterruptedIOException e4) {
                e = e4;
                inputStream2 = null;
                e.getMessage();
                throw e;
            } catch (SSLException e5) {
                e = e5;
                inputStream2 = null;
                e.getMessage();
                throw e;
            } catch (IOException e6) {
                e = e6;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionA = null;
            }
            httpURLConnectionA.disconnect();
            return cd;
        }
        throw new InvalidParameterException("not valid params");
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
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
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }
}
