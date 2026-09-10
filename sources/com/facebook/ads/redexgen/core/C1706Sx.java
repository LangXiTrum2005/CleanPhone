package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.smartdigimkt.v0.x;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1706Sx {
    public static LR A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", x.f39054c};
    public static final String A0E;
    public static final Map<String, LX> A0F;
    public static final Map<String, C1708Sz> A0G;
    public long A00;
    public VI A01;
    public final C1707Sy A03;
    public final T8 A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(YG.A02().submit(it.next()));
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        try {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Boolean bool = (Boolean) ((Future) it2.next()).get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e(A0E, A08(85, 42, 126), e2);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{121, 42, 122, 120, 124, 44, 42, 121, 95, 11, 92, 93, 15, 86, 90, 10, 34, 114, 47, 35, 34, 36, 118, 11, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, 64, 7, 68, 72, 74, 87, 75, 66, 83, 66, 63, 29, 31, 20, 21, 18, 27, 92, 26, 29, 21, 16, 25, 24, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, 12, 66, 64, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, AbstractJsonLexerKt.TC_INVALID, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = C1706Sx.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C1706Sx(T8 t8) {
        this.A04 = t8;
        this.A03 = C1707Sy.A06(t8.A02());
        this.A08 = C1750Up.A2q(t8);
        this.A09 = C1750Up.A2z(t8, C2227fX.A03());
    }

    public static synchronized LR A03(C2296ge c2296ge) {
        if (A0A == null) {
            A0A = LS.A00(c2296ge, new LY().A00(C1750Up.A06(c2296ge)).A02(c2296ge.A05().AAO()).A01(-1).A03(C1750Up.A0p(c2296ge)).A04(C1750Up.A2y(c2296ge)).A05(), A05(c2296ge));
        }
        return A0A;
    }

    public static LX A04(T8 t8, String str) {
        LX lx = A0F.get(str);
        if (T0.A06(t8) && lx != null) {
            LX storedCacheData = new LX(lx);
            return storedCacheData;
        }
        LX storedCacheData2 = new LX(str);
        return storedCacheData2;
    }

    public static C2304gm A05(C2296ge c2296ge) {
        return new C2304gm(c2296ge);
    }

    public static synchronized List<String> A09(T8 t8) {
        if (A0B == null) {
            A0B = new ArrayList();
            A0J(A0B, t8);
        }
        return A0B;
    }

    public static /* synthetic */ Map A0A() {
        Map<String, C1708Sz> map = A0G;
        if (A0D[7].length() == 16) {
            throw new RuntimeException();
        }
        A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
        return map;
    }

    public static void A0H(T8 t8, String str) {
        if (T0.A06(t8) && !TextUtils.isEmpty(str)) {
            C1708Sz c1708Sz = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c1708Sz != null) {
                c1708Sz.A00 = A08(185, 4, 118);
                C2296ge c2296geA02 = t8.A02();
                C2231fb c2231fbA06 = C2231fb.A06(c2296geA02);
                String strA09 = C2231fb.A09(c2296geA02, XB.A00(str));
                if (strA09 == null) {
                    strA09 = str;
                }
                T0.A04(t8, c1708Sz, c2231fbA06.A0J(strA09));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(VH vh) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 12, 71), Y1.A05(this.A00));
        this.A01.A04(vh, map);
    }

    public static void A0J(List<String> cacheDirs, T8 t8) {
        A0K(cacheDirs, C2540ks.A01(t8));
        A0K(cacheDirs, C1707Sy.A07(t8));
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

    public final float A0M(String str) {
        return this.A03.A0E(str);
    }

    public final Bitmap A0N(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0O(String str, int i2, int i3) {
        if (this.A08) {
            LX lxA04 = A04(this.A04, str);
            lxA04.A03 = A08(185, 4, 118);
            lxA04.A01 = i3;
            lxA04.A00 = i2;
            return A03(this.A04.A02()).AIe(lxA04, true).A00();
        }
        return this.A03.A0G(this.A04, str, i2, i3, A08(169, 4, 85));
    }

    public final File A0P(String str) {
        LX lxA04 = A04(this.A04, str);
        lxA04.A03 = A08(185, 4, 118);
        return A03(this.A04.A02()).AIf(lxA04);
    }

    public final File A0Q(String str) {
        if (this.A08) {
            return A0P(str);
        }
        return this.A03.A0H(str);
    }

    public final String A0R(String str) {
        if (this.A08) {
            return A0S(str);
        }
        return this.A03.A0I(str);
    }

    public final String A0S(String str) {
        LX lxA04 = A04(this.A04, str);
        lxA04.A03 = A08(185, 4, 118);
        String strAIh = A03(this.A04.A02()).AIh(lxA04);
        return strAIh != null ? strAIh : str;
    }

    public final String A0T(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0S(str);
    }

    public final void A0U() {
        AbstractC1783Vy.A05(A08(127, 19, 125), A08(37, 16, 123), A08(16, 7, 75));
    }

    public final void A0V() {
        AbstractC1783Vy.A05(A08(146, 16, 80), A08(53, 14, 32), A08(8, 8, 50));
    }

    public final void A0W() {
        this.A07.clear();
    }

    public final void A0X(InterfaceC1698Sp interfaceC1698Sp, C1699Sq c1699Sq) {
        AbstractC1783Vy.A05(A08(162, 7, 81), A08(67, 18, 90), A08(0, 8, 20));
        this.A00 = System.currentTimeMillis();
        T0.A02(this.A04, c1699Sq, T0.A07, A08(23, 14, 20), -1L);
        YG.A03().execute(new C2305gn(this, new ArrayList(this.A05), c1699Sq, interfaceC1698Sp, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0Y(C1702St c1702St) {
        this.A05.add(new CallableC1703Su(this, c1702St));
    }

    public final void A0Z(C1702St c1702St) {
        c1702St.A05 = true;
        this.A06.add(new CallableC1703Su(this, c1702St));
    }

    public final void A0a(C1702St c1702St) {
        c1702St.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC1701Ss(this, c1702St));
        } else {
            this.A06.add(new CallableC1703Su(this, c1702St));
        }
    }

    public final void A0b(C1702St c1702St) {
        if (this.A09) {
            this.A05.add(new CallableC1701Ss(this, c1702St));
        } else {
            this.A05.add(new CallableC1703Su(this, c1702St));
        }
    }

    public final void A0c(C1704Sv c1704Sv) {
        CallableC1705Sw callableC1705Sw = new CallableC1705Sw(this, c1704Sv);
        if (!c1704Sv.A03) {
            this.A05.add(callableC1705Sw);
        } else {
            this.A06.add(callableC1705Sw);
        }
    }

    public final void A0d(C1704Sv c1704Sv) {
        c1704Sv.A03 = true;
        A0c(c1704Sv);
    }

    public final void A0e(VI vi) {
        this.A01 = vi;
    }
}
