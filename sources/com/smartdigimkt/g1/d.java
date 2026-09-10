package com.smartdigimkt.g1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.b2.h;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.c3.l;
import com.smartdigimkt.expressad.reward.player.ATRewardVideoActivity;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.x.g;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class d implements com.smartdigimkt.g1.a {
    private static final String T = "RewardMVVideoAdapter";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f35347U = "APP ALREADY INSTALLED";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f35348V = "Offer list is empty";
    public static final String W = "1";
    public static final String X = "1";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f35349Y = 1;
    public static final int Z = 2;
    public static final int a0 = 3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f35350b0 = 4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f35351c0 = 5;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f35352d0 = 6;
    public static final int e0 = 7;
    private static final int f0 = 8;
    private static final int g0 = 9;
    private static final int h0 = 16;
    private static final int i0 = 17;
    private static final int j0 = 5000;
    private static final int k0 = 30000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private CopyOnWriteArrayList<com.smartdigimkt.x.d> f35353A;
    private String G;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private List<com.smartdigimkt.x.d> f35361Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private List<com.smartdigimkt.x.d> f35362R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35365c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35366e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f35367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f35368i;
    private String j;
    private h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile com.smartdigimkt.g1.b f35369l;
    private Runnable m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.smartdigimkt.f3.d f35370n;
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35372u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35373w;
    private int x;
    private int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.smartdigimkt.x.e f35374z;
    private boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35371p = false;
    public Object q = new Object();
    private CopyOnWriteArrayList<com.smartdigimkt.x.d> r = new CopyOnWriteArrayList<>();
    private int s = 2;
    private String v = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f35354B = false;
    public String C = "";
    public String D = "";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f35355E = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f35356F = 0;
    private Handler H = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f35357I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f35358J = 0;
    volatile boolean K = false;
    volatile boolean L = false;
    volatile boolean M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    volatile boolean f35359N = false;
    volatile boolean O = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f35360P = "";
    private boolean S = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:77:0x020f  */
        /* JADX WARN: Code duplicated, block: B:78:0x0211  */
        /* JADX WARN: Code duplicated, block: B:82:0x0241  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z2;
            try {
                try {
                    switch (message.what) {
                        case 1:
                        case 2:
                            Object obj = message.obj;
                            if (obj != null) {
                                obj.toString();
                            }
                            break;
                        case 3:
                            if (d.this.f35369l != null) {
                                d.this.f35369l.a("campaign is ok");
                            }
                            sendEmptyMessageDelayed(5, com.smartdigimkt.b0.a.u2);
                            break;
                        case 4:
                            if (d.this.f35369l != null) {
                                d dVar = d.this;
                                dVar.a(dVar.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, d.this.f35372u);
                                if (d.this.f35361Q != null && d.this.f35361Q.size() > 0) {
                                }
                                try {
                                    com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.f39993c, "unknow error in load failed");
                                    Object obj2 = message.obj;
                                    if (obj2 == null) {
                                        if (d.this.H != null) {
                                            d.this.H.removeMessages(5);
                                        }
                                        removeMessages(6);
                                        if (!d.this.O) {
                                            d.this.O = true;
                                            d.this.f35369l.a(d.this.f35361Q, com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.f39993c, "errorCode: 3506 errorMessage: data load failed"));
                                        }
                                    } else {
                                        String str = (String) obj2;
                                        int i2 = message.arg1;
                                        if (TextUtils.isEmpty(str)) {
                                            if (d.this.H != null) {
                                                d.this.H.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            com.smartdigimkt.y.c cVarA = com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.f39993c, "errorCode: 3507 errorMessage: data load failed, errorMsg null");
                                            if (!d.this.O) {
                                                d.this.O = true;
                                                d.this.f35369l.a(d.this.f35361Q, cVarA);
                                            }
                                        } else {
                                            if (d.this.H != null) {
                                                d.this.H.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            com.smartdigimkt.y.c cVarA2 = i2 == 880021 ? com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.f40002u, "errorCode: 3507 errorMessage: data load failed, errorMsg is APP ALREADY INSTALLED") : (i2 == 880003 || i2 == 6 || i2 == 7) ? com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.d, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(str)) : com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.f39993c, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(str));
                                            boolean z3 = d.this.O;
                                            d.this.O = true;
                                            d.this.f35369l.a(d.this.f35361Q, cVarA2);
                                        }
                                    }
                                } catch (Exception e2) {
                                    if (d.this.H != null) {
                                        d.this.H.removeMessages(5);
                                    }
                                    removeMessages(6);
                                    d dVar2 = d.this;
                                    dVar2.a(dVar2.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, d.this.f35372u);
                                    d.this.f35369l.a(d.this.f35361Q, com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.f39993c, "errorCode: 3508 errorMessage: data load failed, exception is: " + e2.getMessage()));
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (d.this.f35369l != null) {
                                if (d.this.f35361Q != null && d.this.f35361Q.size() > 0) {
                                    com.smartdigimkt.x.d dVar3 = (com.smartdigimkt.x.d) d.this.f35361Q.get(0);
                                    boolean z4 = !TextUtils.isEmpty(dVar3.g0());
                                    int iS1 = dVar3.s1();
                                    d dVar4 = d.this;
                                    if (dVar4.a((List<com.smartdigimkt.x.d>) dVar4.f35353A, z4, iS1, true, false)) {
                                        d dVar5 = d.this;
                                        dVar5.a(dVar5.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, (List<com.smartdigimkt.x.d>) d.this.f35362R, d.this.f35372u);
                                        sendEmptyMessage(6);
                                        removeMessages(5);
                                        if (!d.this.f35359N) {
                                            d.this.f35359N = true;
                                            TextUtils.isEmpty(d.this.f35364b);
                                            d.this.f35369l.a(d.this.f35353A);
                                        }
                                    }
                                }
                                d dVar6 = d.this;
                                dVar6.a(dVar6.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, d.this.f35372u);
                                if (d.this.H != null) {
                                    d.this.H.removeMessages(5);
                                    d.this.H.removeMessages(6);
                                }
                                if (!d.this.O) {
                                    com.smartdigimkt.y.c cVarA3 = com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.k, "errorCode: 3401 errorMessage: resource load timeout");
                                    d.this.O = true;
                                    if (d.this.f35361Q != null && d.this.f35361Q.size() > 0) {
                                    }
                                    d.this.f35369l.a(d.this.f35361Q, cVarA3);
                                    if (d.this.f35353A != null && d.this.f35353A.size() > 0) {
                                        boolean z5 = false;
                                        for (com.smartdigimkt.x.d dVar7 : d.this.f35353A) {
                                            if (dVar7 != null) {
                                                try {
                                                    if (!TextUtils.isEmpty(dVar7.u2()) && !l.a().b(dVar7.u2())) {
                                                        z2 = true;
                                                    }
                                                    if (dVar7 != null && !TextUtils.isEmpty(dVar7.B2()) && !l.a().c(dVar7.B2())) {
                                                        z2 = true;
                                                    }
                                                    if (dVar7 != null && !TextUtils.isEmpty(dVar7.g0())) {
                                                        if (!l.a().c(dVar7.g0())) {
                                                            z2 = true;
                                                        } else if (!z5 && !z2) {
                                                            if (com.smartdigimkt.a3.a.b(d.this.f35364b + "_" + dVar7.N1() + "_" + dVar7.g0()) == null) {
                                                                z5 = true;
                                                            }
                                                        }
                                                    }
                                                    if (dVar7 != null && dVar7.U1() != null && !TextUtils.isEmpty(dVar7.U1().f()) && !dVar7.U1().f().contains("cmpt=1") && l.a().c(dVar7.U1().f()) && TextUtils.isEmpty(dVar7.g0()) && !z2) {
                                                        com.smartdigimkt.a3.a.a(dVar7.S(), dVar7);
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                            z2 = false;
                                            if (dVar7 != null) {
                                                z2 = true;
                                            }
                                            if (dVar7 != null) {
                                                if (!l.a().c(dVar7.g0())) {
                                                    z2 = true;
                                                } else if (!z5) {
                                                    if (com.smartdigimkt.a3.a.b(d.this.f35364b + "_" + dVar7.N1() + "_" + dVar7.g0()) == null) {
                                                        z5 = true;
                                                    }
                                                }
                                            }
                                            if (dVar7 != null) {
                                                com.smartdigimkt.a3.a.a(dVar7.S(), dVar7);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            d dVar8 = d.this;
                            dVar8.a(dVar8.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, (List<com.smartdigimkt.x.d>) d.this.f35362R, d.this.f35372u);
                            if (d.this.f35369l != null) {
                                removeMessages(6);
                                if (d.this.H != null) {
                                    d.this.H.removeMessages(5);
                                }
                                if (d.this.f35369l != null && !d.this.f35359N) {
                                    d.this.f35359N = true;
                                    TextUtils.isEmpty(d.this.f35364b);
                                    d.this.f35369l.a(d.this.f35353A);
                                    break;
                                }
                            }
                            break;
                        case 7:
                        default:
                            break;
                        case 8:
                            if (d.this.f35369l != null && ((com.smartdigimkt.x.d) message.obj) != null && !TextUtils.isEmpty(d.this.f35364b)) {
                                d.this.isReady();
                                break;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public class c implements com.smartdigimkt.g1.c.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f35385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35386c;

        public class a implements Runnable {
            final /* synthetic */ com.smartdigimkt.y.c X;

            public a(com.smartdigimkt.y.c cVar) {
                this.X = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                dVar.a(dVar.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, d.this.f35372u);
                if (d.this.H != null) {
                    d.this.H.removeMessages(5);
                }
                if (d.this.O || d.this.f35369l == null) {
                    return;
                }
                d.this.O = true;
                com.smartdigimkt.y.c cVar = this.X;
                if (cVar != null) {
                    cVar.f("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d.this.f35369l.a(d.this.f35361Q, this.X);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ com.smartdigimkt.y.c X;

            public b(com.smartdigimkt.y.c cVar) {
                this.X = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                dVar.a(dVar.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, d.this.f35372u);
                if (d.this.H != null) {
                    d.this.H.removeMessages(5);
                }
                if (d.this.O || d.this.f35369l == null) {
                    return;
                }
                d.this.O = true;
                com.smartdigimkt.y.c cVar = this.X;
                if (cVar != null) {
                    cVar.f("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d.this.f35369l.a(d.this.f35361Q, this.X);
            }
        }

        public c(boolean z2, com.smartdigimkt.x.d dVar, int i2) {
            this.f35384a = z2;
            this.f35385b = dVar;
            this.f35386c = i2;
        }

        @Override // com.smartdigimkt.g1.c.l
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.smartdigimkt.g1.c.l
        public void a(String str, String str2, com.smartdigimkt.y.c cVar) {
            if (cVar != null) {
                cVar.f("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f35384a && d.this.f35369l != null && d.this.H != null) {
                if (this.f35385b.V1() == null || this.f35385b.V1().size() <= 0 || !this.f35385b.V1().contains(1)) {
                    d.this.H.post(new a(cVar));
                    return;
                }
                return;
            }
            if (this.f35386c == 1) {
                if (this.f35385b.V1() != null && this.f35385b.V1().size() > 0) {
                    if (this.f35385b.V1().contains(3)) {
                        return;
                    }
                    if (this.f35385b.g0().equals(this.f35385b.B2()) && this.f35385b.V1().contains(2)) {
                        return;
                    }
                }
                if (d.this.f35369l == null || d.this.H == null) {
                    return;
                }
                d.this.H.post(new b(cVar));
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ com.smartdigimkt.x.e X;

        public e(com.smartdigimkt.x.e eVar) {
            this.X = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.x.e eVar = this.X;
            if (eVar == null || eVar.f() == null || this.X.f().size() <= 0) {
                return;
            }
            d.this.c(this.X.f());
        }
    }

    public d(Context context, String str, String str2) {
        try {
            this.f35363a = context.getApplicationContext();
            this.f35364b = str2;
            this.f35365c = str;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b() {
    }

    private void c() {
    }

    private void d() {
    }

    private void m() {
        Handler handler = this.H;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    @Override // com.smartdigimkt.g1.a
    public void a(h hVar) {
    }

    @Override // com.smartdigimkt.g1.a
    public boolean isReady() {
        return b(false);
    }

    private void a(String str, com.smartdigimkt.x.d dVar, String str2) {
    }

    private String f() {
        return "";
    }

    private String j() {
        try {
            return y.b(com.smartdigimkt.h1.a.e1) ? com.smartdigimkt.h1.a.e1 : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private void l() {
        try {
            if (y.b(this.f35364b)) {
                com.smartdigimkt.h1.a.a(this.f35364b, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void e(boolean z2) {
        this.f35372u = z2;
    }

    public boolean g(boolean z2) {
        if (z2) {
            List<com.smartdigimkt.x.d> list = this.f35362R;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (com.smartdigimkt.x.d dVar : this.f35362R) {
                if (dVar != null) {
                    dVar.R(1);
                    if (dVar.U1() != null && !TextUtils.isEmpty(dVar.U1().f())) {
                        l.a().b(this.f35364b + "_" + dVar.N1() + "_" + dVar.U1().f(), true);
                    }
                }
            }
            return true;
        }
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = this.f35353A;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (com.smartdigimkt.x.d dVar2 : this.f35353A) {
            if (dVar2 != null) {
                dVar2.R(1);
                if (dVar2.U1() != null && !TextUtils.isEmpty(dVar2.U1().f())) {
                    l.a().b(this.f35364b + "_" + dVar2.N1() + "_" + dVar2.U1().f(), true);
                }
            }
        }
        return true;
    }

    public void h(boolean z2) {
        if (z2) {
            List<com.smartdigimkt.x.d> list = this.f35362R;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (com.smartdigimkt.x.d dVar : this.f35362R) {
                if (dVar != null) {
                    dVar.R(0);
                    if (dVar.U1() != null && !TextUtils.isEmpty(dVar.U1().f())) {
                        l.a().b(this.f35364b + "_" + dVar.N1() + "_" + dVar.U1().f(), false);
                    }
                }
            }
            return;
        }
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = this.f35353A;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (com.smartdigimkt.x.d dVar2 : this.f35353A) {
            if (dVar2 != null) {
                dVar2.R(0);
                if (dVar2.U1() != null && !TextUtils.isEmpty(dVar2.U1().f())) {
                    l.a().b(this.f35364b + "_" + dVar2.N1() + "_" + dVar2.U1().f(), false);
                }
            }
        }
    }

    public CopyOnWriteArrayList<com.smartdigimkt.x.d> i() {
        return this.f35353A;
    }

    public String k() {
        return this.f35364b;
    }

    private void e() {
        try {
            Map<String, Long> map = f.f34029i;
            if (map == null || map.size() <= 0) {
                return;
            }
            f.f34029i.clear();
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.g1.a
    public void a(String str, String str2) {
    }

    public void b(String str) {
        this.f35355E = str;
    }

    public void c(String str) {
        this.v = str;
    }

    public void d(boolean z2) {
        this.t = z2;
    }

    public void f(boolean z2) {
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList;
        if (z2 || (copyOnWriteArrayList = this.f35353A) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.smartdigimkt.b3.a.a().a(this.f35364b, this.f35353A);
    }

    private void a(String str, String str2, List<com.smartdigimkt.x.d> list) {
    }

    public boolean b(boolean z2) {
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = this.f35353A;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return false;
        }
        com.smartdigimkt.x.d dVar = this.f35353A.get(0);
        return a(this.f35353A, !TextUtils.isEmpty(dVar.g0()), dVar.s1(), z2);
    }

    public void c(com.smartdigimkt.x.e eVar) {
        try {
            this.f35374z = eVar;
            eVar.y();
            com.smartdigimkt.x.e eVar2 = this.f35374z;
            if (eVar2 != null && eVar2.f() != null) {
                this.f35374z.f().size();
            }
            a(this.f35374z);
            com.smartdigimkt.x.e eVar3 = this.f35374z;
            if (eVar3 != null) {
                this.C = eVar3.y();
            }
        } catch (Throwable th) {
            if (com.smartdigimkt.b.b.f33800a) {
                th.printStackTrace();
            }
            CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = this.f35353A;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            List<com.smartdigimkt.x.d> list = this.f35361Q;
            if (list != null) {
                list.clear();
            }
            this.K = false;
            this.L = false;
            synchronized (this.q) {
                try {
                    if (this.M) {
                        this.M = false;
                    }
                    this.O = false;
                    this.f35359N = false;
                    a("exception after load success", 0);
                    l();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void a(String str, List<com.smartdigimkt.x.d> list) {
    }

    private void a(String str, List<com.smartdigimkt.x.d> list, List<com.smartdigimkt.x.d> list2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<com.smartdigimkt.x.d> list, boolean z2) {
    }

    private boolean b(com.smartdigimkt.x.d dVar) {
        try {
            if (com.smartdigimkt.b3.a.a() != null) {
                return com.smartdigimkt.b3.a.a().a(dVar);
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    @Override // com.smartdigimkt.g1.a
    public boolean a() {
        return false;
    }

    /* JADX INFO: renamed from: com.smartdigimkt.g1.d$d, reason: collision with other inner class name */
    public class C0488d implements com.smartdigimkt.g1.c.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f35389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35391c;

        public C0488d(com.smartdigimkt.x.d dVar, boolean z2, int i2) {
            this.f35389a = dVar;
            this.f35390b = z2;
            this.f35391c = i2;
        }

        @Override // com.smartdigimkt.g1.c.l
        public void a(String str, String str2, String str3, String str4) {
            d.this.L = true;
            if (!d.this.K || d.this.M || d.this.H == null) {
                boolean z2 = d.this.K;
                boolean z3 = d.this.M;
                return;
            }
            synchronized (d.this.q) {
                try {
                    if (d.this.M) {
                        return;
                    }
                    d.this.M = true;
                    d.this.H.post(new a(str3, str, str2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.smartdigimkt.g1.c.l
        public void a(String str, String str2, com.smartdigimkt.y.c cVar) {
            if (d.this.f35361Q.get(0) != null) {
                d.this.f35361Q.size();
            }
            if (this.f35389a.V1() != null && this.f35389a.V1().size() > 0) {
                if (this.f35389a.V1().contains(3)) {
                    return;
                }
                if (this.f35389a.g0().equals(this.f35389a.B2()) && this.f35389a.V1().contains(2)) {
                    return;
                }
            }
            d.this.L = false;
            d dVar = d.this;
            dVar.a(dVar.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, d.this.f35372u);
            if (d.this.H != null) {
                d.this.H.removeMessages(5);
            }
            if (d.this.f35369l == null || d.this.O) {
                return;
            }
            d.this.O = true;
            if (cVar != null) {
                cVar.f("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            d.this.f35369l.a(d.this.f35361Q, cVar);
        }

        /* JADX INFO: renamed from: com.smartdigimkt.g1.d$d$a */
        public class a implements Runnable {
            final /* synthetic */ String X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ String f35392Y;
            final /* synthetic */ String Z;

            public a(String str, String str2, String str3) {
                this.X = str;
                this.f35392Y = str2;
                this.Z = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.smartdigimkt.g1.c cVarB = com.smartdigimkt.g1.c.b();
                boolean z2 = d.this.f35354B;
                Handler handler = d.this.H;
                boolean z3 = d.this.t;
                boolean z4 = d.this.f35372u;
                String str = this.X;
                String strO1 = C0488d.this.f35389a.O1();
                String str2 = this.f35392Y;
                String str3 = this.Z;
                String strG0 = C0488d.this.f35389a.g0();
                int i2 = d.this.s;
                C0488d c0488d = C0488d.this;
                cVarB.a(z2, handler, z3, z4, str, strO1, str2, str3, strG0, i2, c0488d.f35389a, d.this.f35353A, i.a().c(C0488d.this.f35389a.g0()), this.Z, d.this.f35370n, new C0489a(), false);
            }

            /* JADX INFO: renamed from: com.smartdigimkt.g1.d$d$a$a, reason: collision with other inner class name */
            public class C0489a implements com.smartdigimkt.g1.c.m {
                public C0489a() {
                }

                @Override // com.smartdigimkt.g1.c.m
                public void a(String str, String str2, String str3, String str4, String str5, com.smartdigimkt.a3.a.C0428a c0428a) {
                    d dVar = d.this;
                    CopyOnWriteArrayList copyOnWriteArrayList = dVar.f35353A;
                    C0488d c0488d = C0488d.this;
                    if (dVar.a(copyOnWriteArrayList, c0488d.f35390b, c0488d.f35391c)) {
                        d dVar2 = d.this;
                        dVar2.a(dVar2.f35364b, (List<com.smartdigimkt.x.d>) d.this.f35361Q, (List<com.smartdigimkt.x.d>) d.this.f35362R, d.this.f35372u);
                        if (d.this.H != null) {
                            d.this.H.removeMessages(5);
                        }
                        if (d.this.f35369l == null || d.this.f35359N) {
                            return;
                        }
                        d.this.f35359N = true;
                        TextUtils.isEmpty(d.this.f35364b);
                        d.this.f35369l.a(d.this.f35353A);
                        return;
                    }
                    d dVar3 = d.this;
                    dVar3.a(str3, (List<com.smartdigimkt.x.d>) dVar3.f35361Q, d.this.f35372u);
                    if (d.this.H != null) {
                        d.this.H.removeMessages(5);
                    }
                    if (d.this.f35369l == null || d.this.O) {
                        return;
                    }
                    d.this.O = true;
                    d.this.f35369l.a(d.this.f35361Q, com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.f39998i, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false"));
                }

                @Override // com.smartdigimkt.g1.c.m
                public void a(String str, String str2, String str3, com.smartdigimkt.a3.a.C0428a c0428a, com.smartdigimkt.y.c cVar) {
                    a aVar = a.this;
                    d dVar = d.this;
                    dVar.a(aVar.Z, (List<com.smartdigimkt.x.d>) dVar.f35361Q, d.this.f35372u);
                    if (d.this.H != null) {
                        d.this.H.removeMessages(5);
                    }
                    if (d.this.f35369l == null || d.this.O) {
                        return;
                    }
                    d.this.O = true;
                    d.this.f35369l.a(d.this.f35361Q, cVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x013c A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0144 A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x014a A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x015f A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0169 A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x016e A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0178 A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x018a  */
    /* JADX WARN: Code duplicated, block: B:89:0x018c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0198 A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x019c A[Catch: all -> 0x000d, TryCatch #7 {all -> 0x000d, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0012, B:11:0x0018, B:13:0x0022, B:15:0x002f, B:17:0x0039, B:18:0x003e, B:20:0x0044, B:21:0x0055, B:25:0x0060, B:27:0x006c, B:29:0x007a, B:56:0x0110, B:58:0x011f, B:60:0x0125, B:62:0x012b, B:69:0x013b, B:32:0x0083, B:35:0x008c, B:95:0x01a0, B:70:0x013c, B:72:0x0144, B:74:0x014a, B:76:0x0154, B:81:0x0169, B:82:0x016e, B:84:0x0178, B:86:0x017e, B:90:0x018d, B:91:0x0190, B:93:0x0198, B:94:0x019c, B:79:0x015f, B:96:0x01a4), top: B:108:0x0005 }] */
    private CopyOnWriteArrayList<com.smartdigimkt.x.d> b(com.smartdigimkt.x.e eVar) {
        int i2;
        FileOutputStream fileOutputStream;
        Exception e2;
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            com.smartdigimkt.f3.d dVar = this.f35370n;
            if (dVar != null) {
                dVar.b();
            }
            if (eVar != null && eVar.f() != null && eVar.f().size() > 0) {
                ArrayList<com.smartdigimkt.x.d> arrayListF = eVar.f();
                this.f35361Q = arrayListF;
                if (eVar.f() != null && eVar.f().size() > 0) {
                    ArrayList<com.smartdigimkt.x.d> arrayListF2 = eVar.f();
                    for (int i3 = 0; i3 < arrayListF2.size(); i3++) {
                        com.smartdigimkt.x.d dVar2 = arrayListF2.get(i3);
                        dVar2.G(this.f35364b);
                        arrayListF2.set(i3, dVar2);
                    }
                }
                for (int i4 = 0; i4 < arrayListF.size() && i4 < Integer.MAX_VALUE; i4++) {
                    com.smartdigimkt.x.d dVar3 = arrayListF.get(i4);
                    if (dVar3.K2()) {
                        if (TextUtils.isEmpty(dVar3.o1().trim())) {
                            continue;
                        } else {
                            if (dVar3.S() != 287 && dVar3.S() != 94) {
                                dVar3.S();
                            }
                            FileOutputStream fileOutputStream2 = null;
                            try {
                                String strB = com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_700_HTML);
                                String strA = s.a(dVar3.o1());
                                if (TextUtils.isEmpty(strA)) {
                                    strA = String.valueOf(System.currentTimeMillis());
                                }
                                File file = new File(strB, strA.concat(".html"));
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    fileOutputStream.write(("<script>" + com.smartdigimkt.j5.b.a().b() + "</script>" + dVar3.o1()).getBytes());
                                    fileOutputStream.flush();
                                    dVar3.e0(file.getAbsolutePath());
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                } catch (Exception e3) {
                                    e2 = e3;
                                    try {
                                        e2.printStackTrace();
                                        dVar3.e0("");
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream2 = fileOutputStream;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e4) {
                                fileOutputStream = null;
                                e2 = e4;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                            File file2 = new File(dVar3.o1());
                            if (!file2.exists() || !file2.isFile() || !file2.canRead()) {
                                a("mraid resource write fail", 3);
                            } else if (dVar3.w1() == 99) {
                                if (c(dVar3)) {
                                    if (!y.a(dVar3.B2())) {
                                    }
                                    if (com.smartdigimkt.m6.b.p().y()) {
                                        if (v.a(this.f35363a, dVar3.n())) {
                                            i2 = 1;
                                        } else {
                                            i2 = 2;
                                        }
                                        dVar3.h0(i2);
                                    }
                                    if (com.smartdigimkt.v0.l.a(this.f35363a, dVar3)) {
                                        copyOnWriteArrayList.add(dVar3);
                                    } else {
                                        this.f35360P = f35347U;
                                    }
                                } else if (y.a(dVar3.u2())) {
                                    this.f35360P = "No video campaign";
                                } else {
                                    if (com.smartdigimkt.m6.b.p().y()) {
                                        if (v.a(this.f35363a, dVar3.n())) {
                                            i2 = 1;
                                        } else {
                                            i2 = 2;
                                        }
                                        dVar3.h0(i2);
                                    }
                                    if (com.smartdigimkt.v0.l.a(this.f35363a, dVar3)) {
                                        copyOnWriteArrayList.add(dVar3);
                                    } else {
                                        this.f35360P = f35347U;
                                    }
                                }
                            }
                        }
                    } else if (dVar3.w1() == 99) {
                        if (c(dVar3)) {
                            if (!y.a(dVar3.B2()) && TextUtils.isEmpty(dVar3.o1())) {
                                this.f35360P = "No video campaign";
                            } else {
                                if (com.smartdigimkt.m6.b.p().y() && v.b(dVar3)) {
                                    if (v.a(this.f35363a, dVar3.n())) {
                                        i2 = 1;
                                    } else {
                                        i2 = 2;
                                    }
                                    dVar3.h0(i2);
                                }
                                if (com.smartdigimkt.v0.l.a(this.f35363a, dVar3)) {
                                    copyOnWriteArrayList.add(dVar3);
                                } else {
                                    this.f35360P = f35347U;
                                }
                            }
                        } else if (y.a(dVar3.u2())) {
                            this.f35360P = "No video campaign";
                        } else {
                            if (com.smartdigimkt.m6.b.p().y()) {
                                if (v.a(this.f35363a, dVar3.n())) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                dVar3.h0(i2);
                            }
                            if (com.smartdigimkt.v0.l.a(this.f35363a, dVar3)) {
                                copyOnWriteArrayList.add(dVar3);
                            } else {
                                this.f35360P = f35347U;
                            }
                        }
                    }
                }
                copyOnWriteArrayList.size();
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        return copyOnWriteArrayList;
    }

    private int g() {
        try {
            int iA = y.b(this.f35364b) ? com.smartdigimkt.h1.a.a(this.f35364b) : 0;
            com.smartdigimkt.f3.d dVar = this.f35370n;
            if (dVar == null || iA > dVar.D()) {
                return 0;
            }
            return iA;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private String h() {
        return "";
    }

    public class b implements com.smartdigimkt.g1.c.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f35377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35378c;

        public class c implements Runnable {
            final /* synthetic */ CopyOnWriteArrayList X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ com.smartdigimkt.y.c f35383Y;

            public c(CopyOnWriteArrayList copyOnWriteArrayList, com.smartdigimkt.y.c cVar) {
                this.X = copyOnWriteArrayList;
                this.f35383Y = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                dVar.a(dVar.f35364b, this.X, d.this.f35372u);
                if (d.this.H != null) {
                    d.this.H.removeMessages(5);
                }
                if (d.this.O || d.this.f35369l == null) {
                    return;
                }
                d.this.O = true;
                d.this.f35369l.a(this.X, this.f35383Y);
            }
        }

        public b(boolean z2, com.smartdigimkt.x.d dVar, int i2) {
            this.f35376a = z2;
            this.f35377b = dVar;
            this.f35378c = i2;
        }

        @Override // com.smartdigimkt.g1.c.f
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList) {
            copyOnWriteArrayList.size();
            d.this.K = true;
            if (this.f35376a) {
                if (!d.this.L || d.this.M || d.this.H == null) {
                    boolean z2 = d.this.L;
                    boolean z3 = d.this.M;
                    return;
                }
                synchronized (d.this.q) {
                    try {
                        if (d.this.M) {
                            return;
                        }
                        d.this.M = true;
                        d.this.H.post(new RunnableC0487b(str3, str2, copyOnWriteArrayList));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            for (com.smartdigimkt.x.d dVar : copyOnWriteArrayList) {
                if (dVar == null || dVar.U1() == null || TextUtils.isEmpty(dVar.U1().f()) || dVar.U1().f().contains("cmpt=1") || d.this.H == null) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList2 = copyOnWriteArrayList;
                    d dVar2 = d.this;
                    if (dVar2.a(dVar2.f35353A, this.f35376a, this.f35378c)) {
                        copyOnWriteArrayList2.get(0).N1();
                        d dVar3 = d.this;
                        dVar3.a(dVar3.f35364b, copyOnWriteArrayList2, (List<com.smartdigimkt.x.d>) d.this.f35362R, d.this.f35372u);
                        if (d.this.H != null) {
                            d.this.H.removeMessages(5);
                        }
                        if (d.this.f35369l != null && !d.this.f35359N) {
                            d.this.f35359N = true;
                            d.this.f35369l.a(d.this.f35353A);
                        }
                    } else {
                        copyOnWriteArrayList2.get(0).N1();
                        d dVar4 = d.this;
                        dVar4.a(str5, (List<com.smartdigimkt.x.d>) dVar4.f35361Q, d.this.f35372u);
                        if (d.this.H != null) {
                            d.this.H.removeMessages(5);
                        }
                        if (d.this.f35369l != null && !d.this.O) {
                            d.this.O = true;
                            d.this.f35369l.a(d.this.f35353A, com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.o, "errorCode: 3503 errorMessage: have no temp but isReady false"));
                        }
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                } else {
                    d.this.H.post(new a(dVar, str, str2, str3, copyOnWriteArrayList));
                }
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.g1.d$b$b, reason: collision with other inner class name */
        public class RunnableC0487b implements Runnable {
            final /* synthetic */ String X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ String f35381Y;
            final /* synthetic */ CopyOnWriteArrayList Z;

            public RunnableC0487b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.X = str;
                this.f35381Y = str2;
                this.Z = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.smartdigimkt.g1.c cVarB = com.smartdigimkt.g1.c.b();
                boolean z2 = d.this.f35354B;
                Handler handler = d.this.H;
                boolean z3 = d.this.t;
                boolean z4 = d.this.f35372u;
                String str = this.X;
                String strO1 = b.this.f35377b.O1();
                String str2 = d.this.f35365c;
                String str3 = this.f35381Y;
                String strG0 = b.this.f35377b.g0();
                int i2 = d.this.s;
                b bVar = b.this;
                cVarB.a(z2, handler, z3, z4, str, strO1, str2, str3, strG0, i2, bVar.f35377b, d.this.f35353A, i.a().c(b.this.f35377b.g0()), this.f35381Y, d.this.f35370n, new a(), false);
            }

            /* JADX INFO: renamed from: com.smartdigimkt.g1.d$b$b$a */
            public class a implements com.smartdigimkt.g1.c.m {
                public a() {
                }

                @Override // com.smartdigimkt.g1.c.m
                public void a(String str, String str2, String str3, String str4, String str5, com.smartdigimkt.a3.a.C0428a c0428a) {
                    d dVar = d.this;
                    CopyOnWriteArrayList copyOnWriteArrayList = dVar.f35353A;
                    b bVar = b.this;
                    if (!dVar.a(copyOnWriteArrayList, bVar.f35376a, bVar.f35378c)) {
                        d dVar2 = d.this;
                        dVar2.a(str3, (List<com.smartdigimkt.x.d>) dVar2.f35361Q, d.this.f35372u);
                        if (d.this.H != null) {
                            d.this.H.removeMessages(5);
                        }
                        if (d.this.f35369l == null || d.this.O) {
                            return;
                        }
                        d.this.O = true;
                        d.this.f35369l.a(d.this.f35361Q, com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.o, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false"));
                        return;
                    }
                    d dVar3 = d.this;
                    String str6 = dVar3.f35364b;
                    RunnableC0487b runnableC0487b = RunnableC0487b.this;
                    dVar3.a(str6, runnableC0487b.Z, (List<com.smartdigimkt.x.d>) d.this.f35362R, d.this.f35372u);
                    if (d.this.H != null) {
                        d.this.H.removeMessages(5);
                    }
                    if (d.this.f35369l == null || d.this.f35359N) {
                        return;
                    }
                    d.this.f35359N = true;
                    d.this.f35369l.a(d.this.f35353A);
                }

                @Override // com.smartdigimkt.g1.c.m
                public void a(String str, String str2, String str3, com.smartdigimkt.a3.a.C0428a c0428a, com.smartdigimkt.y.c cVar) {
                    if (b.this.f35377b.V1() == null || b.this.f35377b.V1().size() <= 0 || !b.this.f35377b.V1().contains(3)) {
                        RunnableC0487b runnableC0487b = RunnableC0487b.this;
                        d dVar = d.this;
                        dVar.a(runnableC0487b.f35381Y, (List<com.smartdigimkt.x.d>) dVar.f35361Q, d.this.f35372u);
                        if (d.this.H != null) {
                            d.this.H.removeMessages(5);
                        }
                        if (d.this.f35369l == null || d.this.O) {
                            return;
                        }
                        d.this.f35369l.a(d.this.f35361Q, cVar);
                    }
                }
            }
        }

        public class a implements Runnable {
            final /* synthetic */ com.smartdigimkt.x.d X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ String f35379Y;
            final /* synthetic */ String Z;
            final /* synthetic */ String e0;
            final /* synthetic */ CopyOnWriteArrayList f0;

            public a(com.smartdigimkt.x.d dVar, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.X = dVar;
                this.f35379Y = str;
                this.Z = str2;
                this.e0 = str3;
                this.f0 = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.smartdigimkt.g1.c cVarB = com.smartdigimkt.g1.c.b();
                boolean z2 = d.this.f35354B;
                Handler handler = d.this.H;
                boolean z3 = d.this.t;
                boolean z4 = d.this.f35372u;
                String strF = this.X.U1().f();
                int i2 = d.this.s;
                b bVar = b.this;
                cVarB.a(z2, handler, z3, z4, null, strF, i2, bVar.f35377b, d.this.f35353A, i.a().c(this.X.U1().f()), this.f35379Y, this.Z, this.e0, this.X.O1(), d.this.f35370n, new C0486a());
            }

            /* JADX INFO: renamed from: com.smartdigimkt.g1.d$b$a$a, reason: collision with other inner class name */
            public class C0486a implements com.smartdigimkt.g1.c.m {
                public C0486a() {
                }

                @Override // com.smartdigimkt.g1.c.m
                public void a(String str, String str2, String str3, String str4, String str5, com.smartdigimkt.a3.a.C0428a c0428a) {
                    d dVar = d.this;
                    CopyOnWriteArrayList copyOnWriteArrayList = dVar.f35353A;
                    b bVar = b.this;
                    if (!dVar.a(copyOnWriteArrayList, bVar.f35376a, bVar.f35378c)) {
                        d dVar2 = d.this;
                        dVar2.a(str3, (List<com.smartdigimkt.x.d>) dVar2.f35361Q, d.this.f35372u);
                        if (d.this.H != null) {
                            d.this.H.removeMessages(5);
                        }
                        if (d.this.f35369l == null || d.this.O) {
                            return;
                        }
                        d.this.O = true;
                        d.this.f35369l.a(d.this.f35353A, com.smartdigimkt.y.b.a(com.smartdigimkt.y.b.o, "errorCode: 3502 errorMessage: temp preload success but isReady false"));
                        return;
                    }
                    d dVar3 = d.this;
                    String str6 = dVar3.f35364b;
                    a aVar = a.this;
                    dVar3.a(str6, aVar.f0, (List<com.smartdigimkt.x.d>) d.this.f35362R, d.this.f35372u);
                    if (d.this.H != null) {
                        d.this.H.removeMessages(5);
                    }
                    if (d.this.f35369l == null || d.this.f35359N) {
                        return;
                    }
                    d.this.f35359N = true;
                    TextUtils.isEmpty(d.this.f35364b);
                    d.this.f35369l.a(d.this.f35353A);
                }

                @Override // com.smartdigimkt.g1.c.m
                public void a(String str, String str2, String str3, com.smartdigimkt.a3.a.C0428a c0428a, com.smartdigimkt.y.c cVar) {
                    if (b.this.f35377b.V1() == null || b.this.f35377b.V1().size() <= 0 || !b.this.f35377b.V1().contains(1)) {
                        a aVar = a.this;
                        d dVar = d.this;
                        dVar.a(aVar.Z, (List<com.smartdigimkt.x.d>) dVar.f35361Q, d.this.f35372u);
                        if (d.this.H != null) {
                            d.this.H.removeMessages(5);
                        }
                        if (d.this.f35369l == null || d.this.O) {
                            return;
                        }
                        d.this.f35369l.a(d.this.f35361Q, cVar);
                    }
                }
            }
        }

        @Override // com.smartdigimkt.g1.c.f
        public void a(CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, com.smartdigimkt.y.c cVar) {
            d.this.K = false;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.size();
            }
            if (d.this.f35369l == null || d.this.H == null) {
                return;
            }
            d.this.H.post(new c(copyOnWriteArrayList, cVar));
        }
    }

    public void a(int i2) {
        this.s = i2;
    }

    public String a(boolean z2) {
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayListC;
        com.smartdigimkt.x.d dVar;
        if (z2) {
            if (TextUtils.isEmpty(this.D) && (copyOnWriteArrayListC = com.smartdigimkt.c3.e.a().c(this.f35364b)) != null && copyOnWriteArrayListC.size() > 0 && (dVar = copyOnWriteArrayListC.get(0)) != null) {
                this.D = dVar.N1();
            }
            return this.D;
        }
        return this.C;
    }

    public void a(com.smartdigimkt.f3.d dVar) {
        try {
            this.f35370n = dVar;
            if (dVar == null || dVar.A() * 1000 == com.smartdigimkt.b0.a.u2) {
                return;
            }
            com.smartdigimkt.b0.a.u2 = this.f35370n.A() * 1000;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean a(List<com.smartdigimkt.x.d> list, boolean z2, int i2, boolean z3) {
        return a(list, z2, i2, false, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<com.smartdigimkt.x.d> list) {
        if (this.f35363a == null || list == null || list.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.smartdigimkt.x.d dVar = list.get(i2);
            if (dVar != null) {
                v.a(this.f35363a, dVar.n());
            }
        }
    }

    public boolean a(List<com.smartdigimkt.x.d> list, boolean z2, int i2) {
        return a(list, z2, i2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<com.smartdigimkt.x.d> list, boolean z2, int i2, boolean z3, boolean z4) {
        if (list != null && list.size() > 0) {
            com.smartdigimkt.x.d dVar = list.get(0);
            if (com.smartdigimkt.c3.e.a().a(94, this.f35364b, this.f35372u, list.size(), z2, i2, list, z3)) {
                if (z2) {
                    if (dVar.H2()) {
                        return true;
                    }
                    if (dVar.V1() != null && dVar.V1().size() > 0) {
                        if (dVar.V1().contains(3)) {
                            return true;
                        }
                        if (dVar.g0().equals(dVar.B2()) && dVar.V1().contains(2)) {
                            return true;
                        }
                    }
                    if (l.a().a(this.f35364b + "_" + dVar.N1() + "_" + dVar.g0())) {
                        return true;
                    }
                } else {
                    if (dVar != null && dVar.H2()) {
                        return true;
                    }
                    if ((dVar == null || dVar.V1() == null || dVar.V1().size() <= 0 || !dVar.V1().contains(1)) && dVar != null && dVar.U1() != null && !TextUtils.isEmpty(dVar.U1().f())) {
                        String str = this.f35364b + "_" + dVar.N1() + "_" + dVar.U1().f();
                        if (z4) {
                            l.a().b(str, true);
                        }
                        if (l.a().a(str)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean c(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return false;
        }
        try {
            return dVar.B1() == 2;
        } catch (Throwable th) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public void c(boolean z2) {
        this.S = z2;
    }

    public static boolean a(List<com.smartdigimkt.x.d> list, String str, boolean z2, int i2, boolean z3) {
        if (list != null && list.size() > 0) {
            com.smartdigimkt.x.d dVar = list.get(0);
            if (com.smartdigimkt.c3.e.a().a(94, str, false, list.size(), z2, i2, list, z3)) {
                if (z2) {
                    if (dVar.H2()) {
                        return true;
                    }
                    if (dVar.V1() != null && dVar.V1().size() > 0) {
                        if (dVar.V1().contains(3)) {
                            return true;
                        }
                        if (dVar.g0().equals(dVar.B2()) && dVar.V1().contains(2)) {
                            return true;
                        }
                    }
                    l lVarA = l.a();
                    StringBuilder sbX = android.support.v4.media.a.x(str, "_");
                    sbX.append(dVar.N1());
                    sbX.append("_");
                    sbX.append(dVar.g0());
                    if (lVarA.a(sbX.toString())) {
                        return true;
                    }
                } else {
                    if (dVar != null && dVar.H2()) {
                        return true;
                    }
                    if ((dVar.V1() == null || dVar.V1().size() <= 0 || !dVar.V1().contains(1)) && dVar.U1() != null && !TextUtils.isEmpty(dVar.U1().f())) {
                        l lVarA2 = l.a();
                        StringBuilder sbX2 = android.support.v4.media.a.x(str, "_");
                        sbX2.append(dVar.N1());
                        sbX2.append("_");
                        sbX2.append(dVar.U1().f());
                        if (lVarA2.a(sbX2.toString())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void b(List<com.smartdigimkt.x.d> list) {
        this.f35362R = list;
    }

    public void a(Activity activity, h hVar, String str, String str2, int i2, String str3, com.smartdigimkt.v6.a aVar) {
        Context context;
        try {
            this.k = hVar;
            if (this.f35363a != null && !y.a(this.f35364b)) {
                Context context2 = this.f35363a;
                if (activity == null || activity.isFinishing()) {
                    Log.i("sdm_BaseAdActivity", "Activity is null");
                    context = context2;
                } else {
                    context = activity;
                }
                Intent intent = new Intent(context, (Class<?>) ATRewardVideoActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra(ATRewardVideoActivity.c1, this.f35364b);
                intent.putExtra(com.smartdigimkt.b.b.f33814z, this.f35365c);
                intent.putExtra(ATRewardVideoActivity.e1, str);
                intent.putExtra(ATRewardVideoActivity.f1, i2);
                intent.putExtra(ATRewardVideoActivity.g1, this.t);
                intent.putExtra(ATRewardVideoActivity.h1, this.f35372u);
                intent.putExtra(ATRewardVideoActivity.n1, str3);
                intent.putExtra(ATRewardVideoActivity.o1, aVar);
                CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayListC = com.smartdigimkt.c3.e.a().c(this.f35364b);
                boolean z2 = false;
                copyOnWriteArrayListC.get(0).N1();
                if (copyOnWriteArrayListC.size() > 0) {
                    copyOnWriteArrayListC.size();
                    com.smartdigimkt.x.d dVar = copyOnWriteArrayListC.get(0);
                    if (dVar != null) {
                        this.D = dVar.N1();
                    }
                    if (dVar != null && !TextUtils.isEmpty(dVar.g0())) {
                        z2 = true;
                    }
                    b();
                } else {
                    h hVar2 = this.k;
                    if (hVar2 != null) {
                        hVar2.onShowFail("load failed");
                        return;
                    }
                }
                intent.putExtra(ATRewardVideoActivity.i1, z2);
                if (this.t) {
                    intent.putExtra(ATRewardVideoActivity.k1, this.f35373w);
                    intent.putExtra(ATRewardVideoActivity.l1, this.x);
                    intent.putExtra(ATRewardVideoActivity.m1, this.y);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(ATRewardVideoActivity.d1, str2);
                }
                com.smartdigimkt.g1.e.a().a(this.f35365c, this.f35364b, this.f35370n);
                try {
                    Activity activityC = com.smartdigimkt.k3.c.d().c();
                    if (activityC != null) {
                        activityC.startActivity(intent);
                        return;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            h hVar3 = this.k;
            if (hVar3 != null) {
                hVar3.onShowFail("context or unitid is null");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            h hVar4 = this.k;
            if (hVar4 != null) {
                hVar4.onShowFail("show failed, exception is " + e2.getMessage());
            }
        }
    }

    public void a(com.smartdigimkt.x.e eVar, int i2) {
        this.f35366e = 1;
        this.g = i2;
        this.f35367h = true;
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = this.f35353A;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        List<com.smartdigimkt.x.d> list = this.f35361Q;
        if (list != null) {
            list.clear();
        }
        this.K = false;
        this.L = false;
        synchronized (this.q) {
            try {
                if (this.M) {
                    this.M = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.O = false;
        this.f35359N = false;
        if (this.f35363a == null) {
            a("Context is null", 0);
            return;
        }
        if (y.a(this.f35364b)) {
            a("UnitId is null", 0);
            return;
        }
        if (this.f35370n == null) {
            a("RewardUnitSetting is null", 0);
            return;
        }
        e();
        d();
        c();
        c(eVar);
    }

    private void a(int i2, String str, int i3) {
        if (this.H != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i2;
            messageObtain.arg2 = i3;
            if (str.contains(g.f39715A)) {
                this.H.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.H.sendMessage(messageObtain);
            }
        }
    }

    private void a(String str, int i2) {
        if (this.H != null) {
            if (TextUtils.isEmpty(str)) {
                this.H.sendEmptyMessage(4);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg2 = i2;
            if (str.contains(g.f39715A)) {
                this.H.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.H.sendMessage(messageObtain);
            }
        }
    }

    @Override // com.smartdigimkt.g1.a
    public void a(com.smartdigimkt.g1.b bVar) {
        this.f35369l = bVar;
    }

    public void a(Runnable runnable) {
        this.m = runnable;
    }

    private void a(com.smartdigimkt.x.e eVar) throws Throwable {
        this.f35374z = eVar;
        a(b(eVar), true, false);
    }

    private void a(CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, boolean z2, boolean z3) throws Throwable {
        com.smartdigimkt.x.e eVar = this.f35374z;
        this.f35374z = eVar;
        eVar.f().size();
        this.f35361Q = copyOnWriteArrayList;
        a(this.f35374z, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            copyOnWriteArrayList.size();
            if (z2) {
                m();
            }
            com.smartdigimkt.x.e eVar2 = this.f35374z;
            if (eVar2 != null) {
                a(eVar2.A());
            }
            a(copyOnWriteArrayList);
            if (copyOnWriteArrayList.size() > 0) {
                copyOnWriteArrayList.size();
                a(this.f35365c, this.f35364b, copyOnWriteArrayList);
            }
            com.smartdigimkt.x.d dVar = copyOnWriteArrayList.get(0);
            this.f35353A = copyOnWriteArrayList;
            a(dVar);
            return;
        }
        if (TextUtils.isEmpty(this.f35360P)) {
            this.f35360P = f35347U;
        }
        a(this.f35360P.contains("INSTALL") ? com.smartdigimkt.y.b.f40002u : com.smartdigimkt.y.b.d, this.f35360P, 3);
    }

    private void a(com.smartdigimkt.x.d dVar) throws Throwable {
        boolean zIsEmpty = TextUtils.isEmpty(dVar.g0());
        boolean z2 = !zIsEmpty;
        int iS1 = dVar.s1();
        this.K = false;
        this.L = false;
        synchronized (this.q) {
            try {
                if (this.M) {
                    this.M = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.O = false;
        this.f35359N = false;
        com.smartdigimkt.g1.c.b().a(this.f35363a, z2, iS1, this.f35372u, this.t ? 287 : 94, this.f35365c, this.f35364b, dVar.N1(), this.f35353A, new b(z2, dVar, iS1), new c(z2, dVar, iS1));
        if (zIsEmpty) {
            return;
        }
        com.smartdigimkt.g1.c.b().a(this.f35363a, dVar, this.f35365c, this.f35364b, dVar.N1(), new C0488d(dVar, z2, iS1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<com.smartdigimkt.x.d> list, List<com.smartdigimkt.x.d> list2, boolean z2) {
        if (list2 != null && list2.size() > 0) {
            list2.size();
            for (com.smartdigimkt.x.d dVar : list2) {
                if (dVar.U1() != null && !TextUtils.isEmpty(dVar.U1().f())) {
                    StringBuilder sbX = android.support.v4.media.a.x(str, "_");
                    sbX.append(dVar.j());
                    sbX.append("_");
                    sbX.append(dVar.N1());
                    sbX.append("_");
                    sbX.append(dVar.U1().f());
                    com.smartdigimkt.a3.a.g(sbX.toString());
                    com.smartdigimkt.a3.a.b(dVar.S(), dVar);
                }
            }
        }
        if (z2) {
            a(str, list, list2);
        }
    }

    private void a(com.smartdigimkt.x.d dVar, String str, String str2, com.smartdigimkt.f3.d dVar2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strC = i.a().c(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 16;
            messageObtain.obj = new Object[]{dVar, strC, str2, dVar2, str};
            Handler handler = this.H;
            if (handler != null) {
                handler.sendMessage(messageObtain);
            }
        } catch (Exception unused) {
        }
    }

    private void a(com.smartdigimkt.x.e eVar, List<com.smartdigimkt.x.d> list) {
        com.smartdigimkt.l7.b.a().g(new e(eVar));
    }

    private void a(List<com.smartdigimkt.x.d> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.d += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        com.smartdigimkt.f3.d dVar = this.f35370n;
        if (dVar == null || this.d > dVar.D()) {
            this.d = 0;
        }
        if (y.b(this.f35364b)) {
            com.smartdigimkt.h1.a.a(this.f35364b, this.d);
        }
    }

    private void a(String str) {
        if (y.b(str)) {
            com.smartdigimkt.h1.a.e1 = str;
        }
    }

    public void a(int i2, int i3, int i4) {
        this.f35373w = i2;
        this.x = i3;
        this.y = i4;
    }
}
