package com.p004ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.p004ironsource.C3367l0;
import com.p004ironsource.aa;
import com.p004ironsource.af;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.p004ironsource.g9;
import com.p004ironsource.gb;
import com.p004ironsource.hs;
import com.p004ironsource.mh;
import com.p004ironsource.nh;
import com.p004ironsource.oh;
import com.p004ironsource.on;
import com.p004ironsource.pg;
import com.p004ironsource.q3;
import com.p004ironsource.q9;
import com.p004ironsource.qn;
import com.p004ironsource.rn;
import com.p004ironsource.ro;
import com.p004ironsource.s8;
import com.p004ironsource.sdk.IronSourceNetwork;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sx;
import com.p004ironsource.th;
import com.p004ironsource.uh;
import com.p004ironsource.v9;
import com.p004ironsource.va;
import com.p004ironsource.w9;
import com.p004ironsource.wa;
import com.p004ironsource.wc;
import com.p004ironsource.x9;
import com.p004ironsource.xc;
import com.p004ironsource.ye;
import com.p004ironsource.z9;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e implements com.p004ironsource.sdk.controller.c, com.p004ironsource.sdk.controller.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.p004ironsource.sdk.controller.l f26863b;
    private CountDownTimer d;
    private final pg g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sx f26866h;
    private final ro k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26862a = "e";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mh.b f26864c = mh.b.None;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s8 f26865e = new s8("NativeCommandExecutor");
    private final s8 f = new s8("ControllerCommandsExecutor");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.controller.l.a> f26867i = new HashMap();
    private final Map<String, com.ironsource.sdk.controller.l.b> j = new HashMap();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f26868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w9 f26869b;

        public a(JSONObject jSONObject, w9 w9Var) {
            this.f26868a = jSONObject;
            this.f26869b = w9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26868a, this.f26869b);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f26871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f26872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w9 f26873c;

        public b(va vaVar, Map map, w9 w9Var) {
            this.f26871a = vaVar;
            this.f26872b = map;
            this.f26873c = w9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26871a, this.f26872b, this.f26873c);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f26876c;
        final /* synthetic */ v9 d;

        public c(String str, String str2, va vaVar, v9 v9Var) {
            this.f26874a = str;
            this.f26875b = str2;
            this.f26876c = vaVar;
            this.d = v9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26874a, this.f26875b, this.f26876c, this.d);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f26878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v9 f26879b;

        public d(JSONObject jSONObject, v9 v9Var) {
            this.f26878a = jSONObject;
            this.f26879b = v9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26878a, this.f26879b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    public class RunnableC0294e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f26881a;

        public RunnableC0294e(va vaVar) {
            this.f26881a = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26881a);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f26883a;

        public f(va vaVar) {
            this.f26883a = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.b(this.f26883a);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f26885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f26886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v9 f26887c;

        public g(va vaVar, Map map, v9 v9Var) {
            this.f26885a = vaVar;
            this.f26886b = map;
            this.f26887c = v9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26885a, this.f26886b, this.f26887c);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.l.a f26888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.f.c f26889b;

        public h(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f26888a = aVar;
            this.f26889b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                if (this.f26888a != null) {
                    e.this.f26867i.put(this.f26889b.getCom.ironsource.sdk.controller.f.b.b java.lang.String(), this.f26888a);
                }
                e.this.f26863b.a(this.f26889b, this.f26888a);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f26891a;

        public i(JSONObject jSONObject) {
            this.f26891a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.b(this.f26891a);
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.destroy();
                e.this.f26863b = null;
            }
        }
    }

    public class k extends CountDownTimer {
        public k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f26862a, "Global Controller Timer Finish");
            e.this.d(d9.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(e.this.f26862a, "Global Controller Timer Tick " + j);
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.c();
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26897b;

        public m(String str, String str2) {
            this.f26896a = str;
            this.f26897b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.f26863b = eVar.b(eVar.f26866h.b(), e.this.f26866h.d(), e.this.f26866h.f(), e.this.f26866h.e(), e.this.f26866h.g(), e.this.f26866h.c(), this.f26896a, this.f26897b);
                e.this.f26863b.a();
            } catch (Throwable th) {
                q9.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    public class n extends CountDownTimer {
        public n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f26862a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(d9.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(e.this.f26862a, "Recovered Controller | Global Controller Timer Tick " + j);
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f26902c;
        final /* synthetic */ x9 d;

        public o(String str, String str2, va vaVar, x9 x9Var) {
            this.f26900a = str;
            this.f26901b = str2;
            this.f26902c = vaVar;
            this.d = x9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26900a, this.f26901b, this.f26902c, this.d);
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f26904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x9 f26905b;

        public p(JSONObject jSONObject, x9 x9Var) {
            this.f26904a = jSONObject;
            this.f26905b = x9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26904a, this.f26905b);
            }
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f26909c;
        final /* synthetic */ w9 d;

        public q(String str, String str2, va vaVar, w9 w9Var) {
            this.f26907a = str;
            this.f26908b = str2;
            this.f26909c = vaVar;
            this.d = w9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26907a, this.f26908b, this.f26909c, this.d);
            }
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w9 f26912b;

        public r(String str, w9 w9Var) {
            this.f26911a = str;
            this.f26912b = w9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f26863b != null) {
                e.this.f26863b.a(this.f26911a, this.f26912b);
            }
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f26914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f26915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w9 f26916c;

        public s(va vaVar, Map map, w9 w9Var) {
            this.f26914a = vaVar;
            this.f26915b = map;
            this.f26916c = w9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            th.a(hs.j, new oh().a(dc.v, this.f26914a.f()).a(dc.f24790w, uh.a(this.f26914a, mh.e.Interstitial)).a(dc.x, Boolean.valueOf(uh.a(this.f26914a))).a(dc.f24773I, Long.valueOf(C3367l0.f25553a.b(this.f26914a.h()))).a());
            if (e.this.f26863b != null) {
                e.this.f26863b.b(this.f26914a, this.f26915b, this.f26916c);
            }
        }
    }

    public e(Context context, g9 g9Var, wa waVar, pg pgVar, int i2, JSONObject jSONObject, String str, String str2, ro roVar) {
        this.k = roVar;
        this.g = pgVar;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        gb gbVarA = gb.a(networkStorageDir, pgVar, jSONObject);
        this.f26866h = new sx(context, g9Var, waVar, i2, gbVarA, networkStorageDir);
        a(context, g9Var, waVar, i2, gbVarA, networkStorageDir, str, str2);
    }

    private com.ironsource.sdk.controller.l.a h() {
        return new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.sdk.controller.y
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                this.f27152a.a(aVar);
            }
        };
    }

    private com.ironsource.sdk.controller.l.b i() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.sdk.controller.x
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(qn qnVar) {
                this.f27151a.a(qnVar);
            }
        };
    }

    private void k() {
        Logger.i(this.f26862a, "handleReadyState");
        this.f26864c = mh.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m();
        this.f.c();
        this.f.a();
        com.p004ironsource.sdk.controller.l lVar = this.f26863b;
        if (lVar != null) {
            lVar.e();
        }
    }

    private boolean l() {
        return mh.b.Ready.equals(this.f26864c);
    }

    private void m() {
        this.f26866h.a(true);
        com.p004ironsource.sdk.controller.l lVar = this.f26863b;
        if (lVar != null) {
            lVar.a(this.f26866h.i());
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void destroy() {
        Logger.i(this.f26862a, "destroy controller");
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        s8 s8Var = this.f;
        if (s8Var != null) {
            s8Var.b();
        }
        this.d = null;
        b(new j());
    }

    @Override // com.p004ironsource.sdk.controller.l
    @Deprecated
    public void e() {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void f() {
        com.p004ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f26863b) == null) {
            return;
        }
        lVar.f();
    }

    @Override // com.p004ironsource.sdk.controller.l
    public mh.c g() {
        com.p004ironsource.sdk.controller.l lVar = this.f26863b;
        return lVar != null ? lVar.g() : mh.c.None;
    }

    public com.p004ironsource.sdk.controller.l j() {
        return this.f26863b;
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new nh(1001, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, g9 g9Var, wa waVar, int i2, gb gbVar, String str, String str2, String str3) throws Throwable {
        th.a(hs.f25276c);
        v vVar = new v(context, waVar, g9Var, this, this.g, i2, gbVar, str, h(), i(), str2, str3);
        xc xcVar = new xc(context, gbVar, new wc(this.g.a()), new rn(gbVar.a()));
        vVar.a(new u(context));
        vVar.a(new com.p004ironsource.sdk.controller.o(context));
        vVar.a(new com.p004ironsource.sdk.controller.q(context));
        vVar.a(new com.p004ironsource.sdk.controller.i(context));
        vVar.a(new com.p004ironsource.sdk.controller.a(context));
        vVar.a(new com.p004ironsource.sdk.controller.j(gbVar.a(), xcVar));
        vVar.a(new q3());
        vVar.a(new aa(context, new z9()));
        return vVar;
    }

    @Override // com.p004ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f26862a, "handleControllerReady ");
        this.k.a(g());
        if (mh.c.Web.equals(g())) {
            th.a(hs.f25277e, new oh().a(dc.y, String.valueOf(this.f26866h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        k();
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void d() {
        com.p004ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f26863b) == null) {
            return;
        }
        lVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, g9 g9Var, wa waVar, int i2, gb gbVar, String str, String str2, String str3) {
        try {
            v vVarB = b(context, g9Var, waVar, i2, gbVar, str, str2, str3);
            try {
                this.f26863b = vVarB;
                vVarB.a();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                q9.d().a(th2);
                d(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        th.a(hs.d, new oh().a(dc.f24769A, str).a());
        this.f26864c = mh.b.Loading;
        this.f26863b = new com.p004ironsource.sdk.controller.n(str, this.g);
        this.f26865e.c();
        this.f26865e.a();
        pg pgVar = this.g;
        if (pgVar != null) {
            pgVar.c(new l());
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.p004ironsource.sdk.controller.c
    public void b() {
        Logger.i(this.f26862a, "handleControllerLoaded");
        this.f26864c = mh.b.Loaded;
        this.f26865e.c();
        this.f26865e.a();
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f26863b.a(activity);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(Context context) {
        com.p004ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f26863b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.p004ironsource.sdk.controller.c
    public void c(String str) {
        th.a(hs.y, new oh().a(dc.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(Context context) {
        com.p004ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f26863b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(va vaVar) {
        this.f.a(new f(vaVar));
    }

    private void a(final Context context, final g9 g9Var, final wa waVar, final int i2, final gb gbVar, final String str, final String str2, final String str3) {
        int iC = on.U().d().c();
        if (iC > 0) {
            th.a(hs.f25273B, new oh().a(dc.y, String.valueOf(iC)).a());
        }
        a(new Runnable() { // from class: com.ironsource.sdk.controller.w
            @Override // java.lang.Runnable
            public final void run() {
                this.X.c(context, g9Var, waVar, i2, gbVar, str, str2, str3);
            }
        }, iC);
        this.d = new k(200000L, 1000L).start();
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, w9 w9Var) {
        this.f.a(new s(vaVar, map, w9Var));
    }

    private void a(mh.e eVar, va vaVar, String str, String str2) {
        Logger.i(this.f26862a, "recoverWebController for product: " + eVar.toString());
        oh ohVar = new oh();
        ohVar.a(dc.f24790w, eVar.toString());
        ohVar.a(dc.v, vaVar.f());
        th.a(hs.f25275b, ohVar.a());
        this.f26866h.n();
        destroy();
        b(new m(str, str2));
        this.d = new n(200000L, 1000L).start();
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(qn qnVar) {
        com.ironsource.sdk.controller.l.b bVar = this.j.get(qnVar.d());
        if (bVar != null) {
            bVar.a(qnVar);
        }
    }

    @Override // com.p004ironsource.sdk.controller.c
    public void b(String str) {
        Logger.i(this.f26862a, "handleControllerFailed ");
        oh ohVar = new oh();
        ohVar.a(dc.f24769A, str);
        ohVar.a(dc.y, String.valueOf(this.f26866h.l()));
        th.a(hs.o, ohVar.a());
        this.f26866h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.f26862a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f.a(new i(jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.sdk.controller.f.a aVar) {
        com.ironsource.sdk.controller.l.a aVarRemove = this.f26867i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        this.f.a(new h(aVar, cVar));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar) {
        this.f.a(new RunnableC0294e(vaVar));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, v9 v9Var) {
        this.f.a(new g(vaVar, map, v9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, w9 w9Var) {
        this.f.a(new b(vaVar, map, w9Var));
    }

    @Override // com.p004ironsource.cf
    public void a(ye yeVar) {
        hs.a aVar;
        oh ohVar;
        StringBuilder sb;
        af afVar = yeVar.getCom.smartdigimkt.m6.a.r.A java.lang.String();
        if (afVar == af.SendEvent) {
            aVar = hs.f25272A;
            ohVar = new oh();
            sb = new StringBuilder();
        } else {
            if (afVar != af.NativeController) {
                return;
            }
            com.p004ironsource.sdk.controller.n nVar = new com.p004ironsource.sdk.controller.n(yeVar.a(), this.g);
            this.f26863b = nVar;
            this.k.a(nVar.g());
            th.a(hs.d, new oh().a(dc.f24769A, yeVar.a() + " : strategy: " + afVar).a());
            aVar = hs.f25272A;
            ohVar = new oh();
            sb = new StringBuilder();
        }
        sb.append(yeVar.a());
        sb.append(" : strategy: ");
        sb.append(afVar);
        th.a(aVar, ohVar.a(dc.y, sb.toString()).a());
    }

    public void a(Runnable runnable) {
        this.f26865e.a(runnable);
    }

    private void a(Runnable runnable, long j2) {
        pg pgVar = this.g;
        if (pgVar != null) {
            pgVar.d(runnable, j2);
        } else {
            Logger.e(this.f26862a, "mThreadManager = null");
        }
    }

    public void a(String str, com.ironsource.sdk.controller.l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, w9 w9Var) {
        Logger.i(this.f26862a, "load interstitial");
        this.f.a(new r(str, w9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        if (this.f26866h.a(g(), this.f26864c)) {
            a(mh.e.Banner, vaVar, str, str2);
        }
        this.f.a(new c(str, str2, vaVar, v9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, w9 w9Var) {
        if (this.f26866h.a(g(), this.f26864c)) {
            a(mh.e.Interstitial, vaVar, str, str2);
        }
        this.f.a(new q(str, str2, vaVar, w9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, x9 x9Var) {
        if (this.f26866h.a(g(), this.f26864c)) {
            a(mh.e.RewardedVideo, vaVar, str, str2);
        }
        this.f.a(new o(str, str2, vaVar, x9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        this.f.a(new d(jSONObject, v9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, w9 w9Var) {
        this.f.a(new a(jSONObject, w9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, x9 x9Var) {
        this.f.a(new p(jSONObject, x9Var));
    }

    @Override // com.p004ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f26863b == null || !l()) {
            return false;
        }
        return this.f26863b.a(str);
    }
}
