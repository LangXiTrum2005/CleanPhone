package ud;

import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import jb.k1;
import jb.l1;
import jb.m1;
import jb.n1;
import jb.o1;
import jb.p1;
import jb.r1;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements tb.d, uj.c, n2.n, OnFailureListener, eb.y, eb.t, eb.r, eb.e, eb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52157a;

    public /* synthetic */ t(int i10) {
        this.f52157a = i10;
    }

    @Override // eb.c
    public qk.i0 a(eb.f0 f0Var) throws GeneralSecurityException {
        eb.c0 c0Var = (eb.c0) f0Var;
        switch (this.f52157a) {
            case 18:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    l1 l1VarC = l1.C(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (l1VarC.A() == 0) {
                        return wa.y.u0(new wa.z(l1VarC.z().A(), wa.a0.b(c0Var.f39971e)), c0Var.f39972f);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + l1VarC);
                } catch (com.google.crypto.tink.shaded.protobuf.d0 e10) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
                }
            case 22:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    p1 p1VarC = p1.C(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (p1VarC.A() == 0) {
                        return wa.b0.u0(wa.d0.a(p1VarC.z(), c0Var.f39971e), c0Var.f39972f);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + p1VarC);
                } catch (com.google.crypto.tink.shaded.protobuf.d0 e11) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e11);
                }
            default:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    jb.h hVarE = jb.h.E(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (hVarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (hVarE.A().D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (hVarE.B().D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    com.google.android.gms.internal.consent_sdk.x xVarB = wa.i.b();
                    xVarB.u(hVarE.A().B().size());
                    xVarB.w(hVarE.B().B().size());
                    xVarB.y(hVarE.A().C().A());
                    xVarB.A(hVarE.B().C().C());
                    xVarB.f23264e = xa.a.b(hVarE.B().C().B());
                    xVarB.f23265f = xa.a.d(c0Var.f39971e);
                    wa.i iVarD = xVarB.d();
                    k5.g gVar = new k5.g();
                    gVar.f44326b = null;
                    gVar.f44327c = null;
                    gVar.f44328d = null;
                    gVar.f44325a = iVarD;
                    gVar.f44326b = new s4.i(lb.a.a(hVarE.A().B().q()));
                    gVar.f44327c = new s4.i(lb.a.a(hVarE.B().B().q()));
                    gVar.f44328d = c0Var.f39972f;
                    return gVar.j();
                } catch (com.google.crypto.tink.shaded.protobuf.d0 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
        }
    }

    @Override // eb.r
    public va.i b(eb.d0 d0Var) throws GeneralSecurityException {
        switch (this.f52157a) {
            case 16:
                jb.a1 a1Var = (jb.a1) d0Var.f39977c;
                if (a1Var.D().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        return new wa.z(n1.C(a1Var.E(), com.google.crypto.tink.shaded.protobuf.p.a()).A(), wa.a0.b(a1Var.C()));
                    } catch (com.google.crypto.tink.shaded.protobuf.d0 e10) {
                        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + a1Var.D());
            case 20:
                jb.a1 a1Var2 = (jb.a1) d0Var.f39977c;
                if (!a1Var2.D().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + a1Var2.D());
                }
                try {
                    return wa.d0.a(r1.E(a1Var2.E(), com.google.crypto.tink.shaded.protobuf.p.a()), a1Var2.C());
                } catch (com.google.crypto.tink.shaded.protobuf.d0 e11) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e11);
                }
            default:
                jb.a1 a1Var3 = (jb.a1) d0Var.f39977c;
                if (!a1Var3.D().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + a1Var3.D());
                }
                try {
                    jb.j jVarD = jb.j.D(a1Var3.E(), com.google.crypto.tink.shaded.protobuf.p.a());
                    if (jVarD.B().D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    com.google.android.gms.internal.consent_sdk.x xVarB = wa.i.b();
                    xVarB.u(jVarD.A().B());
                    xVarB.w(jVarD.B().B());
                    xVarB.y(jVarD.A().C().A());
                    xVarB.A(jVarD.B().C().C());
                    xVarB.f23264e = xa.a.b(jVarD.B().C().B());
                    xVarB.f23265f = xa.a.d(a1Var3.C());
                    return xVarB.d();
                } catch (com.google.crypto.tink.shaded.protobuf.d0 e12) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e12);
                }
        }
    }

    @Override // uj.c
    public boolean c(View view) {
        return view.hasFocus();
    }

    @Override // n2.n
    public n2.k[] createExtractors() {
        return new n2.k[]{new v3.c()};
    }

    @Override // eb.y
    public Object e(qk.i0 i0Var) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f52157a) {
            case 7:
                eb.c0 c0Var = ((eb.h) i0Var).f39986b;
                eb.h.u0(c0Var);
                Integer num = c0Var.f39972f;
                va.a aVar = (va.a) eb.a.f39960d.a(va.a.class, c0Var.f39967a).a(c0Var.f39969c);
                s1 s1Var = c0Var.f39971e;
                int iOrdinal = s1Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = eb.p.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = eb.p.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type " + s1Var);
                    }
                    bArrB = eb.p.a(num.intValue()).b();
                } else {
                    bArrB = eb.p.f40006a.b();
                }
                return new kb.c(aVar, bArrB);
            case 8:
                wa.e eVar = (wa.e) i0Var;
                byte[] bArrB2 = ((lb.a) eVar.f53020c.f50111a).b();
                wa.i iVar = eVar.f53019b;
                kb.a aVar2 = new kb.a(bArrB2, iVar.f53074c);
                kb.k kVar = new kb.k("HMAC" + iVar.f53077f, new SecretKeySpec(((lb.a) eVar.f53021d.f50111a).b(), "HMAC"));
                int i10 = iVar.f53075d;
                return new kb.g(aVar2, new kb.l(kVar, i10), i10, eVar.f53022e.b());
            case 9:
                wa.j jVar = (wa.j) i0Var;
                co.c cVar = kb.b.f44551e;
                if (!defpackage.e.c(1)) {
                    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
                }
                wa.l lVar = jVar.f53082b;
                if (lVar.f53096c == 16) {
                    return new kb.b(((lb.a) jVar.f53083c.f50111a).b(), lVar.f53095b, jVar.f53084d.b());
                }
                throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + lVar.f53096c);
            case 10:
                wa.m mVar = (wa.m) i0Var;
                wa.o oVar = mVar.f53098b;
                int i11 = oVar.f53108b;
                int i12 = oVar.f53109c;
                if (i11 != 12) {
                    throw new GeneralSecurityException("Expected IV Size 12, got " + oVar.f53108b);
                }
                if (i12 == 16) {
                    return new kb.c(((lb.a) mVar.f53099c.f50111a).b(), mVar.f53100d);
                }
                throw new GeneralSecurityException("Expected tag Size 16, got " + i12);
            case 11:
                wa.p pVar = (wa.p) i0Var;
                co.c cVar2 = ya.a.f54353a;
                xa.b bVar = new xa.b(24);
                byte[] bArr = xa.f.f53692d;
                if (xa.f.c(xa.b.c())) {
                    return new xa.f(((lb.a) pVar.f53112c.f50111a).b(), pVar.f53113d.b(), bVar);
                }
                throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
            case 12:
                wa.s sVar = (wa.s) i0Var;
                try {
                    xa.h.c();
                    return new xa.h(((lb.a) sVar.f53122c.f50111a).b(), sVar.f53123d.b(), xa.h.c().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new kb.c(((lb.a) sVar.f53122c.f50111a).b(), 1, sVar.f53123d.b());
                }
            case 13:
                wa.y yVar = (wa.y) i0Var;
                return new kb.c(va.g.a(yVar.f53140b.f53143a).b(yVar.f53140b.f53143a), yVar.f53141c.b());
            case 14:
                wa.b0 b0Var = (wa.b0) i0Var;
                wa.c0 c0Var2 = b0Var.f53006b;
                String str = c0Var2.f53010b;
                wa.c cVar3 = c0Var2.f53012d;
                db.b bVarB = va.g.a(str).b(str);
                byte[] bArr2 = wa.w.f53132d;
                try {
                    return new kb.c(new wa.w(jb.a1.H(x7.a.M(cVar3), com.google.crypto.tink.shaded.protobuf.p.a()), bVarB), b0Var.f53007c.b());
                } catch (com.google.crypto.tink.shaded.protobuf.d0 e10) {
                    throw new GeneralSecurityException(e10);
                }
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                wa.i0 i0Var2 = (wa.i0) i0Var;
                try {
                    xa.h.c();
                    return new xa.p(((lb.a) i0Var2.f53079c.f50111a).b(), i0Var2.f53080d.b(), xa.h.c().getProvider());
                } catch (GeneralSecurityException unused2) {
                    return new kb.c(((lb.a) i0Var2.f53079c.f50111a).b(), 2, i0Var2.f53080d.b());
                }
            case 23:
                wa.f0 f0Var = (wa.f0) i0Var;
                int i13 = f0Var.f53034b.f53071b;
                if (i13 < 8 || i13 > 12) {
                    throw new GeneralSecurityException("invalid salt size");
                }
                return new xa.n(((lb.a) f0Var.f53035c.f50111a).b(), f0Var.f53036d, f0Var.f53034b.f53071b);
        }
    }

    @Override // eb.t
    public eb.d0 f(va.i iVar) {
        switch (this.f52157a) {
            case 15:
                wa.z zVar = (wa.z) iVar;
                jb.z0 z0VarF = jb.a1.F();
                z0VarF.i("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                m1 m1VarB = n1.B();
                String str = zVar.f53143a;
                m1VarB.e();
                n1.y((n1) m1VarB.f24645b, str);
                z0VarF.j(((n1) m1VarB.a()).e());
                z0VarF.h(wa.a0.a(zVar.f53144b));
                return eb.d0.R0((jb.a1) z0VarF.a());
            case 19:
                wa.c0 c0Var = (wa.c0) iVar;
                jb.z0 z0VarF2 = jb.a1.F();
                z0VarF2.i("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                z0VarF2.j(wa.d0.b(c0Var).e());
                z0VarF2.h(wa.d0.c(c0Var.f53009a));
                return eb.d0.R0((jb.a1) z0VarF2.a());
            case 25:
                wa.i iVar2 = (wa.i) iVar;
                jb.z0 z0VarF3 = jb.a1.F();
                z0VarF3.i("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                jb.i iVarC = jb.j.C();
                jb.m mVarD = jb.n.D();
                jb.o oVarB = jb.p.B();
                int i10 = iVar2.f53074c;
                oVarB.e();
                jb.p.y((jb.p) oVarB.f24645b, i10);
                jb.p pVar = (jb.p) oVarB.a();
                mVarD.e();
                jb.n.y((jb.n) mVarD.f24645b, pVar);
                int i11 = iVar2.f53072a;
                mVarD.e();
                jb.n.z((jb.n) mVarD.f24645b, i11);
                jb.n nVar = (jb.n) mVarD.a();
                iVarC.e();
                jb.j.y((jb.j) iVarC.f24645b, nVar);
                jb.r0 r0VarE = jb.s0.E();
                jb.u0 u0VarA = xa.a.a(iVar2);
                r0VarE.e();
                jb.s0.y((jb.s0) r0VarE.f24645b, u0VarA);
                int i12 = iVar2.f53073b;
                r0VarE.e();
                jb.s0.z((jb.s0) r0VarE.f24645b, i12);
                jb.s0 s0Var = (jb.s0) r0VarE.a();
                iVarC.e();
                jb.j.z((jb.j) iVarC.f24645b, s0Var);
                z0VarF3.j(((jb.j) iVarC.a()).e());
                z0VarF3.h(xa.a.c(iVar2.f53076e));
                return eb.d0.R0((jb.a1) z0VarF3.a());
            default:
                wa.l lVar = (wa.l) iVar;
                jb.z0 z0VarF4 = jb.a1.F();
                z0VarF4.i("type.googleapis.com/google.crypto.tink.AesEaxKey");
                jb.s sVarC = jb.t.C();
                jb.v vVarA = xa.c.a(lVar);
                sVarC.e();
                jb.t.y((jb.t) sVarC.f24645b, vVarA);
                int i13 = lVar.f53094a;
                sVarC.e();
                jb.t.z((jb.t) sVarC.f24645b, i13);
                z0VarF4.j(((jb.t) sVarC.a()).e());
                z0VarF4.h(xa.c.b(lVar.f53097d));
                return eb.d0.R0((jb.a1) z0VarF4.a());
        }
    }

    @Override // tb.d
    public Object g(tb.s sVar) {
        switch (this.f52157a) {
            case 0:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(sVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(sVar);
        }
    }

    @Override // eb.e
    public eb.c0 h(qk.i0 i0Var) {
        switch (this.f52157a) {
            case 17:
                wa.y yVar = (wa.y) i0Var;
                k1 k1VarB = l1.B();
                m1 m1VarB = n1.B();
                String str = yVar.f53140b.f53143a;
                m1VarB.e();
                n1.y((n1) m1VarB.f24645b, str);
                n1 n1Var = (n1) m1VarB.a();
                k1VarB.e();
                l1.y((l1) k1VarB.f24645b, n1Var);
                return eb.c0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((l1) k1VarB.a()).e(), jb.w0.REMOTE, wa.a0.a(yVar.f53140b.f53144b), yVar.f53142d);
            case 21:
                wa.b0 b0Var = (wa.b0) i0Var;
                o1 o1VarB = p1.B();
                r1 r1VarB = wa.d0.b(b0Var.f53006b);
                o1VarB.e();
                p1.y((p1) o1VarB.f24645b, r1VarB);
                return eb.c0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((p1) o1VarB.a()).e(), jb.w0.REMOTE, wa.d0.c(b0Var.f53006b.f53009a), b0Var.f53008d);
            default:
                wa.e eVar = (wa.e) i0Var;
                jb.g gVarD = jb.h.D();
                jb.k kVarE = jb.l.E();
                jb.o oVarB = jb.p.B();
                int i10 = eVar.f53019b.f53074c;
                oVarB.e();
                jb.p.y((jb.p) oVarB.f24645b, i10);
                jb.p pVar = (jb.p) oVarB.a();
                kVarE.e();
                jb.l.y((jb.l) kVarE.f24645b, pVar);
                byte[] bArrB = ((lb.a) eVar.f53020c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM = com.google.crypto.tink.shaded.protobuf.i.m(bArrB, 0, bArrB.length);
                kVarE.e();
                jb.l.z((jb.l) kVarE.f24645b, hVarM);
                jb.l lVar = (jb.l) kVarE.a();
                gVarD.e();
                jb.h.y((jb.h) gVarD.f24645b, lVar);
                jb.p0 p0VarE = jb.q0.E();
                wa.i iVar = eVar.f53019b;
                jb.u0 u0VarA = xa.a.a(iVar);
                p0VarE.e();
                jb.q0.y((jb.q0) p0VarE.f24645b, u0VarA);
                byte[] bArrB2 = ((lb.a) eVar.f53021d.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM2 = com.google.crypto.tink.shaded.protobuf.i.m(bArrB2, 0, bArrB2.length);
                p0VarE.e();
                jb.q0.z((jb.q0) p0VarE.f24645b, hVarM2);
                jb.q0 q0Var = (jb.q0) p0VarE.a();
                gVarD.e();
                jb.h.z((jb.h) gVarD.f24645b, q0Var);
                return eb.c0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((jb.h) gVarD.a()).e(), jb.w0.SYMMETRIC, xa.a.c(iVar.f53076e), eVar.f53023f);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }
}
