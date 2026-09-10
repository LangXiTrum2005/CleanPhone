package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zy implements bz {
    public static final List l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dv1 f22762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22763b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f22766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final az f22768g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22764c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22765d = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f22769h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f22770i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22771j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22772k = false;

    public zy(Context context, VersionInfoParcel versionInfoParcel, az azVar, String str) {
        k9.c0.i(azVar, "SafeBrowsing config is not present.");
        this.f22766e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22763b = new LinkedHashMap();
        this.f22768g = azVar;
        Iterator it = azVar.f12548e.iterator();
        while (it.hasNext()) {
            this.f22770i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f22770i.remove("cookie".toLowerCase(Locale.ENGLISH));
        dv1 dv1VarC = ew1.C();
        dv1VarC.b();
        ((ew1) dv1VarC.f19193b).N(9);
        if (str != null) {
            dv1VarC.b();
            ((ew1) dv1VarC.f19193b).D(str);
            dv1VarC.b();
            ((ew1) dv1VarC.f19193b).E(str);
        }
        ev1 ev1VarZ = fv1.z();
        String str2 = this.f22768g.f12544a;
        if (str2 != null) {
            ev1VarZ.b();
            ((fv1) ev1VarZ.f19193b).A(str2);
        }
        fv1 fv1Var = (fv1) ev1VarZ.e();
        dv1VarC.b();
        ((ew1) dv1VarC.f19193b).F(fv1Var);
        yv1 yv1VarZ = zv1.z();
        boolean zG = r9.c.a(this.f22766e).g();
        yv1VarZ.b();
        ((zv1) yv1VarZ.f19193b).C(zG);
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            yv1VarZ.b();
            ((zv1) yv1VarZ.f19193b).A(str3);
        }
        i9.e eVar = i9.e.f42929b;
        Context context2 = this.f22766e;
        eVar.getClass();
        long jA = i9.e.a(context2);
        if (jA > 0) {
            yv1VarZ.b();
            ((zv1) yv1VarZ.f19193b).B(jA);
        }
        zv1 zv1Var = (zv1) yv1VarZ.e();
        dv1VarC.b();
        ((ew1) dv1VarC.f19193b).K(zv1Var);
        this.f22762a = dv1VarC;
    }

    public final void a(String str) {
        synchronized (this.f22769h) {
            try {
                if (str == null) {
                    dv1 dv1Var = this.f22762a;
                    dv1Var.b();
                    ((ew1) dv1Var.f19193b).I();
                } else {
                    dv1 dv1Var2 = this.f22762a;
                    dv1Var2.b();
                    ((ew1) dv1Var2.f19193b).H(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i10, String str, Map map) {
        synchronized (this.f22769h) {
            int i11 = 1;
            if (i10 == 3) {
                try {
                    this.f22772k = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LinkedHashMap linkedHashMap = this.f22763b;
            if (linkedHashMap.containsKey(str)) {
                if (i10 == 3) {
                    wv1 wv1Var = (wv1) linkedHashMap.get(str);
                    wv1Var.b();
                    ((xv1) wv1Var.f19193b).G(4);
                }
                return;
            }
            wv1 wv1VarB = xv1.B();
            if (i10 != 0) {
                if (i10 == 1) {
                    i11 = 2;
                } else if (i10 != 2) {
                    i11 = i10 != 3 ? 0 : 4;
                } else {
                    i11 = 3;
                }
            }
            if (i11 != 0) {
                wv1VarB.b();
                ((xv1) wv1VarB.f19193b).G(i11);
            }
            int size = linkedHashMap.size();
            wv1VarB.b();
            ((xv1) wv1VarB.f19193b).C(size);
            wv1VarB.b();
            ((xv1) wv1VarB.f19193b).D(str);
            lv1 lv1VarZ = nv1.z();
            if (!this.f22770i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f22770i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        jv1 jv1VarZ = kv1.z();
                        as1 as1Var = str2.isEmpty() ? cs1.f13248b : new as1(str2.getBytes(StandardCharsets.UTF_8));
                        jv1VarZ.b();
                        ((kv1) jv1VarZ.f19193b).A(as1Var);
                        as1 as1Var2 = str3.isEmpty() ? cs1.f13248b : new as1(str3.getBytes(StandardCharsets.UTF_8));
                        jv1VarZ.b();
                        ((kv1) jv1VarZ.f19193b).B(as1Var2);
                        kv1 kv1Var = (kv1) jv1VarZ.e();
                        lv1VarZ.b();
                        ((nv1) lv1VarZ.f19193b).A(kv1Var);
                    }
                }
            }
            nv1 nv1Var = (nv1) lv1VarZ.e();
            wv1VarB.b();
            ((xv1) wv1VarB.f19193b).E(nv1Var);
            linkedHashMap.put(str, wv1VarB);
        }
    }
}
