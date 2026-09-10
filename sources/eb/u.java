package eb;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40011a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40013c;

    public u(List list, List list2) {
        this.f40012b = list;
        this.f40013c = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f40011a) {
            case 0:
                return new v(((List) this.f40012b).iterator(), ((List) this.f40013c).iterator());
            default:
                com.google.android.gms.common.api.internal.m mVar = (com.google.android.gms.common.api.internal.m) this.f40013c;
                return ((am.e) mVar.f11729a).z(mVar, (String) this.f40012b);
        }
    }

    public String toString() {
        switch (this.f40011a) {
            case 1:
                na.g gVar = new na.g(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                gVar.s(sb2, iterator());
                sb2.append(']');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public u(com.google.android.gms.common.api.internal.m mVar, String str) {
        this.f40012b = str;
        this.f40013c = mVar;
    }
}
