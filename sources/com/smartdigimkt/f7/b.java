package com.smartdigimkt.f7;

import android.os.SystemClock;
import com.smartdigimkt.l7.d;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35252a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f35253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f35254c;
    protected long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f35255e;
    protected long f;
    protected long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected long f35256h;

    public class a extends d {
        public a() {
        }

        private void b(String str) throws Throwable {
            b.this.d = System.currentTimeMillis();
            b.this.f35255e = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    String unused = b.this.f35252a;
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                        Map<String, String> mapE = b.this.e();
                        if (mapE != null && mapE.size() > 0) {
                            for (String str2 : mapE.keySet()) {
                                httpURLConnection2.addRequestProperty(str2, mapE.get(str2));
                                String unused2 = b.this.f35252a;
                                mapE.get(str2);
                            }
                        }
                        b bVar = b.this;
                        if (bVar.f35254c) {
                            bVar.b("-10001", "Task had been canceled.");
                            httpURLConnection2.disconnect();
                            return;
                        }
                        httpURLConnection2.setConnectTimeout(bVar.a());
                        httpURLConnection2.setReadTimeout(b.this.b());
                        httpURLConnection2.connect();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode == 200) {
                            b bVar2 = b.this;
                            if (bVar2.f35254c) {
                                bVar2.b("-10001", "Task had been canceled.");
                                httpURLConnection2.disconnect();
                                return;
                            }
                            bVar2.f35256h = httpURLConnection2.getContentLength();
                            InputStream inputStream = httpURLConnection2.getInputStream();
                            boolean zA = b.this.a(inputStream);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            b.this.f = System.currentTimeMillis();
                            b.this.g = SystemClock.elapsedRealtime();
                            if (zA) {
                                String unused3 = b.this.f35252a;
                                b bVar3 = b.this;
                                String str3 = bVar3.f35253b;
                                bVar3.d();
                            } else {
                                String unused4 = b.this.f35252a;
                                b bVar4 = b.this;
                                String str4 = bVar4.f35253b;
                                bVar4.b("-10000", "Save fail!");
                            }
                            httpURLConnection2.disconnect();
                            return;
                        }
                        String unused5 = b.this.f35252a;
                        if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                            b.this.b("-10000", "Resource download fail, status code: " + responseCode + ", " + httpURLConnection2.getResponseMessage() + ", url: " + str);
                            httpURLConnection2.disconnect();
                            return;
                        }
                        b bVar5 = b.this;
                        if (bVar5.f35254c) {
                            bVar5.b("-10001", "Task had been canceled.");
                        } else {
                            String headerField = httpURLConnection2.getHeaderField("Location");
                            if (headerField != null) {
                                if (!headerField.toLowerCase().startsWith("http")) {
                                    b.this.b("-10000", "Final url is wrong:" + headerField);
                                    httpURLConnection2.disconnect();
                                    return;
                                }
                                b(headerField);
                            }
                        }
                        httpURLConnection2.disconnect();
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused6 = b.this.f35252a;
                        e.getMessage();
                        b.this.b("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection2 = httpURLConnection;
                        }
                    } catch (StackOverflowError e3) {
                        e = e3;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused7 = b.this.f35252a;
                        e.getMessage();
                        b.this.b("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection2 = httpURLConnection;
                        }
                    } catch (Error e4) {
                        e = e4;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused8 = b.this.f35252a;
                        e.getMessage();
                        b.this.b("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection2 = httpURLConnection;
                        }
                    } catch (SocketTimeoutException e5) {
                        e = e5;
                        httpURLConnection = httpURLConnection2;
                        b.this.b("-10000", e.getMessage());
                        String unused9 = b.this.f35252a;
                        e.toString();
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection2 = httpURLConnection;
                    } catch (ConnectTimeoutException e6) {
                        e = e6;
                        httpURLConnection = httpURLConnection2;
                        b.this.b("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection2 = httpURLConnection;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        httpURLConnection = httpURLConnection2;
                        String unused10 = b.this.f35252a;
                        e.getMessage();
                        b.this.b("-10000", e.getMessage());
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection2 = httpURLConnection;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (OutOfMemoryError e8) {
                    e = e8;
                } catch (StackOverflowError e9) {
                    e = e9;
                } catch (Error e10) {
                    e = e10;
                } catch (SocketTimeoutException e11) {
                    e = e11;
                } catch (ConnectTimeoutException e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.smartdigimkt.l7.d
        public void d() throws Throwable {
            try {
                b(b.this.f35253b);
            } catch (Exception e2) {
                String unused = b.this.f35252a;
                e2.getMessage();
                b.this.b("-10000", e2.getMessage());
            } catch (OutOfMemoryError e3) {
                e = e3;
                System.gc();
                b.this.b("-10000", e.getMessage());
            } catch (StackOverflowError e4) {
                e = e4;
                System.gc();
                b.this.b("-10000", e.getMessage());
            }
        }
    }

    public b(String str) {
        this.f35253b = str;
    }

    private void c() {
        a(new a());
    }

    public int a() {
        return 60000;
    }

    public abstract void a(d dVar);

    public abstract void a(String str, String str2);

    public abstract boolean a(InputStream inputStream);

    public int b() {
        return 60000;
    }

    public abstract void b(String str, String str2);

    public abstract void d();

    public abstract Map<String, String> e();

    public void f() {
        this.f35254c = false;
        c();
    }

    public void g() {
        this.f35254c = true;
    }
}
