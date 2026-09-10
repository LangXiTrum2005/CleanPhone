package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2733rF {
    public static byte[] A0H;
    public static String[] A0I = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public InterfaceC2735rI A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC2187hc A05;
    public final ScanDelayController A06;
    public final ViewpointAutoOcclusion A07;
    public final InterfaceC2743rQ A08;
    public final ViewpointQeConfig A09;
    public final ViewpointRegistry A0A;
    public final InterfaceC1069Al A0B;
    public final Runnable A0C;
    public final List<Rect> A0D;
    public final List<DspViewableNode> A0E;
    public final List<C2740rN<?, ?>> A0F;
    public final List<Rect> A0G;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        String[] strArr = A0I;
        if (strArr[2].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        A0I[3] = "afzSeuF2JzxaSSSWQ";
        A0H = new byte[]{-65, -55, -91, -71, -71, -62, -53, -70, -69, -70, -53, -66, -52, -66, -51, -55, -60, -72, -75, -56, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0A(DspViewableNode dspViewableNode, C2740rN<?, ?> c2740rN) {
        Iterator<Rect> it = this.A0D.iterator();
        while (it.hasNext()) {
            if (dspViewableNode.A9Y(this.A03, this.A02, it.next()) && c2740rN != C2740rN.A0B) {
                if (A0I[0].charAt(13) == 'n') {
                    throw new RuntimeException();
                }
                String[] strArr = A0I;
                strArr[6] = "ovGzBU7jFj6BmSvOwlnDuwIQ8kdYWcjX";
                strArr[4] = "9Q0zz3j3tYyfuWL6OVNzyvBOA9tkBax5";
                if (0 != 0) {
                    throw new NullPointerException(A05(0, 10, 66));
                }
                this.A0B.A46(c2740rN, this.A03, this.A02, this.A09.A01);
            }
        }
    }

    static {
        A06();
    }

    public C2733rF(ViewpointQeConfig viewpointQeConfig, InterfaceC2743rQ interfaceC2743rQ, InterfaceC2187hc interfaceC2187hc, InterfaceC1069Al interfaceC1069Al, ViewpointRegistry viewpointRegistry, ViewpointAutoOcclusion viewpointAutoOcclusion, Handler handler, ScanDelayController scanDelayController) {
        this(viewpointQeConfig, interfaceC2743rQ, interfaceC2187hc, interfaceC1069Al, viewpointRegistry, viewpointAutoOcclusion, handler, scanDelayController, 100);
    }

    public C2733rF(ViewpointQeConfig viewpointQeConfig, InterfaceC2743rQ interfaceC2743rQ, InterfaceC2187hc interfaceC2187hc, InterfaceC1069Al interfaceC1069Al, ViewpointRegistry viewpointRegistry, ViewpointAutoOcclusion viewpointAutoOcclusion, Handler handler, ScanDelayController scanDelayController, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0G = new ArrayList();
        this.A0E = new ArrayList();
        this.A0F = new ArrayList();
        this.A0D = new ArrayList();
        this.A01 = false;
        this.A09 = viewpointQeConfig;
        this.A08 = interfaceC2743rQ;
        this.A05 = interfaceC2187hc;
        this.A0B = interfaceC1069Al;
        this.A0A = viewpointRegistry;
        this.A07 = viewpointAutoOcclusion;
        this.A04 = handler;
        this.A06 = scanDelayController;
        this.A0C = new RunnableC2734rG(this, i, new Exception());
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

    public static /* synthetic */ ScanDelayController A03(C2733rF c2733rF) {
        return null;
    }

    private void A07(long j) {
        if (this.A0E.isEmpty()) {
            this.A08.A9Z(this.A0D);
            this.A0B.A4h(j, this.A0D);
            this.A0B.A6P(null);
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (0 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        throw new java.lang.NullPointerException(A05(15, 6, 64));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        if (0 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        r4.A0E.clear();
        r4.A0F.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A08(long r5) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2733rF.A08(long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B() {
        Context context = this.A08.A7U();
        if (context == null) {
            return true;
        }
        Activity activityA00 = A00(context);
        if (activityA00 != null) {
            boolean zIsDestroyed = activityA00.isDestroyed();
            if (A0I[3].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[2] = "bz230dZZFwB5VtBTUF6Wd1FYETvWTo5q";
            strArr[5] = "SaD2YYriklneEcKSamPXZGVrEiYqxj4X";
            if (zIsDestroyed) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ C2718qq A0E(DspViewableNode dspViewableNode, C2740rN c2740rN) {
        A0A(dspViewableNode, c2740rN);
        return null;
    }

    public final void A0F() {
        if (this.A00 != null) {
            this.A00.AFq();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0C);
            A07(this.A05.ACf());
        }
        this.A01 = false;
    }

    public final void A0G() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A0C);
            if (0 != 0) {
                throw new NullPointerException(A05(10, 5, 69));
            }
        }
    }

    public final void A0H(InterfaceC2737rK interfaceC2737rK) {
        this.A0B.AJu(interfaceC2737rK);
    }

    public final void A0I(InterfaceC2735rI interfaceC2735rI) {
        this.A00 = interfaceC2735rI;
    }
}
