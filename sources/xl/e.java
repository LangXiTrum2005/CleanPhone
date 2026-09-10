package xl;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends t9.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String name, String desc) {
        super(20);
        n.f(name, "name");
        n.f(desc, "desc");
        this.f53900d = name;
        this.f53901e = desc;
    }

    @Override // t9.e
    public final String a() {
        return this.f53900d + this.f53901e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.a(this.f53900d, eVar.f53900d) && n.a(this.f53901e, eVar.f53901e);
    }

    public final int hashCode() {
        return this.f53901e.hashCode() + (this.f53900d.hashCode() * 31);
    }
}
