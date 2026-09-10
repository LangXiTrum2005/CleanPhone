package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05357t {
    public static C1D A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", "cv"};
    public static final String A0E;
    public static final Map<String, C1J> A0F;
    public static final Map<String, C05377v> A0G;
    public long A00;
    public AF A01;
    public final C05367u A03;
    public final AnonymousClass85 A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(D8.A02().submit(it.next()));
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        try {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Boolean bool = (Boolean) ((Future) it2.next()).get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e(A0E, A08(85, 42, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), e);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{125, 46, 124, 123, 122, 124, 125, 41, 88, 8, cw.m, cw.k, 89, 90, 12, 32, 37, 32, 118, 118, 47, 46, 37, 11, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, 64, 7, 68, 72, 74, 87, 75, 66, 83, 66, 63, 29, 31, 20, 21, 18, 27, 92, 26, 29, 21, cw.n, 25, 24, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, 12, 66, 64, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, 127, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = C05357t.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C05357t(AnonymousClass85 anonymousClass85) {
        this.A04 = anonymousClass85;
        this.A03 = C05367u.A06(anonymousClass85.A02());
        this.A08 = C05789m.A2g(anonymousClass85);
        this.A09 = C05789m.A2p(anonymousClass85, J3.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.1K] */
    public static synchronized C1D A03(C1827k0 c1827k0) {
        if (A0A == null) {
            A0A = C1E.A00(c1827k0, new Object() { // from class: com.facebook.ads.redexgen.X.1K
                public int A00;
                public int A01;
                public boolean A02;
                public boolean A03;
                public boolean A04;

                public final C1K A00(int i) {
                    this.A00 = i;
                    return this;
                }

                public final C1K A01(int i) {
                    this.A01 = i;
                    return this;
                }

                public final C1K A02(boolean z) {
                    this.A02 = z;
                    return this;
                }

                public final C1K A03(boolean z) {
                    this.A03 = z;
                    return this;
                }

                public final C1K A04(boolean z) {
                    this.A04 = z;
                    return this;
                }

                public final C1L A05() {
                    return new C1L(this.A00, this.A02, this.A01, this.A03, this.A04);
                }
            }.A00(C05789m.A06(c1827k0)).A02(c1827k0.A05().AAD()).A01(-1).A03(C05789m.A0o(c1827k0)).A04(C05789m.A2o(c1827k0)).A05(), A05(c1827k0));
        }
        return A0A;
    }

    public static C1J A04(AnonymousClass85 anonymousClass85, String str) {
        C1J c1j = A0F.get(str);
        if (C05387w.A06(anonymousClass85) && c1j != null) {
            C1J storedCacheData = new C1J(c1j);
            return storedCacheData;
        }
        C1J storedCacheData2 = new C1J(str);
        return storedCacheData2;
    }

    public static C1832k5 A05(C1827k0 c1827k0) {
        return new C1832k5(c1827k0);
    }

    public static synchronized List<String> A09(AnonymousClass85 anonymousClass85) {
        if (A0B == null) {
            A0B = new ArrayList();
            A0J(A0B, anonymousClass85);
        }
        return A0B;
    }

    public static /* synthetic */ Map A0A() {
        Map<String, C05377v> map = A0G;
        if (A0D[7].length() == 16) {
            throw new RuntimeException();
        }
        A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
        return map;
    }

    public static void A0H(AnonymousClass85 anonymousClass85, String str) {
        if (C05387w.A06(anonymousClass85) && !TextUtils.isEmpty(str)) {
            C05377v c05377v = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c05377v != null) {
                c05377v.A00 = A08(Input.Keys.F15, 4, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                C1827k0 c1827k0A02 = anonymousClass85.A02();
                J7 j7A01 = J7.A01(c1827k0A02);
                String strA09 = J7.A09(c1827k0A02, C5.A00(str));
                if (strA09 == null) {
                    strA09 = str;
                }
                C05387w.A04(anonymousClass85, c05377v, j7A01.A0J(strA09));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(AE ae) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(173, 12, 71), C0646Cu.A05(this.A00));
        this.A01.A04(ae, map);
    }

    public static void A0J(List<String> cacheDirs, AnonymousClass85 anonymousClass85) {
        A0K(cacheDirs, C2045nd.A01(anonymousClass85));
        A0K(cacheDirs, C05367u.A07(anonymousClass85));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String path2 = A08(0, 0, 103);
        if (path != path2) {
            Locale locale = Locale.getDefault();
            String path3 = A0D[4];
            if (path3.length() == 2) {
                throw new RuntimeException();
            }
            A0D[4] = "BAOa9xP";
            String path4 = path.toLowerCase(locale);
            list.add(path4);
        }
    }

    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0N(String str, int i, int i2) {
        if (this.A08) {
            C1J c1jA04 = A04(this.A04, str);
            c1jA04.A03 = A08(Input.Keys.F15, 4, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            c1jA04.A01 = i2;
            c1jA04.A00 = i;
            return A03(this.A04.A02()).AHk(c1jA04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i, i2, A08(169, 4, 85));
    }

    public final File A0O(String str) {
        C1J c1jA04 = A04(this.A04, str);
        c1jA04.A03 = A08(Input.Keys.F15, 4, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        return A03(this.A04.A02()).AHl(c1jA04);
    }

    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String str) {
        C1J c1jA04 = A04(this.A04, str);
        c1jA04.A03 = A08(Input.Keys.F15, 4, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        String strAHn = A03(this.A04.A02()).AHn(c1jA04);
        return strAHn != null ? strAHn : str;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        AbstractC0606Au.A05(A08(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 19, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), A08(37, 16, 123), A08(0, 8, 20));
    }

    public final void A0U() {
        AbstractC0606Au.A05(A08(Input.Keys.NUMPAD_2, 16, 80), A08(53, 14, 32), A08(8, 7, 50));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(InterfaceC05277l interfaceC05277l, C05287m c05287m) {
        AbstractC0606Au.A05(A08(Input.Keys.NUMPAD_LEFT_PAREN, 7, 81), A08(67, 18, 90), A08(15, 8, 75));
        this.A00 = System.currentTimeMillis();
        C05387w.A02(this.A04, c05287m, C05387w.A07, A08(23, 14, 20), -1L);
        D8.A03().execute(new C1833k6(this, new ArrayList(this.A05), c05287m, interfaceC05277l, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C05317p c05317p) {
        this.A05.add(new CallableC05327q(this, c05317p));
    }

    public final void A0Y(C05317p c05317p) {
        c05317p.A05 = true;
        this.A06.add(new CallableC05327q(this, c05317p));
    }

    public final void A0Z(C05317p c05317p) {
        c05317p.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC05307o(this, c05317p));
        } else {
            this.A06.add(new CallableC05327q(this, c05317p));
        }
    }

    public final void A0a(C05317p c05317p) {
        if (this.A09) {
            this.A05.add(new CallableC05307o(this, c05317p));
        } else {
            this.A05.add(new CallableC05327q(this, c05317p));
        }
    }

    public final void A0b(final C05337r c05337r) {
        Callable<Boolean> callable = new Callable<Boolean>(c05337r) { // from class: com.facebook.ads.redexgen.X.7s
            public static byte[] A02;
            public final C05337r A00;

            static {
                A02();
            }

            public static String A01(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A02() {
                A02 = new byte[]{-35, -31, -43, -37, -39};
            }

            {
                this.A00 = c05337r;
            }

            private final Boolean A00() throws Throwable {
                if (BQ.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    C1J c1j = new C1J(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 114), this.A00.A01, this.A00.A02);
                    c1j.A01 = this.A00.A04;
                    c1j.A00 = this.A00.A03;
                    if (C05387w.A06(this.A01.A04)) {
                        C05357t.A0F.put(this.A00.A07, c1j);
                    }
                    boolean precacheResult = false;
                    if (this.A01.A08) {
                        precacheResult = C05357t.A03(this.A01.A04.A02()).AHk(c1j, false).A01();
                    } else if (this.A01.A03.A0D(this.A00) != null) {
                        precacheResult = true;
                    }
                    C7z c7z = this.A00.A00;
                    if (c7z != null && c7z.A02()) {
                        int iA00 = c7z.A00();
                        int iA01 = c7z.A01();
                        if (iA00 <= 0 || iA01 <= 0) {
                            if (this.A01.A08) {
                                A04(this.A00.A07, c1j);
                            } else {
                                A03(this.A00.A03, this.A00.A04);
                            }
                        } else if (this.A01.A08) {
                            c1j.A00 = iA00;
                            c1j.A01 = iA01;
                            A04(this.A00.A07, c1j);
                        } else {
                            A03(iA00, iA01);
                        }
                    }
                    return Boolean.valueOf(precacheResult);
                } catch (Throwable th) {
                    BQ.A00(th, this);
                    return null;
                }
            }

            private void A03(int i, int i2) {
                Bitmap bitmapA0E = this.A01.A03.A0E(this.A01.A04, this.A00.A07, i, i2, this.A00.A01);
                if (bitmapA0E == null) {
                    return;
                }
                this.A01.A07.put(this.A00.A07, bitmapA0E);
            }

            private void A04(String str, C1J c1j) {
                Bitmap bitmapA00 = C05357t.A03(this.A01.A04.A02()).AHk(c1j, true).A00();
                if (bitmapA00 == null) {
                    return;
                }
                this.A01.A07.put(str, bitmapA00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (BQ.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    BQ.A00(th, this);
                    return null;
                }
            }
        };
        if (!c05337r.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C05337r c05337r) {
        c05337r.A02 = true;
        A0b(c05337r);
    }

    public final void A0d(AF af) {
        this.A01 = af;
    }
}
