package sg.bigo.ads.common.u;

/* JADX INFO: loaded from: classes7.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f47493c;

    public h(int i2, String str) {
        this.f47491a = i2;
        this.f47492b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.f47493c;
        return exc != null ? exc.getMessage() : this.f47492b;
    }
}
