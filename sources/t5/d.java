package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f50501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50505e;

    public d(Integer num, int i10, int i11, String str, String str2) {
        this.f50501a = num;
        this.f50502b = i10;
        this.f50503c = i11;
        this.f50504d = str;
        this.f50505e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return n.a(this.f50501a, dVar.f50501a) && this.f50502b == dVar.f50502b && this.f50503c == dVar.f50503c && n.a(this.f50504d, dVar.f50504d) && n.a(this.f50505e, dVar.f50505e);
    }

    public final int hashCode() {
        Integer num = this.f50501a;
        return this.f50505e.hashCode() + u.e(wi.d.f(this.f50503c, wi.d.f(this.f50502b, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31, this.f50504d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event(year=");
        sb2.append(this.f50501a);
        sb2.append(", month=");
        sb2.append(this.f50502b);
        sb2.append(", day=");
        sb2.append(this.f50503c);
        sb2.append(", label=");
        sb2.append(this.f50504d);
        sb2.append(", customLabel=");
        return defpackage.e.q(this.f50505e, ")", sb2);
    }
}
