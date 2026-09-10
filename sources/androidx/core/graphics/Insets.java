package androidx.core.graphics;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class Insets {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Insets f4296e = new Insets(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4299c;
    public final int d;

    public static class Api29Impl {
        public static android.graphics.Insets a(int i2, int i3, int i4, int i5) {
            return android.graphics.Insets.of(i2, i3, i4, i5);
        }
    }

    public Insets(int i2, int i3, int i4, int i5) {
        this.f4297a = i2;
        this.f4298b = i3;
        this.f4299c = i4;
        this.d = i5;
    }

    public static Insets a(Insets insets, Insets insets2) {
        return b(Math.max(insets.f4297a, insets2.f4297a), Math.max(insets.f4298b, insets2.f4298b), Math.max(insets.f4299c, insets2.f4299c), Math.max(insets.d, insets2.d));
    }

    public static Insets b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f4296e : new Insets(i2, i3, i4, i5);
    }

    public static Insets c(android.graphics.Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final android.graphics.Insets d() {
        return Api29Impl.a(this.f4297a, this.f4298b, this.f4299c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.d == insets.d && this.f4297a == insets.f4297a && this.f4299c == insets.f4299c && this.f4298b == insets.f4298b;
    }

    public final int hashCode() {
        return (((((this.f4297a * 31) + this.f4298b) * 31) + this.f4299c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f4297a);
        sb.append(", top=");
        sb.append(this.f4298b);
        sb.append(", right=");
        sb.append(this.f4299c);
        sb.append(", bottom=");
        return a.p(sb, this.d, AbstractJsonLexerKt.END_OBJ);
    }
}
