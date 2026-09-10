package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Um0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3842a = 0;

    static {
        Qm0.D(new byte[]{40, -85, -120, 82, 99, -94, 37, 91, 27, -94, -117, 82}, new byte[]{122, -50, -2, 55, com.umeng.analytics.pro.cw.k, -41, 64, com.umeng.analytics.pro.cw.k});
        Qm0.D(new byte[]{com.umeng.analytics.pro.cw.k, 56, -100, -110, 125, -49, -128}, new byte[]{65, 89, -17, -26, 45, -82, -19, -4});
        Qm0.D(new byte[]{-102, -9, -58, -59, -67, -97, -73, 48, -85, -11, -61, -20}, new byte[]{-54, -106, -85, -119, -44, -20, -61, 115});
    }

    public static float a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {-43, -58, 40, 22, com.umeng.analytics.pro.cw.k, 17, 77, 27, -26, -49, 43, 22, 60};
        byte[] bArr2 = {-121, -93, 94, 115, 99, 100, 40, 77};
        int i = 0;
        int i2 = 0;
        while (i < 13) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        sb.append(new String(bArr, StandardCharsets.UTF_8));
        sb.append(str);
        HashMap mapR = r(AbstractC2995aW.P(context, sb.toString()));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapR.entrySet()) {
            if (System.currentTimeMillis() - ((Long) entry.getKey()).longValue() < 1800000) {
                arrayList.add((Float) entry.getValue());
            }
        }
        float fFloatValue = 0.0f;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        if (arrayList.size() > 5) {
            arrayList = new ArrayList(arrayList.subList(0, 5));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fFloatValue += ((Float) it.next()).floatValue();
        }
        return fFloatValue / arrayList.size();
    }

    public static int b(Context context, C3491g4 c3491g4, String str) {
        float fA = a(context, str);
        if (fA <= 0.0f) {
            return -1;
        }
        String strF = AbstractC3375el.I(str) ? f(str) : "";
        if (TextUtils.isEmpty(strF)) {
            return -1;
        }
        ArrayList arrayListG = g(context, c3491g4.w(1), strF, str);
        for (int i = 0; i < arrayListG.size(); i++) {
            JZ jz = (JZ) arrayListG.get(i);
            if (i(fA, jz)) {
                Qm0.D(new byte[]{-125, 88, 103, -81, -24, -44, 70, -3, -127, 89, 67, -125, -28, -23, 75, -15, -127, 69, 41, -62, -60, -63, 81, -10, -116, 88, 119, -62, -5, -63, 75, -14, -127, 29, 122, -116, -19, -59, 93, -81, -60}, new byte[]{-28, 61, 19, -30, -119, -96, 37, -107});
                Qm0.D(new byte[]{35, -26, 9, 110, 8, -5, 57, 38, 47}, new byte[]{com.umeng.analytics.pro.cw.m, -58, 123, com.umeng.analytics.pro.cw.m, 102, -100, 92, 28});
                Qm0.D(new byte[]{-63}, new byte[]{-75, -36, -65, -40, -94, -121, -88, -6});
                return i;
            }
        }
        return -1;
    }

    public static AdManagerAdRequest.Builder c(Context context, String str, String str2, String str3) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        boolean zP = p(str2);
        boolean zN = n(str3);
        boolean zO = o(str3);
        Qm0.D(new byte[]{67, 43, 73, 104, 89, -98, 96, -65, 81, 43, 78, 93, 127, -71, 108, -94, 64, 43, 79, 19, 29, -68, 100, -93, 111, 43, 68, 20}, new byte[]{36, 78, 61, 41, 61, -52, 5, -50});
        Qm0.D(new byte[]{-4, -107, -80, 83, 81, 80, -10, -119}, new byte[]{-48, -75, -39, 55, 26, 53, -113, -76});
        Qm0.D(new byte[]{-32, 73, 17, 30, -53, 110, -35, -112, -120, 8, com.umeng.analytics.pro.cw.k, 30, -123}, new byte[]{-52, 105, 121, 127, -72, 62, -68, -3});
        Qm0.D(new byte[]{96, -123, -108, 111, 20, -58, 100, 98, 45, -47, -99, 51}, new byte[]{76, -91, -4, com.umeng.analytics.pro.cw.l, 103, -113, 0, 38});
        Qm0.D(new byte[]{19, com.umeng.analytics.pro.cw.k, 44, 56, 54, 101, -39, -15, 75, 68, 52, 53, 32, 97, -56, -18, 2}, new byte[]{63, 45, 68, 89, 69, 40, -84, -99});
        if (zP && zN && zO) {
            Qm0.D(new byte[]{-98, -49, 121, 80, 25, -26, -57, -110, -116, -49, 126, 101, 63, -63, -53, -113, -99, -49, 127, 43, 93, -9, -61, -112, -100, -118, 60, 43, 93, -4, -61, -112, -39, -6, 76, 92, 93, -48, -61, -105, -104, -118, 38, 49, 53, -43, -47, -61, -80, -18, 45, 117, 28, -64, -61, -61, -46, -118, 64, 100, 17, -64, -53, -109, -107, -49, 45, 88, 57, -57, -126, -50, -39, -28, 98, 49, com.umeng.analytics.pro.cw.k, -43, -48, -126, -108, -49, 121, 116, com.umeng.analytics.pro.cw.m, -57, -126, -115, -100, -49, 105, 116, 25, -108, -113, -61, -73, -59, 45, 112, 25, -48, -31, -106, -118, -34, 98, 124, 41, -43, -48, -124, -100, -34, 100, 127, 26, -108, -46, -126, -117, -53, 96, 116, 9, -47, -48, -112}, new byte[]{-7, -86, com.umeng.analytics.pro.cw.k, 17, 125, -76, -94, -29});
            return builder;
        }
        if (zP && zN && !zO) {
            String strE = e(context, str, str2);
            if (TextUtils.isEmpty(strE)) {
                Qm0.D(new byte[]{120, 88, 29, -9, 29, -17, -35, -26, 106, 88, 26, -62, 59, -56, -47, -5, 123, 88, 27, -116, 89, -2, -39, -28, 122, 29, 91, -116, 89, -11, -39, -28, 63, 109, 40, -5, 89, -39, -39, -29, 126, 29, 66, -106, 49, -36, -53, -73, 86, 121, 73, -46, 24, -55, -39, -73, 52, 29, 58, -33, 23, -38, -44, -14, 63, 116, 45, -106, 84, -99, -24, -10, 109, 92, 4, -45, com.umeng.analytics.pro.cw.k, -40, -54, -28, 63, 83, 12, -45, 29, -40, -36, -73, 50, 29, 43, -61, com.umeng.analytics.pro.cw.k, -99, -42, -8, 63, 79, 12, -64, 28, -45, -51, -14, 63, 79, 12, -43, 22, -49, -36, -73, 126, 83, com.umeng.analytics.pro.cw.k, -106, 23, -46, -104, -1, 118, 78, 29, -39, 11, -44, -37, -10, 115, 29, 25, -41, 11, -36, -43, -14, 107, 88, 27, -59, 85, -99, -56, -27, 112, 95, 8, -44, 21, -60, -104, -7, 112, 29, 26, -61, 26, -43, -104, -10, 123, 78, 73, -59, 17, -46, -49, -7, 51, 29, 26, -39, 89, -34, -39, -7, 113, 82, 29, -106, 26, -36, -54, -27, 102, 29, 57, -9, 52, -99, -56, -10, 109, 92, 4, -45, com.umeng.analytics.pro.cw.k, -40, -54, -28}, new byte[]{31, 61, 105, -74, 121, -67, -72, -105});
            } else {
                builder.addCustomTargeting(Qm0.D(new byte[]{-42}, new byte[]{-96, 31, 52, 121, 70, -105, 110, -100}), strE);
                Qm0.D(new byte[]{71, -115, 82, -72, -71, 98, -95, com.umeng.analytics.pro.cw.m, 85, -115, 85, -115, -97, 69, -83, 18, 68, -115, 84, -61, -3, 115, -91, com.umeng.analytics.pro.cw.k, 69, -56, 20, -61, -3, 120, -91, com.umeng.analytics.pro.cw.k, 0, -72, 103, -76, -3, 84, -91, 10, 65, -56, com.umeng.analytics.pro.cw.k, -39, -107, 81, -73, 94, 105, -84, 6, -99, -68, 68, -91, 94, 11, -56, 117, -112, -77, 87, -88, 27, 0, -95, 98, -39, -16, com.umeng.analytics.pro.cw.n, -108, 31, 82, -119, 75, -100, -87, 85, -74, com.umeng.analytics.pro.cw.k, 0, -122, 67, -100, -71, 85, -96, 94, com.umeng.analytics.pro.cw.k, -56, 101, -104, -81, 66, -67, 23, 78, -113, 6, -119, -68, 66, -91, 19, 69, -100, 67, -117, -25, com.umeng.analytics.pro.cw.n}, new byte[]{32, -24, 38, -7, -35, 48, -60, 126});
            }
            return builder;
        }
        if (zP && !zN) {
            String strE2 = e(context, str, str2);
            if (TextUtils.isEmpty(strE2)) {
                Qm0.D(new byte[]{62, -57, 94, 113, -72, -27, 0, 90, 44, -57, 89, 68, -98, -62, 12, 71, 61, -57, 88, 10, -4, -12, 4, 88, 60, -126, 25, 10, -4, -1, 4, 88, 121, -14, 107, 125, -4, -45, 4, 95, 56, -126, 1, com.umeng.analytics.pro.cw.n, -110, -40, 69, 98, 29, -126, 78, 81, -88, -42, 69, 6, 121, -14, 75, 66, -67, -38, 0, 95, 60, -48, 89, com.umeng.analytics.pro.cw.n, -78, -46, 0, 79, 60, -58, 10, 29, -4, -11, com.umeng.analytics.pro.cw.n, 95, 121, -52, 69, com.umeng.analytics.pro.cw.n, -82, -46, 19, 78, 55, -41, 79, com.umeng.analytics.pro.cw.n, -82, -46, 6, 68, 43, -58, 10, 81, -78, -45, 69, 69, 54, -126, 66, 89, -81, -61, 10, 89, 48, -63, 75, 92, -4, -57, 4, 89, 56, -49, 79, 68, -71, -59, 22, 7, 121, -46, 88, 95, -66, -42, 7, 71, 32, -126, 68, 95, -4, -60, com.umeng.analytics.pro.cw.n, 72, 49, -126, 75, 84, -81, -105, 22, 67, 54, -43, 68, 28, -4, -60, 10, 11, 58, -61, 68, 94, -77, -61, 69, 72, 56, -48, 88, 73, -4, -25, 36, 102, 121, -46, 75, 66, -67, -38, 0, 95, 60, -48, 89}, new byte[]{89, -94, 42, 48, -36, -73, 101, 43});
            } else {
                builder.addCustomTargeting(Qm0.D(new byte[]{21}, new byte[]{99, com.umeng.analytics.pro.cw.n, 112, 87, -26, 125, -7, -41}), strE2);
                Qm0.D(new byte[]{-3, -54, -81, 19, 39, -114, -68, 69, -17, -54, -88, 38, 1, -87, -80, 88, -2, -54, -87, 104, 99, -97, -72, 71, -1, -113, -24, 104, 99, -108, -72, 71, -70, -1, -102, 31, 99, -72, -72, 64, -5, -113, -16, 114, com.umeng.analytics.pro.cw.k, -77, -7, 125, -34, -113, -65, 51, 55, -67, -7, 25, -70, -1, -70, 32, 34, -79, -68, 64, -1, -35, -88, 114, 45, -71, -68, 80, -1, -53, -5, 127, 99, -97, -72, 70, -24, -42, -78, 60, 36, -4, -87, 85, -24, -50, -74, 55, 55, -71, -85, com.umeng.analytics.pro.cw.l, -70}, new byte[]{-102, -81, -37, 82, 67, -36, -39, 52});
            }
            return builder;
        }
        if (zP || !zN || zO) {
            Qm0.D(new byte[]{74, -6, -26, -30, 24, 122, 27, 113, 88, -6, -31, -41, 62, 93, 23, 108, 73, -6, -32, -103, 92, 107, 31, 115, 72, -65, -89, -103, 92, 102, 17, 32, 125, -34, -33, -125, 24, 73, 10, 97, com.umeng.analytics.pro.cw.k, -76, -78, -19, 19, 8, 55, 68, com.umeng.analytics.pro.cw.k, -5, -13, -41, 29, 8, 17, 114, com.umeng.analytics.pro.cw.k, -46, -25, -49, 8, 65, com.umeng.analytics.pro.cw.l, 108, 72, -65, -37, -25, com.umeng.analytics.pro.cw.m, 8, 83, 32, 99, -16, -78, -45, 29, 90, 31, 109, 72, -21, -9, -47, com.umeng.analytics.pro.cw.m, 8, com.umeng.analytics.pro.cw.n, 101, 72, -5, -9, -57, 92, 5, 94, 78, 66, -65, -13, -57, 24, 107, 11, 115, 89, -16, -1, -9, 29, 90, 25, 101, 89, -10, -4, -60, 92, 88, 31, 114, 76, -14, -9, -41, 25, 90, com.umeng.analytics.pro.cw.k}, new byte[]{45, -97, -110, -93, 124, 40, 126, 0});
            return builder;
        }
        Qm0.D(new byte[]{-10, 107, 6, 70, -124, -85, -112, 12, -28, 107, 1, 115, -94, -116, -100, 17, -11, 107, 0, 61, -64, -70, -108, com.umeng.analytics.pro.cw.l, -12, 46, 70, 61, -64, -73, -102, 93, -63, 79, 63, 39, -124, -104, -127, 28, -79, 37, 82, 79, -127, -118, -43, com.umeng.analytics.pro.cw.l, -8, 96, 21, 107, -123, -39, -68, 57, -79, 106, 19, 115, -127, -39, -40, 93, -33, 97, 82, 119, -127, -117, -108, com.umeng.analytics.pro.cw.n, -12, 122, 23, 117, -109, -39, -101, 24, -12, 106, 23, 99, -64, -44, -43, 51, -2, 46, 19, 99, -124, -70, -128, com.umeng.analytics.pro.cw.l, -27, 97, 31, 83, -127, -117, -110, 24, -27, 103, 28, 96, -64, -119, -108, com.umeng.analytics.pro.cw.m, -16, 99, 23, 115, -123, -117, -122}, new byte[]{-111, com.umeng.analytics.pro.cw.l, 114, 7, -32, -7, -11, 125});
        return builder;
    }

    public static String d(Context context, C3491g4 c3491g4, String str, String str2) {
        try {
            String strF = f(str2);
            if (TextUtils.isEmpty(strF)) {
                return "";
            }
            String[] strArrSplit = strF.trim().split(Qm0.D(new byte[]{46}, new byte[]{com.umeng.analytics.pro.cw.k, 57, 104, -63, 126, -25, 23, -27}));
            if (strArrSplit.length == 0) {
                return "";
            }
            int iB = b(context, c3491g4, str);
            Qm0.D(new byte[]{-53, -11, 18, 4, 30, 42, 10, 41, -55, -12, 47, 45, 57, 44, 6, 44, -31, -27, 10, 61, 22, 46, 5, 36, -27, -12, 21, 115, 95, 51, 8, 53, -49, -8, 3, 45, 54, 48, com.umeng.analytics.pro.cw.k, 36, -44, -83}, new byte[]{-84, -112, 102, 73, 127, 94, 105, 65});
            Qm0.D(new byte[]{41, -6, 33, 5, 116, 73, -99, 84, 107, -67, 60, 9, 58}, new byte[]{5, -38, 72, 97, 7, 103, -15, 49});
            if (iB >= 0 && iB < strArrSplit.length) {
                String strTrim = strArrSplit[iB].trim();
                return q(strTrim) ? strTrim : "";
            }
            if (strArrSplit.length <= 0) {
                return "";
            }
            String strTrim2 = strArrSplit[0].trim();
            return q(strTrim2) ? strTrim2 : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e(Context context, String str, String str2) {
        String strF;
        String str3 = Qm0.D(new byte[]{-49, 49, -54, 60, 74, 123, -78, -24}, new byte[]{-125, 80, -71, 72, 26, 26, -33, -73}) + str2;
        String strP = AbstractC2995aW.P(context, str3);
        float fA = a(context, str2);
        if (fA == 0.0f) {
            return strP;
        }
        if (AbstractC4969wu.g == 1) {
            if (AbstractC3375el.I(str2)) {
                strF = f(str2);
            }
            return "";
        }
        strF = AbstractC2995aW.P(context, Qm0.D(new byte[]{115, -81, -51, -122, 6, -104, 29, -51, 66, -83, -56, -81, 48}, new byte[]{35, -50, -96, -54, 111, -21, 105, -114}) + str2);
        if (strF != null && !TextUtils.isEmpty(strF.trim())) {
            for (JZ jz : g(context, str, strF, str2)) {
                try {
                    if (i(fA, jz)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append((String) jz.f3271a);
                        byte[] bArr = {-54};
                        bArr[0] = (byte) (new byte[]{-66, -24, 73, -6, 124, -5, 25, -121}[0] ^ bArr[0]);
                        sb.append(new String(bArr, StandardCharsets.UTF_8));
                        sb.append((String) jz.b);
                        String string = sb.toString();
                        AbstractC2995aW.r0(context, str3, string);
                        return string;
                    }
                } catch (Exception unused) {
                    k(context, str, str2);
                }
            }
        }
        return "";
    }

    public static String f(String str) {
        return C2375Du.a().c(str);
    }

    public static ArrayList g(Context context, String str, String str2, String str3) {
        byte b = 18;
        char c = 0;
        if (TextUtils.isEmpty(str2) || str2.trim().toLowerCase(Locale.getDefault()).equals(Qm0.D(new byte[]{-64, -35, 127, 40}, new byte[]{-82, -88, 19, 68, -80, -1, -64, -41}))) {
            return new ArrayList();
        }
        String[] strArrSplit = str2.split(Qm0.D(new byte[]{-33}, new byte[]{-16, -65, -118, 125, -12, 120, -5, -51}));
        ArrayList arrayList = new ArrayList();
        try {
            int length = strArrSplit.length;
            int i = 0;
            while (i < length) {
                String strTrim = strArrSplit[i].trim();
                if (TextUtils.isEmpty(strTrim)) {
                    byte[] bArr = {-26, -120, com.umeng.analytics.pro.cw.k, -48, 7, 23, 40, 68, -84, -55, com.umeng.analytics.pro.cw.m, -62, com.umeng.analytics.pro.cw.m, 103, 32, 90, -74, -116, 18, -45, 22, 62};
                    byte[] bArr2 = {-106, -23, 127, -93, 98, 71, 73, 41};
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < 22) {
                        if (i2 >= 8) {
                            i2 = 0;
                        }
                        bArr[i3] = (byte) (bArr[i3] ^ bArr2[i2]);
                        i3++;
                        i2++;
                    }
                    new String(bArr, StandardCharsets.UTF_8);
                } else {
                    byte[] bArr3 = new byte[1];
                    bArr3[c] = b;
                    String[] strArrSplit2 = strTrim.split(Qm0.D(bArr3, new byte[]{102, 121, 3, -27, 58, 17, com.umeng.analytics.pro.cw.l, -101}));
                    if (strArrSplit2.length == 2) {
                        String strTrim2 = strArrSplit2[c].trim();
                        String strTrim3 = strArrSplit2[1].trim();
                        if (TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3)) {
                            Qm0.D(new byte[]{17, -115, -117, 27, 37, 24, 112, -108, 91, -52, -119, 9, 45, 104, 116, -117, 19, -125, -117, 72, 125, 104}, new byte[]{97, -20, -7, 104, 64, 72, 17, -7});
                            k(context, str, str3);
                        } else {
                            JZ jz = new JZ();
                            jz.f3271a = strTrim2;
                            jz.b = strTrim3;
                            arrayList.add(jz);
                        }
                    } else {
                        Qm0.D(new byte[]{84, -70, 7, -55, -18, 7, -45, 37, 30, -5, 5, -37, -26, 119, -41, 58, 86, -76, 7, -102, -74, 119}, new byte[]{36, -37, 117, -70, -117, 87, -78, 72});
                        k(context, str, str3);
                    }
                }
                i++;
                b = 18;
                c = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            k(context, str, str3);
        }
        return arrayList;
    }

    public static void h(AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        Qm0.D(new byte[]{-107, -21, 43, 41, -17, -99, 19, -52, -128, -31, 50, 58, -18, -71, 24, -2, -105, -82, 44, 28, -22, -90, 3}, new byte[]{-14, -114, 95, 104, -117, -44, 119, -118});
        m(abstractApplicationC2673Ph, AbstractC3661i1.l);
        m(abstractApplicationC2673Ph, AbstractC3661i1.m);
        m(abstractApplicationC2673Ph, AbstractC3661i1.n);
        m(abstractApplicationC2673Ph, AbstractC3661i1.o);
        m(abstractApplicationC2673Ph, AbstractC3661i1.p);
        m(abstractApplicationC2673Ph, AbstractC3661i1.q);
        m(abstractApplicationC2673Ph, AbstractC3661i1.r);
        m(abstractApplicationC2673Ph, AbstractC3661i1.s);
        m(abstractApplicationC2673Ph, AbstractC3661i1.t);
        m(abstractApplicationC2673Ph, AbstractC3661i1.u);
        m(abstractApplicationC2673Ph, AbstractC3661i1.v);
        Qm0.D(new byte[]{-76, 99, -103, -33, 95, 7, 35, 57, -95, 105, -128, -52, 94, 35, 40, 11, -74, 38, -51, -5, 85, 42}, new byte[]{-45, 6, -19, -98, 59, 78, 71, 127});
    }

    public static boolean i(float f, JZ jz) {
        if (!TextUtils.isEmpty((CharSequence) jz.f3271a)) {
            Object obj = jz.b;
            if (!TextUtils.isEmpty((CharSequence) obj)) {
                try {
                    float f2 = Float.parseFloat(((String) jz.f3271a).trim().replace(Qm0.D(new byte[]{113}, new byte[]{21, -27, -86, 94, 96, -95, -80, -114}), Qm0.D(new byte[]{100}, new byte[]{74, -89, -87, 87, -56, 9, -70, -74})));
                    if (((String) obj).toLowerCase(Locale.getDefault()).equals(Qm0.D(new byte[]{-74}, new byte[]{-50, -52, -82, 81, -64, -17, -36, -117}))) {
                        return f2 <= f;
                    }
                    return f2 <= f && f < Float.parseFloat(((String) obj).trim().replace(Qm0.D(new byte[]{-3}, new byte[]{-103, -31, 49, -66, -92, -86, -91, 85}), Qm0.D(new byte[]{-82}, new byte[]{-128, 68, -68, -14, -71, -10, 3, -74})));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public static String j(String str) {
        try {
            if (!AbstractC3375el.I(str)) {
                return "";
            }
            String strTrim = f(str).trim();
            if (q(strTrim)) {
                return strTrim;
            }
        } catch (Exception e) {
            byte[] bArr = {-38, 87, 49, -68, 106, 67, -99, -79, -40, 123, 33, -87, 113, 66, -105, -113, -40, 95, 42, -101, 102, com.umeng.analytics.pro.cw.k, -97, -81, -49, 93, 55, -43, 35};
            byte[] bArr2 = {-67, 50, 69, -17, 3, 45, -6, -35};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            e.getMessage();
        }
        return "";
    }

    public static void k(Context context, String str, String str2) {
        if (!X0.j.b.get() || context == null || str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        HashMap map = new HashMap();
        if (str.length() > 5) {
            str = str.substring(str.length() - 5);
        }
        map.put(Qm0.D(new byte[]{51, -121, 36, 38, 71, 67, 74}, new byte[]{82, -29, 123, 83, 41, 42, 62, 68}), str);
        map.put(Qm0.D(new byte[]{91, 97, -105, 94, 28, 23, -73, 64}, new byte[]{58, 5, -56, 59, 106, 114, -39, 52}), Qm0.D(new byte[]{25, 3, 102, 123, -51, -35, -39, com.umeng.analytics.pro.cw.m, 12, 61, 110, 86, -49, -45, -39, 35}, new byte[]{105, 98, 11, 36, -67, -68, -85, 124}) + str2);
        Qm0 qm0A = Qm0.A();
        String strD = Qm0.D(new byte[]{-38, -31, 113, -12, 92, 54, -118, 95, -46, -31}, new byte[]{-69, -123, 46, -107, 50, 82, -8, 48});
        qm0A.getClass();
        Qm0.B(context, strD, map);
    }

    public static void l(AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        Qm0.D(new byte[]{92, -51, 111, 53, 125, 88, -47, -123, 72, -36, 93, 23, 115, 88, -49, -119, 86, -57, 111, 0, 60, 70, -23, -115, 73, -36}, new byte[]{59, -88, 27, 101, 28, 53, -99, -20});
        String str = AbstractC3661i1.f4483a;
        if (AbstractC3375el.I(str)) {
            Qm0.D(new byte[]{68, -42, -127, 81, -60, -71, 49, 125, 80, -57, -77, 115, -54, -71, 47, 113, 78, -36, -127, 100, -123, -12, 21, 117, 80, -8, -112, 120, -123, -124, 60, 89, 124, -10, -69, 85, -32, -122, 34, 93, 109, -25, -80, 83, -10, -117, 60, 80}, new byte[]{35, -77, -11, 1, -91, -44, 125, 20});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{-85, -52, -102, 50, 4, 124, -120, -28, -102, -50, -97, 27, 50}, new byte[]{-5, -83, -9, 126, 109, com.umeng.analytics.pro.cw.m, -4, -89}) + str, f(str));
        }
        String str2 = AbstractC3661i1.b;
        if (AbstractC3375el.I(str2)) {
            Qm0.D(new byte[]{80, -87, 57, -30, -117, 69, 5, -114, 68, -72, 11, -64, -123, 69, 27, -126, 90, -93, 57, -41, -54, 8, 33, -122, 68, -121, 40, -53, -54, 120, 8, -86, 104, -119, 3, -26, -81, 122, 22, -88, 103, -119, 3, -19, -85, 108}, new byte[]{55, -52, 77, -78, -22, 40, 73, -25});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{-51, com.umeng.analytics.pro.cw.n, 33, -127, 58, -49, -125, com.umeng.analytics.pro.cw.m, -4, 18, 36, -88, 12}, new byte[]{-99, 113, 76, -51, 83, -68, -9, 76}) + str2, f(str2));
        }
        String str3 = AbstractC3661i1.c;
        if (AbstractC3375el.I(str3)) {
            Qm0.D(new byte[]{49, -41, 115, -23, 108, -111, -13, 79, 37, -58, 65, -53, 98, -111, -19, 67, 59, -35, 115, -36, 45, -36, -41, 71, 37, -7, 98, -64, 45, -84, -2, 107, 9, -5, 73, -19, 72, -82, -20, 121, 25, -26, 79, -4, 95}, new byte[]{86, -78, 7, -71, com.umeng.analytics.pro.cw.k, -4, -65, 38});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{41, 110, 62, -58, 82, 34, -15, -105, 24, 108, 59, -17, 100}, new byte[]{121, com.umeng.analytics.pro.cw.m, 83, -118, 59, 81, -123, -44}) + str3, f(str3));
        }
        String str4 = AbstractC3661i1.d;
        if (AbstractC3375el.I(str4)) {
            Qm0.D(new byte[]{com.umeng.analytics.pro.cw.m, -35, 101, 83, -110, -16, 33, 55, 27, -52, 87, 113, -100, -16, 63, 59, 5, -41, 101, 102, -45, -67, 5, 63, 27, -13, 116, 122, -45, -51, 44, 19, 55, -21, 70, 74, -89, -34, 37, 1, 39, -24, 84, 77, -84, -36, 41}, new byte[]{104, -72, 17, 3, -13, -99, 109, 94});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{92, -77, -98, -128, -121, 110, -107, 96, 109, -79, -101, -87, -79}, new byte[]{12, -46, -13, -52, -18, 29, -31, 35}) + str4, f(str4));
        }
        String str5 = AbstractC3661i1.e;
        if (AbstractC3375el.I(str5)) {
            Qm0.D(new byte[]{-14, -60, 2, 97, 43, 76, 4, 104, -26, -43, 48, 67, 37, 76, 26, 100, -8, -50, 2, 84, 106, 1, 32, 96, -26, -22, 19, 72, 106, 113, 9, 76, -54, -29, 55, 127, 4, 100, 26, 94, -44, -27, 55, 97, 30, 104, 30, 68}, new byte[]{-107, -95, 118, 49, 74, 33, 72, 1});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{-111, -110, -36, -5, -125, -22, 77, -67, -96, -112, -39, -46, -75}, new byte[]{-63, -13, -79, -73, -22, -103, 57, -2}) + str5, f(str5));
        }
        String str6 = AbstractC3661i1.f;
        if (AbstractC3375el.I(str6)) {
            Qm0.D(new byte[]{-60, -82, -19, 58, 5, 70, 40, 120, -48, -65, -33, 24, 11, 70, 54, 116, -50, -92, -19, com.umeng.analytics.pro.cw.m, 68, 11, 12, 112, -48, -128, -4, 19, 68, 123, 37, 92, -4, -119, -40, 36, 42, 110, 54, 78, -15, -114, -38, 62, 37, 101, 35, 93, -26}, new byte[]{-93, -53, -103, 106, 100, 43, 100, 17});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{-72, -24, 56, 116, 120, 24, 44, -84, -119, -22, 61, 93, 78}, new byte[]{-24, -119, 85, 56, 17, 107, 88, -17}) + str6, f(str6));
        }
        String str7 = AbstractC3661i1.g;
        if (AbstractC3375el.I(str7)) {
            Qm0.D(new byte[]{-112, 61, 18, 100, 103, -52, 56, -123, -124, 44, 32, 70, 105, -52, 38, -119, -102, 55, 18, 81, 38, -127, 28, -115, -124, 19, 3, 77, 38, -15, 53, -95, -88, 26, 39, 122, 72, -28, 38, -77, -76, 23, 42, 120, 71, -15, 39, -87, -77}, new byte[]{-9, 88, 102, 52, 6, -95, 116, -20});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{-109, 49, -128, -6, 32, 115, 4, -70, -94, 51, -123, -45, 22}, new byte[]{-61, 80, -19, -74, 73, 0, 112, -7}) + str7, f(str7));
        }
        String str8 = AbstractC3661i1.h;
        if (AbstractC3375el.I(str8)) {
            Qm0.D(new byte[]{29, 127, -109, 7, -116, 72, 65, -112, 9, 110, -95, 37, -126, 72, 95, -100, 23, 117, -109, 50, -51, 5, 101, -104, 9, 81, -126, 46, -51, 117, 76, -76, 37, 88, -90, 25, -93, 96, 95, -90, 51, 84, -85, 30, -93, 96}, new byte[]{122, 26, -25, 87, -19, 37, com.umeng.analytics.pro.cw.k, -7});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{-12, 32, 115, -115, 44, 98, -75, 57, -59, 34, 118, -92, 26}, new byte[]{-92, 65, 30, -63, 69, 17, -63, 122}) + str8, f(str8));
        }
        String str9 = AbstractC3661i1.i;
        if (AbstractC3375el.I(str9)) {
            Qm0.D(new byte[]{80, 127, 117, 43, 113, -117, -81, 3, 68, 110, 71, 9, 127, -117, -79, com.umeng.analytics.pro.cw.m, 90, 117, 117, 30, 48, -58, -117, 11, 68, 81, 100, 2, 48, -74, -94, 39, 104, 84, 64, 47, 89, -80, -90}, new byte[]{55, 26, 1, 123, com.umeng.analytics.pro.cw.n, -26, -29, 106});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{11, -96, -79, 105, -121, -27, -69, 34, 58, -94, -76, 64, -79}, new byte[]{91, -63, -36, 37, -18, -106, -49, 97}) + str9, f(str9));
        }
        String str10 = AbstractC3661i1.j;
        if (AbstractC3375el.I(str10)) {
            Qm0.D(new byte[]{63, -37, 110, -28, 35, 101, 72, 2, 43, -54, 92, -58, 45, 101, 86, com.umeng.analytics.pro.cw.l, 53, -47, 110, -47, 98, 40, 108, 10, 43, -11, 127, -51, 98, 88, 69, 38, 7, -20, 95, -29, 3, 90, 64, 52, com.umeng.analytics.pro.cw.l, -9, 94, -15, com.umeng.analytics.pro.cw.k}, new byte[]{88, -66, 26, -76, 66, 8, 4, 107});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{-34, -104, 41, 104, 59, -110, 32, 22, -17, -102, 44, 65, com.umeng.analytics.pro.cw.k}, new byte[]{-114, -7, 68, 36, 82, -31, 84, 85}) + str10, f(str10));
        }
        String str11 = AbstractC3661i1.k;
        if (AbstractC3375el.I(str11)) {
            Qm0.D(new byte[]{10, -128, -37, 116, 68, -10, -28, 98, 30, -111, -23, 86, 74, -10, -6, 110, 0, -118, -37, 65, 5, -69, -64, 106, 30, -82, -54, 93, 5, -53, -23, 70, 50, -73, -22, 115, 100, -55, -20, 84, 36, -85, -5, 97, 119, -56, -9, 93, 36, -95, -22, 107}, new byte[]{109, -27, -81, 36, 37, -101, -88, 11});
            AbstractC2995aW.r0(abstractApplicationC2673Ph, Qm0.D(new byte[]{112, 6, -55, -78, 38, -65, -127, 82, 65, 4, -52, -101, com.umeng.analytics.pro.cw.n}, new byte[]{32, 103, -92, -2, 79, -52, -11, 17}) + str11, f(str11));
        }
        Qm0.D(new byte[]{-23, 54, 12, 52, 118, 88, -42, -120, -3, 39, 62, 22, 120, 88, -56, -124, -29, 60, 12, 1, 55, 21, -1, -113, -22}, new byte[]{-114, 83, 120, 100, 23, 53, -102, -31});
    }

    public static void m(AbstractApplicationC2673Ph abstractApplicationC2673Ph, String str) {
        String strTrim = f(str).trim();
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {-57, -78, -117, 63, 91, -30, -46, -128, -127, -124};
        byte[] bArr2 = {-28, -37, -17, 28, 56, -125, -79, -24};
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        sb.append(new String(bArr, StandardCharsets.UTF_8));
        sb.append(str);
        AbstractC2995aW.r0(abstractApplicationC2673Ph, sb.toString(), strTrim);
    }

    public static boolean n(String str) {
        try {
            if (!AbstractC3375el.I(str)) {
                return false;
            }
            String strF = f(str);
            if (!TextUtils.isEmpty(strF)) {
                String lowerCase = strF.trim().toLowerCase(Locale.getDefault());
                byte[] bArr = {-73, -91, -49, 56};
                byte[] bArr2 = {-39, -48, -93, 84, -90, 41, 44, 118};
                int length = bArr.length;
                int length2 = bArr2.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (i2 >= length2) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                if (!lowerCase.equals(new String(bArr, StandardCharsets.UTF_8))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(String str) {
        try {
            if (!AbstractC3375el.I(str)) {
                return false;
            }
            String strF = f(str);
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            String strTrim = strF.trim();
            byte[] bArr = new byte[1];
            bArr[0] = -62;
            byte[] bArr2 = {-31, 100, 57, -20, -115, 84, 106, 34};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            String[] strArrSplit = strTrim.split(new String(bArr, StandardCharsets.UTF_8));
            if (strArrSplit.length <= 1) {
                return false;
            }
            int i3 = 0;
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2.trim()) && q(str2.trim())) {
                    i3++;
                }
            }
            return i3 > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean p(String str) {
        try {
            if (!AbstractC3375el.I(str)) {
                return false;
            }
            String strF = f(str);
            if (!TextUtils.isEmpty(strF)) {
                String lowerCase = strF.trim().toLowerCase(Locale.getDefault());
                byte[] bArr = {-44, 44, 119, 61};
                byte[] bArr2 = {-70, 89, 27, 81, 109, 27, -98, -100};
                int length = bArr.length;
                int length2 = bArr2.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (i2 >= length2) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                if (!lowerCase.equals(new String(bArr, StandardCharsets.UTF_8))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean q(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            byte[] bArr = {71, 112, -73, 20, 100, -54, 75, -111, 81, 115, -73, 41, 112, -111, 73, -67, 64, 58};
            byte[] bArr2 = {36, 17, -102, 117, 20, -70, 102, -31};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            Pattern patternCompile = Pattern.compile(new String(bArr, StandardCharsets.UTF_8));
            AbstractC2995aW.p(patternCompile, "compile(pattern)");
            if (patternCompile.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static HashMap r(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        for (String str2 : str.split(" ")) {
            if (!TextUtils.isEmpty(str2.trim())) {
                String[] strArrSplit = str2.split(Qm0.D(new byte[]{3}, new byte[]{44, 9, -124, 21, -29, -68, 71, -72}));
                if (strArrSplit.length != 2) {
                    Qm0.D(new byte[]{101, 62, -70, -32, -120, -90, -20, -9, 112, 41, -83, -3, -104, -126, -34, -60, 121, 42, -83, -87, -51, -82, -26, -45, 116, 51, -95, -9, -51, -127, -25, -41, 120, 62, -68, -77, -117, -120, -6, -123, 116, 59, -24, -31, -120, -111, -19, -53, 96, 58, -24, -27, -116, -117, -3, -64, 47, 127}, new byte[]{21, 95, -56, -109, -19, -25, -120, -91});
                } else if (TextUtils.isEmpty(strArrSplit[0].trim()) || TextUtils.isEmpty(strArrSplit[1].trim())) {
                    Qm0.D(new byte[]{-124, -113, 86, 58, -92, -18, -7, 76, -111, -104, 65, 39, -76, -54, -53, 127, -104, -101, 65, 115, -31, -26, -13, 104, -107, -126, 77, 45, -31, -55, -14, 108, -103, -113, 80, 105, -89, -64, -17, 62, -107, -118, 4, 59, -92, -39, -8, 112, -127, -117, 4, 63, -96, -61, -24, 123, -50, -50}, new byte[]{-12, -18, 36, 73, -63, -81, -99, 30});
                } else {
                    try {
                        map.put(Long.valueOf(Long.parseLong(strArrSplit[0])), Float.valueOf(Float.parseFloat(strArrSplit[1])));
                    } catch (Exception unused) {
                        byte[] bArr = {126, 3, 4, 0, -91, 35, -43, 78, 107, 20, 19, 29, -75, 7, -25, 125, 98, 23, 19, 73, -32, 39, -61, 110, 97, com.umeng.analytics.pro.cw.n, 86, 3, -95, com.umeng.analytics.pro.cw.n, -62, 117, 96, 5, 86, 18, -92, 66, -61, 121, 120, 7, 24, 6, -91, 66, -57, 125, 98, 23, 19, 73, -32};
                        byte[] bArr2 = {com.umeng.analytics.pro.cw.l, 98, 118, 115, -64, 98, -79, 28};
                        int i = 0;
                        int i2 = 0;
                        while (i < 53) {
                            if (i2 >= 8) {
                                i2 = 0;
                            }
                            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                            i++;
                            i2++;
                        }
                        new String(bArr, StandardCharsets.UTF_8);
                    }
                }
            }
        }
        return map;
    }
}
