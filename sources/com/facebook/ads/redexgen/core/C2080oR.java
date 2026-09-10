package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2080oR {
    public static String[] A0E = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public InterfaceC2082oW A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final L3 A05;
    public final InterfaceC2091of A06;
    public final ViewpointQeConfig A07;
    public final ViewpointRegistry A08;
    public final InterfaceC0909Nh A09;
    public final Runnable A0A;
    public final List<Rect> A0B;
    public final List<DspViewableNode> A0C;
    public final List<C2088oc<?, ?>> A0D;

    public C2080oR(ViewpointQeConfig viewpointQeConfig, InterfaceC2091of interfaceC2091of, L3 l3, InterfaceC0909Nh interfaceC0909Nh, ViewpointRegistry viewpointRegistry, Handler handler) {
        this(viewpointQeConfig, interfaceC2091of, l3, interfaceC0909Nh, viewpointRegistry, handler, 100);
    }

    public C2080oR(ViewpointQeConfig viewpointQeConfig, InterfaceC2091of interfaceC2091of, L3 l3, InterfaceC0909Nh interfaceC0909Nh, ViewpointRegistry viewpointRegistry, Handler handler, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0C = new ArrayList();
        this.A0D = new ArrayList();
        this.A0B = new ArrayList();
        this.A01 = false;
        this.A07 = viewpointQeConfig;
        this.A06 = interfaceC2091of;
        this.A05 = l3;
        this.A09 = interfaceC0909Nh;
        this.A08 = viewpointRegistry;
        this.A04 = handler;
        this.A0A = new RunnableC2081oS(this, i, new Exception());
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private void A04(long j) {
        if (this.A0C.isEmpty()) {
            this.A06.A9P(this.A0B);
            this.A09.A4X(j, this.A0B);
            this.A09.A6F(null);
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(long j) {
        this.A06.A9P(this.A0B);
        this.A09.A4X(j, this.A0B);
        if (this.A0C.isEmpty()) {
            if (this.A0D.isEmpty()) {
                this.A08.A0A(this.A0C, this.A0D);
                for (final DspViewableNode dspViewableNode : this.A0C) {
                    if (this.A07.A00) {
                        this.A08.A09(dspViewableNode, new NT() { // from class: com.facebook.ads.redexgen.X.2w
                            @Override // com.facebook.ads.redexgen.core.NT
                            public final Object AA9(Object obj) {
                                return this.A00.A0B(dspViewableNode, (C2088oc) obj);
                            }
                        });
                    } else {
                        A07(dspViewableNode, this.A08.A04(dspViewableNode));
                    }
                }
                InterfaceC0909Nh interfaceC0909Nh = this.A09;
                String[] strArr = A0E;
                if (strArr[6].charAt(3) == strArr[4].charAt(3)) {
                    String[] strArr2 = A0E;
                    strArr2[2] = "nrcH38GFR0AnNATGilmIDxGLEfq4UsQc";
                    strArr2[5] = "6vipxWZV3AO1VWKwqmDQLGTjEEAJtLqC";
                    interfaceC0909Nh.A6F(this.A0D);
                    if (this.A00 != null) {
                        this.A00.AF0();
                    }
                    this.A0C.clear();
                    if (A0E[0].charAt(13) != 'n') {
                        A0E[0] = "FnmTy5Nmh2EcYtYiSa9Vz9TfA3yApsYC";
                        this.A0D.clear();
                        return;
                    }
                }
                throw new RuntimeException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oc != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    private void A07(DspViewableNode dspViewableNode, C2088oc<?, ?> c2088oc) {
        for (Rect rect : this.A0B) {
            Rect containerRect = this.A03;
            if (dspViewableNode.A9O(containerRect, this.A02, rect) && c2088oc != C2088oc.A0B) {
                InterfaceC0909Nh interfaceC0909Nh = this.A09;
                Rect rect2 = this.A03;
                String[] strArr = A0E;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[6] = "GkBz7jFj6BmSvOwlnDuwIQ8kdYWcjX9Q";
                strArr2[4] = "0Qzzj3tYyfuWL6OVNzyvBOA9tkBax5QR";
                interfaceC0909Nh.A3w(c2088oc, rect2, this.A02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A08() {
        Context context = this.A06.A7K();
        if (context == null) {
            return true;
        }
        Activity activityA00 = A00(context);
        if (activityA00 != null) {
            boolean zIsDestroyed = activityA00.isDestroyed();
            if (A0E[3].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "bz230dZZFwB5VtBTUF6Wd1FYETvWTo5q";
            strArr[5] = "SaD2YYriklneEcKSamPXZGVrEiYqxj4X";
            if (zIsDestroyed) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ C2065o2 A0B(DspViewableNode dspViewableNode, C2088oc c2088oc) {
        A07(dspViewableNode, c2088oc);
        return null;
    }

    public final void A0C() {
        if (this.A00 != null) {
            this.A00.AF0();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0A);
            A04(this.A05.AC0());
        }
        this.A01 = false;
    }

    public final void A0D() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A0A);
        }
    }

    public final void A0E(InterfaceC2085oZ interfaceC2085oZ) {
        this.A09.AJ0(interfaceC2085oZ);
    }

    public final void A0F(InterfaceC2082oW interfaceC2082oW) {
        this.A00 = interfaceC2082oW;
    }
}
