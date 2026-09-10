package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1775aw extends RelativeLayout {
    public static InterfaceC1672Yh A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC2179hU A00;
    public C2131gi A01;
    public C0w A02;
    public M1 A03;
    public C1824bj A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, RemoteControlWriter.BLOCK_CMDOK, 51, 46, 52, 50, 36, 45, 97, 15, RemoteControlWriter.BLOCK_CMDOK, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, RemoteControlWriter.BLOCK_CMDOK, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, RemoteControlWriter.BLOCK_CMDOK, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = XV.A0v;
        A07 = A08 * 10;
        A09 = (int) (XX.A02 * 15.0f);
        A05 = new C1359Lv();
    }

    public C1775aw(C2131gi c2131gi) {
        super(c2131gi);
        this.A01 = c2131gi;
        this.A02 = new C0w(c2131gi);
        YB.A0K(this.A02);
        this.A00 = new C7N();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C1969e5> A01(AbstractC2296jd abstractC2296jd) {
        if (abstractC2296jd == null) {
            return new ArrayList<>();
        }
        List<NR> listA2G = abstractC2296jd.A2G();
        ArrayList<C1969e5> arrayList = new ArrayList<>(listA2G.size());
        for (int i = 0; i < listA2G.size(); i++) {
            arrayList.add(new C1969e5(i, listA2G.size(), listA2G.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(UK uk, int i) {
        ArrayList<C1969e5> arrayListA01 = A01(uk.A13());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new M1(this.A01, arrayListA01, uk.A13(), this.A01.A02().A0A(), uk, A05, uk.A13().A2E(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = XX.A04.widthPixels;
        }
        this.A03.A0O(i - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(uk, arrayListA01);
    }

    public final void A06(C2076fp c2076fp) {
        if (this.A03 != null) {
            this.A03.A0P(c2076fp);
        } else {
            this.A01.A08().ABC(A00(51, 7, 24), AbstractC1543Td.A1v, new C1544Te(A00(0, 51, 125)));
        }
        this.A02.A20(c2076fp);
    }

    public static InterfaceC1672Yh getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0O((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(UK uk, ArrayList<C1969e5> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1356Ls(this));
        this.A04 = new C1824bj(this.A01, uk.A13().A28().A01(), arrayList.size());
        YB.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
