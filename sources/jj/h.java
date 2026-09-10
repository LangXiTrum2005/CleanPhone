package jj;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f43945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f43946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f43949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f43950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f43951g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f43945a.equals(hVar.f43945a) && this.f43946b.equals(hVar.f43946b) && Objects.equals(this.f43947c, hVar.f43947c) && Objects.equals(this.f43948d, hVar.f43948d) && Objects.equals(this.f43949e, hVar.f43949e) && this.f43950f.equals(hVar.f43950f) && Objects.equals(this.f43951g, hVar.f43951g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43945a, this.f43946b, this.f43947c, this.f43948d, this.f43949e, this.f43950f, this.f43951g);
    }
}
