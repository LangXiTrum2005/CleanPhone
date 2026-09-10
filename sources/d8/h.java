package d8;

import d5.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38787b;

    public h(ArrayList arrayList, String str) {
        this.f38786a = arrayList;
        this.f38787b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f38786a.equals(hVar.f38786a) && this.f38787b.equals(hVar.f38787b);
    }

    public final int hashCode() {
        return g.f38784a.hashCode() + u.e(this.f38786a.hashCode() * 31, 31, this.f38787b);
    }

    public final String toString() {
        return "WriteOperation(uris=" + this.f38786a + ", targetPath=" + this.f38787b + ", operationType=" + g.f38784a + ")";
    }
}
