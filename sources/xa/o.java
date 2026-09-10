package xa;

import eb.j0;
import eb.s;
import java.security.GeneralSecurityException;
import jb.s1;
import wa.f0;
import wa.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53724d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f53721a = new s(h0.class, new b(15));
        f53722b = new eb.q(aVarC, new b(16));
        f53723c = new eb.d(f0.class, new b(17));
        f53724d = new eb.b(aVarC, new b(18));
    }

    public static s1 a(wa.h hVar) {
        if (hVar.equals(wa.h.G)) {
            return s1.TINK;
        }
        if (hVar.equals(wa.h.H)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static wa.h b(s1 s1Var) {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.G;
        }
        if (iOrdinal == 3) {
            return wa.h.H;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
    }
}
