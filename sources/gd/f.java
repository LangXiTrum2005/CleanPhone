package gd;

import com.google.android.gms.internal.ads.ws;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import ld.g;
import nd.c0;
import nd.k0;
import nd.w;
import nd.z;
import xn.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends cd.d implements jd.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final fd.a f41854i = fd.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GaugeManager f41856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f41857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f41858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f41859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41862h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(g gVar) {
        cd.c cVarA = cd.c.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(cVarA);
        this.f41858d = c0.N();
        this.f41859e = new WeakReference(this);
        this.f41857c = gVar;
        this.f41856b = gaugeManager;
        this.f41855a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // jd.b
    public final void a(jd.a aVar) {
        if (aVar == null) {
            f41854i.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        w wVar = this.f41858d;
        if (!wVar.l() || wVar.n()) {
            return;
        }
        this.f41855a.add(aVar);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f41859e);
        unregisterForAppState();
        synchronized (this.f41855a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (jd.a aVar : this.f41855a) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k0[] k0VarArrB = jd.a.b(listUnmodifiableList);
        if (k0VarArrB != null) {
            this.f41858d.d(Arrays.asList(k0VarArrB));
        }
        c0 c0Var = (c0) this.f41858d.build();
        String str = this.f41860f;
        if (str == null) {
            Pattern pattern = id.g.f43004a;
        } else if (id.g.f43004a.matcher(str).matches()) {
            f41854i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.f41861g) {
            if (this.f41862h) {
                f41854i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
        } else {
            g gVar = this.f41857c;
            gVar.f45310i.execute(new ld.f(gVar, c0Var, getAppState(), 2));
            this.f41861g = true;
        }
    }

    public final void c(String str) {
        z zVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    zVar = z.OPTIONS;
                    break;
                case "GET":
                    zVar = z.GET;
                    break;
                case "PUT":
                    zVar = z.PUT;
                    break;
                case "HEAD":
                    zVar = z.HEAD;
                    break;
                case "POST":
                    zVar = z.POST;
                    break;
                case "PATCH":
                    zVar = z.PATCH;
                    break;
                case "TRACE":
                    zVar = z.TRACE;
                    break;
                case "CONNECT":
                    zVar = z.CONNECT;
                    break;
                case "DELETE":
                    zVar = z.DELETE;
                    break;
                default:
                    zVar = z.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f41858d.q(zVar);
        }
    }

    public final void d(int i10) {
        this.f41858d.r(i10);
    }

    public final void e(long j10) {
        this.f41858d.t(j10);
    }

    public final void f(long j10) {
        jd.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f41859e);
        this.f41858d.p(j10);
        a(aVarPerfSession);
        if (aVarPerfSession.f43818c) {
            this.f41856b.collectGaugeMetricOnce(aVarPerfSession.f43817b);
        }
    }

    public final void g(String str) {
        w wVar = this.f41858d;
        if (str == null) {
            wVar.j();
            return;
        }
        if (str.length() <= 128) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            wVar.u(str);
            return;
        }
        f41854i.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void h(long j10) {
        this.f41858d.v(j10);
    }

    public final void i(long j10) {
        this.f41858d.x(j10);
        if (SessionManager.getInstance().perfSession().f43818c) {
            this.f41856b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f43817b);
        }
    }

    public final void j(String str) {
        m mVarA;
        int iLastIndexOf;
        if (str != null) {
            m mVarA2 = null;
            try {
                ws wsVar = new ws();
                wsVar.c(null, str);
                mVarA = wsVar.a();
            } catch (IllegalArgumentException unused) {
                mVarA = null;
            }
            if (mVarA != null) {
                ws wsVarF = mVarA.f();
                wsVarF.f21596d = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
                wsVarF.f21597e = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
                wsVarF.f21600h = null;
                wsVarF.f21601i = null;
                str = wsVarF.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        ws wsVar2 = new ws();
                        wsVar2.c(null, str);
                        mVarA2 = wsVar2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (mVarA2 != null && mVarA2.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            this.f41858d.z(str);
        }
    }
}
