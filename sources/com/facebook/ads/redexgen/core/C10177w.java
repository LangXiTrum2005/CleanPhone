package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10177w extends AbstractC2300jh {
    public static C1537Sx A0D;
    public static byte[] A0E;
    public static String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public NJ A01;
    public NK A02;
    public NQ A03;
    public C2131gi A04;
    public WK A05;
    public C1915dC A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, 12, 3, 2, -33, 2, -30, -1, 18, -1, -32, 19, 12, 2, 10, 3, 29, 21, 20, 25, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 36, 25, 31, 30, -12, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 36, ExecutionDataWriter.BLOCK_EXECUTIONDATA, ExecutionDataWriter.BLOCK_SESSIONINFO, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, 28, 15, 33, 11, 28, 14, 15, 14, 9, RemoteControlWriter.BLOCK_CMDOK, 19, 14, 15, 25, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A09();
    }

    private void A07() {
        P2.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A08() {
        if (this.A02 != null) {
            try {
                P2.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A0A(Intent intent) {
        int i = super.A00;
        String strA05 = A05(77, 24, 25);
        if (i != -1 && Settings.System.getInt(this.A04.getContentResolver(), A05(1, 22, 92), 0) != 1) {
            int i2 = super.A00;
            String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(strA05, i2);
            return;
        }
        C2131gi c2131gi = this.A04;
        String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (C1581Up.A0h(c2131gi)) {
                return;
            }
        } else if (C1581Up.A0h(c2131gi)) {
            return;
        }
        intent.putExtra(strA05, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(final C2131gi c2131gi, final C2290jT c2290jT, final int i) {
        if (i >= c2290jT.A23()) {
            return;
        }
        final C10067l c10067l = (C10067l) c2290jT.A27(i);
        A0D = new C1537Sx(c2131gi);
        A0D.A0e(new VI(c10067l.A2E(), c2131gi.A0A()));
        O6.A02(c2131gi, A0D, c10067l);
        final boolean z = i == 0;
        A0D.A0X(new AbstractC2270j4(z) { // from class: com.facebook.ads.redexgen.X.7x
            @Override // com.facebook.ads.redexgen.core.AbstractC2270j4
            public final void A00() {
                this.A01.A01.AFp(this.A01, AdError.CACHE_ERROR);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2270j4
            public final void A01(boolean z2) {
                C10177w.A0D = null;
                if (z2) {
                    c2131gi.A01().AJE(c10067l.A2E(), c2290jT.A28());
                }
                if (i == c2290jT.A25()) {
                    this.A01.A0C.set(true);
                    this.A01.A01.AFm(this.A01);
                }
                this.A01.A0C(c2131gi, c2290jT, i + 1);
            }
        }, new C1530Sq(c10067l.A1D(), A05(Opcodes.DCMPG, 14, 119), i));
    }

    private void A0D(boolean z) {
        if (this.A05 == WK.A0G) {
            A0F(z);
            return;
        }
        if (this.A05 == WK.A0I) {
            A0G(z);
        } else if (this.A05 == WK.A0H) {
            A0E(z);
        } else {
            A0G(z);
        }
    }

    private void A0E(boolean z) {
        C1537Sx c1537Sx = new C1537Sx(this.A04);
        boolean z2 = C1581Up.A2H(this.A04) && SN.A0A(this.A03.A1H());
        if (z2) {
            SN unifiedAssetsLoader = new SN(c1537Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z2, new C2308jp(this));
            c1537Sx.A0e(new VI(((AbstractC2296jd) this.A03).A2E(), this.A04.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(this.A04, (AbstractC2296jd) this.A03, z, new C2307jo(this));
    }

    private void A0F(boolean z) {
        C1537Sx c1537Sx = new C1537Sx(this.A04);
        c1537Sx.A0e(new VI(((AbstractC2296jd) this.A03).A2E(), this.A04.A0A()));
        O6.A03(this.A04, c1537Sx, (C10067l) this.A03);
        c1537Sx.A0X(new C2312jt(this), new C1530Sq(this.A03.A1D(), A05(Opcodes.DCMPG, 14, 119)));
    }

    private void A0G(boolean z) {
        boolean z2 = false;
        if (this.A03.A1b()) {
            C2290jT c2290jT = (C2290jT) this.A03;
            for (int i = 0; i < c2290jT.A23(); i++) {
                if (TextUtils.isEmpty(c2290jT.A27(i).A29().A0H().A09())) {
                    this.A01.AFp(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0C(this.A04, c2290jT, 0);
            return;
        }
        C1537Sx c1537Sx = new C1537Sx(this.A04);
        c1537Sx.A0e(new VI(((AbstractC2296jd) this.A03).A2E(), this.A04.A0A()));
        if (C1581Up.A2H(this.A04) && SN.A0A(this.A03.A1H())) {
            z2 = true;
        }
        boolean zA1g = this.A03.A1g();
        if (z2) {
            SN unifiedAssetsLoader = new SN(c1537Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z2, new C2310jr(this, zA1g));
            unifiedAssetsLoader.A0B();
            return;
        }
        C10067l c10067l = (C10067l) this.A03;
        if (TextUtils.isEmpty(c10067l.A29().A0H().A09())) {
            if (this.A05 == WK.A0J) {
                this.A04.A0F().AEQ();
            }
            this.A01.AFp(this, AdError.INTERNAL_ERROR);
        } else {
            O6.A02(this.A04, c1537Sx, c10067l);
            c1537Sx.A0X(new C10197y(this, z, zA1g, c10067l, this), new C1530Sq(c10067l.A1D(), A05(Opcodes.DCMPG, 14, 119)));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2300jh
    public final int A0H() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0p();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2300jh
    public final NQ A0I() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2300jh
    public final boolean A0J() {
        C1633Ws cause;
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A1J(super.A01);
        String strA04 = C1999ea.A04(super.A02, this.A0B, this.A07);
        this.A03.A1K(super.A02);
        this.A03.A1O(strA04);
        AdActivityIntent adActivityIntentA05 = C1635Wu.A05(this.A04);
        adActivityIntentA05.putExtra(A05(Opcodes.FRETURN, 8, 83), this.A05);
        adActivityIntentA05.putExtra(A05(127, 25, 78), this.A03);
        adActivityIntentA05.putExtra(A05(34, 19, 107), this.A03);
        adActivityIntentA05.putExtra(A05(Opcodes.IF_ACMPNE, 8, 27), this.A0B);
        if (strA04 != null) {
            adActivityIntentA05.putExtra(A05(112, 15, 89), strA04);
        }
        adActivityIntentA05.putExtra(A05(66, 11, 109), this.A0A);
        adActivityIntentA05.putExtra(A05(101, 11, 74), this.A00);
        if (this.A09 != null) {
            adActivityIntentA05.putExtra(A05(53, 13, 125), this.A09);
        }
        A0A(adActivityIntentA05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            adActivityIntentA05.setFlags(adActivityIntentA05.getFlags() | 268435456);
        }
        ActivityUtils.A03(this.A04);
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C1635Wu.A0I(this.A04, adActivityIntentA05)) {
                    this.A04.A0F().AIC();
                    if (this.A01 != null) {
                        this.A01.AFp(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C1635Wu.A0B(this.A04, adActivityIntentA05);
            return true;
        } catch (C1633Ws e) {
            String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            if (e.getCause() != null) {
                cause = e;
                cause = e.getCause();
            }
            cause = e;
            this.A04.A08().ABC(A05(23, 11, 50), AbstractC1543Td.A01, new C1544Te(cause));
            return true;
        }
    }

    public final void A0K(C2131gi c2131gi, NJ nj, O8 o8, boolean z, String str, String str2) {
        String strA05;
        this.A0C.set(false);
        this.A04 = c2131gi;
        this.A01 = nj;
        this.A0A = o8.A02();
        this.A00 = o8.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            String str3 = this.A0A;
            String strA06 = A05(0, 1, 12);
            String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                strA05 = str3.split(strA06)[0];
            }
            throw new RuntimeException();
        }
        strA05 = A05(0, 0, 100);
        this.A07 = strA05;
        this.A03 = NQ.A03(o8.A03(), this.A04);
        this.A03.A1M(str);
        this.A03.A1I(o8.A01().A06());
        if (this.A03.A1b()) {
            this.A08 = ((C2290jT) this.A03).A2A();
        } else {
            this.A08 = ((AbstractC2296jd) this.A03).A2E();
        }
        if (this.A03.A1g()) {
            this.A05 = WK.A08;
            if (this.A03.A1U()) {
                this.A04.A0F().AJt(M5.A08);
            } else {
                this.A04.A0F().AJt(M5.A0A);
            }
        } else {
            switch (this.A03.A0o()) {
                case 0:
                    this.A05 = WK.A0I;
                    this.A04.A0F().AJt(M5.A0D);
                    break;
                case 1:
                    this.A05 = WK.A0H;
                    this.A04.A0F().AJt(M5.A0C);
                    break;
                case 2:
                    this.A05 = WK.A05;
                    this.A04.A0F().AJt(M5.A05);
                    break;
                case 3:
                    this.A05 = WK.A0G;
                    this.A04.A0F().AJt(M5.A04);
                    break;
                case 4:
                    this.A05 = WK.A0J;
                    this.A04.A0F().AJt(M5.A0E);
                    break;
            }
        }
        if (C1581Up.A0v(c2131gi)) {
            NQ nq = this.A03;
            String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (nq.A1b()) {
                    C2290jT c2290jT = (C2290jT) this.A03;
                    for (int iA23 = c2290jT.A23() - 1; iA23 >= 0; iA23--) {
                        AbstractC2296jd abstractC2296jdA27 = c2290jT.A27(iA23);
                        if (AbstractC1387Mx.A06(this.A04, AbstractC1387Mx.A01(c2131gi, abstractC2296jdA27.A1H(), abstractC2296jdA27.A2E()), c2131gi.A0A())) {
                            this.A04.A0F().A52();
                            c2290jT.A2C(iA23);
                            return;
                        }
                    }
                    if (c2290jT.A23() == 0) {
                        this.A01.AFp(this, AdError.NO_FILL);
                        return;
                    }
                } else if (AbstractC1387Mx.A06(this.A04, AbstractC1387Mx.A01(c2131gi, o8.A03(), ((AbstractC2296jd) this.A03).A2E()), c2131gi.A0A())) {
                    this.A04.A0F().A52();
                    this.A01.AFp(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A02 = new NK(this.A0B, this, nj);
        A07();
        A0D(z);
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final String A7O() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        A08();
    }
}
