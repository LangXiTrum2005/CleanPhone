package wa;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f53006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb.a f53007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f53008d;

    public b0(c0 c0Var, lb.a aVar, Integer num) {
        this.f53006b = c0Var;
        this.f53007c = aVar;
        this.f53008d = num;
    }

    public static b0 u0(c0 c0Var, Integer num) throws GeneralSecurityException {
        lb.a aVarB;
        h hVar = c0Var.f53009a;
        if (hVar == h.F) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarB = eb.p.f40006a;
        } else {
            if (hVar != h.E) {
                throw new GeneralSecurityException("Unknown Variant: " + hVar);
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarB = eb.p.b(num.intValue());
        }
        return new b0(c0Var, aVarB, num);
    }

    @Override // qk.i0
    public final Integer I() {
        return this.f53008d;
    }

    @Override // qk.i0
    public final va.i N() {
        return this.f53006b;
    }

    @Override // wa.b
    public final lb.a t0() {
        return this.f53007c;
    }
}
