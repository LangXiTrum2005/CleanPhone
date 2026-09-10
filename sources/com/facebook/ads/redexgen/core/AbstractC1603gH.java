package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1603gH extends AbstractC0723Ft implements CJ {
    public static byte[] A0A;
    public static String[] A0B = {"OqBcBxPX2ZziMc2IT6MCTLtQAfN", "zbHyi1ztTRv4YAmmT0P0cBLwkAbgbibY", "SGCBgG4YDDdHsd7wreTLkUhlfmq", "6SoBxKZAX5xZewPuDXqUB5F5Zi6ZkxRk", "Ec2XCBDA1LqSXAKcLbhR3N0Z6X2H9u1y", "7uWZE4LuLIesc8VJARyN", "MrB", "uRKWJ0Ox"};
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public C1604gI A00;
    public C1318be A01;
    public C1277aw A02;
    public C1273as A03;
    public final AbstractC1984md A04;
    public final C2T A05;
    public final DR A06;
    public final FH A07;
    public final CL A08;
    public final AtomicBoolean A09;

    public static String A0L(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0A = new byte[]{-53, -41, -43, -106, -50, -55, -53, -51, -54, -41, -41, -45, -106, -55, -52, -37, -106, -47, -42, -36, -51, -38, -37, -36, -47, -36, -47, -55, -44, -106, -53, -44, -47, -53, -45, -51, -52, 75, 62, 80, 58, 75, 61, 62, 61, 56, 79, 66, 61, 62, 72};
    }

    public abstract FH A1B(C0727Fx c0727Fx, C2T c2t, String str);

    static {
        A0M();
        A0H = (int) (CP.A02 * 48.0f);
        A0G = (int) (CP.A02 * 80.0f);
        A0F = (int) (CP.A02 * 128.0f);
        A0M = (int) (CP.A02 * 16.0f);
        A0C = (int) (CP.A02 * 4.0f);
        A0K = (int) (CP.A02 * 44.0f);
        A0L = (int) (CP.A03 * 32.0f);
        A0I = (int) (CP.A02 * 8.0f);
        A0J = (int) (CP.A02 * 12.0f);
        A0O = (int) (CP.A02 * 12.0f);
        A0N = (int) (CP.A02 * 26.0f);
        A0D = AnonymousClass43.A02(-1, 77);
        A0E = AnonymousClass43.A02(A0D, 90);
    }

    public AbstractC1603gH(C0727Fx c0727Fx, boolean z) {
        super(c0727Fx, z);
        this.A09 = new AtomicBoolean(false);
        this.A04 = c0727Fx.A04();
        this.A08 = CL.A01(c0727Fx.A05(), this.A04, this);
        this.A05 = this.A04.A1b();
        this.A07 = A0J(c0727Fx);
        if (this.A04.A1P()) {
            this.A07.setVisibility(8);
        }
        if (this.A04.A1P() && !getAdDataBundle().A1b().A0I().A03()) {
            this.A00 = A0K(c0727Fx);
        }
        DQ dqA0B = c0727Fx.A0B();
        this.A06 = c0727Fx.A0C();
        if (dqA0B != null) {
            dqA0B.setLayoutParams(new RelativeLayout.LayoutParams(-1, dqA0B.getToolbarHeight()));
            dqA0B.setPageDetailsVisible(false);
        }
    }

    private FH A0J(C0727Fx c0727Fx) {
        String clickEvent;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.A04.A1P()) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.addRule(12);
        if (c0727Fx.A04().A0i().equals(A0L(37, 14, EnumC4719u30.JSON_ENCODE_ERROR_VALUE))) {
            clickEvent = IV.A04.A03();
        } else {
            clickEvent = A0L(0, 37, 6);
        }
        FH fhA1B = A1B(c0727Fx, this.A05, clickEvent);
        fhA1B.getCTAButton().getCtaActionHelper().A04(this.A04);
        fhA1B.getCTAButton().setCreativeAsCtaLoggingHelper(this.A08);
        this.A03 = new C1273as(fhA1B, 400, 100, 0);
        D3.A0I(fhA1B);
        fhA1B.A0D(c0727Fx.A00());
        if (C05789m.A16(c0727Fx.A05())) {
            fhA1B.A0N();
            if (c0727Fx.A0B() != null) {
                c0727Fx.A0B().setCTAClickListener(getCtaButton());
            }
        }
        addView(fhA1B, layoutParams);
        fhA1B.getCTAButton().A0B(this.A04, c0727Fx.A0B());
        return fhA1B;
    }

    private C1604gI A0K(C0727Fx c0727Fx) {
        String strA0L;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c0727Fx.A04().A0i().equals(A0L(37, 14, EnumC4719u30.JSON_ENCODE_ERROR_VALUE))) {
            IV iv = IV.A04;
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0B[6] = "";
            strA0L = iv.A03();
        } else {
            strA0L = A0L(0, 37, 6);
        }
        C1604gI c1604gIA1C = A1C(c0727Fx, this.A05, strA0L);
        if (c1604gIA1C == null) {
            return null;
        }
        c1604gIA1C.getCTAButton().getCtaActionHelper().A04(this.A04);
        c1604gIA1C.getCTAButton().setCreativeAsCtaLoggingHelper(this.A08);
        D3.A0I(c1604gIA1C);
        c1604gIA1C.A0D(c0727Fx.A00());
        if (C05789m.A16(c0727Fx.A05())) {
            c1604gIA1C.A0N();
            if (c0727Fx.A0B() != null) {
                c0727Fx.A0B().setCTAClickListener(getCtaButton());
            }
            if (c0727Fx.A0A() != null) {
                c0727Fx.A0A().setCTAClickListener(getCtaButton());
            }
        }
        c1604gIA1C.setLayoutParams(layoutParams);
        c1604gIA1C.getCTAButton().A0B(this.A04, c0727Fx.A0B());
        return c1604gIA1C;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public void A0z() {
        super.A0z();
        if (this.A04 != null && this.A04.A1b().A0J() != null) {
            CC.A06(super.A06.A05().A02(), this.A04.A1b().A0J());
        }
        this.A08.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public void A14(C2T c2t, String str, double d, Bundle bundle) {
        super.A14(c2t, str, d, bundle);
        this.A07.setInfo(c2t.A0G(), c2t.A0H(), str, this.A04.A1e().A01(), super.A06.A08(), null);
        if (this.A00 != null) {
            this.A00.setInfo(c2t.A0G(), c2t.A0H(), str, this.A04.A1e().A01(), super.A06.A08(), null);
        }
    }

    public final int A1A(DQ dq) {
        return dq == null ? DQ.A00 : dq.getToolbarHeight();
    }

    public C1604gI A1C(C0727Fx c0727Fx, C2T c2t, String str) {
        return null;
    }

    public void A1D() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A01 = new C1318be(true);
            if (this.A02 != null) {
                this.A01.A0I(this.A02);
            }
            C03912c c03912cA01 = this.A04.A1a().A01();
            this.A01.A0I(new C1274at(getAdDetailsView().getCTAButton(), 300, -1, c03912cA01.A0A(true)));
            Drawable drawableA08 = D3.A08(A0D, A0E, A0C);
            Drawable startDrawable = D3.A05(c03912cA01.A09(true), A0C);
            this.A01.A0I(new C1278ax(getAdDetailsView().getCTAButton(), 300, drawableA08, startDrawable));
            this.A01.A0I(new C1276av(expandableLayout, Input.Keys.NUMPAD_6, false));
            this.A01.A0H(2300);
        }
    }

    public final void A1E() {
        LinearLayout linearLayout = new LinearLayout(super.A06.A05());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A06.A05());
        textView.setText(super.A06.A04().A0m());
        textView.setTextColor(-1);
        D3.A0W(textView, false, 15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0M, A0M, A0M, A0M);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        FZ fz = new FZ(super.A06.A05(), 0, -13524404, DB.REWARD_GRANTED_ICON);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0H, A0H);
        layoutParams3.gravity = 17;
        fz.setLayoutParams(layoutParams3);
        linearLayout.addView(fz);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    @Override // com.facebook.ads.redexgen.core.CJ
    public final void ADz() {
        this.A06.A4Z(getAdDataBundle().A0e());
    }

    public AbstractC1984md getAdDataBundle() {
        return this.A04;
    }

    public C1273as getAdDetailsAnimation() {
        return this.A03;
    }

    public FH getAdDetailsView() {
        return this.A07;
    }

    public C2T getAdInfo() {
        return this.A05;
    }

    public C1318be getAnimationPlugin() {
        return this.A01;
    }

    public FH getOldEndCardAdDetailsView() {
        if (this.A00 != null && this.A04.A1P() && !this.A04.A1b().A0I().A03()) {
            this.A00.A0O();
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A09.get() && (this.A04.A1b().A0I().A02().isEmpty() || this.A04.A1b().A0I().A03())) {
            return;
        }
        getAdDetailsView().A0D(configuration.orientation);
        String[] strArr = A0B;
        if (strArr[3].charAt(7) != strArr[4].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[0] = "yy7bYtXAKmoLCul9ezytk2ncpxp";
        strArr2[2] = "iJozGp5bZVIfDWEHEz9R1IbY1K5";
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null && z && this.A02 == null) {
            this.A02 = new C1277aw(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A01.A0I(this.A02);
            this.A01.A0G();
        }
    }
}
