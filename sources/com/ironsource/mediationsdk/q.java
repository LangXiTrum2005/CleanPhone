package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.C0304dd;
import com.ironsource.C0474n4;
import com.ironsource.C0533q9;
import com.ironsource.C0654x5;
import com.ironsource.C1;
import com.ironsource.Cc;
import com.ironsource.De;
import com.ironsource.Ee;
import com.ironsource.EnumC0672y5;
import com.ironsource.G1;
import com.ironsource.InterfaceC0441l7;
import com.ironsource.Kb;
import com.ironsource.L6;
import com.ironsource.Lb;
import com.ironsource.Lc;
import com.ironsource.Ld;
import com.ironsource.M1;
import com.ironsource.Od;
import com.ironsource.U9;
import com.ironsource.V4;
import com.ironsource.Ve;
import com.ironsource.Ze;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class q implements Cc {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static q f29669z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ze f29670a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private NetworkStateReceiver f29684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CountDownTimer f29685q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f29688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Ve f29689u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f29691w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29671b = e.f29708f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0441l7 f29672c = Kb.Y().k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29673d = "appKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29674e = getClass().getSimpleName();
    private boolean l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29682n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<Lc> f29686r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f29687s = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f29693y = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f29681m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29675f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29676g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29677h = 62;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29678i = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29679j = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AtomicBoolean f29683o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29680k = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f29690v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private U9 f29692x = new U9();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends f {
        public a() {
            super();
        }

        /* JADX WARN: Code duplicated, block: B:57:0x02a1 A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007d, B:12:0x0090, B:14:0x00cd, B:15:0x00f6, B:17:0x0126, B:19:0x012c, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:33:0x020b, B:35:0x0213, B:36:0x0225, B:38:0x022b, B:40:0x0238, B:42:0x023f, B:43:0x024a, B:45:0x0250, B:46:0x025a, B:48:0x025e, B:50:0x026a, B:52:0x0287, B:53:0x0290, B:55:0x0295, B:67:0x02e6, B:57:0x02a1, B:59:0x02a9, B:61:0x02b4, B:62:0x02b8, B:63:0x02c2, B:65:0x02c8, B:66:0x02d4), top: B:72:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x02a9 A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007d, B:12:0x0090, B:14:0x00cd, B:15:0x00f6, B:17:0x0126, B:19:0x012c, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:33:0x020b, B:35:0x0213, B:36:0x0225, B:38:0x022b, B:40:0x0238, B:42:0x023f, B:43:0x024a, B:45:0x0250, B:46:0x025a, B:48:0x025e, B:50:0x026a, B:52:0x0287, B:53:0x0290, B:55:0x0295, B:67:0x02e6, B:57:0x02a1, B:59:0x02a9, B:61:0x02b4, B:62:0x02b8, B:63:0x02c2, B:65:0x02c8, B:66:0x02d4), top: B:72:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x02b4 A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007d, B:12:0x0090, B:14:0x00cd, B:15:0x00f6, B:17:0x0126, B:19:0x012c, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:33:0x020b, B:35:0x0213, B:36:0x0225, B:38:0x022b, B:40:0x0238, B:42:0x023f, B:43:0x024a, B:45:0x0250, B:46:0x025a, B:48:0x025e, B:50:0x026a, B:52:0x0287, B:53:0x0290, B:55:0x0295, B:67:0x02e6, B:57:0x02a1, B:59:0x02a9, B:61:0x02b4, B:62:0x02b8, B:63:0x02c2, B:65:0x02c8, B:66:0x02d4), top: B:72:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x02c8 A[Catch: Exception -> 0x02f1, LOOP:3: B:63:0x02c2->B:65:0x02c8, LOOP_END, TryCatch #0 {Exception -> 0x02f1, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007d, B:12:0x0090, B:14:0x00cd, B:15:0x00f6, B:17:0x0126, B:19:0x012c, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01e7, B:33:0x020b, B:35:0x0213, B:36:0x0225, B:38:0x022b, B:40:0x0238, B:42:0x023f, B:43:0x024a, B:45:0x0250, B:46:0x025a, B:48:0x025e, B:50:0x026a, B:52:0x0287, B:53:0x0290, B:55:0x0295, B:67:0x02e6, B:57:0x02a1, B:59:0x02a9, B:61:0x02b4, B:62:0x02b8, B:63:0x02c2, B:65:0x02c8, B:66:0x02d4), top: B:72:0x0000 }] */
        @Override // java.lang.Runnable
        public void run() {
            q qVar;
            Iterator it;
            try {
                p pVarH = p.h();
                if (!TextUtils.isEmpty(q.this.f29687s)) {
                    L6.a().a("userId", q.this.f29687s);
                }
                if (!TextUtils.isEmpty(q.this.f29688t)) {
                    L6.a().a("appKey", q.this.f29688t);
                }
                q qVar2 = q.this;
                qVar2.f29692x.i(qVar2.f29687s);
                q.this.f29691w = new Date().getTime();
                Ld.c().a();
                q.this.f29689u = pVarH.b(ContextProvider.getInstance().getApplicationContext(), q.this.f29687s, this.f29711c);
                q qVar3 = q.this;
                if (qVar3.f29689u == null) {
                    if (qVar3.f29676g == 3) {
                        qVar3.f29690v = true;
                        Iterator it2 = qVar3.f29686r.iterator();
                        while (it2.hasNext()) {
                            ((Lc) it2.next()).a();
                        }
                    }
                    if (this.f29709a) {
                        q qVar4 = q.this;
                        if (qVar4.f29676g < qVar4.f29677h) {
                            qVar4.f29680k = true;
                            qVar4.f29681m.postDelayed(this, qVar4.f29675f * 1000);
                            q qVar5 = q.this;
                            if (qVar5.f29676g < qVar5.f29678i) {
                                qVar5.f29675f *= 2;
                            }
                        }
                    }
                    if (this.f29709a) {
                        q qVar6 = q.this;
                        if (qVar6.f29676g == qVar6.f29679j) {
                            qVar = q.this;
                            if (!qVar.l) {
                                qVar.l = true;
                                if (TextUtils.isEmpty(this.f29710b)) {
                                    this.f29710b = "noServerResponse";
                                }
                                it = q.this.f29686r.iterator();
                                while (it.hasNext()) {
                                    ((Lc) it.next()).g(this.f29710b);
                                }
                                q.this.b(d.INIT_FAILED);
                                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                            }
                        }
                    } else {
                        qVar = q.this;
                        if (!qVar.l) {
                            qVar.l = true;
                            if (TextUtils.isEmpty(this.f29710b)) {
                                this.f29710b = "noServerResponse";
                            }
                            it = q.this.f29686r.iterator();
                            while (it.hasNext()) {
                                ((Lc) it.next()).g(this.f29710b);
                            }
                            q.this.b(d.INIT_FAILED);
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                        }
                    }
                    q.this.f29676g++;
                    return;
                }
                qVar3.f29681m.removeCallbacks(this);
                if (!q.this.f29689u.q()) {
                    q qVar7 = q.this;
                    if (qVar7.l) {
                        return;
                    }
                    qVar7.b(d.INIT_FAILED);
                    q qVar8 = q.this;
                    qVar8.l = true;
                    Iterator it3 = qVar8.f29686r.iterator();
                    while (it3.hasNext()) {
                        ((Lc) it3.next()).g("serverResponseIsNotValid");
                    }
                    return;
                }
                q.this.b(d.INITIATED);
                new Lb().a(q.this.f29689u.c().b().e().b(), pVarH.v());
                M1 m1F = q.this.f29689u.c().b().f();
                if (m1F != null) {
                    V4 v4 = V4.f27346a;
                    v4.c(m1F.g());
                    v4.a(m1F.f());
                    v4.a(m1F.j());
                    IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(m1F.h());
                    q.this.f29672c.a(m1F);
                }
                q.this.a(ContextProvider.getInstance().getApplicationContext(), q.this.f29689u);
                long time = new Date().getTime();
                q qVar9 = q.this;
                pVarH.a(time - qVar9.f29691w, qVar9.f29689u.i());
                if (m1F != null && m1F.e()) {
                    new Od(Kb.Y().q(), new defpackage.c(3), Kb.Y(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                }
                q.this.f29670a = new Ze();
                q qVar10 = q.this;
                qVar10.f29670a.a(qVar10.f29672c);
                if (q.this.f29689u.c().b().g() && ContextProvider.getInstance().getApplicationContext() != null) {
                    C0533q9.f30115a.a(ContextProvider.getInstance().getApplicationContext());
                }
                List<IronSource.a> listH = q.this.f29689u.h();
                Iterator it4 = q.this.f29686r.iterator();
                while (it4.hasNext()) {
                    ((Lc) it4.next()).a(listH, q.this.g(), q.this.f29689u.c());
                }
                C0304dd.P.i();
                G1 g1D = q.this.f29689u.c().b().d();
                if (g1D.f()) {
                    C0474n4.d().a(g1D.b(), g1D.d(), g1D.c(), g1D.e(), IronSourceUtils.d(), g1D.a(), g1D.g());
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a extends CountDownTimer {
            public a(long j10, long j11) {
                super(j10, j11);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                q qVar = q.this;
                if (qVar.l) {
                    return;
                }
                qVar.l = true;
                Iterator it = qVar.f29686r.iterator();
                while (it.hasNext()) {
                    ((Lc) it.next()).g("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                if (j10 <= 45000) {
                    q qVar = q.this;
                    qVar.f29690v = true;
                    Iterator it = qVar.f29686r.iterator();
                    while (it.hasNext()) {
                        ((Lc) it.next()).a();
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.f29685q = new a(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, 15000L).start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29697a;

        static {
            int[] iArr = new int[d.values().length];
            f29697a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29697a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29697a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f29703a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f29704b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f29705c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f29706d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f29707e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f29708f = 5;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public abstract class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f29710b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f29709a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected p.b f29711c = new a();

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements p.b {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.p.b
            public void a(String str) {
                f fVar = f.this;
                fVar.f29709a = false;
                fVar.f29710b = str;
            }
        }

        public f() {
        }
    }

    private q() {
    }

    public static synchronized q c() {
        try {
            if (f29669z == null) {
                f29669z = new q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29669z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.f29680k;
    }

    public void a(Context context, Ve ve) {
        this.f29692x.i(ve.g().h());
        this.f29692x.c(ve.g().d());
        C1 c1B = ve.c().b();
        this.f29692x.a(c1B.a());
        this.f29692x.d(c1B.c().b());
        this.f29692x.b(c1B.k().b());
        this.f29692x.a(Boolean.valueOf(IronSourceUtils.c(context)));
        M1 m1F = ve.c().b().f();
        this.f29692x.b(m1F.b());
        Kb.Q().o().a(m1F.c());
    }

    public int b() {
        return this.f29671b;
    }

    public synchronized boolean d() {
        return this.f29690v;
    }

    public void e() {
        b(d.INIT_FAILED);
    }

    public synchronized void f() {
        int iA = a(a());
        this.f29671b = iA;
        this.f29692x.c(iA);
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        Ee.f26017a.a(De.values()[dVar.ordinal()]);
    }

    private static int a(d dVar) {
        int i10 = c.f29697a[dVar.ordinal()];
        if (i10 == 1) {
            return e.f29706d;
        }
        if (i10 == 2) {
            return e.f29707e;
        }
        if (i10 != 3) {
            return e.f29703a;
        }
        return e.f29704b;
    }

    public synchronized void a(Context context, String str, String str2, IronSource.a... aVarArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.f29683o;
                if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                    b(d.INIT_IN_PROGRESS);
                    this.f29687s = str2;
                    this.f29688t = str;
                    if (IronSourceUtils.f(context)) {
                        this.f29681m.post(this.f29693y);
                    } else {
                        this.f29682n = true;
                        if (this.f29684p == null) {
                            this.f29684p = new NetworkStateReceiver(context, this);
                        }
                        context.registerReceiver(this.f29684p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                } else {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f29674e + ": Multiple calls to init are not allowed", 2);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (this.f29682n && z10) {
            CountDownTimer countDownTimer = this.f29685q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f29682n = false;
            this.f29680k = true;
            Kb.Y().q().a(new C0654x5(EnumC0672y5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.b(false)));
            this.f29681m.post(this.f29693y);
        }
    }

    public synchronized d a() {
        return d.values()[Ee.f26017a.a().ordinal()];
    }
}
