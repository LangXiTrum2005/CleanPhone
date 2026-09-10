package j1;

import d5.u;
import java.util.Objects;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f43596e = new h(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43600d;

    public h(int i10, int i11, int i12) {
        this.f43597a = i10;
        this.f43598b = i11;
        this.f43599c = i12;
        this.f43600d = y.H(i12) ? y.t(i12) * i11 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f43597a == hVar.f43597a && this.f43598b == hVar.f43598b && this.f43599c == hVar.f43599c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f43597a), Integer.valueOf(this.f43598b), Integer.valueOf(this.f43599c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f43597a);
        sb2.append(", channelCount=");
        sb2.append(this.f43598b);
        sb2.append(", encoding=");
        return u.g(sb2, this.f43599c, ']');
    }
}
