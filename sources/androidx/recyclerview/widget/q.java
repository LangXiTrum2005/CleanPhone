package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f4890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4891d;

    public final void a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f4891d;
        int i13 = i12 * 2;
        int[] iArr = this.f4890c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f4890c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f4890c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f4890c;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f4891d++;
    }

    public final void b(RecyclerView recyclerView, boolean z10) {
        this.f4891d = 0;
        int[] iArr = this.f4890c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r0 r0Var = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || r0Var == null || !r0Var.f4913i) {
            return;
        }
        if (z10) {
            if (!recyclerView.mAdapterHelper.g()) {
                r0Var.i(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            r0Var.h(this.f4888a, this.f4889b, recyclerView.mState, this);
        }
        int i10 = this.f4891d;
        if (i10 > r0Var.f4914j) {
            r0Var.f4914j = i10;
            r0Var.f4915k = z10;
            recyclerView.mRecycler.l();
        }
    }
}
