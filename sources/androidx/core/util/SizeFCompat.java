package androidx.core.util;

import android.util.SizeF;

/* JADX INFO: loaded from: classes.dex */
public final class SizeFCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4413b;

    public static final class Api21Impl {
        public static SizeF a(SizeFCompat sizeFCompat) {
            sizeFCompat.getClass();
            return new SizeF(sizeFCompat.f4412a, sizeFCompat.f4413b);
        }

        public static SizeFCompat b(SizeF sizeF) {
            sizeF.getClass();
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public SizeFCompat(float f, float f2) {
        Preconditions.b(f, "width");
        this.f4412a = f;
        Preconditions.b(f2, "height");
        this.f4413b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        return sizeFCompat.f4412a == this.f4412a && sizeFCompat.f4413b == this.f4413b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4412a) ^ Float.floatToIntBits(this.f4413b);
    }

    public final String toString() {
        return this.f4412a + "x" + this.f4413b;
    }
}
