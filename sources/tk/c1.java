package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c1 extends r implements qk.g {
    @Override // tk.r
    public final c0 e() {
        return l().f50988f;
    }

    @Override // tk.r
    public final uk.f f() {
        return null;
    }

    @Override // qk.g
    public final boolean isExternal() {
        return ((cl.l0) k()).f6536f;
    }

    @Override // qk.g
    public final boolean isInfix() {
        k();
        return false;
    }

    @Override // qk.g
    public final boolean isInline() {
        return ((cl.l0) k()).f6539i;
    }

    @Override // qk.g
    public final boolean isOperator() {
        k();
        return false;
    }

    @Override // qk.c
    public final boolean isSuspend() {
        k();
        return false;
    }

    @Override // tk.r
    public final boolean j() {
        return l().j();
    }

    public abstract zk.g0 k();

    public abstract i1 l();
}
