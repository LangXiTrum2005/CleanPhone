package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2475jn implements InterfaceC1555Mw {
    public static byte[] A08;
    public final EnumC1554Mv A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2475jn A00(AnonymousClass76 anonymousClass76, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(A01(33, 6, 120));
        String strOptString2 = jSONObject.optString(A01(0, 18, 118));
        String strOptString3 = jSONObject.optString(A01(47, 10, 52));
        String strA02 = AbstractC1811Xd.A02(jSONObject, A01(18, 2, 83));
        EnumC1554Mv enumC1554MvA00 = AbstractC1556Mx.A00(jSONObject);
        Collection<String> collectionA03 = AbstractC1556Mx.A03(anonymousClass76, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(39, 8, 66));
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        return new C2475jn(strOptString, strOptString2, enumC1554MvA00, collectionA03, map, strOptString3, strA02, AbstractC1811Xd.A02(jSONObject, A01(20, 13, 89)));
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{78, 80, 97, 86, 99, 78, 97, 86, 92, 91, 76, 80, 92, 90, 90, 78, 91, 81, 45, 62, 53, 62, 51, 66, 73, 64, 68, 53, 52, 47, 51, 64, 61, 92, 80, 97, 90, 100, 95, 38, 30, 45, 26, 29, 26, 45, 26, 29, 16, 28, 32, 16, 30, 31, 10, 20, 15};
    }

    public C2475jn(String str, String str2, EnumC1554Mv enumC1554Mv, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = enumC1554Mv;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final String A7O() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final Collection<String> A7p() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final EnumC1554Mv A8K() {
        return this.A00;
    }
}
