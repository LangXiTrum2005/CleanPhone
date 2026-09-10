package com.smartdigimkt.o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {
    private static final boolean r = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37241i;
    private String j;
    com.smartdigimkt.p.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37242l;
    private e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37243n;
    private com.smartdigimkt.s0.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private m f37244p;
    private Handler q;

    public class a implements com.smartdigimkt.s0.a.InterfaceC0579a {

        /* JADX INFO: renamed from: com.smartdigimkt.o.c$a$a, reason: collision with other inner class name */
        public class RunnableC0556a implements Runnable {
            public RunnableC0556a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.m != null) {
                    if (c.this.k.l()) {
                        c.this.m.a(c.this.k);
                        return;
                    }
                    e eVar = c.this.m;
                    com.smartdigimkt.p.b bVar = c.this.k;
                    eVar.a(bVar, bVar.f());
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.s0.a.InterfaceC0579a
        public void a(com.smartdigimkt.s0.a.b bVar) {
            if (bVar == com.smartdigimkt.s0.a.b.FINISH && c.this.f37243n) {
                c.this.q.post(new RunnableC0556a());
            }
        }
    }

    public class b extends com.smartdigimkt.s0.a {
        private b() {
        }

        @Override // com.smartdigimkt.s0.a
        public void a(boolean z2) {
        }

        @Override // com.smartdigimkt.s0.a
        public void c() {
        }

        /* JADX WARN: Code duplicated, block: B:104:0x0117 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:108:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:0x0103 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x0146 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ad A[Catch: Exception -> 0x007d, TRY_ENTER, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x00fd A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x010b A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0124 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0135 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x014c A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x01c4 A[Catch: Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, blocks: (B:3:0x0001, B:7:0x0015, B:10:0x001f, B:16:0x0079, B:49:0x00c7, B:51:0x00cd, B:53:0x00d5, B:56:0x00de, B:58:0x00ed, B:57:0x00e6, B:59:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x010b, B:65:0x0117, B:66:0x0124, B:68:0x0135, B:71:0x0146, B:37:0x00ad, B:39:0x00b4, B:73:0x014c, B:74:0x014f, B:75:0x0150, B:77:0x0162, B:80:0x0175, B:82:0x0185, B:90:0x01dd, B:83:0x019f, B:85:0x01a7, B:88:0x01b8, B:87:0x01b1, B:89:0x01c4), top: B:96:0x0001 }] */
        @Override // com.smartdigimkt.s0.a
        public void f() throws Throwable {
            HttpURLConnection httpURLConnection;
            String headerField;
            int responseCode;
            String headerField2;
            try {
                c.this.k = new com.smartdigimkt.p.b();
                int i2 = 0;
                while (true) {
                    HttpURLConnection httpURLConnection2 = null;
                    if (i2 >= 10) {
                        break;
                    }
                    if (!c.this.f37243n) {
                        return;
                    }
                    c.e(c.this);
                    try {
                        c cVar = c.this;
                        cVar.j = cVar.j.replace(" ", "%20");
                        String unused = c.this.j;
                        httpURLConnection = (HttpURLConnection) new URL(c.this.j).openConnection();
                        try {
                            try {
                                httpURLConnection.setRequestMethod(ko.f25534a);
                                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
                                httpURLConnection.setConnectTimeout(15000);
                                httpURLConnection.setReadTimeout(15000);
                                httpURLConnection.setInstanceFollowRedirects(false);
                                httpURLConnection.connect();
                                responseCode = httpURLConnection.getResponseCode();
                                try {
                                    headerField = httpURLConnection.getHeaderField("Location");
                                    try {
                                        headerField2 = httpURLConnection.getHeaderField("Content-type");
                                        httpURLConnection.disconnect();
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (i2 == 0) {
                                            c.this.k.b(false);
                                            c.this.k.e(e.getLocalizedMessage());
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                                return;
                                            }
                                            return;
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        headerField2 = null;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    headerField = null;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                headerField = null;
                                responseCode = 200;
                                e.printStackTrace();
                                if (i2 == 0) {
                                    c.this.k.b(false);
                                    c.this.k.e(e.getLocalizedMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                        return;
                                    }
                                    return;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                headerField2 = null;
                                if (responseCode == 301) {
                                    if (!TextUtils.isEmpty(headerField)) {
                                        c.this.k.c(true);
                                        break;
                                    } else if (headerField.toLowerCase().startsWith("http")) {
                                        c.this.j = headerField;
                                        c.this.k.c(true);
                                        break;
                                    } else {
                                        c.this.j = headerField;
                                        if (TextUtils.isEmpty(c.this.j)) {
                                        }
                                        i2++;
                                    }
                                } else if (!TextUtils.isEmpty(headerField)) {
                                    c.this.k.c(true);
                                    break;
                                } else if (headerField.toLowerCase().startsWith("http")) {
                                    c.this.j = headerField;
                                    c.this.k.c(true);
                                    break;
                                } else {
                                    c.this.j = headerField;
                                    if (TextUtils.isEmpty(c.this.j)) {
                                    }
                                    i2++;
                                }
                                if (c.this.j.toLowerCase().startsWith("market:/")) {
                                    c.this.k.a(1);
                                    c cVar2 = c.this;
                                    cVar2.k.g(cVar2.j);
                                    c.this.k.c(true);
                                } else {
                                    c.this.k.a(1);
                                    c cVar3 = c.this;
                                    cVar3.k.g(cVar3.j);
                                    c.this.k.c(true);
                                }
                                c.this.k.e(null);
                                c.this.k.b(true);
                            }
                            if (responseCode == 301 && responseCode != 302 && responseCode != 307) {
                                if (responseCode != 200) {
                                    c.this.k.c(false);
                                    break;
                                }
                                if (TextUtils.isEmpty(headerField2) || headerField2.indexOf("html") >= 0 || headerField2.indexOf("text") >= 0) {
                                    c.this.k.a(2);
                                } else {
                                    c.this.k.a(3);
                                }
                                c.this.k.c(true);
                                break;
                            }
                            if (!TextUtils.isEmpty(headerField)) {
                                if (headerField.toLowerCase().startsWith("http")) {
                                    c.this.j = headerField;
                                    if (TextUtils.isEmpty(c.this.j) && c.this.j.toLowerCase().endsWith(".apk")) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    c.this.j = headerField;
                                    c.this.k.c(true);
                                    break;
                                }
                            } else {
                                c.this.k.c(true);
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection2 = httpURLConnection;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        httpURLConnection = null;
                        headerField = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th;
                    }
                }
                if (c.this.j.toLowerCase().startsWith("market:/") || c.this.j.toLowerCase().indexOf("play.google.com") > 0) {
                    c.this.k.a(1);
                    c cVar4 = c.this;
                    cVar4.k.g(cVar4.j);
                    c.this.k.c(true);
                } else if (c.this.j.toLowerCase().endsWith(".apk")) {
                    c.this.k.a(3);
                    c cVar5 = c.this;
                    cVar5.k.g(cVar5.j);
                    c.this.k.c(true);
                } else {
                    if (c.this.f37241i >= 10 || !c.this.k.m()) {
                        c.this.k.a(2);
                    }
                    c cVar6 = c.this;
                    cVar6.k.g(cVar6.j);
                }
                c.this.k.e(null);
                c.this.k.b(true);
            } catch (Exception e6) {
                c cVar7 = c.this;
                cVar7.k.g(cVar7.j);
                c.this.k.b(false);
                c.this.k.e(e6.getLocalizedMessage());
                e6.printStackTrace();
            }
        }

        public /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public c(Context context) {
        this(context, false);
    }

    public static /* synthetic */ int e(c cVar) {
        int i2 = cVar.f37241i;
        cVar.f37241i = i2 + 1;
        return i2;
    }

    public boolean g() {
        return this.f37243n;
    }

    public c(Context context, boolean z2) {
        this.f37241i = 0;
        this.j = null;
        this.k = null;
        this.m = null;
        this.f37243n = true;
        this.q = new Handler(Looper.getMainLooper());
        this.o = new com.smartdigimkt.s0.c(context);
        this.f37244p = new m(context);
    }

    @Override // com.smartdigimkt.o.d
    public void f() {
        this.f37243n = false;
    }

    public void a(String str, com.smartdigimkt.x.d dVar, e eVar, String str2, boolean z2, boolean z3, int i2) {
        String strJ;
        this.j = str2;
        this.m = eVar;
        this.k = null;
        this.f37242l = i2;
        boolean z4 = false;
        if (dVar != null) {
            z4 = "5".equals(dVar.q0()) || "6".equals(dVar.q0());
            strJ = dVar.j();
        } else {
            strJ = "";
        }
        this.f37244p.a(str2, eVar, z4, strJ, str, dVar, z2, z3, i2);
    }

    public void a(String str, com.smartdigimkt.x.d dVar, e eVar) {
        this.j = new String(dVar.p0());
        this.m = eVar;
        this.k = null;
        this.f37244p.a(dVar.p0(), eVar, "5".equals(dVar.q0()) || "6".equals(dVar.q0()), dVar.j(), str, dVar, true, false, com.smartdigimkt.q.a.s);
    }
}
