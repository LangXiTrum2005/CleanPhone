package xa;

import eb.j0;
import eb.s;
import java.security.GeneralSecurityException;
import jb.o0;
import jb.s1;
import jb.t0;
import jb.u0;
import ud.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53681d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f53678a = new s(wa.i.class, new t(25));
        f53679b = new eb.q(aVarC, new t(26));
        f53680c = new eb.d(wa.e.class, new t(27));
        f53681d = new eb.b(aVarC, new t(28));
    }

    public static u0 a(wa.i iVar) {
        o0 o0Var;
        t0 t0VarD = u0.D();
        int i10 = iVar.f53075d;
        t0VarD.e();
        u0.z((u0) t0VarD.f24645b, i10);
        wa.h hVar = iVar.f53077f;
        if (wa.h.f53045c.equals(hVar)) {
            o0Var = o0.SHA1;
        } else if (wa.h.f53046d.equals(hVar)) {
            o0Var = o0.SHA224;
        } else if (wa.h.f53047e.equals(hVar)) {
            o0Var = o0.SHA256;
        } else if (wa.h.f53048f.equals(hVar)) {
            o0Var = o0.SHA384;
        } else {
            if (!wa.h.f53049g.equals(hVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + hVar);
            }
            o0Var = o0.SHA512;
        }
        t0VarD.e();
        u0.y((u0) t0VarD.f24645b, o0Var);
        return (u0) t0VarD.a();
    }

    public static wa.h b(o0 o0Var) throws GeneralSecurityException {
        int iOrdinal = o0Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.f53045c;
        }
        if (iOrdinal == 2) {
            return wa.h.f53048f;
        }
        if (iOrdinal == 3) {
            return wa.h.f53047e;
        }
        if (iOrdinal == 4) {
            return wa.h.f53049g;
        }
        if (iOrdinal == 5) {
            return wa.h.f53046d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o0Var.getNumber());
    }

    public static s1 c(wa.h hVar) {
        if (wa.h.f53050h.equals(hVar)) {
            return s1.TINK;
        }
        if (wa.h.f53051i.equals(hVar)) {
            return s1.CRUNCHY;
        }
        if (wa.h.f53052j.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static wa.h d(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.f53050h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return wa.h.f53052j;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
            }
        }
        return wa.h.f53051i;
    }
}
