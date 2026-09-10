package ads_mobile_sdk;

import android.graphics.Rect;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class m73 {
    public final o73 a;
    public final boolean b;
    public final int c;
    public final Rect d;
    public final boolean e;
    public final Rect f;
    public final Rect g;
    public final boolean h;
    public final Rect i;
    public final boolean j;
    public final Rect k;

    public m73(o73 viewabilityUpdateEvent, boolean z, int i, Rect adPosition, boolean z2, Rect screenPosition, Rect globalVisibleBox, boolean z3, Rect localVisibleBox, boolean z4, Rect hitRect) {
        Intrinsics.checkNotNullParameter(viewabilityUpdateEvent, "viewabilityUpdateEvent");
        Intrinsics.checkNotNullParameter(adPosition, "adPosition");
        Intrinsics.checkNotNullParameter(screenPosition, "screenPosition");
        Intrinsics.checkNotNullParameter(globalVisibleBox, "globalVisibleBox");
        Intrinsics.checkNotNullParameter(localVisibleBox, "localVisibleBox");
        Intrinsics.checkNotNullParameter(hitRect, "hitRect");
        this.a = viewabilityUpdateEvent;
        this.b = z;
        this.c = i;
        this.d = adPosition;
        this.e = z2;
        this.f = screenPosition;
        this.g = globalVisibleBox;
        this.h = z3;
        this.i = localVisibleBox;
        this.j = z4;
        this.k = hitRect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m73)) {
            return false;
        }
        m73 m73Var = (m73) obj;
        return this.a == m73Var.a && this.b == m73Var.b && this.c == m73Var.c && Intrinsics.wireman(this.d, m73Var.d) && this.e == m73Var.e && Intrinsics.wireman(this.f, m73Var.f) && Intrinsics.wireman(this.g, m73Var.g) && this.h == m73Var.h && Intrinsics.wireman(this.i, m73Var.i) && this.j == m73Var.j && Intrinsics.wireman(this.k, m73Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode2 = (this.d.hashCode() + bonny.attabal(this.c, (iHashCode + r2) * 31, 31)) * 31;
        boolean z2 = this.e;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int iHashCode3 = (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + r0) * 31)) * 31)) * 31;
        boolean z3 = this.h;
        ?? r1 = z3;
        if (z3) {
            r1 = 1;
        }
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + r1) * 31)) * 31;
        boolean z4 = this.j;
        return this.k.hashCode() + ((iHashCode4 + (z4 ? 1 : z4)) * 31);
    }

    public final String toString() {
        return "ViewabilityEvent(viewabilityUpdateEvent=" + this.a + ", isVisible=" + this.b + ", windowVisibility=" + this.c + ", adPosition=" + this.d + ", isAttachedToWindow=" + this.e + ", screenPosition=" + this.f + ", globalVisibleBox=" + this.g + ", globalVisibleBoxVisible=" + this.h + ", localVisibleBox=" + this.i + ", localVisibleBoxVisible=" + this.j + ", hitRect=" + this.k + ")";
    }
}
