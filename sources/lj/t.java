package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45447b;

    public t(String str, List list) {
        this.f45446a = list;
        this.f45447b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(t.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        t tVar = (t) obj;
        return t9.e.d(this.f45446a, tVar.f45446a) && t9.e.d(this.f45447b, tVar.f45447b);
    }

    public final int hashCode() {
        return t9.e.e(this.f45447b) + ((t9.e.e(this.f45446a) + (t.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformPendingPurchaseUpdate(products=" + this.f45446a + ", purchaseToken=" + this.f45447b + ")";
    }
}
