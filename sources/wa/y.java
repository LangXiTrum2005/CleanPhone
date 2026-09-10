package wa;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f53140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb.a f53141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f53142d;

    public y(z zVar, lb.a aVar, Integer num) {
        this.f53140b = zVar;
        this.f53141c = aVar;
        this.f53142d = num;
    }

    public static y u0(z zVar, Integer num) throws GeneralSecurityException {
        lb.a aVarA;
        h hVar = zVar.f53144b;
        if (hVar == h.f53064w) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarA = lb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (hVar != h.f53065x) {
                throw new GeneralSecurityException("Unknown Variant: " + hVar);
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarA = lb.a.a(new byte[0]);
        }
        return new y(zVar, aVarA, num);
    }

    @Override // qk.i0
    public final Integer I() {
        return this.f53142d;
    }

    @Override // qk.i0
    public final va.i N() {
        return this.f53140b;
    }

    @Override // wa.b
    public final lb.a t0() {
        return this.f53141c;
    }
}
