package wa;

import java.security.GeneralSecurityException;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eb.s f53002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53005d;

    static {
        lb.a aVarC = eb.j0.c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f53002a = new eb.s(z.class, new ud.t(15));
        f53003b = new eb.q(aVarC, new ud.t(16));
        f53004c = new eb.d(y.class, new ud.t(17));
        f53005d = new eb.b(aVarC, new ud.t(18));
    }

    public static s1 a(h hVar) {
        if (h.f53064w.equals(hVar)) {
            return s1.TINK;
        }
        if (h.f53065x.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static h b(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return h.f53064w;
        }
        if (iOrdinal == 3) {
            return h.f53065x;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
    }
}
