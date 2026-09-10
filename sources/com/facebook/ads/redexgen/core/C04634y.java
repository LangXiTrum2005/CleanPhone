package com.facebook.ads.redexgen.core;

import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04634y {
    public final Object A00;

    public C04634y(Object obj) {
        this.A00 = obj;
    }

    public static C04634y A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C04634y(obj);
    }

    public static Object A01(C04634y c04634y) {
        if (c04634y == null) {
            return null;
        }
        return c04634y.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C04634y A06(int i, int i2, int i3, int i4) {
        return new C04634y(((WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C04634y c04634y = (C04634y) obj;
        if (this.A00 == null) {
            return c04634y.A00 == null;
        }
        return this.A00.equals(c04634y.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
