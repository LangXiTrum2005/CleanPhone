package com.p004ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.p004ironsource.ac;
import com.p004ironsource.d4;
import com.p004ironsource.dt;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.NetworkStateReceiver;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.er;
import com.p004ironsource.et;
import com.p004ironsource.fp;
import com.p004ironsource.gr;
import com.p004ironsource.hk;
import com.p004ironsource.j4;
import com.p004ironsource.jf;
import com.p004ironsource.ke;
import com.p004ironsource.kq;
import com.p004ironsource.mediationsdk.integration.IntegrationHelper;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.sdk.SegmentListener;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.on;
import com.p004ironsource.op;
import com.p004ironsource.pn;
import com.p004ironsource.q9;
import com.p004ironsource.qt;
import com.p004ironsource.rt;
import com.p004ironsource.tt;
import com.p004ironsource.xa;
import com.p004ironsource.z3;
import com.p004ironsource.zb;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class s implements fp {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static s f26058A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tt f26059a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private NetworkStateReceiver f26067p;
    private CountDownTimer q;
    private String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private qt f26068u;
    private SegmentListener v;
    private long x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26060b = e.f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jf f26061c = on.U().v();
    private final String d = "appKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26062e = getClass().getSimpleName();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26065l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f26066n = false;
    private List<op> r = new ArrayList();
    private String s = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f26070z = new a();
    private Handler m = IronSourceThreadManager.INSTANCE.getInitHandler();
    private int f = 1;
    private int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26063h = 62;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26064i = 12;
    private int j = 5;
    private AtomicBoolean o = new AtomicBoolean(true);
    private boolean k = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f26069w = false;
    private hk y = new hk();

    public class a extends f {
        public a() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            rt rtVarJ;
            try {
                p pVarJ = p.j();
                if (!TextUtils.isEmpty(s.this.s)) {
                    ke.a().a("userId", s.this.s);
                }
                if (!TextUtils.isEmpty(s.this.t)) {
                    ke.a().a("appKey", s.this.t);
                }
                s.this.y.i(s.this.s);
                s.this.x = new Date().getTime();
                er.c().a();
                s.this.f26068u = pVarJ.b(ContextProvider.getInstance().getApplicationContext(), s.this.s, this.f26085c);
                if (s.this.f26068u != null) {
                    s.this.m.removeCallbacks(this);
                    if (s.this.f26068u.p()) {
                        s.this.b(d.INITIATED);
                        new pn().a(s.this.f26068u.c().getApplicationConfigurations().e().b(), pVarJ.z());
                        j4 j4VarF = s.this.f26068u.c().getApplicationConfigurations().f();
                        if (j4VarF != null) {
                            xa xaVar = xa.f27681a;
                            xaVar.c(j4VarF.getShouldUseAppSet());
                            xaVar.a(j4VarF.getShouldReuseAdvId());
                            xaVar.a(j4VarF.getUserAgentExpirationThresholdInHours());
                            IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(j4VarF.getShouldUseSharedThreadPool());
                            s.this.f26061c.a(j4VarF);
                        }
                        s.this.a(ContextProvider.getInstance().getApplicationContext(), s.this.f26068u);
                        pVarJ.a(new Date().getTime() - s.this.x, s.this.f26068u.h());
                        if (j4VarF != null && j4VarF.getShouldRegisterTrigger()) {
                            new gr(on.U().z(), new androidx.room.e(7), on.U(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                        }
                        s.this.f26059a = new tt();
                        s.this.f26059a.a(s.this.f26061c);
                        if (s.this.f26068u.c().getApplicationConfigurations().g() && ContextProvider.getInstance().getApplicationContext() != null) {
                            IntegrationHelper.validateIntegration(ContextProvider.getInstance().getApplicationContext());
                        }
                        List<IronSource.AD_UNIT> listG = s.this.f26068u.g();
                        Iterator it = s.this.r.iterator();
                        while (it.hasNext()) {
                            ((op) it.next()).a(listG, s.this.h(), s.this.f26068u.c());
                        }
                        new kq.a().a();
                        if (s.this.v != null && (rtVarJ = s.this.f26068u.c().getApplicationConfigurations().j()) != null && !TextUtils.isEmpty(rtVarJ.c())) {
                            s.this.v.onSegmentReceived(rtVarJ.c());
                        }
                        d4 d4VarD = s.this.f26068u.c().getApplicationConfigurations().d();
                        if (d4VarD.f()) {
                            q9.d().a(d4VarD.b(), d4VarD.d(), d4VarD.c(), d4VarD.e(), IronSourceUtils.getSessionId(), d4VarD.a(), d4VarD.g());
                        }
                    } else if (!s.this.f26065l) {
                        s.this.b(d.INIT_FAILED);
                        s.this.f26065l = true;
                        Iterator it2 = s.this.r.iterator();
                        while (it2.hasNext()) {
                            ((op) it2.next()).d("serverResponseIsNotValid");
                        }
                    }
                } else {
                    if (s.this.g == 3) {
                        s.this.f26069w = true;
                        Iterator it3 = s.this.r.iterator();
                        while (it3.hasNext()) {
                            ((op) it3.next()).a();
                        }
                    }
                    if (this.f26083a && s.this.g < s.this.f26063h) {
                        s.this.k = true;
                        s.this.m.postDelayed(this, s.this.f * 1000);
                        if (s.this.g < s.this.f26064i) {
                            s.a(s.this, 2);
                        }
                    }
                    if ((!this.f26083a || s.this.g == s.this.j) && !s.this.f26065l) {
                        s.this.f26065l = true;
                        if (TextUtils.isEmpty(this.f26084b)) {
                            this.f26084b = "noServerResponse";
                        }
                        Iterator it4 = s.this.r.iterator();
                        while (it4.hasNext()) {
                            ((op) it4.next()).d(this.f26084b);
                        }
                        s.this.b(d.INIT_FAILED);
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    s.f(s.this);
                }
                s.this.e();
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
    }

    public class b implements Runnable {

        public class a extends CountDownTimer {
            public a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (s.this.f26065l) {
                    return;
                }
                s.this.f26065l = true;
                Iterator it = s.this.r.iterator();
                while (it.hasNext()) {
                    ((op) it.next()).d("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    s.this.f26069w = true;
                    Iterator it = s.this.r.iterator();
                    while (it.hasNext()) {
                        ((op) it.next()).a();
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.q = new a(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, MBInterstitialActivity.WEB_LOAD_TIME).start();
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26074a;

        static {
            int[] iArr = new int[d.values().length];
            f26074a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26074a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26074a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f26079a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f26080b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f26081c = 2;
        public static int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f26082e = 4;
        public static int f = 5;
    }

    public abstract class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f26084b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f26083a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected p.c f26085c = new a();

        public class a implements p.c {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.p.c
            public void a(String str) {
                f fVar = f.this;
                fVar.f26083a = false;
                fVar.f26084b = str;
            }
        }

        public f() {
        }
    }

    private s() {
    }

    private static int a(d dVar) {
        int i2 = c.f26074a[dVar.ordinal()];
        if (i2 == 1) {
            return e.d;
        }
        if (i2 != 2) {
            return i2 != 3 ? e.f26079a : e.f26080b;
        }
        return e.f26082e;
    }

    public static synchronized s c() {
        try {
            if (f26058A == null) {
                f26058A = new s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f26058A;
    }

    public static /* synthetic */ int f(s sVar) {
        int i2 = sVar.g;
        sVar.g = i2 + 1;
        return i2;
    }

    public int b() {
        return this.f26060b;
    }

    public synchronized boolean d() {
        return this.f26069w;
    }

    public static /* synthetic */ int a(s sVar, int i2) {
        int i3 = sVar.f * i2;
        sVar.f = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (on.U().d().g()) {
            on.U().z().a(new zb(ac.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.k;
    }

    public void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int iA = a(a());
        this.f26060b = iA;
        this.y.c(iA);
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        et.f24941a.a(dt.values()[dVar.ordinal()]);
    }

    public void b(op opVar) {
        if (opVar == null || this.r.size() == 0) {
            return;
        }
        this.r.remove(opVar);
    }

    public synchronized d a() {
        return d.values()[et.f24941a.a().ordinal()];
    }

    public void a(Context context, qt qtVar) {
        this.y.i(qtVar.f().h());
        this.y.c(qtVar.f().d());
        z3 applicationConfigurations = qtVar.c().getApplicationConfigurations();
        this.y.a(applicationConfigurations.a());
        this.y.d(applicationConfigurations.c().b());
        this.y.b(applicationConfigurations.k().b());
        this.y.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        j4 j4VarF = qtVar.c().getApplicationConfigurations().f();
        this.y.b(j4VarF.getCmpId());
        on.O().x().a(j4VarF.getCom.ironsource.d9.a.c java.lang.String());
    }

    public synchronized void a(Context context, String str, String str2, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.o;
                if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f26062e + ": Multiple calls to init are not allowed", 2);
                } else {
                    b(d.INIT_IN_PROGRESS);
                    this.s = str2;
                    this.t = str;
                    if (IronSourceUtils.isNetworkConnected(context)) {
                        this.m.post(this.f26070z);
                    } else {
                        this.f26066n = true;
                        if (this.f26067p == null) {
                            this.f26067p = new NetworkStateReceiver(context, this);
                        }
                        context.registerReceiver(this.f26067p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(SegmentListener segmentListener) {
        this.v = segmentListener;
    }

    public void a(op opVar) {
        if (opVar == null) {
            return;
        }
        this.r.add(opVar);
    }

    @Override // com.p004ironsource.fp
    public void a(boolean z2) {
        if (this.f26066n && z2) {
            CountDownTimer countDownTimer = this.q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f26066n = false;
            this.k = true;
            on.U().z().a(new zb(ac.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.getMediationAdditionalData(false)));
            this.m.post(this.f26070z);
        }
    }
}
