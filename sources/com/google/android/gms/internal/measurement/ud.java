package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import com.google.android.gms.internal.ads.z40;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ud {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q6 f24037i = new q6(13);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final md f24038j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile bo.e f24039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb f24040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oa.u0 f24044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q6 f24045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g9.k f24046h;

    static {
        e3 e3Var = e3.f23408c;
        int i10 = oa.u0.f47325c;
        f24038j = new md(e3Var, false, oa.u1.f47328j);
    }

    public ud(pb pbVar, md mdVar) {
        this.f24040b = pbVar;
        Context context = pbVar.f23846b;
        String str = mdVar.f23741d;
        if (str == null) {
            str = (String) mdVar.f23738a.apply(context);
            mdVar.f23741d = str;
        }
        this.f24041c = str;
        this.f24042d = "";
        this.f24043e = mdVar.f23739b;
        this.f24044f = mdVar.f23740c;
        this.f24039a = null;
        this.f24045g = new q6(14);
        this.f24046h = new g9.k(pbVar, str);
    }

    public final bo.e a() {
        bo.e eVar;
        bo.e eVar2 = this.f24039a;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this) {
            try {
                eVar = this.f24039a;
                if (eVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        bo.e eVarL = this.f24046h.L();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i10 = ((com.google.android.gms.internal.ads.n3) eVarL.f5780e).f17625b - 2;
                        if (i10 == 15 || i10 == 16) {
                            eVar = eVarL;
                        } else {
                            pb pbVar = this.f24040b;
                            pbVar.f23851g.a();
                            if (this.f24043e || this.f24046h.N() || !((String) eVarL.f5777b).isEmpty()) {
                                final int i11 = 3;
                                ((ta.t0) pbVar.a()).execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.od

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ ud f23806b;

                                    {
                                        this.f23806b = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        f1 f1Var;
                                        dd ddVar;
                                        ta.f0 f0VarA;
                                        ta.a aVarB;
                                        int i12 = i11;
                                        int i13 = 2;
                                        int i14 = 1;
                                        int i15 = 0;
                                        ud udVar = this.f23806b;
                                        switch (i12) {
                                            case 0:
                                                udVar.b();
                                                return;
                                            case 1:
                                                pb pbVar2 = udVar.f24040b;
                                                String str = udVar.f24041c;
                                                tf tfVar = zd.f24203a;
                                                f1 f1Var2 = f1.f23447c;
                                                byte b10 = (byte) (((byte) 2) | 1);
                                                Context context = pbVar2.f23846b;
                                                Pattern pattern = xe.f24149a;
                                                com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x(context);
                                                xVar.G("phenotype");
                                                xVar.H("all_accounts.pb");
                                                Uri uriI = xVar.I();
                                                if (uriI == null) {
                                                    throw new NullPointerException("Null uri");
                                                }
                                                dd ddVarV = dd.v();
                                                if (ddVarV == null) {
                                                    throw new NullPointerException("Null schema");
                                                }
                                                tf tfVar2 = zd.f24203a;
                                                tfVar2.getClass();
                                                na.p pVar = new na.p(tfVar2);
                                                byte b11 = (byte) (b10 | 2);
                                                oa.f0 f0Var = oa.j0.f47265b;
                                                oa.n1 n1Var = oa.n1.f47281e;
                                                if (b11 != 3) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    if ((b11 & 1) == 0) {
                                                        sb2.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((b11 & 2) == 0) {
                                                        sb2.append(" enableTracing");
                                                    }
                                                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                                                }
                                                kf kfVar = new kf(uriI, ddVarV, pVar, n1Var);
                                                nf nfVar = zd.f24205c;
                                                if (nfVar == null) {
                                                    synchronized (zd.f24204b) {
                                                        try {
                                                            nfVar = zd.f24205c;
                                                            if (nfVar == null) {
                                                                HashMap map = new HashMap();
                                                                ta.q0 q0VarA = pbVar2.a();
                                                                te teVar = (te) pbVar2.f23850f.get();
                                                                of ofVar = of.f23818a;
                                                                go.k.k(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", ofVar);
                                                                nf nfVar2 = new nf(q0VarA, teVar, map);
                                                                zd.f24205c = nfVar2;
                                                                nfVar = nfVar2;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    pbVar2 = pbVar2;
                                                    i14 = 1;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nfVar.f23782b;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uriI);
                                                if (pairCreate == null) {
                                                    go.k.k(uriI.isHierarchical(), "Uri must be hierarchical: %s", uriI);
                                                    String lastPathSegment = uriI.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    go.k.k((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriI);
                                                    of ofVar2 = (of) ((HashMap) nfVar.f23786f).get("singleproc");
                                                    go.k.k(ofVar2 != null ? i14 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriI.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    ta.s sVarG = ta.k0.g(ta.k0.d(uriI), (hc) nfVar.f23785e, ta.c0.f50592a);
                                                    Executor executor = (Executor) nfVar.f23783c;
                                                    te teVar2 = (te) nfVar.f23784d;
                                                    ofVar2.getClass();
                                                    uf ufVar = new uf(ddVarV, z0.a());
                                                    ta.n0 n0VarD = ta.k0.d(uriI);
                                                    f1Var = f1Var2;
                                                    f1 f1Var3 = new f1(16);
                                                    z40 z40Var = new z40();
                                                    z40Var.f22498h = new Object();
                                                    ddVar = ddVarV;
                                                    z40Var.f22499i = new m0.s1(26);
                                                    z40Var.f22500j = null;
                                                    z40Var.f22491a = strSubstring;
                                                    z40Var.f22492b = ta.k0.e(n0VarD);
                                                    z40Var.f22493c = ufVar;
                                                    z40Var.f22494d = new ta.u0(executor);
                                                    z40Var.f22495e = teVar2;
                                                    z40Var.f22496f = pVar;
                                                    z40Var.f22497g = f1Var3;
                                                    mf mfVar = new mf(z40Var, sVarG);
                                                    if (!n1Var.isEmpty()) {
                                                        ce ceVar = new ce(i14, n1Var, executor);
                                                        synchronized (mfVar.f23748g) {
                                                            mfVar.f23750i.add(ceVar);
                                                        }
                                                    }
                                                    pairCreate = Pair.create(mfVar, kfVar);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriI, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                    break;
                                                } else {
                                                    f1Var = f1Var2;
                                                    ddVar = ddVarV;
                                                }
                                                mf mfVar2 = (mf) pairCreate.first;
                                                kf kfVar2 = (kf) pairCreate.second;
                                                if (kfVar.equals(kfVar2)) {
                                                    ta.t tVarA = mfVar2.a(new sd(str, 1), pbVar2.a());
                                                    tVarA.addListener(new qd(udVar, tVarA, 0), pbVar2.a());
                                                    return;
                                                }
                                                String strB = j1.f.B("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", dd.class.getSimpleName(), uriI);
                                                go.k.k(uriI.equals(kfVar2.f23679a), strB, "uri");
                                                go.k.k(ddVar.equals(kfVar2.f23680b), strB, "schema");
                                                go.k.k(pVar.equals(kfVar2.f23681c), strB, "handler");
                                                go.k.k(n1Var.equals(kfVar2.f23682d), strB, "migrations");
                                                Object obj = f1Var;
                                                go.k.k(obj.equals(obj), strB, "variantConfig");
                                                throw new IllegalArgumentException(j1.f.B(strB, "unknown"));
                                            case 2:
                                                ee eeVar = udVar.f24040b.f23853i;
                                                boolean z10 = udVar.f24043e;
                                                rd rdVar = rd.f23934a;
                                                he heVar = (he) eeVar.f23427c.get();
                                                if (heVar == null && !z10) {
                                                    ta.n0 n0Var = ta.n0.f50627b;
                                                    return;
                                                }
                                                if ((eeVar.f23429e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = eeVar.f23430f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i16 = eeVar.f23429e;
                                                            if ((i16 & 64) == 0) {
                                                                copyOnWriteArrayList.add(rdVar);
                                                                eeVar.f23429e = i16 | 64;
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (eeVar.f23432h == null) {
                                                    synchronized (eeVar.f23431g) {
                                                        try {
                                                            if (eeVar.f23432h == null) {
                                                                if (heVar == null) {
                                                                    heVar = de.f23391a;
                                                                }
                                                                Context context2 = eeVar.f23425a;
                                                                if (gb.i(context2)) {
                                                                    f0VarA = ((ic) eeVar.f23428d.get()).a(new h6(eeVar, heVar));
                                                                    eeVar.f23432h = f0VarA;
                                                                } else {
                                                                    be beVar = be.f23319b;
                                                                    na.r rVar = eeVar.f23426b;
                                                                    f0VarA = ta.k0.g(gb.h(context2, Executors.callable(beVar, null), (Executor) rVar.get()), new ce(i15, eeVar, heVar), (Executor) rVar.get());
                                                                    eeVar.f23432h = f0VarA;
                                                                }
                                                                f0VarA.addListener(new ae(f0VarA, i13), (Executor) eeVar.f23426b.get());
                                                            }
                                                        } catch (Throwable th4) {
                                                            throw th4;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                bo.e eVarA = udVar.a();
                                                String str2 = (String) eVarA.f5777b;
                                                pb pbVar3 = udVar.f24040b;
                                                na.r rVar2 = pbVar3.f23848d;
                                                ie ieVarB = pbVar3.f23851g.b();
                                                boolean z11 = ieVarB.f23593i;
                                                if (ieVarB.f23594j) {
                                                    if (go.c.I(str2) && !z11) {
                                                        ta.n0 n0Var2 = ta.n0.f50627b;
                                                        return;
                                                    }
                                                    yb ybVarV = bc.v();
                                                    com.google.android.gms.internal.ads.n3 n3Var = (com.google.android.gms.internal.ads.n3) eVarA.f5780e;
                                                    int i17 = n3Var.f17624a;
                                                    zb zbVarU = ac.u();
                                                    zbVarU.b();
                                                    ((ac) zbVarU.f23489b).v(i17);
                                                    int i18 = n3Var.f17625b;
                                                    zbVarU.b();
                                                    ((ac) zbVarU.f23489b).w(i18);
                                                    ac acVar = (ac) zbVarU.f();
                                                    ybVarV.b();
                                                    ((bc) ybVarV.f23489b).x(acVar);
                                                    if (!go.c.I(str2)) {
                                                        ybVarV.b();
                                                        ((bc) ybVarV.f23489b).w(str2);
                                                    }
                                                    if (z11) {
                                                        String str3 = udVar.f24041c;
                                                        ybVarV.b();
                                                        ((bc) ybVarV.f23489b).y(str3);
                                                    }
                                                    ic icVar = (ic) rVar2.get();
                                                    bc bcVar = (bc) ybVarV.f();
                                                    bb bbVar = icVar.f23582a;
                                                    com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
                                                    mVarB.f11732d = new q6(bcVar, 7);
                                                    mVarB.f11729a = new i9.c[]{h.f23522a};
                                                    mVarB.f11730b = false;
                                                    aVarB = ic.b(bbVar.c(0, mVarB.a()).continueWithTask(ta.c0.f50592a, new h6(i14, bbVar, bcVar)));
                                                } else {
                                                    if (go.c.I(str2)) {
                                                        ta.n0 n0Var3 = ta.n0.f50627b;
                                                        return;
                                                    }
                                                    ic icVar2 = (ic) rVar2.get();
                                                    icVar2.getClass();
                                                    str2.getClass();
                                                    aVarB = ic.b(icVar2.f23582a.d(str2));
                                                }
                                                ta.k0.a(aVarB, gc.class, new pd(udVar, i15), pbVar3.a());
                                                return;
                                        }
                                    }
                                });
                                pbVar.f23845a.M((s0) eVarL.f5778c, this.f24044f, this.f24041c);
                                if (!this.f24042d.equals("")) {
                                    final int i12 = 1;
                                    ((ta.t0) pbVar.a()).execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.od

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ ud f23806b;

                                        {
                                            this.f23806b = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            f1 f1Var;
                                            dd ddVar;
                                            ta.f0 f0VarA;
                                            ta.a aVarB;
                                            int i13 = i12;
                                            int i14 = 2;
                                            int i15 = 1;
                                            int i16 = 0;
                                            ud udVar = this.f23806b;
                                            switch (i13) {
                                                case 0:
                                                    udVar.b();
                                                    return;
                                                case 1:
                                                    pb pbVar2 = udVar.f24040b;
                                                    String str = udVar.f24041c;
                                                    tf tfVar = zd.f24203a;
                                                    f1 f1Var2 = f1.f23447c;
                                                    byte b10 = (byte) (((byte) 2) | 1);
                                                    Context context = pbVar2.f23846b;
                                                    Pattern pattern = xe.f24149a;
                                                    com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x(context);
                                                    xVar.G("phenotype");
                                                    xVar.H("all_accounts.pb");
                                                    Uri uriI = xVar.I();
                                                    if (uriI == null) {
                                                        throw new NullPointerException("Null uri");
                                                    }
                                                    dd ddVarV = dd.v();
                                                    if (ddVarV == null) {
                                                        throw new NullPointerException("Null schema");
                                                    }
                                                    tf tfVar2 = zd.f24203a;
                                                    tfVar2.getClass();
                                                    na.p pVar = new na.p(tfVar2);
                                                    byte b11 = (byte) (b10 | 2);
                                                    oa.f0 f0Var = oa.j0.f47265b;
                                                    oa.n1 n1Var = oa.n1.f47281e;
                                                    if (b11 != 3) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        if ((b11 & 1) == 0) {
                                                            sb2.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((b11 & 2) == 0) {
                                                            sb2.append(" enableTracing");
                                                        }
                                                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                                                    }
                                                    kf kfVar = new kf(uriI, ddVarV, pVar, n1Var);
                                                    nf nfVar = zd.f24205c;
                                                    if (nfVar == null) {
                                                        synchronized (zd.f24204b) {
                                                            try {
                                                                nfVar = zd.f24205c;
                                                                if (nfVar == null) {
                                                                    HashMap map = new HashMap();
                                                                    ta.q0 q0VarA = pbVar2.a();
                                                                    te teVar = (te) pbVar2.f23850f.get();
                                                                    of ofVar = of.f23818a;
                                                                    go.k.k(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", ofVar);
                                                                    nf nfVar2 = new nf(q0VarA, teVar, map);
                                                                    zd.f24205c = nfVar2;
                                                                    nfVar = nfVar2;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        pbVar2 = pbVar2;
                                                        i15 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nfVar.f23782b;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriI);
                                                    if (pairCreate == null) {
                                                        go.k.k(uriI.isHierarchical(), "Uri must be hierarchical: %s", uriI);
                                                        String lastPathSegment = uriI.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        go.k.k((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriI);
                                                        of ofVar2 = (of) ((HashMap) nfVar.f23786f).get("singleproc");
                                                        go.k.k(ofVar2 != null ? i15 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriI.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        ta.s sVarG = ta.k0.g(ta.k0.d(uriI), (hc) nfVar.f23785e, ta.c0.f50592a);
                                                        Executor executor = (Executor) nfVar.f23783c;
                                                        te teVar2 = (te) nfVar.f23784d;
                                                        ofVar2.getClass();
                                                        uf ufVar = new uf(ddVarV, z0.a());
                                                        ta.n0 n0VarD = ta.k0.d(uriI);
                                                        f1Var = f1Var2;
                                                        f1 f1Var3 = new f1(16);
                                                        z40 z40Var = new z40();
                                                        z40Var.f22498h = new Object();
                                                        ddVar = ddVarV;
                                                        z40Var.f22499i = new m0.s1(26);
                                                        z40Var.f22500j = null;
                                                        z40Var.f22491a = strSubstring;
                                                        z40Var.f22492b = ta.k0.e(n0VarD);
                                                        z40Var.f22493c = ufVar;
                                                        z40Var.f22494d = new ta.u0(executor);
                                                        z40Var.f22495e = teVar2;
                                                        z40Var.f22496f = pVar;
                                                        z40Var.f22497g = f1Var3;
                                                        mf mfVar = new mf(z40Var, sVarG);
                                                        if (!n1Var.isEmpty()) {
                                                            ce ceVar = new ce(i15, n1Var, executor);
                                                            synchronized (mfVar.f23748g) {
                                                                mfVar.f23750i.add(ceVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(mfVar, kfVar);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriI, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    } else {
                                                        f1Var = f1Var2;
                                                        ddVar = ddVarV;
                                                    }
                                                    mf mfVar2 = (mf) pairCreate.first;
                                                    kf kfVar2 = (kf) pairCreate.second;
                                                    if (kfVar.equals(kfVar2)) {
                                                        ta.t tVarA = mfVar2.a(new sd(str, 1), pbVar2.a());
                                                        tVarA.addListener(new qd(udVar, tVarA, 0), pbVar2.a());
                                                        return;
                                                    }
                                                    String strB = j1.f.B("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", dd.class.getSimpleName(), uriI);
                                                    go.k.k(uriI.equals(kfVar2.f23679a), strB, "uri");
                                                    go.k.k(ddVar.equals(kfVar2.f23680b), strB, "schema");
                                                    go.k.k(pVar.equals(kfVar2.f23681c), strB, "handler");
                                                    go.k.k(n1Var.equals(kfVar2.f23682d), strB, "migrations");
                                                    Object obj = f1Var;
                                                    go.k.k(obj.equals(obj), strB, "variantConfig");
                                                    throw new IllegalArgumentException(j1.f.B(strB, "unknown"));
                                                case 2:
                                                    ee eeVar = udVar.f24040b.f23853i;
                                                    boolean z10 = udVar.f24043e;
                                                    rd rdVar = rd.f23934a;
                                                    he heVar = (he) eeVar.f23427c.get();
                                                    if (heVar == null && !z10) {
                                                        ta.n0 n0Var = ta.n0.f50627b;
                                                        return;
                                                    }
                                                    if ((eeVar.f23429e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = eeVar.f23430f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i17 = eeVar.f23429e;
                                                                if ((i17 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(rdVar);
                                                                    eeVar.f23429e = i17 | 64;
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (eeVar.f23432h == null) {
                                                        synchronized (eeVar.f23431g) {
                                                            try {
                                                                if (eeVar.f23432h == null) {
                                                                    if (heVar == null) {
                                                                        heVar = de.f23391a;
                                                                    }
                                                                    Context context2 = eeVar.f23425a;
                                                                    if (gb.i(context2)) {
                                                                        f0VarA = ((ic) eeVar.f23428d.get()).a(new h6(eeVar, heVar));
                                                                        eeVar.f23432h = f0VarA;
                                                                    } else {
                                                                        be beVar = be.f23319b;
                                                                        na.r rVar = eeVar.f23426b;
                                                                        f0VarA = ta.k0.g(gb.h(context2, Executors.callable(beVar, null), (Executor) rVar.get()), new ce(i16, eeVar, heVar), (Executor) rVar.get());
                                                                        eeVar.f23432h = f0VarA;
                                                                    }
                                                                    f0VarA.addListener(new ae(f0VarA, i14), (Executor) eeVar.f23426b.get());
                                                                }
                                                            } catch (Throwable th4) {
                                                                throw th4;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    bo.e eVarA = udVar.a();
                                                    String str2 = (String) eVarA.f5777b;
                                                    pb pbVar3 = udVar.f24040b;
                                                    na.r rVar2 = pbVar3.f23848d;
                                                    ie ieVarB = pbVar3.f23851g.b();
                                                    boolean z11 = ieVarB.f23593i;
                                                    if (ieVarB.f23594j) {
                                                        if (go.c.I(str2) && !z11) {
                                                            ta.n0 n0Var2 = ta.n0.f50627b;
                                                            return;
                                                        }
                                                        yb ybVarV = bc.v();
                                                        com.google.android.gms.internal.ads.n3 n3Var = (com.google.android.gms.internal.ads.n3) eVarA.f5780e;
                                                        int i18 = n3Var.f17624a;
                                                        zb zbVarU = ac.u();
                                                        zbVarU.b();
                                                        ((ac) zbVarU.f23489b).v(i18);
                                                        int i19 = n3Var.f17625b;
                                                        zbVarU.b();
                                                        ((ac) zbVarU.f23489b).w(i19);
                                                        ac acVar = (ac) zbVarU.f();
                                                        ybVarV.b();
                                                        ((bc) ybVarV.f23489b).x(acVar);
                                                        if (!go.c.I(str2)) {
                                                            ybVarV.b();
                                                            ((bc) ybVarV.f23489b).w(str2);
                                                        }
                                                        if (z11) {
                                                            String str3 = udVar.f24041c;
                                                            ybVarV.b();
                                                            ((bc) ybVarV.f23489b).y(str3);
                                                        }
                                                        ic icVar = (ic) rVar2.get();
                                                        bc bcVar = (bc) ybVarV.f();
                                                        bb bbVar = icVar.f23582a;
                                                        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
                                                        mVarB.f11732d = new q6(bcVar, 7);
                                                        mVarB.f11729a = new i9.c[]{h.f23522a};
                                                        mVarB.f11730b = false;
                                                        aVarB = ic.b(bbVar.c(0, mVarB.a()).continueWithTask(ta.c0.f50592a, new h6(i15, bbVar, bcVar)));
                                                    } else {
                                                        if (go.c.I(str2)) {
                                                            ta.n0 n0Var3 = ta.n0.f50627b;
                                                            return;
                                                        }
                                                        ic icVar2 = (ic) rVar2.get();
                                                        icVar2.getClass();
                                                        str2.getClass();
                                                        aVarB = ic.b(icVar2.f23582a.d(str2));
                                                    }
                                                    ta.k0.a(aVarB, gc.class, new pd(udVar, i16), pbVar3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.f24046h.N()) {
                                    final int i13 = 2;
                                    ((ta.t0) pbVar.a()).execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.od

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ ud f23806b;

                                        {
                                            this.f23806b = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            f1 f1Var;
                                            dd ddVar;
                                            ta.f0 f0VarA;
                                            ta.a aVarB;
                                            int i14 = i13;
                                            int i15 = 2;
                                            int i16 = 1;
                                            int i17 = 0;
                                            ud udVar = this.f23806b;
                                            switch (i14) {
                                                case 0:
                                                    udVar.b();
                                                    return;
                                                case 1:
                                                    pb pbVar2 = udVar.f24040b;
                                                    String str = udVar.f24041c;
                                                    tf tfVar = zd.f24203a;
                                                    f1 f1Var2 = f1.f23447c;
                                                    byte b10 = (byte) (((byte) 2) | 1);
                                                    Context context = pbVar2.f23846b;
                                                    Pattern pattern = xe.f24149a;
                                                    com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x(context);
                                                    xVar.G("phenotype");
                                                    xVar.H("all_accounts.pb");
                                                    Uri uriI = xVar.I();
                                                    if (uriI == null) {
                                                        throw new NullPointerException("Null uri");
                                                    }
                                                    dd ddVarV = dd.v();
                                                    if (ddVarV == null) {
                                                        throw new NullPointerException("Null schema");
                                                    }
                                                    tf tfVar2 = zd.f24203a;
                                                    tfVar2.getClass();
                                                    na.p pVar = new na.p(tfVar2);
                                                    byte b11 = (byte) (b10 | 2);
                                                    oa.f0 f0Var = oa.j0.f47265b;
                                                    oa.n1 n1Var = oa.n1.f47281e;
                                                    if (b11 != 3) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        if ((b11 & 1) == 0) {
                                                            sb2.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((b11 & 2) == 0) {
                                                            sb2.append(" enableTracing");
                                                        }
                                                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                                                    }
                                                    kf kfVar = new kf(uriI, ddVarV, pVar, n1Var);
                                                    nf nfVar = zd.f24205c;
                                                    if (nfVar == null) {
                                                        synchronized (zd.f24204b) {
                                                            try {
                                                                nfVar = zd.f24205c;
                                                                if (nfVar == null) {
                                                                    HashMap map = new HashMap();
                                                                    ta.q0 q0VarA = pbVar2.a();
                                                                    te teVar = (te) pbVar2.f23850f.get();
                                                                    of ofVar = of.f23818a;
                                                                    go.k.k(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", ofVar);
                                                                    nf nfVar2 = new nf(q0VarA, teVar, map);
                                                                    zd.f24205c = nfVar2;
                                                                    nfVar = nfVar2;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        pbVar2 = pbVar2;
                                                        i16 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nfVar.f23782b;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriI);
                                                    if (pairCreate == null) {
                                                        go.k.k(uriI.isHierarchical(), "Uri must be hierarchical: %s", uriI);
                                                        String lastPathSegment = uriI.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        go.k.k((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriI);
                                                        of ofVar2 = (of) ((HashMap) nfVar.f23786f).get("singleproc");
                                                        go.k.k(ofVar2 != null ? i16 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriI.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        ta.s sVarG = ta.k0.g(ta.k0.d(uriI), (hc) nfVar.f23785e, ta.c0.f50592a);
                                                        Executor executor = (Executor) nfVar.f23783c;
                                                        te teVar2 = (te) nfVar.f23784d;
                                                        ofVar2.getClass();
                                                        uf ufVar = new uf(ddVarV, z0.a());
                                                        ta.n0 n0VarD = ta.k0.d(uriI);
                                                        f1Var = f1Var2;
                                                        f1 f1Var3 = new f1(16);
                                                        z40 z40Var = new z40();
                                                        z40Var.f22498h = new Object();
                                                        ddVar = ddVarV;
                                                        z40Var.f22499i = new m0.s1(26);
                                                        z40Var.f22500j = null;
                                                        z40Var.f22491a = strSubstring;
                                                        z40Var.f22492b = ta.k0.e(n0VarD);
                                                        z40Var.f22493c = ufVar;
                                                        z40Var.f22494d = new ta.u0(executor);
                                                        z40Var.f22495e = teVar2;
                                                        z40Var.f22496f = pVar;
                                                        z40Var.f22497g = f1Var3;
                                                        mf mfVar = new mf(z40Var, sVarG);
                                                        if (!n1Var.isEmpty()) {
                                                            ce ceVar = new ce(i16, n1Var, executor);
                                                            synchronized (mfVar.f23748g) {
                                                                mfVar.f23750i.add(ceVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(mfVar, kfVar);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriI, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    } else {
                                                        f1Var = f1Var2;
                                                        ddVar = ddVarV;
                                                    }
                                                    mf mfVar2 = (mf) pairCreate.first;
                                                    kf kfVar2 = (kf) pairCreate.second;
                                                    if (kfVar.equals(kfVar2)) {
                                                        ta.t tVarA = mfVar2.a(new sd(str, 1), pbVar2.a());
                                                        tVarA.addListener(new qd(udVar, tVarA, 0), pbVar2.a());
                                                        return;
                                                    }
                                                    String strB = j1.f.B("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", dd.class.getSimpleName(), uriI);
                                                    go.k.k(uriI.equals(kfVar2.f23679a), strB, "uri");
                                                    go.k.k(ddVar.equals(kfVar2.f23680b), strB, "schema");
                                                    go.k.k(pVar.equals(kfVar2.f23681c), strB, "handler");
                                                    go.k.k(n1Var.equals(kfVar2.f23682d), strB, "migrations");
                                                    Object obj = f1Var;
                                                    go.k.k(obj.equals(obj), strB, "variantConfig");
                                                    throw new IllegalArgumentException(j1.f.B(strB, "unknown"));
                                                case 2:
                                                    ee eeVar = udVar.f24040b.f23853i;
                                                    boolean z10 = udVar.f24043e;
                                                    rd rdVar = rd.f23934a;
                                                    he heVar = (he) eeVar.f23427c.get();
                                                    if (heVar == null && !z10) {
                                                        ta.n0 n0Var = ta.n0.f50627b;
                                                        return;
                                                    }
                                                    if ((eeVar.f23429e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = eeVar.f23430f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i18 = eeVar.f23429e;
                                                                if ((i18 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(rdVar);
                                                                    eeVar.f23429e = i18 | 64;
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (eeVar.f23432h == null) {
                                                        synchronized (eeVar.f23431g) {
                                                            try {
                                                                if (eeVar.f23432h == null) {
                                                                    if (heVar == null) {
                                                                        heVar = de.f23391a;
                                                                    }
                                                                    Context context2 = eeVar.f23425a;
                                                                    if (gb.i(context2)) {
                                                                        f0VarA = ((ic) eeVar.f23428d.get()).a(new h6(eeVar, heVar));
                                                                        eeVar.f23432h = f0VarA;
                                                                    } else {
                                                                        be beVar = be.f23319b;
                                                                        na.r rVar = eeVar.f23426b;
                                                                        f0VarA = ta.k0.g(gb.h(context2, Executors.callable(beVar, null), (Executor) rVar.get()), new ce(i17, eeVar, heVar), (Executor) rVar.get());
                                                                        eeVar.f23432h = f0VarA;
                                                                    }
                                                                    f0VarA.addListener(new ae(f0VarA, i15), (Executor) eeVar.f23426b.get());
                                                                }
                                                            } catch (Throwable th4) {
                                                                throw th4;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    bo.e eVarA = udVar.a();
                                                    String str2 = (String) eVarA.f5777b;
                                                    pb pbVar3 = udVar.f24040b;
                                                    na.r rVar2 = pbVar3.f23848d;
                                                    ie ieVarB = pbVar3.f23851g.b();
                                                    boolean z11 = ieVarB.f23593i;
                                                    if (ieVarB.f23594j) {
                                                        if (go.c.I(str2) && !z11) {
                                                            ta.n0 n0Var2 = ta.n0.f50627b;
                                                            return;
                                                        }
                                                        yb ybVarV = bc.v();
                                                        com.google.android.gms.internal.ads.n3 n3Var = (com.google.android.gms.internal.ads.n3) eVarA.f5780e;
                                                        int i19 = n3Var.f17624a;
                                                        zb zbVarU = ac.u();
                                                        zbVarU.b();
                                                        ((ac) zbVarU.f23489b).v(i19);
                                                        int i110 = n3Var.f17625b;
                                                        zbVarU.b();
                                                        ((ac) zbVarU.f23489b).w(i110);
                                                        ac acVar = (ac) zbVarU.f();
                                                        ybVarV.b();
                                                        ((bc) ybVarV.f23489b).x(acVar);
                                                        if (!go.c.I(str2)) {
                                                            ybVarV.b();
                                                            ((bc) ybVarV.f23489b).w(str2);
                                                        }
                                                        if (z11) {
                                                            String str3 = udVar.f24041c;
                                                            ybVarV.b();
                                                            ((bc) ybVarV.f23489b).y(str3);
                                                        }
                                                        ic icVar = (ic) rVar2.get();
                                                        bc bcVar = (bc) ybVarV.f();
                                                        bb bbVar = icVar.f23582a;
                                                        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
                                                        mVarB.f11732d = new q6(bcVar, 7);
                                                        mVarB.f11729a = new i9.c[]{h.f23522a};
                                                        mVarB.f11730b = false;
                                                        aVarB = ic.b(bbVar.c(0, mVarB.a()).continueWithTask(ta.c0.f50592a, new h6(i16, bbVar, bcVar)));
                                                    } else {
                                                        if (go.c.I(str2)) {
                                                            ta.n0 n0Var3 = ta.n0.f50627b;
                                                            return;
                                                        }
                                                        ic icVar2 = (ic) rVar2.get();
                                                        icVar2.getClass();
                                                        str2.getClass();
                                                        aVarB = ic.b(icVar2.f23582a.d(str2));
                                                    }
                                                    ta.k0.a(aVarB, gc.class, new pd(udVar, i17), pbVar3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                eVar = eVarL;
                            } else {
                                final int i14 = 0;
                                ((ta.t0) pbVar.a()).execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.od

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ ud f23806b;

                                    {
                                        this.f23806b = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        f1 f1Var;
                                        dd ddVar;
                                        ta.f0 f0VarA;
                                        ta.a aVarB;
                                        int i15 = i14;
                                        int i16 = 2;
                                        int i17 = 1;
                                        int i18 = 0;
                                        ud udVar = this.f23806b;
                                        switch (i15) {
                                            case 0:
                                                udVar.b();
                                                return;
                                            case 1:
                                                pb pbVar2 = udVar.f24040b;
                                                String str = udVar.f24041c;
                                                tf tfVar = zd.f24203a;
                                                f1 f1Var2 = f1.f23447c;
                                                byte b10 = (byte) (((byte) 2) | 1);
                                                Context context = pbVar2.f23846b;
                                                Pattern pattern = xe.f24149a;
                                                com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x(context);
                                                xVar.G("phenotype");
                                                xVar.H("all_accounts.pb");
                                                Uri uriI = xVar.I();
                                                if (uriI == null) {
                                                    throw new NullPointerException("Null uri");
                                                }
                                                dd ddVarV = dd.v();
                                                if (ddVarV == null) {
                                                    throw new NullPointerException("Null schema");
                                                }
                                                tf tfVar2 = zd.f24203a;
                                                tfVar2.getClass();
                                                na.p pVar = new na.p(tfVar2);
                                                byte b11 = (byte) (b10 | 2);
                                                oa.f0 f0Var = oa.j0.f47265b;
                                                oa.n1 n1Var = oa.n1.f47281e;
                                                if (b11 != 3) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    if ((b11 & 1) == 0) {
                                                        sb2.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((b11 & 2) == 0) {
                                                        sb2.append(" enableTracing");
                                                    }
                                                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                                                }
                                                kf kfVar = new kf(uriI, ddVarV, pVar, n1Var);
                                                nf nfVar = zd.f24205c;
                                                if (nfVar == null) {
                                                    synchronized (zd.f24204b) {
                                                        try {
                                                            nfVar = zd.f24205c;
                                                            if (nfVar == null) {
                                                                HashMap map = new HashMap();
                                                                ta.q0 q0VarA = pbVar2.a();
                                                                te teVar = (te) pbVar2.f23850f.get();
                                                                of ofVar = of.f23818a;
                                                                go.k.k(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", ofVar);
                                                                nf nfVar2 = new nf(q0VarA, teVar, map);
                                                                zd.f24205c = nfVar2;
                                                                nfVar = nfVar2;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    pbVar2 = pbVar2;
                                                    i17 = 1;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nfVar.f23782b;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uriI);
                                                if (pairCreate == null) {
                                                    go.k.k(uriI.isHierarchical(), "Uri must be hierarchical: %s", uriI);
                                                    String lastPathSegment = uriI.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    go.k.k((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriI);
                                                    of ofVar2 = (of) ((HashMap) nfVar.f23786f).get("singleproc");
                                                    go.k.k(ofVar2 != null ? i17 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriI.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    ta.s sVarG = ta.k0.g(ta.k0.d(uriI), (hc) nfVar.f23785e, ta.c0.f50592a);
                                                    Executor executor = (Executor) nfVar.f23783c;
                                                    te teVar2 = (te) nfVar.f23784d;
                                                    ofVar2.getClass();
                                                    uf ufVar = new uf(ddVarV, z0.a());
                                                    ta.n0 n0VarD = ta.k0.d(uriI);
                                                    f1Var = f1Var2;
                                                    f1 f1Var3 = new f1(16);
                                                    z40 z40Var = new z40();
                                                    z40Var.f22498h = new Object();
                                                    ddVar = ddVarV;
                                                    z40Var.f22499i = new m0.s1(26);
                                                    z40Var.f22500j = null;
                                                    z40Var.f22491a = strSubstring;
                                                    z40Var.f22492b = ta.k0.e(n0VarD);
                                                    z40Var.f22493c = ufVar;
                                                    z40Var.f22494d = new ta.u0(executor);
                                                    z40Var.f22495e = teVar2;
                                                    z40Var.f22496f = pVar;
                                                    z40Var.f22497g = f1Var3;
                                                    mf mfVar = new mf(z40Var, sVarG);
                                                    if (!n1Var.isEmpty()) {
                                                        ce ceVar = new ce(i17, n1Var, executor);
                                                        synchronized (mfVar.f23748g) {
                                                            mfVar.f23750i.add(ceVar);
                                                        }
                                                    }
                                                    pairCreate = Pair.create(mfVar, kfVar);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriI, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                    break;
                                                } else {
                                                    f1Var = f1Var2;
                                                    ddVar = ddVarV;
                                                }
                                                mf mfVar2 = (mf) pairCreate.first;
                                                kf kfVar2 = (kf) pairCreate.second;
                                                if (kfVar.equals(kfVar2)) {
                                                    ta.t tVarA = mfVar2.a(new sd(str, 1), pbVar2.a());
                                                    tVarA.addListener(new qd(udVar, tVarA, 0), pbVar2.a());
                                                    return;
                                                }
                                                String strB = j1.f.B("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", dd.class.getSimpleName(), uriI);
                                                go.k.k(uriI.equals(kfVar2.f23679a), strB, "uri");
                                                go.k.k(ddVar.equals(kfVar2.f23680b), strB, "schema");
                                                go.k.k(pVar.equals(kfVar2.f23681c), strB, "handler");
                                                go.k.k(n1Var.equals(kfVar2.f23682d), strB, "migrations");
                                                Object obj = f1Var;
                                                go.k.k(obj.equals(obj), strB, "variantConfig");
                                                throw new IllegalArgumentException(j1.f.B(strB, "unknown"));
                                            case 2:
                                                ee eeVar = udVar.f24040b.f23853i;
                                                boolean z10 = udVar.f24043e;
                                                rd rdVar = rd.f23934a;
                                                he heVar = (he) eeVar.f23427c.get();
                                                if (heVar == null && !z10) {
                                                    ta.n0 n0Var = ta.n0.f50627b;
                                                    return;
                                                }
                                                if ((eeVar.f23429e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = eeVar.f23430f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i19 = eeVar.f23429e;
                                                            if ((i19 & 64) == 0) {
                                                                copyOnWriteArrayList.add(rdVar);
                                                                eeVar.f23429e = i19 | 64;
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (eeVar.f23432h == null) {
                                                    synchronized (eeVar.f23431g) {
                                                        try {
                                                            if (eeVar.f23432h == null) {
                                                                if (heVar == null) {
                                                                    heVar = de.f23391a;
                                                                }
                                                                Context context2 = eeVar.f23425a;
                                                                if (gb.i(context2)) {
                                                                    f0VarA = ((ic) eeVar.f23428d.get()).a(new h6(eeVar, heVar));
                                                                    eeVar.f23432h = f0VarA;
                                                                } else {
                                                                    be beVar = be.f23319b;
                                                                    na.r rVar = eeVar.f23426b;
                                                                    f0VarA = ta.k0.g(gb.h(context2, Executors.callable(beVar, null), (Executor) rVar.get()), new ce(i18, eeVar, heVar), (Executor) rVar.get());
                                                                    eeVar.f23432h = f0VarA;
                                                                }
                                                                f0VarA.addListener(new ae(f0VarA, i16), (Executor) eeVar.f23426b.get());
                                                            }
                                                        } catch (Throwable th4) {
                                                            throw th4;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                bo.e eVarA = udVar.a();
                                                String str2 = (String) eVarA.f5777b;
                                                pb pbVar3 = udVar.f24040b;
                                                na.r rVar2 = pbVar3.f23848d;
                                                ie ieVarB = pbVar3.f23851g.b();
                                                boolean z11 = ieVarB.f23593i;
                                                if (ieVarB.f23594j) {
                                                    if (go.c.I(str2) && !z11) {
                                                        ta.n0 n0Var2 = ta.n0.f50627b;
                                                        return;
                                                    }
                                                    yb ybVarV = bc.v();
                                                    com.google.android.gms.internal.ads.n3 n3Var = (com.google.android.gms.internal.ads.n3) eVarA.f5780e;
                                                    int i110 = n3Var.f17624a;
                                                    zb zbVarU = ac.u();
                                                    zbVarU.b();
                                                    ((ac) zbVarU.f23489b).v(i110);
                                                    int i111 = n3Var.f17625b;
                                                    zbVarU.b();
                                                    ((ac) zbVarU.f23489b).w(i111);
                                                    ac acVar = (ac) zbVarU.f();
                                                    ybVarV.b();
                                                    ((bc) ybVarV.f23489b).x(acVar);
                                                    if (!go.c.I(str2)) {
                                                        ybVarV.b();
                                                        ((bc) ybVarV.f23489b).w(str2);
                                                    }
                                                    if (z11) {
                                                        String str3 = udVar.f24041c;
                                                        ybVarV.b();
                                                        ((bc) ybVarV.f23489b).y(str3);
                                                    }
                                                    ic icVar = (ic) rVar2.get();
                                                    bc bcVar = (bc) ybVarV.f();
                                                    bb bbVar = icVar.f23582a;
                                                    com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
                                                    mVarB.f11732d = new q6(bcVar, 7);
                                                    mVarB.f11729a = new i9.c[]{h.f23522a};
                                                    mVarB.f11730b = false;
                                                    aVarB = ic.b(bbVar.c(0, mVarB.a()).continueWithTask(ta.c0.f50592a, new h6(i17, bbVar, bcVar)));
                                                } else {
                                                    if (go.c.I(str2)) {
                                                        ta.n0 n0Var3 = ta.n0.f50627b;
                                                        return;
                                                    }
                                                    ic icVar2 = (ic) rVar2.get();
                                                    icVar2.getClass();
                                                    str2.getClass();
                                                    aVarB = ic.b(icVar2.f23582a.d(str2));
                                                }
                                                ta.k0.a(aVarB, gc.class, new pd(udVar, i18), pbVar3.a());
                                                return;
                                        }
                                    }
                                });
                                eVar = new bo.e(le.B(), (com.google.android.gms.internal.ads.n3) eVarL.f5780e);
                            }
                        }
                        if (!this.f24043e || ((com.google.android.gms.internal.ads.n3) eVar.f5780e).f17625b != 17) {
                            this.f24039a = eVar;
                        }
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return eVar;
    }

    public final void b() {
        g9.k kVar = this.f24046h;
        pb pbVar = (pb) kVar.f41770b;
        ic icVar = (ic) pbVar.f23848d.get();
        String str = (String) kVar.f41772d;
        icVar.getClass();
        str.getClass();
        bb bbVar = icVar.f23582a;
        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
        mVarB.f11732d = new xd(str, 1);
        ta.t tVarF = ta.k0.f(ic.b(bbVar.c(0, mVarB.a()).continueWith(ta.c0.f50592a, new f1(12))), e3.f23409d, pbVar.a());
        pd pdVar = new pd(kVar, 1);
        pb pbVar2 = this.f24040b;
        ta.k0.g(tVarF, pdVar, pbVar2.a()).addListener(new qd(this, tVarF, 1), pbVar2.a());
    }
}
