package androidx.work.impl.constraints;

/* JADX INFO: loaded from: classes.dex */
public class NetworkState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8723c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f8721a == networkState.f8721a && this.f8722b == networkState.f8722b && this.f8723c == networkState.f8723c && this.d == networkState.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z2 = this.f8722b;
        ?? r1 = this.f8721a;
        int i2 = r1;
        if (z2) {
            i2 = r1 + 16;
        }
        int i3 = i2;
        if (this.f8723c) {
            i3 = i2 + 256;
        }
        return this.d ? i3 + 4096 : i3;
    }

    public final String toString() {
        return "[ Connected=" + this.f8721a + " Validated=" + this.f8722b + " Metered=" + this.f8723c + " NotRoaming=" + this.d + " ]";
    }
}
