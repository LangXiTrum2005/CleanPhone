package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1729Tu {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final Map<EnumC1733Ty, List<String>> A02 = new HashMap();
    public final JSONObject A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{81, 92, 85, 64, 113, 118, 104};
    }

    public C1729Tu(String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        List<String> list;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (EnumC1733Ty enumC1733Ty : EnumC1733Ty.values()) {
            this.A02.put(enumC1733Ty, new LinkedList());
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String trackerUrl = jSONObject2.getString(A00(0, 4, 35));
                String trackerTypeStr = jSONObject2.getString(A00(4, 3, 2));
                EnumC1733Ty enumC1733TyValueOf = EnumC1733Ty.valueOf(trackerUrl.toUpperCase(Locale.US));
                if (!TextUtils.isEmpty(trackerTypeStr) && (list = this.A02.get(enumC1733TyValueOf)) != null) {
                    list.add(trackerTypeStr);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String A02() {
        return this.A00;
    }

    public final List<String> A03(EnumC1733Ty enumC1733Ty) {
        return this.A02.get(enumC1733Ty);
    }

    public final JSONObject A04() {
        return this.A03;
    }
}
