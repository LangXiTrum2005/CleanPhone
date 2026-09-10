package xa;

import eb.j0;
import eb.s;
import java.security.GeneralSecurityException;
import jb.s1;
import jb.u;
import jb.v;
import ud.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.q f53684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f53685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f53686d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f53683a = new s(wa.l.class, new t(29));
        f53684b = new eb.q(aVarC, new b(0));
        f53685c = new eb.d(wa.j.class, new b(1));
        f53686d = new eb.b(aVarC, new b(2));
    }

    public static v a(wa.l lVar) {
        if (lVar.f53096c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(lVar.f53096c)));
        }
        u uVarB = v.B();
        int i10 = lVar.f53095b;
        uVarB.e();
        v.y((v) uVarB.f24645b, i10);
        return (v) uVarB.a();
    }

    public static s1 b(wa.h hVar) {
        if (wa.h.f53053k.equals(hVar)) {
            return s1.TINK;
        }
        if (wa.h.l.equals(hVar)) {
            return s1.CRUNCHY;
        }
        if (wa.h.f53054m.equals(hVar)) {
            return s1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + hVar);
    }

    public static wa.h c(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return wa.h.f53053k;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return wa.h.f53054m;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
            }
        }
        return wa.h.l;
    }
}
