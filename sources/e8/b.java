package e8;

import d5.u;
import defpackage.e;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f39170f;

    public b(String id2, int i10, String name, int i11, int i12, boolean z10) {
        z10 = (i12 & 16) != 0 ? false : z10;
        n.f(id2, "id");
        n.f(name, "name");
        this.f39165a = id2;
        this.f39166b = name;
        this.f39167c = i10;
        this.f39168d = i11;
        this.f39169e = z10;
        this.f39170f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f39165a, bVar.f39165a) && n.a(this.f39166b, bVar.f39166b) && this.f39167c == bVar.f39167c && this.f39168d == bVar.f39168d && this.f39169e == bVar.f39169e && n.a(this.f39170f, bVar.f39170f);
    }

    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f39169e) + wi.d.f(this.f39168d, wi.d.f(this.f39167c, u.e(this.f39165a.hashCode() * 31, 31, this.f39166b), 31), 31)) * 31;
        Long l = this.f39170f;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        Long l = this.f39170f;
        StringBuilder sbV = e.v("AssetPathEntity(id=", this.f39165a, ", name=", this.f39166b, ", assetCount=");
        l1.d.o(sbV, this.f39167c, ", typeInt=", this.f39168d, ", isAll=");
        sbV.append(this.f39169e);
        sbV.append(", modifiedDate=");
        sbV.append(l);
        sbV.append(")");
        return sbV.toString();
    }
}
