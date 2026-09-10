package o4;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f47107a;

    public d0(ViewGroup viewGroup) {
        this.f47107a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && ((d0) obj).f47107a.equals(this.f47107a);
    }

    public final int hashCode() {
        return this.f47107a.hashCode();
    }
}
