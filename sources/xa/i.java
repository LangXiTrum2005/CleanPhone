package xa;

import eb.j0;
import eb.s;
import java.security.GeneralSecurityException;
import jb.s1;
import wa.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53713d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f53710a = new s(u.class, new b(11));
        f53711b = new eb.q(aVarC, new b(12));
        f53712c = new eb.d(wa.s.class, new b(13));
        f53713d = new eb.b(aVarC, new b(14));
    }

    public static s1 a(wa.h hVar) {
        if (wa.h.f53061t.equals(hVar)) {
            return s1.TINK;
        }
        if (wa.h.f53062u.equals(hVar)) {
            return s1.CRUNCHY;
        }
        if (wa.h.f53063v.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static wa.h b(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.f53061t;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return wa.h.f53063v;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
            }
        }
        return wa.h.f53062u;
    }
}
