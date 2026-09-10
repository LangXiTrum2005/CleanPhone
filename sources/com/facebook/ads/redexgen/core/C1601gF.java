package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1601gF extends AbstractC0723Ft implements CJ {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC1984md A00;
    public final CL A01;
    public final DR A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{64, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public C1601gF(C0727Fx c0727Fx, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        super(c0727Fx, true);
        this.A02 = c0727Fx.A0C();
        this.A00 = c0727Fx.A04();
        RelativeLayout relativeLayout = new RelativeLayout(c0727Fx.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        D3.A0P(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c0727Fx.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        D3.A0I(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC0723Ft.A07, 0, AbstractC0723Ft.A07, AbstractC0723Ft.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams4.setMargins(z ? AbstractC0723Ft.A07 : 0, z ? 0 : AbstractC0723Ft.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        this.A01 = CL.A01(c0727Fx.A05(), this.A00, this);
        CK ckA0A = this.A01.A0A(this.A00);
        c0727Fx.A05().A0H().A00(ckA0A.A01);
        if (c0727Fx.A0F() && !z) {
            C0757Hb c0757Hb = new C0757Hb(c0727Fx.A05());
            c0757Hb.setPageDetails(c0727Fx.A04().A1e());
            int iA05 = this.A06.A04().A1a().A00().A05(true);
            c0757Hb.A02(iA05, iA05);
            D3.A0E(PointerIconCompat.TYPE_CROSSHAIR, c0757Hb);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, AbstractC0723Ft.A07, 0, 0);
            linearLayout.addView(c0757Hb, layoutParams6);
            if (C05789m.A17(c0727Fx.A05())) {
                c0757Hb.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0B(c0727Fx.A04(), c0727Fx.A0B());
        View viewA02 = c0727Fx.A02();
        if (viewA02 != null && (ckA0A.A00 || C05789m.A1G(getAdContextWrapper()))) {
            if (z) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c0727Fx.A05());
            frameLayout.addView(viewA02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (ckA0A.A00) {
                viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Fr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A1A(view);
                    }
                });
            } else {
                FE.A00(viewA02, C05789m.A1H(getAdContextWrapper()), new ViewOnClickListenerC0722Fs(this));
            }
        } else if (viewA02 != null) {
            addView(viewA02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (C05789m.A16(c0727Fx.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0727Fx.A0B() != null) {
                c0727Fx.A0B().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A0z() {
        super.A0z();
        this.A01.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A14(C2T c2t, String str, double d, Bundle bundle) {
        super.A14(c2t, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final boolean A17() {
        return true;
    }

    public final /* synthetic */ void A1A(View view) {
        getCtaButton().A0A(A00(0, 5, 103));
    }

    @Override // com.facebook.ads.redexgen.core.CJ
    public final void ADz() {
        this.A02.A4Z(this.A00.A0e());
    }
}
