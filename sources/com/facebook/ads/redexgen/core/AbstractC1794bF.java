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
public abstract class AbstractC1794bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C2131gi A07;
    public final ViewOnClickListenerC1329Kr A08;
    public final C1825bk A09;

    public static String A0h(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1794bF(C2131gi c2131gi, ViewOnClickListenerC1329Kr viewOnClickListenerC1329Kr, int i, C1389Na c1389Na, boolean z, String str, VA va, InterfaceC1672Yh interfaceC1672Yh, C2076fp c2076fp, Y2 y2, C1395Ng c1395Ng, boolean z2, String str2) {
        super(c2131gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c2131gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C1825bk(c2131gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c2131gi);
            this.A01 = new TextView(c2131gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1329Kr == null) {
            this.A08 = new ViewOnClickListenerC1329Kr(c2131gi, str, c1389Na, z, va, interfaceC1672Yh, c2076fp, y2, c1395Ng);
        } else {
            this.A08 = viewOnClickListenerC1329Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1835bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c2131gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final ViewOnClickListenerC1329Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1391Nc c1391Nc, String str, String str2, InterfaceC1646Xh interfaceC1646Xh, InterfaceC1809bU interfaceC1809bU) {
        this.A08.setCta(c1391Nc, str, new HashMap(), interfaceC1646Xh, interfaceC1809bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
