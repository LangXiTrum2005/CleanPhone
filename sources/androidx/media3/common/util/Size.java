package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class Size {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f5671c = new Size(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5673b;

    static {
        new Size(0, 0);
    }

    public Size(int i2, int i3) {
        Assertions.b((i2 == -1 || i2 >= 0) && (i3 == -1 || i3 >= 0));
        this.f5672a = i2;
        this.f5673b = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f5672a == size.f5672a && this.f5673b == size.f5673b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f5672a;
        return ((i2 >>> 16) | (i2 << 16)) ^ this.f5673b;
    }

    public final String toString() {
        return this.f5672a + "x" + this.f5673b;
    }
}
