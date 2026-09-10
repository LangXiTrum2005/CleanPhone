package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4822a;

    public m(p pVar) {
        this.f4822a = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        p pVar = this.f4822a;
        int i12 = pVar.f4856a;
        int iComputeVerticalScrollRange = pVar.f4873s.computeVerticalScrollRange();
        int i13 = pVar.f4872r;
        pVar.f4874t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
        int iComputeHorizontalScrollRange = pVar.f4873s.computeHorizontalScrollRange();
        int i14 = pVar.f4871q;
        boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
        pVar.f4875u = z10;
        boolean z11 = pVar.f4874t;
        if (!z11 && !z10) {
            if (pVar.f4876v != 0) {
                pVar.e(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i13;
            pVar.l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            pVar.f4866k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
        }
        if (pVar.f4875u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i14;
            pVar.f4869o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            pVar.f4868n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = pVar.f4876v;
        if (i15 == 0 || i15 == 1) {
            pVar.e(1);
        }
    }
}
