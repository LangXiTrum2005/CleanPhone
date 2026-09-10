package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.B5;
import com.ironsource.C0241a4;
import com.ironsource.C0314e5;
import com.ironsource.C0377he;
import com.ironsource.C0474n4;
import com.ironsource.C0500oc;
import com.ironsource.C0514p8;
import com.ironsource.C0532q8;
import com.ironsource.C0549r8;
import com.ironsource.C0596u1;
import com.ironsource.C0635w4;
import com.ironsource.C0639w8;
import com.ironsource.C0653x4;
import com.ironsource.C0657x8;
import com.ironsource.EnumC0244a7;
import com.ironsource.InterfaceC0563s4;
import com.ironsource.InterfaceC0581t4;
import com.ironsource.InterfaceC0599u4;
import com.ironsource.Kb;
import com.ironsource.L3;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.Ob;
import com.ironsource.R7;
import com.ironsource.T4;
import com.ironsource.U4;
import com.ironsource.W5;
import com.ironsource.X3;
import com.ironsource.X5;
import com.ironsource.Y6;
import com.ironsource.ai;
import com.ironsource.fh;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.zh;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.ironsource.sdk.controller.l f30318b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CountDownTimer f30320d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final R7 f30323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fh f30324h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0500oc f30327k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30317a = "e";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0514p8.b f30319c = C0514p8.b.None;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L3 f30321e = new L3("NativeCommandExecutor");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L3 f30322f = new L3("ControllerCommandsExecutor");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.controller.l.a> f30325i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.controller.l.b> f30326j = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f30328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30329b;

        public a(JSONObject jSONObject, InterfaceC0581t4 interfaceC0581t4) {
            this.f30328a = jSONObject;
            this.f30329b = interfaceC0581t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30328a, this.f30329b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T4 f30331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f30332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30333c;

        public b(T4 t10, Map map, InterfaceC0581t4 interfaceC0581t4) {
            this.f30331a = t10;
            this.f30332b = map;
            this.f30333c = interfaceC0581t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30331a, this.f30332b, this.f30333c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T4 f30337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC0563s4 f30338d;

        public c(String str, String str2, T4 t10, InterfaceC0563s4 interfaceC0563s4) {
            this.f30335a = str;
            this.f30336b = str2;
            this.f30337c = t10;
            this.f30338d = interfaceC0563s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30335a, this.f30336b, this.f30337c, this.f30338d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f30340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0563s4 f30341b;

        public d(JSONObject jSONObject, InterfaceC0563s4 interfaceC0563s4) {
            this.f30340a = jSONObject;
            this.f30341b = interfaceC0563s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30340a, this.f30341b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0084e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T4 f30343a;

        public RunnableC0084e(T4 t10) {
            this.f30343a = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30343a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T4 f30345a;

        public f(T4 t10) {
            this.f30345a = t10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.b(this.f30345a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T4 f30347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f30348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0563s4 f30349c;

        public g(T4 t10, Map map, InterfaceC0563s4 interfaceC0563s4) {
            this.f30347a = t10;
            this.f30348b = map;
            this.f30349c = interfaceC0563s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30347a, this.f30348b, this.f30349c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.l.a f30351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.f.c f30352b;

        public h(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f30351a = aVar;
            this.f30352b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.f30318b != null) {
                if (this.f30351a != null) {
                    eVar.f30325i.put(this.f30352b.f(), this.f30351a);
                }
                e.this.f30318b.a(this.f30352b, this.f30351a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f30354a;

        public i(JSONObject jSONObject) {
            this.f30354a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.b(this.f30354a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a();
                e.this.f30318b = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30360b;

        public m(String str, String str2) {
            this.f30359a = str;
            this.f30360b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.f30318b = eVar.b(eVar.f30324h.b(), e.this.f30324h.d(), e.this.f30324h.f(), e.this.f30324h.e(), e.this.f30324h.g(), e.this.f30324h.c(), this.f30359a, this.f30360b);
                e.this.f30318b.b();
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                e.this.d(Log.getStackTraceString(th2));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T4 f30365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC0599u4 f30366d;

        public o(String str, String str2, T4 t10, InterfaceC0599u4 interfaceC0599u4) {
            this.f30363a = str;
            this.f30364b = str2;
            this.f30365c = t10;
            this.f30366d = interfaceC0599u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30363a, this.f30364b, this.f30365c, this.f30366d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f30368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0599u4 f30369b;

        public p(JSONObject jSONObject, InterfaceC0599u4 interfaceC0599u4) {
            this.f30368a = jSONObject;
            this.f30369b = interfaceC0599u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30368a, this.f30369b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T4 f30373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30374d;

        public q(String str, String str2, T4 t10, InterfaceC0581t4 interfaceC0581t4) {
            this.f30371a = str;
            this.f30372b = str2;
            this.f30373c = t10;
            this.f30374d = interfaceC0581t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30371a, this.f30372b, this.f30373c, this.f30374d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30377b;

        public r(String str, InterfaceC0581t4 interfaceC0581t4) {
            this.f30376a = str;
            this.f30377b = interfaceC0581t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.a(this.f30376a, this.f30377b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T4 f30379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f30380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581t4 f30381c;

        public s(T4 t10, Map map, InterfaceC0581t4 interfaceC0581t4) {
            this.f30379a = t10;
            this.f30380b = map;
            this.f30381c = interfaceC0581t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0639w8.a(C0377he.f28811j, new C0549r8().a(B5.f25708v, this.f30379a.f()).a(B5.f25709w, C0657x8.a(this.f30379a, C0514p8.e.Interstitial)).a(B5.f25710x, Boolean.valueOf(C0657x8.a(this.f30379a))).a(B5.I, Long.valueOf(N.f26615a.b(this.f30379a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.f30318b;
            if (lVar != null) {
                lVar.b(this.f30379a, this.f30380b, this.f30381c);
            }
        }
    }

    public e(Context context, C0241a4 c0241a4, U4 u6, R7 r10, int i10, JSONObject jSONObject, String str, String str2, C0500oc c0500oc) {
        this.f30327k = c0500oc;
        this.f30323g = r10;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C0314e5 c0314e5A = C0314e5.a(networkStorageDir, r10, jSONObject);
        this.f30324h = new fh(context, c0241a4, u6, i10, c0314e5A, networkStorageDir);
        a(context, c0241a4, u6, i10, c0314e5A, networkStorageDir, str, str2);
    }

    private void l() {
        Logger.i(this.f30317a, "handleReadyState");
        this.f30319c = C0514p8.b.Ready;
        CountDownTimer countDownTimer = this.f30320d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f30322f.c();
        this.f30322f.a();
        com.ironsource.sdk.controller.l lVar = this.f30318b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C0514p8.b.Ready.equals(this.f30319c);
    }

    private void n() {
        this.f30324h.a(true);
        com.ironsource.sdk.controller.l lVar = this.f30318b;
        if (lVar != null) {
            lVar.a(this.f30324h.i());
        }
    }

    public com.ironsource.sdk.controller.l k() {
        return this.f30318b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C0241a4 c0241a4, U4 u6, int i10, C0314e5 c0314e5, String str, String str2, String str3) {
        try {
            v vVarB = b(context, c0241a4, u6, i10, c0314e5, str, str2, str3);
            this.f30318b = vVarB;
            vVarB.b();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            d(Log.getStackTraceString(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C0639w8.a(C0377he.f28805d, new C0549r8().a(B5.A, str).a());
        this.f30319c = C0514p8.b.Loading;
        this.f30318b = new com.ironsource.sdk.controller.n(str, this.f30323g);
        this.f30321e.c();
        this.f30321e.a();
        R7 r10 = this.f30323g;
        if (r10 != null) {
            r10.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C0532q8(1001, str));
    }

    private com.ironsource.sdk.controller.l.a i() {
        return new zh(this, 2);
    }

    private com.ironsource.sdk.controller.l.b j() {
        return new ai(this, 1);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30318b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C0514p8.c h() {
        com.ironsource.sdk.controller.l lVar = this.f30318b;
        return lVar != null ? lVar.h() : C0514p8.c.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.sdk.controller.f.a aVar) {
        com.ironsource.sdk.controller.l.a aVarRemove = this.f30325i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30318b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C0241a4 c0241a4, U4 u6, int i10, C0314e5 c0314e5, String str, String str2, String str3) throws Throwable {
        C0639w8.a(C0377he.f28804c, new C0549r8().a(B5.f25711y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, u6, c0241a4, this, this.f30323g, i10, c0314e5, str, i(), j(), str2, str3);
        X5 x10 = new X5(context, c0314e5, new W5(this.f30323g.a()), new Ob(c0314e5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c0314e5.a(), x10));
        vVar.a(new C0596u1());
        vVar.a(new C0653x4(context, new C0635w4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Nb nb2) {
        com.ironsource.sdk.controller.l.b bVar = this.f30326j.get(nb2.d());
        if (bVar != null) {
            bVar.a(nb2);
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f30317a, "handleControllerLoaded");
        this.f30319c = C0514p8.b.Loaded;
        this.f30321e.c();
        this.f30321e.a();
    }

    private void a(Runnable runnable, long j10) {
        R7 r10 = this.f30323g;
        if (r10 != null) {
            r10.d(runnable, j10);
        } else {
            Logger.e(this.f30317a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C0241a4 c0241a4, final U4 u6, final int i10, final C0314e5 c0314e5, final String str, final String str2, final String str3) {
        int iC = Kb.Y().h().C();
        if (iC > 0) {
            C0639w8.a(C0377he.B, new C0549r8().a(B5.f25711y, String.valueOf(iC)).a());
        }
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f30661a.c(context, c0241a4, u6, i10, c0314e5, str, str2, str3);
            }
        };
        if (Kb.Y().h().s()) {
            this.f30323g.b(runnable, iC);
        } else {
            a(runnable, iC);
        }
        this.f30320d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.f30317a, "handleControllerFailed ");
        C0549r8 c0549r8 = new C0549r8();
        c0549r8.a(B5.A, str);
        c0549r8.a(B5.f25711y, String.valueOf(this.f30324h.l()));
        C0639w8.a(C0377he.f28815o, c0549r8.a());
        this.f30324h.a(false);
        e(str);
        if (this.f30320d != null) {
            Logger.i(this.f30317a, "cancel timer mControllerReadyTimer");
            this.f30320d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.f30317a, "handleControllerReady ");
        this.f30327k.a(h());
        if (C0514p8.c.Web.equals(h())) {
            C0639w8.a(C0377he.f28806e, new C0549r8().a(B5.f25711y, String.valueOf(this.f30324h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    public void a(Runnable runnable) {
        this.f30321e.a(runnable);
    }

    @Override // com.ironsource.InterfaceC0280c7
    public void a(Y6 y10) {
        EnumC0244a7 enumC0244a7B = y10.b();
        if (enumC0244a7B == EnumC0244a7.SendEvent) {
            C0639w8.a(C0377he.A, new C0549r8().a(B5.f25711y, y10.a() + " : strategy: " + enumC0244a7B).a());
            return;
        }
        if (enumC0244a7B == EnumC0244a7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(y10.a(), this.f30323g);
            this.f30318b = nVar;
            this.f30327k.a(nVar.h());
            C0639w8.a(C0377he.f28805d, new C0549r8().a(B5.A, y10.a() + " : strategy: " + enumC0244a7B).a());
            C0639w8.a(C0377he.A, new C0549r8().a(B5.f25711y, y10.a() + " : strategy: " + enumC0244a7B).a());
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C0639w8.a(C0377he.f28825y, new C0549r8().a(B5.f25711y, str).a());
        CountDownTimer countDownTimer = this.f30320d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k extends CountDownTimer {
        public k(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f30317a, "Global Controller Timer Finish");
            e.this.d(X3.c.f27701k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class n extends CountDownTimer {
        public n(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f30317a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(X3.c.f27701k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4) {
        this.f30322f.a(new s(t10, map, interfaceC0581t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t10) {
        this.f30322f.a(new f(t10));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f30322f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30318b) == null) {
            return;
        }
        lVar.b(context);
    }

    private void a(C0514p8.e eVar, T4 t10, String str, String str2) {
        Logger.i(this.f30317a, "recoverWebController for product: " + eVar.toString());
        C0549r8 c0549r8 = new C0549r8();
        c0549r8.a(B5.f25709w, eVar.toString());
        c0549r8.a(B5.f25708v, t10.f());
        C0639w8.a(C0377he.f28803b, c0549r8.a());
        this.f30324h.n();
        a();
        m mVar = new m(str, str2);
        if (Kb.Y().h().s()) {
            this.f30323g.b(mVar);
        } else {
            b(mVar);
        }
        this.f30320d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0599u4 interfaceC0599u4) {
        if (this.f30324h.a(h(), this.f30319c)) {
            a(C0514p8.e.RewardedVideo, t10, str, str2);
        }
        this.f30322f.a(new o(str, str2, t10, interfaceC0599u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0599u4 interfaceC0599u4) {
        this.f30322f.a(new p(jSONObject, interfaceC0599u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0581t4 interfaceC0581t4) {
        if (this.f30324h.a(h(), this.f30319c)) {
            a(C0514p8.e.Interstitial, t10, str, str2);
        }
        this.f30322f.a(new q(str, str2, t10, interfaceC0581t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC0581t4 interfaceC0581t4) {
        Logger.i(this.f30317a, "load interstitial");
        this.f30322f.a(new r(str, interfaceC0581t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0581t4 interfaceC0581t4) {
        this.f30322f.a(new a(jSONObject, interfaceC0581t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4) {
        this.f30322f.a(new b(t10, map, interfaceC0581t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f30318b == null || !m()) {
            return false;
        }
        return this.f30318b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t10, InterfaceC0563s4 interfaceC0563s4) {
        if (this.f30324h.a(h(), this.f30319c)) {
            a(C0514p8.e.Banner, t10, str, str2);
        }
        this.f30322f.a(new c(str, str2, t10, interfaceC0563s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC0563s4 interfaceC0563s4) {
        this.f30322f.a(new d(jSONObject, interfaceC0563s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10) {
        this.f30322f.a(new RunnableC0084e(t10));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t10, Map<String, String> map, InterfaceC0563s4 interfaceC0563s4) {
        this.f30322f.a(new g(t10, map, interfaceC0563s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        this.f30322f.a(new h(aVar, cVar));
    }

    public void a(String str, com.ironsource.sdk.controller.l.b bVar) {
        this.f30326j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f30318b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.f30317a, "destroy controller");
        CountDownTimer countDownTimer = this.f30320d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        L3 l10 = this.f30322f;
        if (l10 != null) {
            l10.b();
        }
        this.f30320d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f30318b.a(activity);
    }
}
