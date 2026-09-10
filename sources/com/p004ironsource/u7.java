package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.events.ISErrorListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u7 implements zf {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int[] f27376A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int[] f27377B;
    private int[] C;
    int G;
    String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    String f27380I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    Set<Integer> f27381J;
    private cc K;
    private IronSourceSegment L;
    private rt M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ISErrorListener f27382N;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27389l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private fa f27391p;
    private AbstractC3351e q;
    private ArrayList<zb> r;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private fi f27392u;
    private Context v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int[] f27394z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f27383a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f27384b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f27385c = 5000;
    final int d = com.smartdigimkt.b0.a.Q1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f27386e = 1024;
    final int f = 5;
    final String g = "supersonic_sdk.db";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f27387h = IronSourceConstants.EVENTS_PROVIDER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f27388i = "placement";
    private final String j = ne.N0;
    private final String k = ne.Y0;
    private boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27390n = false;
    private int o = -1;
    private boolean s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27393w = 100;
    private int x = 5000;
    private int y = 1;
    private Map<String, String> D = new HashMap();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Map<String, String> f27378E = new HashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f27379F = "";
    private final Object O = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u7.this.a();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zb f27396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSource.AD_UNIT f27397b;

        public b(zb zbVar, IronSource.AD_UNIT ad_unit) {
            this.f27396a = zbVar;
            this.f27397b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27396a.a("eventSessionId", u7.this.f27392u.b());
            this.f27396a.a("essn", Integer.valueOf(u7.this.f27392u.c()));
            String connectionType = IronSourceUtils.getConnectionType(u7.this.v);
            if (u7.this.g(this.f27396a)) {
                this.f27396a.a(d9.i.t, connectionType);
            }
            if (u7.this.a(connectionType, this.f27396a)) {
                zb zbVar = this.f27396a;
                zbVar.a(u7.this.b(zbVar));
            }
            String strD = a9.d(u7.this.v);
            if (strD != null) {
                this.f27396a.a(d9.i.f24758u, strD);
            }
            int iA = u7.this.a(this.f27396a.c(), this.f27397b);
            if (iA != e.NOT_SUPPORTED.a()) {
                this.f27396a.a("adUnit", Integer.valueOf(iA));
            }
            u7.this.a(this.f27396a, "reason");
            u7.this.a(this.f27396a, IronSourceConstants.EVENTS_EXT1);
            if (!u7.this.f27378E.isEmpty()) {
                for (Map.Entry entry : u7.this.f27378E.entrySet()) {
                    if (!this.f27396a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f27396a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (u7.this.i(this.f27396a)) {
                if (u7.this.h(this.f27396a) && !u7.this.e(this.f27396a)) {
                    this.f27396a.a("sessionDepth", Integer.valueOf(u7.this.c(this.f27396a)));
                }
                if (u7.this.j(this.f27396a)) {
                    u7.this.f(this.f27396a);
                }
                long jA = u7.this.f27392u.a();
                if (jA > 0) {
                    this.f27396a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.f27396a.toString());
                u7.this.r.add(this.f27396a);
                u7.d(u7.this);
            }
            u7 u7Var = u7.this;
            boolean zA = u7Var.a(u7Var.f27377B) ? u7.this.a(this.f27396a.c(), u7.this.f27377B) : u7.this.d(this.f27396a);
            if (!u7.this.m && zA) {
                u7.this.m = true;
            }
            if (u7.this.f27391p != null) {
                if (u7.this.g()) {
                    u7.this.f();
                    return;
                }
                u7 u7Var2 = u7.this;
                if (u7Var2.b((ArrayList<zb>) u7Var2.r) || zA) {
                    u7.this.a();
                }
            }
        }
    }

    public class c implements ag {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ag.a aVar) {
            try {
                if (aVar.c()) {
                    ArrayList<zb> arrayListA = u7.this.f27391p.a(u7.this.f27380I);
                    u7.this.t = arrayListA.size() + u7.this.r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    u7.this.a(u7.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                if (u7.this.f27382N != null) {
                    u7.this.f27382N.onError(new IllegalStateException("Error on sending data ", e2));
                }
            }
            a(aVar.b());
        }

        @Override // com.p004ironsource.ag
        public synchronized void a(ag.a aVar) {
            u7.this.K.a(new G0(1, this, aVar));
        }

        public void a(ArrayList<zb> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error("clearData exception: " + e2.getMessage());
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u7.this.f();
        }
    }

    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27404a;

        e(int i2) {
            this.f27404a = i2;
        }

        public int a() {
            return this.f27404a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i2, IronSource.AD_UNIT ad_unit) {
        e eVar;
        int iA = e.NOT_SUPPORTED.a();
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO || ((i2 >= 1000 && i2 < 2000) || (i2 >= 91000 && i2 < 92000))) {
            eVar = e.REWARDED_VIDEO;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ((i2 >= 2000 && i2 < 3000) || (i2 >= 92000 && i2 < 93000))) {
            eVar = e.INTERSTITIAL;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER || ((i2 >= 3000 && i2 < 4000) || (i2 >= 93000 && i2 < 94000))) {
            eVar = e.BANNER;
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD && ((i2 < 4000 || i2 >= 5000) && (i2 < 94000 || i2 >= 95000))) {
                return iA;
            }
            eVar = e.NATIVE_AD;
        }
        return eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(zb zbVar) {
        return zbVar.c() + com.smartdigimkt.b0.a.Q1;
    }

    public static /* synthetic */ int d(u7 u7Var) {
        int i2 = u7Var.t;
        u7Var.t = i2 + 1;
        return i2;
    }

    public abstract int c(zb zbVar);

    public abstract void d();

    public abstract boolean d(zb zbVar);

    public abstract String e(int i2);

    public void e() {
        this.r = new ArrayList<>();
        this.t = 0;
        this.q = hc.a(this.H, this.G);
        cc ccVar = new cc(android.support.v4.media.a.r(new StringBuilder(), this.f27380I, "EventThread"));
        this.K = ccVar;
        ccVar.start();
        this.K.a();
        this.f27392u = on.U().h();
        this.f27381J = new HashSet();
        d();
    }

    public int f(int i2) {
        return a(i2, (IronSource.AD_UNIT) null);
    }

    public abstract void f(zb zbVar);

    public void h() {
        this.K.a(new d());
    }

    public abstract boolean j(zb zbVar);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f() {
        ArrayList<zb> arrayListA;
        try {
            this.m = false;
            ArrayList<zb> arrayList = new ArrayList<>();
            try {
                synchronized (this.O) {
                    arrayListA = this.f27391p.a(this.f27380I);
                    this.f27391p.b(this.f27380I);
                }
                ec.c cVar = new ec.c(new ec.a(arrayListA, this.r), this.x);
                this.f27391p.a(cVar.a(), this.f27380I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                q9.d().a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                ISErrorListener iSErrorListener = this.f27382N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new IllegalStateException("Combined event exception: ", th));
                }
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject jSONObjectB = ke.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put(ne.N0, strB);
                    }
                    String strN = p.j().n();
                    if (!TextUtils.isEmpty(strN)) {
                        jSONObjectB.put(ne.Y0, strN);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new jc().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th2) {
                    q9.d().a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String strA = this.q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener2 = this.f27382N;
                    if (iSErrorListener2 != null) {
                        iSErrorListener2.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.f27390n) {
                    try {
                        strA = Base64.encodeToString(fk.a(strA, this.o), 0);
                    } catch (Exception e2) {
                        q9.d().a(e2);
                        ISErrorListener iSErrorListener3 = this.f27382N;
                        if (iSErrorListener3 != null) {
                            iSErrorListener3.onError(new IllegalStateException("Error on compression: ", e2));
                        }
                    }
                }
                bv.f24465a.a(new kc(new c(), strA, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            q9.d().a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.f27393w || this.m) && this.f27389l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(zb zbVar) {
        if (zbVar == null) {
            return false;
        }
        if (a(this.f27394z)) {
            return !a(zbVar.c(), this.f27394z);
        }
        if (a(this.f27376A)) {
            return a(zbVar.c(), this.f27376A);
        }
        return true;
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.p004ironsource.zf
    public void d(int i2) {
        this.o = i2;
    }

    public String b() {
        return this.f27379F;
    }

    @Override // com.p004ironsource.zf
    public void c(int i2) {
        if (i2 > 0) {
            this.y = i2;
        }
    }

    @Override // com.p004ironsource.zf
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f27380I, iArr);
    }

    public boolean g(zb zbVar) {
        return (zbVar.c() == ac.CONSENT_TRUE_CODE.getId() || zbVar.c() == ac.CONSENT_FALSE_CODE.getId() || zbVar.c() == ac.SET_META_DATA.getId() || zbVar.c() == ac.SET_META_DATA_AFTER_INIT.getId() || zbVar.c() == ac.SET_USER_ID.getId()) ? false : true;
    }

    public boolean h(zb zbVar) {
        return (zbVar.c() == ac.FIRST_INSTANCE.getId() || zbVar.c() == ac.FIRST_INSTANCE_RESULT.getId() || zbVar.c() == ac.INIT_COMPLETE.getId() || zbVar.c() == ac.SDK_INIT_FAILED.getId() || zbVar.c() == ac.SDK_INIT_SUCCESS.getId() || zbVar.c() == ac.USING_CACHE_FOR_INIT_EVENT.getId() || zbVar.c() == ac.CONSENT_TRUE_CODE.getId() || zbVar.c() == ac.CONSENT_FALSE_CODE.getId() || zbVar.c() == ac.SET_META_DATA.getId() || zbVar.c() == ac.SET_META_DATA_AFTER_INIT.getId() || zbVar.c() == ac.SET_USER_ID.getId()) ? false : true;
    }

    @Override // com.p004ironsource.zf
    public void b(int i2) {
        if (i2 > 0) {
            this.f27393w = i2;
        }
    }

    public void c(boolean z2) {
        this.f27389l = z2;
    }

    private void b(String str) {
        AbstractC3351e abstractC3351e = this.q;
        if (abstractC3351e == null || !abstractC3351e.c().equals(str)) {
            this.q = hc.a(str, this.G);
        }
    }

    public String a(String str, int i2) {
        return (TextUtils.isEmpty(str) || str.length() <= i2) ? str : str.substring(0, i2);
    }

    @Override // com.p004ironsource.zf
    public void c(int[] iArr, Context context) {
        this.f27394z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f27380I, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(zb zbVar) {
        JSONObject jSONObjectB = zbVar.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    @Override // com.p004ironsource.zf
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3351e abstractC3351e = this.q;
        if (abstractC3351e != null) {
            abstractC3351e.a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.f27380I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<zb> a(ArrayList<zb> arrayList, String str) {
        String strA = a(str, 1024);
        Iterator<zb> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    public void b(Map<String, String> map) {
        this.f27378E.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.O) {
            this.f27391p.a(this.r, this.f27380I);
            this.r.clear();
        }
    }

    @Override // com.p004ironsource.zf
    public void b(boolean z2) {
        this.s = z2;
    }

    @Override // com.p004ironsource.zf
    public void a(int i2) {
        if (i2 > 0) {
            this.x = i2;
        }
    }

    @Override // com.p004ironsource.zf
    public void b(int[] iArr, Context context) {
        this.f27377B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f27380I, iArr);
    }

    public synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f27380I, this.H);
        this.H = defaultEventsFormatterType;
        b(defaultEventsFormatterType);
        this.q.a(IronSourceUtils.getDefaultEventsURL(context, this.f27380I, null));
        this.f27391p = fa.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.f27394z = IronSourceUtils.getDefaultOptOutEvents(context, this.f27380I);
        this.f27376A = IronSourceUtils.getDefaultOptInEvents(context, this.f27380I);
        this.f27377B = IronSourceUtils.getDefaultTriggerEvents(context, this.f27380I);
        this.C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f27380I);
        this.L = ironSourceSegment;
        this.v = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<zb> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.L = ironSourceSegment;
    }

    public void a(ISErrorListener iSErrorListener) {
        this.f27382N = iSErrorListener;
    }

    public synchronized void a(rt rtVar) {
        this.M = rtVar;
    }

    @Override // com.p004ironsource.zf
    public synchronized void a(zb zbVar) {
        a(zbVar, (IronSource.AD_UNIT) null);
    }

    public synchronized void a(zb zbVar, IronSource.AD_UNIT ad_unit) {
        if (zbVar != null) {
            if (this.s) {
                this.K.a(new b(zbVar, ad_unit));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(zb zbVar, String str) {
        a(zbVar, str, 1024);
    }

    private void a(zb zbVar, String str, int i2) {
        JSONObject jSONObjectB = zbVar.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            zbVar.a(str, a(jSONObjectB.optString(str, null), i2));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }

    public void a(String str) {
        this.f27379F = str;
    }

    @Override // com.p004ironsource.zf
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.f27380I, str);
        b(str);
    }

    public void a(ArrayList<zb> arrayList) {
        if (arrayList != null) {
            synchronized (this.O) {
                this.f27391p.a(arrayList, this.f27380I);
                this.t = this.f27391p.a(this.f27380I).size() + this.r.size();
            }
        }
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i2, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(JSONObject jSONObject) {
        try {
            IronSourceSegment ironSourceSegment = this.L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put("age", this.L.getAge());
                }
                if (!TextUtils.isEmpty(this.L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.L.getGender());
                }
                if (this.L.getLevel() > 0) {
                    jSONObject.put("lvl", this.L.getLevel());
                }
                if (this.L.getIsPaying() != null) {
                    jSONObject.put("pay", this.L.getIsPaying().get());
                }
                if (this.L.getIapt() > 0.0d) {
                    jSONObject.put("iapt", this.L.getIapt());
                }
                if (this.L.getUcd() > 0) {
                    jSONObject.put("ucd", this.L.getUcd());
                }
            }
            rt rtVar = this.M;
            if (rtVar != null) {
                String strB = rtVar.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.p004ironsource.zf
    public void a(boolean z2) {
        this.f27390n = z2;
    }

    @Override // com.p004ironsource.zf
    public void a(int[] iArr, Context context) {
        this.f27376A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f27380I, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i2, int[] iArr) {
        if (a(iArr)) {
            for (int i3 : iArr) {
                if (i2 == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, zb zbVar) {
        try {
            if (str.equalsIgnoreCase("none")) {
                return a(this.C) ? a(zbVar.c(), this.C) : this.f27381J.contains(Integer.valueOf(zbVar.c()));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }
}
