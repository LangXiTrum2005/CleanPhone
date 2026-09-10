package com.facebook.ads.redexgen.core;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1736iW extends BY {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ B6 A00;
    public final /* synthetic */ B9 A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{121, 115, 97, 124, 127, 112, 112, 123, 108, 97, 117, 123, 103, 18, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, 63, 51, 50, 50, 57, 63, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A01.A00 = System.currentTimeMillis();
        if (AbstractC0644Cs.A00(this.A01.A05) == EnumC0643Cr.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String strA01 = A01(13, 21, 62);
            this.A01.A05.A0F().A3M(C0646Cu.A01(this.A01.A01), adErrorType.getErrorCode(), strA01, adErrorType.isPublicError());
            this.A01.A0E(new C0597Ag(adErrorType, strA01));
            return;
        }
        C05518k.A08(this.A01.A05);
        C7V.A07(this.A01.A05);
        boolean z = true;
        Map<String, String> mapA0A = this.A00.A0A(C9D.A00().A01(this.A01.A05, true).A7o(this.A00.A05()));
        this.A01.A03 = mapA0A;
        try {
            PackageManager packageManager = this.A01.A05.getPackageManager();
            if (packageManager != null) {
                mapA0A.put(A01(1, 12, 92), new String(Base64.encode((this.A01.A05.getPackageName() + A01(0, 1, 59) + packageManager.getInstallerPackageName(this.A01.A05.getPackageName())).getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC0601Al.A04 && this.A00.A07() != EnumC0601Al.A06 && this.A00.A07() != EnumC0601Al.A05 && this.A00.A07() != null) {
                z = false;
            }
            C0817Jj.A02(z, this.A01.A05).AG6(this.A01.A07, new C0813Jf().A05(this.A01.A03).A08(), this.A01.A03(C0646Cu.A00(), this.A00));
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            this.A01.A05.A0F().A3M(C0646Cu.A01(this.A01.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            B9 b9 = this.A01;
            C0597Ag c0597AgA01 = C0597Ag.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            b9.A0E(c0597AgA01);
        }
    }

    static {
        A04();
    }

    public C1736iW(B9 b9, B6 b6) {
        this.A01 = b9;
        this.A00 = b6;
    }
}
