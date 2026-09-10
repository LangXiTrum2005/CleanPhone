package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1458dv {
    public static byte[] A00;
    public static String[] A01 = {"pDeK4If9f629aq3CRkrp0Fu253", "2IxDQ1FbSrPR4KpDqGN4Yxt", "MNxukNS8NVrt79lQPoFW9wUhyH3Skkxc", "nwY5aqKWcaspw22ML9sMpaz2RHxxnbqO", "cV3a0bTQOvASh0VxOrwUJrKjSY71LWyF", "GT1sriu0a7BI2kZpGB1ddeLeL31", "iQyUbPltXqK4gOA4Uaq8Yz2weVl178tx", "SIU17CCn"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[1].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "TGjViVv7JbPcjygwM3W3WX2xvZI1v8dQ";
            strArr[4] = "T46E6X8N4lQd61rk3Adh7SRXAnD1hkTG";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 22);
            i4++;
        }
    }

    public static void A04() {
        A00 = new byte[]{105, -47, -3, -3, -7, -34, -3, -14, -11, -120, -83, -94, -82, -83, -78, -88, -78, -77, -92, -83, -77, 95, -89, -92, -96, -93, -92, -79, -78, 95, -102, -83, -58, -67, -48, -56, -67, -69, -52, -67, -68, 120, -101, -57, -58, -52, -67, -58, -52, -123, -92, -67, -58, -65, -52, -64, 120, -77, -82, -57, -66, -47, -55, -66, -68, -51, -66, -67, 121, -100, -56, -57, -51, -66, -57, -51, -122, -85, -70, -57, -64, -66, 121, -76, 118, -64, -125, -66, -50, -27, -32, -47, -33, -116, -108, -85, -90, -108, -85, -90, -56, -48, -105, -103, -56, -48, -105, -107, -24, -56, -106, -107, -101, -108, -56, -48, -105, -107, -64, -41, -46, -61, -47, 126, -122, -70, -62, -119, -121, -117, -122, -70, -62, -119, -121, -115, -122, -99, -104, -70, -62, -119, -38, -70, -120, -121, -100, -77, -82, -97, -83, 119};
    }

    static {
        A04();
        A03 = Pattern.compile(A02(EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 28, 72));
        A02 = Pattern.compile(A02(88, 30, 86));
    }

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) AbstractC1517es.A01(matcher.group(1)));
        }
        return -1L;
    }

    public static long A01(String str, String str2) {
        long jMax = -1;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strA02 = A02(84, 1, 3);
        String strA03 = A02(1, 8, 115);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AbstractC1561fb.A05(strA03, A02(31, 27, 66) + str + strA02);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = A03.matcher(str2);
            if (matcher.matches()) {
                try {
                    long j = (Long.parseLong((String) AbstractC1517es.A01(matcher.group(2))) - Long.parseLong((String) AbstractC1517es.A01(matcher.group(1)))) + 1;
                    if (A01[5].length() == 30) {
                        throw new RuntimeException();
                    }
                    A01[5] = "TTNCMeE85cRdex";
                    if (jMax < 0) {
                        return j;
                    }
                    String[] strArr = A01;
                    if (strArr[6].charAt(27) != strArr[4].charAt(27)) {
                        A01[2] = "WZvuQVopZ9x5ghlrMEMxsNTbIUdY1SAX";
                        if (jMax == j) {
                            return jMax;
                        }
                    } else {
                        String[] strArr2 = A01;
                        strArr2[0] = "OwImKd1qhqds0GCaPhttWxIfP4";
                        strArr2[7] = "pvJOTdKe";
                        if (jMax == j) {
                            return jMax;
                        }
                    }
                    AbstractC1561fb.A07(strA03, A02(9, 22, 41) + str + A02(85, 3, 77) + str2 + strA02);
                    jMax = Math.max(jMax, j);
                    return jMax;
                } catch (NumberFormatException unused2) {
                    AbstractC1561fb.A05(strA03, A02(58, 26, 67) + str2 + strA02);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    public static String A03(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A02(Input.Keys.NUMPAD_2, 6, 36));
        sb.append(j);
        sb.append(A02(0, 1, 38));
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }
}
