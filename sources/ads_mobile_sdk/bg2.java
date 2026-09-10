package ads_mobile_sdk;

import android.graphics.Point;
import android.graphics.Rect;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class bg2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final yq f;
    public final Rect g;
    public final Pair h;
    public final Pair i;

    public bg2(int i, int i2, int i3, int i4, boolean z, yq closeButtonPosition, Rect originalAdPosition, Pair activityWindowDimensions, Pair activityVerticalLimits) {
        Intrinsics.checkNotNullParameter(closeButtonPosition, "closeButtonPosition");
        Intrinsics.checkNotNullParameter(originalAdPosition, "originalAdPosition");
        Intrinsics.checkNotNullParameter(activityWindowDimensions, "activityWindowDimensions");
        Intrinsics.checkNotNullParameter(activityVerticalLimits, "activityVerticalLimits");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = closeButtonPosition;
        this.g = originalAdPosition;
        this.h = activityWindowDimensions;
        this.i = activityVerticalLimits;
    }

    public final Point a() {
        Rect rect = this.g;
        int i = rect.left + this.c;
        int i2 = rect.top + this.d;
        if (!this.e) {
            Pair pair = this.i;
            int iIntValue = ((Number) pair.component1()).intValue();
            int iIntValue2 = ((Number) pair.component2()).intValue();
            int iIntValue3 = ((Number) this.h.component1()).intValue();
            if (i < 0) {
                i = 0;
            } else {
                int i3 = this.a;
                if (i + i3 > iIntValue3) {
                    i = iIntValue3 - i3;
                }
            }
            if (i2 < iIntValue) {
                i2 = iIntValue;
            } else {
                int i4 = this.b;
                if (i2 + i4 > iIntValue2) {
                    i2 = iIntValue2 - i4;
                }
            }
        }
        return new Point(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return this.a == bg2Var.a && this.b == bg2Var.b && this.c == bg2Var.c && this.d == bg2Var.d && this.e == bg2Var.e && this.f == bg2Var.f && Intrinsics.wireman(this.g, bg2Var.g) && Intrinsics.wireman(this.h, bg2Var.h) && Intrinsics.wireman(this.i, bg2Var.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final int hashCode() {
        int iAttabal = bonny.attabal(this.d, bonny.attabal(this.c, bonny.attabal(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        boolean z = this.e;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iAttabal + r2) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ResizeParams(widthDips=" + this.a + ", heightDips=" + this.b + ", offsetXDips=" + this.c + ", offsetYDips=" + this.d + ", allowOffScreen=" + this.e + ", closeButtonPosition=" + this.f + ", originalAdPosition=" + this.g + ", activityWindowDimensions=" + this.h + ", activityVerticalLimits=" + this.i + ")";
    }
}
