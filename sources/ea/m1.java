package ea;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.bb;
import com.google.android.gms.internal.measurement.gb;
import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.jb;
import com.google.android.gms.internal.measurement.kb;
import com.google.android.gms.internal.measurement.pb;
import com.google.android.gms.internal.measurement.qb;
import com.google.android.gms.internal.measurement.vb;
import com.google.android.gms.internal.measurement.xb;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements u1 {
    public static volatile m1 F;
    public int A;
    public int B;
    public final long D;
    public final long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fd.b f39584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f39585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f39586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s0 f39587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1 f39588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3 f39589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l4 f39590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f39591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p9.b f39592k;
    public final z2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f39593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y f39594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s2 f39595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f39596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n0 f39597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h3 f39598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f39599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l0 f39600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t2 f39601u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f39603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f39604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile Boolean f39605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f39606z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f39602v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public m1(b2 b2Var) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context context = b2Var.f39254a;
        fd.b bVar = new fd.b(11);
        this.f39584c = bVar;
        z1.f39948n = bVar;
        this.f39582a = context;
        this.f39583b = b2Var.f39258e;
        this.f39605y = b2Var.f39255b;
        this.f39596p = b2Var.f39261h;
        this.f39606z = true;
        if (vb.f24092b == null && context != null) {
            Object obj = vb.f24091a;
            synchronized (obj) {
                try {
                    if (vb.f24092b == null) {
                        synchronized (obj) {
                            try {
                                jb jbVar = vb.f24092b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (jbVar == null || jbVar.f23620a != applicationContext2) {
                                    if (jbVar != null) {
                                        Iterator it = kb.f23677a.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        xb.a();
                                    }
                                    vb.f24092b = new jb(applicationContext2, no.b.z(new qb(applicationContext2, 2)));
                                    vb.f24093c.incrementAndGet();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f39592k = p9.b.f48278a;
        bb bbVar = new bb(context, null, com.google.android.gms.internal.measurement.e1.f23405a, j9.b.f43727o9, j9.h.f43737c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
        mVarB.f11732d = new h6(2, strConcat, new String[0]);
        bbVar.c(0, mVarB.a());
        AtomicReference atomicReference = pb.f23843k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                pb.b();
                gb.g(Level.WARNING, (Executor) pb.f23844m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = b2Var.f39259f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.f39592k.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.D = jCurrentTimeMillis;
        Long l10 = b2Var.f39260g;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        } else {
            this.f39592k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.E = jElapsedRealtime;
        g gVar = new g(this);
        gVar.f39417d = rc.d.f49539b;
        this.f39585d = gVar;
        a1 a1Var = new a1(this);
        a1Var.J0();
        this.f39586e = a1Var;
        s0 s0Var = new s0(this);
        s0Var.J0();
        this.f39587f = s0Var;
        l4 l4Var = new l4(this);
        l4Var.J0();
        this.f39590i = l4Var;
        this.f39591j = new o0(new c1(b2Var, this));
        this.f39594n = new y(this);
        z2 z2Var = new z2(this);
        z2Var.I0();
        this.l = z2Var;
        p2 p2Var = new p2(this);
        p2Var.I0();
        this.f39593m = p2Var;
        p3 p3Var = new p3(this);
        p3Var.I0();
        this.f39589h = p3Var;
        s2 s2Var = new s2(this);
        s2Var.J0();
        this.f39595o = s2Var;
        j1 j1Var = new j1(this);
        j1Var.J0();
        this.f39588g = j1Var;
        i7 i7Var = b2Var.f39257d;
        boolean z10 = i7Var == null || i7Var.f23577b == 0;
        if (this.f39582a.getApplicationContext() instanceof Application) {
            g(p2Var);
            if (((m1) p2Var.f3623a).f39582a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((m1) p2Var.f3623a).f39582a.getApplicationContext();
                if (p2Var.f39685c == null) {
                    p2Var.f39685c = new m2(p2Var);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(p2Var.f39685c);
                    application.registerActivityLifecycleCallbacks(p2Var.f39685c);
                    s0 s0Var2 = ((m1) p2Var.f3623a).f39587f;
                    h(s0Var2);
                    s0Var2.f39760n.b("Registered activity lifecycle callback");
                }
            }
        } else {
            h(s0Var);
            s0Var.f39756i.b("Application context is not an Application");
        }
        j1Var.P0(new ta.i0(this, false, b2Var, 7));
    }

    public static final void e(z zVar) {
        if (zVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void f(al.b bVar) {
        if (bVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void g(f0 f0Var) {
        if (f0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!f0Var.f39396b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f0Var.getClass())));
        }
    }

    public static final void h(t1 t1Var) {
        if (t1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!t1Var.f39766b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(t1Var.getClass())));
        }
    }

    public static m1 n(Context context, i7 i7Var, Long l, Long l10) {
        Bundle bundle;
        if (i7Var != null) {
            Bundle bundle2 = i7Var.f23579d;
            i7Var = new i7(i7Var.f23576a, i7Var.f23577b, i7Var.f23578c, bundle2, null);
        }
        k9.c0.h(context);
        k9.c0.h(context.getApplicationContext());
        if (F == null) {
            synchronized (m1.class) {
                try {
                    if (F == null) {
                        F = new m1(new b2(context, i7Var, l, l10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (i7Var != null && (bundle = i7Var.f23579d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            k9.c0.h(F);
            F.f39605y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        k9.c0.h(F);
        return F;
    }

    @Override // ea.u1
    public final j1 P() {
        j1 j1Var = this.f39588g;
        h(j1Var);
        return j1Var;
    }

    @Override // ea.u1
    public final Context Q() {
        return this.f39582a;
    }

    public final boolean a() {
        return b() == 0;
    }

    public final int b() {
        j1 j1Var = this.f39588g;
        h(j1Var);
        j1Var.G0();
        g gVar = this.f39585d;
        if (gVar.U0()) {
            return 1;
        }
        h(j1Var);
        j1Var.G0();
        if (!this.f39606z) {
            return 8;
        }
        a1 a1Var = this.f39586e;
        f(a1Var);
        a1Var.G0();
        Boolean boolValueOf = a1Var.K0().contains("measurement_enabled") ? Boolean.valueOf(a1Var.K0().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        fd.b bVar = ((m1) gVar.f3623a).f39584c;
        Boolean boolT0 = gVar.T0("firebase_analytics_collection_enabled");
        if (boolT0 != null) {
            return boolT0.booleanValue() ? 0 : 4;
        }
        return (this.f39605y == null || this.f39605y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean c() {
        l4 l4Var;
        boolean z10;
        Context context;
        if (!this.f39602v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        j1 j1Var = this.f39588g;
        h(j1Var);
        j1Var.G0();
        Boolean bool = this.f39603w;
        p9.b bVar = this.f39592k;
        if (bool == null || this.f39604x == 0) {
            bVar.getClass();
            this.f39604x = SystemClock.elapsedRealtime();
            l4Var = this.f39590i;
            f(l4Var);
            z10 = false;
            if (l4Var.i1("android.permission.INTERNET") && l4Var.i1("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f39582a;
                if (r9.c.a(context).g() || this.f39585d.J0() || (l4.A1(context) && l4.b1(context))) {
                    z10 = true;
                }
            }
            this.f39603w = Boolean.valueOf(z10);
            if (z10) {
                this.f39603w = Boolean.valueOf(l4Var.M0(m().N0()));
            }
        } else if (!bool.booleanValue()) {
            bVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f39604x) > 1000) {
                bVar.getClass();
                this.f39604x = SystemClock.elapsedRealtime();
                l4Var = this.f39590i;
                f(l4Var);
                z10 = false;
                if (l4Var.i1("android.permission.INTERNET")) {
                    context = this.f39582a;
                    if (r9.c.a(context).g()) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                }
                this.f39603w = Boolean.valueOf(z10);
                if (z10) {
                    this.f39603w = Boolean.valueOf(l4Var.M0(m().N0()));
                }
            }
        }
        return this.f39603w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void d(int i10, Throwable th2, byte[] bArr) {
        s0 s0Var;
        s0 s0Var2;
        int i11 = i10;
        s0 s0Var3 = this.f39587f;
        if (i11 == 200 || i11 == 204) {
            if (th2 == null) {
                a1 a1Var = this.f39586e;
                f(a1Var);
                a1Var.f39220t.b(true);
                if (bArr != null || bArr.length == 0) {
                    h(s0Var3);
                    s0Var3.f39759m.b("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString(Constants.DEEPLINK, "");
                    if (TextUtils.isEmpty(strOptString)) {
                        h(s0Var3);
                        s0Var3.f39759m.b("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    l4 l4Var = this.f39590i;
                    f(l4Var);
                    m1 m1Var = (m1) l4Var.f3623a;
                    if (TextUtils.isEmpty(strOptString)) {
                        s0Var2 = s0Var3;
                    } else {
                        Context context = m1Var.f39582a;
                        s0Var2 = s0Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.f39593m.N0("auto", bundle, "_cmp");
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString(Constants.DEEPLINK, strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = m1Var.f39582a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e10) {
                                    s0 s0Var4 = ((m1) l4Var.f3623a).f39587f;
                                    h(s0Var4);
                                    s0Var4.f39753f.c(e10, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            s0Var = s0Var2;
                            h(s0Var);
                            s0Var.f39753f.c(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    h(s0Var2);
                    s0Var = s0Var2;
                    try {
                        s0Var.f39756i.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e12) {
                        e = e12;
                        h(s0Var);
                        s0Var.f39753f.c(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e13) {
                    e = e13;
                    s0Var = s0Var3;
                }
            }
        } else if (i11 == 304) {
            i11 = 304;
            if (th2 == null) {
                a1 a1Var2 = this.f39586e;
                f(a1Var2);
                a1Var2.f39220t.b(true);
                if (bArr != null) {
                }
                h(s0Var3);
                s0Var3.f39759m.b("Deferred Deep Link response empty.");
                return;
            }
        }
        h(s0Var3);
        s0Var3.f39756i.d("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public final o0 i() {
        return this.f39591j;
    }

    @Override // ea.u1
    public final p9.a i0() {
        return this.f39592k;
    }

    public final n0 j() {
        g(this.f39597q);
        return this.f39597q;
    }

    public final h3 k() {
        g(this.f39598r);
        return this.f39598r;
    }

    public final p l() {
        h(this.f39599s);
        return this.f39599s;
    }

    public final l0 m() {
        g(this.f39600t);
        return this.f39600t;
    }

    @Override // ea.u1
    public final fd.b o() {
        return this.f39584c;
    }

    @Override // ea.u1
    public final s0 t() {
        s0 s0Var = this.f39587f;
        h(s0Var);
        return s0Var;
    }
}
