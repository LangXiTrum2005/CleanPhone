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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8649b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8650c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8651d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8652e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8653f = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f8654g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f8655h = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements r5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f8657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c3 f8659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f8660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0010a f8661f;

        public a(long j10, Map map, String str, c3 c3Var, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
            this.f8656a = j10;
            this.f8657b = map;
            this.f8658c = str;
            this.f8659d = c3Var;
            this.f8660e = context;
            this.f8661f = interfaceC0010a;
        }

        @Override // com.applovin.impl.r5.b
        public void a(JSONArray jSONArray) {
            this.f8657b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f8656a));
            this.f8657b.put("calfc", Integer.valueOf(e.this.b(this.f8658c)));
            x5 x5Var = new x5(this.f8659d, jSONArray, this.f8660e, e.this.f8648a, this.f8661f);
            if (((Boolean) e.this.f8648a.a(t3.f9786u8)).booleanValue()) {
                e.this.f8648a.s0().a((k5) x5Var, f6.b.MEDIATION);
            } else {
                e.this.f8648a.s0().a(x5Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements com.applovin.impl.mediation.ads.a.InterfaceC0010a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f8663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f8664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f8665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f8666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f8667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f8668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f8669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f8670h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f8671i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f8672j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f8673k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.l lVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, eVar, lVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f8665c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8672j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f8663a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f8673k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && q7.c(this.f8663a) && ((Boolean) this.f8663a.a(z4.E6)).booleanValue();
            if (this.f8663a.a(t3.f9776o8, this.f8667e) && this.f8666d.f8676c < this.f8671i && !z10) {
                c.e(this.f8666d);
                int iPow = (int) Math.pow(2.0d, this.f8666d.f8676c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new n(this, iPow, str, 1), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f8666d.f8676c = 0;
            this.f8666d.f8675b.set(false);
            if (this.f8666d.f8677d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f8666d.f8674a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                v2.a(this.f8666d.f8677d, str, maxError2);
                this.f8666d.f8677d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            a3 a3Var = (a3) maxAd;
            a3Var.i(this.f8666d.f8674a);
            a3Var.a(SystemClock.elapsedRealtime() - this.f8672j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) a3Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f8663a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f8673k, a3Var.getRequestLatencyMillis());
            }
            this.f8665c.a(maxAd.getAdUnitId());
            this.f8666d.f8676c = 0;
            if (this.f8666d.f8677d == null) {
                this.f8665c.a(a3Var);
                this.f8666d.f8675b.set(false);
                int iO = a3Var.O();
                synchronized (this.f8665c.f8652e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f8665c.f8651d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iO) {
                    int i10 = sizeSafely + 1;
                    this.f8663a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8663a.Q().a("MediationAdLoadManagerV2", defpackage.e.g(i10, iO, "Preloading waterfall ", " of "));
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            a3Var.B().c().a(this.f8666d.f8677d);
            this.f8666d.f8677d.onAdLoaded(a3Var);
            this.f8665c.f8653f.put(maxAd.getAdUnitId(), a3Var);
            if (a3Var.R().endsWith("load")) {
                this.f8666d.f8677d.onAdRevenuePaid(a3Var);
            }
            this.f8666d.f8677d = null;
            if ((!this.f8663a.c(t3.f9771i8).contains(maxAd.getAdUnitId()) && !this.f8663a.a(t3.h8, maxAd.getFormat())) || this.f8663a.u0().c() || this.f8663a.u0().d()) {
                this.f8666d.f8675b.set(false);
                return;
            }
            int iO2 = a3Var.O();
            this.f8663a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8663a.Q().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iO2);
            }
            a(maxAd);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.l lVar, Context context) {
            this.f8663a = lVar;
            this.f8664b = new WeakReference(context);
            this.f8665c = eVar;
            this.f8666d = cVar;
            this.f8667e = maxAdFormat;
            this.f8669g = map2;
            this.f8668f = map;
            this.f8670h = map3;
            this.f8672j = j10;
            this.f8673k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f8671i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f8671i = Math.min(2, ((Integer) lVar.a(t3.f9775n8)).intValue());
            } else {
                this.f8671i = ((Integer) lVar.a(t3.f9775n8)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextP = (Context) this.f8664b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            Context context = contextP;
            this.f8672j = SystemClock.elapsedRealtime();
            this.f8673k = System.currentTimeMillis();
            this.f8670h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f8665c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f8668f, this.f8669g, this.f8670h, context, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f8669g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f8669g.put("retry_attempt", Integer.valueOf(this.f8666d.f8676c));
            Context contextP = (Context) this.f8664b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            Context context = contextP;
            this.f8670h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f8670h.put("era", Integer.valueOf(this.f8666d.f8676c));
            this.f8673k = System.currentTimeMillis();
            this.f8665c.a(str, this.f8667e, this.f8668f, this.f8669g, this.f8670h, context, this);
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
        private final String f8674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f8675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0010a f8677d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f8676c;
            cVar.f8676c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f8675b = new AtomicBoolean();
            this.f8674a = str;
        }
    }

    public e(com.applovin.impl.sdk.l lVar) {
        this.f8648a = lVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbI = d5.u.i(str);
        sbI.append(str2 != null ? "-".concat(str2) : "");
        return sbI.toString();
    }

    private a3 f(String str) {
        synchronized (this.f8652e) {
            try {
                Queue queue = (Queue) this.f8651d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (a3) queue.poll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f8652e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f8651d.get(str));
        }
        return z10;
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        a3 a3Var = (a3) this.f8653f.get(str);
        if (a3Var != null) {
            arrayDeque.add(a3Var);
        }
        synchronized (this.f8650c) {
            try {
                Queue queue = (Queue) this.f8651d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f8655h) {
            try {
                this.f8648a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8648a.Q().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f8654g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f8654g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        a3 a3VarF = (this.f8648a.u0().d() || q7.h(com.applovin.impl.sdk.l.p())) ? null : f(str);
        if (a3VarF != null) {
            a3VarF.i(str2);
            a3VarF.B().c().a(interfaceC0010a);
            interfaceC0010a.onAdLoaded(a3VarF);
            this.f8653f.put(str, a3VarF);
            if (a3VarF.R().endsWith("load")) {
                interfaceC0010a.onAdRevenuePaid(a3VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f8675b.compareAndSet(false, true)) {
            if (cVarA.f8677d != null && cVarA.f8677d != interfaceC0010a) {
                com.applovin.impl.sdk.p.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f8677d = interfaceC0010a;
            return;
        }
        if (a3VarF == null) {
            cVarA.f8677d = interfaceC0010a;
        }
        Map mapW = defpackage.e.w();
        mapW.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapW.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapW, context, new b(map, map2, mapW, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f8648a, context, null));
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f8655h) {
            try {
                Integer num = (Integer) this.f8654g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void c(String str, String str2) {
        synchronized (this.f8650c) {
            this.f8649b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c3 c3Var = new c3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f8648a.s0().a((k5) new r5(c3Var, context, this.f8648a, new a(jElapsedRealtime, map3, str, c3Var, context, interfaceC0010a)), f6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f8648a.a(z4.R4)).booleanValue()) {
            w3 w3VarA0 = this.f8648a.a0();
            u3 u3Var = u3.f9822e;
            Map mapA = w3VarA0.a(u3Var, v3.a(str));
            u3.a aVar = u3.a.SESSION;
            int iA = a(mapA, aVar);
            u3.a aVar2 = u3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f8648a.a0().a(u3Var, v3.a(maxAdFormat));
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
        synchronized (this.f8652e) {
            try {
                Queue arrayDeque = (Queue) this.f8651d.get(a3Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f8651d.put(a3Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(a3Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f8650c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f8649b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f8649b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f8655h) {
            try {
                this.f8648a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8648a.Q().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f8654g.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
