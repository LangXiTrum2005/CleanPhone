package hj;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f42375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f42376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f42377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f42379e;

    public h(Long l, Long l10, Long l11, String str, Map map) {
        this.f42375a = l;
        this.f42376b = l10;
        this.f42377c = l11;
        this.f42378d = str;
        this.f42379e = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(h.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h hVar = (h) obj;
        return j1.f.n(this.f42375a, hVar.f42375a) && j1.f.n(this.f42376b, hVar.f42376b) && j1.f.n(this.f42377c, hVar.f42377c) && j1.f.n(this.f42378d, hVar.f42378d) && j1.f.n(this.f42379e, hVar.f42379e);
    }

    public final int hashCode() {
        return j1.f.o(this.f42379e) + ((j1.f.o(this.f42378d) + ((j1.f.o(this.f42377c) + ((j1.f.o(this.f42376b) + ((j1.f.o(this.f42375a) + (h.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HttpMetricAttributes(httpResponseCode=" + this.f42375a + ", requestPayloadSize=" + this.f42376b + ", responsePayloadSize=" + this.f42377c + ", responseContentType=" + this.f42378d + ", attributes=" + this.f42379e + ")";
    }
}
