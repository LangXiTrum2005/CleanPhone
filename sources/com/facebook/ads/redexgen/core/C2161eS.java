package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
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
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2161eS {
    public static byte[] A0n;
    public static String[] A0o = {"rlKCEchcqf0ciqqi5AvJfjd9N52fSCy8", "PNo7HsDb73vpBHqbFnDgLDKmrYNJyDDd", "113OeC", "Cx3CvN9GF4y9AfAfmcXjlQVU3pQMYVJa", "l70rAAhZwLIPPR5uDe0F7aYKOgrudYX3", "BVxdVuILB7huRlQ", "M763HrTZfS2tZdU8T7Ka7fPhorhGOaFK", "qRF7Z25uKAZ9gvWIqbx"};
    public ImageView A0M;
    public ImageView A0N;
    public LinearLayout A0O;
    public RelativeLayout A0P;
    public TextView A0Q;
    public TextView A0R;
    public C7M A0S;
    public C1905aJ A0T;
    public C1905aJ A0U;
    public C1909aN A0V;
    public C1994bk A0W;
    public C2029cJ A0X;
    public final Handler A0b;
    public final FrameLayout A0c;
    public final AbstractC2465jd A0d;
    public final NN A0e;
    public final NY A0f;
    public final C1561Nd A0g;
    public final C1570Nm A0h;
    public final C2300gi A0i;
    public final VI A0j;
    public final InterfaceC1841Yh A0k;
    public final ViewOnClickListenerC1498Kr A0l;
    public int A06 = 160;
    public int A07 = 130;
    public int A03 = 56;
    public int A04 = 430;
    public int A0K = 110;
    public int A0L = 70;
    public int A0A = 120;
    public int A0G = 48;
    public int A0F = 44;
    public int A0D = 24;
    public int A0C = 20;
    public int A0B = 16;
    public int A09 = 12;
    public int A08 = 10;
    public int A0H = 8;
    public int A0E = 4;
    public int A0J = IronSourceError.ERROR_AD_UNIT_CAPPED;
    public int A0I = 300;
    public int A05 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
    public boolean A0Y = false;
    public final AtomicBoolean A0m = new AtomicBoolean(false);
    public int A00 = 0;
    public int A02 = 0;
    public int A01 = this.A06;
    public boolean A0Z = true;
    public final int A0a = (int) XX.A02;

    public static String A0H(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0n, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 50;
            String[] strArr = A0o;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0o[2] = "GQ96jzl1cN6JO8qYFngU1";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0n = new byte[]{13, 31, 111, 31, 111, 31, 111, 44, 55, 63, 63, 63, 63, 63, 63, 63, 91, 84, 101, 91, 89, 78, 83, 76, 83, 78, 67, 117, 121, 123, 56, 112, 119, 117, 115, 116, 121, 121, 125, 56, 119, 114, 101, 56, AbstractJsonLexerKt.TC_INVALID, 120, 98, 115, 100, 101, 98, AbstractJsonLexerKt.TC_INVALID, 98, AbstractJsonLexerKt.TC_INVALID, 119, 122, 56, 112, AbstractJsonLexerKt.TC_INVALID, 120, AbstractJsonLexerKt.TC_INVALID, 101, 126, 73, 119, 117, 98, AbstractJsonLexerKt.TC_INVALID, 96, AbstractJsonLexerKt.TC_INVALID, 98, 111, 88, 83, 89, 126, 92, 79, 89, 107, 15, 110, 94, 79, 88, 88, 83, 78, 85, 82, 73, 111, 88, 94, 68, 94, 81, 88, 79, 124, 89, 92, 77, 73, 88, 79, 29, 84, 78, 29, 83, 72, 81, 81, 21, 13, 15, 22};
    }

    static {
        A0M();
    }

    public C2161eS(final C2300gi c2300gi, AbstractC2465jd abstractC2465jd, InterfaceC1841Yh interfaceC1841Yh, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr, Handler handler, VI vi) {
        this.A0i = c2300gi;
        this.A0d = abstractC2465jd;
        this.A0j = vi;
        this.A0h = abstractC2465jd.A2C();
        this.A0g = abstractC2465jd.A29().A0K();
        this.A0k = interfaceC1841Yh;
        this.A0b = handler;
        this.A0f = abstractC2465jd.A29().A0I();
        this.A0e = abstractC2465jd.A28();
        this.A0l = viewOnClickListenerC1498Kr;
        this.A0S = new C7M(c2300gi) { // from class: com.facebook.ads.redexgen.X.1E
            @Override // com.facebook.ads.redexgen.core.C7M, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.C7M, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        this.A0P = new RelativeLayout(c2300gi);
        this.A0W = new C1994bk(c2300gi);
        this.A0R = new TextView(c2300gi);
        this.A0M = new ImageView(c2300gi);
        this.A0c = new FrameLayout(this.A0i);
        A0K();
    }

    public static int A00(int i2) {
        if (P3.A01(i2, -1) >= 4.5d) {
            return -1;
        }
        return -16777216;
    }

    private FrameLayout.LayoutParams A01() {
        if (this.A0i.getResources().getConfiguration().orientation == 2) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i2 = this.A0L;
            int orientation = this.A0C;
            layoutParams.setMargins(0, i2, 0, orientation);
            return layoutParams;
        }
        int orientation2 = this.A0Y ? this.A0I : this.A0J;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, orientation2);
        int orientation3 = this.A0K;
        layoutParams2.setMargins(0, orientation3, 0, 0);
        return layoutParams2;
    }

    private FrameLayout.LayoutParams A02() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, this.A0G, this.A09, 0);
        return layoutParams;
    }

    private ImageView A03() {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(YN.A01(YM.OTHER_SKIP), this.A0C, this.A0C, true);
        ImageView imageView = new ImageView(this.A0i);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A0H(7, 9, 61)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A08, this.A08, this.A08, this.A08);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.eO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0b(view);
            }
        });
        if (this.A0l != null && this.A0l.getCtaActionHelper().A06() == null) {
            this.A0l.getCtaActionHelper().A07(new InterfaceC1550Mr() { // from class: com.facebook.ads.redexgen.X.FQ
                @Override // com.facebook.ads.redexgen.core.InterfaceC1550Mr
                public final void ACk() {
                    this.A00.A0Z();
                }
            });
        }
        imageView.setLayoutParams(A02());
        imageView.setVisibility(0);
        return imageView;
    }

    private LinearLayout.LayoutParams A04() {
        int width = this.A0i.getResources().getConfiguration().orientation;
        int i2 = -1;
        int i3 = -2;
        int i4 = 0;
        if (width == 2) {
            i2 = this.A04;
            i3 = -2;
            String[] strArr = A0o;
            String str = strArr[6];
            String str2 = strArr[0];
            int width2 = str.charAt(0);
            int orientation = str2.charAt(0);
            if (width2 == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[4] = "2Ia5vAscFxMcZ1ZcpDs6xoNSTk8YU4BA";
            strArr2[3] = "l5LN0cSfS0eMNqZA7sTWe2HczOJrVC6l";
            i4 = this.A0B;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i3);
        layoutParams.gravity = 81;
        int height = this.A0B;
        int width3 = this.A0B;
        layoutParams.setMargins(height, i4, width3, 0);
        return layoutParams;
    }

    private LinearLayout A05() {
        LinearLayout linearLayout = new LinearLayout(this.A0i);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setGravity(80);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private LinearLayout A06() {
        String strA09;
        LinearLayout linearLayout = new LinearLayout(this.A0i);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (this.A0f.A0C().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2164eV(this.A0i).A02(new C1983bZ(this.A0i, -1, -1, YM.RATINGS)).A04(this.A0f.A0C()).A03(this.A0f.A0B()));
        if (!this.A0f.A09().isEmpty()) {
            try {
                strA09 = AbstractC1814Xg.A01(Integer.parseInt(this.A0f.A09()));
            } catch (NumberFormatException unused) {
                strA09 = this.A0f.A09();
            }
            arrayList.add(new C2164eV(this.A0i).A02(new C1983bZ(this.A0i, -1, -1, YM.NUCLEUS_GROUP)).A04(strA09).A03(this.A0f.A0A()));
        }
        if (!this.A0f.A05().isEmpty()) {
            arrayList.add(new C2164eV(this.A0i).A02(new C1983bZ(this.A0i, -1, -1, YM.DOWNLOAD)).A04(this.A0f.A05()).A03(this.A0f.A06()));
        }
        NY ny = this.A0f;
        if (A0o[2].length() == 29) {
            throw new RuntimeException();
        }
        A0o[2] = "3vpsIj";
        if (!ny.A01().isEmpty()) {
            arrayList.add(new C2164eV(this.A0i).A02(new C1983bZ(this.A0i, -1, -1, YM.NUCLEUS_DURATION)).A04(this.A0f.A01()).A03(this.A0f.A0D()));
        }
        if (!this.A0f.A02().isEmpty()) {
            arrayList.add(new C2164eV(this.A0i).A02(new C1983bZ(this.A0i, -1, -1, YM.GRID_4)).A04(this.A0f.A02()).A03(this.A0f.A03()));
        }
        for (int i2 = 0; i2 < Math.min(3, arrayList.size()); i2++) {
            linearLayout.addView((View) arrayList.get(i2));
        }
        linearLayout.setId(View.generateViewId());
        return linearLayout;
    }

    private LinearLayout A07(RelativeLayout relativeLayout, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        LinearLayout linearLayout = new LinearLayout(this.A0i);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, viewOnClickListenerC1498Kr.getId());
        layoutParams.addRule(14);
        layoutParams.setMargins(0, this.A0H, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(this.A0i);
        textView.setText(this.A0f.A07());
        textView.setTextSize(10.0f);
        linearLayout.setId(View.generateViewId());
        C1983bZ iconView = new C1983bZ(this.A0i, -1, -1, YM.GOOGLE_PLAY_STORE);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.A09, this.A09);
        layoutParams2.rightMargin = this.A0E;
        iconView.setLayoutParams(layoutParams2);
        iconView.setAlpha(0.5f);
        linearLayout.addView(iconView);
        linearLayout.addView(textView);
        relativeLayout.addView(linearLayout);
        return linearLayout;
    }

    private RelativeLayout.LayoutParams A08(LinearLayout linearLayout) {
        int i2;
        int i3 = this.A0i.getResources().getConfiguration().orientation;
        if (linearLayout == null || this.A0Y || i3 == 2) {
            int orientation = this.A01;
            i2 = (-orientation) / 4;
        } else {
            int orientation2 = this.A01;
            i2 = (-orientation2) / 2;
        }
        int i4 = this.A01;
        int orientation3 = this.A01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, orientation3);
        layoutParams.setMargins(0, i2, 0, 0);
        layoutParams.addRule(14);
        return layoutParams;
    }

    private RelativeLayout.LayoutParams A09(LinearLayout linearLayout, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        if (this.A0l != null) {
            this.A0l.setTextColor(A00(this.A0e.A01().A04()));
            YB.A0V(this.A0l, YB.A06(this.A0e.A01().A04(), 40));
        }
        if (linearLayout != null) {
            layoutParams.addRule(3, linearLayout.getId());
            layoutParams.setMargins(this.A0B, this.A0D + this.A00 + this.A02, this.A0B, 0);
        } else {
            layoutParams.addRule(3, textView.getId());
            layoutParams.setMargins(this.A0B, this.A0A + this.A00 + this.A02, this.A0B, 0);
        }
        return layoutParams;
    }

    private RelativeLayout.LayoutParams A0A(TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, this.A0D + this.A02, 1, 0);
        layoutParams.addRule(3, textView.getId());
        return layoutParams;
    }

    private RelativeLayout.LayoutParams A0B(C1994bk c1994bk) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, c1994bk.getId());
        layoutParams.setMargins(this.A0B, this.A0D + this.A02, this.A0B, 0);
        return layoutParams;
    }

    private RelativeLayout A0C() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0i);
        LinearLayout.LayoutParams layoutParams = A04();
        relativeLayout.setClipChildren(false);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setId(View.generateViewId());
        return relativeLayout;
    }

    private TextView A0D(RelativeLayout relativeLayout, TextView textView) {
        if (TextUtils.isEmpty(this.A0d.A29().A0I().A08())) {
            return null;
        }
        TextView textView2 = new TextView(this.A0i);
        textView2.setText(this.A0d.A29().A0I().A08());
        textView2.setTextColor(-855638017);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setTypeface(Typeface.DEFAULT);
        textView2.setTextSize(12.0f);
        textView2.setTextAlignment(4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, textView.getId());
        textView2.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, XV.A0v, 0, 0);
        relativeLayout.addView(textView2);
        YB.A0K(textView2);
        return textView2;
    }

    private TextView A0E(RelativeLayout relativeLayout, C1994bk c1994bk) {
        TextView textView = new TextView(this.A0i);
        textView.setText(this.A0f.A0G());
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(30.0f);
        textView.setTextAlignment(4);
        textView.setLayoutParams(A0B(c1994bk));
        relativeLayout.addView(textView);
        textView.setId(View.generateViewId());
        return textView;
    }

    private C1994bk A0G(LinearLayout linearLayout) {
        C1994bk c1994bk = new C1994bk(this.A0i);
        c1994bk.setRadius(30);
        YB.A0N(c1994bk, 0);
        LM downloadImageTask = new LM(c1994bk, this.A0i).A04();
        downloadImageTask.A07(this.A0h.A01());
        c1994bk.setLayoutParams(A08(linearLayout));
        c1994bk.setId(View.generateViewId());
        return c1994bk;
    }

    private void A0I() {
        Bitmap scaledBitmap;
        final boolean zA05 = this.A0g.A05();
        if (zA05) {
            scaledBitmap = YN.A01(YM.SKIP_ARROW_APP_INSTALL);
        } else {
            scaledBitmap = YN.A01(YM.NAV_CROSS);
        }
        Bitmap scaledBitmap2 = Bitmap.createScaledBitmap(scaledBitmap, this.A0C, this.A0C, true);
        this.A0M = new ImageView(this.A0i);
        this.A0M.setImageBitmap(scaledBitmap2);
        this.A0M.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0H(7, 9, 61)));
        this.A0M.setBackground(circleBackground);
        this.A0M.setPadding(this.A08, this.A08, this.A08, this.A08);
        this.A0M.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.eN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0g(zA05, view);
            }
        });
        this.A0M.setLayoutParams(A02());
        this.A0c.addView(this.A0M);
        boolean shouldShowThirdEndCard = this.A0Z;
        if (!shouldShowThirdEndCard) {
            this.A0M.setVisibility(8);
        }
        this.A0N = null;
        boolean shouldShowThirdEndCard2 = this.A0Z;
        if (shouldShowThirdEndCard2 && this.A0g.A00() > 0) {
            boolean shouldShowThirdEndCard3 = this.A0d.A2P();
            if (shouldShowThirdEndCard3) {
                this.A0N = A03();
                this.A0c.addView(this.A0N);
            }
            AbstractC2163eU.A01(this.A0i, this.A0M, this.A0g.A00(), this.A0N);
        }
    }

    private void A0J() {
        if (this.A0l != null) {
            RelativeLayout relativeLayout = this.A0P;
            String[] strArr = A0o;
            if (strArr[6].charAt(0) == strArr[0].charAt(0)) {
                throw new RuntimeException();
            }
            A0o[1] = "ppz6iX8Db8cBXV1NkZFvhJGHZsoHwG5T";
            A0T(relativeLayout, this.A0l, this.A0O, this.A0Q != null ? this.A0Q : this.A0R);
            LinearLayout linearLayoutA07 = A07(this.A0P, this.A0l);
            if (this.A0d.A2M()) {
                A0Q(this.A0P, linearLayoutA07, this.A0l);
            }
            if (this.A0d.A2W()) {
                A0S(this.A0P, linearLayoutA07, this.A0l);
            } else {
                if (!this.A0d.A2V()) {
                    return;
                }
                A0R(this.A0P, linearLayoutA07, this.A0l);
            }
        }
    }

    private void A0K() {
        this.A0J *= this.A0a;
        this.A0I *= this.A0a;
        this.A05 *= this.A0a;
        this.A0K *= this.A0a;
        this.A0L *= this.A0a;
        this.A06 *= this.A0a;
        this.A01 *= this.A0a;
        this.A07 *= this.A0a;
        this.A03 *= this.A0a;
        this.A04 *= this.A0a;
        this.A0A *= this.A0a;
        this.A0G *= this.A0a;
        this.A0F *= this.A0a;
        this.A0D *= this.A0a;
        this.A0C *= this.A0a;
        this.A0B *= this.A0a;
        this.A09 *= this.A0a;
        this.A08 *= this.A0a;
        this.A0H *= this.A0a;
        this.A0E *= this.A0a;
    }

    private void A0L() {
        ViewParent parent = this.A0c.getParent();
        boolean z2 = parent instanceof ViewGroup;
        String strA0H = A0H(27, 45, 36);
        if (!z2) {
            this.A0k.A4j(strA0H);
            return;
        }
        ((ViewGroup) parent).removeView(this.A0c);
        String[] strArr = A0o;
        if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A0o[2] = "R58z0cOD";
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof ViewGroup) {
            this.A0m.set(true);
            this.A0X = new C2029cJ(this.A0i, this.A0d, this.A0j, this.A0b, this.A0k);
            ((ViewGroup) parent.getParent()).addView(this.A0X.A0D(this.A0l, this.A0W));
            return;
        }
        this.A0k.A4j(strA0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void A0Z() {
        YB.A0J(this.A0N);
        this.A0d.A2K(false);
        this.A0d.A29().A0M(-1);
    }

    private void A0O(View view, int i2, float[] fArr) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(i2);
        view.setBackground(shapeDrawable);
    }

    private void A0P(RelativeLayout relativeLayout) {
        A0O(relativeLayout, Color.argb(230, 13, 13, 13), new float[]{100.0f, 100.0f, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private void A0Q(RelativeLayout relativeLayout, LinearLayout linearLayout, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        this.A0T = AbstractC1910aO.A01(this.A0i, false, this.A0d, this.A0j, this.A0k, EnumC1908aM.A02, AbstractC1907aL.A00(this.A0d));
        YB.A0K(this.A0T);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A0B, 0, this.A0B);
        layoutParams.addRule(7, viewOnClickListenerC1498Kr.getId());
        layoutParams.addRule(3, linearLayout.getId());
        this.A0T.setLayoutParams(layoutParams);
        relativeLayout.addView(this.A0T);
    }

    private void A0R(RelativeLayout relativeLayout, LinearLayout linearLayout, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        this.A0U = AbstractC1910aO.A01(this.A0i, false, this.A0d, this.A0j, this.A0k, EnumC1908aM.A02, EnumC1911aP.A04);
        YB.A0K(this.A0U);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A0H, 0, this.A0B);
        layoutParams.addRule(5, viewOnClickListenerC1498Kr.getId());
        layoutParams.addRule(3, linearLayout.getId());
        this.A0U.setLayoutParams(layoutParams);
        relativeLayout.addView(this.A0U);
    }

    private void A0S(RelativeLayout relativeLayout, LinearLayout linearLayout, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        this.A0V = AbstractC1910aO.A02(this.A0i, EnumC1908aM.A02, this.A0d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A0B, 0, this.A0B);
        layoutParams.addRule(5, viewOnClickListenerC1498Kr.getId());
        layoutParams.addRule(3, linearLayout.getId());
        this.A0V.setLayoutParams(layoutParams);
        relativeLayout.addView(this.A0V);
    }

    private void A0T(RelativeLayout relativeLayout, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr, LinearLayout linearLayout, TextView textView) {
        RelativeLayout.LayoutParams layoutParamsA09 = A09(linearLayout, textView);
        viewOnClickListenerC1498Kr.setIncludeFontPadding(false);
        viewOnClickListenerC1498Kr.setLayoutParams(layoutParamsA09);
        viewOnClickListenerC1498Kr.A0D();
        viewOnClickListenerC1498Kr.setHeight(this.A03);
        viewOnClickListenerC1498Kr.setTextSize(18.0f);
        viewOnClickListenerC1498Kr.setCornerRadiusPx(40);
        viewOnClickListenerC1498Kr.setTextColor(A00(this.A0e.A01().A04()));
        YB.A0V(viewOnClickListenerC1498Kr, YB.A06(this.A0e.A01().A04(), 40));
        viewOnClickListenerC1498Kr.setId(View.generateViewId());
        if (viewOnClickListenerC1498Kr.getParent() != null) {
            ((ViewGroup) viewOnClickListenerC1498Kr.getParent()).removeView(viewOnClickListenerC1498Kr);
        }
        relativeLayout.addView(viewOnClickListenerC1498Kr);
        String[] strArr = A0o;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0o;
        strArr2[6] = "8zkkPZUpUKfzaqOn5D7DKafOgXWnQm3O";
        strArr2[0] = "dX4UD2PNpDYdvYGpKlyYeFfcBh95RD7k";
    }

    private void A0U(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        this.A0S.setLayoutManager(new C2370hr(this.A0i, 0, false));
        FrameLayout.LayoutParams screenshotsRecyclerViewParams = A01();
        this.A0S.setLayoutParams(screenshotsRecyclerViewParams);
        int i2 = 4;
        if (this.A0i.getResources().getConfiguration().orientation == 2) {
            i2 = 2;
        }
        this.A0S.setAdapter(new FO(this.A0i, this.A0g.A02(), this.A0H, this.A0S, viewOnClickListenerC1498Kr, i2));
    }

    private void A0V(final InterfaceC2160eR interfaceC2160eR) {
        final ImageView imageView = new ImageView(this.A0i);
        imageView.setAdjustViewBounds(true);
        LM lm = new LM(imageView, this.A0i);
        if (!this.A0g.A02().isEmpty()) {
            lm.A06(new InterfaceC1956b8() { // from class: com.facebook.ads.redexgen.X.FR
                @Override // com.facebook.ads.redexgen.core.InterfaceC1956b8
                public final void AE7(C1955b7 c1955b7) {
                    this.A02.A0c(imageView, interfaceC2160eR, c1955b7);
                }
            });
            lm.A07(this.A0g.A02().get(0));
        } else {
            interfaceC2160eR.AE9();
        }
    }

    public final FrameLayout A0W() {
        this.A0c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int orientation = this.A0i.getResources().getConfiguration().orientation;
        if (orientation == 2) {
            int orientation2 = this.A07;
            this.A01 = orientation2;
        }
        View view = new View(this.A0i);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int orientation3 = Color.parseColor(A0H(0, 7, 28));
        view.setBackgroundColor(orientation3);
        this.A0c.addView(view);
        final LinearLayout linearLayout = A05();
        this.A0P = A0C();
        if (C1750Up.A1D(this.A0i)) {
            this.A0P.setOnClickListener(new ViewOnClickListenerC2158eP(this));
        }
        A0P(this.A0P);
        this.A0O = A06();
        this.A0W = A0G(this.A0O);
        this.A0P.addView(this.A0W);
        this.A0R = A0E(this.A0P, this.A0W);
        this.A0Q = A0D(this.A0P, this.A0R);
        if (this.A0O != null) {
            this.A0O.setLayoutParams(A0A(this.A0Q != null ? this.A0Q : this.A0R));
            this.A0P.addView(this.A0O);
        }
        A0J();
        linearLayout.addView(this.A0P);
        if (this.A0d.A2T()) {
            View blackBackgroundView = new View(this.A0i);
            blackBackgroundView.setOnClickListener(new ViewOnClickListenerC2159eQ(this));
            int orientation4 = this.A0i.getResources().getConfiguration().orientation;
            if (orientation4 == 2) {
                blackBackgroundView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A0L, 48));
            } else {
                blackBackgroundView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A0K, 48));
            }
            this.A0c.addView(blackBackgroundView);
        }
        A0I();
        this.A0c.addView(linearLayout);
        A0V(new InterfaceC2160eR() { // from class: com.facebook.ads.redexgen.X.FX
            @Override // com.facebook.ads.redexgen.core.InterfaceC2160eR
            public final void AE9() {
                this.A01.A0d(linearLayout);
            }
        });
        if (this.A0j != null) {
            VK.A04(this.A0c, this.A0j, VH.A0S);
        }
        FrameLayout frameLayout = this.A0c;
        if (A0o[1].charAt(29) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0o;
        strArr[4] = "M4KdLm6ABwqrDNV9iNEtQhvJeVkDc5WF";
        strArr[3] = "JxvlRLbpjqvrEz4I8nTM6vTNM6szdWyt";
        return frameLayout;
    }

    public final FrameLayout A0X() {
        return this.A0c;
    }

    public final void A0Y() {
        if (this.A0T != null) {
            this.A0T.A0O();
        }
        if (this.A0U != null) {
            this.A0U.A0P();
        }
        if (this.A0X != null) {
            this.A0X.A0F();
        }
    }

    public final void A0a(int i2) {
        if (!this.A0m.get()) {
            FO fo = (FO) this.A0S.getAdapter();
            if (fo == null) {
                this.A0i.A08().ABC(A0H(16, 11, 8), AbstractC1712Td.A0A, new C1713Te(A0H(72, 42, 15)));
            }
            if (this.A0l != null) {
                A09(this.A0O, this.A0Q != null ? this.A0Q : this.A0R);
            }
            if (i2 == 2) {
                this.A01 = this.A07;
                this.A00 = 0;
                if (fo != null) {
                    fo.A0O(2);
                }
                if (this.A0d.A2M()) {
                    this.A02 = -this.A08;
                }
            } else {
                this.A02 = 0;
                this.A01 = this.A06;
                if (this.A0Y) {
                    this.A00 = this.A05;
                    if (this.A0d.A2M()) {
                        this.A00 = this.A05 - this.A0F;
                    }
                }
                if (fo != null) {
                    fo.A0O(4);
                }
            }
            this.A0S.setLayoutParams(A01());
            this.A0P.setLayoutParams(A04());
            this.A0W.setLayoutParams(A08(this.A0O));
            this.A0R.setLayoutParams(A0B(this.A0W));
            if (this.A0O != null) {
                this.A0O.setLayoutParams(A0A(this.A0Q != null ? this.A0Q : this.A0R));
            }
            if (this.A0l != null) {
                this.A0l.setLayoutParams(A09(this.A0O, this.A0Q != null ? this.A0Q : this.A0R));
            }
            this.A0M.setLayoutParams(A02());
        }
    }

    public final /* synthetic */ void A0b(View view) {
        if (this.A0l != null) {
            EnumC1549Mq enumC1549MqA0E = this.A0l.A0E(A0H(114, 4, 84));
            if (this.A0d.A2N()) {
                return;
            }
            EnumC1549Mq actionOutcome = EnumC1549Mq.A09;
            if (enumC1549MqA0E != actionOutcome) {
                EnumC1549Mq actionOutcome2 = EnumC1549Mq.A06;
                if (enumC1549MqA0E != actionOutcome2) {
                    A0Z();
                }
            }
        }
    }

    public final /* synthetic */ void A0c(ImageView imageView, InterfaceC2160eR interfaceC2160eR, C1955b7 c1955b7) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int imageWidth = drawable.getIntrinsicWidth();
            if (imageWidth > drawable.getIntrinsicHeight()) {
                this.A0Y = true;
                int imageWidth2 = this.A0i.getResources().getConfiguration().orientation;
                if (imageWidth2 == 2) {
                    this.A00 = 0;
                } else {
                    this.A00 = this.A05;
                    AbstractC2465jd abstractC2465jd = this.A0d;
                    if (A0o[1].charAt(29) == 'N') {
                        throw new RuntimeException();
                    }
                    A0o[1] = "S95acxw01Fp1FcMeAJU8kfpwrSO3Cs6T";
                    if (abstractC2465jd.A2M()) {
                        this.A00 = this.A05 - this.A0F;
                    }
                }
            }
        }
        interfaceC2160eR.AE9();
    }

    public final /* synthetic */ void A0d(LinearLayout linearLayout) {
        A0U(this.A0l);
        YB.A0J(this.A0S);
        this.A0c.addView(this.A0S);
        linearLayout.bringToFront();
        this.A0M.bringToFront();
    }

    public final void A0e(boolean z2) {
        if (!z2 && this.A0T != null) {
            this.A0T.A0P();
        }
        if (this.A0U != null) {
            C1905aJ c1905aJ = this.A0U;
            String[] strArr = A0o;
            if (strArr[6].charAt(0) == strArr[0].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[4] = "pU4AIYssLBN1acDZt2jXfcrExTRsZlct";
            strArr2[3] = "VzJEZ9FHvuTJuATo3MsieoimYI89kdwu";
            c1905aJ.A0P();
        }
        if (this.A0X != null) {
            this.A0X.A0H(z2);
        }
    }

    public final void A0f(boolean z2) {
        this.A0Z = z2;
    }

    public final /* synthetic */ void A0g(boolean z2, View view) {
        if (z2) {
            A0L();
        } else {
            this.A0i.A0F().AB0();
            this.A0k.A4j(A0H(27, 45, 36));
        }
    }

    public final boolean A0h() {
        return this.A0M != null && this.A0M.getVisibility() == 0;
    }
}
