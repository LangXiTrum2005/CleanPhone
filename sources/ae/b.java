package ae;

import android.content.ContentResolver;
import android.provider.Settings;
import com.applovin.impl.a3;
import com.applovin.impl.j5;
import com.applovin.impl.m3;
import com.google.firebase.perf.FirebasePerfRegistrar;
import ea.f2;
import eb.c0;
import eb.d0;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import jb.a1;
import jb.e0;
import jb.f0;
import jb.g0;
import jb.h0;
import jb.s1;
import jb.w0;
import jb.z0;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements r, b3.g, eb.y, tb.d, eb.t, eb.r, eb.e, eb.c, s.a, com.applovin.impl.sdk.m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3489a;

    public /* synthetic */ b(int i10) {
        this.f3489a = i10;
    }

    @Override // com.applovin.impl.sdk.m.d
    public String a(ContentResolver contentResolver, String str) {
        switch (this.f3489a) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return Settings.System.getString(contentResolver, str);
            default:
                return Settings.Secure.getString(contentResolver, str);
        }
    }

    @Override // s.a
    public Object apply(Object obj) {
        j5 j5Var = (j5) obj;
        switch (this.f3489a) {
            case 18:
                return a3.g(j5Var);
            case 19:
                return a3.e(j5Var);
            case 20:
                return a3.d(j5Var);
            case 21:
                return a3.f(j5Var);
            case 22:
                return a3.b(j5Var);
            case 23:
                return m3.a(j5Var);
            case 24:
                return com.applovin.impl.sdk.ad.b.n(j5Var);
            case 25:
                return com.applovin.impl.sdk.ad.b.l(j5Var);
            default:
                return com.applovin.impl.sdk.ad.b.h(j5Var);
        }
    }

    @Override // eb.r
    public va.i b(d0 d0Var) throws GeneralSecurityException {
        a1 a1Var = (a1) d0Var.f39977c;
        if (!a1Var.D().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + a1Var.D());
        }
        try {
            h0 h0VarC = h0.C(a1Var.E(), com.google.crypto.tink.shaded.protobuf.p.a());
            if (h0VarC.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            f2 f2VarB = bb.e.b();
            f2VarB.E(h0VarC.z());
            f2VarB.f39410c = cb.a.b(a1Var.C());
            return f2VarB.b();
        } catch (com.google.crypto.tink.shaded.protobuf.d0 e10) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
        }
    }

    @Override // ae.r
    public Object d() {
        switch (this.f3489a) {
            case 0:
                return new LinkedHashMap();
            case 1:
                return new TreeMap();
            case 2:
                return new ConcurrentHashMap();
            case 3:
                return new ConcurrentSkipListMap();
            case 4:
                return new ArrayList();
            case 5:
                return new LinkedHashSet();
            case 6:
                return new TreeSet();
            case 7:
                return new ArrayDeque();
            default:
                return new q(true);
        }
    }

    @Override // eb.y
    public Object e(i0 i0Var) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f3489a) {
            case 11:
                bb.a aVar = (bb.a) i0Var;
                bb.c.a(aVar.f5511b);
                return new kb.d(((lb.a) aVar.f5512c.f50111a).b(), aVar.f5513d);
            default:
                c0 c0Var = ((eb.h) i0Var).f39986b;
                eb.h.u0(c0Var);
                Integer num = c0Var.f39972f;
                va.b bVar = (va.b) eb.a.f39960d.a(va.b.class, c0Var.f39967a).a(c0Var.f39969c);
                s1 s1Var = c0Var.f39971e;
                int iOrdinal = s1Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = eb.p.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = eb.p.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type " + s1Var.getNumber());
                    }
                    bArrB = eb.p.a(num.intValue()).b();
                } else {
                    bArrB = eb.p.f40006a.b();
                }
                return new cb.b(bVar, s1Var, bArrB);
        }
    }

    @Override // b3.g
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // eb.t
    public d0 f(va.i iVar) {
        bb.e eVar = (bb.e) iVar;
        z0 z0VarF = a1.F();
        z0VarF.i("type.googleapis.com/google.crypto.tink.AesSivKey");
        g0 g0VarB = h0.B();
        int i10 = eVar.f5524a;
        g0VarB.e();
        h0.y((h0) g0VarB.f24645b, i10);
        z0VarF.j(((h0) g0VarB.a()).e());
        z0VarF.h(cb.a.a(eVar.f5525b));
        return d0.R0((a1) z0VarF.a());
    }

    @Override // tb.d
    public Object g(tb.s sVar) {
        return FirebasePerfRegistrar.providesFirebasePerformance(sVar);
    }

    @Override // eb.e
    public c0 h(i0 i0Var) {
        bb.a aVar = (bb.a) i0Var;
        e0 e0VarB = f0.B();
        byte[] bArrB = ((lb.a) aVar.f5512c.f50111a).b();
        com.google.crypto.tink.shaded.protobuf.h hVarM = com.google.crypto.tink.shaded.protobuf.i.m(bArrB, 0, bArrB.length);
        e0VarB.e();
        f0.y((f0) e0VarB.f24645b, hVarM);
        return c0.a("type.googleapis.com/google.crypto.tink.AesSivKey", ((f0) e0VarB.a()).e(), w0.SYMMETRIC, cb.a.a(aVar.f5511b.f5525b), aVar.f5514e);
    }

    @Override // eb.c
    public i0 a(eb.f0 f0Var) throws GeneralSecurityException {
        c0 c0Var = (c0) f0Var;
        if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            f0 f0VarC = f0.C(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
            if (f0VarC.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            f2 f2VarB = bb.e.b();
            f2VarB.E(f0VarC.z().size());
            f2VarB.f39410c = cb.a.b(c0Var.f39971e);
            bb.e eVarB = f2VarB.b();
            g9.k kVar = new g9.k(3);
            kVar.f41771c = null;
            kVar.f41772d = null;
            kVar.f41770b = eVarB;
            kVar.f41771c = new s4.i(lb.a.a(f0VarC.z().q()));
            kVar.f41772d = c0Var.f39972f;
            return kVar.d();
        } catch (com.google.crypto.tink.shaded.protobuf.d0 unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }
}
