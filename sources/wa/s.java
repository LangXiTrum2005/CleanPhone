package wa;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f53121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4.i f53122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.a f53123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f53124e;

    public s(u uVar, s4.i iVar, lb.a aVar, Integer num) {
        this.f53121b = uVar;
        this.f53122c = iVar;
        this.f53123d = aVar;
        this.f53124e = num;
    }

    public static s u0(h hVar, s4.i iVar, Integer num) throws GeneralSecurityException {
        lb.a aVarB;
        lb.a aVar = (lb.a) iVar.f50111a;
        h hVar2 = h.f53063v;
        if (hVar != hVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + hVar + " the value of idRequirement must be non-null");
        }
        if (hVar == hVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar.f45273a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f45273a.length);
        }
        u uVar = new u(hVar);
        if (hVar == hVar2) {
            aVarB = eb.p.f40006a;
        } else if (hVar == h.f53062u) {
            aVarB = eb.p.a(num.intValue());
        } else {
            if (hVar != h.f53061t) {
                throw new IllegalStateException("Unknown Variant: " + hVar);
            }
            aVarB = eb.p.b(num.intValue());
        }
        return new s(uVar, iVar, aVarB, num);
    }

    @Override // qk.i0
    public final Integer I() {
        return this.f53124e;
    }

    @Override // qk.i0
    public final va.i N() {
        return this.f53121b;
    }

    @Override // wa.b
    public final lb.a t0() {
        return this.f53123d;
    }
}
