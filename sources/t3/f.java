package t3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f50473b;

    public f(int i10, b bVar) {
        this.f50472a = i10;
        this.f50473b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f50472a, ((f) obj).f50472a);
    }
}
