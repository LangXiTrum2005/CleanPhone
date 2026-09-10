package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1348c8 {
    public static byte[] A0L;
    public static String[] A0M = {"pLRRT7xfKKmC", "sDjB9WgW1E6gHf8gwZURHsTrfoUrQz1T", "uiJP8xmaVv", "5XKoBHy1xynVgVvyT837PyBbXD1HwArb", "BpJCepaU8WbBulVTB", "9USxYKvyty1bKFarGQoBTCJfC9", "y9X2NkRV2raN2WQBQaXrllWfrJ", "7FHQr1tSmfn5NF7ZWaBxZ9Q6x0"};
    public int A01;
    public int A02;
    public IG A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C1925le A0C;
    public final C1828k1 A0D;
    public final A7 A0E;
    public final IF A0F;
    public final IN A0G;
    public final IO A0H;
    public final String A0J;
    public final Map<String, String> A0K;
    public final Object A0I = new Object();
    public int A00 = 0;
    public String A04 = null;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C1348c8(C1828k1 c1828k1, A7 a7, IF r14, String str, boolean z, int i, int i2, boolean z2, Bundle bundle, Map<String, String> map, IN in) {
        this.A02 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A0B = false;
        this.A07 = false;
        this.A06 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0D = c1828k1;
        this.A0E = a7;
        this.A0F = r14;
        this.A0J = str;
        this.A0K = map;
        this.A08 = z;
        this.A07 = z2;
        this.A0G = in;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1350cA(this, 0.5d, -1.0d, 2.0d, true));
        arrayList.add(new C1349c9(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A0C = new C1925le(arrayList, bundle.getBundle(A0H(6, 16, 57)), this.A0G);
            this.A02 = bundle.getInt(A0H(97, 18, 74));
            this.A01 = bundle.getInt(A0H(79, 18, 108));
            this.A06 = bundle.getBoolean(A0H(Input.Keys.NUMPAD_2, 10, 97), false);
            this.A0A = bundle.getBoolean(A0H(171, 20, 71), false);
            this.A09 = bundle.getBoolean(A0H(Input.Keys.NUMPAD_SUBTRACT, 15, 59), false);
        } else {
            this.A02 = i;
            this.A01 = i2;
            this.A0C = new C1925le(arrayList, this.A0G);
        }
        this.A05 = C05789m.A2N(this.A0D);
        this.A0B = C05789m.A2R(this.A0D);
        this.A0H = new IO(new Handler(), this);
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0L = new byte[]{-86, -84, -67, -78, -72, -73, -53, -50, -69, -33, -53, -42, -45, -34, -29, -73, -53, -40, -53, -47, -49, -36, -75, -56, -67, -63, -71, -77, -63, -57, -65, -48, -59, -55, -63, -71, -70, -63, -76, -74, -55, -66, -62, -70, -76, -62, -56, -42, -41, -34, -47, -24, -26, -37, -33, -41, -47, -33, -27, -49, -32, -49, -40, -34, -55, -45, -40, -50, -49, -30, -69, -50, -59, -58, -62, -73, -49, -69, -56, 9, -2, cw.n, 17, -33, 12, 18, 11, 1, -2, cw.m, 22, -15, 6, 10, 2, -22, -16, -25, -36, -18, -17, -53, -19, -22, -30, -19, -32, -18, -18, -49, -28, -24, -32, -56, -50, -46, -56, -58, -39, -60, -46, -40, -17, -27, -8, -10, -31, -17, -11, -38, -46, -35, -39, -5, -3, -16, -5, -5, -1, -62, -58, -69, -65, -73, -44, -37, 5, 6, -13, 6, -9, -15, -10, 1, 0, -9, -33, -32, -51, -32, -47, -53, -39, -34, -49, -53, -46, -43, -34, -47, -48, -21, -20, -39, -20, -35, -41, -18, -31, -35, -17, -39, -38, -28, -35, -41, -34, -31, -22, -35, -36, -6, -17, -13, -21, -6, -16, -27, -13, -23, -22, -28, -38, -37, -49, -26, -85, -91, -99, 31, 25, 32, 19, 17, 6, 10, 2, -4, 10, cw.n, -70, -69, -93, -74, -73, -78, -64, -63, -85, -81, -80, -90, -30, -29, -39, -51, -28, 24, 10, cw.m, 5, cw.n, 24};
    }

    static {
        A0O();
    }

    private final float A0F() {
        return D0.A00(this.A0D) * this.A0F.getVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(IH ih) {
        int currentPositionInMillis = this.A0F.getCurrentPositionInMillis();
        int i = this.A00 + 1;
        this.A00 = i;
        return A0K(ih, currentPositionInMillis, i);
    }

    private Map<String, String> A0K(IH ih, int i, int i2) {
        HashMap map = new HashMap();
        D0.A03(map, this.A0F.getVideoStartReason() == IP.A02, !this.A0F.AAK());
        A0U(map);
        A0S(map);
        A0W(map, i);
        A0V(map);
        A0T(map);
        A0n(ih, map);
        map.put(A0H(0, 6, 24), String.valueOf(ih.A00));
        map.put(A0H(59, 11, 57), String.valueOf(i2));
        return map;
    }

    private void A0M() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(IH.A04));
    }

    private void A0N() {
        if (this.A07 && this.A06) {
            return;
        }
        String str = this.A0J;
        String[] strArr = A0M;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[6] = "FJm4aBnN5GbAhpBnCwQDj";
        A0R(str, A0J(IH.A0A));
    }

    private final void A0P(int i, boolean z, boolean z2) {
        if (i <= 0.0d || i < this.A02) {
            return;
        }
        if (i > this.A02) {
            this.A0C.A06((i - this.A02) / 1000.0f, A0F());
            double dA9L = this.A0G.A9L();
            if (dA9L < 0.5d && C05789m.A1b(this.A0D)) {
                this.A0D.A0F().AJp(String.valueOf(dA9L));
            }
            this.A02 = i;
            if (z2 || i - this.A01 >= 5000) {
                String str = this.A0J;
                IH ih = IH.A09;
                int i2 = this.A00 + 1;
                this.A00 = i2;
                A0R(str, A0K(ih, i, i2));
                this.A01 = this.A02;
                this.A0C.A05();
                return;
            }
        }
        if (z) {
            if (this.A07 && this.A06) {
                return;
            }
            this.A06 = true;
            String str2 = this.A0J;
            IH ih2 = IH.A09;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            A0R(str2, A0K(ih2, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(String str, Map<String, String> data) {
        this.A0E.ABV(str, data);
        if (this.A03 != null) {
            this.A03.ADy();
        }
    }

    private void A0S(Map<String, String> params) {
        C04203f c04203fA03 = this.A0C.A03();
        C04193e c04193eA00 = c04203fA03.A00();
        params.put(A0H(226, 3, 25), String.valueOf(c04193eA00.A00()));
        params.put(A0H(229, 3, 8), String.valueOf(c04193eA00.A06()));
        params.put(A0H(232, 5, 59), String.valueOf(c04193eA00.A03()));
        params.put(A0H(EnumC4719u30.PLACEMENT_SLEEP_VALUE, 8, 108), String.valueOf(c04193eA00.A02() * 1000.0d));
        params.put(A0H(47, 12, 65), String.valueOf(c04193eA00.A01() * 1000.0d));
        params.put(A0H(122, 7, 81), String.valueOf(c04193eA00.A04() * 1000.0d));
        if (this.A04 != null) {
            params.put(A0H(EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE, 6, 19), this.A04);
        }
        C04193e c04193eA01 = c04203fA03.A01();
        params.put(A0H(195, 3, 83), String.valueOf(c04193eA01.A00()));
        params.put(A0H(198, 3, 76), String.valueOf(c04193eA01.A06()));
        params.put(A0H(201, 5, 61), String.valueOf(c04193eA01.A03()));
        params.put(A0H(22, 8, 35), String.valueOf(c04193eA01.A02() * 1000.0d));
        params.put(A0H(35, 12, 36), String.valueOf(c04193eA01.A01() * 1000.0d));
        params.put(A0H(115, 7, 52), String.valueOf(c04193eA01.A04() * 1000.0d));
    }

    private void A0T(Map<String, String> params) {
        if (this.A0K != null) {
            params.putAll(this.A0K);
        }
    }

    private void A0U(Map<String, String> map) {
        map.put(A0H(70, 9, 37), String.valueOf(this.A0F.AAF()));
        map.put(A0H(133, 4, 90), Long.toString(this.A0F.getInitialBufferTime()));
    }

    private void A0V(Map<String, String> params) {
        Rect rect = new Rect();
        this.A0F.getGlobalVisibleRect(rect);
        params.put(A0H(137, 2, 90), String.valueOf(rect.top));
        params.put(A0H(131, 2, 60), String.valueOf(rect.left));
        params.put(A0H(129, 2, 57), String.valueOf(this.A0F.getMeasuredHeight()));
        params.put(A0H(Input.Keys.NUMPAD_0, 2, 51), String.valueOf(this.A0F.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.A0D.getSystemService(A0H(237, 6, 112));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0H(206, 3, 4), String.valueOf(displayMetrics.heightPixels));
        params.put(A0H(EnumC4719u30.INVALID_JSON_BID_PAYLOAD_VALUE, 3, 120), String.valueOf(displayMetrics.widthPixels));
    }

    private void A0W(Map<String, String> map, int i) {
        map.put(A0H(30, 5, 43), String.valueOf(System.currentTimeMillis()));
        map.put(A0H(Input.Keys.F9, 5, 33), String.valueOf(this.A01 / 1000.0f));
        map.put(A0H(Input.Keys.F21, 4, 85), String.valueOf(i / 1000.0f));
    }

    public final int A0b() {
        return this.A02;
    }

    public final Bundle A0c() {
        A0l(A0b(), A0b());
        Bundle bundle = new Bundle();
        bundle.putInt(A0H(97, 18, 74), this.A02);
        bundle.putInt(A0H(79, 18, 108), this.A01);
        bundle.putBoolean(A0H(Input.Keys.NUMPAD_2, 10, 97), this.A06);
        bundle.putBoolean(A0H(171, 20, 71), this.A0A);
        bundle.putBoolean(A0H(Input.Keys.NUMPAD_SUBTRACT, 15, 59), this.A09);
        bundle.putBundle(A0H(6, 16, 57), this.A0C.A02());
        return bundle;
    }

    public final void A0d() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(IH.A07));
    }

    public final void A0e() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(IH.A08));
    }

    public final void A0f() {
        if (A0F() < 0.05d) {
            synchronized (this.A0I) {
                if (this.A08) {
                    A0M();
                    this.A08 = false;
                }
            }
            return;
        }
        synchronized (this.A0I) {
            if (!this.A08) {
                A0N();
                this.A08 = true;
            }
        }
    }

    public final void A0g() {
        this.A0D.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A0H);
    }

    public final void A0h() {
        this.A0D.getContentResolver().unregisterContentObserver(this.A0H);
    }

    public final void A0i(int i) {
        if (this.A07 && this.A06) {
            return;
        }
        this.A0C.A04();
        A0R(this.A0J, A0J(IH.A05));
        if (this.A05) {
            A0P(i, false, true);
        } else {
            A0P(i, false, ((double) i) < 2000.0d);
        }
        if (this.A0B) {
            this.A0C.A05();
        }
    }

    public final void A0j(int i) {
        A0P(i, true, false);
        if (!this.A07) {
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0k(int i) {
        A0P(i, false, false);
    }

    public final void A0l(int i, int i2) {
        A0P(i, true, false);
        this.A01 = i2;
        this.A02 = i2;
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0m(IG ig) {
        this.A03 = ig;
    }

    public void A0n(IH ih, Map<String, String> params) {
    }

    public final void A0o(C1348c8 c1348c8) {
        c1348c8.A06 = this.A06;
        c1348c8.A07 = this.A07;
        c1348c8.A0A = this.A0A;
        c1348c8.A09 = this.A09;
        c1348c8.A02 = this.A02;
        c1348c8.A01 = this.A01;
    }
}
