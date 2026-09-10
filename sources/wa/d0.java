package wa;

import java.security.GeneralSecurityException;
import jb.a1;
import jb.q1;
import jb.r1;
import jb.s1;
import jb.z0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eb.s f53015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53018d;

    static {
        lb.a aVarC = eb.j0.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f53015a = new eb.s(c0.class, new ud.t(19));
        f53016b = new eb.q(aVarC, new ud.t(20));
        f53017c = new eb.d(b0.class, new ud.t(21));
        f53018d = new eb.b(aVarC, new ud.t(22));
    }

    public static c0 a(r1 r1Var, s1 s1Var) throws GeneralSecurityException {
        h hVar;
        h hVar2 = h.F;
        Object obj = h.D;
        h hVar3 = h.C;
        h hVar4 = h.B;
        h hVar5 = h.f53067z;
        h hVar6 = h.A;
        h hVar7 = h.f53066y;
        z0 z0VarF = a1.F();
        z0VarF.i(r1Var.B().D());
        z0VarF.j(r1Var.B().E());
        z0VarF.h(s1.RAW);
        va.i iVarI = x7.a.I(((a1) z0VarF.a()).d());
        if (iVarI instanceof o) {
            hVar = hVar7;
        } else if (iVarI instanceof u) {
            hVar = hVar6;
        } else if (iVarI instanceof k0) {
            hVar = hVar5;
        } else if (iVarI instanceof i) {
            hVar = hVar4;
        } else if (iVarI instanceof l) {
            hVar = hVar3;
        } else {
            if (!(iVarI instanceof r)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + iVarI);
            }
            hVar = obj;
        }
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            hVar2 = h.E;
        } else if (iOrdinal != 3) {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
        }
        String strC = r1Var.C();
        c cVar = (c) iVarI;
        if (strC == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (cVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (cVar.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((hVar.equals(hVar7) && (cVar instanceof o)) || ((hVar.equals(hVar6) && (cVar instanceof u)) || ((hVar.equals(hVar5) && (cVar instanceof k0)) || ((hVar.equals(hVar4) && (cVar instanceof i)) || ((hVar.equals(hVar3) && (cVar instanceof l)) || (hVar.equals(obj) && (cVar instanceof r))))))) {
            return new c0(hVar2, strC, hVar, cVar);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + hVar.f53069b + " when new keys are picked according to " + cVar + ".");
    }

    public static r1 b(c0 c0Var) {
        try {
            a1 a1VarH = a1.H(x7.a.M(c0Var.f53012d), com.google.crypto.tink.shaded.protobuf.p.a());
            q1 q1VarD = r1.D();
            String str = c0Var.f53010b;
            q1VarD.e();
            r1.y((r1) q1VarD.f24645b, str);
            q1VarD.e();
            r1.z((r1) q1VarD.f24645b, a1VarH);
            return (r1) q1VarD.a();
        } catch (com.google.crypto.tink.shaded.protobuf.d0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static s1 c(h hVar) {
        if (h.E.equals(hVar)) {
            return s1.TINK;
        }
        if (h.F.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }
}
