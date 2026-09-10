package com.facebook.ads.redexgen.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C11606w extends C2369hq {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ C11596v A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C2369hq
    public final int A0O(View view, int i2) {
        R2 r2A08 = A08();
        if (!r2A08.A22()) {
            return 0;
        }
        R3 r3 = (R3) view.getLayoutParams();
        int iA0N = A0N(r2A08.A0m(view) - r3.leftMargin, r2A08.A0p(view) + r3.rightMargin, r2A08.A0g(), r2A08.A0j() - r2A08.A0h(), i2) + this.A00.A02;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return iA0N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11606w(C11596v c11596v, C2300gi c2300gi) {
        super(c2300gi);
        this.A00 = c11596v;
    }

    @Override // com.facebook.ads.redexgen.core.C2369hq
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.core.C2369hq
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.C2369hq
    public final PointF A0P(int i2) {
        return this.A00.A56(i2);
    }
}
