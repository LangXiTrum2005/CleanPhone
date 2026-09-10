package xl;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends t9.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String name, String desc) {
        super(20);
        n.f(name, "name");
        n.f(desc, "desc");
        this.f53898d = name;
        this.f53899e = desc;
    }

    @Override // t9.e
    public final String a() {
        return this.f53898d + ':' + this.f53899e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return n.a(this.f53898d, dVar.f53898d) && n.a(this.f53899e, dVar.f53899e);
    }

    public final int hashCode() {
        return this.f53899e.hashCode() + (this.f53898d.hashCode() * 31);
    }
}
