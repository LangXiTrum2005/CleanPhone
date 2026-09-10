package eb;

import java.security.GeneralSecurityException;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends qk.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f39986b;

    public h(c0 c0Var) {
        c0Var.f39970d.ordinal();
        this.f39986b = c0Var;
    }

    public static void u0(c0 c0Var) {
        c0Var.f39970d.ordinal();
    }

    @Override // qk.i0
    public final Integer I() {
        return this.f39986b.f39972f;
    }

    @Override // qk.i0
    public final va.i N() {
        c0 c0Var = this.f39986b;
        return new g(c0Var.f39967a, c0Var.f39971e);
    }

    public final lb.a t0() throws GeneralSecurityException {
        c0 c0Var = this.f39986b;
        s1 s1Var = c0Var.f39971e;
        Integer num = c0Var.f39972f;
        if (s1Var.equals(s1.RAW)) {
            return lb.a.a(new byte[0]);
        }
        if (s1Var.equals(s1.TINK)) {
            return p.b(num.intValue());
        }
        if (s1Var.equals(s1.LEGACY) || s1Var.equals(s1.CRUNCHY)) {
            return p.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
