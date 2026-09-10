package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0703Ez extends RelativeLayout {
    public static DR A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC1875km A00;
    public C1828k1 A01;
    public C0W A02;
    public C1650h3 A03;
    public C0708Fe A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, cw.m, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (CP.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (CP.A02 * 15.0f);
        A05 = new C1643gw();
    }

    public C0703Ez(C1828k1 c1828k1) {
        super(c1828k1);
        this.A01 = c1828k1;
        this.A02 = new C0W(c1828k1);
        D3.A0I(this.A02);
        this.A00 = new MK();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C0758Hc> A01(AbstractC1984md abstractC1984md) {
        if (abstractC1984md == null) {
            return new ArrayList<>();
        }
        List<C2T> listA1i = abstractC1984md.A1i();
        ArrayList<C0758Hc> arrayList = new ArrayList<>(listA1i.size());
        for (int i = 0; i < listA1i.size(); i++) {
            arrayList.add(new C0758Hc(i, listA1i.size(), listA1i.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C1744ie c1744ie, int i) {
        ArrayList<C0758Hc> arrayListA01 = A01(c1744ie.A10());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new C1650h3(this.A01, arrayListA01, c1744ie.A10(), this.A01.A02().A0A(), c1744ie, A05, c1744ie.A10().A1g(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = CP.A04.widthPixels;
        }
        this.A03.A0G(i - A07, 16, 0);
        this.A03.A06();
        setupDotsLayout(c1744ie, arrayListA01);
    }

    public final void A06(JL jl) {
        if (this.A03 != null) {
            this.A03.A0H(jl);
        } else {
            this.A01.A08().AAu(A00(51, 7, 24), AbstractC05418a.A1v, new C05428b(A00(0, 51, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE)));
        }
        this.A02.A20(jl);
    }

    public static DR getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0G((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(C1744ie c1744ie, ArrayList<C0758Hc> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1640gt(this));
        this.A04 = new C0708Fe(this.A01, c1744ie.A10().A1a().A01(), arrayList.size());
        D3.A0I(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
