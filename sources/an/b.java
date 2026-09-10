package an;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3772a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pk.c f3775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3777f;

    public b(c cVar) {
        this.f3777f = cVar;
        int iM = com.bumptech.glide.d.m(0, 0, cVar.f3778a.length());
        this.f3773b = iM;
        this.f3774c = iM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    public final void a() {
        wj.f fVar;
        int i10 = this.f3774c;
        if (i10 < 0) {
            this.f3772a = 0;
            this.f3775d = null;
            return;
        }
        c cVar = this.f3777f;
        int i11 = cVar.f3779b;
        if (i11 > 0) {
            int i12 = this.f3776e + 1;
            this.f3776e = i12;
            if (i12 >= i11) {
                this.f3775d = new pk.c(this.f3773b, h.s0(cVar.f3778a), 1);
                this.f3774c = -1;
            } else if (i10 > cVar.f3778a.length() && (fVar = (wj.f) cVar.f3780c.invoke(cVar.f3778a, Integer.valueOf(this.f3774c))) != null) {
                int iIntValue = ((Number) fVar.f53283a).intValue();
                int iIntValue2 = ((Number) fVar.f53284b).intValue();
                this.f3775d = com.bumptech.glide.d.O(this.f3773b, iIntValue);
                int i13 = iIntValue + iIntValue2;
                this.f3773b = i13;
                this.f3774c = i13 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f3775d = new pk.c(this.f3773b, h.s0(cVar.f3778a), 1);
                this.f3774c = -1;
            }
        } else if (i10 > cVar.f3778a.length()) {
            this.f3775d = new pk.c(this.f3773b, h.s0(cVar.f3778a), 1);
            this.f3774c = -1;
        } else {
            int iIntValue3 = ((Number) fVar.f53283a).intValue();
            int iIntValue4 = ((Number) fVar.f53284b).intValue();
            this.f3775d = com.bumptech.glide.d.O(this.f3773b, iIntValue3);
            int i14 = iIntValue3 + iIntValue4;
            this.f3773b = i14;
            this.f3774c = i14 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f3772a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3772a == -1) {
            a();
        }
        return this.f3772a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3772a == -1) {
            a();
        }
        if (this.f3772a == 0) {
            throw new NoSuchElementException();
        }
        pk.c cVar = this.f3775d;
        kotlin.jvm.internal.n.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f3775d = null;
        this.f3772a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
