package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.android.gms.ads.AdSize;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1615Vz extends C1501Rm implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0I;
    public static String[] A0J = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0K;
    public MediaViewVideoRenderer A01;
    public NativeAd.NativeOptions A02;
    public MediaViewVideoRendererApi A03;
    public C2131gi A04;
    public VV A05;
    public C09866r A07;
    public C3S A08;
    public C3L A09;
    public AbstractC2075fo A0A;
    public C2076fp A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final InterfaceC2014ep A0F = new W5(this);
    public final AtomicBoolean A0G = new AtomicBoolean(false);
    public final AtomicBoolean A0H = new AtomicBoolean(false);
    public EnumC1597Vf A06 = EnumC1597Vf.A03;
    public float A00 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0K() {
        A0I = new byte[]{11, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, 28, 35, 47, 61, 28, 35, 46, 47, 37, 106, 35, 57, 106, 36, Utf8.REPLACEMENT_BYTE, 38, 38, 113, 106, Utf8.REPLACEMENT_BYTE, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, 15, 91, RemoteControlWriter.BLOCK_CMDDUMP, 15, 73, 70, 65, 75, 15, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, RemoteControlWriter.BLOCK_CMDDUMP, 15, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0K();
        A0K = C1615Vz.class.getSimpleName();
    }

    private W4 A03(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new W4(this, mediaViewVideoRendererApi);
    }

    private W3 A04(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new W3(this, mediaViewVideoRendererApi);
    }

    private W1 A05() {
        return new W1(this);
    }

    private C2076fp A08() {
        return new C2076fp(this.A01, 50, true, new WeakReference(this.A0A), this.A04);
    }

    private void A0C() {
        if (this.A07 != null) {
            C09866r c09866r = this.A07;
            if (A0J[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0J[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C2015eq) c09866r.getVideoView()).setViewImplInflationListener(this.A0F);
        }
    }

    private void A0D() {
        if (this.A07 != null) {
            this.A07.getVideoView().setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.VQ
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C1615Vz.A0U(view, motionEvent);
                }
            });
        }
    }

    private void A0E() {
        if (this.A07 != null) {
            this.A07.getVideoView().setOnTouchListener(new VU(this));
        }
    }

    private void A0F() {
        if (this.A07 != null) {
            ((C2015eq) this.A07.getVideoView()).setViewImplInflationListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        if (this.A02 != null && this.A02.getHideMediaControls() != null) {
            this.A04.A0F().ABi();
        }
        if (!C1581Up.A1Z(this.A04)) {
            C2131gi c2131gi = this.A04;
            String[] strArr = A0J;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[4] = "KtstU60KqEiOpYkS6KSDXNWKu5PITYtK";
            c2131gi.A0F().ABh();
        }
        if (this.A09 != null) {
            if (this.A02 != null && this.A02.getHideMediaControls() != null && this.A02.getHideMediaControls().booleanValue() && !C1581Up.A1Z(this.A04)) {
                this.A09.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.VR
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A00.A0a();
                    }
                });
            } else {
                if (this.A07 == null) {
                    return;
                }
                this.A07.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.VS
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A00.A0b();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        if (this.A02 != null && this.A02.getUnMuteVolume() != null) {
            this.A04.A0F().ABk();
        }
        if (!C1581Up.A1a(this.A04)) {
            InterfaceC1357Lt interfaceC1357LtA0F = this.A04.A0F();
            String[] strArr = A0J;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "1A270iucPH7yQTpQVcY6WmFhLzvmB0Is";
            strArr2[3] = "1BN9a3kcQdFnn1rDq6e2xRSvc5Sglw92";
            interfaceC1357LtA0F.ABj();
        }
        if (this.A03 != null) {
            NativeAd.NativeOptions nativeOptions = this.A02;
            if (A0J[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr3 = A0J;
            strArr3[7] = "9BSaV1qwv2wk9zKsNbmqgYOZ4C9vO";
            strArr3[1] = "GTOoQ0M5k2g8J0XGcddyc87MnH9r3";
            if (nativeOptions != null && this.A02.getUnMuteVolume() != null && this.A02.getUnMuteVolume().booleanValue() && !C1581Up.A1a(this.A04)) {
                this.A03.setVolume(1.0f);
            } else {
                this.A03.setVolume(this.A00);
            }
        }
    }

    private void A0I() {
        if (this.A01.getVisibility() == 0 && this.A0C && this.A01.hasWindowFocus()) {
            this.A0B.A0U();
            return;
        }
        if (this.A07 != null) {
            EnumC2073fm state = this.A07.getState();
            String[] strArr = A0J;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC2073fm.A05) {
                this.A0E = true;
            }
        }
        this.A0B.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A06 = EnumC1597Vf.A03;
        A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(UK uk, VV vv) {
        String url;
        this.A0D = false;
        this.A0E = false;
        this.A05 = vv;
        A0C();
        C3S c3s = this.A08;
        if (uk != null && uk.getAdCoverImage() != null) {
            C1593Vb adCoverImage = uk.getAdCoverImage();
            String[] strArr = A0J;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0J[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            url = adCoverImage.getUrl();
        } else {
            url = null;
        }
        c3s.setImage(url, new W2(this));
        this.A06 = uk.A1D();
        this.A09.setPlayAccessibilityLabel(uk.A1K());
        this.A09.setPauseAccessibilityLabel(uk.A1J());
        this.A0B.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(EnumC2018et enumC2018et) {
        if (this.A07 != null) {
            this.A07.A0e(enumC2018et, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0K, A09(30, 42, 7));
        }
    }

    private boolean A0S() {
        if (this.A02 != null && this.A02.getDisableFullScreen() != null) {
            this.A04.A0F().ABg();
        }
        if (!C1581Up.A1Y(this.A04)) {
            this.A04.A0F().ABf();
        }
        return (this.A02 == null || this.A02.getDisableFullScreen() == null || !this.A02.getDisableFullScreen().booleanValue() || C1581Up.A1Y(this.A04)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T() {
        if (this.A07 == null || this.A07.getState() == EnumC2073fm.A06) {
            return false;
        }
        return this.A06 == EnumC1597Vf.A05 || this.A06 == EnumC1597Vf.A03;
    }

    public static /* synthetic */ boolean A0U(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ void A0a() {
        if (this.A07 != null) {
            this.A07.A0g(this.A09);
        }
    }

    public final /* synthetic */ void A0b() {
        if (this.A07 != null) {
            this.A07.A0f(this.A09);
        }
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        VX vxA04;
        ((C1501Rm) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        this.A03 = mediaViewVideoRendererApi;
        switch (i) {
            case 0:
                vxA04 = A04(mediaViewVideoRendererApi);
                break;
            case 1:
                vxA04 = A03(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A09(0, 30, 15));
        }
        ((C1514Rz) mediaViewVideoRendererApi).A06(vxA04);
        this.A04 = C1504Rp.A03(context);
        this.A01 = mediaViewVideoRenderer;
        this.A08 = new C3S(this.A04);
        this.A0A = A05();
        this.A0B = A08();
        float density = XX.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A09 = new C3L(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A09.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A09.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            int i3 = this.A01.getChildCount();
            if (A0J[2].length() == 26) {
                throw new RuntimeException();
            }
            A0J[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i2 < i3) {
                View childAt = this.A01.getChildAt(0);
                if (childAt instanceof C09866r) {
                    this.A07 = (C09866r) childAt;
                } else {
                    i2++;
                }
            }
        }
        if (this.A07 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0K, A09(72, 36, 98));
            }
        } else {
            this.A07.A0f(this.A08);
            C09866r c09866r = this.A07;
            C3L c3l = this.A09;
            String[] strArr = A0J;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                c09866r.A0f(c3l);
            } else {
                A0J[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                c09866r.A0f(c3l);
            }
        }
        this.A0B.A0W(0);
        this.A0B.A0X(AdSize.MEDIUM_RECTANGLE_HEIGHT);
        vxA04.AJU();
    }

    @Override // com.facebook.ads.redexgen.core.C1501Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0C = true;
        A0I();
    }

    @Override // com.facebook.ads.redexgen.core.C1501Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0C = false;
        A0I();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean zA0s = C1581Up.A0s(this.A04);
        boolean zA0S = A0S();
        this.A01.setOnTouchListener(new VT(this, zA0s, zA0S));
        boolean disableVideoFullscreenOnNative = zA0s || zA0S;
        if (!disableVideoFullscreenOnNative) {
            A0E();
        } else {
            A0D();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1501Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0I();
    }

    @Override // com.facebook.ads.redexgen.core.C1501Rm, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0I();
    }
}
