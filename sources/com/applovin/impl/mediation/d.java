package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.c3;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v2;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.x5;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8583b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8584c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8585d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8586e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8587f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8588g = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements r5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f8590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c3 f8592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f8593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0010a f8594f;

        public a(long j10, Map map, String str, c3 c3Var, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
            this.f8589a = j10;
            this.f8590b = map;
            this.f8591c = str;
            this.f8592d = c3Var;
            this.f8593e = context;
            this.f8594f = interfaceC0010a;
        }

        @Override // com.applovin.impl.r5.b
        public void a(JSONArray jSONArray) {
            this.f8590b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f8589a));
            this.f8590b.put("calfc", Integer.valueOf(d.this.b(this.f8591c)));
            x5 x5Var = new x5(this.f8592d, jSONArray, this.f8593e, d.this.f8582a, this.f8594f);
            if (((Boolean) d.this.f8582a.a(t3.f9786u8)).booleanValue()) {
                d.this.f8582a.s0().a((k5) x5Var, f6.b.MEDIATION);
            } else {
                d.this.f8582a.s0().a(x5Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements com.applovin.impl.mediation.ads.a.InterfaceC0010a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f8596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f8597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f8598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f8599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f8600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f8601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f8602g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f8603h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f8604i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f8605j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f8606k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.l lVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, dVar, lVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f8598c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8605j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f8596a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f8606k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && q7.c(this.f8596a) && ((Boolean) this.f8596a.a(z4.E6)).booleanValue();
            if (this.f8596a.a(t3.f9776o8, this.f8600e) && this.f8599d.f8609c < this.f8604i && !z10) {
                c.e(this.f8599d);
                int iPow = (int) Math.pow(2.0d, this.f8599d.f8609c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new n(this, iPow, str, 0), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f8599d.f8609c = 0;
            this.f8599d.f8608b.set(false);
            if (this.f8599d.f8610d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f8599d.f8607a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                v2.a(this.f8599d.f8610d, str, maxError2);
                this.f8599d.f8610d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a3 a3Var = (a3) maxAd;
            a3Var.i(this.f8599d.f8607a);
            a3Var.a(SystemClock.elapsedRealtime() - this.f8605j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) a3Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f8596a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f8606k, a3Var.getRequestLatencyMillis());
            }
            this.f8598c.a(maxAd.getAdUnitId());
            this.f8599d.f8609c = 0;
            if (this.f8599d.f8610d == null) {
                this.f8598c.a(a3Var);
                this.f8599d.f8608b.set(false);
                return;
            }
            a3Var.B().c().a(this.f8599d.f8610d);
            this.f8599d.f8610d.onAdLoaded(a3Var);
            if (a3Var.R().endsWith("load")) {
                this.f8599d.f8610d.onAdRevenuePaid(a3Var);
            }
            this.f8599d.f8610d = null;
            if (((Boolean) this.f8596a.a(t3.k8)).booleanValue() || !this.f8598c.a(maxAd)) {
                this.f8599d.f8608b.set(false);
                return;
            }
            Context contextP = (Context) this.f8597b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            Context context = contextP;
            this.f8605j = SystemClock.elapsedRealtime();
            this.f8606k = System.currentTimeMillis();
            this.f8603h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f8598c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f8601f, this.f8602g, this.f8603h, context, this);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.l lVar, Context context) {
            this.f8596a = lVar;
            this.f8597b = new WeakReference(context);
            this.f8598c = dVar;
            this.f8599d = cVar;
            this.f8600e = maxAdFormat;
            this.f8602g = map2;
            this.f8601f = map;
            this.f8603h = map3;
            this.f8605j = j10;
            this.f8606k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f8604i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f8604i = Math.min(2, ((Integer) lVar.a(t3.f9775n8)).intValue());
            } else {
                this.f8604i = ((Integer) lVar.a(t3.f9775n8)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f8602g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f8602g.put("retry_attempt", Integer.valueOf(this.f8599d.f8609c));
            Context contextP = (Context) this.f8597b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            Context context = contextP;
            this.f8603h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f8603h.put("era", Integer.valueOf(this.f8599d.f8609c));
            this.f8606k = System.currentTimeMillis();
            this.f8598c.a(str, this.f8600e, this.f8601f, this.f8602g, this.f8603h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f8608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0010a f8610d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f8609c;
            cVar.f8609c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f8608b = new AtomicBoolean();
            this.f8607a = str;
        }
    }

    public d(com.applovin.impl.sdk.l lVar) {
        this.f8582a = lVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbI = d5.u.i(str);
        sbI.append(str2 != null ? "-".concat(str2) : "");
        return sbI.toString();
    }

    private a3 e(String str) {
        a3 a3Var;
        synchronized (this.f8586e) {
            a3Var = (a3) this.f8585d.get(str);
            this.f8585d.remove(str);
        }
        return a3Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f8584c) {
            this.f8583b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f8586e) {
            z10 = this.f8585d.get(str) != null;
        }
        return z10;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        a3 a3VarE;
        if (this.f8582a.u0().d() || q7.h(com.applovin.impl.sdk.l.p())) {
            a3VarE = null;
        } else if (interfaceC0010a == null && d(str)) {
            return;
        } else {
            a3VarE = e(str);
        }
        if (a3VarE != null) {
            a3VarE.i(str2);
            a3VarE.B().c().a(interfaceC0010a);
            interfaceC0010a.onAdLoaded(a3VarE);
            if (a3VarE.R().endsWith("load")) {
                interfaceC0010a.onAdRevenuePaid(a3VarE);
            }
            if (((Boolean) this.f8582a.a(t3.k8)).booleanValue() && a((MaxAd) a3VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f8608b.compareAndSet(false, true)) {
            if (cVarA.f8610d != null && cVarA.f8610d != interfaceC0010a) {
                com.applovin.impl.sdk.p.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f8610d = interfaceC0010a;
            return;
        }
        if (a3VarE == null) {
            cVarA.f8610d = interfaceC0010a;
        }
        Map mapW = defpackage.e.w();
        mapW.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapW.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapW, context, new b(map, map2, mapW, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f8582a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f8588g) {
            try {
                this.f8582a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8582a.Q().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f8587f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f8587f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f8588g) {
            try {
                Integer num = (Integer) this.f8587f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c3 c3Var = new c3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f8582a.s0().a((k5) new r5(c3Var, context, this.f8582a, new a(jElapsedRealtime, map3, str, c3Var, context, interfaceC0010a)), f6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f8582a.a(z4.R4)).booleanValue()) {
            w3 w3VarA0 = this.f8582a.a0();
            u3 u3Var = u3.f9822e;
            Map mapA = w3VarA0.a(u3Var, v3.a(str));
            u3.a aVar = u3.a.SESSION;
            int iA = a(mapA, aVar);
            u3.a aVar2 = u3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f8582a.a0().a(u3Var, v3.a(maxAdFormat));
            return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, u3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var) {
        synchronized (this.f8586e) {
            try {
                if (this.f8585d.containsKey(a3Var.getAdUnitId())) {
                    com.applovin.impl.sdk.p.h("AppLovinSdk", "Ad in cache already: " + a3Var.getAdUnitId());
                }
                this.f8585d.put(a3Var.getAdUnitId(), a3Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f8584c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f8583b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f8583b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f8588g) {
            try {
                this.f8582a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8582a.Q().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f8587f.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f8582a.c(t3.f9771i8).contains(maxAd.getAdUnitId()) && !this.f8582a.a(t3.h8, maxAd.getFormat())) || this.f8582a.u0().c() || this.f8582a.u0().d()) ? false : true;
    }
}
