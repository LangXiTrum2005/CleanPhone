package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03851w {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{44, 23, 24, 27, 21, 28, 89, cw.k, 22, 89, 9, 24, 11, 10, 28, 89, 19, 10, 22, 23, 89, 29, 24, cw.k, 24, 89, cw.n, 23, 89, 56, 29, 56, 26, cw.k, cw.n, 22, 23, 63, 24, 26, cw.k, 22, 11, 0, 87, 114, 119, 98, 119, 51, 50, 47, 53, 40, 57, 126, 97, 116, 127, 78, 125, 120, 127, 122, 49, 32, 51, 50, 40, 47, 38, 62, 47, 61, 61, 58, 38, 60, 33, 59, 41, 38, 42, 45, 54, 43, 60, 88, 95, 68, 89, 78, 116, 94, 89, 71, 116, 92, 78, 73, 116, 77, 74, 71, 71, 73, 74, 72, 64, 50, 52, 51, 35, 76, 83, 94, 95, 85, 101, 79, 72, 86};
    }

    static {
        A03();
        A01 = C03851w.class.getSimpleName();
    }

    public static AbstractC03841v A00(C1828k1 c1828k1, A7 a7, String str, Uri uri, Map<String, String> extraData, C03962h c03962h) {
        return A01(c1828k1, a7, str, uri, extraData, true, false, c03962h);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    public static AbstractC03841v A01(C1828k1 c1828k1, A7 a7, String action, Uri uri, Map<String, String> map, boolean z, boolean z2, C03962h c03962h) {
        AnonymousClass22 anonymousClass22A00;
        byte b;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String key = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(113, 9, 51));
        String queryParameter2 = uri.getQueryParameter(A02(45, 4, 31));
        if (queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
            try {
                JSONObject jSONObject = new JSONObject(queryParameter2);
                Iterator<String> dataIterator = jSONObject.keys();
                while (dataIterator.hasNext()) {
                    String next = dataIterator.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (JSONException e) {
                        e = e;
                        c1828k1.A08().AAu(A02(64, 7, 72), AbstractC05418a.A23, new C05428b(e));
                        Log.w(A01, A02(0, 45, 112), e);
                        anonymousClass22A00 = AnonymousClass22.A00(a7, ActivityUtils.A00());
                        switch (key.hashCode()) {
                            case -1458789996:
                                if (key.equals(A02(71, 11, 71))) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 109770977:
                                if (key.equals(A02(82, 5, 80))) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case 1546100943:
                                if (key.equals(A02(55, 9, 24))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                if (queryParameter != null) {
                                    return null;
                                }
                                if (z2) {
                                }
                                break;
                            case 1:
                                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                                    return new N7(c1828k1, a7, action, uri, map, anonymousClass22A00, z);
                                }
                                return z2 ? new N9(c1828k1, a7, action, uri, map) : new N8(c1828k1, a7, action, uri, map, anonymousClass22A00, z);
                            case 2:
                                return new C2022nF(c1828k1, a7, action, uri, map);
                            default:
                                return new C2021nE(c1828k1, a7, action, uri);
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        anonymousClass22A00 = AnonymousClass22.A00(a7, ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 71))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 109770977:
                if (key.equals(A02(82, 5, 80))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 24))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return (z2 || TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 34)))) ? new NA(c1828k1, a7, action, uri, map, anonymousClass22A00, z, c03962h) : new N9(c1828k1, a7, action, uri, map, true);
            case 1:
                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                    return new N7(c1828k1, a7, action, uri, map, anonymousClass22A00, z);
                }
                if (z2) {
                }
            case 2:
                return new C2022nF(c1828k1, a7, action, uri, map);
            default:
                return new C2021nE(c1828k1, a7, action, uri);
        }
    }

    public static boolean A04(String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
