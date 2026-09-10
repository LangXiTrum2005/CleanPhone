package com.smartdigimkt.t1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.expressad.splash.view.ATSplashView;
import com.smartdigimkt.v0.l;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.z;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    private static String C = "SplashLoadManager";
    private static final int D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int f38629E = 2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f38630F = 3;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    com.smartdigimkt.x.d f38632B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38635c;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.u1.b f38636e;
    private ATSplashView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.smartdigimkt.n1.c f38637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38638i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38639l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38640n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f38641p;
    private com.smartdigimkt.e3.c q;
    private i.e r;
    private String s;
    private int t;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<com.smartdigimkt.x.d> f38643w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f38642u = "";
    private String x = "";
    private Handler y = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f38644z = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f38631A = false;
    private Context f = com.smartdigimkt.m6.b.p().k();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2;
            super.handleMessage(message);
            int i3 = message.what;
            if (i3 == 1) {
                Object obj = message.obj;
                int i4 = message.arg1;
                if (obj instanceof com.smartdigimkt.x.d) {
                    com.smartdigimkt.x.d dVar = (com.smartdigimkt.x.d) obj;
                    e.this.a(i.a().c(dVar.U()), dVar, i4);
                    return;
                }
                return;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof com.smartdigimkt.x.d) {
                    e eVar = e.this;
                    eVar.h((com.smartdigimkt.x.d) obj2, eVar.f38640n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i5 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString("msg");
                    com.smartdigimkt.x.d dVar2 = (com.smartdigimkt.x.d) ((Bundle) obj3).getSerializable("campaignex");
                    if (i5 == 1) {
                        i2 = com.smartdigimkt.y.b.f39996e;
                    } else {
                        i2 = i5 == 2 ? com.smartdigimkt.y.b.g : com.smartdigimkt.y.b.f39977A;
                    }
                    com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(i2);
                    cVar.f(string);
                    e eVar2 = e.this;
                    eVar2.a(cVar, eVar2.m, e.this.f38640n, dVar2);
                }
            } catch (Exception e2) {
                com.smartdigimkt.y.c cVar2 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.x);
                cVar2.a((Throwable) e2);
                e eVar3 = e.this;
                eVar3.a(cVar2, eVar3.m, e.this.f38640n, (com.smartdigimkt.x.d) null);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.k);
            e eVar = e.this;
            eVar.a(cVar, eVar.m, e.this.f38640n, (com.smartdigimkt.x.d) null);
        }
    }

    public class c implements com.smartdigimkt.v1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f38646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38647b;

        public c(com.smartdigimkt.x.d dVar, int i2) {
            this.f38646a = dVar;
            this.f38647b = i2;
        }

        @Override // com.smartdigimkt.v1.a
        public void a() {
            if (this.f38646a.H2() && e.this.g != null) {
                e.this.g.setImageReady(true);
                e.this.f(this.f38646a, this.f38647b);
            }
            e.this.h(this.f38646a, this.f38647b);
        }

        @Override // com.smartdigimkt.v1.a
        public void b() {
            if (!this.f38646a.H2() || e.this.g == null) {
                return;
            }
            e.this.g.setImageReady(false);
            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f39977A);
            e eVar = e.this;
            eVar.a(cVar, eVar.m, this.f38647b, this.f38646a);
        }
    }

    public class d implements Runnable {
        final /* synthetic */ com.smartdigimkt.x.d X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f38649Y;

        public class a implements Runnable {
            final /* synthetic */ File X;

            public a(File file) {
                this.X = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                String str = "file:////" + this.X.getAbsolutePath();
                d dVar = d.this;
                eVar.a(str, dVar.X, dVar.f38649Y);
            }
        }

        public d(com.smartdigimkt.x.d dVar, int i2) {
            this.X = dVar;
            this.f38649Y = i2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            FileOutputStream fileOutputStream;
            File file;
            File file2;
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        file2 = new File(this.X.Q());
                        try {
                            if (!file2.exists()) {
                                String strB = com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_700_HTML);
                                String strA = s.a(z.b(this.X.Q()));
                                if (TextUtils.isEmpty(strA)) {
                                    strA = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(strB, strA.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            fileOutputStream.write(("<script>" + com.smartdigimkt.j5.b.a().b() + "</script>" + this.X.Q()).getBytes());
                                            fileOutputStream.flush();
                                            fileOutputStream2 = fileOutputStream;
                                        } catch (Exception e2) {
                                            e = e2;
                                            fileOutputStream2 = fileOutputStream;
                                            e.printStackTrace();
                                            this.X.e0("");
                                            file2 = file;
                                            if (fileOutputStream2 != null) {
                                            }
                                            if (!file2.exists()) {
                                            }
                                            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.m);
                                            e eVar = e.this;
                                            eVar.a(cVar, eVar.m, this.f38649Y, this.X);
                                        } catch (Throwable th) {
                                            th = th;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    file2 = file;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            file = file2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    file = null;
                }
                if (!file2.exists() && file2.isFile() && file2.canRead()) {
                    this.X.x(file2.getAbsolutePath());
                    com.smartdigimkt.l7.b.a().e(new a(file2));
                } else {
                    com.smartdigimkt.y.c cVar2 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.m);
                    e eVar2 = e.this;
                    eVar2.a(cVar2, eVar2.m, this.f38649Y, this.X);
                }
            } catch (Exception unused) {
                com.smartdigimkt.y.c cVar3 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.m);
                e eVar3 = e.this;
                eVar3.a(cVar3, eVar3.m, this.f38649Y, this.X);
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.t1.e$e, reason: collision with other inner class name */
    public class C0616e implements i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f38651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38652b;

        public C0616e(com.smartdigimkt.x.d dVar, int i2) {
            this.f38651a = dVar;
            this.f38652b = i2;
        }

        @Override // com.smartdigimkt.c3.i.b
        public void a(String str, String str2, boolean z2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f38651a;
            messageObtain.arg1 = this.f38652b;
            e.this.y.sendMessage(messageObtain);
        }

        @Override // com.smartdigimkt.c3.i.b
        public void b(String str, String str2) {
            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.g);
            e eVar = e.this;
            eVar.a(cVar, eVar.m, this.f38652b, this.f38651a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f38651a);
            bundle.putString("msg", str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.y.sendMessage(messageObtain);
        }
    }

    public e(String str, String str2, long j) {
        this.f38634b = str;
        this.f38633a = str2;
        this.d = j;
    }

    private void a(Context context, String str, int i2) {
    }

    private void i() {
        this.t = 0;
    }

    private void j() {
        try {
            int i2 = this.t + 1;
            this.t = i2;
            com.smartdigimkt.n1.c cVar = this.f38637h;
            if (cVar != null && i2 <= cVar.A()) {
                return;
            }
            this.t = 0;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public com.smartdigimkt.x.d e() {
        return this.f38632B;
    }

    public String f() {
        return this.f38642u;
    }

    public boolean g() {
        return this.f38638i;
    }

    public void h() {
        if (this.f38636e != null) {
            this.f38636e = null;
        }
        if (this.q != null) {
            this.q = null;
        }
        if (this.r != null) {
            this.r = null;
        }
    }

    public class g implements com.smartdigimkt.t1.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f38657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38658b;

        public g(com.smartdigimkt.x.d dVar, int i2) {
            this.f38657a = dVar;
            this.f38658b = i2;
        }

        @Override // com.smartdigimkt.t1.g.c
        public void a() {
            if (this.f38657a.I2()) {
                return;
            }
            e.this.g(this.f38657a, this.f38658b);
        }

        @Override // com.smartdigimkt.t1.g.c
        public void a(String str) {
            e.this.a(str, this.f38658b, this.f38657a);
        }

        @Override // com.smartdigimkt.t1.g.c
        public void a(int i2) {
            if (i2 == 1) {
                e.this.g(this.f38657a, this.f38658b);
            } else {
                e.this.a("readyState 2", this.f38658b, this.f38657a);
            }
        }
    }

    private void a(com.smartdigimkt.x.d dVar) {
    }

    private void e(com.smartdigimkt.x.d dVar, int i2) {
        if (dVar.H2()) {
            return;
        }
        this.r = new C0616e(dVar, i2);
        com.smartdigimkt.q0.e eVar = new com.smartdigimkt.q0.e();
        eVar.a(com.smartdigimkt.b0.a.Z0);
        eVar.b(2);
        eVar.a(dVar);
        eVar.c(dVar.O() != null ? dVar.O().f39646a : 0);
        i.a().b(dVar.U(), (i.b) this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(com.smartdigimkt.x.d dVar, int i2) {
        if (dVar.H2()) {
            com.smartdigimkt.q1.b.a aVar = new com.smartdigimkt.q1.b.a();
            aVar.c(this.f38633a).b(this.f38634b).a(this.f38638i).a(dVar).c(this.j).f(this.v);
            try {
                if (!TextUtils.isEmpty(dVar.U())) {
                    Uri uri = Uri.parse(dVar.U());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            com.smartdigimkt.t1.c.a().a(this.g, aVar.a(), new f(dVar, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(com.smartdigimkt.x.d dVar, int i2) {
        if (this.g.isH5Ready()) {
            return;
        }
        this.g.setH5Ready(true);
        h(dVar, i2);
    }

    private void i(com.smartdigimkt.x.d dVar, int i2) {
        ATSplashView aTSplashView = this.g;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (dVar.H2()) {
            c(dVar, i2);
        } else {
            ATSplashView aTSplashView2 = this.g;
            if (aTSplashView2 != null) {
                aTSplashView2.setSplashWebview();
            }
        }
        if (com.smartdigimkt.t1.d.a(this.g, dVar)) {
            h(dVar, i2);
        } else {
            a(dVar, i2);
        }
    }

    public String d() {
        return l.a(this.f38643w);
    }

    private void a(String str, int i2, String str2) {
    }

    private void d(com.smartdigimkt.x.d dVar, int i2) {
        com.smartdigimkt.l7.b.a().g(new d(dVar, i2));
    }

    public void b(int i2) {
        this.v = i2;
    }

    public int c() {
        return this.j;
    }

    public class f implements com.smartdigimkt.s1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f38654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38655b;

        public f(com.smartdigimkt.x.d dVar, int i2) {
            this.f38654a = dVar;
            this.f38655b = i2;
        }

        @Override // com.smartdigimkt.s1.a
        public void a(View view) {
            if (e.this.g != null) {
                e.this.g.setDynamicView(true);
                e.this.g.setSplashNativeView(view);
                e.this.h(this.f38654a, this.f38655b);
            }
        }

        @Override // com.smartdigimkt.s1.a
        public void a(String str) {
            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.H);
            cVar.f(str);
            e eVar = e.this;
            eVar.a(cVar, eVar.m, this.f38655b, this.f38654a);
        }
    }

    private void c(com.smartdigimkt.x.d dVar, int i2) {
        com.smartdigimkt.t1.d.a(this.g, dVar, new c(dVar, i2));
    }

    public void b(boolean z2) {
        this.f38631A = z2;
    }

    private void b() {
        this.y.removeCallbacks(this.f38644z);
    }

    public class h implements com.smartdigimkt.e3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f38660a;

        public h(com.smartdigimkt.x.d dVar) {
            this.f38660a = dVar;
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str) {
            e.this.g.setVideoReady(true);
            String unused = e.C;
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f38660a;
            messageObtain.what = 3;
            e.this.y.sendMessage(messageObtain);
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str, String str2) {
            e.this.g.setVideoReady(false);
            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f39996e);
            cVar.f(str);
            e eVar = e.this;
            eVar.a(cVar, eVar.m, e.this.f38640n, this.f38660a);
            String unused = e.C;
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f38660a);
            bundle.putString("msg", str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.y.sendMessage(messageObtain);
        }
    }

    private void b(com.smartdigimkt.x.d dVar, int i2) {
        this.q = new h(dVar);
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(dVar);
        com.smartdigimkt.c3.e.a().a(this.f, this.f38633a, copyOnWriteArrayList, com.smartdigimkt.b0.a.Z0, this.q);
        if (!com.smartdigimkt.c3.e.a().b(com.smartdigimkt.b0.a.Z0, this.f38633a, dVar.D2())) {
            com.smartdigimkt.c3.e.a().f(this.f38633a);
        } else {
            this.g.setVideoReady(true);
            h(dVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(com.smartdigimkt.x.d dVar, int i2) {
        if (!com.smartdigimkt.t1.d.a(this.g, dVar) || this.f38641p) {
            return;
        }
        b();
        this.f38632B = dVar;
        this.f38641p = true;
        com.smartdigimkt.u1.b bVar = this.f38636e;
        if (bVar != null) {
            bVar.a(dVar, i2);
        }
    }

    public void a(com.smartdigimkt.n1.c cVar) {
        this.f38637h = cVar;
    }

    public void a(ATSplashView aTSplashView) {
        this.g = aTSplashView;
    }

    public void a(boolean z2) {
        this.f38638i = z2;
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void a(int i2, int i3) {
        this.f38639l = i2;
        this.k = i3;
    }

    public void a(com.smartdigimkt.x.e eVar, int i2) {
        this.f38641p = false;
        this.m = "";
        this.f38640n = i2;
        a(eVar, i2, this.f38633a, "");
    }

    private void a(long j) {
        this.y.postDelayed(this.f38644z, j);
    }

    private void a(com.smartdigimkt.x.e eVar, int i2, String str, String str2) {
        com.smartdigimkt.y.c cVar;
        List<com.smartdigimkt.x.d> listA = a(eVar);
        if (listA != null && listA.size() > 0) {
            j();
            listA.size();
            com.smartdigimkt.x.d dVar = listA.get(0);
            if (TextUtils.isEmpty(dVar.U()) && (TextUtils.isEmpty(dVar.Q()) || !dVar.Q().contains("<MBTPLMARK>"))) {
                dVar.h(false);
                dVar.k(true);
            } else {
                dVar.h(true);
                dVar.k(false);
            }
            i(dVar, i2);
            return;
        }
        if (this.x.contains("INSTALLED")) {
            cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f40002u, com.smartdigimkt.g1.d.f35347U);
        } else {
            cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.d);
        }
        a(cVar, str2, i2, (eVar == null || eVar.f() == null || eVar.f().size() == 0) ? null : eVar.f().get(0));
    }

    private List<com.smartdigimkt.x.d> a(com.smartdigimkt.x.e eVar) {
        if (eVar == null || eVar.f() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.smartdigimkt.x.d dVar = eVar.f().get(0);
        dVar.G(this.f38633a);
        a(dVar);
        this.s = eVar.A();
        if (dVar.w1() != 99 && (!TextUtils.isEmpty(dVar.U()) || !TextUtils.isEmpty(dVar.Q()))) {
            if (v.b(dVar)) {
                dVar.h0(v.a(this.f, dVar.n()) ? 1 : 2);
            }
            if (l.a(this.f, dVar)) {
                arrayList.add(dVar);
                return arrayList;
            }
            this.x = com.smartdigimkt.g1.d.f35347U;
        }
        return arrayList;
    }

    public void a(com.smartdigimkt.u1.b bVar) {
        this.f38636e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.y.c cVar, String str, int i2, com.smartdigimkt.x.d dVar) {
        if (this.o) {
            this.o = false;
        } else {
            a(cVar, i2, dVar);
        }
    }

    private void a(com.smartdigimkt.y.c cVar, int i2, com.smartdigimkt.x.d dVar) {
        if (this.f38641p) {
            return;
        }
        b();
        this.f38641p = true;
        if (cVar != null) {
            cVar.a(dVar);
        }
        com.smartdigimkt.u1.b bVar = this.f38636e;
        if (bVar != null) {
            bVar.a(cVar, i2);
        }
    }

    private void a(com.smartdigimkt.x.d dVar, int i2) {
        this.g.clearResState();
        if (!TextUtils.isEmpty(dVar.U())) {
            e(dVar, i2);
        }
        if (dVar.H2()) {
            return;
        }
        if (!TextUtils.isEmpty(dVar.Q())) {
            d(dVar, i2);
        }
        if (!TextUtils.isEmpty(dVar.u2())) {
            b(dVar, i2);
        }
        if (TextUtils.isEmpty(dVar.k())) {
            return;
        }
        c(dVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.smartdigimkt.x.d dVar, int i2) {
        com.smartdigimkt.t1.g.d dVar2 = new com.smartdigimkt.t1.g.d();
        dVar2.c(this.f38633a);
        dVar2.b(this.f38634b);
        dVar2.a(dVar);
        dVar2.a(str);
        dVar2.a(this.f38638i);
        dVar2.a(this.j);
        dVar2.b(this.f38631A);
        com.smartdigimkt.t1.g.a().a(this.g, dVar2, new g(dVar, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2, com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.j);
        cVar.f(str);
        a(cVar, this.m, i2, dVar);
    }
}
