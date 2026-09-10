package g6;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e6.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e6.f f41595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6.f f41596c;

    public f(e6.f fVar, e6.f fVar2) {
        this.f41595b = fVar;
        this.f41596c = fVar2;
    }

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        this.f41595b.b(messageDigest);
        this.f41596c.b(messageDigest);
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f41595b.equals(fVar.f41595b) && this.f41596c.equals(fVar.f41596c)) {
                return true;
            }
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        return this.f41596c.hashCode() + (this.f41595b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f41595b + ", signature=" + this.f41596c + '}';
    }
}
