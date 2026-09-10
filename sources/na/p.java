package na;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends h {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46635a;

    public p(Object obj) {
        this.f46635a = obj;
    }

    @Override // na.h
    public final Object d() {
        return this.f46635a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f46635a.equals(((p) obj).f46635a);
        }
        return false;
    }

    @Override // na.h
    public final boolean g() {
        return true;
    }

    @Override // na.h
    public final Object h() {
        return this.f46635a;
    }

    public final int hashCode() {
        return this.f46635a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f46635a + ")";
    }
}
