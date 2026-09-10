package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1240Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2916rY A00;
    public InterfaceC2904rI A01;
    public C2892r5 A02;
    public final InterfaceC2905rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2904rI A03 = new C1241Ap(this);

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C1240Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2916rY interfaceC2916rY, InterfaceC2905rJ interfaceC2905rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2916rY;
        this.A04 = interfaceC2905rJ;
    }

    public static C1240Ao A01() {
        return new C1240Ao(new ViewpointQeConfig(), new C1243Ar(), null);
    }

    private void A05(AbstractC2907rL abstractC2907rL, InterfaceC2912rQ interfaceC2912rQ, InterfaceC1238Al interfaceC1238Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2892r5.A01(this.A05, abstractC2907rL, interfaceC2912rQ, interfaceC1238Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2913rU c2913rU) {
        C2892r5 c2892r5 = this.A02;
        if (c2892r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2913rU != null) {
                c2892r5.A07(dspViewableNode, c2913rU);
            } else {
                c2892r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2913rU c2913rU, C2909rN c2909rN) {
        C2892r5 c2892r5 = this.A02;
        if (c2892r5 != null && dspViewableNode != null && c2909rN != null) {
            if (this.A05.A00 && c2913rU != null) {
                c2909rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2909rN.A08 + c2913rU;
                c2892r5.A08(dspViewableNode, c2913rU, c2909rN);
            } else {
                c2892r5.A09(dspViewableNode, c2909rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2909rN<?, ?> c2909rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2909rN);
    }

    public final void A0A(AbstractC2907rL abstractC2907rL, View view) {
        if (abstractC2907rL != null && view != null) {
            A05(abstractC2907rL, new C1242Aq(view, this.A00), new C10321u(null), null);
        }
    }
}
