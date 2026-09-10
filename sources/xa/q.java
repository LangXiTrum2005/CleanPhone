package xa;

import eb.j0;
import eb.s;
import java.security.GeneralSecurityException;
import jb.s1;
import wa.i0;
import wa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53731d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f53728a = new s(k0.class, new b(19));
        f53729b = new eb.q(aVarC, new b(20));
        f53730c = new eb.d(i0.class, new b(21));
        f53731d = new eb.b(aVarC, new b(22));
    }

    public static s1 a(wa.h hVar) {
        if (wa.h.I.equals(hVar)) {
            return s1.TINK;
        }
        if (wa.h.J.equals(hVar)) {
            return s1.CRUNCHY;
        }
        if (wa.h.K.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static wa.h b(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.I;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return wa.h.K;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
            }
        }
        return wa.h.J;
    }
}
