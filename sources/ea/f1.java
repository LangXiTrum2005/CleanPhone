package ea;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.h8;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.k8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.oa;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.pa;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.r6;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.x8;
import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.z8;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends z3 implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x.e f39397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.e f39398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x.e f39399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x.e f39400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x.e f39401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x.e f39402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x.e f39403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d1 f39404k;
    public final n5.f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x.e f39405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x.e f39406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x.e f39407o;

    public f1(e4 e4Var) {
        super(e4Var);
        this.f39397d = new x.e(0);
        this.f39398e = new x.e(0);
        this.f39399f = new x.e(0);
        this.f39400g = new x.e(0);
        this.f39401h = new x.e(0);
        this.f39402i = new x.e(0);
        this.f39405m = new x.e(0);
        this.f39406n = new x.e(0);
        this.f39407o = new x.e(0);
        this.f39403j = new x.e(0);
        this.f39404k = new d1(this);
        this.l = new n5.f(this, 7);
    }

    public static final x.e Q0(z8 z8Var) {
        x.e eVar = new x.e(0);
        for (d9 d9Var : z8Var.y()) {
            eVar.put(d9Var.u(), d9Var.v());
        }
        return eVar;
    }

    public static final x1 R0(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return x1.AD_STORAGE;
        }
        if (i11 == 2) {
            return x1.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return x1.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return x1.AD_PERSONALIZATION;
    }

    public final v1 K0(String str, x1 x1Var) {
        G0();
        M0(str);
        u8 u8VarC1 = c1(str);
        if (u8VarC1 != null) {
            for (r8 r8Var : u8VarC1.z()) {
                if (R0(r8Var.u()) == x1Var) {
                    int iV = r8Var.v() - 1;
                    if (iV == 1) {
                        return v1.GRANTED;
                    }
                    if (iV != 2) {
                        break;
                    }
                    return v1.DENIED;
                }
            }
        }
        return v1.UNINITIALIZED;
    }

    public final boolean L0(String str) {
        G0();
        M0(str);
        u8 u8VarC1 = c1(str);
        if (u8VarC1 == null) {
            return false;
        }
        for (r8 r8Var : u8VarC1.u()) {
            if (r8Var.u() == 3 && r8Var.w() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void M0(String str) {
        H0();
        G0();
        k9.c0.e(str);
        x.e eVar = this.f39402i;
        if (eVar.get(str) == null) {
            m mVar = this.f39807b.f39373c;
            e4.T(mVar);
            g9.k kVarO1 = mVar.O1(str);
            x.e eVar2 = this.f39407o;
            x.e eVar3 = this.f39406n;
            x.e eVar4 = this.f39405m;
            x.e eVar5 = this.f39397d;
            if (kVarO1 != null) {
                y8 y8Var = (y8) P0(str, (byte[]) kVarO1.f41770b).l();
                N0(str, y8Var);
                eVar5.put(str, Q0((z8) y8Var.f()));
                eVar.put(str, (z8) y8Var.f());
                O0(str, (z8) y8Var.f());
                eVar4.put(str, ((z8) y8Var.f23489b).F());
                eVar3.put(str, (String) kVarO1.f41771c);
                eVar2.put(str, (String) kVarO1.f41772d);
                return;
            }
            eVar5.put(str, null);
            this.f39399f.put(str, null);
            this.f39398e.put(str, null);
            this.f39400g.put(str, null);
            this.f39401h.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.f39403j.put(str, null);
        }
    }

    public final void N0(String str, y8 y8Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        x.e eVar = new x.e(0);
        x.e eVar2 = new x.e(0);
        x.e eVar3 = new x.e(0);
        Iterator it = Collections.unmodifiableList(((z8) y8Var.f23489b).E()).iterator();
        while (it.hasNext()) {
            hashSet.add(((v8) it.next()).u());
        }
        m1 m1Var = (m1) this.f3623a;
        g gVar = m1Var.f39585d;
        s0 s0Var = m1Var.f39587f;
        c0 c0Var = d0.V0;
        if (gVar.R0(null, c0Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((z8) y8Var.f23489b).K()));
        }
        while (i10 < ((z8) y8Var.f23489b).z()) {
            w8 w8Var = (w8) ((z8) y8Var.f23489b).A(i10).l();
            if (w8Var.i().isEmpty()) {
                m1.h(s0Var);
                s0Var.f39756i.b("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strI = w8Var.i();
                arrayList = arrayList2;
                String strG = z1.g(w8Var.i(), z1.f39936a, z1.f39941f);
                if (!TextUtils.isEmpty(strG)) {
                    w8Var.b();
                    ((x8) w8Var.f23489b).B(strG);
                    y8Var.b();
                    ((z8) y8Var.f23489b).N(i10, (x8) w8Var.f());
                }
                if (((x8) w8Var.f23489b).v() && ((x8) w8Var.f23489b).w()) {
                    eVar.put(strI, Boolean.TRUE);
                }
                if (((x8) w8Var.f23489b).x() && ((x8) w8Var.f23489b).y()) {
                    eVar2.put(w8Var.i(), Boolean.TRUE);
                }
                if (((x8) w8Var.f23489b).z()) {
                    if (((x8) w8Var.f23489b).A() < 2 || ((x8) w8Var.f23489b).A() > 65535) {
                        m1.h(s0Var);
                        s0Var.f39756i.d("Invalid sampling rate. Event name, sample rate", w8Var.i(), Integer.valueOf(((x8) w8Var.f23489b).A()));
                    } else {
                        eVar3.put(w8Var.i(), Integer.valueOf(((x8) w8Var.f23489b).A()));
                    }
                }
            }
            i10++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f39398e.put(str, hashSet);
        if (m1Var.f39585d.R0(null, c0Var)) {
            this.f39401h.put(str, arrayList3);
        }
        this.f39399f.put(str, eVar);
        this.f39400g.put(str, eVar2);
        this.f39403j.put(str, eVar3);
    }

    public final void O0(String key, z8 z8Var) {
        if (z8Var.D() == 0) {
            d1 d1Var = this.f39404k;
            d1Var.getClass();
            kotlin.jvm.internal.n.f(key, "key");
            synchronized (((v1.j) d1Var.f4855g)) {
                xf.e eVar = (xf.e) d1Var.f4850b;
                eVar.getClass();
                Object objRemove = eVar.f53792a.remove(key);
                if (objRemove != null) {
                    int i10 = d1Var.f4852d;
                    androidx.recyclerview.widget.o1.l(key, objRemove);
                    d1Var.f4852d = i10 - 1;
                }
            }
            return;
        }
        m1 m1Var = (m1) this.f3623a;
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39760n.c(Integer.valueOf(z8Var.D()), "EES programs found");
        pa paVar = (pa) z8Var.C().get(0);
        try {
            r6 r6Var = new r6();
            ((HashMap) ((q6) r6Var.f23919a.f23390e).f23891b).put("internal.remoteConfig", new e1(this, key, 2));
            ((HashMap) ((q6) r6Var.f23919a.f23390e).f23891b).put("internal.appMetadata", new e1(this, key, 0));
            ((HashMap) ((q6) r6Var.f23919a.f23390e).f23891b).put("internal.logger", new c6.a(this, 1));
            r6Var.b(paVar);
            this.f39404k.k(key, r6Var);
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39760n.d("EES program loaded for appId, activities", key, Integer.valueOf(paVar.v().v()));
            for (oa oaVar : paVar.v().u()) {
                s0 s0Var3 = m1Var.f39587f;
                m1.h(s0Var3);
                s0Var3.f39760n.c(oaVar.u(), "EES program activity");
            }
        } catch (g7 unused) {
            s0 s0Var4 = ((m1) this.f3623a).f39587f;
            m1.h(s0Var4);
            s0Var4.f39753f.c(key, "Failed to load EES program. appId");
        }
    }

    public final z8 P0(String str, byte[] bArr) {
        m1 m1Var = (m1) this.f3623a;
        if (bArr == null) {
            return z8.M();
        }
        try {
            z8 z8Var = (z8) ((y8) h4.r1(z8.L(), bArr)).f();
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39760n.d("Parsed config. version, gmp_app_id", z8Var.u() ? Long.valueOf(z8Var.v()) : null, z8Var.w() ? z8Var.x() : null);
            return z8Var;
        } catch (com.google.android.gms.internal.measurement.u1 e10) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39756i.d("Unable to merge remote config. appId", s0.O0(str), e10);
            return z8.M();
        } catch (RuntimeException e11) {
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39756i.d("Unable to merge remote config. appId", s0.O0(str), e11);
            return z8.M();
        }
    }

    public final z8 S0(String str) {
        H0();
        G0();
        k9.c0.e(str);
        M0(str);
        return (z8) this.f39402i.get(str);
    }

    public final String T0(String str) {
        G0();
        M0(str);
        return (String) this.f39405m.get(str);
    }

    public final void U0(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        y8 y8Var;
        byte[] bArrA;
        Iterator it;
        int i10;
        boolean z10;
        H0();
        G0();
        k9.c0.e(str);
        y8 y8Var2 = (y8) P0(str, bArr).l();
        N0(str, y8Var2);
        O0(str, (z8) y8Var2.f());
        z8 z8Var = (z8) y8Var2.f();
        x.e eVar = this.f39402i;
        eVar.put(str, z8Var);
        this.f39405m.put(str, ((z8) y8Var2.f23489b).F());
        this.f39406n.put(str, str2);
        this.f39407o.put(str, str3);
        this.f39397d.put(str, Q0((z8) y8Var2.f()));
        e4 e4Var = this.f39807b;
        m mVar = e4Var.f39373c;
        e4.T(mVar);
        ArrayList<h8> arrayList = new ArrayList(Collections.unmodifiableList(((z8) y8Var2.f23489b).B()));
        m1 m1Var = (m1) mVar.f3623a;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            g8 g8Var = (g8) ((h8) arrayList.get(i11)).l();
            x.e eVar2 = eVar;
            if (((h8) g8Var.f23489b).A() != 0) {
                int i12 = 0;
                while (i12 < ((h8) g8Var.f23489b).A()) {
                    i8 i8Var = (i8) ((h8) g8Var.f23489b).B(i12).l();
                    i8 i8Var2 = (i8) i8Var.clone();
                    e4 e4Var2 = e4Var;
                    y8 y8Var3 = y8Var2;
                    String strG = z1.g(((j8) i8Var.f23489b).w(), z1.f39936a, z1.f39941f);
                    if (strG != null) {
                        i8Var2.b();
                        ((j8) i8Var2.f23489b).H(strG);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i13 = 0;
                    while (i13 < ((j8) i8Var.f23489b).y()) {
                        l8 l8VarZ = ((j8) i8Var.f23489b).z(i13);
                        boolean z11 = z10;
                        i8 i8Var3 = i8Var;
                        String strG2 = z1.g(l8VarZ.B(), z1.f39943h, z1.f39944i);
                        if (strG2 != null) {
                            k8 k8Var = (k8) l8VarZ.l();
                            k8Var.b();
                            ((l8) k8Var.f23489b).D(strG2);
                            l8 l8Var = (l8) k8Var.f();
                            i8Var2.b();
                            ((j8) i8Var2.f23489b).I(i13, l8Var);
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i13++;
                        i8Var = i8Var3;
                    }
                    if (z10) {
                        g8Var.b();
                        ((h8) g8Var.f23489b).D(i12, (j8) i8Var2.f());
                        arrayList.set(i11, (h8) g8Var.f());
                    }
                    i12++;
                    e4Var = e4Var2;
                    y8Var2 = y8Var3;
                }
            }
            y8 y8Var4 = y8Var2;
            e4 e4Var3 = e4Var;
            if (((h8) g8Var.f23489b).x() != 0) {
                for (int i14 = 0; i14 < ((h8) g8Var.f23489b).x(); i14++) {
                    p8 p8VarY = ((h8) g8Var.f23489b).y(i14);
                    String strG3 = z1.g(p8VarY.w(), z1.l, z1.f39947m);
                    if (strG3 != null) {
                        o8 o8Var = (o8) p8VarY.l();
                        o8Var.b();
                        ((p8) o8Var.f23489b).D(strG3);
                        g8Var.b();
                        ((h8) g8Var.f23489b).C(i14, (p8) o8Var.f());
                        arrayList.set(i11, (h8) g8Var.f());
                    }
                }
            }
            i11++;
            eVar = eVar2;
            e4Var = e4Var3;
            y8Var2 = y8Var4;
        }
        y8 y8Var5 = y8Var2;
        x.e eVar3 = eVar;
        e4 e4Var4 = e4Var;
        mVar.H0();
        mVar.G0();
        k9.c0.e(str);
        SQLiteDatabase sQLiteDatabaseX1 = mVar.x1();
        sQLiteDatabaseX1.beginTransaction();
        try {
            mVar.H0();
            mVar.G0();
            k9.c0.e(str);
            SQLiteDatabase sQLiteDatabaseX2 = mVar.x1();
            sQLiteDatabaseX2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseX2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                h8 h8Var = (h8) it2.next();
                mVar.H0();
                mVar.G0();
                k9.c0.e(str);
                k9.c0.h(h8Var);
                if (h8Var.u()) {
                    int iV = h8Var.v();
                    Iterator it3 = h8Var.z().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((j8) it3.next()).u()) {
                                s0 s0Var = m1Var.f39587f;
                                m1.h(s0Var);
                                s0Var.f39756i.d("Event filter with no ID. Audience definition ignored. appId, audienceId", s0.O0(str), Integer.valueOf(iV));
                                break;
                            }
                        } else {
                            Iterator it4 = h8Var.w().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = h8Var.z().iterator();
                                    while (true) {
                                        boolean zHasNext = it5.hasNext();
                                        h8 h8Var2 = h8Var;
                                        String str4 = "audience_id";
                                        sQLiteDatabase = sQLiteDatabaseX1;
                                        String str5 = MBridgeConstans.APP_ID;
                                        if (!zHasNext) {
                                            it = it2;
                                            i10 = iV;
                                            for (p8 p8Var : h8Var2.w()) {
                                                mVar.H0();
                                                mVar.G0();
                                                k9.c0.e(str);
                                                k9.c0.h(p8Var);
                                                if (p8Var.w().isEmpty()) {
                                                    s0 s0Var2 = m1Var.f39587f;
                                                    m1.h(s0Var2);
                                                    s0Var2.f39756i.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", s0.O0(str), Integer.valueOf(i10), String.valueOf(p8Var.u() ? Integer.valueOf(p8Var.v()) : null));
                                                } else {
                                                    byte[] bArrA2 = p8Var.a();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put(str4, Integer.valueOf(i10));
                                                    contentValues.put("filter_id", p8Var.u() ? Integer.valueOf(p8Var.v()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", p8Var.w());
                                                    contentValues.put("session_scoped", p8Var.A() ? Boolean.valueOf(p8Var.B()) : null);
                                                    contentValues.put("data", bArrA2);
                                                    try {
                                                        if (mVar.x1().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            s0 s0Var3 = m1Var.f39587f;
                                                            m1.h(s0Var3);
                                                            s0Var3.f39753f.c(s0.O0(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e10) {
                                                        s0 s0Var4 = m1Var.f39587f;
                                                        m1.h(s0Var4);
                                                        s0Var4.f39753f.d("Error storing property filter. appId", s0.O0(str), e10);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            j8 j8Var = (j8) it5.next();
                                            mVar.H0();
                                            mVar.G0();
                                            k9.c0.e(str);
                                            k9.c0.h(j8Var);
                                            if (j8Var.w().isEmpty()) {
                                                s0 s0Var5 = m1Var.f39587f;
                                                m1.h(s0Var5);
                                                s0Var5.f39756i.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", s0.O0(str), Integer.valueOf(iV), String.valueOf(j8Var.u() ? Integer.valueOf(j8Var.v()) : null));
                                                it = it2;
                                                i10 = iV;
                                            } else {
                                                it = it2;
                                                byte[] bArrA3 = j8Var.a();
                                                i10 = iV;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put(MBridgeConstans.APP_ID, str);
                                                contentValues2.put("audience_id", Integer.valueOf(i10));
                                                contentValues2.put("filter_id", j8Var.u() ? Integer.valueOf(j8Var.v()) : null);
                                                contentValues2.put("event_name", j8Var.w());
                                                contentValues2.put("session_scoped", j8Var.E() ? Boolean.valueOf(j8Var.F()) : null);
                                                contentValues2.put("data", bArrA3);
                                                try {
                                                    if (mVar.x1().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        s0 s0Var6 = m1Var.f39587f;
                                                        m1.h(s0Var6);
                                                        s0Var6.f39753f.c(s0.O0(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    h8Var = h8Var2;
                                                    sQLiteDatabaseX1 = sQLiteDatabase;
                                                    it2 = it;
                                                    iV = i10;
                                                } catch (SQLiteException e11) {
                                                    s0 s0Var7 = m1Var.f39587f;
                                                    m1.h(s0Var7);
                                                    s0Var7.f39753f.d("Error storing event filter. appId", s0.O0(str), e11);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        mVar.H0();
                                        mVar.G0();
                                        k9.c0.e(str);
                                        SQLiteDatabase sQLiteDatabaseX3 = mVar.x1();
                                        sQLiteDatabaseX3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i10)});
                                        sQLiteDatabaseX3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i10)});
                                        break;
                                    }
                                    sQLiteDatabaseX1 = sQLiteDatabase;
                                    it2 = it;
                                    break;
                                }
                                if (!((p8) it4.next()).u()) {
                                    s0 s0Var8 = m1Var.f39587f;
                                    m1.h(s0Var8);
                                    s0Var8.f39756i.d("Property filter with no ID. Audience definition ignored. appId, audienceId", s0.O0(str), Integer.valueOf(iV));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    s0 s0Var9 = m1Var.f39587f;
                    m1.h(s0Var9);
                    s0Var9.f39756i.c(s0.O0(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = sQLiteDatabaseX1;
            ArrayList arrayList2 = new ArrayList();
            for (h8 h8Var3 : arrayList) {
                arrayList2.add(h8Var3.u() ? Integer.valueOf(h8Var3.v()) : null);
            }
            k9.c0.e(str);
            mVar.H0();
            mVar.G0();
            SQLiteDatabase sQLiteDatabaseX4 = mVar.x1();
            try {
                long jC1 = mVar.c1("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, m1Var.f39585d.P0(str, d0.U)));
                if (jC1 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb2.append("(");
                            sb2.append(strJoin);
                            sb2.append(")");
                            String string = sb2.toString();
                            StringBuilder sb3 = new StringBuilder(string.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(string);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseX4.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i15);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i15++;
                    }
                }
            } catch (SQLiteException e12) {
                s0 s0Var10 = m1Var.f39587f;
                m1.h(s0Var10);
                s0Var10.f39753f.d("Database error querying filters. appId", s0.O0(str), e12);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                y8Var5.b();
                y8Var = y8Var5;
                try {
                    ((z8) y8Var.f23489b).O();
                    bArrA = ((z8) y8Var.f()).a();
                } catch (RuntimeException e13) {
                    e = e13;
                    s0 s0Var11 = ((m1) this.f3623a).f39587f;
                    m1.h(s0Var11);
                    s0Var11.f39756i.d("Unable to serialize reduced-size config. Storing full config instead. appId", s0.O0(str), e);
                    bArrA = bArr;
                }
            } catch (RuntimeException e14) {
                e = e14;
                y8Var = y8Var5;
            }
            m mVar2 = e4Var4.f39373c;
            e4.T(mVar2);
            m1 m1Var2 = (m1) mVar2.f3623a;
            k9.c0.e(str);
            mVar2.G0();
            mVar2.H0();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (mVar2.x1().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    s0 s0Var12 = m1Var2.f39587f;
                    m1.h(s0Var12);
                    s0Var12.f39753f.c(s0.O0(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e15) {
                s0 s0Var13 = m1Var2.f39587f;
                m1.h(s0Var13);
                s0Var13.f39753f.d("Error storing remote config. appId", s0.O0(str), e15);
            }
            y8Var.b();
            ((z8) y8Var.f23489b).P();
            eVar3.put(str, (z8) y8Var.f());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseX1;
        }
    }

    public final boolean V0(String str, String str2) {
        Boolean bool;
        G0();
        M0(str);
        if ("1".equals(m0(str, "measurement.upload.blacklist_internal")) && l4.j1(str2)) {
            return true;
        }
        if ("1".equals(m0(str, "measurement.upload.blacklist_public")) && l4.F1(str2)) {
            return true;
        }
        Map map = (Map) this.f39399f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean W0(String str, String str2) {
        Boolean bool;
        G0();
        M0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f39400g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List X0(String str) {
        G0();
        M0(str);
        return (List) this.f39401h.get(str);
    }

    public final int Y0(String str, String str2) {
        Integer num;
        G0();
        M0(str);
        Map map = (Map) this.f39403j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean Z0(String str) {
        G0();
        M0(str);
        x.e eVar = this.f39398e;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean a1(String str) {
        G0();
        M0(str);
        x.e eVar = this.f39398e;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean b1(String str, x1 x1Var) {
        G0();
        M0(str);
        u8 u8VarC1 = c1(str);
        if (u8VarC1 == null) {
            return false;
        }
        for (r8 r8Var : u8VarC1.u()) {
            if (x1Var == R0(r8Var.u())) {
                return r8Var.v() == 2;
            }
        }
        return false;
    }

    public final u8 c1(String str) {
        G0();
        M0(str);
        z8 z8VarS0 = S0(str);
        if (z8VarS0 == null || !z8VarS0.G()) {
            return null;
        }
        return z8VarS0.H();
    }

    @Override // ea.f
    public final String m0(String str, String str2) {
        G0();
        M0(str);
        Map map = (Map) this.f39397d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // ea.z3
    public final void J0() {
    }
}
