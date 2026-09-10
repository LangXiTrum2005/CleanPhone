package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2070oH {
    public static C2070oH A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2080oR A02;

    public C2070oH(ViewpointQeConfig viewpointQeConfig, AbstractC2086oa abstractC2086oa, C2080oR c2080oR, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2080oR;
        abstractC2086oa.A02(new C0908Nf(c2080oR));
    }

    public static C2070oH A00(ViewpointQeConfig viewpointQeConfig, AbstractC2086oa abstractC2086oa, InterfaceC2091of interfaceC2091of, InterfaceC0909Nh interfaceC0909Nh) {
        C2070oH localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C2070oH(viewpointQeConfig, abstractC2086oa, new C2080oR(viewpointQeConfig, interfaceC2091of, C1231a9.A00, interfaceC0909Nh, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC2085oZ interfaceC2085oZ) {
        this.A02.A0E(interfaceC2085oZ);
    }

    public final void A02(InterfaceC2082oW interfaceC2082oW) {
        this.A02.A0F(interfaceC2082oW);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C2092oi c2092oi) {
        if (this.A00.A00 && c2092oi != null) {
            this.A01.A06(dspViewableNode, c2092oi);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C2092oi c2092oi, C2088oc c2088oc) {
        if (this.A00.A00 && c2092oi != null) {
            this.A01.A07(dspViewableNode, c2092oi, c2088oc);
        } else {
            this.A01.A08(dspViewableNode, c2088oc);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C2088oc c2088oc) {
        A05(dspViewableNode, null, c2088oc);
    }
}
