package d5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f38699a = f.f38690c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f38699a.equals(((k) obj).f38699a);
    }

    public final int hashCode() {
        return this.f38699a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f38699a + '}';
    }
}
