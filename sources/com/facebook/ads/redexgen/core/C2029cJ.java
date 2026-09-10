package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2029cJ {
    public static byte[] A0N;
    public static String[] A0O = {"pFRbUbIPvfwTsTWtR68DyqtfsQzo0Y9e", "Jmt0yS7cxIqywVTLVazlNOZqViG4fijG", "7JVXgwFSulrh0z9RNSntkrow2", "W96LwBzZpPkBapcy7gGTKWs8B4GUDBcq", "br88nFbBZbLJ3vTh4p9wwCNTIA57FmIY", "mzQptMR0Z3d1fPQPbwNf4EthVYWzR3DW", "IPE7BiI9pZn923UUuncSvZhUL3wMHGrT", "br6hrssh6VRKiVV1vNUkmhf3WWjX02F0"};
    public C1905aJ A08;
    public C1905aJ A09;
    public ViewOnClickListenerC1498Kr A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0E;
    public final int A0F;
    public final AbstractC2465jd A0G;
    public final NN A0H;
    public final NY A0I;
    public final C1561Nd A0J;
    public final C2300gi A0K;
    public final VI A0L;
    public final InterfaceC1841Yh A0M;
    public int A03 = 16;
    public int A02 = 12;
    public int A01 = 10;
    public int A04 = 20;
    public int A05 = 40;
    public int A06 = 52;
    public int A00 = 10;
    public int A07 = 8;
    public boolean A0D = true;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] ^ i4;
            if (A0O[2].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "XwNXbwlUcFi7qEktIehGuIyqazGrk614";
            strArr[1] = "hx9Csixc74t4pIrSAOrr1o5nquGlqFF4";
            bArrCopyOfRange[i5] = (byte) (i6 ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{109, 118, 126, 126, 126, 126, 126, 126, 126, 4, 97, 97, 23, 23, 23, 23, 23, 23, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 53, 50, 47, 50, 47, 39, 42, 104, 32, 47, 40, 47, 53, 46, 25, 39, 37, 50, 47, 48, 47, 50, 63, 42, 50, 48, 41};
    }

    static {
        A04();
    }

    public C2029cJ(C2300gi c2300gi, AbstractC2465jd abstractC2465jd, VI vi, Handler handler, InterfaceC1841Yh interfaceC1841Yh) {
        this.A0K = c2300gi;
        this.A0M = interfaceC1841Yh;
        this.A0I = abstractC2465jd.A29().A0I();
        this.A0J = abstractC2465jd.A29().A0K();
        this.A0H = abstractC2465jd.A28();
        this.A0E = abstractC2465jd.A2T();
        this.A0C = abstractC2465jd.A2P();
        this.A0F = AbstractC2163eU.A00(c2300gi.getResources().getDisplayMetrics());
        this.A0L = vi;
        this.A0G = abstractC2465jd;
        A03();
    }

    private ImageView A00(final ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(YN.A01(YM.OTHER_SKIP), this.A04, this.A04, true);
        ImageView imageView = new ImageView(this.A0K);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A02(0, 9, 80)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A01, this.A01, this.A01, this.A01);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2029cJ.A0B(viewOnClickListenerC1498Kr, view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        return imageView;
    }

    private TextView A01() {
        if (TextUtils.isEmpty(this.A0G.A29().A0I().A08())) {
            return null;
        }
        TextView textView = new TextView(this.A0K);
        textView.setText(this.A0G.A29().A0I().A08());
        textView.setTextColor(-1);
        textView.setTextSize(13.0f);
        textView.setGravity(17);
        return textView;
    }

    private void A03() {
        this.A03 *= this.A0F;
        this.A02 *= this.A0F;
        this.A01 *= this.A0F;
        this.A04 *= this.A0F;
        this.A05 *= this.A0F;
        this.A06 *= this.A0F;
        this.A00 *= this.A0F;
        this.A07 *= this.A0F;
    }

    private void A05(FrameLayout frameLayout) {
        View view = new View(this.A0K);
        view.setBackgroundColor(Color.parseColor(A02(9, 9, 57)));
        view.setAlpha(0.8f);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A06(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        this.A08 = AbstractC1910aO.A01(this.A0K, false, this.A0G, this.A0L, this.A0M, EnumC1908aM.A02, AbstractC1907aL.A00(this.A0G));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMargins(0, 0, this.A04, this.A03);
        frameLayout2.addView(this.A08, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private void A07(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        this.A09 = AbstractC1910aO.A01(this.A0K, false, this.A0G, this.A0L, this.A0M, EnumC1908aM.A02, EnumC1911aP.A04);
        YB.A0K(this.A09);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(this.A04, 0, 0, this.A03);
        frameLayout2.addView(this.A09, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private void A08(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        C1909aN c1909aNA02 = AbstractC1910aO.A02(this.A0K, EnumC1908aM.A02, this.A0G);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(this.A04, 0, 0, this.A03);
        frameLayout2.addView(c1909aNA02, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00de  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:31:0x011c  */
    private void A09(FrameLayout frameLayout, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        ImageView imageViewA00;
        boolean z2;
        String[] strArr;
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        frameLayout2.setPadding(0, this.A06, this.A02, this.A02);
        if (this.A0E) {
            frameLayout2.setOnClickListener(new ViewOnClickListenerC2028cI(this, viewOnClickListenerC1498Kr));
        }
        Bitmap bitmap = YN.A01(YM.NAV_CROSS);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.A04, this.A04, true);
        ImageView dubiousSkip = new ImageView(this.A0K);
        YB.A0G(1002, dubiousSkip);
        dubiousSkip.setImageBitmap(bitmapCreateScaledBitmap);
        dubiousSkip.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A02(0, 9, 80)));
        dubiousSkip.setBackground(gradientDrawable);
        dubiousSkip.setPadding(this.A01, this.A01, this.A01, this.A01);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        dubiousSkip.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0G(view);
            }
        });
        long jA00 = this.A0J.A00();
        if (this.A0B) {
            C1561Nd c1561Nd = this.A0J;
            if (A0O[2].length() != 25) {
                throw new RuntimeException();
            }
            A0O[2] = "EDg5a4vgNKTBN5Vd4K7j2JAWQ";
            jA00 = c1561Nd.A01();
        }
        boolean z3 = this.A0D;
        if (A0O[2].length() != 25) {
            String[] strArr2 = A0O;
            strArr2[3] = "lPr3oecF17Vr0ETjxWpa6eT7xUG7TKGz";
            strArr2[1] = "pN0Dd6Okr1h1scp4h6gPnTJrQwG996nC";
            if (z3) {
                if (jA00 > 0) {
                    imageViewA00 = null;
                    z2 = this.A0C;
                    strArr = A0O;
                    if (strArr[0].charAt(31) != strArr[6].charAt(31)) {
                        String[] strArr3 = A0O;
                        strArr3[3] = "NBSSb5i8vB7h2DITQFZ0JVIGTEGpjtjm";
                        strArr3[1] = "r6oo3XDBH3cPwN6mP2aoTtDXeEGymFZK";
                        if (z2) {
                            if (viewOnClickListenerC1498Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC1498Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    } else {
                        String[] strArr4 = A0O;
                        strArr4[0] = "LTYB5M4Mhdd1oprOtejFkg7YcKqdK9Vm";
                        strArr4[6] = "s8tsGyr3r09N1mPmkZSZvoZyMzIeZ0vJ";
                        if (z2) {
                            if (viewOnClickListenerC1498Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC1498Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    }
                    AbstractC2163eU.A01(this.A0K, dubiousSkip, jA00, imageViewA00);
                }
            }
        } else {
            String[] strArr5 = A0O;
            strArr5[3] = "tzOwMkw7uDsuhpEAhy55DDXkTNG5R2eG";
            strArr5[1] = "LVlHDeBQ28ZWrMMDEXcUdCCcU9GvuA6m";
            if (z3) {
                if (jA00 > 0) {
                    imageViewA00 = null;
                    z2 = this.A0C;
                    strArr = A0O;
                    if (strArr[0].charAt(31) != strArr[6].charAt(31)) {
                        String[] strArr6 = A0O;
                        strArr6[3] = "NBSSb5i8vB7h2DITQFZ0JVIGTEGpjtjm";
                        strArr6[1] = "r6oo3XDBH3cPwN6mP2aoTtDXeEGymFZK";
                        if (z2) {
                            if (viewOnClickListenerC1498Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC1498Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    } else {
                        String[] strArr7 = A0O;
                        strArr7[0] = "LTYB5M4Mhdd1oprOtejFkg7YcKqdK9Vm";
                        strArr7[6] = "s8tsGyr3r09N1mPmkZSZvoZyMzIeZ0vJ";
                        if (z2) {
                            if (viewOnClickListenerC1498Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC1498Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    }
                    AbstractC2163eU.A01(this.A0K, dubiousSkip, jA00, imageViewA00);
                }
            }
        }
        frameLayout2.addView(dubiousSkip, layoutParams);
        if (!this.A0D) {
            String[] strArr8 = A0O;
            if (strArr8[4].charAt(0) != strArr8[7].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr9 = A0O;
            strArr9[3] = "Yzc02jbTluogikiQi2Wv962AcLGu9uF1";
            strArr9[1] = "JahYjLhPUhQBnUZY2LL7YeIOJlGmyCNi";
            dubiousSkip.setVisibility(8);
        }
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -2, 48));
    }

    private void A0A(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        viewOnClickListenerC1498Kr.setPadding(this.A04, this.A03, this.A04, this.A03);
        viewOnClickListenerC1498Kr.setTextSize(14.0f);
        viewOnClickListenerC1498Kr.A0D();
        viewOnClickListenerC1498Kr.setIncludeFontPadding(true);
        viewOnClickListenerC1498Kr.setLayoutParams(layoutParams);
        viewOnClickListenerC1498Kr.setTextColor(-16777216);
        YB.A0V(viewOnClickListenerC1498Kr, YB.A06(-1, this.A00));
        viewOnClickListenerC1498Kr.setId(View.generateViewId());
        if (viewOnClickListenerC1498Kr.getParent() != null) {
            ((ViewGroup) viewOnClickListenerC1498Kr.getParent()).removeView(viewOnClickListenerC1498Kr);
        }
    }

    public static /* synthetic */ void A0B(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr, View view) {
        viewOnClickListenerC1498Kr.A0E(A02(63, 4, 71));
        viewOnClickListenerC1498Kr.setVisibility(4);
    }

    public final View A0C(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        if (viewOnClickListenerC1498Kr != null) {
            viewOnClickListenerC1498Kr.setV2Design(true);
        }
        return A0D(viewOnClickListenerC1498Kr, null);
    }

    public final View A0D(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr, ImageView imageView) {
        this.A0A = viewOnClickListenerC1498Kr;
        this.A0B = imageView != null;
        FrameLayout frameLayout = new FrameLayout(this.A0K);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C2000bq c2000bq = new C2000bq(this.A0K, this.A0H.A01(), true, false, false);
        c2000bq.A04(this.A0I.A0G(), this.A0I.A0E().toLowerCase(Locale.getDefault()), null, false, false);
        c2000bq.setAlignment(17);
        c2000bq.setTitleTextSize(28);
        c2000bq.setDescriptionTextSize(13);
        c2000bq.A02();
        c2000bq.setPadding(this.A05, 0, this.A05, 0);
        LinearLayout linearLayout = new LinearLayout(this.A0K);
        linearLayout.setClickable(true);
        if (C1750Up.A1D(this.A0K)) {
            linearLayout.setOnClickListener(new ViewOnClickListenerC2027cH(this, viewOnClickListenerC1498Kr));
        }
        linearLayout.setPadding(0, -this.A04, 0, 0);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        if (imageView != null) {
            if (imageView.getParent() != null) {
                ((ViewGroup) imageView.getParent()).removeView(imageView);
            }
            linearLayout.addView(imageView);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A03, 0, this.A07);
        linearLayout.addView(c2000bq, layoutParams);
        TextView textViewA01 = A01();
        if (textViewA01 != null) {
            new LinearLayout.LayoutParams(-2, -2).setMargins(0, this.A07, 0, this.A03);
            linearLayout.addView(textViewA01);
        }
        if (viewOnClickListenerC1498Kr != null) {
            A0A(viewOnClickListenerC1498Kr);
            linearLayout.addView(viewOnClickListenerC1498Kr, layoutParams);
            if (TextUtils.isEmpty(viewOnClickListenerC1498Kr.getText())) {
                YB.A0H(viewOnClickListenerC1498Kr);
            }
        }
        linearLayout.setAlpha(1.0f);
        A05(frameLayout);
        frameLayout.addView(linearLayout);
        A09(frameLayout, viewOnClickListenerC1498Kr);
        if (this.A0G.A2M()) {
            A06(frameLayout);
        }
        AbstractC2465jd abstractC2465jd = this.A0G;
        String[] strArr = A0O;
        if (strArr[0].charAt(31) == strArr[6].charAt(31)) {
            throw new RuntimeException();
        }
        A0O[2] = "4iwGVt394BTmmSYCgqRVgc6es";
        if (abstractC2465jd.A2W()) {
            A08(frameLayout);
        } else if (this.A0G.A2V()) {
            A07(frameLayout);
        }
        return frameLayout;
    }

    public final ViewOnClickListenerC1498Kr A0E() {
        return this.A0A;
    }

    public final void A0F() {
        if (this.A08 != null) {
            this.A08.A0O();
        }
        C1905aJ c1905aJ = this.A09;
        String[] strArr = A0O;
        if (strArr[4].charAt(0) != strArr[7].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "2Z0HXqlllvltE4fpmlk2k5YgzqGJ81zY";
        strArr2[1] = "EMsyCAj6WMyQurvXYMEHBK7qX1GDVftC";
        if (c1905aJ != null) {
            this.A09.A0O();
        }
    }

    public final /* synthetic */ void A0G(View view) {
        this.A0K.A0F().AB0();
        this.A0M.A4j(A02(18, 45, 88));
    }

    public final void A0H(boolean z2) {
        if (!z2 && this.A08 != null) {
            this.A08.A0P();
        }
        if (this.A09 != null) {
            this.A09.A0P();
        }
    }

    public final void A0I(boolean z2) {
        this.A0D = z2;
    }
}
