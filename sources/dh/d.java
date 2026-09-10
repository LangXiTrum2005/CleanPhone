package dh;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f38890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f38891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38893d;

    public d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f38890a = linkedHashSet;
        this.f38891b = linkedHashMap;
        this.f38892c = arrayList;
        this.f38893d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return n.a(this.f38890a, dVar.f38890a) && n.a(this.f38891b, dVar.f38891b) && n.a(this.f38892c, dVar.f38892c) && n.a(this.f38893d, dVar.f38893d);
    }

    public final int hashCode() {
        return this.f38893d.hashCode() + q4.a.g((this.f38891b.hashCode() + (this.f38890a.hashCode() * 31)) * 31, 31, this.f38892c);
    }

    public final String toString() {
        return "InsertResult(removeAssets=" + this.f38890a + ", adds=" + this.f38891b + ", newAssets=" + this.f38892c + ", otherAssets=" + this.f38893d + ")";
    }
}
