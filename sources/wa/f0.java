package wa;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f53034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4.i f53035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.a f53036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f53037e;

    public f0(h0 h0Var, s4.i iVar, lb.a aVar, Integer num) {
        this.f53034b = h0Var;
        this.f53035c = iVar;
        this.f53036d = aVar;
        this.f53037e = num;
    }

    public static f0 u0(h0 h0Var, s4.i iVar, Integer num) throws GeneralSecurityException {
        lb.a aVarB;
        lb.a aVar = (lb.a) iVar.f50111a;
        h hVar = h0Var.f53070a;
        h hVar2 = h.H;
        if (hVar != hVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + hVar + " the value of idRequirement must be non-null");
        }
        if (hVar == hVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar.f45273a.length != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + aVar.f45273a.length);
        }
        if (hVar == hVar2) {
            aVarB = eb.p.f40006a;
        } else {
            if (hVar != h.G) {
                throw new IllegalStateException("Unknown Variant: " + hVar);
            }
            aVarB = eb.p.b(num.intValue());
        }
        return new f0(h0Var, iVar, aVarB, num);
    }

    @Override // qk.i0
    public final Integer I() {
        return this.f53037e;
    }

    @Override // qk.i0
    public final va.i N() {
        return this.f53034b;
    }

    @Override // wa.b
    public final lb.a t0() {
        return this.f53036d;
    }
}
