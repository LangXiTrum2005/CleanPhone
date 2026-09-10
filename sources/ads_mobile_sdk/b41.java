package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.moveable;

/* JADX INFO: loaded from: classes.dex */
public final class b41 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final AdChoicesPlacement g;
    public final boolean h;

    public b41(String text, List icons, int i, int i2, int i3, long j, AdChoicesPlacement attributionInfoPlacement, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(attributionInfoPlacement, "attributionInfoPlacement");
        this.a = text;
        this.b = icons;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j;
        this.g = attributionInfoPlacement;
        this.h = z;
    }

    public final long a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41Var = (b41) obj;
        return Intrinsics.wireman(this.a, b41Var.a) && Intrinsics.wireman(this.b, b41Var.b) && this.c == b41Var.c && this.d == b41Var.d && this.e == b41Var.e && p002kotlin.time.saneness.kowloon(this.f, b41Var.f) && this.g == b41Var.g && this.h == b41Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((p002kotlin.time.saneness.trm(this.f) + bonny.attabal(this.e, bonny.attabal(this.d, bonny.attabal(this.c, moveable.attabal(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31;
        boolean z = this.h;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "InternalAttributionInfo(text=" + this.a + ", icons=" + this.b + ", backgroundColor=" + this.c + ", textColor=" + this.d + ", textSize=" + this.e + ", animationInterval=" + p002kotlin.time.saneness.starveling(this.f) + ", attributionInfoPlacement=" + this.g + ", allowPubRendering=" + this.h + ")";
    }
}
