package b0;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.k f5086a;

    public d(h9.k kVar) {
        this.f5086a = kVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        h9.k kVar = this.f5086a;
        if ((kVar.f42286a & 1) != 0) {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) kVar.f42287b)[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i11 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i11, sparseIntArray.get(i11) + 1);
                }
            }
        }
    }
}
