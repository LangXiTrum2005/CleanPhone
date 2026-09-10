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

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1361cL extends RelativeLayout implements JJ, IF {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final C1342c2 A0H;
    public static final C1336bw A0I;
    public static final C1334bu A0J;
    public static final C1329bp A0K;
    public static final C1328bo A0L;
    public static final C1325bl A0M;
    public static final C1323bj A0N;
    public static final C1322bi A0O;
    public float A00;
    public int A01;
    public AF A02;
    public IM A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C1828k1 A0B;
    public final C9J<C9K, C9I> A0C;
    public final List<IQ> A0D;
    public final JG A0E;

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
        A0J = new C1334bu();
        A0H = new C1342c2();
        A0K = new C1329bp();
        A0L = new C1328bo();
        A0I = new C1336bw();
        A0M = new C1325bl();
        A0O = new C1322bi();
        A0N = new C1323bj();
    }

    public C1361cL(C1828k1 c1828k1) {
        super(c1828k1);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C9J<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new IE(this);
        this.A0B = c1828k1;
        if (A0V(c1828k1)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1268an(c1828k1);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1267am(c1828k1);
        }
        A0H();
    }

    public C1361cL(C1828k1 c1828k1, AttributeSet attributeSet) {
        super(c1828k1, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C9J<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new IE(this);
        this.A0B = c1828k1;
        if (A0V(c1828k1)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1268an(c1828k1, attributeSet);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1267am(c1828k1, attributeSet);
        }
        A0H();
    }

    public C1361cL(C1828k1 c1828k1, AttributeSet attributeSet, int i) {
        super(c1828k1, attributeSet, i);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C9J<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new IE(this);
        this.A0B = c1828k1;
        if (A0V(c1828k1)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1268an(c1828k1, attributeSet, i);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1267am(c1828k1, attributeSet, i);
        }
        A0H();
    }

    private float A06(JG jg) {
        int videoHeight = jg.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = jg.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ C1329bp A0E() {
        C1329bp c1329bp = A0K;
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return c1329bp;
    }

    private void A0H() {
        this.A07 = C05789m.A0s(this.A0B);
        this.A0B.A0F().A3T();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new IM(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        D3.A0I(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new C1365cP(this), this.A01);
    }

    private final void A0K() {
        for (IQ iq : this.A0D) {
            boolean z = iq instanceof AbstractC1346c6;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z) {
                A0R((AbstractC1346c6) iq);
            }
            iq.AAk(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (C05789m.A0z(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AE ae) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(ae, null);
    }

    private void A0Q(IQ iq) {
        if (iq instanceof AbstractC1346c6) {
            A0S((AbstractC1346c6) iq);
        }
        iq.AJa(this);
    }

    private void A0R(AbstractC1346c6 abstractC1346c6) {
        if (abstractC1346c6.getParent() == null) {
            if (abstractC1346c6 instanceof KA) {
                this.A03.A02(abstractC1346c6);
            } else {
                addView(abstractC1346c6);
            }
        }
    }

    private void A0S(AbstractC1346c6 abstractC1346c6) {
        if (abstractC1346c6 instanceof KA) {
            this.A03.A03(abstractC1346c6);
        } else {
            D3.A0H(abstractC1346c6);
        }
    }

    public static boolean A0T(float f) {
        return f <= 0.6f;
    }

    public static boolean A0U(float f) {
        return f >= 1.7f && f <= 1.8f;
    }

    private boolean A0V(C1828k1 c1828k1) {
        return C05789m.A2r(c1828k1, J3.A03());
    }

    public final void A0Y() {
        this.A0E.setVideoStateChangeListener(null);
        this.A0E.destroy();
    }

    public final void A0Z() {
        if (A0p()) {
            return;
        }
        this.A0E.A9T();
    }

    public final void A0a() {
        Iterator<IQ> it = this.A0D.iterator();
        while (it.hasNext()) {
            A0Q(it.next());
        }
        this.A0D.clear();
    }

    public final void A0b(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i == 1) {
            layoutParams.addRule(10);
        } else if (A0U(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        IM im = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        im.setLayoutParams(layoutParams);
    }

    public final void A0c(int i) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i);
    }

    public final void A0d(int i) {
        this.A0E.AJK(i);
    }

    public final void A0e(AnimatorSet animatorSet, boolean z) {
        this.A03.A01(animatorSet, z);
    }

    public final void A0f(II ii) {
        C1362cM c1362cM = new C1362cM(this);
        if (this.A07) {
            ExecutorC0649Cx.A00(c1362cM);
        } else {
            this.A09.post(c1362cM);
        }
        this.A0E.AJ7(ii.A03());
    }

    public final void A0g(IP ip, int i) {
        if (this.A04 && this.A0E.getState() == JI.A06) {
            this.A04 = false;
        }
        this.A0E.AJC(ip, i);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0h(IQ iq) {
        this.A0D.add(iq);
    }

    public final void A0i(IQ iq) {
        this.A0D.remove(iq);
        A0Q(iq);
    }

    public final void A0j(boolean z) {
        A0k(z, 0);
    }

    public final void A0k(boolean z, int i) {
        if (A0p()) {
            return;
        }
        this.A0E.AFz(z, i);
    }

    public final void A0l(boolean z, boolean z2, int i) {
        this.A06 = z2;
        A0k(z, i);
    }

    public final boolean A0m() {
        return this.A0E.A9g();
    }

    public final boolean A0n() {
        return this.A0E.A9h();
    }

    public final boolean A0o() {
        return getVolume() == 0.0f;
    }

    public final boolean A0p() {
        return getState() == JI.A05;
    }

    public final boolean A0q() {
        return A0p() && this.A0E.AAR();
    }

    public final boolean A0r() {
        return getState() == JI.A0A;
    }

    public final boolean A0s() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.IF
    public final boolean AAF() {
        return A0V(this.A0B);
    }

    @Override // com.facebook.ads.redexgen.core.IF
    public final boolean AAK() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void ADD(long j, long j2, long j3, float f) {
        if (!C05789m.A1t(this.A0B)) {
            return;
        }
        this.A0C.A02(new KZ(j, j2, j3, f));
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AE3() {
        A0k(true, 4);
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AE4() {
        A0g(IP.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AF1(int i, int i2) {
        C1363cN c1363cN = new C1363cN(this, i, i2);
        if (this.A07) {
            ExecutorC0649Cx.A00(c1363cN);
        } else {
            this.A09.post(c1363cN);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AFl(JI ji) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C1364cO c1364cO = new C1364cO(this, ji, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            ExecutorC0649Cx.A00(c1364cO);
        } else {
            this.A09.post(c1364cO);
        }
    }

    @Override // com.facebook.ads.redexgen.core.IF
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public C9J<C9K, C9I> getEventBus() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.IF
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<IQ> getPlugins() {
        return this.A0D;
    }

    public JI getState() {
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

    @Override // com.facebook.ads.redexgen.core.IF
    public IP getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.core.IF
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

    public void setFunnelLoggingHandler(AF af) {
        this.A02 = af;
    }

    public void setIsFullScreen(boolean z) {
        this.A05 = z;
        this.A0E.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.A0E.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A01 = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0a();
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
        this.A0B.A0F().A3a(str);
        setVideoURI(str != null ? C5.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0M(AE.A0n);
            this.A0B.A0F().A3e();
        } else {
            A0M(AE.A0m);
            this.A0B.A0F().A3d();
        }
        this.A0E.setRequestedVolume(f);
        getEventBus().A02(A0M);
    }
}
