package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0861Lb extends AbstractC1622gb {
    public static String[] A01 = {"jx4KYlgMCzDl9ClzKv", "6Ix4GmMTfvyGvtJf24kawibkIRWRaxha", "zW69YqA5HPweJk44OR41r89kehyD8PUK", "YWeaBtgKCGSZjZhmH64nz1hbm3NBx6WA", "r8zWPPccQcaX84RMJyONYLJrFGke7QKT", "leMtqeNEOkXnn1xJcE4uVuewwh76dLco", "HficAYafh9u7bjEKghLSIT4OmCXpUy86", "1EAnVhI1sEBIq9Q3DhiB3BUE0Cu5Wqiv"};
    public final Runnable A00;

    public C0861Lb(C1828k1 c1828k1, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, int i, C03912c c03912c, String str, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, AbstractC1984md abstractC1984md, C1283b5 c1283b5, AF af) {
        super(c1828k1, viewOnClickListenerC1617gW, i, c03912c, false, str, a7, dr, jl, c0647Cv, abstractC1984md, c1283b5, af);
        this.A00 = new FN(this);
        int orientation = getResources().getConfiguration().orientation;
        A04(orientation);
        A06(orientation);
        A01();
        setAdDetailsLayoutBackground(orientation);
        setIconImageParam(orientation);
        setTitleViewParams(orientation);
        setDescriptionViewParams(orientation);
        setCTALayoutParam(orientation);
        setProgressBarParam(orientation);
        setRewardTextParam(orientation);
        setAdReportingView(orientation);
        A02(orientation);
        this.A0J.addView(this.A0H);
        addView(this.A0J);
    }

    private void A01() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.37f);
        layoutParams.addRule(14);
        int screenWidth = AbstractC1622gb.A0a;
        layoutParams.setMargins(0, screenWidth, 0, AbstractC1622gb.A0d);
        RelativeLayout relativeLayout = this.A0I;
        int i = AbstractC1622gb.A0a;
        int screenWidth2 = AbstractC1622gb.A0a;
        relativeLayout.setPadding(i, screenWidth2, AbstractC1622gb.A0a, AbstractC1622gb.A0a);
        this.A0I.setLayoutParams(layoutParams);
    }

    private void A02(int i) {
        if (i == 1) {
            this.A0H.addView(((FH) this).A09);
            this.A0H.addView(this.A0L);
            this.A0H.addView(this.A0K);
            this.A0H.addView(((FH) this).A08);
            this.A0H.addView(this.A0P);
            if (((AbstractC1622gb) this).A03 != null && ((AbstractC1622gb) this).A03.getVisibility() == 0) {
                this.A0H.addView(((AbstractC1622gb) this).A03);
            }
            this.A0H.addView(this.A0G);
            return;
        }
        this.A0I.addView(((FH) this).A09);
        this.A0I.addView(this.A0L);
        this.A0I.addView(this.A0K);
        this.A0I.addView(((FH) this).A08);
        this.A0I.addView(this.A0P);
        if (((AbstractC1622gb) this).A03 != null && ((AbstractC1622gb) this).A03.getVisibility() == 0) {
            this.A0I.addView(((AbstractC1622gb) this).A03);
        }
        this.A0J.addView(this.A0I);
        this.A0J.addView(this.A0G);
    }

    private void A03(int i) {
        if (i == 2) {
            this.A0D.removeCallbacks(this.A00);
            this.A0H.setLayoutTransition(null);
        }
    }

    private void A04(int i) {
        if (i == 1) {
            ((AbstractC1622gb) this).A04 = new C1273as(this.A0H, 400, 100, 0);
            this.A0R.set(false);
        }
    }

    private void A05(int i) {
        A0T(this.A0H, i, new float[]{72.0f, 72.0f, 72.0f, 72.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private void A06(int i) {
        if (i == 1) {
            this.A0J.setClipChildren(false);
            this.A0J.setClipToPadding(false);
            String[] strArr = A01;
            if (strArr[1].charAt(21) == strArr[3].charAt(21)) {
                throw new RuntimeException();
            }
            A01[5] = "cGbvdTJNONPNbXLhpEbXT6xJPDu44esN";
            this.A0J.setGravity(80);
            return;
        }
        this.A0J.setGravity(8388659);
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0D(int i) {
        A03(i);
        D3.A0Z(this.A0I, ((FH) this).A09, this.A0L, ((FH) this).A08, this.A0P, ((AbstractC1622gb) this).A03, this.A0K, this.A0G);
        A06(i);
        setAdDetailsLayoutBackground(i);
        A01();
        setIconImageParam(i);
        setRewardTextParam(i);
        setProgressBarParam(i);
        setCTALayoutParam(i);
        setTitleViewParams(i);
        setDescriptionViewParams(i);
        setAdReportingView(i);
        A02(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1622gb
    public final void A0S(int i) {
        if (((AbstractC1622gb) this).A04 == null || i == 2) {
            return;
        }
        ((AbstractC1622gb) this).A04.A40(true, false);
        this.A0R.set(true);
        this.A0D.postDelayed(this.A00, 5000L);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1622gb
    public final void A0U(C1361cL c1361cL, int i) {
    }

    private void setAdDetailsLayoutBackground(int i) {
        RelativeLayout.LayoutParams layoutParams;
        if (i == 1) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            this.A0H.setGravity(80);
            layoutParams.setMargins(AbstractC1622gb.A0a, 0, AbstractC1622gb.A0a, 0);
            this.A0H.setPadding(AbstractC1622gb.A0c, 0, AbstractC1622gb.A0c, 0);
            A05(-1291845632);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.A0H.setGravity(1);
            A0T(this.A0H, 0, null);
        }
        this.A0H.setLayoutParams(layoutParams);
    }

    private void setAdReportingView(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0G.getLayoutParams();
        if (i == 1) {
            layoutParams.removeRule(12);
            layoutParams.removeRule(11);
            layoutParams.setMargins(0, AbstractC1622gb.A0b, 0, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(3, this.A0P.getId());
        } else {
            layoutParams.setMargins(0, 0, AbstractC1622gb.A0a, 0);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        this.A0G.setLayoutParams(layoutParams);
    }

    private void setCTALayoutParam(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1622gb.A0T);
        layoutParams.addRule(3, this.A0K.getId());
        if (i == 1) {
            layoutParams.removeRule(2);
            layoutParams.setMargins(0, AbstractC1622gb.A0b, 0, 0);
        } else {
            layoutParams.removeRule(3);
            layoutParams.addRule(2, this.A0P.getId());
            layoutParams.setMargins(0, 0, 0, 0);
        }
        layoutParams.addRule(14);
        ((FH) this).A08.setLayoutParams(layoutParams);
        A0O();
    }

    private void setDescriptionViewParams(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(3, this.A0L.getId());
        layoutParams.setMargins(0, AbstractC1622gb.A0g, 0, 0);
        this.A0K.setTextSize(18.0f);
        this.A0K.setLayoutParams(layoutParams);
        if (i == 1) {
            if (this.A0R.get()) {
                this.A0K.setVisibility(8);
                this.A0K.setMaxLines(2);
                return;
            }
            return;
        }
        this.A0K.setVisibility(0);
        this.A0K.setMaxLines(1);
    }

    private void setIconImageParam(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FH) this).A09.getLayoutParams();
        if (i == 1) {
            AtomicBoolean atomicBoolean = this.A0R;
            String[] strArr = A01;
            if (strArr[1].charAt(21) != strArr[3].charAt(21)) {
                String[] strArr2 = A01;
                strArr2[1] = "w5CK1gApPwith6RPWkYLE8hn8LMwnsSI";
                strArr2[3] = "pHvAzBIuhGCejBjFplodNvnrz82jXtkw";
                if (atomicBoolean.get()) {
                    ((FH) this).A09.setVisibility(8);
                }
                layoutParams.width = AbstractC1622gb.A0X;
                layoutParams.height = AbstractC1622gb.A0X;
                int i2 = AbstractC1622gb.A0X;
                String[] strArr3 = A01;
                if (strArr3[7].charAt(14) != strArr3[4].charAt(14)) {
                    A01[0] = "wZH0lfF";
                    layoutParams.setMargins(0, (-i2) / 2, 0, 0);
                }
            }
            throw new RuntimeException();
        }
        layoutParams.removeRule(3);
        layoutParams.removeRule(14);
        layoutParams.width = AbstractC1622gb.A0Y;
        layoutParams.height = AbstractC1622gb.A0Y;
        layoutParams.setMargins(0, AbstractC1622gb.A0a, 0, 0);
        ((FH) this).A09.setVisibility(0);
        layoutParams.addRule(14);
        ((FH) this).A09.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public void setInfo(C03892a c03892a, C03922d c03922d, String str, String str2, CZ cz, FP fp) {
        super.setInfo(c03892a, c03922d, str, str2, cz, fp);
    }

    private void setProgressBarParam(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
        if (i == 1) {
            layoutParams.removeRule(12);
            layoutParams.setMargins(0, AbstractC1622gb.A0b, 0, 0);
            layoutParams.addRule(3, ((FH) this).A08.getId());
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(12);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, AbstractC1622gb.A0a, 0, AbstractC1622gb.A0c);
        }
        this.A0P.setLayoutParams(layoutParams);
    }

    private void setRewardTextParam(int i) {
        int i2;
        if (((AbstractC1622gb) this).A03 == null || ((AbstractC1622gb) this).A03.getVisibility() != 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC1622gb) this).A03.getLayoutParams();
        if (i == 1) {
            layoutParams.removeRule(12);
            layoutParams.removeRule(9);
            i2 = AbstractC1622gb.A0g;
            int id = this.A0P.getId();
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[3];
            int marginTop = str.charAt(21);
            if (marginTop == str2.charAt(21)) {
                throw new RuntimeException();
            }
            A01[0] = "uxC1uQdDVO2t";
            layoutParams.addRule(3, id);
        } else {
            layoutParams.removeRule(3);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            i2 = AbstractC1622gb.A0f;
        }
        layoutParams.setMargins(0, i2, 0, 0);
        ((AbstractC1622gb) this).A03.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public void setTitleMaxLines(int i) {
    }

    private void setTitleViewParams(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0L.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(3, ((FH) this).A09.getId());
        layoutParams.setMargins(0, AbstractC1622gb.A0b, 0, 0);
        this.A0L.setTypeface(Typeface.DEFAULT_BOLD);
        this.A0L.setTextSize(30.0f);
        this.A0L.setLayoutParams(layoutParams);
        if (i == 1) {
            if (this.A0R.get()) {
                this.A0L.setVisibility(8);
                return;
            }
            return;
        }
        this.A0L.setVisibility(0);
    }
}
