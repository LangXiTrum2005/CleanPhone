package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1462dz extends FrameLayout implements DS {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public FT A03;
    public AbstractC1531f6 A04;
    public I7 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1982mb A0A;
    public final InterfaceC05006k A0B;
    public final C05357t A0C;
    public final C1828k1 A0D;
    public final A7 A0E;
    public final AF A0F;
    public final ViewOnSystemUiVisibilityChangeListenerC0642Cq A0G;
    public final DR A0H;
    public final FullScreenAdToolbar A0I;
    public final EC A0J;
    public final ArrayList<HG> A0K;

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private AbstractC1531f6 A09(boolean z, int i) {
        boolean z2;
        C1473eA c1473eA = new C1473eA(this, i);
        AbstractC1984md abstractC1984mdA1Z = this.A0A.A1Z(this.A00);
        if (abstractC1984mdA1Z.A1p()) {
            this.A0I.setOnClickListener(new HH(this));
        }
        if (this.A0A.A1h()) {
            int i2 = this.A00;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "c3gdOFv01Kz0ZnyucW";
            strArr2[1] = "uUEmXxf6IoafQfC48jcO";
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z3 = this.A0A.A1g() && this.A00 > 0;
        String strA1b = this.A0A.A1b();
        if (A0W(abstractC1984mdA1Z)) {
            int iA01 = A01(this.A00);
            if (iA01 == 0) {
                setUnskippableSecondsComplete(true);
            }
            this.A0D.A0F().AIz(EnumC03801r.A06);
            this.A0D.A0F().AIR(this.A00);
            this.A0D.A0F().A4l(strA1b);
            return new LB(this.A0D, this.A0J, this.A00, this.A0E, abstractC1984mdA1Z, this.A0H, this.A0I, z2, z3, c1473eA, iA01);
        }
        if (abstractC1984mdA1Z.A1b().A0Q()) {
            this.A0D.A0F().AIz(EnumC03801r.A07);
            this.A0D.A0F().AIR(this.A00);
            this.A0D.A0F().A4l(strA1b);
            return new C0851Kr(this.A0D, this.A0E, this.A0I, abstractC1984mdA1Z, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, i, z2, z3, c1473eA);
        }
        this.A0D.A0F().AIz(EnumC03801r.A07);
        this.A0D.A0F().AIR(this.A00);
        this.A0D.A0F().A4l(strA1b);
        return new L1(this.A0D, this.A0E, abstractC1984mdA1Z, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, this.A0A.A0Y(), i, this.A0A.A1V(), z, this.A0A.A1X(), this.A0A.A1i(), z2, z3, c1473eA);
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0E();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1462dz(C1828k1 c1828k1, EC ec, A7 a7, C1982mb c1982mb, C05357t c05357t, DR dr) {
        super(c1828k1);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new C1475eC(this);
        this.A0D = c1828k1;
        this.A0J = ec;
        this.A0E = a7;
        this.A0A = c1982mb;
        this.A0C = c05357t;
        this.A0H = dr;
        this.A0F = new AF(this.A0A.A1Z(0).A1g(), this.A0E);
        this.A0G = new ViewOnSystemUiVisibilityChangeListenerC0642Cq(this);
        this.A0G.A05(EnumC0641Cp.A02);
        this.A05 = new I7(this.A0D, this.A0J, this.A0A.A0s(), dr);
        this.A0I = A05();
        addView(this.A0I, new FrameLayout.LayoutParams(-1, this.A0I.getToolbarHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r5 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        A0D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (r5 == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1462dz.A00():int");
    }

    private int A01(int i) {
        if (this.A0A.A1i()) {
            C1982mb c1982mb = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i < c1982mb.A1d().size() && i >= 0) {
                return this.A0A.A1d().get(i).intValue();
            }
        }
        return this.A0A.A0Y();
    }

    public static /* synthetic */ int A02(C1462dz c1462dz, int i) {
        int i2 = c1462dz.A01 + i;
        c1462dz.A01 = i2;
        return i2;
    }

    private FullScreenAdToolbar A05() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2, -1, false);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new C1466e3(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        int iA00 = A00();
        if (iA00 != 0) {
            this.A0D.A0F().A4o(iA00);
        }
    }

    private void A0C() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A1Z(this.A00 - 1).A1g())) {
            A7 a7 = this.A0E;
            String strA1g = this.A0A.A1Z(this.A00 - 1).A1g();
            FB fbA03 = new FB().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC1531f6 abstractC1531f6 = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            a7.AAr(strA1g, fbA03.A02(abstractC1531f6 != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0D() {
        this.A0D.A0F().A4m();
        this.A07 = true;
        this.A03 = new FT(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        HG hg = null;
        for (HG s : this.A0K) {
            if (s.A00 == HG.A06) {
                hg = s;
                break;
            }
        }
        if (hg != null) {
            A0J(this.A03, hg);
        } else if (!this.A0K.isEmpty()) {
            A0J(this.A03, this.A0K.get(0));
        }
        A0R(true);
        this.A0I.setOnlyPageDetails(null);
        if (this.A04 != null) {
            D3.A0H(this.A04);
            this.A04.A11();
            this.A04 = null;
        }
        D3.A0H(this.A03);
        D3.A0E(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0F() {
        this.A0G.A05(EnumC0641Cp.A03);
    }

    private synchronized void A0G() {
        this.A0H.A4Z(this.A0J.A6b());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(float f) {
        float seenCurrentPosMS;
        float fA01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A1i() ? 0 : this.A01) + f;
        if (fA01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / fA01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A1i()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(int i) {
        this.A0D.A0F().A4j(i);
        setUnskippableSecondsComplete(true);
        A0G();
        A0C();
        this.A0H.A4Z(this.A0J.A7m());
    }

    private void A0J(ViewGroup viewGroup, HG hg) {
        if (hg.A00 == HG.A06 && hg.A03 != null) {
            AbstractC0716Fm.A00(this.A0D, viewGroup, hg.A03);
        } else {
            int i = hg.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            D3.A0K(viewGroup, i);
        }
        this.A0I.setFullscreen(hg.A05);
        this.A0I.A0A(hg.A02, hg.A04);
    }

    private void A0K(AbstractC1984md abstractC1984md) {
        if (A0W(abstractC1984md) && this.A02 == 2) {
            this.A0I.setOnlyPageDetails(abstractC1984md.A1e());
        } else {
            this.A0I.setOnlyPageDetails(null);
        }
    }

    private final void A0L(C04946e c04946e) {
        c04946e.A0A(this.A0B);
        int i = c04946e.A05().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0S(this.A0A.A1f(), i);
        A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    public void A0R(boolean z) {
        boolean z2;
        if (!A0U() || A0T()) {
            z2 = false;
        } else {
            boolean zA0V = A0V();
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "abX2oERzf98UggHhJlwc5xOu8ehA434Q";
            strArr2[4] = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE";
            if (zA0V) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        boolean willShowCombinedEndCards = A0T();
        if (!willShowCombinedEndCards && !z2) {
            setUnskippableSecondsComplete(true);
            if (z) {
                this.A0I.setToolbarActionMessage(A0A(0, 0, 85));
            }
            FullScreenAdToolbar fullScreenAdToolbar = this.A0I;
            String[] strArr3 = A0M;
            if (strArr3[6].length() == strArr3[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "6hDdRvQvhZI2wvmWyf";
            strArr4[1] = "dfELTL2TgrvtcbRt37j2";
            fullScreenAdToolbar.setToolbarActionMode(0);
            return;
        }
        FullScreenAdToolbar fullScreenAdToolbar2 = this.A0I;
        String[] strArr5 = A0M;
        if (strArr5[0].length() != strArr5[1].length()) {
            String[] strArr6 = A0M;
            strArr6[2] = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ";
            strArr6[4] = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3";
            fullScreenAdToolbar2.setToolbarActionMode(1);
            return;
        }
        String[] strArr7 = A0M;
        strArr7[6] = "uCb48oA3";
        strArr7[3] = "eCwSqnipc7icS";
        fullScreenAdToolbar2.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    public void A0S(boolean z, int i) {
        boolean isLoaded;
        String[] strArr;
        if (this.A04 != null) {
            this.A04.A11();
            this.A04.removeAllViews();
            D3.A0H(this.A04);
        }
        if (!A0T()) {
            setUnskippableSecondsComplete(true);
            if (A0U()) {
                A0D();
                return;
            } else {
                A0I(1);
                return;
            }
        }
        if (this.A0A.A1i()) {
            setUnskippableSecondsComplete(false);
            FullScreenAdToolbar fullScreenAdToolbar = this.A0I;
            String[] strArr2 = A0M;
            if (strArr2[0].length() != strArr2[1].length()) {
                String[] strArr3 = A0M;
                strArr3[5] = "hirdpqFqEpTGRF7TvzfLNB23PEQWY5";
                strArr3[7] = "Eb3FssofDa3ImZpKtnPvm2BrdUNNTg";
                fullScreenAdToolbar.setProgressImmediate(0.0f);
                isLoaded = this.A0D.A01().AAB(this.A0A.A1Z(this.A00).A1g(), this.A0A.A1a());
                if (!isLoaded) {
                    this.A0D.A0F().A4k();
                    A0I(2);
                    strArr = A0M;
                    if (strArr[6].length() != strArr[3].length()) {
                        String[] strArr4 = A0M;
                        strArr4[0] = "SeXhCWKDArfU2xbUHE";
                        strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                        return;
                    }
                } else {
                    AbstractC1531f6 abstractC1531f6A09 = A09(z, i);
                    this.A04 = abstractC1531f6A09;
                    AbstractC1531f6 abstractC1531f6 = this.A04;
                    boolean isLoaded2 = this.A09;
                    abstractC1531f6.A15(isLoaded2);
                    setupToolbarForAd(abstractC1531f6A09);
                    addView(this.A04, 0, A0N);
                    this.A00++;
                    this.A04.A14();
                    return;
                }
            }
        } else {
            isLoaded = this.A0D.A01().AAB(this.A0A.A1Z(this.A00).A1g(), this.A0A.A1a());
            if (!isLoaded) {
                this.A0D.A0F().A4k();
                A0I(2);
                strArr = A0M;
                if (strArr[6].length() != strArr[3].length()) {
                    String[] strArr5 = A0M;
                    strArr5[0] = "SeXhCWKDArfU2xbUHE";
                    strArr5[1] = "icHjaKCGoPIgSTYVXjnx";
                    return;
                }
            } else {
                AbstractC1531f6 abstractC1531f6A010 = A09(z, i);
                this.A04 = abstractC1531f6A010;
                AbstractC1531f6 abstractC1531f7 = this.A04;
                boolean isLoaded3 = this.A09;
                abstractC1531f7.A15(isLoaded3);
                setupToolbarForAd(abstractC1531f6A010);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A14();
                return;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0T() {
        return this.A00 < this.A0A.A1W();
    }

    private boolean A0U() {
        return this.A0A.A1V() == 2;
    }

    private final boolean A0V() {
        return this.A07;
    }

    public static boolean A0W(AbstractC1984md abstractC1984md) {
        return TextUtils.isEmpty(abstractC1984md.A1b().A0F().A09());
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AAj(Intent intent, Bundle bundle, C04946e c04946e) {
        this.A0H.A3v(this, A0N);
        A0L(c04946e);
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEP(boolean z) {
        if (this.A04 != null) {
            this.A04.A16(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEs(boolean z) {
        if (this.A04 != null) {
            this.A04.A17(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AI1(Bundle bundle) {
    }

    public AbstractC1531f6 getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof LB) {
            A0J(this.A04, this.A04.getFullScreenAdStyle());
            A0K(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A11();
            this.A04 = null;
        }
        this.A0D.A01().A4p(this.A0A.A1a());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(DR dr) {
    }

    public void setServerSideRewardHandler(I7 i7) {
        this.A05 = i7;
    }

    public void setUnskippableSecondsComplete(boolean z) {
        this.A09 = z;
        if (this.A04 != null) {
            this.A04.A15(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC1531f6 abstractC1531f6) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC1984md abstractC1984mdA1Z = this.A0A.A1Z(this.A00);
        this.A0I.A0D(this.A0D, abstractC1984mdA1Z.A1V());
        this.A0I.A0C(abstractC1984mdA1Z.A1e(), abstractC1984mdA1Z.A1g(), A01(this.A00));
        HG fullScreenAdStyle = abstractC1531f6.getFullScreenAdStyle();
        A0J(abstractC1531f6, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A0A(4, 3, 90) + (this.A00 + 1) + A0A(0, 4, 21) + this.A0A.A1W());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0K(abstractC1984mdA1Z);
    }
}
