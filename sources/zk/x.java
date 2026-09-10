package zk;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55005a;

    public x(ArrayList arrayList) {
        this.f55005a = arrayList;
        if (xj.b0.W(arrayList).size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f55005a + ')';
    }
}
