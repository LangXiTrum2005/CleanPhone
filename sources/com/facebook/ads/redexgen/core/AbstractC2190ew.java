package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2190ew {
    public static byte[] A00;
    public static String[] A01 = {"m5Jty9nXe8L2gKLWEWc3vH5rHCR7lq15", "nXqLn2RrfIlx0c2v1RTl0CneHVNjUcek", "yIjJHM1120PmYi1BMLCe9caFimcQ2nFl", "mlpcJRY57Lt3u3e0DOF4Ze17XEKszIMh", "yNEzWcoMu1kvA6ly91E0yJELmkdnUTW9", "LQJ0sSZIBnjE3wRe9pGlPD4TX9Tbmis1", "3e9PCxJTK3pug342JyVCHaGplQMI3S8I", "kyVsWmEjdCkwx1v5lgIpAQohzDFxobhM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static WebResourceResponse A00(C2300gi c2300gi, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> map) throws IOException {
        String strA02 = A02(85, 5, 1);
        C5Y c5yA0H = C2231fb.A06(c2300gi.A02()).A0H(c2300gi);
        C1706Sx.A0H(c2300gi, uri.toString());
        try {
            C2191ex c2191ex = new C2191ex(c2300gi.A02(), uri, c5yA0H);
            int iAvailable = c2191ex.available();
            if (iAvailable <= 0) {
                A05(c2300gi, 1, new Pair[]{new Pair(A02(61, 9, 46), String.valueOf(iAvailable))});
                return null;
            }
            String strA03 = A03(webResourceRequest.getRequestHeaders());
            if (strA03 == null) {
                c2300gi.A0F().A6D();
                A06(map, iAvailable);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 122), map, c2191ex);
            }
            try {
                C2189ev c2189evA01 = A01(strA03);
                if (!c2189evA01.A03) {
                    A05(c2300gi, 0, new Pair[]{new Pair(A02(94, 5, 77), c2189evA01.A02 != null ? c2189evA01.A02 : A02(90, 4, 30))});
                    return null;
                }
                int i2 = c2189evA01.A01;
                int i3 = c2189evA01.A00 == -1 ? iAvailable - 1 : c2189evA01.A00;
                A06(map, iAvailable);
                map.put(A02(31, 13, 93), A02(75, 6, 3) + i2 + A02(1, 1, 92) + i3 + A02(2, 1, 88) + iAvailable);
                c2300gi.A0F().A6D();
                return new WebResourceResponse(str, null, 206, A02(46, 15, 10), map, c2191ex);
            } catch (NumberFormatException e2) {
                A05(c2300gi, 3, new Pair[]{new Pair(strA02, e2.toString())});
                return null;
            }
        } catch (IOException e3) {
            A05(c2300gi, 2, new Pair[]{new Pair(strA02, e3.toString())});
            return null;
        }
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-114, -93, -95, 100, -104, -70, -70, -68, -57, -53, -124, -87, -72, -59, -66, -68, -54, -70, -26, -27, -21, -36, -27, -21, -92, -61, -36, -27, -34, -21, -33, -70, -26, -27, -21, -36, -27, -21, -92, -55, -40, -27, -34, -36, -29, -33, 116, -123, -106, -104, -115, -123, -112, 68, 103, -109, -110, -104, -119, -110, -104, -87, -66, -87, -79, -76, -87, -86, -76, -83, -127, -104, -109, -124, -110, AbstractJsonLexerKt.TC_INVALID, -106, -111, -126, -112, 61, -74, -62, -73, -72, -128, -115, -115, -118, -115, -90, -83, -92, -92, -39, -56, -43, -50, -52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A05(C2300gi c2300gi, int i2, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 57), i2);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c2300gi.A0F().A6C(jSONObject.toString());
    }

    static {
        A04();
    }

    public static C2189ev A01(String str) {
        if (str == null) {
            C2189ev parseResult = new C2189ev();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] strArr = A01;
        if (strArr[0].charAt(24) != strArr[1].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Dtu90aCnfjxtl3iZcl85ZURNtT9G66qF";
        strArr2[6] = "JBE4H6DVGxkCv3KpLfIzSFjkaXJMKyPO";
        String[] strArrSplit = str.split(A02(3, 1, 13));
        if (strArrSplit.length >= 2) {
            if (A02(70, 5, 5).equals(strArrSplit[0].toLowerCase(Locale.US).trim())) {
                if (strArrSplit[1].trim().split(A02(0, 1, 72)).length != 1) {
                    C2189ev c2189ev = new C2189ev();
                    c2189ev.A03 = false;
                    c2189ev.A02 = str;
                    return c2189ev;
                }
                String[] ranges = strArrSplit[1].trim().split(A02(1, 1, 92));
                C2189ev c2189ev2 = new C2189ev();
                c2189ev2.A03 = true;
                c2189ev2.A02 = str;
                c2189ev2.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    c2189ev2.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    c2189ev2.A00 = -1;
                }
                return c2189ev2;
            }
        }
        C2189ev c2189ev3 = new C2189ev();
        c2189ev3.A03 = false;
        c2189ev3.A02 = str;
        return c2189ev3;
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            Locale locale = Locale.US;
            String[] strArr = A01;
            String header = strArr[0];
            if (header.charAt(24) != strArr[1].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "WwPgvkKaNJbx73tjItPTyID0XOg3nGIt";
            strArr2[6] = "4YitGEy8BigPs3HGnT2LP2sfmluRsQ6B";
            if (A02(94, 5, 77).equals(str.toLowerCase(locale))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> map, int i2) {
        map.put(A02(4, 13, 61), A02(70, 5, 5));
        map.put(A02(17, 14, 93), String.valueOf(i2));
    }
}
