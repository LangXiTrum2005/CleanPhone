package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1168Ek extends RelativeLayout implements InterfaceC2074fn, InterfaceC2007ei {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final E9 A0H;
    public static final E3 A0I;
    public static final E1 A0J;
    public static final C1154Dw A0K;
    public static final C1153Dv A0L;
    public static final C1150Ds A0M;
    public static final C1148Dq A0N;
    public static final C1147Dp A0O;
    public float A00;
    public int A01;
    public VI A02;
    public C2015eq A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C2131gi A0B;
    public final UM<UN, UL> A0C;
    public final List<InterfaceC2019eu> A0D;
    public final InterfaceC2071fk A0E;

    public static String A0G(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
            i4++;
        }
    }

    public static void A0J() {
        A0F = new byte[]{93, -80, -94, -96, 93, -79, -84, -79, -98, -87, 93, -76, -98, -79, -96, -91, 93, -79, -90, -86, -94, 125, -81, -84, -84, -97, -88, -82, -90, -77, 90, -101, -82, 90};
    }

    static {
        A0J();
        A0J = new E1();
        A0H = new E9();
        A0K = new C1154Dw();
        A0L = new C1153Dv();
        A0I = new E3();
        A0M = new C1150Ds();
        A0O = new C1147Dp();
        A0N = new C1148Dq();
    }

    public C1168Ek(C2131gi c2131gi) {
        super(c2131gi);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2006eh(this);
        this.A0B = c2131gi;
        if (A0T(c2131gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1131Cz(c2131gi);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1130Cy(c2131gi);
        }
        A0H();
    }

    public C1168Ek(C2131gi c2131gi, AttributeSet attributeSet) {
        super(c2131gi, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2006eh(this);
        this.A0B = c2131gi;
        if (A0T(c2131gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1131Cz(c2131gi, attributeSet);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1130Cy(c2131gi, attributeSet);
        }
        A0H();
    }

    public C1168Ek(C2131gi c2131gi, AttributeSet attributeSet, int i) {
        super(c2131gi, attributeSet, i);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2006eh(this);
        this.A0B = c2131gi;
        if (A0T(c2131gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1131Cz(c2131gi, attributeSet, i);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1130Cy(c2131gi, attributeSet, i);
        }
        A0H();
    }

    private float A06(InterfaceC2071fk interfaceC2071fk) {
        int videoHeight = interfaceC2071fk.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = interfaceC2071fk.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ C1154Dw A0E() {
        C1154Dw c1154Dw = A0K;
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return c1154Dw;
    }

    private void A0H() {
        this.A07 = C1581Up.A0t(this.A0B);
        this.A0B.A0F().A3d();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new C2015eq(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        YB.A0K(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new C1176Es(this), this.A01);
    }

    private final void A0K() {
        for (InterfaceC2019eu interfaceC2019eu : this.A0D) {
            boolean z = interfaceC2019eu instanceof ED;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z) {
                A0R((ED) interfaceC2019eu);
            }
            interfaceC2019eu.AAv(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (C1581Up.A10(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(VH vh) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(vh, null);
    }

    private void A0Q(InterfaceC2019eu interfaceC2019eu) {
        if (interfaceC2019eu instanceof ED) {
            A0S((ED) interfaceC2019eu);
        }
        interfaceC2019eu.AKV(this);
    }

    private void A0R(ED ed) {
        if (ed.getParent() == null) {
            if (ed instanceof C3S) {
                this.A03.A02(ed);
            } else {
                addView(ed);
            }
        }
    }

    private void A0S(ED ed) {
        if (ed instanceof C3S) {
            this.A03.A03(ed);
        } else {
            YB.A0J(ed);
        }
    }

    private boolean A0T(C2131gi c2131gi) {
        return C1581Up.A31(c2131gi, C2058fX.A03());
    }

    public final void A0W() {
        this.A0E.setVideoStateChangeListener(null);
        this.A0E.destroy();
    }

    public final void A0X() {
        if (A0n()) {
            return;
        }
        this.A0E.A9d();
    }

    public final void A0Y() {
        Iterator<InterfaceC2019eu> it = this.A0D.iterator();
        while (it.hasNext()) {
            A0Q(it.next());
        }
        this.A0D.clear();
    }

    public final void A0Z(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i == 1) {
            layoutParams.addRule(10);
        } else if (XL.A05(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        C2015eq c2015eq = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        c2015eq.setLayoutParams(layoutParams);
    }

    public final void A0a(int i) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i);
    }

    public final void A0b(int i) {
        this.A0E.AKF(i);
    }

    public final void A0c(AnimatorSet animatorSet, boolean z) {
        this.A03.A01(animatorSet, z);
    }

    public final void A0d(EnumC2010el enumC2010el) {
        C1171En c1171En = new C1171En(this);
        if (this.A07) {
            Y4.A00(c1171En);
        } else {
            this.A09.post(c1171En);
        }
        this.A0E.AK1(enumC2010el.A03());
    }

    public final void A0e(EnumC2018et enumC2018et, int i) {
        if (this.A04 && this.A0E.getState() == EnumC2073fm.A06) {
            this.A04 = false;
        }
        this.A0E.AK6(enumC2018et, i);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0f(InterfaceC2019eu interfaceC2019eu) {
        this.A0D.add(interfaceC2019eu);
    }

    public final void A0g(InterfaceC2019eu interfaceC2019eu) {
        this.A0D.remove(interfaceC2019eu);
        A0Q(interfaceC2019eu);
    }

    public final void A0h(boolean z) {
        A0i(z, 0);
    }

    public final void A0i(boolean z, int i) {
        if (A0n()) {
            return;
        }
        this.A0E.AGr(z, i);
    }

    public final void A0j(boolean z, boolean z2, int i) {
        this.A06 = z2;
        A0i(z, i);
    }

    public final boolean A0k() {
        return this.A0E.A9q();
    }

    public final boolean A0l() {
        return this.A0E.A9r();
    }

    public final boolean A0m() {
        return getVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean A0n() {
        return getState() == EnumC2073fm.A05;
    }

    public final boolean A0o() {
        return A0n() && this.A0E.AAc();
    }

    public final boolean A0p() {
        return getState() == EnumC2073fm.A0A;
    }

    public final boolean A0q() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007ei
    public final boolean AAQ() {
        return A0T(this.A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007ei
    public final boolean AAV() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2074fn
    public final void ADy(final long j, final long j2, final long j3, final float f) {
        if (!C1581Up.A20(this.A0B)) {
            return;
        }
        this.A0C.A02(new EC(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.4F
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2074fn
    public final void AEo() {
        A0i(true, 4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2074fn
    public final void AEp() {
        A0e(EnumC2018et.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2074fn
    public final void AFr(int i, int i2) {
        C1173Ep c1173Ep = new C1173Ep(this, i, i2);
        if (this.A07) {
            Y4.A00(c1173Ep);
        } else {
            this.A09.post(c1173Ep);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2074fn
    public final void AGd(EnumC2073fm enumC2073fm) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C1175Er c1175Er = new C1175Er(this, enumC2073fm, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            Y4.A00(c1175Er);
        } else {
            this.A09.post(c1175Er);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007ei
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public UM<UN, UL> getEventBus() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007ei
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<InterfaceC2019eu> getPlugins() {
        return this.A0D;
    }

    public EnumC2073fm getState() {
        return this.A0E.getState();
    }

    public Handler getStateHandler() {
        return this.A09;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0E;
    }

    public int getVideoHeight() {
        return this.A0E.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0E.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007ei
    public EnumC2018et getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007ei
    public float getVolume() {
        return this.A0E.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0C.A02(A0N);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0C.A02(A0O);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.A0E != null) {
            this.A0E.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(VI vi) {
        this.A02 = vi;
    }

    public void setIsFullScreen(boolean z) {
        this.A05 = z;
        this.A0E.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setRoundedCornerVideoView(float f) {
        this.A03.setRoundedCornersVideoStyle(f);
    }

    public void setVideoMPD(String str) {
        this.A0E.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A01 = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0Y();
        } else {
            A0K();
            if (A0G[2].length() != 10) {
                throw new RuntimeException();
            }
            A0G[2] = "2vtziZXFfU";
            this.A0E.setup(uri);
        }
        this.A04 = false;
    }

    public void setVideoURI(String str) {
        this.A0B.A0F().A3k(str);
        setVideoURI(str != null ? XB.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0M(VH.A0n);
            this.A0B.A0F().A3o();
        } else {
            A0M(VH.A0m);
            this.A0B.A0F().A3n();
        }
        this.A0E.setRequestedVolume(f);
        getEventBus().A02(A0M);
    }
}
