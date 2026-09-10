package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2429iu implements WC {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public OB A00;
    public C1731Tw A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final N6 A07;
    public final C2300gi A08;
    public final VA A09;
    public final EnumC1775Vq A0A;
    public final WD A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        YD.A02();
    }

    public C2429iu(C2300gi c2300gi, String str, EnumC1775Vq enumC1775Vq, AdSize adSize, int i2) {
        this.A08 = c2300gi;
        this.A0D = str;
        this.A0A = enumC1775Vq;
        this.A06 = adSize;
        this.A04 = i2;
        this.A0B = new WD(this.A08);
        this.A0B.A0R(this);
        this.A07 = new N6();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new Q9<C2429iu>(this) { // from class: com.facebook.ads.redexgen.X.7e
            {
                super(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
            public final void A07() {
                C2429iu c2429iuA08 = A08();
                if (c2429iuA08 == null) {
                    return;
                }
                if (YV.A02(c2429iuA08.A08)) {
                    c2429iuA08.A07();
                } else {
                    c2429iuA08.A05.postDelayed(c2429iuA08.A0C, 5000L);
                }
            }
        };
        this.A09 = c2300gi.A0A();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C2482ju> A04() {
        C1731Tw c1731Tw = this.A01;
        final ArrayList arrayList = new ArrayList(c1731Tw.A02());
        for (C1729Tu c1729TuA04 = c1731Tw.A04(); c1729TuA04 != null; c1729TuA04 = c1731Tw.A04()) {
            N1 n1A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (n1A00 != null && n1A00.A8k() == AdPlacementType.NATIVE) {
                final C2482ju nativeAdapter = (C2482ju) n1A00;
                nativeAdapter.A0L(this.A08, new AbstractC2430iv() { // from class: com.facebook.ads.redexgen.X.7f
                    @Override // com.facebook.ads.redexgen.core.NG
                    public final void AEw(C2482ju c2482ju) {
                        arrayList.add(nativeAdapter);
                    }
                }, this.A09, new O8(c1729TuA04.A04(), c1731Tw.A05(), this.A0D, c1731Tw.A05().A0C()), UK.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0Q(new WA(this.A08, this.A0D, this.A06 != null ? new C1821Xn(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new C1779Vu(this.A08, null, null, null), AbstractC1827Xt.A01(C1750Up.A0N(this.A08)), this.A02, null, new C2419ij()));
        } catch (C1773Vn e2) {
            ADp(C1772Vm.A02(e2));
        }
    }

    public final void A08(OB ob) {
        this.A00 = ob;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final void ADp(C1772Vm c1772Vm) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ADp(c1772Vm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final void AG7(RG rg) {
        C1731Tw c1731TwA00 = rg.A00();
        if (c1731TwA00 != null) {
            if (this.A03) {
                long jA0A = c1731TwA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c1731TwA00;
            List<C2482ju> listA04 = A04();
            if (this.A00 != null) {
                boolean zIsEmpty = listA04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (zIsEmpty) {
                    this.A00.ADp(C1772Vm.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AEy(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
