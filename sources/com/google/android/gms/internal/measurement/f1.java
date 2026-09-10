package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.zs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements d2, com.google.android.gms.common.api.internal.k, Continuation, o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f23446b = new f1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f23447c = new f1(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1 f23448d = new f1(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f1 f23449e = new f1(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23450a;

    public /* synthetic */ f1(int i10) {
        this.f23450a = i10;
    }

    public static final s1 c(long j10, Object obj) {
        s1 s1Var = (s1) z2.i(j10, obj);
        if (((m0) s1Var).f23719a) {
            return s1Var;
        }
        int size = s1Var.size();
        s1 s1VarG = s1Var.g(size == 0 ? 10 : size + size);
        z2.j(obj, j10, s1VarG);
        return s1VarG;
    }

    public static kg d(String str) {
        boolean z10;
        sg sgVarM;
        ng ngVar = mg.f23751e;
        rg rgVarC = dg.c();
        sg sgVar = rgVarC.f23944b;
        if (sgVar == jg.f23629g) {
            sgVar = null;
            dg.b(rgVarC, null);
            z10 = true;
        } else {
            z10 = false;
        }
        if (sgVar == null) {
            UUID uuidB = eg.f23433c.b();
            String strA = yf.a(uuidB);
            zs zsVar = hg.f23550g;
            oa.u0 u0Var = (oa.u0) dg.f23392a.get();
            if (!u0Var.isEmpty()) {
                u0Var.forEach(new gg(1));
            }
            sgVarM = new ig(uuidB, strA, str, ngVar, zsVar, rgVarC);
        } else {
            sgVarM = sgVar instanceof ag ? ((ag) sgVar).m(str, ngVar, false, rgVarC) : sgVar.f(str, ngVar, rgVarC);
        }
        dg.b(rgVarC, sgVarM);
        return new kg(sgVarM, z10);
    }

    public static final a2 e(Object obj, Object obj2) {
        a2 a2VarG = (a2) obj;
        a2 a2Var = (a2) obj2;
        if (!a2Var.isEmpty()) {
            if (!a2VarG.f23291a) {
                a2VarG = a2VarG.g();
            }
            a2VarG.i();
            if (!a2Var.isEmpty()) {
                a2VarG.putAll(a2Var);
            }
        }
        return a2VarG;
    }

    public static /* bridge */ u2 f(Object obj) {
        i1 i1Var = (i1) obj;
        u2 u2Var = i1Var.zzc;
        if (u2Var != u2.f24013f) {
            return u2Var;
        }
        u2 u2VarA = u2.a();
        i1Var.zzc = u2VarA;
        return u2VarA;
    }

    public static boolean g(int i10, androidx.datastore.preferences.protobuf.n nVar, Object obj) throws u1 {
        fs1 fs1Var = (fs1) nVar.f4137e;
        int i11 = nVar.f4134b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            nVar.F0(0);
            ((u2) obj).d(i12 << 3, Long.valueOf(fs1Var.G()));
            return true;
        }
        if (i13 == 1) {
            nVar.F0(1);
            ((u2) obj).d((i12 << 3) | 1, Long.valueOf(fs1Var.I()));
            return true;
        }
        if (i13 == 2) {
            ((u2) obj).d((i12 << 3) | 2, nVar.U0());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new u1("Protocol message end-group tag did not match expected tag.");
            }
            if (i13 != 5) {
                throw new t1();
            }
            nVar.F0(5);
            ((u2) obj).d(5 | (i12 << 3), Integer.valueOf(fs1Var.J()));
            return true;
        }
        u2 u2VarA = u2.a();
        int i14 = i12 << 3;
        int i15 = i10 + 1;
        if (i15 >= 100) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (nVar.R0() != Integer.MAX_VALUE && g(i15, nVar, u2VarA)) {
        }
        if ((i14 | 4) != nVar.f4134b) {
            throw new u1("Protocol message end-group tag did not match expected tag.");
        }
        if (u2VarA.f24018e) {
            u2VarA.f24018e = false;
        }
        ((u2) obj).d(i14 | 3, u2VarA);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.d2
    public boolean a(Class cls) {
        switch (this.f23450a) {
            case 0:
                return i1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.common.api.internal.k
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i10 = bb.l;
    }

    @Override // com.google.android.gms.internal.measurement.d2
    public n2 b(Class cls) {
        switch (this.f23450a) {
            case 0:
                if (!i1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (n2) i1.o(cls.asSubclass(i1.class)).t(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        i1 i1VarF;
        sa saVar = (sa) task.getResult();
        cc ccVarA = dc.A();
        String str = saVar.f23959a;
        ccVarA.b();
        ((dc) ccVarA.f23489b).B(str);
        String str2 = saVar.f23961c;
        ccVarA.b();
        ((dc) ccVarA.f23489b).D(str2);
        boolean z10 = saVar.f23964f;
        ccVarA.b();
        ((dc) ccVarA.f23489b).G(z10);
        long j10 = saVar.f23965g;
        ccVarA.b();
        ((dc) ccVarA.f23489b).H(j10);
        byte[] bArr = saVar.f23960b;
        if (bArr != null) {
            r0 r0VarS = s0.s(bArr, 0, bArr.length);
            ccVarA.b();
            ((dc) ccVarA.f23489b).C(r0VarS);
        }
        for (ra raVar : saVar.f23962d) {
            for (va vaVar : raVar.f23926b) {
                int i10 = vaVar.f24088g;
                String str3 = vaVar.f24082a;
                if (i10 == 1) {
                    ec ecVarA = fc.A();
                    ecVarA.i(str3);
                    if (i10 != 1) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j11 = vaVar.f24083b;
                    ecVarA.b();
                    ((fc) ecVarA.f23489b).D(j11);
                    i1VarF = ecVarA.f();
                } else if (i10 == 2) {
                    ec ecVarA2 = fc.A();
                    ecVarA2.i(str3);
                    if (i10 != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z11 = vaVar.f24084c;
                    ecVarA2.b();
                    ((fc) ecVarA2.f23489b).E(z11);
                    i1VarF = ecVarA2.f();
                } else if (i10 == 3) {
                    ec ecVarA3 = fc.A();
                    ecVarA3.i(str3);
                    if (i10 != 3) {
                        throw new IllegalArgumentException("Not a double type");
                    }
                    double d10 = vaVar.f24085d;
                    ecVarA3.b();
                    ((fc) ecVarA3.f23489b).F(d10);
                    i1VarF = ecVarA3.f();
                } else if (i10 == 4) {
                    ec ecVarA4 = fc.A();
                    ecVarA4.i(str3);
                    if (i10 != 4) {
                        throw new IllegalArgumentException("Not a String type");
                    }
                    String str4 = vaVar.f24086e;
                    k9.c0.h(str4);
                    ecVarA4.b();
                    ((fc) ecVarA4.f23489b).G(str4);
                    i1VarF = ecVarA4.f();
                } else {
                    if (i10 != 5) {
                        throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 24), "Unrecognized flag type: ", i10));
                    }
                    ec ecVarA5 = fc.A();
                    ecVarA5.i(str3);
                    if (i10 != 5) {
                        throw new IllegalArgumentException("Not a bytes type");
                    }
                    byte[] bArr2 = vaVar.f24087f;
                    k9.c0.h(bArr2);
                    r0 r0VarS2 = s0.s(bArr2, 0, bArr2.length);
                    ecVarA5.b();
                    ((fc) ecVarA5.f23489b).H(r0VarS2);
                    i1VarF = ecVarA5.f();
                }
                ccVarA.b();
                ((dc) ccVarA.f23489b).E((fc) i1VarF);
            }
            String[] strArr = raVar.f23927c;
            if (strArr != null) {
                for (String str5 : strArr) {
                    ccVarA.b();
                    ((dc) ccVarA.f23489b).F(str5);
                }
            }
        }
        return (dc) ccVarA.f();
    }
}
