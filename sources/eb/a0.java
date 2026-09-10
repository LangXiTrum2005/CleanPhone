package eb;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f39963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f39964b;

    public a0(d0 d0Var) {
        this.f39963a = new HashMap((HashMap) d0Var.f39976b);
        this.f39964b = new HashMap((HashMap) d0Var.f39977c);
    }

    public final Object a(qk.i0 i0Var, Class cls) throws GeneralSecurityException {
        z zVar = new z(i0Var.getClass(), cls);
        HashMap map = this.f39963a;
        if (map.containsKey(zVar)) {
            return ((x) map.get(zVar)).f40020c.e(i0Var);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + zVar + " available, see https://developers.google.com/tink/faq/registration_errors");
    }
}
