package zm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f55125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55127c;

    public q(i sequence, int i10, int i11) {
        kotlin.jvm.internal.n.f(sequence, "sequence");
        this.f55125a = sequence;
        this.f55126b = i10;
        this.f55127c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "startIndex should be non-negative, but is ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(l1.d.e(i11, "endIndex should be non-negative, but is ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(defpackage.e.g(i11, i10, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // zm.c
    public final i a(int i10) {
        int i11 = this.f55127c;
        int i12 = this.f55126b;
        return i10 >= i11 - i12 ? d.f55098a : new q(this.f55125a, i12 + i10, i11);
    }

    @Override // zm.c
    public final i b(int i10) {
        int i11 = this.f55127c;
        int i12 = this.f55126b;
        return i10 >= i11 - i12 ? this : new q(this.f55125a, i12, i10 + i12);
    }

    @Override // zm.i
    public final Iterator iterator() {
        return new h(this);
    }
}
