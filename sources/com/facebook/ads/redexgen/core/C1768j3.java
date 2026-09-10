package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1768j3 implements A7 {
    public static A7 A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1827k0 A00;
    public final C9O A01;
    public final A6 A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, 18, 26, 7, 3, 30, 25, cw.n, 87, 3, 24, 87, 27, 24, cw.n, 87, 22, 25, 87, 30, 25, 1, 22, 27, 30, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, 29, cw.n, 25, 12};
    }

    static {
        A03();
        A05 = C1768j3.class.getSimpleName();
        A06 = false;
    }

    public C1768j3(C1827k0 c1827k0) {
        A5 dispatchCallback;
        this.A00 = c1827k0;
        if (AbstractC05809o.A0T(c1827k0)) {
            this.A01 = C9M.A00(c1827k0);
            dispatchCallback = AC.A00(c1827k0, this.A01);
        } else {
            M2 m2A01 = C9M.A01(c1827k0);
            dispatchCallback = AC.A01(c1827k0, m2A01);
            this.A01 = m2A01;
        }
        this.A02 = new C1771j6(c1827k0, dispatchCallback);
        D8.A08.execute(new C1770j5(this));
        A04(c1827k0);
    }

    public static synchronized A7 A01(C1827k0 c1827k0) {
        if (A03 == null) {
            A03 = new C1768j3(c1827k0);
        }
        return A03;
    }

    public static synchronized void A04(C1827k0 c1827k0) {
        if (A06) {
            return;
        }
        c1827k0.A04().AC7();
        A06 = true;
    }

    private void A05(A4 a4) {
        if (!a4.A0A()) {
            Log.e(A05, A02(7, 29, 55) + a4.A06() + A02(0, 7, 82));
        } else {
            A06(a4);
            this.A01.AKB(a4, new C1769j4(this, a4));
        }
    }

    private void A06(A4 a4) {
        switch (a4.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                C05428b c05428b = new C05428b(new Exception(A02(36, 5, 86)));
                c05428b.A05(1);
                try {
                    c05428b.A07(new JSONObject().put(A02(48, 4, 41), a4.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A08().AAv(A02(41, 7, 112), AbstractC05418a.A1H, c05428b);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AAn(String str, Map<String, String> data) {
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AAp(String str, Map<String, String> data) {
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AAq(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A07).A06(AH.A0A(str, AE.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AAr(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A08).A06(AH.A0A(str, AE.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AAt(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AAx(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AB0(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0D).A06(AH.A0A(str, AE.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AB1(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AB2(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0F).A06(AH.A0A(str, AE.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AB3(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0K).A06(AH.A0A(str, AE.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABC(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0H).A06(AH.A0A(str, AE.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABE(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A0J).A06(AH.A0A(str, AE.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABF(String str, Map<String, String> data, String str2, A9 a9) {
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(a9).A02(AA.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABG(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A4 adEvent = new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABK(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0N).A06(AH.A0A(str, AE.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABL(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0O).A06(AH.A0A(str, AE.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABN(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(A9.A04).A02(AA.A0P).A06(AH.A0A(str, AE.A0k)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABO(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A04).A02(AA.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABS(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0Q).A06(AH.A0A(str, AE.A0o)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABT(String str, Map<String, String> data) {
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void ABV(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new A3().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(A9.A05).A02(AA.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.A7
    public final void AG7(String str) {
        new AsyncTaskC0819Jl(this.A00).execute(str);
    }
}
