package sg.bigo.ads.core.f.a;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48523c;
    public boolean d;

    public n(String str) {
        this.d = false;
        this.f48521a = true;
        this.f48522b = str;
    }

    public String toString() {
        return android.support.v4.media.a.r(new StringBuilder("{\"Content\":\""), this.f48522b, "\"}");
    }

    public n(String str, byte b2) {
        this(str);
        this.d = true;
    }
}
