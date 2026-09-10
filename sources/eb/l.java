package eb;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f39998b = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f39999a = new HashMap();

    public final synchronized void a(wa.f fVar, Class cls) {
        try {
            wa.f fVar2 = (wa.f) this.f39999a.get(cls);
            if (fVar2 != null && !fVar2.equals(fVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f39999a.put(cls, fVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
