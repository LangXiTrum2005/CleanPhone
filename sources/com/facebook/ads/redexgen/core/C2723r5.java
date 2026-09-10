package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2723r5 {
    public static C2723r5 A03;
    public static InterfaceC2746rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2733rF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 7);
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

    public C2723r5(ViewpointQeConfig viewpointQeConfig, AbstractC2738rL abstractC2738rL, C2733rF c2733rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2733rF;
        abstractC2738rL.A03(new C1068Aj(c2733rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2723r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2738rL abstractC2738rL, InterfaceC2743rQ interfaceC2743rQ, InterfaceC1069Al interfaceC1069Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2723r5 c2723r5 = A03;
        if (c2723r5 != null) {
            return c2723r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2723r5(viewpointQeConfig, abstractC2738rL, new C2733rF(viewpointQeConfig, interfaceC2743rQ, ck, interfaceC1069Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2737rK interfaceC2737rK) {
        this.A02.A0H(interfaceC2737rK);
    }

    public final void A05(InterfaceC2735rI interfaceC2735rI) {
        this.A02.A0I(interfaceC2735rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2744rU c2744rU) {
        if (this.A00.A00 && c2744rU != null) {
            this.A01.A06(dspViewableNode, c2744rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2744rU c2744rU, C2740rN c2740rN) {
        if (this.A00.A00 && c2744rU != null) {
            this.A01.A07(dspViewableNode, c2744rU, c2740rN);
        } else {
            this.A01.A08(dspViewableNode, c2740rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2740rN c2740rN) {
        A08(dspViewableNode, null, c2740rN);
    }
}
