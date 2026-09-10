package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f22496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f22497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f22498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f22499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f22500j;

    public z40(a50 a50Var, b2.w wVar) {
        this.f22492b = a50Var;
        this.f22491a = wVar;
        ps0 ps0Var = new ps0(wVar, 0);
        this.f22493c = new e60(ps0Var, 21);
        fx1 fx1Var = a50Var.f11858d;
        o40 o40Var = a50Var.f11864g;
        int i10 = 10;
        this.f22494d = new w70(fx1Var, o40Var, i10);
        ps0 ps0Var2 = new ps0(wVar, 1);
        ps0 ps0Var3 = new ps0(wVar, 2);
        ps0 ps0Var4 = new ps0(wVar, 3);
        this.f22495e = new d80((kx1) o40Var, (kx1) fx1Var, (gx1) ps0Var2, (kx1) ps0Var3, (kx1) ps0Var4, 16);
        this.f22496f = new er0(o40Var, 9);
        fx1 fx1Var2 = a50Var.E;
        this.f22497g = new fz(ps0Var, fx1Var2, fx1Var, 26);
        this.f22498h = new d80((kx1) fx1Var2, (gx1) ps0Var4, (gx1) ps0Var, (kx1) fx1Var, (kx1) new ps0(wVar, 5), 17);
        this.f22499i = fx1.a(new er0(a50Var.f11892w, 13));
        ps0 ps0Var5 = new ps0(wVar, 4);
        fx1 fx1VarA = fx1.a(x10.f21687n);
        fx1 fx1VarA2 = fx1.a(dv.f13736h);
        fx1 fx1VarA3 = fx1.a(rb0.f19505h);
        fx1 fx1VarA4 = fx1.a(v71.f21091o);
        int i11 = ix1.f15869b;
        LinkedHashMap linkedHashMapI = gc1.i(4);
        linkedHashMapI.put(vv0.GMS_SIGNALS, fx1VarA);
        linkedHashMapI.put(vv0.BUILD_URL, fx1VarA2);
        linkedHashMapI.put(vv0.HTTP, fx1VarA3);
        linkedHashMapI.put(vv0.PRE_PROCESS, fx1VarA4);
        fx1 fx1VarA5 = fx1.a(new fz(ps0Var5, a50Var.f11864g, new ix1(linkedHashMapI), i10));
        int i12 = lx1.f17149c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(fx1VarA5);
        this.f22500j = fx1.a(new cr0(a50Var.f11858d, new ca0(new lx1(list, arrayList), 24)));
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f22496f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public r8.h b() {
        String strH = ((String) this.f22491a) == null ? " transportName" : "";
        if (((r8.l) this.f22493c) == null) {
            strH = strH.concat(" encodedPayload");
        }
        if (((Long) this.f22494d) == null) {
            strH = wi.d.h(strH, " eventMillis");
        }
        if (((Long) this.f22495e) == null) {
            strH = wi.d.h(strH, " uptimeMillis");
        }
        if (((HashMap) this.f22496f) == null) {
            strH = wi.d.h(strH, " autoMetadata");
        }
        if (strH.isEmpty()) {
            return new r8.h((String) this.f22491a, (Integer) this.f22492b, (r8.l) this.f22493c, ((Long) this.f22494d).longValue(), ((Long) this.f22495e).longValue(), (HashMap) this.f22496f, (Integer) this.f22497g, (String) this.f22498h, (byte[]) this.f22499i, (byte[]) this.f22500j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[Catch: all -> 0x0017, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:13:0x001b, B:14:0x001d, B:16:0x0023, B:17:0x003f, B:18:0x0044), top: B:25:0x0003, inners: #0 }] */
    public ListenableFuture c(com.google.android.gms.internal.measurement.ce ceVar, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.f22498h) {
            ListenableFuture listenableFuture2 = (ListenableFuture) this.f22500j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (((ListenableFuture) this.f22500j) == null) {
                    this.f22500j = ta.k0.e(((m0.s1) this.f22499i).s(com.google.android.gms.internal.measurement.tg.a(new com.google.android.gms.internal.measurement.qf(this, 0)), (ta.u0) this.f22494d));
                }
                listenableFuture = (ListenableFuture) this.f22500j;
            } else {
                try {
                    ta.k0.b((ListenableFuture) this.f22500j);
                } catch (ExecutionException unused) {
                    this.f22500j = null;
                }
                if (((ListenableFuture) this.f22500j) == null) {
                    this.f22500j = ta.k0.e(((m0.s1) this.f22499i).s(com.google.android.gms.internal.measurement.tg.a(new com.google.android.gms.internal.measurement.qf(this, 0)), (ta.u0) this.f22494d));
                }
                listenableFuture = (ListenableFuture) this.f22500j;
            }
            throw th;
        }
        return ((m0.s1) this.f22499i).s(com.google.android.gms.internal.measurement.tg.a(new com.google.android.gms.internal.measurement.d8(this, listenableFuture, ceVar, executor, 2)), ta.c0.f50592a);
    }

    public com.google.android.gms.internal.measurement.l0 d(Uri uri) throws IOException {
        com.google.android.gms.internal.measurement.uf ufVar = (com.google.android.gms.internal.measurement.uf) this.f22493c;
        String str = (String) this.f22491a;
        com.google.android.gms.internal.measurement.te teVar = (com.google.android.gms.internal.measurement.te) this.f22495e;
        try {
            try {
                com.google.android.gms.internal.measurement.f1 f1Var = (com.google.android.gms.internal.measurement.f1) this.f22497g;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5);
                sb2.append("Read ");
                sb2.append(str);
                String string = sb2.toString();
                f1Var.getClass();
                com.google.android.gms.internal.measurement.kg kgVarD = com.google.android.gms.internal.measurement.f1.d(string);
                try {
                    InputStream inputStreamD = com.google.android.gms.internal.measurement.e1.d(teVar.b(uri));
                    try {
                        com.google.android.gms.internal.measurement.i1 i1VarA = ((com.google.android.gms.internal.measurement.h1) ((com.google.android.gms.internal.measurement.j2) ufVar.f24048a.t(7))).a(inputStreamD, ufVar.f24049b);
                        if (inputStreamD != null) {
                            inputStreamD.close();
                        }
                        kgVarD.close();
                        return i1VarA;
                    } catch (Throwable th2) {
                        if (inputStreamD != null) {
                            try {
                                inputStreamD.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        kgVarD.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (FileNotFoundException e10) {
                com.google.android.gms.internal.measurement.re reVarB = teVar.b(uri);
                if (reVarB.f23935a.b(reVarB.f23938d)) {
                    throw e10;
                }
                return ufVar.f24048a;
            }
        } catch (IOException e11) {
            throw com.google.android.gms.internal.measurement.gb.a(teVar, uri, e11, str);
        }
    }

    public void e(Uri uri, Object obj) throws IOException {
        String str = (String) this.f22491a;
        com.google.android.gms.internal.measurement.te teVar = (com.google.android.gms.internal.measurement.te) this.f22495e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            com.google.android.gms.internal.measurement.f1 f1Var = (com.google.android.gms.internal.measurement.f1) this.f22497g;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
            sb2.append("Write ");
            sb2.append(str);
            String string = sb2.toString();
            f1Var.getClass();
            com.google.android.gms.internal.measurement.kg kgVarD = com.google.android.gms.internal.measurement.f1.d(string);
            try {
                com.google.android.gms.internal.measurement.h6 h6Var = new com.google.android.gms.internal.measurement.h6(5);
                try {
                    com.google.android.gms.internal.measurement.re reVarB = teVar.b(uriBuild);
                    ArrayList arrayListA = reVarB.a(reVarB.f23935a.d(reVarB.f23938d));
                    new com.google.android.gms.internal.measurement.h6[]{h6Var}[0].d(arrayListA);
                    OutputStream outputStream = (OutputStream) arrayListA.get(0);
                    try {
                        ((com.google.android.gms.internal.measurement.l0) obj).b(outputStream);
                        if (((com.google.android.gms.internal.measurement.cf) h6Var.f23541c) == null) {
                            throw new b2.z("Cannot sync underlying stream");
                        }
                        ((OutputStream) h6Var.f23540b).flush();
                        ((com.google.android.gms.internal.measurement.cf) h6Var.f23541c).f23363a.getFD().sync();
                        outputStream.close();
                        kgVarD.close();
                        com.google.android.gms.internal.measurement.re reVarB2 = teVar.b(uriBuild);
                        com.google.android.gms.internal.measurement.re reVarB3 = teVar.b(uri);
                        com.google.android.gms.internal.measurement.jf jfVar = reVarB2.f23935a;
                        if (jfVar != reVarB3.f23935a) {
                            throw new b2.z("Cannot rename file across backends");
                        }
                        jfVar.f(reVarB2.f23938d, reVarB3.f23938d);
                    } catch (Throwable th2) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw com.google.android.gms.internal.measurement.gb.a(teVar, uri, e10, str);
                }
            } catch (Throwable th4) {
                try {
                    kgVarD.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e11) {
            com.google.android.gms.internal.measurement.re reVarB4 = teVar.b(uriBuild);
            if (reVarB4.f23935a.b(reVarB4.f23938d)) {
                try {
                    com.google.android.gms.internal.measurement.re reVarB5 = teVar.b(uriBuild);
                    reVarB5.f23935a.e(reVarB5.f23938d);
                } catch (IOException e12) {
                    e11.addSuppressed(e12);
                }
            }
            throw e11;
        }
    }

    public z40(p1.b0 b0Var, p1.v vVar, l1.u uVar, int i10, int i11, int i12, int i13) {
        this.f22491a = b0Var;
        this.f22493c = vVar;
        this.f22494d = uVar;
        this.f22495e = new i1.n0();
        this.f22496f = uVar.a(b0Var.f47954t, new l1.j(this, 1));
        this.f22497g = new br0(this, i10);
        this.f22498h = new gr0(this, i11);
        this.f22499i = new nr0(this, i12);
        this.f22500j = new vr0(this, i13);
        l1.s sVar = new l1.s(this);
        this.f22492b = sVar;
        b0Var.f47947m.a(sVar);
    }
}
