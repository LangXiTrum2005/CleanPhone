package j$.time.format;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f43071a = new D();

    final int a(char c2) {
        int i2 = c2 - '0';
        if (i2 < 0 || i2 > 9) {
            return -1;
        }
        return i2;
    }

    public final int hashCode() {
        return 182;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        ((D) obj).getClass();
        return true;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
