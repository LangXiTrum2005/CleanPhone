package com.facebook.ads.redexgen.core;

import android.graphics.Rect;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class XM {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C2909rN<C1757Uw, V1> c2909rN) {
        if (c2909rN.A06.A05()) {
            return c2909rN.A07.A07();
        }
        if (!c2909rN.A06.A06()) {
            return true;
        }
        return c2909rN.A07.A06();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    private boolean A01(C2909rN<C1757Uw, V1> c2909rN, InterfaceC2900rD interfaceC2900rD) {
        boolean z2;
        int i2;
        int i3;
        float fA9X = -1.0f;
        try {
            fA9X = interfaceC2900rD.A9X(c2909rN);
        } catch (IllegalStateException unused) {
        }
        if (A02[6].length() == 7) {
            throw new RuntimeException();
        }
        A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
        if (fA9X > 0.0f && A00(c2909rN)) {
            return true;
        }
        if (c2909rN.A06.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c2909rN)) {
            return true;
        }
        interfaceC2900rD.A9W(this.A00);
        if (A02[2].length() != 2) {
            A02[2] = "WH3ZGQ";
            interfaceC2900rD.A8D(c2909rN, this.A01);
            if (this.A00.bottom - this.A00.top > 0) {
                i2 = this.A01.bottom;
                i3 = this.A00.top;
                if (A02[7].length() != 7) {
                    throw new RuntimeException();
                }
                A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
                z2 = i2 - i3 > 0;
            }
            return !z2 && A00(c2909rN);
        }
        interfaceC2900rD.A8D(c2909rN, this.A01);
        if (this.A00.bottom - this.A00.top > 0) {
            i2 = this.A01.bottom;
            i3 = this.A00.top;
            if (A02[7].length() != 7) {
                throw new RuntimeException();
            }
            A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
            if (i2 - i3 > 0) {
            }
        }
        if (z2) {
        }
        if (z2) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C2909rN<C1757Uw, V1> c2909rN, InterfaceC2900rD interfaceC2900rD) {
        if (c2909rN.A07.A04() && A01(c2909rN, interfaceC2900rD)) {
            c2909rN.A07.A01();
            c2909rN.A06.A02().ABx(c2909rN.A06.A03(), c2909rN.A06.A04());
        }
        if (c2909rN.A07.A05() && C1750Up.A1l(c2909rN.A06.A01())) {
            c2909rN.A07.A02();
            c2909rN.A06.A02().ABL(c2909rN.A06.A03(), c2909rN.A06.A04());
        }
    }
}
