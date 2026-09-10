package ads_mobile_sdk;

/* JADX INFO: loaded from: classes.dex */
public final class uk2 implements Comparable {
    public final Runnable a;
    public final long b;

    public uk2(Runnable runnable, long j) {
        this.a = runnable;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((uk2) obj).b);
    }
}
