package ml;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm.y f46246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f46248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46249d;

    public x(pm.y yVar, List list, ArrayList arrayList, List list2) {
        this.f46246a = yVar;
        this.f46247b = list;
        this.f46248c = arrayList;
        this.f46249d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f46246a.equals(xVar.f46246a) && this.f46247b.equals(xVar.f46247b) && this.f46248c.equals(xVar.f46248c) && this.f46249d.equals(xVar.f46249d);
    }

    public final int hashCode() {
        return this.f46249d.hashCode() + ((this.f46248c.hashCode() + q4.a.g(this.f46246a.hashCode() * 961, 31, this.f46247b)) * 961);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f46246a + ", receiverType=null, valueParameters=" + this.f46247b + ", typeParameters=" + this.f46248c + ", hasStableParameterNames=false, errors=" + this.f46249d + ')';
    }
}
