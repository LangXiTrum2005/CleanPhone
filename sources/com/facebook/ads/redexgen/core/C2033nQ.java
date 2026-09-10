package com.facebook.ads.redexgen.core;

import android.os.RemoteException;
import android.text.TextUtils;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2033nQ implements InterfaceC03681f {
    public static byte[] A09;
    public static String[] A0A = {"IBjHvdAE4z3hQw4rxwkyNcKQ0ISAyia4", "k6JnbRLATBGW5JMH6xbwPTUsl0iwlrJc", "UfNjo0M2E3JYTqqfEgwKvI", "0cJpOp9GZhTbse6AR0KBqddAOnBBcxYH", "ToL0P04EQWC050ZStPfUW7", "dLQ1hyrIZ6bV252gpMlUXC0bj3", "6aHaE6Igu4j61t8wIMItohij1osEY7A", "YKpEvhrVN9bD9vQDF7gbtGGCU86bcHbh"};
    public final C2031nO A00;
    public final String A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03;
    public final AtomicInteger A04;
    public final AtomicReference<String> A05;
    public final AtomicReference<String> A06;
    public final AtomicReference<String> A07;
    public final AtomicReference<EnumC03801r> A08;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-87, -89, -69, -71, -85, -91, 119, -71, -70, -91, -87, -82, -89, -76, -76, -85, -78, -33, -35, -15, -17, -31, -37, -33, -21, -23, -20, -24, -31, -16, -31, -32, -34, -14, -16, -30, -36, -19, -34, -14, -16, -30, -43, -31, -32, -27, -26, -45, -32, -26, -47, -40, -34, -25, -27, -38, -47, -42, -37, -27, -45, -44, -34, -41, -42, 18, 30, 29, 34, 35, cw.n, 29, 35, cw.l, 21, 27, 36, 34, 23, cw.l, 20, 29, cw.n, 17, 27, 20, 19, -57, -38, -47, -63, -46, -50, -61, -37, -57, -44, 8, 23, cw.n, cw.n, 7, cw.l, 1, -6, 9, 2, 2, -7, 0, -13, 7, -7, 5, -64, -72, -73, -68, -76, -78, -61, -65, -76, -52, -72, -59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A03(JSONObject jSONObject) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(104, 10, 100), this.A04.getAndIncrement());
            } catch (JSONException unused) {
            }
            InterfaceC03751m.A0d.A04(this.A01).A02(jSONObject);
            String str = this.A07.get();
            if (!TextUtils.isEmpty(str)) {
                InterfaceC03751m.A0i.A04(str).A02(jSONObject);
            }
            String str2 = this.A06.get();
            if (!TextUtils.isEmpty(str2)) {
                InterfaceC03751m.A0h.A04(str2).A02(jSONObject);
            }
            String str3 = this.A05.get();
            if (!TextUtils.isEmpty(str3)) {
                InterfaceC03751m.A0g.A04(str3).A02(jSONObject);
            }
            EnumC03801r enumC03801r = this.A08.get();
            if (enumC03801r != null) {
                InterfaceC03751m.A0L.A04(enumC03801r).A02(jSONObject);
            }
            int i = this.A02.get();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "oDSQlSjNmcpmgzbcJtWHkjHlPwQZcL3R";
            if (i != -1) {
                InterfaceC03751m.A0M.A04(Integer.valueOf(i)).A02(jSONObject);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    static {
        A01();
    }

    public C2033nQ(C2031nO c2031nO) {
        this(c2031nO, UUID.randomUUID().toString());
    }

    public C2033nQ(C2031nO c2031nO, String str) {
        this.A07 = new AtomicReference<>();
        this.A06 = new AtomicReference<>();
        this.A05 = new AtomicReference<>();
        this.A08 = new AtomicReference<>();
        this.A02 = new AtomicInteger(-1);
        this.A03 = new AtomicInteger(0);
        this.A01 = str;
        this.A00 = c2031nO;
        this.A04 = new AtomicInteger(1);
    }

    private void A02(int i, String str) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(97, 7, 114) + InterfaceC03751m.A0e.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().ABH(i, jSONObject);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    public final void A04(EnumC03711i type, C03741l... params) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C03741l c03741l : params) {
                c03741l.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().AAw(type, jSONObject, this.A03.get());
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            A0A[1] = "BGuBBhhr2vfc8YeoHKcuMelBM5cinHSr";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A33(String str, int reason, String viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0X, InterfaceC03751m.A0R.A04(Integer.valueOf(reason)), InterfaceC03751m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A34(String objectHash, String viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0Y, InterfaceC03751m.A0X.A04(objectHash), InterfaceC03751m.A0Y.A04(viewType));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "CnHHOHbzAF39FbZ23oJPbX";
            strArr2[4] = "iCnDYwDfb9KHEDVJBca8IG";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A35(String objectHash, String viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0Z, InterfaceC03751m.A0X.A04(objectHash), InterfaceC03751m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A36(String objectHash, String viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0a, InterfaceC03751m.A0X.A04(objectHash), InterfaceC03751m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A37(String objectHash, String viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0b, InterfaceC03751m.A0X.A04(objectHash), InterfaceC03751m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A38(String objectHash, String viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0c, InterfaceC03751m.A0X.A04(objectHash), InterfaceC03751m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A39(String objectHash, String viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0d, InterfaceC03751m.A0X.A04(objectHash), InterfaceC03751m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3A() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0o, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3B() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A11, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3C(boolean listenerSet) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0f, InterfaceC03751m.A01.A04(Boolean.valueOf(listenerSet)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3D(long loadTimeMs, int errorCode, String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A13, InterfaceC03751m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC03751m.A0b.A04(errorMessage), InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "ou1vvyDZqZWINuQgR45WlnH1G6V1u1ma";
            strArr[7] = "sF8Nv0lZkba8MOr3Cm9N7xOdNRIBEokF";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3E() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A15, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3F() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A14, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ghPrSTa04AlA3hlhWhKdOq";
            strArr2[4] = "J88k6JeMdFLh46seUcEYlS";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3G() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A16, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3H(long loadTimeMs) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A17, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3I(EnumC03661d reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3R, InterfaceC03751m.A00.A04(reason));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3J(String placementType, String placementId) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A06.set(placementType);
            this.A05.set(placementId);
            A04(EnumC03711i.A0g, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3K() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0h, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3L() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0i, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3M(long loadTimeMs, int errorCode, String errorMessage, boolean isPublic) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0j, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC03751m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC03751m.A0b.A04(errorMessage), InterfaceC03751m.A0B.A04(Boolean.valueOf(isPublic)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3N(long loadTimeMs, long executionWaitTimeMs) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0k, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC03751m.A0V.A04(Long.valueOf(executionWaitTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3O(boolean result) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1E, InterfaceC03751m.A0J.A04(Boolean.valueOf(result)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3P() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1F, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3Q(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1K, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3R() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1L, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3S() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1M, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3T() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1N, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3U(int funnelVideoPauseReason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1O, InterfaceC03751m.A0R.A04(Integer.valueOf(funnelVideoPauseReason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3V() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1P, new C03741l[0]);
        } catch (Throwable th) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "xPEMCdF1PT81VKplThmZJ0MgThXZkz9L";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3W() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1S, new C03741l[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "rEmXoUEysLHPq8FZE3dOJNk5SzTI5ER4";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3X() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1Q, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3Y(int reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1R, InterfaceC03751m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3Z() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1T, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3a(String uri) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1U, InterfaceC03751m.A0e.A04(uri));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3b() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1V, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3c() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1W, new C03741l[0]);
        } catch (Throwable th) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "VHKTrZg04X3VOgoin19cBQHxK1SmZkil";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3d() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1X, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3e() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1Y, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3f(int funnelVideoStartReason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1Z, InterfaceC03751m.A0R.A04(Integer.valueOf(funnelVideoStartReason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "xMSVvfXgoFGAs8nDBunIn95v3O7z4ovy";
            strArr2[7] = "AGV4v0JDz2tNg1AGql8xEI5p6QAZ0vcQ";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3g() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1a, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "8ZQmvOl7hzZw4gnCVFSM7Fjew1MxvIcb";
            strArr[7] = "zdDiv1uwuIXQArBlVybz6cyG0OKYRhqv";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3h(int reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1b, InterfaceC03751m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3i() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3T, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3j() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3U, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3k(EnumC03661d reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3Q, InterfaceC03751m.A00.A04(reason));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3l(int reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3S, InterfaceC03751m.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A3m() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3V, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4d(long loadTimeMs) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0m, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4e(long loadTimeMs, int chainedAdIndex) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0m, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC03751m.A0M.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4f(long loadTimeMs) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0n, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4g(long loadTimeMs, int chainedAdIndex) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0n, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC03751m.A0M.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4j(int reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0R, InterfaceC03751m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4k() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0S, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4l(String chainedParamsJson) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0T, InterfaceC03751m.A0a.A04(chainedParamsJson));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4m() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0U, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4n() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0V, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4o(int skipReason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0W, InterfaceC03751m.A0R.A04(Integer.valueOf(skipReason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A4s() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0p, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5T() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0q, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5U() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0u, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5V(boolean isInvalidated) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0l, InterfaceC03751m.A09.A04(Boolean.valueOf(isInvalidated)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5W(int errorCode, String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0v, InterfaceC03751m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5X(boolean hasBid) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0t, InterfaceC03751m.A03.A04(Boolean.valueOf(hasBid)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5Y() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0x, new C03741l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "rOShNeNq5fhncN4PBQe40u";
            strArr2[4] = "fkRpVb9hGxGD6wAnOJN4MT";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5Z() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0y, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5a() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A0z, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5b() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A10, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5u() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1f, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5v(String message) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1g, InterfaceC03751m.A0e.A04(message));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5w() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1h, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5x() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1i, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5y() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1j, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A5z(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1k, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A60(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1l, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A61(String message) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1m, InterfaceC03751m.A0e.A04(message));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[1] = "759deBEUdc0uh8isIDlD9YAtQ7qctZF0";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A62(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1o, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "1zlmhlFzFVwgF9q0xmtSdu50kD";
            strArr2[6] = "2haF4NBMerbrCWfGasmmW9SqeFz7x8G";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A63() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1p, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A64(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1q, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A65(long loadTimeMs) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1r, InterfaceC03751m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A66(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1s, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9l() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1u, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9m() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1v, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9n(boolean isDisabledByGK) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1w, InterfaceC03751m.A07.A04(Boolean.valueOf(isDisabledByGK)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9o() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1x, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9p(String error) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1y, InterfaceC03751m.A0b.A04(error));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9q() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1z, new C03741l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "15jrFKu6wVZYTCIc5tz6T2aAbAvuKlIC";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9r() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A20, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void A9s(String exception) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A21, InterfaceC03751m.A0c.A04(exception));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.nQ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final boolean AAI() throws Throwable {
        if (BQ.A02(this)) {
            return false;
        }
        Object obj = this;
        try {
            obj = obj.A03.get();
            return obj == 1;
        } catch (Throwable th) {
            BQ.A00(th, obj);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AAs(int code, String message) throws Throwable {
        if (BQ.A02(this) || code < 11000 || code > 11099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AAy(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1t, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AB4(String provider) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2G, InterfaceC03751m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AB5(String provider) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2H, InterfaceC03751m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AB6(String provider) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2I, InterfaceC03751m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AB7(String provider) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2J, InterfaceC03751m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AB8(String provider) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2K, InterfaceC03751m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AB9(String provider) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2L, InterfaceC03751m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABA() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2M, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABB(String provider) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2N, InterfaceC03751m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABP(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3J, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABQ(int isLeftTopHalf) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3I, InterfaceC03751m.A0O.A04(Integer.valueOf(isLeftTopHalf)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABR(boolean isSplitScreenSupportedInApp, boolean isSplitScreenFlagAdded, boolean supportsMultiWindow, boolean supportsSplitScreenMultiWindow, boolean appResizingSupported) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3K, InterfaceC03751m.A0D.A04(Boolean.valueOf(isSplitScreenSupportedInApp)), InterfaceC03751m.A0C.A04(Boolean.valueOf(isSplitScreenFlagAdded)), InterfaceC03751m.A0I.A04(Boolean.valueOf(supportsMultiWindow)), InterfaceC03751m.A0K.A04(Boolean.valueOf(supportsSplitScreenMultiWindow)), InterfaceC03751m.A0G.A04(Boolean.valueOf(appResizingSupported)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABW() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3W, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABX(boolean isLocked, int reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3X, InterfaceC03751m.A0A.A04(Boolean.valueOf(isLocked)), InterfaceC03751m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABY() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3Y, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABZ(boolean isLocked, boolean isV2, boolean isChained) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3Z, InterfaceC03751m.A0A.A04(Boolean.valueOf(isLocked)), InterfaceC03751m.A0E.A04(Boolean.valueOf(isV2)), InterfaceC03751m.A08.A04(Boolean.valueOf(isChained)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABa() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3a, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABb() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3b, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABc() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3d, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABd() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3c, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABe(String falseReasonMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3e, InterfaceC03751m.A0k.A04(falseReasonMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABf() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3f, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABg() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3g, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABr(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A18, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABs(int reason) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A19, InterfaceC03751m.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABt() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2O, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABu() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2P, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABv() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2Q, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ABy() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1A, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADd() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A25, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADe() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A26, new C03741l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "SUWuhZot3lbnUwmuNgQZL8cGUh";
            strArr2[6] = "e1ut4vb54s16AZCVtGxdkLVCEm0tRiH";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADf() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A28, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADg() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A29, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADh() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2A, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADi() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A27, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADj() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2B, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADk() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2C, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADl() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2D, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADm() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2E, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void ADn() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2F, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AES() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2W, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "LuwYm9Ec4o1R43GcaJtosWaGmO";
            strArr2[6] = "Iv5NEtyRtdj3C1azmehhXo6SWfekvld";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AFJ(int actionMode) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1G, InterfaceC03751m.A0P.A04(Integer.valueOf(actionMode)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGh(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1C, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGi() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1D, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGu() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2Z, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGv(int resultCode) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2a, InterfaceC03751m.A0N.A04(Integer.valueOf(resultCode)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGw() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2b, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGx() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2c, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGy(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2d, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AGz() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2f, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH0() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2g, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH1() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2h, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH2() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2i, new C03741l[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "wOU9EU8iwoFyJfRJJkX4aLHDWxmftefK";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH3(RemoteException e) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2r, InterfaceC03751m.A0b.A04(e.toString()));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH4() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2j, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH5() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2k, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH6() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2l, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH7() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2m, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH8() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2n, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "qlMIvHuIl0PpF5kBV9VQgOwtH5MinuqE";
            strArr2[7] = "xBNYvFKh7XBRvzLChNYnaiJhWQppxCKD";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AH9(int type) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2o, InterfaceC03751m.A0T.A04(Integer.valueOf(type)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHA() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2p, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHB() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2e, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHC() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2s, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHD() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2t, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHE() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2u, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHF() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2v, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHG() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2w, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHH() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2x, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHI() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2z, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHJ() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A30, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHK() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A31, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHL(int type) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A2y, InterfaceC03751m.A0T.A04(Integer.valueOf(type)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHM() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A32, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHN() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A33, new C03741l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "ytbGG59mSCQ98v8bmpcCcEmqTnAgI1JB";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHO() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A34, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHP() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A35, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHQ() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A36, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHR(int what) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A37, InterfaceC03751m.A0T.A04(Integer.valueOf(what)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHS() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A38, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHT(int messageTag) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A39, InterfaceC03751m.A0T.A04(Integer.valueOf(messageTag)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHU(String string) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3A, InterfaceC03751m.A0b.A04(string));
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "WmDwj21HmLDh2v3oBoiN7t";
            strArr[4] = "aBEcyy5IfSDVAZbtKUqUDd";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AHV() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3B, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AI3() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3H, InterfaceC03751m.A0e.A04(A00(65, 22, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)));
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ISt8aVbYkZ1528n3X0AMwO";
            strArr2[4] = "7zAIV0laY8ZUIjQSc0h82I";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AI4() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3H, InterfaceC03751m.A0e.A04(A00(42, 23, 66)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AI5() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3L, InterfaceC03751m.A0e.A04(A00(87, 10, 50)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AI6() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3C, InterfaceC03751m.A0e.A04(A00(17, 14, 76)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AI7() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3C, InterfaceC03751m.A0e.A04(A00(0, 17, 22)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AI8() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3C, InterfaceC03751m.A0e.A04(A00(31, 11, 77)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AI9() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3L, InterfaceC03751m.A0e.A04(A00(114, 12, 35)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AIR(int index) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A02.set(index);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AIY(boolean value) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (value) {
                this.A03.set(1);
            } else {
                this.A03.set(2);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AIZ(int seq) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A04.set(seq);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AIq(String str) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A07.set(str);
        } catch (Throwable th) {
            BQ.A00(th, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "yN2ek2pa9UH1g7DDMCyQyyX5rJ";
            strArr[6] = "oQTvUigTVOEtCxa6Wt9cejPgJdPQvss";
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AIz(EnumC03801r viewType) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A08.set(viewType);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJl() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1I, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJm() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3M, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJn(String aspectRatio) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3N, InterfaceC03751m.A0Z.A04(aspectRatio));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJo(int orientation) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3O, InterfaceC03751m.A0Q.A04(Integer.valueOf(orientation)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJp(String viewableRatio) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3P, InterfaceC03751m.A0j.A04(viewableRatio));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "FEFzvX05qBdVAmKk8G0MI95qKtchV7LJ";
            strArr2[7] = "hT88vpHnpVYqM7dW4oE2C6WdduktsvVi";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJq() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1c, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJv() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3h, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJw(int code, String message) throws Throwable {
        if (BQ.A02(this) || code < 12000 || code > 12099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJx() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3i, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJy() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3j, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AJz() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3k, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK0(boolean callIgnored) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3l, InterfaceC03751m.A02.A04(Boolean.valueOf(callIgnored)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK1() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3m, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK2() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3n, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK3(int errorCode, String message) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3o, InterfaceC03751m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC03751m.A0b.A04(message));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK4(boolean hasWebview) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3p, InterfaceC03751m.A06.A04(Boolean.valueOf(hasWebview)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK5() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3q, new C03741l[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "tcZOAQ7ZICgkoIgoP9nUVanYjA";
            strArr[6] = "vX76sPpkkUT44d9ZVg7hUVWC8IWIUnC";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK6(String error) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3r, InterfaceC03751m.A0b.A04(error));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK7(int i, String error) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3s, InterfaceC03751m.A0b.A04(error));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK8() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3t, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AK9(int visibility) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A3u, InterfaceC03751m.A0U.A04(Integer.valueOf(visibility)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AKE(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1d, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void AKF(String errorMessage) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1e, InterfaceC03751m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final String getId() throws Throwable {
        if (BQ.A02(this)) {
            return null;
        }
        try {
            return this.A01;
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03681f
    public final void unregisterView() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC03711i.A1H, new C03741l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
