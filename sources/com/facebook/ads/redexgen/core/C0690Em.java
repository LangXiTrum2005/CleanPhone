package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0690Em extends LinearLayout {
    public static byte[] A0F;
    public static String[] A0G = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0H;
    public static final int A0I;
    public static final Uri A0J;
    public static final View.OnTouchListener A0K;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public InterfaceC0689El A05;
    public C0696Es A06;
    public String A07;
    public final float A08;
    public final WebView A09;
    public final C1828k1 A0A;
    public final InterfaceC0700Ew A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0F = new byte[]{-23, 8, 10, 18, -114, -73, -70, -66, -80, -22, 19, 22, 27, 5, 22, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, -39, -42, -34, -38, -52, -39, -6, -5, 8, cw.l, cw.k, -45, -5, 5, -6, 7, 4, 23, 36, 26, 40, 37, 31, 26, -28, 31, 36, 42, 27, 36, 42, -28, 23, 25, 42, 31, 37, 36, -28, 12, -1, -5, cw.k, 18, 30, 28, -35, cw.n, 29, 19, 33, 30, 24, 19, -35, 18, 23, 33, 30, 28, 20, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    static {
        A0A();
        A0H = Color.rgb(224, 224, 224);
        A0J = C5.A00(A06(90, 23, 25));
        A0K = new ViewOnTouchListenerC0684Eg();
        A0I = Color.argb(34, 0, 0, 0);
    }

    public C0690Em(C1828k1 c1828k1, WebView webView) {
        this(c1828k1, webView, false, false);
    }

    public C0690Em(C1828k1 c1828k1, WebView webView, boolean z, boolean z2) {
        super(c1828k1);
        this.A08 = getResources().getDisplayMetrics().density;
        this.A0B = new C1659hC(this);
        this.A09 = webView;
        this.A0A = c1828k1;
        this.A0C = AbstractC05799n.A06(c1828k1);
        this.A0E = z;
        this.A0D = z2;
        A08();
        if (z2) {
            A0C(false);
        }
    }

    private void A08() {
        int buttonSizePx;
        int i = (int) (this.A08 * 50.0f);
        D3.A0K(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A0A);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(DC.A01(DB.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0K);
        this.A01.setOnClickListener(new ViewOnClickListenerC0685Eh(this));
        addView(this.A01, layoutParams);
        if (this.A0C && !C05789m.A2m(this.A0A)) {
            this.A00 = new ImageView(this.A0A);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            ViewGroup.LayoutParams backButtonParams = new LinearLayout.LayoutParams(i, i);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(DC.A01(DB.BACK_ARROW));
            this.A00.setOnTouchListener(A0K);
            this.A00.setOnClickListener(new ViewOnClickListenerC0686Ei(this));
            addView(this.A00, backButtonParams);
        }
        this.A06 = new C0696Es(this.A0A);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0C || C05789m.A2m(this.A0A)) {
            buttonSizePx = 1056964608;
        } else {
            buttonSizePx = 1065353216;
        }
        layoutParams2.weight = buttonSizePx;
        this.A06.setGravity(17);
        if (C05789m.A2m(this.A0A) && !this.A0E) {
            this.A04 = new LinearLayout(this.A0A);
            this.A04.setOrientation(1);
            LinearLayout linearLayout = this.A04;
            int i2 = (int) (this.A08 * 2.0f);
            int buttonSizePx2 = (int) (this.A08 * 2.0f);
            linearLayout.setPadding(0, i2, 0, buttonSizePx2);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView = new ImageView(this.A0A);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(DC.A01(DB.HANDLER));
            int i3 = (int) (this.A08 * 4.0f);
            int buttonSizePx3 = (int) (this.A08 * 4.0f);
            imageView.setPadding(0, i3, 0, buttonSizePx3);
            this.A04.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A06, titleViewsParams);
        } else {
            addView(this.A06, layoutParams2);
        }
        if (this.A0C && !C05789m.A2m(this.A0A)) {
            this.A02 = new ImageView(this.A0A);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            ViewGroup.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(i, i);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(DC.A02(DB.BACK_ARROW));
            this.A02.setOnTouchListener(A0K);
            this.A02.setOnClickListener(new ViewOnClickListenerC0687Ej(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A0A);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0K);
        this.A03.setOnClickListener(new ViewOnClickListenerC0688Ek(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    private void A09() {
        PackageManager packageManager;
        Bitmap externalBrowserBitmap = null;
        boolean zA0j = C05789m.A0j(this.A0A);
        if (!zA0j && (packageManager = this.A0A.getPackageManager()) != null) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent(A06(46, 26, 123), A0J), 65536);
            if (listQueryIntentActivities.isEmpty()) {
                this.A03.setVisibility(8);
            } else if (listQueryIntentActivities.size() == 1) {
                ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
                String[] strArr = A0G;
                if (strArr[4].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                A0G[6] = "Y9G9nX";
                if (resolveInfo.activityInfo != null) {
                    ResolveInfo resolveInfo2 = listQueryIntentActivities.get(0);
                    if (A0G[2].length() != 9) {
                        String[] strArr2 = A0G;
                        strArr2[7] = "hqSHhnICOqiHaN8u87jsv4Qx8TBqcflH";
                        strArr2[3] = "kBU630hheaj535sYoezwG0Sk33mkxVnX";
                        if (A06(72, 18, 116).equals(resolveInfo2.activityInfo.packageName)) {
                            externalBrowserBitmap = DC.A01(DB.BROWSER_LAUNCH_CHROME);
                        } else {
                            externalBrowserBitmap = getExternalBrowserBitmap();
                        }
                    } else if (A06(72, 18, 116).equals(resolveInfo2.activityInfo.packageName)) {
                        externalBrowserBitmap = DC.A01(DB.BROWSER_LAUNCH_CHROME);
                    } else {
                        externalBrowserBitmap = getExternalBrowserBitmap();
                    }
                } else {
                    externalBrowserBitmap = getExternalBrowserBitmap();
                }
            } else {
                externalBrowserBitmap = getExternalBrowserBitmap();
            }
        }
        if (C05789m.A2m(this.A0A) || zA0j) {
            this.A03.setVisibility(0);
            externalBrowserBitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(externalBrowserBitmap);
    }

    private void A0C(boolean z) {
        int i = z ? 0 : 8;
        ImageView imageView = this.A00;
        if (A0G[1].charAt(15) == 'W') {
            throw new RuntimeException();
        }
        A0G[2] = "nknH3C2";
        if (imageView != null) {
            this.A00.setVisibility(i);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (z) {
            A0C(true);
        }
    }

    public InterfaceC0700Ew getBrowserNavigationListener() {
        return this.A0B;
    }

    private Bitmap getExternalBrowserBitmap() {
        if (this.A0D) {
            return DC.A01(DB.BROWSER_LAUNCH_NATIVE_V2);
        }
        return DC.A01(DB.BROWSER_LAUNCH_NATIVE);
    }

    public void setCloseButtonVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setListener(InterfaceC0689El interfaceC0689El) {
        this.A05 = interfaceC0689El;
    }

    public void setTitle(String str) {
        this.A06.setTitle(str);
    }

    public void setUrl(String str) {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A06.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0H, PorterDuff.Mode.SRC_IN));
        } else {
            this.A06.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }
}
