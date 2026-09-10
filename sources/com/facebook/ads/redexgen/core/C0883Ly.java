package com.facebook.ads.redexgen.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0883Ly extends C1899lB {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ C0882Lx A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C1899lB
    public final int A0O(View view, int i) {
        AnonymousClass62 anonymousClass62A08 = A08();
        if (!anonymousClass62A08.A20()) {
            return 0;
        }
        AnonymousClass63 anonymousClass63 = (AnonymousClass63) view.getLayoutParams();
        int iA0N = A0N(anonymousClass62A08.A0k(view) - anonymousClass63.leftMargin, anonymousClass62A08.A0n(view) + anonymousClass63.rightMargin, anonymousClass62A08.A0e(), anonymousClass62A08.A0h() - anonymousClass62A08.A0f(), i) + this.A00.A02;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return iA0N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0883Ly(C0882Lx c0882Lx, C1828k1 c1828k1) {
        super(c1828k1);
        this.A00 = c0882Lx;
    }

    @Override // com.facebook.ads.redexgen.core.C1899lB
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.core.C1899lB
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.C1899lB
    public final PointF A0P(int i) {
        return this.A00.A4w(i);
    }
}
