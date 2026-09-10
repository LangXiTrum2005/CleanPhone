package s5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50152b;

    public f(int i10, String str) {
        this.f50151a = i10;
        this.f50152b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f50151a == fVar.f50151a && kotlin.jvm.internal.n.a(this.f50152b, fVar.f50152b);
    }

    public final int hashCode() {
        return this.f50152b.hashCode() + (Integer.hashCode(this.f50151a) * 31);
    }

    public final String toString() {
        return "SocialMediaLabelPair(label=" + this.f50151a + ", customLabel=" + this.f50152b + ")";
    }
}
