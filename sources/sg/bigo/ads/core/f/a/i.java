package sg.bigo.ads.core.f.a;

import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Node f48509a;

    public i(Node node) {
        this.f48509a = node;
    }

    public final String a() {
        return sg.bigo.ads.core.f.a.e(this.f48509a, "type");
    }

    public final String b() {
        return sg.bigo.ads.core.f.a.b(this.f48509a);
    }

    public final int c() {
        return sg.bigo.ads.core.f.a.d(this.f48509a, "fileSize").intValue();
    }

    public final int d() {
        return sg.bigo.ads.core.f.a.d(this.f48509a, "bitrate").intValue();
    }

    public final String e() {
        return sg.bigo.ads.core.f.a.e(this.f48509a, "md5");
    }
}
