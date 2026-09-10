package s5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50146b;

    public c(int i10, String str) {
        this.f50145a = i10;
        this.f50146b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f50145a == cVar.f50145a && this.f50146b.equals(cVar.f50146b);
    }

    public final int hashCode() {
        return this.f50146b.hashCode() + (Integer.hashCode(this.f50145a) * 31);
    }

    public final String toString() {
        return "EmailLabelPair(label=" + this.f50145a + ", customLabel=" + this.f50146b + ")";
    }
}
