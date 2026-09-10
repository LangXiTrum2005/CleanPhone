package v1;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52307g;

    @Override // i2.r
    public final void b(long j10, long j11, long j12, List list, g2.n[] nVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.f52307g, jElapsedRealtime)) {
            for (int i10 = this.f42743b - 1; i10 >= 0; i10--) {
                if (!a(i10, jElapsedRealtime)) {
                    this.f52307g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // i2.r
    public final int getSelectedIndex() {
        return this.f52307g;
    }

    @Override // i2.r
    public final Object getSelectionData() {
        return null;
    }

    @Override // i2.r
    public final int getSelectionReason() {
        return 0;
    }
}
