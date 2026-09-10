package nk;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends e {
    @Override // nk.e
    public final int a(int i10) {
        return (i().nextInt() >>> (32 - i10)) & ((-i10) >> 31);
    }

    @Override // nk.e
    public final int d() {
        return i().nextInt();
    }

    @Override // nk.e
    public final long g() {
        return i().nextLong();
    }

    public abstract Random i();
}
