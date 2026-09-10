package com.smartdigimkt.c3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class c implements Serializable {
    public static final String O = "2000077";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final long f34069P = -510642107992871538L;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected static final String f34070Q = "CampaignDownLoadTask";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final int f34071R = 1;
    private static final int S = 2000;
    private static final int T = 1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final int f34072U = 2;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final int f34073V = 3;
    private static final int W = 4;
    private static final int X = 5;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f34074Y = "errorMsg";
    private static final int Z = 10010;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f34076B;
    private com.smartdigimkt.e3.c C;
    private com.smartdigimkt.e3.c D;
    private String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.smartdigimkt.l0.b.C0526b f34079I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    com.smartdigimkt.c3.b f34080J;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f34081N;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34084c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34085e;
    private String f;
    private Runnable g;
    private f j;
    private ExecutorService k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p f34088l;
    private Class m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f34089n;
    private Class o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f34090p;
    private com.smartdigimkt.x.d q;
    private String r;
    private Context t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f34091u;
    private String v;
    private String y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34082a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34083b = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f34086h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CopyOnWriteArrayList<f> f34087i = new CopyOnWriteArrayList<>();
    private boolean s = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f34092w = 0;
    private int x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f34093z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f34075A = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f34077E = 100;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f34078F = false;
    private boolean G = false;
    private int K = 1;
    private f L = new a();
    private Handler M = new b(Looper.getMainLooper());

    public class a implements f {
        public a() {
        }

        @Override // com.smartdigimkt.c3.f
        public void a(long j, int i2) {
            if (c.this.s) {
                return;
            }
            c.this.a(j, i2);
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == c.Z) {
                Object obj = message.obj;
                if (obj != null) {
                    c.this.b((String) obj);
                    return;
                }
                return;
            }
            if (i2 == 1) {
                c cVar = c.this;
                cVar.a(cVar.f34092w, c.this.f34086h);
                return;
            }
            if (i2 == 2) {
                if (c.this.f34086h != 2) {
                    c.this.f34086h = 2;
                    c cVar2 = c.this;
                    cVar2.a(cVar2.f34092w, c.this.f34086h);
                    return;
                }
                return;
            }
            if (i2 == 3) {
                if (c.this.f34086h == 4 || c.this.f34086h == 2 || c.this.f34086h == 5) {
                    return;
                }
                c.this.f34086h = 4;
                c cVar3 = c.this;
                cVar3.a(cVar3.f34092w, c.this.f34086h);
                return;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    return;
                }
                c.this.x();
            } else {
                c.this.f34086h = 5;
                c.this.f34082a = false;
                c cVar4 = c.this;
                cVar4.a(cVar4.f34092w, c.this.f34086h);
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.c3.c$c, reason: collision with other inner class name */
    public class C0449c extends com.smartdigimkt.g7.a.b {
        public C0449c() {
        }

        @Override // com.smartdigimkt.g7.a.b
        public void a(com.smartdigimkt.g7.a.C0494a c0494a) {
        }

        @Override // com.smartdigimkt.g7.a.b
        public boolean a(int i2, long j, long j2) {
            if (c.this.f34091u != j2) {
                c.this.f34091u = j2;
            }
            c cVar = c.this;
            cVar.a(j, cVar.f34086h);
            if (i2 >= c.this.f34077E) {
                c.this.w();
                c.this.u();
                return true;
            }
            if (c.this.f34086h != 2 && c.this.f34086h != 4) {
                return false;
            }
            int i3 = c.this.f34086h == 4 ? 3 : 2;
            Message messageObtain = Message.obtain();
            messageObtain.what = i3;
            c.this.M.sendMessage(messageObtain);
            return true;
        }

        @Override // com.smartdigimkt.g7.a.b
        public void a(String str, String str2) {
            c.this.c("errorCode:" + str + ",errorMsg:" + str2);
        }
    }

    public c(Context context, com.smartdigimkt.x.d dVar, ExecutorService executorService, String str) {
        this.f34084c = false;
        if (context == null && dVar == null) {
            return;
        }
        this.f34076B = System.currentTimeMillis();
        this.t = com.smartdigimkt.u.a.f().d();
        this.q = dVar;
        this.r = str;
        this.k = executorService;
        if (dVar != null) {
            this.v = dVar.u2();
        }
        this.H = com.smartdigimkt.v0.p.e(this.v);
        this.y = com.smartdigimkt.c3.a.a().a(this.v);
        this.f34084c = false;
        n();
    }

    private static void a(Context context, String str, String str2) {
    }

    private void n() {
        try {
            if (!TextUtils.isEmpty(this.v) && this.f34083b != 3) {
                c(true);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void p() {
        try {
            if (this.m == null || this.f34089n == null) {
                int i2 = com.smartdigimkt.h1.a.W0;
                this.m = com.smartdigimkt.h1.a.class;
                this.f34089n = com.smartdigimkt.h1.a.class.newInstance();
                this.m.getMethod("insertExcludeId", String.class, com.smartdigimkt.x.d.class).invoke(this.f34089n, this.r, this.q);
            }
            if (this.o == null || this.f34090p == null) {
                Class<?> cls = Class.forName("com.smartdigimkt.expressad.atnative.controller.NativeController");
                this.o = cls;
                this.f34090p = cls.newInstance();
                this.o.getMethod("insertExcludeId", String.class, com.smartdigimkt.x.d.class).invoke(this.f34090p, this.r, this.q);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void s() {
        if (this.f34078F) {
            return;
        }
        this.f34078F = true;
        com.smartdigimkt.e3.c cVar = this.C;
        if (cVar != null) {
            cVar.a(this.v);
        }
        com.smartdigimkt.e3.c cVar2 = this.D;
        if (cVar2 != null) {
            cVar2.a(this.v);
        }
    }

    public void b() {
    }

    public String g() {
        return this.f34085e;
    }

    public int h() {
        return this.f34086h;
    }

    public f i() {
        return this.L;
    }

    public String j() {
        return this.y;
    }

    public long k() {
        return this.f34091u;
    }

    public long l() {
        return this.f34092w;
    }

    public long m() {
        return this.f34076B;
    }

    public void o() {
        if (this.f34080J == null) {
            com.smartdigimkt.c3.b bVar = new com.smartdigimkt.c3.b(this.v, this.f34077E, this.K);
            this.f34080J = bVar;
            bVar.a(new C0449c());
        }
    }

    public boolean q() {
        return this.G;
    }

    public boolean r() {
        return this.f34075A;
    }

    public void t() {
        if (this.f34087i != null) {
            this.f34087i = null;
        }
    }

    public void u() {
        b(false);
    }

    public void v() {
        c(false);
        o();
        if (this.f34080J != null) {
            this.f34086h = 1;
            this.s = true;
            this.f34080J.a();
        }
    }

    public void w() {
        Message messageObtain = Message.obtain();
        this.f34086h = 5;
        messageObtain.what = 4;
        this.M.sendMessage(messageObtain);
    }

    public void x() {
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        if (this.f34086h == 5) {
            s();
            return;
        }
        if (this.f34083b == 3) {
            w();
            return;
        }
        if (this.f34077E == 0) {
            w();
            return;
        }
        c(false);
        o();
        if (this.f34080J != null) {
            this.f34086h = 1;
            this.s = true;
            this.f34080J.b();
        }
    }

    public com.smartdigimkt.x.d c() {
        return this.q;
    }

    public String d() {
        return this.v;
    }

    public void e(int i2) {
        this.K = i2;
    }

    public boolean f() {
        return this.s;
    }

    private void c(boolean z2) {
        com.smartdigimkt.p6.o oVarB;
        this.y = com.smartdigimkt.c3.a.a().a(this.v);
        File file = new File(this.y);
        if (file.length() > 0) {
            this.f34092w = file.length();
        } else {
            this.f34092w = 0L;
        }
        if (this.f34091u != 0 || (oVarB = com.smartdigimkt.p6.p.c().b(this.v)) == null) {
            return;
        }
        this.f34091u = oVarB.d();
    }

    public void d(boolean z2) {
        if (!z2) {
            this.f34084c = false;
        }
        this.G = z2;
    }

    public void e(boolean z2) {
        this.f34075A = z2;
    }

    public void f(String str) {
        p();
        this.f34086h = 4;
    }

    public void b(int i2) {
        this.f34083b = i2;
    }

    public void e(String str) {
        com.smartdigimkt.e3.c cVar = this.C;
        if (cVar != null) {
            cVar.a(str, this.v);
        }
        com.smartdigimkt.e3.c cVar2 = this.D;
        if (cVar2 != null) {
            cVar2.a(str, this.v);
        }
        this.f34086h = 4;
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        this.M.sendMessage(messageObtain);
    }

    public void b(com.smartdigimkt.e3.c cVar) {
        this.D = cVar;
    }

    public void d(int i2) {
        this.f34077E = i2;
    }

    public void b(f fVar) {
        this.j = fVar;
    }

    public void d(String str) {
        this.f34085e = str;
    }

    public void b(boolean z2) {
        if (z2) {
            if (this.f34084c) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = Z;
            messageObtain.obj = a(z2);
            this.M.sendMessage(messageObtain);
            this.f34084c = true;
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = Z;
        messageObtain2.obj = a(z2);
        this.M.sendMessage(messageObtain2);
    }

    public void a(int i2) {
        this.d = i2;
    }

    public double a(double d, double d2, int i2) throws IllegalAccessException {
        if (i2 >= 0) {
            return new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i2, 4).doubleValue();
        }
        throw new IllegalAccessException("Accuracy cannot be less than 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.x++;
        try {
            Context context = this.t;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null && !connectivityManager.getActiveNetworkInfo().isAvailable()) {
                    return;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.x <= 1) {
            this.M.sendEmptyMessageDelayed(5, 2000L);
        } else {
            p();
            e(str);
        }
    }

    public String e() {
        if (this.f34083b == 3) {
            return "";
        }
        File file = new File(this.y);
        try {
            if (file.length() > 0) {
                if (file.canRead()) {
                    return file.length() > 0 ? "" : "file length is 0 ";
                }
                return "file can not read ";
            }
            return "file is not exist ";
        } catch (Throwable th) {
            String message = th.getMessage();
            if (com.smartdigimkt.b.b.f33800a) {
                th.printStackTrace();
            }
            return message;
        }
    }

    public void a(int i2, int i3) {
        this.f34086h = i2;
    }

    public void a(com.smartdigimkt.x.d dVar) {
        this.q = dVar;
    }

    public void a(com.smartdigimkt.e3.c cVar) {
        this.C = cVar;
    }

    public void a(f fVar) {
        CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f34087i;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, int i2) {
        this.f34092w = j;
        p pVar = this.f34088l;
        if (pVar != null) {
            pVar.a(j, i2);
        }
        int i3 = this.f34077E;
        if (100 * j >= ((long) i3) * this.f34091u && !this.f34078F && i2 != 4) {
            if (i3 == 100 && i2 != 5) {
                this.f34086h = 5;
                return;
            }
            s();
        }
        if (this.s) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f34087i;
            if (copyOnWriteArrayList != null) {
                for (f fVar : copyOnWriteArrayList) {
                    if (fVar != null) {
                        fVar.a(j, i2);
                    }
                }
            }
            if (this.j != null) {
                if (this.f34086h == 5 || this.f34086h == 4 || this.f34086h == 2 || this.f34086h == 6) {
                    this.j.a(j, i2);
                    this.j = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        a(com.smartdigimkt.u.a.f().d(), str, this.r);
    }

    public void c(int i2) {
        this.f34081N = i2;
    }

    private String a(boolean z2) {
        if (this.q != null && !TextUtils.isEmpty(this.r) && !TextUtils.isEmpty(this.q.N1()) && !TextUtils.isEmpty(this.q.u2())) {
            StringBuilder sb = new StringBuilder("key=2000077&unit_id=");
            sb.append(this.r);
            sb.append("&request_id=");
            sb.append(this.q.N1());
            sb.append("&request_id_notice=");
            sb.append(this.q.O1());
            sb.append("&package_name=");
            sb.append(com.smartdigimkt.u.a.f().g());
            sb.append("&app_id=");
            sb.append(com.smartdigimkt.u.a.f().a());
            sb.append("&video_url=");
            sb.append(URLEncoder.encode(this.q.u2()));
            sb.append("&process_size=");
            sb.append(z2 ? this.f34091u : this.f34092w);
            sb.append("&file_size=");
            sb.append(this.f34091u);
            sb.append("&ready_rate=");
            sb.append(this.f34077E);
            sb.append("&cd_rate=");
            sb.append(this.d);
            sb.append("&cid=");
            sb.append(this.q.j());
            sb.append("&type=");
            sb.append(this.f34086h);
            return sb.toString();
        }
        return "";
    }
}
