package com.facebook.ads.redexgen.core;

import android.view.View;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1071Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2747rY A00;
    public InterfaceC2735rI A01;
    public C2723r5 A02;
    public final InterfaceC2736rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2735rI A03 = new C1072Ap(this);

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
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

    public C1071Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2747rY interfaceC2747rY, InterfaceC2736rJ interfaceC2736rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2747rY;
        this.A04 = interfaceC2736rJ;
    }

    public static C1071Ao A01() {
        return new C1071Ao(new ViewpointQeConfig(), new C1074Ar(), null);
    }

    private void A05(AbstractC2738rL abstractC2738rL, InterfaceC2743rQ interfaceC2743rQ, InterfaceC1069Al interfaceC1069Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2723r5.A01(this.A05, abstractC2738rL, interfaceC2743rQ, interfaceC1069Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2744rU c2744rU) {
        C2723r5 c2723r5 = this.A02;
        if (c2723r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2744rU != null) {
                c2723r5.A07(dspViewableNode, c2744rU);
            } else {
                c2723r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2744rU c2744rU, C2740rN c2740rN) {
        C2723r5 c2723r5 = this.A02;
        if (c2723r5 != null && dspViewableNode != null && c2740rN != null) {
            if (this.A05.A00 && c2744rU != null) {
                c2740rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2740rN.A08 + c2744rU;
                c2723r5.A08(dspViewableNode, c2744rU, c2740rN);
            } else {
                c2723r5.A09(dspViewableNode, c2740rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2740rN<?, ?> c2740rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2740rN);
    }

    public final void A0A(AbstractC2738rL abstractC2738rL, View view) {
        if (abstractC2738rL != null && view != null) {
            A05(abstractC2738rL, new C1073Aq(view, this.A00), new C08631u(null), null);
        }
    }
}
