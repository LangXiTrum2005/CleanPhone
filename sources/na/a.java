package na;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46626a = new a();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f46626a;
    }

    @Override // na.h
    public final Object d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // na.h
    public final boolean g() {
        return false;
    }

    @Override // na.h
    public final Object h() {
        return null;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
