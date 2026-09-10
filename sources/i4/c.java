package i4;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42877d;

    public c(int i10, int i11, String str, String str2) {
        this.f42874a = i10;
        this.f42875b = i11;
        this.f42876c = str;
        this.f42877d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i10 = this.f42874a - cVar.f42874a;
        return i10 == 0 ? this.f42875b - cVar.f42875b : i10;
    }
}
