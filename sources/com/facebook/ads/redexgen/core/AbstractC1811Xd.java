package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1811Xd {
    public static byte[] A00;
    public static String[] A01 = {"k0KWJrtOeyRtx2YSOmZ2S9sZBWRzRtzR", "FhSJWxdRwKLMP9JOn6q1b2qMo", "vd4", "prNs3YfRmQWdH9Q7PHydrBddu2xVDtuC", "TQMlXyI0yqbHfDCacucNcvBBb28", "i9ckL4hGn3OwY3VfnpnVreAjs5dC9GVS", "Iva6FryQGZnTk8EX70gQNR0ykk5ruyon", ""};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{9, 18, 11, 11};
    }

    static {
        A05();
    }

    public static String A01(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                if (A01[7].length() != 0) {
                    throw new RuntimeException();
                }
                A01[6] = "jcZWkwS564qIWYGPRhtwMiRcu2uJOsmN";
                if (zHasNext) {
                    Map.Entry<String, String> next = it.next();
                    try {
                        jSONObject.put(next.getKey(), next.getValue());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return jSONObject.toString();
    }

    public static String A02(JSONObject jSONObject, String str) {
        return A03(jSONObject, str, null);
    }

    public static String A03(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(str, str2);
        String value = A00(0, 4, 26);
        if (value.equals(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public static List<String> A04(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String strOptString = jSONArray.optString(i2);
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList.add(strOptString);
            }
        }
        return arrayList;
    }
}
