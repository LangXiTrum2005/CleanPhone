package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0781Hz {
    public static byte[] A0d;
    public static String[] A0e = {"rlKCEchcqf0ciqqi5AvJfjd9N52fSCy8", "PNo7HsDb73vpBHqbFnDgLDKmrYNJyDDd", "113OeC", "Cx3CvN9GF4y9AfAfmcXjlQVU3pQMYVJa", "l70rAAhZwLIPPR5uDe0F7aYKOgrudYX3", "BVxdVuILB7huRlQ", "M763HrTZfS2tZdU8T7Ka7fPhorhGOaFK", "qRF7Z25uKAZ9gvWIqbx"};
    public ImageView A0K;
    public ImageView A0L;
    public LinearLayout A0M;
    public RelativeLayout A0N;
    public TextView A0O;
    public MG A0P;
    public C0709Ff A0Q;
    public final int A0S;
    public final FrameLayout A0T;
    public final AbstractC1984md A0U;
    public final C2P A0V;
    public final C03892a A0W;
    public final C03932e A0X;
    public final C04022n A0Y;
    public final C1828k1 A0Z;
    public final DR A0a;
    public final ViewOnClickListenerC1617gW A0b;
    public int A05 = Input.Keys.NUMPAD_ENTER;
    public int A06 = 130;
    public int A02 = 56;
    public int A03 = 430;
    public int A0I = 110;
    public int A0J = 70;
    public int A09 = 120;
    public int A0D = 30;
    public int A0C = 24;
    public int A0B = 20;
    public int A0A = 16;
    public int A08 = 12;
    public int A07 = 10;
    public int A0F = 8;
    public int A0E = 4;
    public int A0H = 530;
    public int A0G = 300;
    public int A04 = EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE;
    public boolean A0R = false;
    public final AtomicBoolean A0c = new AtomicBoolean(false);
    public int A00 = 0;
    public int A01 = this.A05;

    public static String A0E(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 50;
            String[] strArr = A0e;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0e[2] = "GQ96jzl1cN6JO8qYFngU1";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A0d = new byte[]{cw.k, 31, 111, 31, 111, 31, 111, 44, 55, 63, 63, 63, 63, 63, 63, 63, 89, 85, 87, 20, 92, 91, 89, 95, 88, 85, 85, 81, 20, 91, 94, 73, 20, 83, 84, 78, 95, 72, 73, 78, 83, 78, 83, 91, 86, 20, 92, 83, 84, 83, 73, 82, 101, 91, 89, 78, 83, 76, 83, 78, 67, 101, 125, 127, 102};
    }

    static {
        A0J();
    }

    public C0781Hz(final C1828k1 c1828k1, AbstractC1984md abstractC1984md, DR dr, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        this.A0Z = c1828k1;
        this.A0U = abstractC1984md;
        this.A0Y = abstractC1984md.A1e();
        this.A0X = abstractC1984md.A1b().A0I();
        this.A0a = dr;
        this.A0W = abstractC1984md.A1b().A0G();
        this.A0V = abstractC1984md.A1a();
        this.A0b = viewOnClickListenerC1617gW;
        this.A0P = new MG(c1828k1) { // from class: com.facebook.ads.redexgen.X.1I
            @Override // com.facebook.ads.redexgen.core.MG, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.MG, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        this.A0N = new RelativeLayout(c1828k1);
        this.A0Q = new C0709Ff(c1828k1);
        this.A0O = new TextView(c1828k1);
        this.A0K = new ImageView(c1828k1);
        this.A0T = new FrameLayout(this.A0Z);
        this.A0S = I1.A00(this.A0Z.getResources().getDisplayMetrics());
        A0H();
    }

    public static int A00(int i) {
        if (AnonymousClass43.A01(i, -1) >= 4.5d) {
            return -1;
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    private FrameLayout.LayoutParams A01() {
        if (this.A0Z.getResources().getConfiguration().orientation == 2) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i = this.A0J;
            int orientation = this.A0D;
            layoutParams.setMargins(0, i, 0, orientation);
            return layoutParams;
        }
        int orientation2 = this.A0R ? this.A0G : this.A0H;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, orientation2);
        int orientation3 = this.A0I;
        layoutParams2.setMargins(0, orientation3, 0, 0);
        return layoutParams2;
    }

    private FrameLayout.LayoutParams A02() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, this.A08, this.A08, 0);
        return layoutParams;
    }

    private ImageView A03() {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(DC.A01(DB.OTHER_SKIP), this.A0B, this.A0B, true);
        ImageView imageView = new ImageView(this.A0Z);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A0E(7, 9, 61)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A07, this.A07, this.A07, this.A07);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Hv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0Q(view);
            }
        });
        imageView.setLayoutParams(A02());
        imageView.setVisibility(0);
        return imageView;
    }

    private LinearLayout.LayoutParams A04() {
        int width = this.A0Z.getResources().getConfiguration().orientation;
        int i = -1;
        int i2 = -2;
        int i3 = 0;
        if (width == 2) {
            i = this.A03;
            i2 = -2;
            String[] strArr = A0e;
            String str = strArr[6];
            String str2 = strArr[0];
            int width2 = str.charAt(0);
            int orientation = str2.charAt(0);
            if (width2 == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[4] = "2Ia5vAscFxMcZ1ZcpDs6xoNSTk8YU4BA";
            strArr2[3] = "l5LN0cSfS0eMNqZA7sTWe2HczOJrVC6l";
            i3 = this.A0A;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.gravity = 81;
        int height = this.A0A;
        int width3 = this.A0A;
        layoutParams.setMargins(height, i3, width3, 0);
        return layoutParams;
    }

    private LinearLayout A05() {
        LinearLayout linearLayout = new LinearLayout(this.A0Z);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setGravity(80);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private LinearLayout A06() {
        String strA08;
        LinearLayout linearLayout = new LinearLayout(this.A0Z);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (this.A0W.A0B().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new I2(this.A0Z).A02(new FU(this.A0Z, -1, -1, DB.RATINGS)).A04(this.A0W.A0B()).A03(this.A0W.A0A()));
        if (!this.A0W.A08().isEmpty()) {
            try {
                strA08 = CY.A01(Integer.parseInt(this.A0W.A08()));
            } catch (NumberFormatException unused) {
                strA08 = this.A0W.A08();
            }
            arrayList.add(new I2(this.A0Z).A02(new FU(this.A0Z, -1, -1, DB.NUCLEUS_GROUP)).A04(strA08).A03(this.A0W.A09()));
        }
        if (!this.A0W.A05().isEmpty()) {
            arrayList.add(new I2(this.A0Z).A02(new FU(this.A0Z, -1, -1, DB.DOWNLOAD)).A04(this.A0W.A05()).A03(this.A0W.A06()));
        }
        C03892a c03892a = this.A0W;
        if (A0e[2].length() == 29) {
            throw new RuntimeException();
        }
        A0e[2] = "3vpsIj";
        if (!c03892a.A01().isEmpty()) {
            arrayList.add(new I2(this.A0Z).A02(new FU(this.A0Z, -1, -1, DB.NUCLEUS_DURATION)).A04(this.A0W.A01()).A03(this.A0W.A0C()));
        }
        if (!this.A0W.A02().isEmpty()) {
            arrayList.add(new I2(this.A0Z).A02(new FU(this.A0Z, -1, -1, DB.GRID_4)).A04(this.A0W.A02()).A03(this.A0W.A03()));
        }
        for (int i = 0; i < Math.min(3, arrayList.size()); i++) {
            linearLayout.addView((View) arrayList.get(i));
        }
        linearLayout.setId(View.generateViewId());
        return linearLayout;
    }

    private RelativeLayout.LayoutParams A07(LinearLayout linearLayout) {
        int i;
        int i2 = this.A0Z.getResources().getConfiguration().orientation;
        if (linearLayout == null || this.A0R || i2 == 2) {
            int orientation = this.A01;
            i = (-orientation) / 4;
        } else {
            int orientation2 = this.A01;
            i = (-orientation2) / 2;
        }
        int i3 = this.A01;
        int orientation3 = this.A01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, orientation3);
        layoutParams.setMargins(0, i, 0, 0);
        layoutParams.addRule(14);
        return layoutParams;
    }

    private RelativeLayout.LayoutParams A08(LinearLayout linearLayout, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        if (this.A0b != null) {
            this.A0b.setTextColor(A00(this.A0V.A01().A04()));
            D3.A0Q(this.A0b, D3.A06(this.A0V.A01().A04(), 40));
        }
        if (linearLayout != null) {
            layoutParams.addRule(3, linearLayout.getId());
            layoutParams.setMargins(this.A0A, this.A0D + this.A00, this.A0A, 0);
        } else {
            layoutParams.addRule(3, textView.getId());
            layoutParams.setMargins(this.A0A, this.A09 + this.A00, this.A0A, 0);
        }
        return layoutParams;
    }

    private RelativeLayout A09() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0Z);
        LinearLayout.LayoutParams layoutParams = A04();
        relativeLayout.setClipChildren(false);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setId(View.generateViewId());
        return relativeLayout;
    }

    private TextView A0A(RelativeLayout relativeLayout, C0709Ff c0709Ff) {
        TextView textView = new TextView(this.A0Z);
        textView.setText(this.A0W.A0F());
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(30.0f);
        textView.setTextAlignment(4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, c0709Ff.getId());
        layoutParams.setMargins(this.A0A, this.A0C, this.A0A, 0);
        textView.setLayoutParams(layoutParams);
        relativeLayout.addView(textView);
        textView.setId(View.generateViewId());
        return textView;
    }

    private MG A0B(ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        this.A0P.setLayoutManager(new C1900lC(this.A0Z, 0, false));
        FrameLayout.LayoutParams screenshotsRecyclerViewParams = A01();
        this.A0P.setLayoutParams(screenshotsRecyclerViewParams);
        int i = 4;
        if (this.A0Z.getResources().getConfiguration().orientation == 2) {
            i = 2;
        }
        this.A0P.setAdapter(new C1379cd(this.A0Z, this.A0X.A02(), this.A0F, this.A0P, viewOnClickListenerC1617gW, i));
        return this.A0P;
    }

    private C0709Ff A0D(LinearLayout linearLayout) {
        C0709Ff c0709Ff = new C0709Ff(this.A0Z);
        c0709Ff.setRadius(30);
        D3.A0K(c0709Ff, 0);
        AsyncTaskC1623gc downloadImageTask = new AsyncTaskC1623gc(c0709Ff, this.A0Z).A04();
        downloadImageTask.A07(this.A0Y.A01());
        c0709Ff.setLayoutParams(A07(linearLayout));
        c0709Ff.setId(View.generateViewId());
        return c0709Ff;
    }

    private void A0F() {
        Bitmap scaledBitmap;
        final boolean zA05 = this.A0X.A05();
        if (zA05) {
            scaledBitmap = DC.A01(DB.SKIP_ARROW_APP_INSTALL);
        } else {
            scaledBitmap = DC.A01(DB.NAV_CROSS);
        }
        Bitmap scaledBitmap2 = Bitmap.createScaledBitmap(scaledBitmap, this.A0B, this.A0B, true);
        this.A0K = new ImageView(this.A0Z);
        this.A0K.setImageBitmap(scaledBitmap2);
        this.A0K.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0E(7, 9, 61)));
        this.A0K.setBackground(circleBackground);
        this.A0K.setPadding(this.A07, this.A07, this.A07, this.A07);
        this.A0K.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Hu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0T(zA05, view);
            }
        });
        this.A0K.setLayoutParams(A02());
        this.A0T.addView(this.A0K);
        this.A0L = null;
        if (this.A0X.A00() > 0) {
            boolean shouldShowThirdEndCard = this.A0U.A1o();
            if (shouldShowThirdEndCard) {
                this.A0L = A03();
                this.A0T.addView(this.A0L);
            }
            I1.A01(this.A0Z, this.A0K, this.A0X.A00(), this.A0L);
        }
    }

    private void A0G() {
        if (this.A0b != null) {
            A0M(this.A0N, this.A0b, this.A0M, this.A0O);
            String[] strArr = A0e;
            if (strArr[6].charAt(0) == strArr[0].charAt(0)) {
                throw new RuntimeException();
            }
            A0e[1] = "ppz6iX8Db8cBXV1NkZFvhJGHZsoHwG5T";
            A0L(this.A0N, this.A0b);
        }
    }

    private void A0H() {
        this.A0H *= this.A0S;
        this.A0G *= this.A0S;
        this.A04 *= this.A0S;
        this.A0I *= this.A0S;
        this.A0J *= this.A0S;
        this.A05 *= this.A0S;
        this.A01 *= this.A0S;
        this.A06 *= this.A0S;
        this.A02 *= this.A0S;
        this.A03 *= this.A0S;
        this.A09 *= this.A0S;
        this.A0D *= this.A0S;
        this.A0C *= this.A0S;
        this.A0B *= this.A0S;
        this.A0A *= this.A0S;
        this.A08 *= this.A0S;
        this.A07 *= this.A0S;
        this.A0F *= this.A0S;
        this.A0E *= this.A0S;
    }

    private void A0I() {
        ViewParent parent = this.A0T.getParent();
        boolean z = parent instanceof ViewGroup;
        String strA0E = A0E(16, 45, 8);
        if (!z) {
            this.A0a.A4Z(strA0E);
            return;
        }
        ((ViewGroup) parent).removeView(this.A0T);
        String[] strArr = A0e;
        if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A0e[2] = "R58z0cOD";
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof ViewGroup) {
            this.A0c.set(true);
            ((ViewGroup) parent.getParent()).addView(new G9(this.A0Z, this.A0U, this.A0a).A09(this.A0b, this.A0Q));
            return;
        }
        this.A0a.A4Z(strA0E);
    }

    private void A0K(RelativeLayout relativeLayout) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{100.0f, 100.0f, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().setColor(Color.argb(230, 13, 13, 13));
        relativeLayout.setBackground(shapeDrawable);
    }

    private void A0L(RelativeLayout relativeLayout, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        LinearLayout linearLayout = new LinearLayout(this.A0Z);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, viewOnClickListenerC1617gW.getId());
        layoutParams.addRule(14);
        layoutParams.setMargins(0, this.A08, 0, this.A08);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(this.A0Z);
        textView.setText(this.A0W.A07());
        textView.setTextSize(10.0f);
        linearLayout.setId(View.generateViewId());
        FU iconView = new FU(this.A0Z, -1, -1, DB.GOOGLE_PLAY_STORE);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.A08, this.A08);
        layoutParams2.rightMargin = this.A0E;
        iconView.setLayoutParams(layoutParams2);
        iconView.setAlpha(0.5f);
        linearLayout.addView(iconView);
        linearLayout.addView(textView);
        relativeLayout.addView(linearLayout);
    }

    private void A0M(RelativeLayout relativeLayout, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, LinearLayout linearLayout, TextView textView) {
        RelativeLayout.LayoutParams layoutParamsA08 = A08(linearLayout, textView);
        viewOnClickListenerC1617gW.setIncludeFontPadding(false);
        viewOnClickListenerC1617gW.setLayoutParams(layoutParamsA08);
        viewOnClickListenerC1617gW.A09();
        viewOnClickListenerC1617gW.setHeight(this.A02);
        viewOnClickListenerC1617gW.setTextSize(18.0f);
        viewOnClickListenerC1617gW.setCornerRadiusPx(40);
        viewOnClickListenerC1617gW.setTextColor(A00(this.A0V.A01().A04()));
        D3.A0Q(viewOnClickListenerC1617gW, D3.A06(this.A0V.A01().A04(), 40));
        viewOnClickListenerC1617gW.setId(View.generateViewId());
        if (viewOnClickListenerC1617gW.getParent() != null) {
            ((ViewGroup) viewOnClickListenerC1617gW.getParent()).removeView(viewOnClickListenerC1617gW);
        }
        relativeLayout.addView(viewOnClickListenerC1617gW);
        String[] strArr = A0e;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[6] = "8zkkPZUpUKfzaqOn5D7DKafOgXWnQm3O";
        strArr2[0] = "dX4UD2PNpDYdvYGpKlyYeFfcBh95RD7k";
    }

    private void A0N(final InterfaceC0780Hy interfaceC0780Hy) {
        final ImageView imageView = new ImageView(this.A0Z);
        imageView.setAdjustViewBounds(true);
        AsyncTaskC1623gc asyncTaskC1623gc = new AsyncTaskC1623gc(imageView, this.A0Z);
        if (!this.A0X.A02().isEmpty()) {
            asyncTaskC1623gc.A06(new FA() { // from class: com.facebook.ads.redexgen.X.cg
                @Override // com.facebook.ads.redexgen.core.FA
                public final void ADM(boolean z) {
                    this.A02.A0R(imageView, interfaceC0780Hy, z);
                }
            });
            asyncTaskC1623gc.A07(this.A0X.A02().get(0));
        } else {
            interfaceC0780Hy.ADO();
        }
    }

    public final FrameLayout A0O() {
        this.A0T.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (this.A0Z.getResources().getConfiguration().orientation == 2) {
            int orientation = this.A06;
            this.A01 = orientation;
        }
        View view = new View(this.A0Z);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int orientation2 = Color.parseColor(A0E(0, 7, 28));
        view.setBackgroundColor(orientation2);
        this.A0T.addView(view);
        final LinearLayout linearLayout = A05();
        this.A0N = A09();
        if (C05789m.A1B(this.A0Z)) {
            this.A0N.setOnClickListener(new ViewOnClickListenerC0778Hw(this));
        }
        A0K(this.A0N);
        this.A0M = A06();
        this.A0Q = A0D(this.A0M);
        this.A0N.addView(this.A0Q);
        this.A0O = A0A(this.A0N, this.A0Q);
        if (this.A0M != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(14);
            layoutParams.setMargins(0, this.A0D, 0, 0);
            layoutParams.addRule(3, this.A0O.getId());
            this.A0N.addView(this.A0M, layoutParams);
        }
        A0N(new InterfaceC0780Hy() { // from class: com.facebook.ads.redexgen.X.ch
            @Override // com.facebook.ads.redexgen.core.InterfaceC0780Hy
            public final void ADO() {
                this.A01.A0S(linearLayout);
            }
        });
        return this.A0T;
    }

    public final void A0P(int i) {
        if (!this.A0c.get()) {
            C1379cd c1379cd = (C1379cd) this.A0P.getAdapter();
            if (this.A0b != null) {
                A08(this.A0M, this.A0O);
            }
            if (i == 2) {
                this.A01 = this.A06;
                this.A00 = 0;
                c1379cd.A0G(2);
            } else {
                this.A01 = this.A05;
                if (this.A0R) {
                    this.A00 = this.A04;
                }
                c1379cd.A0G(4);
            }
            this.A0P.setLayoutParams(A01());
            this.A0N.setLayoutParams(A04());
            this.A0Q.setLayoutParams(A07(this.A0M));
            if (this.A0b != null) {
                this.A0b.setLayoutParams(A08(this.A0M, this.A0O));
            }
            this.A0K.setLayoutParams(A02());
        }
    }

    public final /* synthetic */ void A0Q(View view) {
        if (this.A0b != null) {
            this.A0b.A0A(A0E(61, 4, 36));
        }
    }

    public final /* synthetic */ void A0R(ImageView imageView, InterfaceC0780Hy interfaceC0780Hy, boolean z) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int imageWidth = drawable.getIntrinsicWidth();
            if (imageWidth > drawable.getIntrinsicHeight()) {
                this.A0R = true;
                int imageWidth2 = this.A0Z.getResources().getConfiguration().orientation;
                if (imageWidth2 == 2) {
                    this.A00 = 0;
                } else {
                    int i = this.A04;
                    if (A0e[2].length() == 29) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0e;
                    strArr[4] = "RMUZgnWJNuGzwI2EAm9G1TXGxCSLP07H";
                    strArr[3] = "obx9pmFGtwUUAzpsWFAEaXMOw8pAi0u9";
                    this.A00 = i;
                }
            }
        }
        interfaceC0780Hy.ADO();
    }

    public final /* synthetic */ void A0S(LinearLayout linearLayout) {
        this.A0P = A0B(this.A0b);
        this.A0T.addView(this.A0P);
        A0G();
        linearLayout.addView(this.A0N);
        if (this.A0U.A1p()) {
            View view = new View(this.A0Z);
            view.setOnClickListener(new ViewOnClickListenerC0779Hx(this));
            if (this.A0Z.getResources().getConfiguration().orientation == 2) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A0J, 48));
            } else {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A0I, 48));
            }
            this.A0T.addView(view);
        }
        A0F();
        this.A0T.addView(linearLayout);
    }

    public final /* synthetic */ void A0T(boolean z, View view) {
        if (z) {
            A0I();
        } else {
            this.A0a.A4Z(A0E(16, 45, 8));
        }
    }
}
