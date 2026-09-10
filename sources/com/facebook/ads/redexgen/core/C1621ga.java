package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1621ga extends AbstractC04333s {
    public static byte[] A07;
    public static String[] A08 = {"YL1yLKFo15UZj59z8sTirpPX5rRsAE8", "O", "O6aHciR8nIcXgMvSQpLVacnv7HWgT320", "WCwGMxKVAM83NNo23MC3P4tNfApW0jy", "jLj4WTNtvai9N9Pzwov0sYarXBGRxB6J", "t8UiaIyNKCcrJZePb4XsdzT37H29Zzi", "ckjPU6sQ4thPoQS3sFeS4HnUH", ""};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC1984md A02;
    public final C1828k1 A03;
    public final A7 A04;
    public final C0647Cv A05;
    public final DR A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A03() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C0709Ff c0709Ff = new C0709Ff(this.A03);
        new AsyncTaskC1623gc(c0709Ff, this.A03).A05(A0D, A0D).A07(this.A02.A1e().A01());
        c0709Ff.setFullCircleCorners(true);
        D3.A0K(c0709Ff, 0);
        D3.A0I(c0709Ff);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0D, A0D);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        layoutParams.addRule(14);
        relativeLayout.addView(c0709Ff, layoutParams);
        TextView textView = new TextView(this.A03);
        D3.A0I(textView);
        textView.setTextColor(this.A02.A1a().A01().A07(true));
        textView.setText(this.A02.A1b().A0G().A0F());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c0709Ff.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        D3.A0I(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0C, 0, A0C, A0C);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C0711Fh c0711Fh = new C0711Fh(this.A03, A0B, 5, A0A, -1);
        c0711Fh.setGravity(16);
        linearLayout.addView(c0711Fh, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A1a().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        D3.A0W(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A09;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A1b().A0G().A0B())) {
            String[] strArr = A08;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "pDxc6WlcrgExZnzDlKhHZoNjTSnAqRc0";
            strArr2[2] = "JfppCwNpdT1PFGKwLRSAK2lJbowaAIWW";
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c0711Fh.setRating(Float.parseFloat(this.A02.A1b().A0G().A0B()));
            if (this.A02.A1b().A0G().A08() != null) {
                textView2.setText(A01(0, 1, 116) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A1b().A0G().A08())) + A01(1, 1, 1));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A1a().A01().A07(true));
        textView3.setText(this.A02.A1b().A0G().A04());
        textView3.setGravity(17);
        textView3.setPadding(A0C, A0C, A0C, A0C);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A04() {
        A07 = new byte[]{29, 105};
    }

    static {
        A04();
        A0C = (int) (AbstractC04333s.A08 * 12.0f);
        A0D = (int) (AbstractC04333s.A08 * 84.0f);
        A0B = (int) (AbstractC04333s.A08 * 14.0f);
        A09 = (int) (AbstractC04333s.A08 * 8.0f);
        A0A = AnonymousClass43.A02(-1, 77);
    }

    public C1621ga(C1828k1 c1828k1, AbstractC1984md abstractC1984md, A7 a7, DR dr) {
        super(c1828k1);
        this.A05 = new C0647Cv();
        this.A03 = c1828k1;
        this.A02 = abstractC1984md;
        this.A04 = a7;
        this.A06 = dr;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new RelativeLayout(c1828k1);
        AbstractC0716Fm.A00(c1828k1, this.A01, abstractC1984md.A1b().A0F().A08());
        this.A00 = new LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A03();
        A02();
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A02() {
        ViewOnClickListenerC1617gW viewOnClickListenerC1617gW = new ViewOnClickListenerC1617gW(this.A03, IV.A04.A03(), this.A02.A1a().A01(), this.A02.A1b().A0H().A06(), this.A04, this.A06, null, this.A05, this.A02.A1c());
        viewOnClickListenerC1617gW.setViewShowsOverMedia(true);
        D3.A0E(1001, viewOnClickListenerC1617gW);
        viewOnClickListenerC1617gW.setCta(this.A02.A1b().A0H(), this.A02.A1g(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        viewOnClickListenerC1617gW.setPadding(A0C, A0C, A0C, A0C);
        layoutParams.setMargins(A0C, A0C, A0C, A0C * 2);
        this.A00.addView(viewOnClickListenerC1617gW, layoutParams);
    }
}
