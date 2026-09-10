package com.unity3d.ads.adplayer;

import android.adservices.measurement.MeasurementManager;
import cc.u2;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import eb.c;
import eb.c0;
import eb.e;
import eb.f0;
import eb.r;
import eb.t;
import eb.y;
import f2.z0;
import fb.d;
import fb.f;
import fb.h;
import fb.j;
import g9.k;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Provider;
import jb.a1;
import jb.o0;
import jb.p0;
import jb.q0;
import jb.r0;
import jb.s0;
import jb.s1;
import jb.t0;
import jb.u0;
import jb.w0;
import kb.l;
import l1.g;
import n2.n;
import qk.i0;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements h.b, INativeTokenGeneratorListener, IInvocationCallbackInvoker, e, g, y, b3.g, t, r, c, o8.e, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38411a;

    public /* synthetic */ b(int i10) {
        this.f38411a = i10;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return MeasurementManager.class;
    }

    @Override // eb.c
    public i0 a(f0 f0Var) throws GeneralSecurityException {
        c0 c0Var = (c0) f0Var;
        switch (this.f38411a) {
            case 23:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    jb.b bVarE = jb.b.E(c0Var.f39969c, p.a());
                    if (bVarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    k kVarB = d.b();
                    kVarB.E(bVarE.A().size());
                    kVarB.F(bVarE.B().A());
                    kVarB.f41772d = gb.a.b(c0Var.f39971e);
                    d dVarF = kVarB.f();
                    v9.e eVar = new v9.e(14, false);
                    eVar.f52504c = null;
                    eVar.f52505d = null;
                    eVar.f52503b = dVarF;
                    eVar.f52504c = new i(lb.a.a(bVarE.A().q()));
                    eVar.f52505d = c0Var.f39972f;
                    return eVar.w();
                } catch (d0 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    q0 q0VarF = q0.F(c0Var.f39969c, p.a());
                    if (q0VarF.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    k5.g gVarB = j.b();
                    gVarB.f44325a = Integer.valueOf(q0VarF.B().size());
                    gVarB.f44326b = Integer.valueOf(q0VarF.C().C());
                    gVarB.f44327c = (h) gb.c.f41815b.l(q0VarF.C().B());
                    gVarB.f44328d = (fb.i) gb.c.f41814a.l(c0Var.f39971e);
                    j jVarD = gVarB.d();
                    v9.e eVar2 = new v9.e(15, false);
                    eVar2.f52504c = null;
                    eVar2.f52505d = null;
                    eVar2.f52503b = jVarD;
                    eVar2.f52504c = new i(lb.a.a(q0VarF.B().q()));
                    eVar2.f52505d = c0Var.f39972f;
                    return eVar2.x();
                } catch (d0 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // l1.g
    public void accept(Object obj) {
        ((z0) obj).f40535b.getClass();
    }

    @Override // o8.e
    public Object apply(Object obj) {
        gc.a.f41820b.getClass();
        return dc.a.f38803a.y((u2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // eb.r
    public va.i b(eb.d0 d0Var) throws GeneralSecurityException {
        switch (this.f38411a) {
            case 21:
                a1 a1Var = (a1) d0Var.f39977c;
                if (!a1Var.D().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + a1Var.D());
                }
                try {
                    jb.d dVarD = jb.d.D(a1Var.E(), p.a());
                    k kVarB = d.b();
                    kVarB.E(dVarD.A());
                    kVarB.F(dVarD.B().A());
                    kVarB.f41772d = gb.a.b(a1Var.C());
                    return kVarB.f();
                } catch (d0 e10) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
                }
            default:
                a1 a1Var2 = (a1) d0Var.f39977c;
                if (!a1Var2.D().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + a1Var2.D());
                }
                try {
                    s0 s0VarF = s0.F(a1Var2.E(), p.a());
                    if (s0VarF.D() != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + s0VarF.D());
                    }
                    k5.g gVarB = j.b();
                    gVarB.f44325a = Integer.valueOf(s0VarF.B());
                    gVarB.f44326b = Integer.valueOf(s0VarF.C().C());
                    gVarB.f44327c = (h) gb.c.f41815b.l(s0VarF.C().B());
                    gVarB.f44328d = (fb.i) gb.c.f41814a.l(a1Var2.C());
                    return gVarB.d();
                } catch (d0 e11) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e11);
                }
        }
    }

    @Override // n2.n
    public n2.k[] createExtractors() {
        return new n2.k[]{new h3.k(k3.k.f44294p9, 16)};
    }

    @Override // eb.y
    public Object e(i0 i0Var) throws GeneralSecurityException {
        switch (this.f38411a) {
            case 14:
                fb.a aVar = (fb.a) i0Var;
                if (aVar.f40718b.f40731a != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                if (!defpackage.e.c(1)) {
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                Provider providerA = eb.j.a();
                if (providerA != null) {
                    try {
                        return gb.b.a(aVar, providerA);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new gb.b();
            case 15:
                fb.a aVar2 = (fb.a) i0Var;
                if (aVar2.f40718b.f40731a == 32) {
                    return new l(aVar2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 16:
                gb.b bVar = new gb.b();
                if (defpackage.e.d(2)) {
                    return bVar;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 17:
                return new l((f) i0Var);
            default:
                c0 c0Var = ((eb.h) i0Var).f39986b;
                eb.h.u0(c0Var);
                Integer num = c0Var.f39972f;
                int iOrdinal = c0Var.f39971e.ordinal();
                if (iOrdinal == 1) {
                    eb.p.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    eb.p.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    eb.p.a(num.intValue()).b();
                } else {
                    eb.p.f40006a.b();
                }
                return new gb.d();
        }
    }

    @Override // b3.g
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // eb.t
    public eb.d0 f(va.i iVar) {
        switch (this.f38411a) {
            case 20:
                d dVar = (d) iVar;
                jb.z0 z0VarF = a1.F();
                z0VarF.i("type.googleapis.com/google.crypto.tink.AesCmacKey");
                jb.c cVarC = jb.d.C();
                jb.e eVarB = jb.f.B();
                int i10 = dVar.f40732b;
                eVarB.e();
                jb.f.y((jb.f) eVarB.f24645b, i10);
                jb.f fVar = (jb.f) eVarB.a();
                cVarC.e();
                jb.d.z((jb.d) cVarC.f24645b, fVar);
                int i11 = dVar.f40731a;
                cVarC.e();
                jb.d.y((jb.d) cVarC.f24645b, i11);
                z0VarF.j(((jb.d) cVarC.a()).e());
                z0VarF.h(gb.a.a(dVar.f40733c));
                return eb.d0.R0((a1) z0VarF.a());
            default:
                j jVar = (j) iVar;
                jb.z0 z0VarF2 = a1.F();
                z0VarF2.i("type.googleapis.com/google.crypto.tink.HmacKey");
                r0 r0VarE = s0.E();
                t0 t0VarD = u0.D();
                int i12 = jVar.f40760b;
                t0VarD.e();
                u0.z((u0) t0VarD.f24645b, i12);
                o0 o0Var = (o0) gb.c.f41815b.G(jVar.f40762d);
                t0VarD.e();
                u0.y((u0) t0VarD.f24645b, o0Var);
                u0 u0Var = (u0) t0VarD.a();
                r0VarE.e();
                s0.y((s0) r0VarE.f24645b, u0Var);
                int i13 = jVar.f40759a;
                r0VarE.e();
                s0.z((s0) r0VarE.f24645b, i13);
                z0VarF2.j(((s0) r0VarE.a()).e());
                z0VarF2.h((s1) gb.c.f41814a.G(jVar.f40761c));
                return eb.d0.R0((a1) z0VarF2.a());
        }
    }

    @Override // eb.e
    public c0 h(i0 i0Var) {
        switch (this.f38411a) {
            case 12:
                c0 c0Var = ((eb.h) i0Var).f39986b;
                eb.h.u0(c0Var);
                return c0Var;
            case 22:
                fb.a aVar = (fb.a) i0Var;
                jb.a aVarD = jb.b.D();
                d dVar = aVar.f40718b;
                jb.e eVarB = jb.f.B();
                int i10 = dVar.f40732b;
                eVarB.e();
                jb.f.y((jb.f) eVarB.f24645b, i10);
                jb.f fVar = (jb.f) eVarB.a();
                aVarD.e();
                jb.b.z((jb.b) aVarD.f24645b, fVar);
                byte[] bArrB = ((lb.a) aVar.f40719c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM = com.google.crypto.tink.shaded.protobuf.i.m(bArrB, 0, bArrB.length);
                aVarD.e();
                jb.b.y((jb.b) aVarD.f24645b, hVarM);
                return c0.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((jb.b) aVarD.a()).e(), w0.SYMMETRIC, gb.a.a(aVar.f40718b.f40733c), aVar.f40721e);
            default:
                f fVar2 = (f) i0Var;
                p0 p0VarE = q0.E();
                j jVar = fVar2.f40738b;
                t0 t0VarD = u0.D();
                int i11 = jVar.f40760b;
                t0VarD.e();
                u0.z((u0) t0VarD.f24645b, i11);
                o0 o0Var = (o0) gb.c.f41815b.G(jVar.f40762d);
                t0VarD.e();
                u0.y((u0) t0VarD.f24645b, o0Var);
                u0 u0Var = (u0) t0VarD.a();
                p0VarE.e();
                q0.y((q0) p0VarE.f24645b, u0Var);
                byte[] bArrB2 = ((lb.a) fVar2.f40739c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM2 = com.google.crypto.tink.shaded.protobuf.i.m(bArrB2, 0, bArrB2.length);
                p0VarE.e();
                q0.z((q0) p0VarE.f24645b, hVarM2);
                return c0.a("type.googleapis.com/google.crypto.tink.HmacKey", ((q0) p0VarE.a()).e(), w0.SYMMETRIC, (s1) gb.c.f41814a.G(fVar2.f40738b.f40761c), fVar2.f40741e);
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(com.unity3d.services.core.webview.bridge.Invocation invocation) {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // h.b
    public void onActivityResult(Object obj) {
        FullScreenWebViewDisplay.startForResult$lambda$7((h.a) obj);
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
    }
}
