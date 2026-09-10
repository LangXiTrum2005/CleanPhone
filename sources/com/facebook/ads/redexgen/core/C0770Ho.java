package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0770Ho extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public InterfaceC0768Hm A02;
    public Map<String, String> A03;
    public final AbstractC1984md A04;
    public final C04042p A05;
    public final C1828k1 A06;
    public final A7 A07;
    public final F4 A08;
    public final C1625ge A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, 18, 32, 28, 17, 9, 17, 18, 28, 21, 49, 20, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, 127, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, 127, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, cw.k, 49, 60, 36, 60, 63, 49, 56, 28, 57, 46, 11, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, 127, 113, 116, 121, 126, 119, 48, 98, 117, 125, 127, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, cw.k, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, 61, 37, 38, 40, 33, 27, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A09();
        A0E = (int) (CP.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0770Ho(C1828k1 c1828k1, AbstractC1984md abstractC1984md, C04042p c04042p, A7 a7, InterfaceC0768Hm interfaceC0768Hm, Map<String, String> playableMetricsData) {
        super(c1828k1);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A08 = new C0841Kh(this);
        this.A06 = c1828k1;
        this.A04 = abstractC1984md;
        this.A05 = c04042p;
        this.A07 = a7;
        this.A02 = interfaceC0768Hm;
        this.A03 = playableMetricsData;
        this.A09 = A04();
        if (this.A05.A0M() && !this.A05.A0O()) {
            A0B();
        }
        if (C05789m.A1s(this.A06)) {
            this.A06.A0B().AJs(this.A09, this.A04.A1g(), false);
        }
        addView(this.A09, A0F);
    }

    public static /* synthetic */ int A00(C0770Ho c0770Ho) {
        int i = c0770Ho.A00;
        c0770Ho.A00 = i + 1;
        return i;
    }

    private C1625ge A04() {
        C1625ge c1625ge = new C1625ge(this.A06, (WeakReference<F4>) new WeakReference(this.A08), 10, C05789m.A20(this.A06));
        c1625ge.setCornerRadius(A0E);
        c1625ge.setLogMultipleImpressions(false);
        c1625ge.setCheckAssetsByJavascriptBridge(false);
        c1625ge.setWebViewTimeoutInMillis(this.A05.A09());
        c1625ge.setRequestId(this.A04.A0r());
        c1625ge.setOnTouchListener(new ViewOnTouchListenerC0769Hn(this, null));
        WebSettings settings = c1625ge.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        c1625ge.addJavascriptInterface(new C0771Hp(this.A06, this, this.A07, this.A03, this.A04.A1g()), A06(0, 12, 121));
        return c1625ge;
    }

    public final void A0A() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.A01;
        C05428b c05428b = new C05428b(A06(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(136, 6, 72), this.A00);
            jSONObject.put(A06(Input.Keys.F12, 5, 104), jCurrentTimeMillis);
            jSONObject.put(A06(Input.Keys.F17, 5, 51), this.A04.A1g());
        } catch (JSONException e) {
            Log.e(A06(92, 15, 84), A06(12, 13, 74), e);
        }
        c05428b.A07(jSONObject);
        c05428b.A05(1);
        C8Z c8zA08 = this.A06.A08();
        int i = AbstractC05418a.A2D;
        String strA06 = A06(Input.Keys.NUMPAD_3, 8, 11);
        c8zA08.AAv(strA06, i, c05428b);
        this.A00 = 0;
        if (!C05789m.A1n(this.A06)) {
            if (this.A02 == null) {
                return;
            }
            this.A02.ACm();
            return;
        }
        if (jCurrentTimeMillis <= C05789m.A0K(this.A06)) {
            InterfaceC0768Hm interfaceC0768Hm = this.A02;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            if (interfaceC0768Hm != null) {
                this.A02.ACm();
                return;
            }
            return;
        }
        c05428b.A05(0);
        this.A06.A08().AAu(strA06, AbstractC05418a.A2E, c05428b);
    }

    public final void A0B() {
        String strA0F;
        if (this.A05.A0O()) {
            C05428b c05428b = new C05428b(A06(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 36), this.A05.A0I());
                jSONObject.put(A06(Input.Keys.F17, 5, 51), this.A04.A1g());
            } catch (JSONException e) {
                String strA06 = A06(92, 15, 84);
                String strA07 = A06(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(strA06, strA07, e);
            }
            c05428b.A07(jSONObject);
            c05428b.A05(1);
            C8Z c8zA08 = this.A06.A08();
            int i = AbstractC05418a.A2G;
            String strA08 = A06(Input.Keys.NUMPAD_MULTIPLY, 15, 77);
            c8zA08.AAv(strA08, i, c05428b);
            if (C05789m.A0q(this.A06) && AbstractC0644Cs.A00(this.A06) == EnumC0643Cr.A07) {
                this.A06.A08().AAv(strA08, AbstractC05418a.A2F, c05428b);
                this.A08.AD9(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            C1625ge c1625ge = this.A09;
            if (!TextUtils.isEmpty(this.A05.A0C())) {
                strA0F = this.A05.A0C();
            } else {
                strA0F = this.A05.A0F();
            }
            c1625ge.loadUrl(strA0F);
        } catch (Exception e2) {
            this.A06.A08().AAu(A06(192, 8, 9), AbstractC05418a.A2f, new C05428b(e2));
        }
    }

    public final void A0C() {
        if (C05789m.A1s(this.A06)) {
            this.A06.A0B().AJZ(this.A09);
        }
        this.A09.removeJavascriptInterface(A06(0, 12, 121));
        this.A09.destroy();
    }

    public C0647Cv getTouchDataRecorder() {
        return this.A09.getTouchDataRecorder();
    }

    public JL getViewabilityChecker() {
        return this.A09.getViewabilityChecker();
    }

    public void setPlayableAdsViewListener(InterfaceC0768Hm interfaceC0768Hm) {
        this.A02 = interfaceC0768Hm;
    }
}
