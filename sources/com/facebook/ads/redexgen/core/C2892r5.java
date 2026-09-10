package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2892r5 {
    public static C2892r5 A03;
    public static InterfaceC2915rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2902rF A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C2892r5(ViewpointQeConfig viewpointQeConfig, AbstractC2907rL abstractC2907rL, C2902rF c2902rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2902rF;
        abstractC2907rL.A03(new C1237Aj(c2902rF));
    }

    public static ScanDelayController A00(int i2) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2892r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2907rL abstractC2907rL, InterfaceC2912rQ interfaceC2912rQ, InterfaceC1238Al interfaceC1238Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2892r5 c2892r5 = A03;
        if (c2892r5 != null) {
            return c2892r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2892r5(viewpointQeConfig, abstractC2907rL, new C2902rF(viewpointQeConfig, interfaceC2912rQ, ck, interfaceC1238Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2906rK interfaceC2906rK) {
        this.A02.A0H(interfaceC2906rK);
    }

    public final void A05(InterfaceC2904rI interfaceC2904rI) {
        this.A02.A0I(interfaceC2904rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2913rU c2913rU) {
        if (this.A00.A00 && c2913rU != null) {
            this.A01.A06(dspViewableNode, c2913rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2913rU c2913rU, C2909rN c2909rN) {
        if (this.A00.A00 && c2913rU != null) {
            this.A01.A07(dspViewableNode, c2913rU, c2909rN);
        } else {
            this.A01.A08(dspViewableNode, c2909rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2909rN c2909rN) {
        A08(dspViewableNode, null, c2909rN);
    }
}
