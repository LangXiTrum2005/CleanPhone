package g6;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements e6.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f41688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f41689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e6.f f41690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f41691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e6.i f41692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41693j;

    public s(Object obj, e6.f fVar, int i10, int i11, Map map, Class cls, Class cls2, e6.i iVar) {
        a7.h.c(obj, "Argument must not be null");
        this.f41685b = obj;
        this.f41690g = fVar;
        this.f41686c = i10;
        this.f41687d = i11;
        a7.h.c(map, "Argument must not be null");
        this.f41691h = map;
        a7.h.c(cls, "Resource class must not be null");
        this.f41688e = cls;
        a7.h.c(cls2, "Transcode class must not be null");
        this.f41689f = cls2;
        a7.h.c(iVar, "Argument must not be null");
        this.f41692i = iVar;
    }

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f41685b.equals(sVar.f41685b) && this.f41690g.equals(sVar.f41690g) && this.f41687d == sVar.f41687d && this.f41686c == sVar.f41686c && this.f41691h.equals(sVar.f41691h) && this.f41688e.equals(sVar.f41688e) && this.f41689f.equals(sVar.f41689f) && this.f41692i.equals(sVar.f41692i)) {
                return true;
            }
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        if (this.f41693j == 0) {
            int iHashCode = this.f41685b.hashCode();
            this.f41693j = iHashCode;
            int iHashCode2 = ((((this.f41690g.hashCode() + (iHashCode * 31)) * 31) + this.f41686c) * 31) + this.f41687d;
            this.f41693j = iHashCode2;
            int iHashCode3 = this.f41691h.hashCode() + (iHashCode2 * 31);
            this.f41693j = iHashCode3;
            int iHashCode4 = this.f41688e.hashCode() + (iHashCode3 * 31);
            this.f41693j = iHashCode4;
            int iHashCode5 = this.f41689f.hashCode() + (iHashCode4 * 31);
            this.f41693j = iHashCode5;
            this.f41693j = this.f41692i.f39148b.hashCode() + (iHashCode5 * 31);
        }
        return this.f41693j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f41685b + ", width=" + this.f41686c + ", height=" + this.f41687d + ", resourceClass=" + this.f41688e + ", transcodeClass=" + this.f41689f + ", signature=" + this.f41690g + ", hashCode=" + this.f41693j + ", transformations=" + this.f41691h + ", options=" + this.f41692i + '}';
    }
}
