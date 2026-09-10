package qj;

import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49068a;

    public k(boolean z10) {
        this.f49068a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(j1.f.C(Boolean.valueOf(this.f49068a)), j1.f.C(Boolean.valueOf(((k) obj).f49068a)));
    }

    public final int hashCode() {
        return j1.f.C(Boolean.valueOf(this.f49068a)).hashCode();
    }

    public final String toString() {
        return "IsPlayingStateEvent(isPlaying=" + this.f49068a + ")";
    }
}
