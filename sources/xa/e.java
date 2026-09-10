package xa;

import eb.j0;
import eb.s;
import java.security.GeneralSecurityException;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53691d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f53688a = new s(wa.o.class, new b(3));
        f53689b = new eb.q(aVarC, new b(4));
        f53690c = new eb.d(wa.m.class, new b(5));
        f53691d = new eb.b(aVarC, new b(6));
    }

    public static s1 a(wa.h hVar) {
        if (wa.h.f53055n.equals(hVar)) {
            return s1.TINK;
        }
        if (wa.h.f53056o.equals(hVar)) {
            return s1.CRUNCHY;
        }
        if (wa.h.f53057p.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static wa.h b(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.f53055n;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return wa.h.f53057p;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
            }
        }
        return wa.h.f53056o;
    }

    public static void c(wa.o oVar) {
        int i10 = oVar.f53109c;
        int i11 = oVar.f53108b;
        if (i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(oVar.f53109c)));
        }
        if (i11 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i11)));
        }
    }
}
