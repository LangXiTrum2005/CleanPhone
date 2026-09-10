package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0860La extends AbstractC1622gb {
    public static String[] A00 = {"xFpGP6HPJdxG02oIdF9HxIihRC1N68eF", "SON7b0vH7pU6goQPwxtgPgRIrt0b", "K8DFrhhg1SsjCm4z8vXCiiOaNBIf4pDg", "gTEb8e", "wHRSkCegs17WrS1ZFDoTECKCsF5cwC3Q", "MW7m9Sx4Y", "aUUm4uG1aRzEZg1qhLXNvnDll0TBP1yk", "rrQmUhcDQBY8PjMlrfgiyZrhPVfY"};
    public static final int A02 = (int) (CP.A02 * 152.0f);
    public static final int A01 = (int) (CP.A02 * 60.0f);

    public C0860La(C1828k1 c1828k1, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, int i, C03912c c03912c, String str, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, AbstractC1984md abstractC1984md, C1283b5 c1283b5, AF af) {
        super(c1828k1, viewOnClickListenerC1617gW, i, c03912c, false, str, a7, dr, jl, c0647Cv, abstractC1984md, c1283b5, af);
        int i2 = getResources().getConfiguration().orientation;
        A02(i2);
        setAdDetailsLayoutBackground(i2);
        setIconImageParam(i2);
        setCTALayoutParam(i2);
        setTitleViewParams(i2);
        setProgressBarParam(i2);
        D3.A0I(this.A0K);
        if (i2 == 1) {
            setDescriptionViewParams(i2);
        }
        setRewardTextParam(i2);
        A01(i2);
        setAdReportingView(i2);
        this.A0J.addView(this.A0G);
        this.A0J.addView(this.A0H);
        addView(this.A0J);
    }

    private void A01(int i) {
        if (i == 1) {
            if (((AbstractC1622gb) this).A03 != null && ((AbstractC1622gb) this).A03.getVisibility() == 0) {
                this.A0J.addView(((AbstractC1622gb) this).A03);
            }
            this.A0J.addView(this.A0P);
            this.A0J.addView(((FH) this).A08);
            return;
        }
        this.A0I.addView(((FH) this).A09);
        this.A0I.addView(this.A0L);
        this.A0I.addView(((FH) this).A08);
        this.A0H.addView(this.A0I);
        this.A0H.addView(this.A0P);
        if (((AbstractC1622gb) this).A03 == null || ((AbstractC1622gb) this).A03.getVisibility() != 0) {
            return;
        }
        this.A0H.addView(((AbstractC1622gb) this).A03);
    }

    private void A02(int i) {
        if (i == 2) {
            ((AbstractC1622gb) this).A04 = new C1273as(this.A0H, 400, 100, 0);
            this.A0R.set(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0D(int i) {
        D3.A0Z(this.A0I, ((FH) this).A09, this.A0L, ((FH) this).A08, this.A0P, ((AbstractC1622gb) this).A03, this.A0K);
        setAdDetailsLayoutBackground(i);
        setAdReportingView(i);
        setRewardTextParam(i);
        setProgressBarParam(i);
        setCTALayoutParam(i);
        setIconImageParam(i);
        setTitleViewParams(i);
        setDescriptionViewParams(i);
        A01(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1622gb
    public final void A0S(int i) {
        if (((AbstractC1622gb) this).A04 != null && i == 2) {
            ((AbstractC1622gb) this).A04.A40(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1622gb
    public final void A0U(C1361cL c1361cL, int i) {
        if (i == 1 && c1361cL != null && c1361cL.getVideoView() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FH) this).A09.getLayoutParams();
            layoutParams.addRule(3, c1361cL.getVideoView().getId());
            ((FH) this).A09.setLayoutParams(layoutParams);
            c1361cL.addView(((FH) this).A09);
            c1361cL.addView(this.A0L);
            c1361cL.addView(this.A0K);
        }
    }

    private void setAdDetailsLayoutBackground(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0H.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, AbstractC1622gb.A0a);
        if (i == 1) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            A0T(this.A0H, 0, null);
        } else {
            layoutParams.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.4f);
            layoutParams.height = -2;
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            this.A0H.setPadding(AbstractC1622gb.A0a, AbstractC1622gb.A0a, AbstractC1622gb.A0a, AbstractC1622gb.A0a);
            float[] fArr = {32.0f, 32.0f, 0.0f, 0.0f, 0.0f, 0.0f, 32.0f, 32.0f};
            String[] strArr = A00;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A00[5] = "4aDNNKv3V";
            A0T(this.A0H, -1728053248, fArr);
        }
        this.A0H.setLayoutParams(layoutParams);
    }

    private void setAdReportingView(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0G.getLayoutParams();
        if (i == 1) {
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            layoutParams.setMargins(0, 0, AbstractC1622gb.A0e, 0);
        } else {
            layoutParams.removeRule(21);
            layoutParams.addRule(20);
            layoutParams.setMargins(AbstractC1622gb.A0a, 0, 0, 0);
        }
        layoutParams.addRule(12);
        if (A00[3].length() == 25) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[1] = "9B1Nmp061sPSkwTyw9AwRyflFcDa";
        strArr[7] = "hl7KfbxOQ84vpw5dxIcxwQ8D2Syb";
        this.A0G.setLayoutParams(layoutParams);
    }

    private void setCTALayoutParam(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1622gb.A0T);
        if (i == 1) {
            layoutParams.removeRule(11);
            ((AbstractC1622gb) this).A01 = 30;
            layoutParams.addRule(14);
            layoutParams.setMargins(AbstractC1622gb.A0e, 0, AbstractC1622gb.A0e, AbstractC1622gb.A0a);
            layoutParams.addRule(2, this.A0P.getId());
            ((FH) this).A08.setMinWidth(-1);
        } else {
            layoutParams.removeRule(2);
            ((AbstractC1622gb) this).A01 = 16;
            layoutParams.width = -2;
            layoutParams.height = AbstractC1622gb.A0Z;
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.setMargins(AbstractC1622gb.A0g, 0, 0, 0);
            ((FH) this).A08.setMinWidth((int) (getResources().getDisplayMetrics().widthPixels * 0.12f));
        }
        layoutParams.addRule(14);
        ((FH) this).A08.setLayoutParams(layoutParams);
        A0O();
    }

    private void setDescriptionViewParams(int i) {
        if (i == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
            layoutParams.addRule(14);
            layoutParams.addRule(3, this.A0L.getId());
            layoutParams.setMargins(AbstractC1622gb.A0a, 0, AbstractC1622gb.A0a, AbstractC1622gb.A0g);
            this.A0K.setTypeface(Typeface.DEFAULT);
            this.A0K.setTextSize(18.0f);
            this.A0K.setLayoutParams(layoutParams);
        }
    }

    private void setIconImageParam(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FH) this).A09.getLayoutParams();
        if (i == 1) {
            layoutParams.width = A02;
            layoutParams.height = A02;
            layoutParams.setMargins(0, (-A02) / 4, 0, 0);
            layoutParams.addRule(14);
            ((FH) this).A09.setRadius(30);
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(14);
            layoutParams.width = A01;
            layoutParams.height = A01;
            layoutParams.setMargins(0, 0, AbstractC1622gb.A0g, 0);
            ((FH) this).A09.setRadius(12);
        }
        ((FH) this).A09.setLayoutParams(layoutParams);
        if (A00[3].length() == 25) {
            throw new RuntimeException();
        }
        A00[3] = "SLcDUycNbmuOmje9Q30br";
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public void setInfo(C03892a c03892a, C03922d c03922d, String str, String str2, CZ cz, FP fp) {
        super.setInfo(c03892a, c03922d, str, str2, cz, fp);
    }

    private void setProgressBarParam(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
        layoutParams.removeRule(2);
        layoutParams.removeRule(3);
        if (i == 1) {
            layoutParams.addRule(2, this.A0G.getId());
            layoutParams.setMargins(AbstractC1622gb.A0e, 0, AbstractC1622gb.A0e, AbstractC1622gb.A0b);
        } else {
            layoutParams.setMargins(0, AbstractC1622gb.A0g, 0, 0);
            layoutParams.addRule(3, this.A0I.getId());
        }
        this.A0P.setLayoutParams(layoutParams);
    }

    private void setRewardTextParam(int i) {
        if (((AbstractC1622gb) this).A03 == null || ((AbstractC1622gb) this).A03.getVisibility() != 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC1622gb) this).A03.getLayoutParams();
        layoutParams.removeRule(12);
        layoutParams.removeRule(3);
        if (i != 1) {
            layoutParams.addRule(3, this.A0P.getId());
            layoutParams.setMargins(0, AbstractC1622gb.A0f, 0, 0);
        } else {
            layoutParams.addRule(12);
            layoutParams.setMargins(AbstractC1622gb.A0e, 0, AbstractC1622gb.A0e, AbstractC1622gb.A0g);
        }
        ((AbstractC1622gb) this).A03.setLayoutParams(layoutParams);
        if (A00[0].charAt(3) == '4') {
            throw new RuntimeException();
        }
        A00[3] = "DJe";
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public void setTitleMaxLines(int i) {
        this.A0L.setMaxLines(i);
        this.A0L.setEllipsize(TextUtils.TruncateAt.END);
    }

    private void setTitleViewParams(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0L.getLayoutParams();
        if (i == 1) {
            layoutParams.removeRule(1);
            layoutParams.addRule(14);
            layoutParams.addRule(3, ((FH) this).A09.getId());
            layoutParams.setMargins(AbstractC1622gb.A0a, AbstractC1622gb.A0a, AbstractC1622gb.A0a, AbstractC1622gb.A0g);
            this.A0L.setTypeface(Typeface.DEFAULT_BOLD);
            this.A0L.setTextSize(30.0f);
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(14);
            layoutParams.addRule(15);
            layoutParams.addRule(1, ((FH) this).A09.getId());
            layoutParams.addRule(0, ((FH) this).A08.getId());
            layoutParams.setMargins(0, 0, AbstractC1622gb.A0g, 0);
            this.A0L.setTypeface(Typeface.DEFAULT);
            this.A0L.setTextSize(20.0f);
            this.A0L.setTextAlignment(5);
        }
        this.A0L.setLayoutParams(layoutParams);
    }
}
