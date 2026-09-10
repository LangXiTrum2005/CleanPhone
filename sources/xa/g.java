package xa;

import eb.j0;
import eb.s;
import java.security.GeneralSecurityException;
import jb.s1;
import wa.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53703d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f53700a = new s(r.class, new b(7));
        f53701b = new eb.q(aVarC, new b(8));
        f53702c = new eb.d(wa.p.class, new b(9));
        f53703d = new eb.b(aVarC, new b(10));
    }

    public static s1 a(wa.h hVar) {
        if (wa.h.f53058q.equals(hVar)) {
            return s1.TINK;
        }
        if (wa.h.f53059r.equals(hVar)) {
            return s1.CRUNCHY;
        }
        if (wa.h.f53060s.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static wa.h b(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.f53058q;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return wa.h.f53060s;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
            }
        }
        return wa.h.f53059r;
    }
}
