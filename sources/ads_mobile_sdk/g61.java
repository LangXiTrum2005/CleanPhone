package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import complexometry.kowloon;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class g61 {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;

    public g61(Drawable drawable, Uri uri, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.a = drawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    public final kowloon a() {
        return new kowloon(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g61)) {
            return false;
        }
        g61 g61Var = (g61) obj;
        return Intrinsics.wireman(this.a, g61Var.a) && Intrinsics.wireman(this.b, g61Var.b) && Double.compare(this.c, g61Var.c) == 0 && this.d == g61Var.d && this.e == g61Var.e;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return Integer.hashCode(this.e) + bonny.attabal(this.d, (Double.hashCode(this.c) + ((this.b.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "InternalNativeAdImage(drawable=" + this.a + ", uri=" + this.b + ", scale=" + this.c + ", width=" + this.d + ", height=" + this.e + ")";
    }
}
