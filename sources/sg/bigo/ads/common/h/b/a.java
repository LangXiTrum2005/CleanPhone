package sg.bigo.ads.common.h.b;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f47279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.common.h.a f47280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f47281c;
    float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f47282e;
    String f;

    public a(sg.bigo.ads.common.h.a aVar) {
        this.f47280b = aVar;
        this.f47279a = aVar.f47251a;
    }

    public final void a(long j) {
        this.f47280b.f47256i = j;
    }

    public final void b(long j) {
        this.f47280b.g = j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f47279a.equals(aVar.f47279a) && this.f47280b.d.equals(aVar.f47280b.d) && this.f47280b.f47253c.equals(aVar.f47280b.f47253c);
    }

    public String toString() {
        return this.f47280b.toString();
    }
}
