package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1963bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C2300gi A07;
    public final ViewOnClickListenerC1498Kr A08;
    public final C1994bk A09;

    public static String A0h(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i2);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1963bF(C2300gi c2300gi, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr, int i2, C1558Na c1558Na, boolean z2, String str, VA va, InterfaceC1841Yh interfaceC1841Yh, C2245fp c2245fp, Y2 y2, C1564Ng c1564Ng, boolean z3, String str2) {
        super(c2300gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c2300gi;
        this.A04 = i2;
        this.A03 = z3;
        this.A02 = str2;
        this.A09 = new C1994bk(c2300gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z3) {
            this.A00 = new LinearLayout(c2300gi);
            this.A01 = new TextView(c2300gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1498Kr == null) {
            this.A08 = new ViewOnClickListenerC1498Kr(c2300gi, str, c1558Na, z2, va, interfaceC1841Yh, c2245fp, y2, c1564Ng);
        } else {
            this.A08 = viewOnClickListenerC1498Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC2004bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c2300gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z2) {
    }

    public final ViewOnClickListenerC1498Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1560Nc c1560Nc, String str, String str2, InterfaceC1815Xh interfaceC1815Xh, InterfaceC1978bU interfaceC1978bU) {
        this.A08.setCta(c1560Nc, str, new HashMap(), interfaceC1815Xh, interfaceC1978bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i2) {
    }
}
