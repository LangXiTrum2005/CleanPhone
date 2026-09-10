package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class Size {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f18963c = new Size(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18965b;

    static {
        new Size(0, 0);
    }

    public Size(int i2, int i3) {
        Assertions.b((i2 == -1 || i2 >= 0) && (i3 == -1 || i3 >= 0));
        this.f18964a = i2;
        this.f18965b = i3;
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
            if (this.f18964a == size.f18964a && this.f18965b == size.f18965b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f18964a;
        return ((i2 >>> 16) | (i2 << 16)) ^ this.f18965b;
    }

    public final String toString() {
        return this.f18964a + "x" + this.f18965b;
    }
}
