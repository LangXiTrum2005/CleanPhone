package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.umeng.analytics.pro.cw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0842Ki extends AbstractC1690hh {
    public static byte[] A0F;
    public static String[] A0G = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC1984md A03;
    public C05357t A04;
    public C03701h A05;
    public C0708Fe A06;
    public C1420dI A07;
    public JK A08;
    public JL A09;
    public String A0A;
    public List<C0758Hc> A0B;
    public boolean A0C;
    public final C1828k1 A0D;
    public final C0647Cv A0E;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, 18, 5, 23, 1, 18, 4, 5, 4, 54, 9, 4, 5, cw.m, 33, 4, 36, 1, 20, 1, 34, 21, cw.l, 4, 12, 5, 118, 110, 108, 117};
    }

    static {
        A0C();
        A0H = (int) (CP.A02 * 48.0f);
        A0I = (int) (CP.A02 * 8.0f);
        A0J = (int) (CP.A02 * 8.0f);
        A0L = (int) (CP.A02 * 56.0f);
        A0K = (int) (CP.A02 * 12.0f);
    }

    public C0842Ki(C1828k1 c1828k1, A7 a7, C05357t c05357t, DR dr, C0898Mu c0898Mu) {
        super(c1828k1, a7, dr, c0898Mu);
        this.A0E = new C0647Cv();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new I7(c1828k1, new C1664hH(), super.A0A.A0s(), dr);
        this.A04 = c05357t;
        this.A0D = c1828k1;
    }

    public C0842Ki(C1828k1 c1828k1, A7 a7, C05357t c05357t, DR dr, C0900Mw c0900Mw) {
        super(c1828k1, a7, dr, c0900Mw);
        this.A0E = new C0647Cv();
        this.A0C = false;
        this.A04 = c05357t;
        this.A0D = c1828k1;
    }

    private AbstractC1984md A00(Intent intent) {
        if (super.A07) {
            return (AbstractC1984md) intent.getSerializableExtra(A0A(14, 25, 103));
        }
        return (AbstractC1984md) intent.getSerializableExtra(A0A(0, 14, 36));
    }

    private final void A0D() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0G[3].charAt(5) != 'n') {
                throw new RuntimeException();
            }
            A0G[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1S();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0E(int i, Bundle bundle) {
        int extraSpacing;
        int i2;
        int height;
        this.A02 = new LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i3 = CP.A04.widthPixels;
        int i4 = CP.A04.heightPixels;
        if (i == 1) {
            extraSpacing = Math.min(i3 - (A0I * 4), i4 / 2);
            i2 = (i3 - extraSpacing) / 8;
            height = i2 * 4;
        } else {
            extraSpacing = i4 - ((A0L + A0H) + (A0I * 4));
            i2 = A0I;
            height = i2 * 2;
        }
        this.A08 = new C1406d4(this);
        this.A09 = new JL(this, 1, new WeakReference(this.A08), this.A0D);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new C03701h(this.A0D);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C1420dI(this.A05, i, this.A0B, this.A09, bundle);
        int extraSpacing2 = i2;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new C1409d7(this.A0D, this.A0B, this.A03, super.A0C, this.A04, this.A09, this.A0E, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i, this.A07, super.A0E));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i == 1) {
            A0G(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (C05789m.A1s(this.A0D)) {
            this.A0D.A0B().AJs(this.A05, super.A0A.A1g(), false);
        }
        A0Y(this.A02, false, i);
    }

    private void A0F(AbstractC1984md abstractC1984md) {
        this.A03 = abstractC1984md;
        this.A0A = this.A03.A1g();
        this.A00 = this.A03.A0U();
        this.A01 = this.A03.A0V();
        List<C2T> listA1i = this.A03.A1i();
        List<AdInfo> adInfoList = new ArrayList<>(listA1i.size());
        this.A0B = adInfoList;
        for (int i = 0; i < listA1i.size(); i++) {
            C2T c2t = listA1i.get(i);
            List<C0758Hc> list = this.A0B;
            int i2 = listA1i.size();
            list.add(new C0758Hc(i, i2, c2t));
        }
    }

    private void A0G(C1420dI c1420dI) {
        new MK().A0G(this.A05);
        c1420dI.A0Y(new C1399cx(this));
        this.A06 = new C0708Fe(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(String str) {
        if (this.A05 == null) {
            return;
        }
        C6K c6kA1G = this.A05.A1G(this.A05.getLayoutManager().A23());
        if (A0G[2].charAt(16) == '1') {
            throw new RuntimeException();
        }
        A0G[2] = "PJpLO9ZPfAu4XWIQIVwsvf9AUacIaZ99";
        C1384ci c1384ci = (C1384ci) c6kA1G;
        if (c1384ci != null && c1384ci.A0j() != null) {
            c1384ci.A0j().A0A(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1690hh
    public final void A0W() {
        A0J(A0A(39, 4, 2));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1690hh
    public final boolean A0e() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AAj(Intent intent, Bundle bundle, C04946e c04946e) {
        AbstractC1984md dataBundle = A00(intent);
        A0Z(c04946e);
        A0F(dataBundle);
        A0E(c04946e.A05().getResources().getConfiguration().orientation, bundle);
        c04946e.A0A(new C1389cn(this, c04946e));
        AbstractC1984md dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A1b().A0F().A04();
        if (super.A07) {
            AbstractC1984md dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A1b().A0F().A03();
        }
        if (unskippableSec > 0) {
            A0X(unskippableSec);
        }
        AbstractC1984md dataBundle4 = super.A0A;
        if (dataBundle4.A1b().A0F().A02() >= 0) {
            super.A0E.setToolbarActionMode(8);
        }
        AbstractC1984md dataBundle5 = super.A0A;
        if (dataBundle5.A1p()) {
            super.A0E.setOnClickListener(new ViewOnClickListenerC0761Hf(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1690hh, com.facebook.ads.redexgen.core.DS
    public final void AEP(boolean z) {
        super.AEP(z);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1690hh, com.facebook.ads.redexgen.core.DS
    public final void AEs(boolean z) {
        super.AEs(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AI1(Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1690hh
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1690hh, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AI1(bundle);
        A0D();
        A0E(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1690hh, com.facebook.ads.redexgen.core.DS
    public final void onDestroy() {
        super.onDestroy();
        if (C05789m.A1s(this.A0D)) {
            this.A0D.A0B().AJZ(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.AAr(this.A0A, new FB().A03(this.A09).A02(this.A0E).A05());
        }
        A0D();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
