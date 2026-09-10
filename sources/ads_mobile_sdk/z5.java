package ads_mobile_sdk;

import android.graphics.Insets;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.eliminate;
import saneness.moveable;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class z5 implements eliminate {
    public final String a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Insets g;
    public final String h;
    public final Boolean i;
    public final String j;
    public final String k;
    public final List l;
    public final xi2 m;
    public final boolean n;

    public z5(String formatString, float f, int i, int i2, int i3, int i4, Insets insets, String str, Boolean bool, String str2, String str3, ArrayList supportedAdSizes, xi2 xi2Var, boolean z) {
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        Intrinsics.checkNotNullParameter(supportedAdSizes, "supportedAdSizes");
        this.a = formatString;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = insets;
        this.h = str;
        this.i = bool;
        this.j = str2;
        this.k = str3;
        this.l = supportedAdSizes;
        this.m = xi2Var;
        this.n = z;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Insets insets;
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.format = this.a;
        signals.screenDensity = this.b;
        signals.screenHeight = this.d;
        signals.screenWidth = this.c;
        signals.screenHeightDip = this.f;
        signals.screenWidthDip = this.e;
        if (Build.VERSION.SDK_INT >= 30 && (insets = this.g) != null) {
            signals.safeAreaMarginLeftDip = Integer.valueOf(insets.left);
            signals.safeAreaMarginTopDip = Integer.valueOf(this.g.top);
            signals.safeAreaMarginRightDip = Integer.valueOf(this.g.right);
            signals.safeAreaMarginBottomDip = Integer.valueOf(this.g.bottom);
        }
        signals.responsiveAutoFormat = this.h;
        signals.adaptiveSlot = this.i;
        signals.fluidType = this.j;
        signals.multipleAdSizeString = this.k;
        signals.adSizeArray.addAll(this.l);
        xi2 xi2Var = this.m;
        if (xi2Var != null) {
            signals.roundedCornerTopLeftDip = Integer.valueOf(xi2Var.a);
            signals.roundedCornerTopRightDip = Integer.valueOf(this.m.b);
            signals.roundedCornerBottomLeftDip = Integer.valueOf(this.m.d);
            signals.roundedCornerBottomRightDip = Integer.valueOf(this.m.c);
        }
        signals.isGreaterThanMaxAllowedBannerSize = this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return Intrinsics.wireman(this.a, z5Var.a) && Float.compare(this.b, z5Var.b) == 0 && this.c == z5Var.c && this.d == z5Var.d && this.e == z5Var.e && this.f == z5Var.f && Intrinsics.wireman(this.g, z5Var.g) && Intrinsics.wireman(this.h, z5Var.h) && Intrinsics.wireman(this.i, z5Var.i) && Intrinsics.wireman(this.j, z5Var.j) && Intrinsics.wireman(this.k, z5Var.k) && Intrinsics.wireman(this.l, z5Var.l) && Intrinsics.wireman(this.m, z5Var.m) && this.n == z5Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iAttabal = bonny.attabal(this.f, bonny.attabal(this.e, bonny.attabal(this.d, bonny.attabal(this.c, (Float.hashCode(this.b) + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        Insets insets = this.g;
        int iHashCode = (iAttabal + (insets == null ? 0 : insets.hashCode())) * 31;
        String str = this.h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iAttabal2 = moveable.attabal(this.l, (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        xi2 xi2Var = this.m;
        int iHashCode5 = (iAttabal2 + (xi2Var != null ? xi2Var.hashCode() : 0)) * 31;
        boolean z = this.n;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode5 + r1;
    }

    public final String toString() {
        return "AdSizeSignal(formatString=" + this.a + ", screenDensity=" + this.b + ", screenWidth=" + this.c + ", screenHeight=" + this.d + ", screenWidthDip=" + this.e + ", screenHeightDip=" + this.f + ", safeAreaMarginsDip=" + this.g + ", responsiveAutoFormat=" + this.h + ", isInlineAdaptive=" + this.i + ", fluidType=" + this.j + ", multipleAdSizeString=" + this.k + ", supportedAdSizes=" + this.l + ", roundedCornerRadii=" + this.m + ", isGreaterThanMaxAllowedBannerSize=" + this.n + ")";
    }
}
