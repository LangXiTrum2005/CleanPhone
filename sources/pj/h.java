package pj;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f48392c;

    public h(Map map, boolean z10, boolean z11) {
        this.f48390a = z10;
        this.f48391b = z11;
        this.f48392c = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(h.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h hVar = (h) obj;
        return com.bumptech.glide.c.h(Boolean.valueOf(this.f48390a), Boolean.valueOf(hVar.f48390a)) && com.bumptech.glide.c.h(Boolean.valueOf(this.f48391b), Boolean.valueOf(hVar.f48391b)) && com.bumptech.glide.c.h(this.f48392c, hVar.f48392c);
    }

    public final int hashCode() {
        return com.bumptech.glide.c.i(this.f48392c) + ((com.bumptech.glide.c.i(Boolean.valueOf(this.f48391b)) + ((com.bumptech.glide.c.i(Boolean.valueOf(this.f48390a)) + (h.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WebViewOptions(enableJavaScript=" + this.f48390a + ", enableDomStorage=" + this.f48391b + ", headers=" + this.f48392c + ")";
    }
}
