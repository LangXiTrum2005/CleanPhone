package x3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f53573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f53574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f53575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f53576e;

    public b(int i10, float f10, float f11, float f12, long j10) {
        this.f53572a = i10;
        this.f53573b = f10;
        this.f53574c = f11;
        this.f53575d = f12;
        this.f53576e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f53574c == bVar.f53574c && this.f53575d == bVar.f53575d && this.f53573b == bVar.f53573b && this.f53572a == bVar.f53572a && this.f53576e == bVar.f53576e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53576e) + wi.d.f(this.f53572a, (Float.hashCode(this.f53573b) + ((Float.hashCode(this.f53575d) + (Float.hashCode(this.f53574c) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f53574c + ", touchY=" + this.f53575d + ", progress=" + this.f53573b + ", swipeEdge=" + this.f53572a + ", frameTimeMillis=" + this.f53576e + ')';
    }
}
