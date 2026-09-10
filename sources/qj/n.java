package qj;

import java.util.List;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49071a;

    public n(List list) {
        this.f49071a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(j1.f.C(this.f49071a), j1.f.C(((n) obj).f49071a));
    }

    public final int hashCode() {
        return j1.f.C(this.f49071a).hashCode();
    }

    public final String toString() {
        return "NativeAudioTrackData(exoPlayerTracks=" + this.f49071a + ")";
    }
}
