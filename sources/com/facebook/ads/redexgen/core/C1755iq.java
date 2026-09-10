package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.umeng.analytics.pro.cw;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1755iq extends C05026m implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1828k1 A01;
    public AP A02;
    public C0874Lp A04;
    public KA A05;
    public ViewOnClickListenerC0788Ig A06;
    public JK A07;
    public JL A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final IL A0C = new C1761iw(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public AZ A03 = AZ.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{11, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, 28, 35, 47, 61, 28, 35, 46, 47, 37, 106, 35, 57, 106, 36, 63, 38, 38, 113, 106, 63, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, cw.m, 91, 64, cw.m, 73, 70, 65, 75, cw.m, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, 64, cw.m, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0E();
        A0H = C1755iq.class.getSimpleName();
    }

    private C1760iv A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C1760iv(this, mediaViewVideoRendererApi);
    }

    private C1759iu A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C1759iu(this, mediaViewVideoRendererApi);
    }

    private C1757is A02() {
        return new C1757is(this);
    }

    private JL A05() {
        return new JL(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            C0874Lp c0874Lp = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((IM) c0874Lp.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new AO(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((IM) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            JI state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == JI.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = AZ.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C1744ie c1744ie, AP ap) {
        String url;
        this.A0A = false;
        this.A0B = false;
        this.A02 = ap;
        A09();
        KA ka = this.A05;
        if (c1744ie != null && c1744ie.getAdCoverImage() != null) {
            AU adCoverImage = c1744ie.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            url = adCoverImage.getUrl();
        } else {
            url = null;
        }
        ka.setImage(url, new C1758it(this));
        this.A03 = c1744ie.A19();
        this.A06.setPlayAccessibilityLabel(c1744ie.A1F());
        this.A06.setPauseAccessibilityLabel(c1744ie.A1E());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(IP ip) {
        if (this.A04 != null) {
            this.A04.A0g(ip, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == JI.A06) {
            return false;
        }
        return this.A03 == AZ.A05 || this.A03 == AZ.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        AR arA01;
        ((C05026m) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i) {
            case 0:
                arA01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                arA01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((C05116v) mediaViewVideoRendererApi).A06(arA01);
        this.A01 = C05056p.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new KA(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = CP.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new ViewOnClickListenerC0788Ig(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            int i3 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i2 < i3) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C0874Lp) {
                    this.A04 = (C0874Lp) childAt;
                } else {
                    i2++;
                }
            }
        }
        if (this.A04 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0h(this.A05);
            C0874Lp c0874Lp = this.A04;
            ViewOnClickListenerC0788Ig viewOnClickListenerC0788Ig = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                c0874Lp.A0h(viewOnClickListenerC0788Ig);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                c0874Lp.A0h(viewOnClickListenerC0788Ig);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        arA01.AIa();
    }

    @Override // com.facebook.ads.redexgen.core.C05026m, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.C05026m, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean zA0r = C05789m.A0r(this.A01);
        this.A00.setOnTouchListener(new AN(this, zA0r));
        if (!zA0r) {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C05026m, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.C05026m, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
