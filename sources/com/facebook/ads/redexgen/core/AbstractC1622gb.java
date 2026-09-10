package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1622gb extends FH {
    public static byte[] A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public int A00;
    public int A01;
    public int A02;
    public TextView A03;
    public C1273as A04;
    public final int A05;
    public final AbstractC1984md A06;
    public final C04022n A07;
    public final C04213g A08;
    public final AF A09;
    public final DR A0A;
    public final Runnable A0B;
    public final String A0C;
    public final Handler A0D;
    public final ImageView A0E;
    public final ImageView A0F;
    public final LinearLayout A0G;
    public final RelativeLayout A0H;
    public final RelativeLayout A0I;
    public final RelativeLayout A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final C03892a A0M;
    public final C03912c A0N;
    public final C1828k1 A0O;
    public final C1283b5 A0P;
    public final Runnable A0Q;
    public final AtomicBoolean A0R;

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0S, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A0S = new byte[]{58, 18, 4, 2, 18, 60, 125, 106, 120, 110, 125, 107, 106, 107, 80, 121, 102, 107, 106, 96};
    }

    public abstract void A0S(int i);

    public abstract void A0U(C1361cL c1361cL, int i);

    static {
        A0L();
        A0Z = (int) (CP.A02 * 44.0f);
        A0T = (int) (CP.A02 * 52.0f);
        A0f = (int) (CP.A02 * 4.0f);
        A0g = (int) (CP.A02 * 8.0f);
        A0a = (int) (CP.A02 * 16.0f);
        A0b = (int) (CP.A02 * 18.0f);
        A0c = (int) (CP.A02 * 20.0f);
        A0d = (int) (CP.A02 * 24.0f);
        A0e = (int) (CP.A02 * 32.0f);
        A0W = (int) (CP.A02 * 48.0f);
        A0X = (int) (CP.A02 * 100.0f);
        A0Y = (int) (CP.A02 * 112.0f);
        A0V = AnonymousClass43.A02(-1, 128);
        A0U = AnonymousClass43.A02(-1, 17);
        A0h = (int) (CP.A02 * 12.0f);
    }

    public AbstractC1622gb(C1828k1 c1828k1, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, int i, C03912c c03912c, boolean z, String str, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, AbstractC1984md abstractC1984md, C1283b5 c1283b5, AF af) {
        super(c1828k1, viewOnClickListenerC1617gW, i, c03912c, z, str, a7, dr, jl, c0647Cv, abstractC1984md.A1c(), abstractC1984md.A1I(), abstractC1984md.A0k());
        this.A0R = new AtomicBoolean(true);
        this.A0Q = new FI(this);
        this.A0B = new FJ(this);
        this.A09 = af;
        this.A06 = abstractC1984md;
        this.A08 = AbstractC04223h.A00(c1828k1.A02());
        this.A0A = dr;
        this.A0C = abstractC1984md.A1g();
        this.A07 = abstractC1984md.A1e();
        this.A0N = c03912c;
        this.A0M = abstractC1984md.A1b().A0G();
        this.A0O = c1828k1;
        this.A0D = new Handler(Looper.getMainLooper());
        this.A0E = new ImageView(this.A0O);
        this.A0F = new ImageView(this.A0O);
        this.A00 = -1;
        this.A02 = ViewCompat.MEASURED_STATE_MASK;
        this.A0J = A0C();
        this.A0H = A0A();
        this.A0I = A0B();
        A0J();
        A0I();
        if (super.A08.getParent() != null) {
            ((ViewGroup) super.A08.getParent()).removeView(super.A08);
        }
        this.A0L = A0F();
        D3.A0I(this.A0L);
        this.A0K = A0D();
        D3.A0I(this.A0K);
        this.A0P = A0G(c1283b5);
        D3.A0I(this.A0P);
        if (this.A06.A1H()) {
            this.A0P.setVisibility(4);
        }
        this.A0G = A09();
        D3.A0I(this.A0G);
        this.A0G.setOnClickListener(new FK(this));
        A0R(8);
        this.A05 = this.A06.A1b().A0F().A03();
        if (this.A06.A0i().equals(A0H(6, 14, 11)) && !abstractC1984md.A1G() && this.A05 > 0) {
            this.A03 = A0E();
            D3.A0I(this.A03);
        }
        this.A0D.postDelayed(this.A0B, 2000L);
    }

    public static int A07(int i) {
        if (AnonymousClass43.A01(i, -1) >= 4.5d) {
            return -1;
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    private LinearLayout A09() {
        LinearLayout linearLayout = new LinearLayout(this.A0O);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.A0E.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.A0E.setImageBitmap(DC.A01(DB.AD_CHOICE_V2_COLLAPSE));
        linearLayout.addView(this.A0E);
        this.A0F.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.A0F.setImageBitmap(DC.A01(DB.AD_CHOICE_V2_EXPAND));
        linearLayout.addView(this.A0F);
        return linearLayout;
    }

    private RelativeLayout A0A() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0O);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        relativeLayout.setClipChildren(false);
        relativeLayout.setClipToPadding(false);
        D3.A0I(relativeLayout);
        return relativeLayout;
    }

    private RelativeLayout A0B() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0O);
        RelativeLayout.LayoutParams childLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        childLayoutParams.addRule(16);
        D3.A0I(relativeLayout);
        return relativeLayout;
    }

    private RelativeLayout A0C() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0O);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    private TextView A0D() {
        TextView textView = new TextView(this.A0O);
        textView.setText(this.A0M.A0E());
        textView.setTextColor(-1);
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        return textView;
    }

    private TextView A0E() {
        TextView textView = new TextView(this.A0O);
        textView.setTextColor(-855638017);
        textView.setMaxLines(1);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        D3.A0I(textView);
        return textView;
    }

    private TextView A0F() {
        TextView textView = new TextView(this.A0O);
        textView.setText(this.A0M.A0F());
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(30.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        return textView;
    }

    private C1283b5 A0G(C1283b5 c1283b5) {
        c1283b5.A06(A0V, A0U, true);
        c1283b5.setPadding(0, 0, 0, 0);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, A0h);
        c1283b5.setLayoutParams(progressBarLayoutParams);
        return c1283b5;
    }

    private void A0I() {
        this.A01 = 30;
        super.A08.setIncludeFontPadding(false);
        super.A08.setTextSize(18.0f);
        super.A08.setTextColor(this.A02);
        D3.A0Q(super.A08, D3.A06(this.A00, this.A01));
        super.A08.setLayoutParams(new RelativeLayout.LayoutParams(-2, A0T));
        D3.A0I(super.A08);
    }

    private void A0J() {
        super.A09.setRadius(15);
        D3.A0K(super.A09, 0);
        super.A09.setLayoutParams(new RelativeLayout.LayoutParams(A0W, A0W));
        D3.A0I(super.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K() {
        this.A09.A04(AE.A0A, null);
        if (this.A08.A0O(this.A0O.A02(), true)) {
            this.A0A.AAd(this.A0C, this.A07);
        } else {
            if (TextUtils.isEmpty(this.A07.A00())) {
                return;
            }
            C2.A0M(new C2(), this.A0O, C5.A00(this.A07.A00()), this.A0C);
        }
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0N() {
        super.A09.setOnClickListener(super.A05);
        this.A0L.setOnClickListener(super.A05);
        this.A0K.setOnClickListener(super.A05);
        this.A0P.setOnClickListener(super.A05);
        if (this.A03 != null) {
            this.A03.setOnClickListener(super.A05);
        }
    }

    public final void A0O() {
        super.A08.setIncludeFontPadding(false);
        super.A08.setTextSize(18.0f);
        super.A08.setTextColor(this.A02);
        D3.A0Q(super.A08, D3.A06(this.A00, this.A01));
        super.A08.A09();
    }

    public final void A0P() {
        super.A08.A09();
    }

    public final void A0Q(int i) {
        if (this.A03 != null) {
            int i2 = this.A05 - i;
            if (i2 > 0) {
                String rewardMessage = this.A06.A1f().A02().replace(A0H(0, 6, 101), String.valueOf(i2));
                this.A03.setText(rewardMessage);
                return;
            }
            this.A03.setVisibility(8);
        }
    }

    public final void A0R(int i) {
        if (i == 0) {
            this.A0F.setVisibility(i);
            this.A0E.setVisibility(8);
        } else {
            this.A0F.setVisibility(i);
            this.A0E.setVisibility(0);
        }
    }

    public final void A0T(View view, int i, float[] fArr) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(i);
        view.setBackground(shapeDrawable);
    }
}
