package m0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f45766a;

    public z(NestedScrollView nestedScrollView) {
        this.f45766a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // m0.a0
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f45766a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override // m0.a0
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f45766a.onScrollProgress(i10, i11, i12, i13);
    }
}
