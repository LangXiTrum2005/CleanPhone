package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0437l3 implements C7 {
    static boolean O = false;
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private A5 K;
    private C0265ba L;
    private We M;
    private boolean l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C4 f29129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC0308e f29130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<C0654x5> f29131r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f29133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private J8 f29134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Context f29135v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int[] f29139z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f29115a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f29116b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f29117c = 5000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f29118d = 90000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f29119e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f29120f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f29121g = "supersonic_sdk.db";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f29122h = IronSourceConstants.EVENTS_PROVIDER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f29123i = "placement";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f29124j = "abt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f29125k = O6.f26701b1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29126m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29127n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29128o = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29132s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f29136w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f29137x = 5000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f29138y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* JADX INFO: renamed from: com.ironsource.l3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0437l3.this.a();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0654x5 f29141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSource.a f29142b;

        public b(C0654x5 c0654x5, IronSource.a aVar) {
            this.f29141a = c0654x5;
            this.f29142b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29141a.a("eventSessionId", AbstractC0437l3.this.f29134u.b());
            this.f29141a.a("essn", Integer.valueOf(AbstractC0437l3.this.f29134u.c()));
            String strA = IronSourceUtils.a(AbstractC0437l3.this.f29135v);
            if (AbstractC0437l3.this.g(this.f29141a)) {
                this.f29141a.a("connectionType", strA);
            }
            if (AbstractC0437l3.q(AbstractC0437l3.this, this.f29141a, strA)) {
                C0654x5 c0654x5 = this.f29141a;
                c0654x5.a(AbstractC0437l3.this.b(c0654x5));
            }
            String strD = U3.d(AbstractC0437l3.this.f29135v);
            if (strD != null) {
                this.f29141a.a("rawConnectionType", strD);
            }
            int iA = AbstractC0437l3.this.a(this.f29141a.c(), this.f29142b);
            if (iA != e.NOT_SUPPORTED.b()) {
                this.f29141a.a("adUnit", Integer.valueOf(iA));
            }
            AbstractC0437l3.this.a(this.f29141a, "reason");
            AbstractC0437l3.this.a(this.f29141a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC0437l3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC0437l3.this.E.entrySet()) {
                    if (!this.f29141a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f29141a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC0437l3.this.i(this.f29141a)) {
                if (AbstractC0437l3.this.h(this.f29141a) && !AbstractC0437l3.this.e(this.f29141a)) {
                    this.f29141a.a("sessionDepth", Integer.valueOf(AbstractC0437l3.this.c(this.f29141a)));
                }
                if (AbstractC0437l3.this.j(this.f29141a)) {
                    AbstractC0437l3.this.f(this.f29141a);
                }
                long jA = AbstractC0437l3.this.f29134u.a();
                if (jA > 0) {
                    this.f29141a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.f29141a.toString());
                AbstractC0437l3.this.f29131r.add(this.f29141a);
                AbstractC0437l3.this.f29133t++;
            }
            AbstractC0437l3 abstractC0437l3 = AbstractC0437l3.this;
            boolean zA = abstractC0437l3.a(abstractC0437l3.B) ? AbstractC0437l3.this.a(this.f29141a.c(), AbstractC0437l3.this.B) : AbstractC0437l3.this.d(this.f29141a);
            AbstractC0437l3 abstractC0437l4 = AbstractC0437l3.this;
            if (!abstractC0437l4.f29126m && zA) {
                abstractC0437l4.f29126m = true;
            }
            if (abstractC0437l4.f29129p != null) {
                if (abstractC0437l4.g()) {
                    AbstractC0437l3.this.f();
                    return;
                }
                AbstractC0437l3 abstractC0437l5 = AbstractC0437l3.this;
                if (abstractC0437l5.b((ArrayList<C0654x5>) abstractC0437l5.f29131r) || zA) {
                    AbstractC0437l3.this.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements D7 {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(D7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC0437l3 abstractC0437l3 = AbstractC0437l3.this;
                    ArrayList<C0654x5> arrayListA = abstractC0437l3.f29129p.a(abstractC0437l3.I);
                    AbstractC0437l3.this.f29133t = arrayListA.size() + AbstractC0437l3.this.f29131r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC0437l3.this.a(AbstractC0437l3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
            }
            a(aVar.b());
        }

        public void a(ArrayList<C0654x5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    IronLog.INTERNAL.error("clearData exception: " + e10.getMessage());
                }
            }
        }

        @Override // com.ironsource.D7
        public synchronized void a(D7.a aVar) {
            AbstractC0437l3.this.K.a(new ki(0, this, aVar));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0437l3.this.f();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l3$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29152a;

        e(int i10) {
            this.f29152a = i10;
        }

        public int b() {
            return this.f29152a;
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(AbstractC0437l3 abstractC0437l3, C0654x5 c0654x5, String str) {
        return abstractC0437l3.a(str, c0654x5);
    }

    public abstract int c(C0654x5 c0654x5);

    public abstract void d();

    public abstract boolean d(C0654x5 c0654x5);

    public abstract String e(int i10);

    public abstract void f(C0654x5 c0654x5);

    public abstract boolean j(C0654x5 c0654x5);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C0654x5 c0654x5) {
        return c0654x5.c() + 90000;
    }

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
        ArrayList<C0654x5> arrayListA;
        try {
            this.f29126m = false;
            ArrayList<C0654x5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    arrayListA = this.f29129p.a(this.I);
                    this.f29129p.b(this.I);
                }
                C5.c cVar = new C5.c(new C5.a(arrayListA, this.f29131r), this.f29137x);
                this.f29129p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th2.getMessage());
                arrayList.clear();
                arrayList.addAll(this.f29131r);
            }
            if (arrayList.size() > 0) {
                this.f29131r.clear();
                this.f29133t = 0;
                JSONObject jSONObjectB = L6.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put("abt", strB);
                    }
                    String strK = com.ironsource.mediationsdk.p.h().k();
                    if (!TextUtils.isEmpty(strK)) {
                        jSONObjectB.put(O6.f26701b1, strK);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new H5().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th3) {
                    C0474n4.d().a(th3);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th3.getMessage());
                }
                String strA = this.f29130q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.l && a(arrayList, EnumC0672y5.FIRST_INSTANCE.b())) {
                    IronLog.INTERNAL.verbose("events data: " + strA);
                    O = true;
                }
                if (this.f29127n) {
                    try {
                        strA = Base64.encodeToString(R9.a(strA, this.f29128o), 0);
                    } catch (Exception e10) {
                        C0474n4.d().a(e10);
                    }
                }
                Jf.f26356a.b(new I5(new c(), strA, this.f29130q.b(), arrayList));
            }
        } catch (Throwable th4) {
            C0474n4.d().a(th4);
            IronLog.INTERNAL.error("Send event exception: " + th4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.f29133t >= this.f29136w || this.f29126m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C0654x5 c0654x5) {
        if (c0654x5 == null) {
            return false;
        }
        if (a(this.f29139z)) {
            return !a(c0654x5.c(), this.f29139z);
        }
        if (a(this.A)) {
            return a(c0654x5.c(), this.A);
        }
        return true;
    }

    public synchronized void a(Context context, C0265ba c0265ba) {
        String strA = IronSourceUtils.a(context, this.I, this.H);
        this.H = strA;
        b(strA);
        this.f29130q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.f29129p = C4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.f29139z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c0265ba;
        this.f29135v = context;
    }

    @Override // com.ironsource.C7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    @Override // com.ironsource.C7
    public void d(int i10) {
        if (i10 > 0) {
            this.f29137x = i10;
        }
    }

    public void e() {
        this.f29131r = new ArrayList<>();
        this.f29133t = 0;
        this.f29130q = F5.a(this.H, this.G);
        A5 a8 = new A5(defpackage.e.q(this.I, "EventThread", new StringBuilder()));
        this.K = a8;
        a8.start();
        this.K.a();
        this.f29134u = Kb.Y().m();
        this.J = new HashSet();
        d();
    }

    public void h() {
        this.K.a(new d());
    }

    private void b(String str) {
        AbstractC0308e abstractC0308e = this.f29130q;
        if (abstractC0308e == null || !abstractC0308e.c().equals(str)) {
            this.f29130q = F5.a(str, this.G);
        }
    }

    @Override // com.ironsource.C7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    public boolean g(C0654x5 c0654x5) {
        return (c0654x5.c() == EnumC0672y5.CONSENT_TRUE_CODE.b() || c0654x5.c() == EnumC0672y5.CONSENT_FALSE_CODE.b() || c0654x5.c() == EnumC0672y5.SET_META_DATA.b() || c0654x5.c() == EnumC0672y5.SET_META_DATA_AFTER_INIT.b() || c0654x5.c() == EnumC0672y5.SET_USER_ID.b()) ? false : true;
    }

    public boolean h(C0654x5 c0654x5) {
        return (c0654x5.c() == EnumC0672y5.FIRST_INSTANCE.b() || c0654x5.c() == EnumC0672y5.FIRST_INSTANCE_RESULT.b() || c0654x5.c() == EnumC0672y5.INIT_COMPLETE.b() || c0654x5.c() == EnumC0672y5.SDK_INIT_FAILED.b() || c0654x5.c() == EnumC0672y5.SDK_INIT_SUCCESS.b() || c0654x5.c() == EnumC0672y5.USING_CACHE_FOR_INIT_EVENT.b() || c0654x5.c() == EnumC0672y5.CONSENT_TRUE_CODE.b() || c0654x5.c() == EnumC0672y5.CONSENT_FALSE_CODE.b() || c0654x5.c() == EnumC0672y5.SET_META_DATA.b() || c0654x5.c() == EnumC0672y5.SET_META_DATA_AFTER_INIT.b() || c0654x5.c() == EnumC0672y5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.C7
    public void c(int i10) {
        this.f29128o = i10;
    }

    @Override // com.ironsource.C7
    public void b(int i10) {
        if (i10 > 0) {
            this.f29138y = i10;
        }
    }

    public void c(boolean z10) {
        this.l = z10;
    }

    @Override // com.ironsource.C7
    public void b(int[] iArr, Context context) {
        this.f29139z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.C7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC0308e abstractC0308e = this.f29130q;
        if (abstractC0308e != null) {
            abstractC0308e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    @Override // com.ironsource.C7
    public void b(boolean z10) {
        this.f29127n = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C0654x5> arrayList) {
        return arrayList != null && arrayList.size() >= this.f29138y;
    }

    public synchronized void a(We we2) {
        this.M = we2;
    }

    public String b() {
        return this.F;
    }

    private synchronized boolean a(String str, C0654x5 c0654x5) {
        boolean zContains;
        try {
            if (!str.equalsIgnoreCase("none")) {
                return false;
            }
            if (a(this.C)) {
                zContains = a(c0654x5.c(), this.C);
            } else {
                zContains = this.J.contains(Integer.valueOf(c0654x5.c()));
            }
            return zContains;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C0654x5 c0654x5) {
        JSONObject jSONObjectB = c0654x5.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    @Override // com.ironsource.C7
    public synchronized void a(C0654x5 c0654x5) {
        a(c0654x5, (IronSource.a) null);
    }

    public synchronized void a(C0654x5 c0654x5, IronSource.a aVar) {
        if (c0654x5 != null) {
            if (this.f29132s) {
                this.K.a(new b(c0654x5, aVar));
            }
        }
    }

    private boolean a(ArrayList<C0654x5> arrayList, int i10) {
        Iterator<C0654x5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C0654x5> a(ArrayList<C0654x5> arrayList, String str) {
        String strA = a(str, 1024);
        Iterator<C0654x5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    public void a(ArrayList<C0654x5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.f29129p.a(arrayList, this.I);
                this.f29133t = this.f29129p.a(this.I).size() + this.f29131r.size();
            }
        }
    }

    @Override // com.ironsource.C7
    public void a(int i10) {
        if (i10 > 0) {
            this.f29136w = i10;
        }
    }

    @Override // com.ironsource.C7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.C7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.C7
    public void a(boolean z10) {
        this.f29132s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.f29129p.a(this.f29131r, this.I);
            this.f29131r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, int[] iArr) {
        if (a(iArr)) {
            for (int i11 : iArr) {
                if (i10 == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        try {
            C0265ba c0265ba = this.L;
            if (c0265ba != null) {
                if (c0265ba.a() > 0) {
                    jSONObject.put(C0265ba.f28278m, this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C0265ba.f28279n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            We we2 = this.M;
            if (we2 != null) {
                String strB = we2.b();
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
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public int f(int i10) {
        return a(i10, (IronSource.a) null);
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i10, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(C0654x5 c0654x5, String str, int i10) {
        JSONObject jSONObjectB = c0654x5.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            c0654x5.a(str, a(jSONObjectB.optString(str, null), i10));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public String a(String str, int i10) {
        return (TextUtils.isEmpty(str) || str.length() <= i10) ? str : str.substring(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0654x5 c0654x5, String str) {
        a(c0654x5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, IronSource.a aVar) {
        int iB = e.NOT_SUPPORTED.b();
        if (aVar != IronSource.a.REWARDED_VIDEO && ((i10 < 1000 || i10 >= 2000) && (i10 < 91000 || i10 >= 92000))) {
            if (aVar != IronSource.a.INTERSTITIAL && ((i10 < 2000 || i10 >= 3000) && (i10 < 92000 || i10 >= 93000))) {
                if (aVar == IronSource.a.BANNER || ((i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000))) {
                    return e.BANNER.b();
                }
                return (aVar == IronSource.a.NATIVE_AD || (i10 >= 4000 && i10 < 5000) || (i10 >= 94000 && i10 < 95000)) ? e.NATIVE_AD.b() : iB;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(C0265ba c0265ba) {
        this.L = c0265ba;
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }
}
