package dm;

import pm.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38963b = 0;

    public y(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // dm.g
    public final pm.y a(zk.w module) {
        switch (this.f38963b) {
            case 0:
                kotlin.jvm.internal.n.f(module, "module");
                zk.e eVarD = zk.u.d(module, wk.l.R);
                c0 c0VarG = eVarD != null ? eVarD.g() : null;
                if (c0VarG == null) {
                    return rm.i.c(rm.h.NOT_FOUND_UNSIGNED_TYPE, "UByte");
                }
                return c0VarG;
            case 1:
                kotlin.jvm.internal.n.f(module, "module");
                zk.e eVarD2 = zk.u.d(module, wk.l.T);
                c0 c0VarG2 = eVarD2 != null ? eVarD2.g() : null;
                if (c0VarG2 == null) {
                    return rm.i.c(rm.h.NOT_FOUND_UNSIGNED_TYPE, "UInt");
                }
                return c0VarG2;
            case 2:
                kotlin.jvm.internal.n.f(module, "module");
                zk.e eVarD3 = zk.u.d(module, wk.l.U);
                c0 c0VarG3 = eVarD3 != null ? eVarD3.g() : null;
                if (c0VarG3 == null) {
                    return rm.i.c(rm.h.NOT_FOUND_UNSIGNED_TYPE, "ULong");
                }
                return c0VarG3;
            default:
                kotlin.jvm.internal.n.f(module, "module");
                zk.e eVarD4 = zk.u.d(module, wk.l.S);
                c0 c0VarG4 = eVarD4 != null ? eVarD4.g() : null;
                if (c0VarG4 == null) {
                    return rm.i.c(rm.h.NOT_FOUND_UNSIGNED_TYPE, "UShort");
                }
                return c0VarG4;
        }
    }

    @Override // dm.g
    public final String toString() {
        switch (this.f38963b) {
            case 0:
                return ((Number) this.f38953a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f38953a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f38953a).longValue() + ".toULong()";
            default:
                return ((Number) this.f38953a).intValue() + ".toUShort()";
        }
    }

    public y(short s10) {
        super(Short.valueOf(s10));
    }

    public y(int i10) {
        super(Integer.valueOf(i10));
    }

    public y(long j10) {
        super(Long.valueOf(j10));
    }
}
