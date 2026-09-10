package t1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50338d;

    public b(String str, String str2, int i10, int i11) {
        this.f50335a = str;
        this.f50336b = str2;
        this.f50337c = i10;
        this.f50338d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f50337c == bVar.f50337c && this.f50338d == bVar.f50338d && Objects.equals(this.f50335a, bVar.f50335a) && Objects.equals(this.f50336b, bVar.f50336b);
    }

    public final int hashCode() {
        return Objects.hash(this.f50335a, this.f50336b, Integer.valueOf(this.f50337c), Integer.valueOf(this.f50338d));
    }
}
