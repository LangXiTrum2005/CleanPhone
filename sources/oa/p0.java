package oa;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final na.g f47290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final na.g f47291b;

    static {
        try {
            f47290a = new na.g(q0.class.getDeclaredField("map"));
            try {
                f47291b = new na.g(q0.class.getDeclaredField("size"));
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        } catch (NoSuchFieldException e11) {
            throw new AssertionError(e11);
        }
    }
}
