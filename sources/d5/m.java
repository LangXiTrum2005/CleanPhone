package d5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f38700a;

    public m(f fVar) {
        this.f38700a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f38700a.equals(((m) obj).f38700a);
    }

    public final int hashCode() {
        return this.f38700a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f38700a + '}';
    }
}
