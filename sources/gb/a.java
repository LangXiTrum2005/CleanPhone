package gb;

import eb.j0;
import eb.q;
import eb.s;
import java.security.GeneralSecurityException;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f41810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f41811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f41812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f41813d;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f41810a = new s(fb.d.class, new com.unity3d.ads.adplayer.b(20));
        f41811b = new q(aVarC, new com.unity3d.ads.adplayer.b(21));
        f41812c = new eb.d(fb.a.class, new com.unity3d.ads.adplayer.b(22));
        f41813d = new eb.b(aVarC, new com.unity3d.ads.adplayer.b(23));
    }

    public static s1 a(fb.c cVar) {
        if (fb.c.f40726b.equals(cVar)) {
            return s1.TINK;
        }
        if (fb.c.f40727c.equals(cVar)) {
            return s1.CRUNCHY;
        }
        if (fb.c.f40729e.equals(cVar)) {
            return s1.RAW;
        }
        if (fb.c.f40728d.equals(cVar)) {
            return s1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static fb.c b(s1 s1Var) throws GeneralSecurityException {
        int iOrdinal = s1Var.ordinal();
        if (iOrdinal == 1) {
            return fb.c.f40726b;
        }
        if (iOrdinal == 2) {
            return fb.c.f40728d;
        }
        if (iOrdinal == 3) {
            return fb.c.f40729e;
        }
        if (iOrdinal == 4) {
            return fb.c.f40727c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
    }
}
