package saneness;

/* JADX INFO: loaded from: classes.dex */
public abstract class labourwallah {
    public static void attabal() {
        if (!groundwood.f37158attabal.a) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void saneness(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
