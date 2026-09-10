package xj;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends f implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f53840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53842c;

    public e(f fVar, int i10, int i11) {
        this.f53840a = fVar;
        this.f53841b = i10;
        c cVar = f.Companion;
        int size = fVar.size();
        cVar.getClass();
        c.c(i10, i11, size);
        this.f53842c = i11 - i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f.Companion.getClass();
        c.a(i10, this.f53842c);
        return this.f53840a.get(this.f53841b + i10);
    }

    @Override // xj.a
    public final int getSize() {
        return this.f53842c;
    }

    @Override // xj.f, java.util.List
    public final List subList(int i10, int i11) {
        f.Companion.getClass();
        c.c(i10, i11, this.f53842c);
        int i12 = this.f53841b;
        return new e(this.f53840a, i10 + i12, i12 + i11);
    }
}
