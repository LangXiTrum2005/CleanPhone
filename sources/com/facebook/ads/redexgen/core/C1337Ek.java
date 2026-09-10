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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1337Ek extends RelativeLayout implements InterfaceC2243fn, InterfaceC2176ei {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final E9 A0H;
    public static final E3 A0I;
    public static final E1 A0J;
    public static final C1323Dw A0K;
    public static final C1322Dv A0L;
    public static final C1319Ds A0M;
    public static final C1317Dq A0N;
    public static final C1316Dp A0O;
    public float A00;
    public int A01;
    public VI A02;
    public C2184eq A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C2300gi A0B;
    public final UM<UN, UL> A0C;
    public final List<InterfaceC2188eu> A0D;
    public final InterfaceC2240fk A0E;

    public static String A0G(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 57);
            i5++;
        }
    }

    public static void A0J() {
        A0F = new byte[]{93, -80, -94, -96, 93, -79, -84, -79, -98, -87, 93, -76, -98, -79, -96, -91, 93, -79, -90, -86, -94, 125, -81, -84, -84, -97, -88, -82, -90, -77, 90, -101, -82, 90};
    }

    static {
        A0J();
        A0J = new E1();
        A0H = new E9();
        A0K = new C1323Dw();
        A0L = new C1322Dv();
        A0I = new E3();
        A0M = new C1319Ds();
        A0O = new C1316Dp();
        A0N = new C1317Dq();
    }

    public C1337Ek(C2300gi c2300gi) {
        super(c2300gi);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2175eh(this);
        this.A0B = c2300gi;
        if (A0T(c2300gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1300Cz(c2300gi);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1299Cy(c2300gi);
        }
        A0H();
    }

    public C1337Ek(C2300gi c2300gi, AttributeSet attributeSet) {
        super(c2300gi, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2175eh(this);
        this.A0B = c2300gi;
        if (A0T(c2300gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1300Cz(c2300gi, attributeSet);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1299Cy(c2300gi, attributeSet);
        }
        A0H();
    }

    public C1337Ek(C2300gi c2300gi, AttributeSet attributeSet, int i2) {
        super(c2300gi, attributeSet, i2);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2175eh(this);
        this.A0B = c2300gi;
        if (A0T(c2300gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1300Cz(c2300gi, attributeSet, i2);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1299Cy(c2300gi, attributeSet, i2);
        }
        A0H();
    }

    private float A06(InterfaceC2240fk interfaceC2240fk) {
        int videoHeight = interfaceC2240fk.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = interfaceC2240fk.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ C1323Dw A0E() {
        C1323Dw c1323Dw = A0K;
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return c1323Dw;
    }

    private void A0H() {
        this.A07 = C1750Up.A0t(this.A0B);
        this.A0B.A0F().A3d();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new C2184eq(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        YB.A0K(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new C1345Es(this), this.A01);
    }

    private final void A0K() {
        for (InterfaceC2188eu interfaceC2188eu : this.A0D) {
            boolean z2 = interfaceC2188eu instanceof ED;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z2) {
                A0R((ED) interfaceC2188eu);
            }
            interfaceC2188eu.AAv(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i2) {
        if (C1750Up.A10(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i2 / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(VH vh) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(vh, null);
    }

    private void A0Q(InterfaceC2188eu interfaceC2188eu) {
        if (interfaceC2188eu instanceof ED) {
            A0S((ED) interfaceC2188eu);
        }
        interfaceC2188eu.AKV(this);
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

    private boolean A0T(C2300gi c2300gi) {
        return C1750Up.A31(c2300gi, C2227fX.A03());
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
        Iterator<InterfaceC2188eu> it = this.A0D.iterator();
        while (it.hasNext()) {
            A0Q(it.next());
        }
        this.A0D.clear();
    }

    public final void A0Z(int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i2 == 1) {
            layoutParams.addRule(10);
        } else if (XL.A05(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        C2184eq c2184eq = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        c2184eq.setLayoutParams(layoutParams);
    }

    public final void A0a(int i2) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i2);
    }

    public final void A0b(int i2) {
        this.A0E.AKF(i2);
    }

    public final void A0c(AnimatorSet animatorSet, boolean z2) {
        this.A03.A01(animatorSet, z2);
    }

    public final void A0d(EnumC2179el enumC2179el) {
        C1340En c1340En = new C1340En(this);
        if (this.A07) {
            Y4.A00(c1340En);
        } else {
            this.A09.post(c1340En);
        }
        this.A0E.AK1(enumC2179el.A03());
    }

    public final void A0e(EnumC2187et enumC2187et, int i2) {
        if (this.A04 && this.A0E.getState() == EnumC2242fm.A06) {
            this.A04 = false;
        }
        this.A0E.AK6(enumC2187et, i2);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0f(InterfaceC2188eu interfaceC2188eu) {
        this.A0D.add(interfaceC2188eu);
    }

    public final void A0g(InterfaceC2188eu interfaceC2188eu) {
        this.A0D.remove(interfaceC2188eu);
        A0Q(interfaceC2188eu);
    }

    public final void A0h(boolean z2) {
        A0i(z2, 0);
    }

    public final void A0i(boolean z2, int i2) {
        if (A0n()) {
            return;
        }
        this.A0E.AGr(z2, i2);
    }

    public final void A0j(boolean z2, boolean z3, int i2) {
        this.A06 = z3;
        A0i(z2, i2);
    }

    public final boolean A0k() {
        return this.A0E.A9q();
    }

    public final boolean A0l() {
        return this.A0E.A9r();
    }

    public final boolean A0m() {
        return getVolume() == 0.0f;
    }

    public final boolean A0n() {
        return getState() == EnumC2242fm.A05;
    }

    public final boolean A0o() {
        return A0n() && this.A0E.AAc();
    }

    public final boolean A0p() {
        return getState() == EnumC2242fm.A0A;
    }

    public final boolean A0q() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2176ei
    public final boolean AAQ() {
        return A0T(this.A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2176ei
    public final boolean AAV() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2243fn
    public final void ADy(final long j, final long j2, final long j3, final float f) {
        if (!C1750Up.A20(this.A0B)) {
            return;
        }
        this.A0C.A02(new EC(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.4F
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2243fn
    public final void AEo() {
        A0i(true, 4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2243fn
    public final void AEp() {
        A0e(EnumC2187et.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2243fn
    public final void AFr(int i2, int i3) {
        C1342Ep c1342Ep = new C1342Ep(this, i2, i3);
        if (this.A07) {
            Y4.A00(c1342Ep);
        } else {
            this.A09.post(c1342Ep);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2243fn
    public final void AGd(EnumC2242fm enumC2242fm) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C1344Er c1344Er = new C1344Er(this, enumC2242fm, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            Y4.A00(c1344Er);
        } else {
            this.A09.post(c1344Er);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2176ei
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public UM<UN, UL> getEventBus() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2176ei
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<InterfaceC2188eu> getPlugins() {
        return this.A0D;
    }

    public EnumC2242fm getState() {
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

    @Override // com.facebook.ads.redexgen.core.InterfaceC2176ei
    public EnumC2187et getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2176ei
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

    public void setIsFullScreen(boolean z2) {
        this.A05 = z2;
        this.A0E.setFullScreen(z2);
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

    public void setVideoProgressReportIntervalMs(int i2) {
        this.A01 = i2;
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
