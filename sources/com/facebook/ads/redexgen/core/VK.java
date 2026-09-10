package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class VK {
    public static byte[] A00;
    public static String[] A01 = {"U6KVOTsvyFGORVsRScrnzIfC22jYBwjX", "ILJfzAM", "mSXQ0Ybvz22qP9FTERotykvccOsLfkLX", "hexg7lZyOyIoqc3cfx0LJrY0JzPheGn9", "QO0W7SjBIJExYoWj8d5V4ATeE22xBdxq", "XgtJCrs", "K8cPCeEyVHoG5OOYDkeX6MTEK7uusLdi", "HRkIYlhxQwIghQfQLwcjnPshoo50TCUq"};
    public static final Map<String, String> A02;
    public static final Map<String, List<String>> A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].charAt(20) != 'n') {
                throw new RuntimeException();
            }
            A01[7] = "VCgIGVaZR6LUurcUp8PRnu67FREgo2FS";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i6 = (bArrCopyOfRange[i5] - i4) - 84;
            String[] strArr = A01;
            if (strArr[6].charAt(18) != strArr[4].charAt(18)) {
                String[] strArr2 = A01;
                strArr2[6] = "QUKDQrMYYXqh8JHMTaWZV6Ed8Qh6Q2ZU";
                strArr2[4] = "Ahd0Yp7BAsSR93JTUpDMLzcJNLS2OMnc";
                bArrCopyOfRange[i5] = (byte) i6;
                i5++;
            } else {
                bArrCopyOfRange[i5] = (byte) i6;
                i5++;
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{33, 50, -25, -28, -9, -28, 20, 35, 28, 28, 19, 26, 7, 10, -4, -1, -6, 15, 4, 8, 0, -6, 8, 14, 9, -4, 8, 12, -4, 10, 11, -10, 11, 0, 4, -4, -10, 4, 10, 21, 24, -1, 6, 21, 14, 14, 5, 12, -1, 12, 15, 7, 7, 9, 14, 7};
    }

    static {
        A03();
        A03 = new HashMap();
        A02 = new HashMap();
    }

    public static String A01(String str) {
        return A02.get(str);
    }

    public static List<String> A02(C2300gi c2300gi, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (JSONException e2) {
                c2300gi.A08().ABC(A00(39, 17, 76), AbstractC1712Td.A1C, new C1713Te(e2));
            }
        }
        return arrayList;
    }

    public static void A04(View view, VI vi, VH vh) {
        view.addOnAttachStateChangeListener(new VJ(vi, vh));
    }

    public static void A05(C2300gi c2300gi, String str, long j) {
        VA adEventManager = c2300gi.A0A();
        VI vi = new VI(str, adEventManager);
        HashMap map = new HashMap();
        map.put(A00(24, 15, 67), Y1.A07(j));
        map.put(A00(12, 12, 71), Y1.A05(j));
        vi.A04(VH.A0D, map);
    }

    public static void A06(C2300gi c2300gi, JSONObject jSONObject, long j, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A00(2, 4, 47));
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(6, 6, 90));
        if (TextUtils.isEmpty(str) && jSONArrayOptJSONArray != null) {
            A07(c2300gi, jSONObjectOptJSONObject, A02(c2300gi, jSONArrayOptJSONArray), j, null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, List<String>> map = A03;
        if (A01[7].charAt(20) != 'n') {
            throw new RuntimeException();
        }
        A01[2] = "eRhlxr4ZIl29VB3yVqBFuzgoGteA2pMR";
        if (!map.containsKey(str)) {
            return;
        }
        A07(c2300gi, jSONObjectOptJSONObject, A03.get(str), j, str);
    }

    public static void A07(C2300gi c2300gi, JSONObject jSONObject, List<String> list, long j, String str) {
        String strA00 = A00(0, 2, 106);
        if (jSONObject.has(strA00)) {
            String clientToken = jSONObject.optString(strA00);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c2300gi, clientToken, j);
        }
    }

    public static void A08(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A02.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        if (A01[7].charAt(20) != 'n') {
            throw new RuntimeException();
        }
        A01[2] = "Iv9PzV9ggO2VP5nzFrt9V6UHZMtP3qc2";
        if (zIsEmpty) {
            return;
        }
        A03.put(str, list);
    }

    public static boolean A0A(String str, VH vh) {
        return A0B(str, vh.A03());
    }

    public static boolean A0B(String str, String str2) {
        return A03.containsKey(str) && A03.get(str).contains(str2);
    }
}
