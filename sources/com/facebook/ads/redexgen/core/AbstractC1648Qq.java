package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.core.RK;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1648Qq<VH extends RK> {
    public static byte[] A02;
    public static String[] A03 = {"jUIKGw1ynNKnpAPmELSBfekQdKvvLP7N", "sNNGTv9KS6vRRQA34Mdww0wVckPktM11", "3xVPsODXVzGzX7adQrLtZXDPvj0RZqnv", "LC797JiAE7pTB", "T5D6LMII5PxeSeaFwmiiVgotr7WAYFJE", "TBv1Ih1UUm000Zp3KSd8PMLF2uMFBpSk", "SYlNiiXgaMsNCcAbu", "5Eyk2D6YZF50L"};
    public final C1649Qr A01 = new C1649Qr();
    public boolean A00 = false;

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{-73, -69, -123, -88, -41, -54, -58, -39, -54, -69, -50, -54, -36, -122, -118, 84, -125, -94, 118, -99, -94, -104, -118, -99, -103, -85};
    }

    public abstract int A0B();

    public abstract VH A0F(ViewGroup viewGroup, int i2);

    public abstract void A0K(VH vh, int i2);

    static {
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    private final void A0A(VH holder, int i2, List<Object> payloads) {
        A0K(holder, i2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final int A0C(int i2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final long A0D(int i2) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final VH A0E(ViewGroup viewGroup, int i2) {
        P4.A01(A08(0, 13, 100));
        VH vh = (VH) A0F(viewGroup, i2);
        vh.A00 = i2;
        P4.A00();
        return vh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0G() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0H(AbstractC1650Qs abstractC1650Qs) {
        this.A01.registerObserver(abstractC1650Qs);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0I(AbstractC1650Qs abstractC1650Qs) {
        this.A01.unregisterObserver(abstractC1650Qs);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0J(VH vh, int i2) {
        vh.A03 = i2;
        if (A0M()) {
            long jA0D = A0D(i2);
            String[] strArr = A03;
            if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                throw new RuntimeException();
            }
            A03[0] = "nL6OAJIdW8sl7jDyOoO0QwKhwUxIf89k";
            vh.A05 = jA0D;
        }
        vh.A0a(1, 519);
        P4.A01(A08(13, 13, 51));
        A0A(vh, i2, vh.A0R());
        vh.A0T();
        ViewGroup.LayoutParams layoutParams = vh.A0H.getLayoutParams();
        if (layoutParams instanceof R3) {
            ((R3) layoutParams).A01 = true;
        }
        P4.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public void A0L(C7M c7m) {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final boolean A0M() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final boolean A0N(VH holder) {
        return false;
    }
}
